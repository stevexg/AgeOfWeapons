package magmasrc.ageofweapons.containers;

import magmasrc.ageofweapons.tileentitys.TileEntityTableOfAges;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;


public class ContainerTableOfAges extends Container {

    private TileEntityTableOfAges tileEntityTableOfAges;

    private final int HOTBAR_SLOT_COUNT = 9;
    private final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
    private final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;

    private final int VANILLA_FIRST_SLOT_INDEX = 0;
    private final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;
    private final int TE_INVENTORY_SLOT_COUNT = 30;



    public ContainerTableOfAges(InventoryPlayer invPlayer, TileEntityTableOfAges tileEntityTableOfAges) {

        this.tileEntityTableOfAges = tileEntityTableOfAges;
        final int SLOT_X_SPACING = 17;
        final int SLOT_Y_SPACING = 18;
        final int HOTBAR_XPOS = 95;
        final int HOTBAR_YPOS = 198;
        // Add the players hotbar to the gui - the [xpos, ypos] location of each item
        for (int x = 0; x < HOTBAR_SLOT_COUNT; x++) {
            int slotNumber = x;
            addSlotToContainer(new Slot(invPlayer, slotNumber, HOTBAR_XPOS + SLOT_X_SPACING * x, HOTBAR_YPOS));
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
            int slotNumber = x;
            addSlotToContainer(new Slot(tileEntityTableOfAges, slotNumber, TILE_INVENTORY_XPOS + SLOT_X_SPACING * x, TILE_INVENTORY_YPOS));
        }



        //MODULES
        addSlotToContainer(new Slot(tileEntityTableOfAges, 16, 44, 23)); //TODO


        //CRAFTING
        addSlotToContainer(new Slot(tileEntityTableOfAges, 7, 116, 22));
        addSlotToContainer(new Slot(tileEntityTableOfAges, 8, 133, 22));
        addSlotToContainer(new Slot(tileEntityTableOfAges, 9, 150, 22));
        addSlotToContainer(new Slot(tileEntityTableOfAges, 10, 116, 40));
        addSlotToContainer(new Slot(tileEntityTableOfAges, 11, 133, 40));
        addSlotToContainer(new Slot(tileEntityTableOfAges, 12, 150, 40));
        addSlotToContainer(new Slot(tileEntityTableOfAges, 13, 116, 58));
        addSlotToContainer(new Slot(tileEntityTableOfAges, 14, 133, 58));
        addSlotToContainer(new Slot(tileEntityTableOfAges, 15, 150, 58));
    }

    @Override
    public boolean canInteractWith(EntityPlayer player)
    {
        return tileEntityTableOfAges.isUsableByPlayer(player);
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int sourceSlotIndex)
    {
        Slot sourceSlot = inventorySlots.get(sourceSlotIndex);
        if (sourceSlot == null || !sourceSlot.getHasStack()) return ItemStack.EMPTY;  //EMPTY_ITEM
        ItemStack sourceStack = sourceSlot.getStack();
        ItemStack copyOfSourceStack = sourceStack.copy();

        // Check if the slot clicked is one of the vanilla container slots
        if (sourceSlotIndex >= VANILLA_FIRST_SLOT_INDEX && sourceSlotIndex < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
            // This is a vanilla container slot so merge the stack into the tile inventory
            if (!mergeItemStack(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT, false)){
                return ItemStack.EMPTY;  // EMPTY_ITEM
            }
        } else if (sourceSlotIndex >= TE_INVENTORY_FIRST_SLOT_INDEX && sourceSlotIndex < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT) {
            // This is a TE slot so merge the stack into the players inventory
            if (!mergeItemStack(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;   // EMPTY_ITEM
            }
        } else {
            System.err.print("Invalid slotIndex:" + sourceSlotIndex);
            return ItemStack.EMPTY;   // EMPTY_ITEM
        }

        // If stack size == 0 (the entire stack was moved) set slot contents to null
        if (sourceStack.getCount() == 0) {  // getStackSize
            sourceSlot.putStack(ItemStack.EMPTY);  // EMPTY_ITEM
        } else {
            sourceSlot.onSlotChanged();
        }

        sourceSlot.onTake(player, sourceStack);  //onPickupFromSlot()
        return copyOfSourceStack;
    }



    @Override
    public void onContainerClosed(EntityPlayer playerIn)
    {
        super.onContainerClosed(playerIn);
        this.tileEntityTableOfAges.closeInventory(playerIn);
    }

}
