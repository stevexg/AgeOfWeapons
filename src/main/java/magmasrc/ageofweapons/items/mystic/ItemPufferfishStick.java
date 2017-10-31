package magmasrc.ageofweapons.items.mystic;

import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;

public class ItemPufferfishStick extends Item {
	
	public ItemPufferfishStick () {
		super();
		this.setMaxStackSize(1);
        this.setMaxDamage(200);
        if(AgeOfWeapons.activateOnlyOneTab){
        	this.setCreativeTab(ModTabs.generalTab);
        } else {
        	this.setCreativeTab(ModTabs.mysticTab);
        }	
	}
	
	
	
    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List addList, boolean advanced) {
    	if(AgeOfWeapons.activateShowAges) {
    		addList.add(ChatFormatting.DARK_GRAY + "Mystic");
    	}	
    }
    
    
    
    
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		if (entity instanceof EntityPlayer) {
			EntityPlayer entityIn = (EntityPlayer) entity ;

			entityIn.addPotionEffect(new PotionEffect(MobEffects.POISON, 300, 0));
			entityIn.attackEntityFrom(DamageSource.GENERIC, 1.0F);
            stack.damageItem(1, player);
			return true;
		}	
		if (entity instanceof EntityLiving) {
			EntityLiving entityIn = (EntityLiving) entity ;
			entityIn.addPotionEffect(new PotionEffect(MobEffects.POISON, 300, 0));
			entityIn.attackEntityFrom(DamageSource.GENERIC, 1.0F);
            stack.damageItem(1, player);
			return true;
		}	
		return super.onLeftClickEntity(stack, player, entity);
	}

}
