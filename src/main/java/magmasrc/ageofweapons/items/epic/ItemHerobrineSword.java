package magmasrc.ageofweapons.items.epic;

import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModTabs;
import magmasrc.ageofweapons.util.ItemCustomWeapon;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAreaEffectCloud;
import net.minecraft.entity.EntityLiving;
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
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class ItemHerobrineSword extends ItemCustomWeapon {

    public ItemHerobrineSword(ToolMaterial material) {
        super(material, 2.5F);

        this.setCreativeTab(ModTabs.epicTab);
        this.setMaxStackSize(1);
    }

    
    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List addList, boolean advanced) {
    	if(AgeOfWeapons.activateShowAges) {
    		addList.add(ChatFormatting.DARK_GRAY + "Epic");
    	}	
    }
    
    
    @SideOnly(Side.CLIENT)
    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
    
    
    @Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int i, boolean bool) {
		super.onUpdate(stack, world, entity, i, bool);
	
		if(stack.isItemEnchanted() == false) {
			stack.addEnchantment(Enchantments.VANISHING_CURSE, 0);
			stack.addEnchantment(Enchantments.SHARPNESS, 3);
			stack.addEnchantment(Enchantments.KNOCKBACK, 1);
			super.onUpdate(stack, world, entity, i, bool);
		}
	}
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == Items.SKULL;
	}  
	
	@Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.EPIC;
    }
	
	
	
	
	
    
    @Override 
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
	        ItemStack itemstack = playerIn.getHeldItem(handIn);

	    		worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_ENDERDRAGON_SHOOT, SoundCategory.PLAYERS, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
	    		playerIn.getCooldownTracker().setCooldown(this, 150);
	    		
	    if(!worldIn.isRemote) {        
	    	EntityAreaEffectCloud cloud1 = new EntityAreaEffectCloud(worldIn, playerIn.posX + 7.0F, playerIn.posY + 0.5F, playerIn.posZ);
	        cloud1.setDuration(20);
	    	cloud1.setRadius(4F);
	    	cloud1.setParticle(EnumParticleTypes.SMOKE_LARGE);
	    	cloud1.addEffect(new PotionEffect(MobEffects.WITHER, 100, 1));
	    	worldIn.spawnEntity(cloud1);
	    	
	    	EntityAreaEffectCloud cloud2 = new EntityAreaEffectCloud(worldIn, playerIn.posX - 7.0F, playerIn.posY + 0.5F, playerIn.posZ);
	        cloud2.setDuration(20);
	    	cloud2.setRadius(4F);
	    	cloud2.setParticle(EnumParticleTypes.SMOKE_LARGE);
	    	cloud2.addEffect(new PotionEffect(MobEffects.WITHER, 100, 1));
	    	worldIn.spawnEntity(cloud2);
	    	
	    	EntityAreaEffectCloud cloud3 = new EntityAreaEffectCloud(worldIn, playerIn.posX, playerIn.posY + 0.5F, playerIn.posZ + 7.0F);
	        cloud3.setDuration(20);
	    	cloud3.setRadius(4F);
	    	cloud3.setParticle(EnumParticleTypes.SMOKE_LARGE);
	    	cloud3.addEffect(new PotionEffect(MobEffects.WITHER, 100, 1));
	    	worldIn.spawnEntity(cloud3);
	    	
	    	EntityAreaEffectCloud cloud4 = new EntityAreaEffectCloud(worldIn, playerIn.posX, playerIn.posY + 0.5F, playerIn.posZ - 7.0F);
	        cloud4.setDuration(20);
	    	cloud4.setRadius(4F);
	    	cloud4.setParticle(EnumParticleTypes.SMOKE_LARGE);
	    	cloud4.addEffect(new PotionEffect(MobEffects.WITHER, 100, 1));
	    	worldIn.spawnEntity(cloud4);
	    	
	    	
	    	EntityAreaEffectCloud cloud5 = new EntityAreaEffectCloud(worldIn, playerIn.posX + 4.0F, playerIn.posY + 0.5F, playerIn.posZ + 5.0F);
	        cloud5.setDuration(20);
	    	cloud5.setRadius(4F);
	    	cloud5.setParticle(EnumParticleTypes.SMOKE_LARGE);
	    	cloud5.addEffect(new PotionEffect(MobEffects.WITHER, 100, 1));
	    	worldIn.spawnEntity(cloud5);
	    	
	    	EntityAreaEffectCloud cloud6 = new EntityAreaEffectCloud(worldIn, playerIn.posX - 4.0F, playerIn.posY + 0.5F, playerIn.posZ - 5.0F);
	        cloud6.setDuration(20);
	    	cloud6.setRadius(4F);
	    	cloud6.setParticle(EnumParticleTypes.SMOKE_LARGE);
	    	cloud6.addEffect(new PotionEffect(MobEffects.WITHER, 100, 1));
	    	worldIn.spawnEntity(cloud6);
	    	
	    	EntityAreaEffectCloud cloud7 = new EntityAreaEffectCloud(worldIn, playerIn.posX - 4.0F, playerIn.posY + 0.5F, playerIn.posZ + 4.0F);
	        cloud7.setDuration(20);
	    	cloud7.setRadius(4F);
	    	cloud7.setParticle(EnumParticleTypes.SMOKE_LARGE);
	    	cloud7.addEffect(new PotionEffect(MobEffects.WITHER, 100, 1));
	    	worldIn.spawnEntity(cloud7);
	    	
	    	EntityAreaEffectCloud cloud8 = new EntityAreaEffectCloud(worldIn, playerIn.posX + 5.0F, playerIn.posY + 0.5F, playerIn.posZ - 5.0F);
	        cloud8.setDuration(20);
	    	cloud8.setRadius(4F);
	    	cloud8.setParticle(EnumParticleTypes.SMOKE_LARGE);
	    	cloud8.addEffect(new PotionEffect(MobEffects.WITHER, 100, 1));
	    	worldIn.spawnEntity(cloud8);
		}   
	    	itemstack.damageItem(1, playerIn);
	    	playerIn.addStat(StatList.getObjectUseStats(this));
	    	return new ActionResult(EnumActionResult.SUCCESS, itemstack);
    }

}
