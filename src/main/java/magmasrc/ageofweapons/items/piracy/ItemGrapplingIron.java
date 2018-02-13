package magmasrc.ageofweapons.items.piracy;

import java.util.List;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModTabs;
import magmasrc.ageofweapons.util.ItemCustomWeapon;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import com.mojang.realmsclient.gui.ChatFormatting;

public class ItemGrapplingIron extends ItemCustomWeapon {

    public ItemGrapplingIron(ToolMaterial material) {
        super(material, 3);

        this.setMaxStackSize(1);
        if(AgeOfWeapons.activateOnlyOneTab){
        	this.setCreativeTab(ModTabs.generalTab);
        } else {
        	this.setCreativeTab(ModTabs.piracyTab);
        }
    }

    
	@Override
	public void addInformation(ItemStack stack, World player, List<String> addList, ITooltipFlag advanced) {
		if(AgeOfWeapons.activateShowAges) {
			addList.add(ChatFormatting.DARK_GRAY + "Golden age of Piracy");
		}	
	}
    
    
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == Items.IRON_INGOT;
	}
	
	
	
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		if (entity instanceof EntityPlayer) {
			EntityPlayer entityIn = (EntityPlayer) entity ;

			entityIn.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 80, 1));
			entityIn.attackEntityFrom(DamageSource.GENERIC, 1.0F);
            stack.damageItem(1, player);
			return true;
		}	
		if (entity instanceof EntityLiving) {
			EntityLiving entityIn = (EntityLiving) entity ;
			entityIn.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 80, 1));
			entityIn.attackEntityFrom(DamageSource.GENERIC, 1.0F);
            stack.damageItem(1, player);
			return true;
		}	
		return super.onLeftClickEntity(stack, player, entity);
	}

}
