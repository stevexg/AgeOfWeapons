package magmasrc.ageofweapons.items.piracy;

import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.entity.EntityCastNet;
import magmasrc.ageofweapons.entity.EntityKunai;
import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemCastNet extends Item {
	
	public ItemCastNet () {
        super();
        this.setMaxStackSize(16);
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
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		if (entity instanceof EntityPlayer) {
			EntityPlayer entityIn = (EntityPlayer) entity ;

			entityIn.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 300, 3));
            stack.shrink(1);
			return true;
		}	
		if (entity instanceof EntityLiving) {
			EntityLiving entityIn = (EntityLiving) entity ;
			entityIn.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 300, 3));
            stack.shrink(1);
			return true;
		}	
		return super.onLeftClickEntity(stack, player, entity);
	}
	
	
	
	@Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (!playerIn.capabilities.isCreativeMode) {
            itemstack.shrink(1);
        }

        worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        playerIn.getCooldownTracker().setCooldown(this, 20);
        
        if (!worldIn.isRemote){
            EntityCastNet obj = new EntityCastNet(worldIn, playerIn);
            obj.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 0.3F + (float) Math.random(), 1.0F);
            worldIn.spawnEntity(obj);
        }

        
        playerIn.addStat(StatList.getObjectUseStats(this));
        return new ActionResult(EnumActionResult.SUCCESS, itemstack);
    }

}
