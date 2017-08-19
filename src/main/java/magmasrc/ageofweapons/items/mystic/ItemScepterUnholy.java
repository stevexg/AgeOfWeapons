package magmasrc.ageofweapons.items.mystic;

import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModItems;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.entity.EntityAreaEffectCloud;
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.monster.EntityVindicator;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityZombieVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemScepterUnholy extends Item {
	
	public ItemScepterUnholy () {
		super();
		this.setMaxStackSize(1);
        this.setMaxDamage(64);
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
    	
            if (worldIn.isAirBlock(pos)) {
	    		player.getCooldownTracker().setCooldown(this, 800);
                worldIn.playSound(player, pos, SoundEvents.ENTITY_ENDERMEN_TELEPORT, SoundCategory.PLAYERS, 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
                
                if(!worldIn.isRemote) {        
        	    	EntityAreaEffectCloud cloud = new EntityAreaEffectCloud(worldIn, pos.getX(), pos.getY(), pos.getZ());
        	        cloud.setDuration(30);
        	        cloud.setWaitTime(0);
        	    	cloud.setRadius(3.0F);
        	    	cloud.setParticle(EnumParticleTypes.SMOKE_NORMAL);
        	    	worldIn.spawnEntity(cloud);
        	    	
        	    	EntityHusk zombie1 = new EntityHusk(worldIn);
        	    	zombie1.setPosition(pos.getX() + 1, pos.getY(), pos.getZ());
        	    	zombie1.setBreakDoorsAItask(true);
        	    	zombie1.setCanPickUpLoot(true);
        	    	
        	    	EntityHusk zombie2 = new EntityHusk(worldIn);
        	    	zombie2.setPosition(pos.getX(), pos.getY(), pos.getZ() + 1);
        	    	zombie2.setBreakDoorsAItask(true);
        	    	zombie2.setCanPickUpLoot(true);
        	    	
        	    	EntityHusk zombie3 = new EntityHusk(worldIn);
        	    	zombie3.setPosition(pos.getX() - 1, pos.getY(), pos.getZ());
        	    	zombie3.setBreakDoorsAItask(true);
        	    	zombie3.setCanPickUpLoot(true);
        	    	
        	    	EntityHusk zombie4 = new EntityHusk(worldIn);
        	    	zombie4.setPosition(pos.getX(), pos.getY(), pos.getZ() - 1);
        	    	zombie4.setBreakDoorsAItask(true);
        	    	zombie4.setCanPickUpLoot(true);
        	    	
        	    	EntityVindicator vindicator = new EntityVindicator(worldIn);
        	    	vindicator.setPosition(pos.getX(), pos.getY(), pos.getZ());
        	    	
        	    	worldIn.spawnEntity(zombie1);
        	    	worldIn.spawnEntity(zombie2);
        	    	worldIn.spawnEntity(zombie3);
        	    	worldIn.spawnEntity(zombie4);
        	    	worldIn.spawnEntity(vindicator);
                }	
            }
	    	player.addStat(StatList.getObjectUseStats(this));
            itemstack.damageItem(1, player);
            return EnumActionResult.SUCCESS;
    	}

    
    
    
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == ModItems.amethyst;
	}  
}
