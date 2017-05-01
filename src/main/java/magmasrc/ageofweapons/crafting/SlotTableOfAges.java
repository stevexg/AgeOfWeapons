package magmasrc.ageofweapons.crafting;

import magmasrc.ageofweapons.main.ModItems;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotTableOfAges extends Slot {

    public SlotTableOfAges(IInventory inv, int index, int xPosition, int yPosition) {
        super(inv, index, xPosition, yPosition);
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        if (this.getSlotIndex() == 11 && stack.getItem() == ModItems.upgradeCreative) return true;

        if (this.getSlotIndex() == 0 && stack.getItem() == ModItems.upgradeStoneAge) return true;

        if (this.getSlotIndex() == 1 && stack.getItem() == ModItems.upgradeAtiquity) return true;

        if (this.getSlotIndex() == 2 && stack.getItem() == ModItems.upgradeMystic) return true;
        //TODO
        return false;
    }

}
