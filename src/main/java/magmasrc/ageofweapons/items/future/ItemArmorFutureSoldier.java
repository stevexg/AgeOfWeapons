package magmasrc.ageofweapons.items.future;

import magmasrc.ageofweapons.main.AgeOfWeapons;
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

public class ItemArmorFutureSoldier extends ItemArmor {

	public ItemArmorFutureSoldier(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
        if(AgeOfWeapons.activateOnlyOneTab){
        	this.setCreativeTab(ModTabs.generalTab);
        } else {
        	this.setCreativeTab(ModTabs.futureTab);
        }		}
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == ModItems.witheredIronIngot;
	} 
	
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (!world.isRemote && player.inventory.armorInventory.get(3) != ItemStack.EMPTY && player.inventory.armorInventory.get(3).getItem() == ModItems.futureSoldierHelmet
		        && player.inventory.armorInventory.get(2) != ItemStack.EMPTY && player.inventory.armorInventory.get(2).getItem() == ModItems.futureSoldierChestplate
		        && player.inventory.armorInventory.get(1) != ItemStack.EMPTY && player.inventory.armorInventory.get(1).getItem() == ModItems.futureSoldierLeggings
		        && player.inventory.armorInventory.get(0) != ItemStack.EMPTY && player.inventory.armorInventory.get(0).getItem() == ModItems.futureSoldierBoots) {
		        this.effectPlayer(player, MobEffects.STRENGTH, 1);
			}
		}
	

	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
	        player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 10, amplifier, true, true));
	}


}
