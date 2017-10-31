package magmasrc.ageofweapons.items.mystic;

import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModItems;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.entity.EntityAreaEffectCloud;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemWandNether extends Item {
	
	public ItemWandNether () {
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
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        pos = pos.offset(facing);
    	ItemStack itemstack = player.getHeldItem(hand);

        if (!player.canPlayerEdit(pos, facing, itemstack)) {
            return EnumActionResult.FAIL;
        }else{
            if (worldIn.isAirBlock(pos)) {
	    		player.getCooldownTracker().setCooldown(this, 100);
                worldIn.playSound(player, pos, SoundEvents.ENTITY_ENDERMEN_TELEPORT, SoundCategory.PLAYERS, 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
                worldIn.setBlockState(pos.add(0, 0, 0), Blocks.FIRE.getDefaultState(), 11);
                worldIn.setBlockState(pos.add(1, 0, 0), Blocks.FIRE.getDefaultState(), 11);
                worldIn.setBlockState(pos.add(0, 0, 1), Blocks.FIRE.getDefaultState(), 11);
                worldIn.setBlockState(pos.add(-1, 0, 0), Blocks.FIRE.getDefaultState(), 11);
                worldIn.setBlockState(pos.add(0, 0, -1), Blocks.FIRE.getDefaultState(), 11);
                
                if(!worldIn.isRemote) {        
        	    	EntityAreaEffectCloud cloud = new EntityAreaEffectCloud(worldIn, pos.getX(), pos.getY(), pos.getZ());
        	        cloud.setDuration(100);
        	    	cloud.setRadius(1.0F);
        	    	cloud.setParticle(EnumParticleTypes.LAVA);
        	    	worldIn.spawnEntity(cloud);
                }	
            }
	    	player.addStat(StatList.getObjectUseStats(this));
            itemstack.damageItem(1, player);
            return EnumActionResult.SUCCESS;
        }
    }
    
    
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == ModItems.amethyst;
	}  

}
