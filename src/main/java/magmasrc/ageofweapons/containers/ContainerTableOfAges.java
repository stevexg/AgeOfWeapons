package magmasrc.ageofweapons.containers;

import magmasrc.ageofweapons.crafting.CraftingManagerTableOfAges;
import magmasrc.ageofweapons.crafting.SlotTableOfAges;
import magmasrc.ageofweapons.tileentitys.TileEntityTableOfAges;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;

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

        final int TILE_INVENTORY_XPOS = 112;
        final int TILE_INVENTORY_YPOS = 100;
        for (int x = 0; x < 7; x++) {
            addSlotToContainer(new Slot(tileEntityTableOfAges, x, TILE_INVENTORY_XPOS + SLOT_X_SPACING * x, TILE_INVENTORY_YPOS));
        }



        //MODULES
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 7, 44, 185));
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 8, 44, 153));
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 9, 20, 153));
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 10, 44, 120));
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 11, 20, 120));
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 12, 68, 120));
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 13, 44, 87));
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 14, 20, 87));
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 15, 44, 55));
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 16, 20, 55));
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 17, 68, 55));
        addSlotToContainer(new SlotTableOfAges(tileEntityTableOfAges, 18, 44, 23));


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
    }

    @Override
    public boolean canInteractWith(EntityPlayer player)
    {
        return tileEntityTableOfAges.isUsableByPlayer(player);
    }

    public void onCraftMatrixChanged(IInventory inventoryIn)
    {

        this.craftResult.setInventorySlotContents(0, CraftingManagerTableOfAges.getInstance().findMatchingRecipe(this.craftMatrix, Minecraft.getMinecraft().world, getModules()));
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int sourceSlotIndex)
    {
        final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
        final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
        final int VANILLA_FIRST_SLOT_INDEX = 0;
        final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;
        final int TE_INVENTORY_SLOT_COUNT = 30;

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
            if (getSlotFromInventory(tileEntityTableOfAges, i+7).getStack() != ItemStack.EMPTY) {
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
        super.onContainerClosed(playerIn);
        this.tileEntityTableOfAges.closeInventory(playerIn);
    }

}
