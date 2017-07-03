package magmasrc.ageofweapons.items.edoperiod;

import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.entity.EntityThrowingStar;
import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemThrowingStar extends Item {
	
	public ItemThrowingStar () {
		super();
		this.setCreativeTab(ModTabs.edoTab);
	}
	
	
    
    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List addList, boolean advanced) {
    	if(AgeOfWeapons.activateShowAges) {
    		addList.add(ChatFormatting.DARK_GRAY + "Edo Period");
    	}	
    	
		addList.add(ChatFormatting.RED + "Work in progress");
    }
    
    
    
    
    
    
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (!playerIn.capabilities.isCreativeMode) {
            itemstack.shrink(1);
        }

        worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        playerIn.getCooldownTracker().setCooldown(this, 5);
        
        if (!worldIn.isRemote){
            EntityThrowingStar obj = new EntityThrowingStar(worldIn, playerIn);
            obj.setHeadingFromThrower(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 0.3F, 1.0F);
            worldIn.spawnEntity(obj);
        }

        
        playerIn.addStat(StatList.getObjectUseStats(this));
        return new ActionResult(EnumActionResult.SUCCESS, itemstack);
    }

}
