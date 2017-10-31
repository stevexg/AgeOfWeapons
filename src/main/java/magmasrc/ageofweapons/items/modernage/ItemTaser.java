package magmasrc.ageofweapons.items.modernage;

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
import net.minecraft.util.EnumParticleTypes;

public class ItemTaser extends Item {

    public ItemTaser() {
        super();
        this.setMaxStackSize(1);
        this.setMaxDamage(300);
      /**  if(AgeOfWeapons.activateOnlyOneTab){
        	this.setCreativeTab(ModTabs.generalTab);
        } else {
        	this.setCreativeTab(ModTabs.modernAgeTab);
        }	**/
    }
    
    
	@Override
	public void addInformation(ItemStack  stack, EntityPlayer playerIn, List addList, boolean advanced) {
		if(AgeOfWeapons.activateShowAges) {	
			addList.add(ChatFormatting.GRAY + "Modern Age");
		}
			addList.add(ChatFormatting.RED + "Work in progress");

	}
	
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		if (entity instanceof EntityPlayer) {
			EntityPlayer entityIn = (EntityPlayer) entity ;

			entityIn.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 50, 3));
			entityIn.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 100, 3));
			entityIn.attackEntityFrom(DamageSource.GENERIC, 2.0F);
			//entityIn.world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, 1, 1, 1, 0.0D, 0.0D, 0.0D, new int[0]);
			//add sound
            stack.damageItem(1, player);
			return true;
		}	
		if (entity instanceof EntityLiving) {
			EntityLiving entityIn = (EntityLiving) entity ;
			entityIn.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 100, 3));
			entityIn.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 200, 0));
			entityIn.attackEntityFrom(DamageSource.GENERIC, 2.0F);
            stack.damageItem(1, player);
			return true;
		}	
		return super.onLeftClickEntity(stack, player, entity);
	}
}
