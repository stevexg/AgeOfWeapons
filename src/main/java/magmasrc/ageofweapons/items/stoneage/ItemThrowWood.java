package magmasrc.ageofweapons.items.stoneage;

import java.util.List;

import magmasrc.ageofweapons.entity.EntityThrowWood;
import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

import com.mojang.realmsclient.gui.ChatFormatting;

public class ItemThrowWood extends Item {
	
	public ItemThrowWood() {
		    this.setMaxStackSize(1);
	        if(AgeOfWeapons.activateOnlyOneTab){
	        	this.setCreativeTab(ModTabs.generalTab);
	        } else {
	        	this.setCreativeTab(ModTabs.stoneAgeTab);
	        }  
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
            EntityThrowWood obj = new EntityThrowWood(worldIn, playerIn);
            obj.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.8F, 1.0F);
            worldIn.spawnEntity(obj);
        }

        playerIn.addStat(StatList.getObjectUseStats(this));
        return new ActionResult(EnumActionResult.SUCCESS, itemstack);
    }
  
  

	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == Item.getItemFromBlock(Blocks.PLANKS);	 
	} 
	
	
	@Override
	public void addInformation(ItemStack stack, World player, List<String> addList, ITooltipFlag advanced) {
		if(AgeOfWeapons.activateShowAges) {
			addList.add(ChatFormatting.DARK_GRAY + "Stone Age");
		}	
	}
}
