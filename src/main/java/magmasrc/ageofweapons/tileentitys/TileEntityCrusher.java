package magmasrc.ageofweapons.tileentitys;

import magmasrc.ageofweapons.blocks.BlockCrusher;
import magmasrc.ageofweapons.containers.ContainerCrusher;
import magmasrc.ageofweapons.crushing.CrusherRecipes;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.SlotFurnaceFuel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityLockable;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.datafix.FixTypes;
import net.minecraft.util.datafix.walkers.ItemStackDataLists;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TileEntityCrusher extends TileEntityLockable implements ITickable, ISidedInventory
{
    private static final int[] SLOTS_TOP = new int[] {0};
    private static final int[] SLOTS_BOTTOM = new int[] {2, 1};
    private static final int[] SLOTS_SIDES = new int[] {1};
    private NonNullList<ItemStack> crusherItemStacks = NonNullList.<ItemStack>withSize(3, ItemStack.EMPTY);
    /** The number of ticks that the crusher will keep burning */
    private int crusherBurnTime;
    /** The number of ticks that a fresh copy of the currently-burning item would keep the crusher burning for */
    private int currentItemBurnTime;
    private int cookTime;
    private int totalCookTime;
    private String crusherCustomName;

    public int getSizeInventory()
    {
        return this.crusherItemStacks.size();
    }

    public boolean isEmpty()
    {
        for (ItemStack itemstack : this.crusherItemStacks)
        {
            if (!itemstack.isEmpty())
            {
                return false;
            }
        }

        return true;
    }

    public ItemStack getStackInSlot(int index)
    {
        return (ItemStack)this.crusherItemStacks.get(index);
    }

    public ItemStack decrStackSize(int index, int count)
    {
        return ItemStackHelper.getAndSplit(this.crusherItemStacks, index, count);
    }

    public ItemStack removeStackFromSlot(int index)
    {
        return ItemStackHelper.getAndRemove(this.crusherItemStacks, index);
    }

    public void setInventorySlotContents(int index, ItemStack stack)
    {
        ItemStack itemstack = (ItemStack)this.crusherItemStacks.get(index);
        boolean flag = !stack.isEmpty() && stack.isItemEqual(itemstack) && ItemStack.areItemStackTagsEqual(stack, itemstack);
        this.crusherItemStacks.set(index, stack);

        if (stack.getCount() > this.getInventoryStackLimit())
        {
            stack.setCount(this.getInventoryStackLimit());
        }

        if (index == 0 && !flag)
        {
            this.totalCookTime = this.getCookTime(stack);
            this.cookTime = 0;
            this.markDirty();
        }
    }

    public String getName()
    {
        return this.hasCustomName() ? this.crusherCustomName : "container.crusher";
    }

    public boolean hasCustomName()
    {
        return this.crusherCustomName != null && !this.crusherCustomName.isEmpty();
    }

    public void setCustomInventoryName(String p_145951_1_)
    {
        this.crusherCustomName = p_145951_1_;
    }

    public static void registerFixescrusher(DataFixer fixer)
    {
        fixer.registerWalker(FixTypes.BLOCK_ENTITY, new ItemStackDataLists(TileEntityCrusher.class, new String[] {"Items"}));
    }

    public void readFromNBT(NBTTagCompound compound)
    {
        super.readFromNBT(compound);
        this.crusherItemStacks = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
        ItemStackHelper.loadAllItems(compound, this.crusherItemStacks);
        this.crusherBurnTime = compound.getInteger("BurnTime");
        this.cookTime = compound.getInteger("CookTime");
        this.totalCookTime = compound.getInteger("CookTimeTotal");
        this.currentItemBurnTime = getItemBurnTime(this.crusherItemStacks.get(1));

        if (compound.hasKey("CustomName", 8))
        {
            this.crusherCustomName = compound.getString("CustomName");
        }
    }

    public NBTTagCompound writeToNBT(NBTTagCompound compound)
    {
        super.writeToNBT(compound);
        compound.setInteger("BurnTime", (short)this.crusherBurnTime);
        compound.setInteger("CookTime", (short)this.cookTime);
        compound.setInteger("CookTimeTotal", (short)this.totalCookTime);
        ItemStackHelper.saveAllItems(compound, this.crusherItemStacks);

        if (this.hasCustomName())
        {
            compound.setString("CustomName", this.crusherCustomName);
        }

        return compound;
    }

    public int getInventoryStackLimit()
    {
        return 64;
    }

    public boolean isBurning()
    {
        return this.crusherBurnTime > 0;
    }

    @SideOnly(Side.CLIENT)
    public static boolean isBurning(IInventory inventory)
    {
        return inventory.getField(0) > 0;
    }

    public void update()
    {
        boolean flag = this.isBurning();
        boolean flag1 = false;

        if (this.isBurning())
        {
            --this.crusherBurnTime;
        }

        if (!this.world.isRemote)
        {
            ItemStack itemstack = this.crusherItemStacks.get(1);

            if (this.isBurning() || !itemstack.isEmpty() && !(this.crusherItemStacks.get(0)).isEmpty())
            {
                if (!this.isBurning() && this.canSmelt())
                {
                    this.crusherBurnTime = getItemBurnTime(itemstack);
                    this.currentItemBurnTime = this.crusherBurnTime;

                    if (this.isBurning())
                    {
                        flag1 = true;

                        if (!itemstack.isEmpty())
                        {
                            Item item = itemstack.getItem();
                            itemstack.shrink(1);

                            if (itemstack.isEmpty())
                            {
                                ItemStack item1 = item.getContainerItem(itemstack);
                                this.crusherItemStacks.set(1, item1);
                            }
                        }
                    }
                }

                if (this.isBurning() && this.canSmelt())
                {
                    ++this.cookTime;

                    if (this.cookTime == this.totalCookTime)
                    {
                        this.cookTime = 0;
                        this.totalCookTime = this.getCookTime(this.crusherItemStacks.get(0));
                        this.smeltItem();
                        flag1 = true;
                    }
                }
                else
                {
                    this.cookTime = 0;
                }
            }
            else if (!this.isBurning() && this.cookTime > 0)
            {
                this.cookTime = MathHelper.clamp(this.cookTime - 2, 0, this.totalCookTime);
            }

            if (flag != this.isBurning())
            {
                flag1 = true;
                BlockCrusher.setState(this.isBurning(), this.world, this.pos);
            }
        }

        if (flag1)
        {
            this.markDirty();
        }
    }

    public int getCookTime(ItemStack stack)
    {
        return 200;
    }

    private boolean canSmelt()
    {
        if ((this.crusherItemStacks.get(0)).isEmpty())
        {
            return false;
        }
        else
        {
            ItemStack itemstack = CrusherRecipes.instance().getCrushingResult(this.crusherItemStacks.get(0));

            if (itemstack.isEmpty())
            {
                return false;
            }
            else
            {
                ItemStack itemstack1 = this.crusherItemStacks.get(2);
                if (itemstack1.isEmpty()) return true;
                if (!itemstack1.isItemEqual(itemstack)) return false;
                int result = itemstack1.getCount() + itemstack.getCount();
                return result <= getInventoryStackLimit() && result <= itemstack1.getMaxStackSize(); // Forge fix: make crusher respect stack sizes in crusher recipes
            }
        }
    }

    public void smeltItem()
    {
        if (this.canSmelt())
        {
            ItemStack itemstack = this.crusherItemStacks.get(0);
            ItemStack itemstack1 = CrusherRecipes.instance().getCrushingResult(itemstack);
            ItemStack itemstack2 = this.crusherItemStacks.get(2);

            if (itemstack2.isEmpty())
            {
                this.crusherItemStacks.set(2, itemstack1.copy());
            }
            else if (itemstack2.getItem() == itemstack1.getItem())
            {
                itemstack2.grow(itemstack1.getCount());
            }

            if (itemstack.getItem() == Item.getItemFromBlock(Blocks.SPONGE) && itemstack.getMetadata() == 1 &&
                    !(this.crusherItemStacks.get(1)).isEmpty() && (this.crusherItemStacks.get(1)).getItem() == Items.BUCKET)
            {
                this.crusherItemStacks.set(1, new ItemStack(Items.WATER_BUCKET));
            }

            itemstack.shrink(1);
        }
    }

    public static int getItemBurnTime(ItemStack stack)
    {
        if (stack.isEmpty())
        {
            return 0;
        }
        else
        {
            Item item = stack.getItem();

            if (item instanceof net.minecraft.item.ItemBlock && Block.getBlockFromItem(item) != Blocks.AIR)
            {
                Block block = Block.getBlockFromItem(item);

                if (block == Blocks.WOODEN_SLAB)
                {
                    return 150;
                }

                if (block.getDefaultState().getMaterial() == Material.WOOD)
                {
                    return 300;
                }

                if (block == Blocks.COAL_BLOCK)
                {
                    return 16000;
                }
            }

            if (item instanceof ItemTool && "WOOD".equals(((ItemTool)item).getToolMaterialName())) return 200;
            if (item instanceof ItemSword && "WOOD".equals(((ItemSword)item).getToolMaterialName())) return 200;
            if (item instanceof ItemHoe && "WOOD".equals(((ItemHoe)item).getMaterialName())) return 200;
            if (item == Items.STICK) return 100;
            if (item == Items.COAL) return 1600;
            if (item == Items.LAVA_BUCKET) return 20000;
            if (item == Item.getItemFromBlock(Blocks.SAPLING)) return 100;
            if (item == Items.BLAZE_ROD) return 2400;
            return net.minecraftforge.fml.common.registry.GameRegistry.getFuelValue(stack);
        }
    }

    public static boolean isItemFuel(ItemStack stack)
    {
        return getItemBurnTime(stack) > 0;
    }

    public boolean isUsableByPlayer(EntityPlayer player)
    {
        return this.world.getTileEntity(this.pos) != this ? false : player.getDistanceSq((double)this.pos.getX() + 0.5D, (double)this.pos.getY() + 0.5D, (double)this.pos.getZ() + 0.5D) <= 64.0D;
    }

    public void openInventory(EntityPlayer player) {}

    public void closeInventory(EntityPlayer player) {}

    public boolean isItemValidForSlot(int index, ItemStack stack)
    {
        if (index == 2)
        {
            return false;
        }
        else if (index != 1)
        {
            return true;
        }
        else
        {
            ItemStack itemstack = this.crusherItemStacks.get(1);
            return isItemFuel(stack) || SlotFurnaceFuel.isBucket(stack) && itemstack.getItem() != Items.BUCKET;
        }
    }

    public int[] getSlotsForFace(EnumFacing side) {
        return side == EnumFacing.DOWN ? SLOTS_BOTTOM : (side == EnumFacing.UP ? SLOTS_TOP : SLOTS_SIDES);
    }

    public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction)
    {
        return this.isItemValidForSlot(index, itemStackIn);
    }

    public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction)
    {
        if (direction == EnumFacing.DOWN && index == 1)
        {
            Item item = stack.getItem();

            if (item != Items.WATER_BUCKET && item != Items.BUCKET)
            {
                return false;
            }
        }

        return true;
    }

    public String getGuiID()
    {
        return "ageofweapons:crusher";
    }

    public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
    {
        return new ContainerCrusher(playerInventory, this);
    }

    public int getField(int id)
    {
        switch (id)
        {
            case 0:
                return this.crusherBurnTime;
            case 1:
                return this.currentItemBurnTime;
            case 2:
                return this.cookTime;
            case 3:
                return this.totalCookTime;
            default:
                return 0;
        }
    }

    public void setField(int id, int value)
    {
        switch (id)
        {
            case 0:
                this.crusherBurnTime = value;
                break;
            case 1:
                this.currentItemBurnTime = value;
                break;
            case 2:
                this.cookTime = value;
                break;
            case 3:
                this.totalCookTime = value;
        }
    }

    public int getFieldCount()
    {
        return 4;
    }

    public void clear()
    {
        this.crusherItemStacks.clear();
    }

    net.minecraftforge.items.IItemHandler handlerTop = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, net.minecraft.util.EnumFacing.UP);
    net.minecraftforge.items.IItemHandler handlerBottom = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, net.minecraft.util.EnumFacing.DOWN);
    net.minecraftforge.items.IItemHandler handlerSide = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, net.minecraft.util.EnumFacing.WEST);

    @SuppressWarnings("unchecked")
    @Override
    public <T> T getCapability(net.minecraftforge.common.capabilities.Capability<T> capability, @javax.annotation.Nullable net.minecraft.util.EnumFacing facing)
    {
        if (facing != null && capability == net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
            if (facing == EnumFacing.DOWN)
                return (T) handlerBottom;
            else if (facing == EnumFacing.UP)
                return (T) handlerTop;
            else
                return (T) handlerSide;
        return super.getCapability(capability, facing);
    }
}