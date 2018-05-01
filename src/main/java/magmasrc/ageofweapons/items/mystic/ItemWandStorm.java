package magmasrc.ageofweapons.items.mystic;

import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModItems;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAreaEffectCloud;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ItemWandStorm extends Item {
	
	public ItemWandStorm () {
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
	public void addInformation(ItemStack stack, World player, List<String> addList, ITooltipFlag advanced) {
		if(AgeOfWeapons.activateShowAges) {
			addList.add(ChatFormatting.DARK_GRAY + "Mystic");
		}	
	}

	
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		World worldIn = attacker.getEntityWorld();
		
		stack.damageItem(1, attacker);
		
		 if(!worldIn.isRemote) {        
		    	EntityAreaEffectCloud cloud = new EntityAreaEffectCloud(worldIn, attacker.posX, attacker.posY + 0.5F, attacker.posZ);
		    	cloud.setRadius(2.0F);
		    	cloud.setDuration(3);
    	        cloud.setWaitTime(0);
		    	cloud.setParticle(EnumParticleTypes.SMOKE_NORMAL);
		    	worldIn.spawnEntity(cloud);
		    	
		    	EntityAreaEffectCloud cloud2 = new EntityAreaEffectCloud(worldIn, attacker.posX, attacker.posY + 0.5F, attacker.posZ);
		    	cloud2.setRadius(2.0F);
		    	cloud2.setDuration(3);
    	        cloud2.setWaitTime(0);
		    	cloud2.setParticle(EnumParticleTypes.SMOKE_NORMAL);
		    	worldIn.spawnEntity(cloud2);
		 }

		double d = attacker.posX - target.posX;
                double d1;
                for(d1 = attacker.posZ - target.posZ; d * d + d1 * d1 < 0.0001D; d1 = (Math.random() - Math.random()) * 1.01D) {
                    d = (Math.random() - Math.random()) * 1.1D;
                }

		target.isAirBorne = true;
		float f = MathHelper.sqrt(d * d + d1 * d1);
		float f1 = 1.500F;
		target.motionX /= 2D;
		target.motionY /= 2D;
		target.motionZ /= 2D;
		target.motionX -= (d / (double)f) * (double)f1;
		target.motionY += 0.80000000596046448D;
		target.motionZ -= (d1 / (double)f) * (double)f1;
        	if(target.motionY > 0.80000000596046448D) {
        		target.motionY = 0.80000000596046448D;
        	}
        	return true;
	}

    
    
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == ModItems.amethyst;
	}  
    

}
