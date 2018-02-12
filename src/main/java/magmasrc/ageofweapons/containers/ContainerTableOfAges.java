package magmasrc.ageofweapons.containers;

import magmasrc.ageofweapons.crafting.CraftingManagerTableOfAges;
import magmasrc.ageofweapons.crafting.SlotTableOfAges;
import magmasrc.ageofweapons.tileentitys.TileEntityTableOfAges;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerTableOfAges extends Container {

    private TileEntityTableOfAges tileEntityTableOfAges;

    private InventoryCrafting craftMatrix = new InventoryCrafting(this, 3, 3);
    private IInventory craftResult = new InventoryCraftResult();

    private final int HOTBAR_SLOT_COUNT = 9;
    private final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private final int PLAYER_INVENTORY_COLUMN_COUNT = 9;



    public ContainerTableOfAges(InventoryPlayer invPlayer, TileEntityTableOfAges tileEntityTableOfAges) {

        this.tileEntityTableOfAges = tileEntityTableOfAges;

        final int SLOT_X_SPACING = 17;
        final int SLOT_Y_SPACING = 18;
        final int HOTBAR_XPOS = 95;
        final int HOTBAR_YPOS = 198;
        for (int x = 0; x < HOTBAR_SLOT_COUNT; x++) {
            addSlotToContainer(new Slot(invPlayer, x, HOTBAR_XPOS + SLOT_X_SPACING * x, HOTBAR_YPOS));
        }

        final int PLAYER_INVENTORY_XPOS = 95;
        final int PLAYER_INVENTORY_YPOS = 140;
        for (int y = 0; y < PLAYER_INVENTORY_ROW_COUNT; y++) {
            for (int x = 0; x < PLAYER_INVENTORY_COLUMN_COUNT; x++) {
                int slotNumber = HOTBAR_SLOT_COUNT + y * PLAYER_INVENTORY_COLUMN_COUNT + x;
                int xpos = PLAYER_INVENTORY_XPOS + x * SLOT_X_SPACING;
                int ypos = PLAYER_INVENTORY_YPOS + y * SLOT_Y_SPACING;
                addSlotToContainer(new Slot(invPlayer, slotNumber,  xpos, ypos));
            }
        }


        //MODULES
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 0, 44, 185));
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 1, 44, 153));
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 2, 20, 153));
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 3, 44, 120));
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 4, 20, 120));
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 5, 68, 120));
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 6, 44, 87));
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 7, 20, 87));
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 8, 44, 55));
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 9, 20, 55));
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 10, 68, 55));
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 11, 44, 23));

        final int TILE_INVENTORY_XPOS = 112;
        final int TILE_INVENTORY_YPOS = 100;
        for (int x = 0; x < 7; x++) {
            addSlotToContainer(new Slot(tileEntityTableOfAges, x+12, TILE_INVENTORY_XPOS + SLOT_X_SPACING * x, TILE_INVENTORY_YPOS));
        }


        //CRAFTING
        addSlotToContainer(new SlotCrafting(invPlayer.player, this.craftMatrix, this.craftResult, 0, 204, 40));
        addSlotToContainer(new Slot(this.craftMatrix, 0, 116, 22));
        addSlotToContainer(new Slot(this.craftMatrix, 1, 133, 22));
        addSlotToContainer(new Slot(this.craftMatrix, 2, 150, 22));
        addSlotToContainer(new Slot(this.craftMatrix, 3, 116, 40));
        addSlotToContainer(new Slot(this.craftMatrix, 4, 133, 40));
        addSlotToContainer(new Slot(this.craftMatrix, 5, 150, 40));
        addSlotToContainer(new Slot(this.craftMatrix, 6, 116, 58));
        addSlotToContainer(new Slot(this.craftMatrix, 7, 133, 58));
        addSlotToContainer(new Slot(this.craftMatrix, 8, 150, 58));

        this.onCraftMatrixChanged(this.craftMatrix);

        for (int i = 0; i < 9; i++) {
            if (!(tileEntityTableOfAges.getStackInSlot(i+19) == null)) {
                craftMatrix.setInventorySlotContents(i, tileEntityTableOfAges.getStackInSlot(i+19));
            }
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer player)
    {
        return tileEntityTableOfAges.isUsableByPlayer(player);
    }

    public void onCraftMatrixChanged(IInventory inventoryIn)
    {

        this.craftResult.setInventorySlotContents(0, CraftingManagerTableOfAges.getInstance().findMatchingRecipe(this.craftMatrix, tileEntityTableOfAges.getWorld(), getModules()));
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int sourceSlotIndex)
    {
        final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
        final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
        final int VANILLA_FIRST_SLOT_INDEX = 0;
        final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;
        final int TE_INVENTORY_SLOT_COUNT = 19;

        Slot sourceSlot = inventorySlots.get(sourceSlotIndex);
        if (sourceSlot == null || !sourceSlot.getHasStack()) return ItemStack.EMPTY;
        ItemStack sourceStack = sourceSlot.getStack();
        ItemStack copyOfSourceStack = sourceStack.copy();

        if (sourceSlotIndex >= VANILLA_FIRST_SLOT_INDEX && sourceSlotIndex < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
            if (!mergeItemStack(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT, false)){
                return ItemStack.EMPTY;
            }
        } else if (sourceSlotIndex >= TE_INVENTORY_FIRST_SLOT_INDEX && sourceSlotIndex < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT) {
            if (!mergeItemStack(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else if(sourceSlotIndex >= 55 && sourceSlotIndex <= 64) {
            if (!mergeItemStack(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            System.err.print("Invalid slotIndex:" + sourceSlotIndex);
            return ItemStack.EMPTY;
        }

        if (sourceStack.getCount() == 0) {
            sourceSlot.putStack(ItemStack.EMPTY);
        } else {
            sourceSlot.onSlotChanged();
        }

        sourceSlot.onTake(player, sourceStack);
        return copyOfSourceStack;
    }

    private int[] getModules() {
        int[] modules = new int[12];

        for (int i = 0; i < 12; i++) {
            if (getSlotFromInventory(tileEntityTableOfAges, i).getStack() != ItemStack.EMPTY) {
                modules[i] = i+1;
            } else {
                modules[i] = 0;
            }
        }

        return modules;
    }


    @Override
    public void onContainerClosed(EntityPlayer playerIn)
    {
        for (int i = 0; i<9; i++) {
            tileEntityTableOfAges.setInventorySlotContents(i+19, craftMatrix.getStackInSlot(i));
        }

    }

}
