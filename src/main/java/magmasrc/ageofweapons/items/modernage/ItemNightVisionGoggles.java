package magmasrc.ageofweapons.items.modernage;

import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;

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

public class ItemNightVisionGoggles extends ItemArmor {

	public ItemNightVisionGoggles(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
        if(AgeOfWeapons.activateOnlyOneTab){
        	this.setCreativeTab(ModTabs.generalTab);
        } else {
        	this.setCreativeTab(ModTabs.modernAgeTab);
        }		}
	
	
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == Items.IRON_INGOT;
	} 
	
	
	@Override
	public void addInformation(ItemStack  stack, EntityPlayer playerIn, List addList, boolean advanced) {
		if(AgeOfWeapons.activateShowAges) {	
			addList.add(ChatFormatting.GRAY + "Modern Age");
		}
	}
	
	
	
	
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
	    if (itemStack.getItem() == ModItems.nightVisionGoggles) {
	        effectPlayer(player, MobEffects.NIGHT_VISION, 0);
	    }
	} 
	
	

	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
	    //Always effect for 8 seconds, then refresh
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 200)
	        player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 210, amplifier, true, true));
	}
	


}
