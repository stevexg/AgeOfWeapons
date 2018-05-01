package magmasrc.ageofweapons.items.mystic;

import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModItems;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemScepterChanging extends Item {
	
	public ItemScepterChanging () {
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
	public void addInformation(ItemStack stack, World player, List<String> addList, ITooltipFlag advanced) {
		if(AgeOfWeapons.activateShowAges) {
			addList.add(ChatFormatting.DARK_GRAY + "Mystic");
		}	
	}
    

	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == ModItems.amethyst;
	}  



	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack itemstack = player.getHeldItem(hand);

        if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack)) {
            return EnumActionResult.FAIL;
        } else {
            IBlockState iblockstate = worldIn.getBlockState(pos);
            Block block = iblockstate.getBlock();

            if (facing != EnumFacing.DOWN && block == Blocks.STONE) {
                IBlockState iblockstate1 = Blocks.COBBLESTONE.getDefaultState();
                worldIn.playSound(player, pos, SoundEvents.BLOCK_STONE_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);

                if (!worldIn.isRemote) {
                    worldIn.setBlockState(pos, iblockstate1, 11);
                    itemstack.damageItem(1, player);
                }
                return EnumActionResult.SUCCESS;
                
                
            } if (facing != EnumFacing.DOWN && block == Blocks.ICE) {
                IBlockState iblockstate1 = Blocks.PACKED_ICE.getDefaultState();
                worldIn.playSound(player, pos, SoundEvents.BLOCK_STONE_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);

                if (!worldIn.isRemote) {
                    worldIn.setBlockState(pos, iblockstate1, 11);
                    itemstack.damageItem(1, player);
                }
                return EnumActionResult.SUCCESS;            
           
                
            } if (facing != EnumFacing.DOWN && block == Blocks.DIRT) {
                IBlockState iblockstate1 = Blocks.DIRT.getStateFromMeta(1);
                worldIn.playSound(player, pos, SoundEvents.BLOCK_STONE_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);

                if (!worldIn.isRemote) {
                    worldIn.setBlockState(pos, iblockstate1, 11);
                    itemstack.damageItem(1, player);
                }
                return EnumActionResult.SUCCESS; 
              
                
            } if (facing != EnumFacing.DOWN && block == Blocks.GRASS) {
                IBlockState iblockstate1 = Blocks.DIRT.getStateFromMeta(2);
                worldIn.playSound(player, pos, SoundEvents.BLOCK_STONE_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);

                if (!worldIn.isRemote) {
                    worldIn.setBlockState(pos, iblockstate1, 11);
                    itemstack.damageItem(1, player);
                }
                return EnumActionResult.SUCCESS; 
                
                
            } if (facing != EnumFacing.DOWN && block == Blocks.SAND) {
                IBlockState iblockstate1 = Blocks.SAND.getStateFromMeta(1);
                worldIn.playSound(player, pos, SoundEvents.BLOCK_STONE_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);

                if (!worldIn.isRemote) {
                    worldIn.setBlockState(pos, iblockstate1, 11);
                    itemstack.damageItem(1, player);
                }
                return EnumActionResult.SUCCESS; 
            
                
            } if (facing != EnumFacing.DOWN && block == Blocks.SANDSTONE) {
                IBlockState iblockstate1 = Blocks.RED_SANDSTONE.getDefaultState();
                worldIn.playSound(player, pos, SoundEvents.BLOCK_STONE_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);

                if (!worldIn.isRemote) {
                    worldIn.setBlockState(pos, iblockstate1, 11);
                    itemstack.damageItem(1, player);
                }
                return EnumActionResult.SUCCESS; 
            
            
            } else {
                return EnumActionResult.PASS;
            }
        }
    }
}
