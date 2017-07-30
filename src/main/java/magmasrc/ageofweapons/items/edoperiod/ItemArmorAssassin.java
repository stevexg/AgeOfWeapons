package magmasrc.ageofweapons.items.edoperiod;

import magmasrc.ageofweapons.main.ModItems;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArmorAssassin extends ItemArmor {

	public ItemArmorAssassin(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setCreativeTab(ModTabs.edoTab);
	}
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == ModItems.cloth;
	} 
	
	
	
	

	
	

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (!world.isRemote && player.inventory.armorInventory.get(3) != ItemStack.EMPTY && player.inventory.armorInventory.get(3).getItem() == ModItems.assassinHelmet
		        && player.inventory.armorInventory.get(2) != ItemStack.EMPTY && player.inventory.armorInventory.get(2).getItem() == ModItems.assassinChestplate
		        && player.inventory.armorInventory.get(1) != ItemStack.EMPTY && player.inventory.armorInventory.get(1).getItem() == ModItems.assassinLeggings
		        && player.inventory.armorInventory.get(0) != ItemStack.EMPTY && player.inventory.armorInventory.get(0).getItem() == ModItems.assassinBoots) {
		        this.effectPlayer(player, MobEffects.JUMP_BOOST, 1);
			}
		}
	

	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
	    //Always effect for 8 seconds, then refresh
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
	        player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 159, amplifier, true, true));
	}

}