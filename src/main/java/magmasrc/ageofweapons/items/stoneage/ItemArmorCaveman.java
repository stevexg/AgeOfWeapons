package magmasrc.ageofweapons.items.stoneage;

import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorCaveman extends ItemArmor {

	public ItemArmorCaveman(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setCreativeTab(ModTabs.stoneAgeTab);
	}
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == Items.LEATHER;
	} 

}
