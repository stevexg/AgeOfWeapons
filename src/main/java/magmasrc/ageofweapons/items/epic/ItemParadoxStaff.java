package magmasrc.ageofweapons.items.epic;

import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModItems;
import magmasrc.ageofweapons.main.ModTabs;
import magmasrc.ageofweapons.util.ItemCustomWeapon;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAreaEffectCloud;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumRarity;
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
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class ItemParadoxStaff extends ItemCustomWeapon {

    public ItemParadoxStaff(ToolMaterial material) {
        super(material, 0.9F);

        this.setMaxStackSize(1);
        if(AgeOfWeapons.activateOnlyOneTab){
        	this.setCreativeTab(ModTabs.generalTab);
        } else {
        	this.setCreativeTab(ModTabs.epicTab);
        }
    }

    
	@Override
	public void addInformation(ItemStack stack, World player, List<String> addList, ITooltipFlag advanced) {
		if(AgeOfWeapons.activateShowAges) {
			addList.add(ChatFormatting.DARK_GRAY + "Epic");
		}	
		addList.add(ChatFormatting.DARK_GRAY + "In memories to LEGO Universe!");
	}
    
    
    @SideOnly(Side.CLIENT)
    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == ModItems.witheredIronIngot;
	}  
	
	@Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.EPIC;
    }
	
	
	
	   @Override 
	    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		        ItemStack itemstack = playerIn.getHeldItem(handIn);

		    		worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_ENDERMEN_TELEPORT, SoundCategory.PLAYERS, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		    		playerIn.getCooldownTracker().setCooldown(this, 500);
		    		
		    if(!worldIn.isRemote) {        
		    	EntityAreaEffectCloud cloud1 = new EntityAreaEffectCloud(worldIn, playerIn.posX + 7.0F, playerIn.posY + 0.5F, playerIn.posZ);
		        cloud1.setDuration(20);
		    	cloud1.setRadius(3F);
		    	cloud1.setParticle(EnumParticleTypes.SMOKE_NORMAL);
		    	cloud1.addEffect(new PotionEffect(MobEffects.WITHER, 200, 1));
		    	worldIn.spawnEntity(cloud1);
		    	
		    	EntityAreaEffectCloud cloud2 = new EntityAreaEffectCloud(worldIn, playerIn.posX - 7.0F, playerIn.posY + 0.5F, playerIn.posZ);
		        cloud2.setDuration(20);
		    	cloud2.setRadius(3F);
		    	cloud2.setParticle(EnumParticleTypes.SMOKE_NORMAL);
		    	cloud2.addEffect(new PotionEffect(MobEffects.WITHER, 200, 1));
		    	worldIn.spawnEntity(cloud2);
		    	
		    	EntityAreaEffectCloud cloud3 = new EntityAreaEffectCloud(worldIn, playerIn.posX, playerIn.posY + 0.5F, playerIn.posZ + 7.0F);
		        cloud3.setDuration(20);
		    	cloud3.setRadius(3F);
		    	cloud3.setParticle(EnumParticleTypes.SMOKE_NORMAL);
		    	cloud3.addEffect(new PotionEffect(MobEffects.WITHER, 200, 1));
		    	worldIn.spawnEntity(cloud3);
		    	
		    	EntityAreaEffectCloud cloud4 = new EntityAreaEffectCloud(worldIn, playerIn.posX, playerIn.posY + 0.5F, playerIn.posZ - 7.0F);
		        cloud4.setDuration(20);
		    	cloud4.setRadius(3F);
		    	cloud4.setParticle(EnumParticleTypes.SMOKE_NORMAL);
		    	cloud4.addEffect(new PotionEffect(MobEffects.WITHER, 200, 1));
		    	worldIn.spawnEntity(cloud4);
		    	
		    	
		    	EntityAreaEffectCloud cloud5 = new EntityAreaEffectCloud(worldIn, playerIn.posX + 4.0F, playerIn.posY + 0.5F, playerIn.posZ + 5.0F);
		        cloud5.setDuration(20);
		    	cloud5.setRadius(3F);
		    	cloud5.setParticle(EnumParticleTypes.SMOKE_NORMAL);
		    	cloud5.addEffect(new PotionEffect(MobEffects.WITHER, 200, 1));
		    	worldIn.spawnEntity(cloud5);
		    	
		    	EntityAreaEffectCloud cloud6 = new EntityAreaEffectCloud(worldIn, playerIn.posX - 4.0F, playerIn.posY + 0.5F, playerIn.posZ - 5.0F);
		        cloud6.setDuration(20);
		    	cloud6.setRadius(3F);
		    	cloud6.setParticle(EnumParticleTypes.SMOKE_NORMAL);
		    	cloud6.addEffect(new PotionEffect(MobEffects.WITHER, 200, 1));
		    	worldIn.spawnEntity(cloud6);
		    	
		    	EntityAreaEffectCloud cloud7 = new EntityAreaEffectCloud(worldIn, playerIn.posX - 4.0F, playerIn.posY + 0.5F, playerIn.posZ + 4.0F);
		        cloud7.setDuration(20);
		    	cloud7.setRadius(3F);
		    	cloud7.setParticle(EnumParticleTypes.SMOKE_NORMAL);
		    	cloud7.addEffect(new PotionEffect(MobEffects.WITHER, 200, 1));
		    	worldIn.spawnEntity(cloud7);
		    	
		    	EntityAreaEffectCloud cloud8 = new EntityAreaEffectCloud(worldIn, playerIn.posX + 5.0F, playerIn.posY + 0.5F, playerIn.posZ - 5.0F);
		        cloud8.setDuration(20);
		    	cloud8.setRadius(3F);
		    	cloud8.setParticle(EnumParticleTypes.SMOKE_NORMAL);
		    	cloud8.addEffect(new PotionEffect(MobEffects.WITHER, 200, 1));
		    	worldIn.spawnEntity(cloud8);
		    	
		       	EntityAreaEffectCloud cloud9 = new EntityAreaEffectCloud(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ);
		        cloud9.setDuration(10);
		        cloud9.setWaitTime(0);
		    	cloud9.setRadius(4.0F);
		    	cloud9.setParticle(EnumParticleTypes.LAVA);
		    	worldIn.spawnEntity(cloud9);
			}   
		    	itemstack.damageItem(1, playerIn);
		    	playerIn.addStat(StatList.getObjectUseStats(this));
		    	return new ActionResult(EnumActionResult.SUCCESS, itemstack);
	    }
	    

}
