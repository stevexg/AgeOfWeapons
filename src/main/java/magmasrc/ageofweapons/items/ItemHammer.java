package magmasrc.ageofweapons.items;

import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemHammer extends Item {

    public ItemHammer() {
        super();

        this.setCreativeTab(ModTabs.generalTab);
        this.setMaxStackSize(1);
		this.setMaxDamage(50);
    }

	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}
	
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		if(itemStack.getMaxDamage() == itemStack.getItemDamage()) {
			return (ItemStack) null;
		} else {
			ItemStack newItemStack = itemStack.copy();
			newItemStack.setItemDamage(itemStack.getItemDamage()+1);
			return newItemStack;
		}
	}
	
	
	
	
    
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == Item.getItemFromBlock(Blocks.COBBLESTONE);
	}  

}
