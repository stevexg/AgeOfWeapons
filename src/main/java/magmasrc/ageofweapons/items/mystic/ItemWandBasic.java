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

public class ItemWandBasic extends Item {
	
	public ItemWandBasic () {
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
	    		playerIn.getCooldownTracker().setCooldown(this, 150);
	    		
	    if(!worldIn.isRemote) {        
	    	EntityAreaEffectCloud cloud1 = new EntityAreaEffectCloud(worldIn, playerIn.posX + 7.0F, playerIn.posY + 0.5F, playerIn.posZ);
	        cloud1.setDuration(20);
	    	cloud1.setRadius(3F);
	    	cloud1.setParticle(EnumParticleTypes.FIREWORKS_SPARK);
	    	cloud1.addEffect(new PotionEffect(MobEffects.WEAKNESS, 150, 0));
	    	worldIn.spawnEntity(cloud1);
	    	
	    	EntityAreaEffectCloud cloud2 = new EntityAreaEffectCloud(worldIn, playerIn.posX - 7.0F, playerIn.posY + 0.5F, playerIn.posZ);
	        cloud2.setDuration(20);
	    	cloud2.setRadius(3F);
	    	cloud2.setParticle(EnumParticleTypes.FIREWORKS_SPARK);
	    	cloud2.addEffect(new PotionEffect(MobEffects.WEAKNESS, 150, 0));
	    	worldIn.spawnEntity(cloud2);
	    	
	    	EntityAreaEffectCloud cloud3 = new EntityAreaEffectCloud(worldIn, playerIn.posX, playerIn.posY + 0.5F, playerIn.posZ + 7.0F);
	        cloud3.setDuration(20);
	    	cloud3.setRadius(3F);
	    	cloud3.setParticle(EnumParticleTypes.FIREWORKS_SPARK);
	    	cloud3.addEffect(new PotionEffect(MobEffects.WEAKNESS, 150, 0));
	    	worldIn.spawnEntity(cloud3);
	    	
	    	EntityAreaEffectCloud cloud4 = new EntityAreaEffectCloud(worldIn, playerIn.posX, playerIn.posY + 0.5F, playerIn.posZ - 7.0F);
	        cloud4.setDuration(20);
	    	cloud4.setRadius(3F);
	    	cloud4.setColor(0x616161);
	    	cloud4.setParticle(EnumParticleTypes.FIREWORKS_SPARK);
	    	cloud4.addEffect(new PotionEffect(MobEffects.WEAKNESS, 150, 0));
	    	worldIn.spawnEntity(cloud4);
	    	
	    	
	    	EntityAreaEffectCloud cloud5 = new EntityAreaEffectCloud(worldIn, playerIn.posX + 4.0F, playerIn.posY + 0.5F, playerIn.posZ + 5.0F);
	        cloud5.setDuration(20);
	    	cloud5.setRadius(3F);
	    	cloud5.setColor(0x616161);
	    	cloud5.setParticle(EnumParticleTypes.FIREWORKS_SPARK);
	    	cloud5.addEffect(new PotionEffect(MobEffects.WEAKNESS, 150, 0));
	    	worldIn.spawnEntity(cloud5);
	    	
	    	EntityAreaEffectCloud cloud6 = new EntityAreaEffectCloud(worldIn, playerIn.posX - 4.0F, playerIn.posY + 0.5F, playerIn.posZ - 5.0F);
	        cloud6.setDuration(20);
	    	cloud6.setRadius(3F);
	    	cloud6.setColor(0x616161);
	    	cloud6.setParticle(EnumParticleTypes.FIREWORKS_SPARK);
	    	cloud6.addEffect(new PotionEffect(MobEffects.WEAKNESS, 150, 0));
	    	worldIn.spawnEntity(cloud6);
	    	
	    	EntityAreaEffectCloud cloud7 = new EntityAreaEffectCloud(worldIn, playerIn.posX - 4.0F, playerIn.posY + 0.5F, playerIn.posZ + 4.0F);
	        cloud7.setDuration(20);
	    	cloud7.setRadius(3F);
	    	cloud7.setColor(0x616161);
	    	cloud7.setParticle(EnumParticleTypes.FIREWORKS_SPARK);
	    	cloud7.addEffect(new PotionEffect(MobEffects.WEAKNESS, 150, 0));
	    	worldIn.spawnEntity(cloud7);
	    	
	    	EntityAreaEffectCloud cloud8 = new EntityAreaEffectCloud(worldIn, playerIn.posX + 5.0F, playerIn.posY + 0.5F, playerIn.posZ - 5.0F);
	        cloud8.setDuration(20);
	    	cloud8.setRadius(3F);
	    	cloud8.setColor(0x616161);
	    	cloud8.setParticle(EnumParticleTypes.FIREWORKS_SPARK);
	    	cloud8.addEffect(new PotionEffect(MobEffects.WEAKNESS, 150, 0));
	    	worldIn.spawnEntity(cloud8);
		}   
	    	itemstack.damageItem(1, playerIn);
	    	playerIn.addStat(StatList.getObjectUseStats(this));
	    	return new ActionResult(EnumActionResult.SUCCESS, itemstack);
    }


    
    
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == ModItems.amethyst;
	}  
}
