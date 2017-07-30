package magmasrc.ageofweapons.items.mystic;

import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModItems;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.entity.EntityAreaEffectCloud;
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
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemWandHoly extends Item {
	
	public ItemWandHoly () {
		super();
		this.setCreativeTab(ModTabs.mysticTab);
		this.setMaxStackSize(1);
        this.setMaxDamage(200);
	}
	
	
	
    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List addList, boolean advanced) {
    	if(AgeOfWeapons.activateShowAges) {
    		addList.add(ChatFormatting.DARK_GRAY + "Mystic");
    	}	
    }
    
    
    
    @Override 
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
	        ItemStack itemstack = playerIn.getHeldItem(handIn);

	    		worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_ENDERMEN_TELEPORT, SoundCategory.PLAYERS, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
	    		playerIn.getCooldownTracker().setCooldown(this, 300);
	    		
	    if(!worldIn.isRemote) {        
	    	EntityAreaEffectCloud cloud1 = new EntityAreaEffectCloud(worldIn, playerIn.posX, playerIn.posY + 0.5F, playerIn.posZ);
	    	cloud1.setDuration(10);
	    	cloud1.setRadius(2.0F);
	    	cloud1.setParticle(EnumParticleTypes.HEART);
	    	cloud1.addEffect(new PotionEffect(MobEffects.REGENERATION, 200, 1));
	    	worldIn.spawnEntity(cloud1);
		}   
	    	playerIn.addStat(StatList.getObjectUseStats(this));
	    	return new ActionResult(EnumActionResult.SUCCESS, itemstack);
    }
    
    
    
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == ModItems.amethyst;
	}  
    

}