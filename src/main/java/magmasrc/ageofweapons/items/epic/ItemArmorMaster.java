package magmasrc.ageofweapons.items.epic;

import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModItems;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArmorMaster extends ItemArmor {

	public ItemArmorMaster(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
        if(AgeOfWeapons.activateOnlyOneTab){
        	this.setCreativeTab(ModTabs.generalTab);
        } else {
        	this.setCreativeTab(ModTabs.epicTab);
        }		
        }
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == ModItems.witheredIronIngot;
	} 
	
	
	@Override
	public void addInformation(ItemStack stack, World player, List<String> addList, ITooltipFlag advanced) {
		if(AgeOfWeapons.activateShowAges) {
			addList.add(ChatFormatting.DARK_GRAY + "Epic");
		}	
	}
    
	

	
	

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (!world.isRemote && player.inventory.armorInventory.get(3) != ItemStack.EMPTY && player.inventory.armorInventory.get(3).getItem() == ModItems.masterHelmet
		        && player.inventory.armorInventory.get(2) != ItemStack.EMPTY && player.inventory.armorInventory.get(2).getItem() == ModItems.masterChestplate
		        && player.inventory.armorInventory.get(1) != ItemStack.EMPTY && player.inventory.armorInventory.get(1).getItem() == ModItems.masterLeggings
		        && player.inventory.armorInventory.get(0) != ItemStack.EMPTY && player.inventory.armorInventory.get(0).getItem() == ModItems.masterBoots) {
		        this.effectPlayer(player, MobEffects.LUCK, 4);
			}
		}
	

	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
	        player.addPotionEffect(new PotionEffect(MobEffects.LUCK, 10, amplifier, true, true));
	}

}
