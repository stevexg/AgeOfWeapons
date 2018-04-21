package magmasrc.ageofweapons.items.middleages;

import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModTabs;
import magmasrc.ageofweapons.util.ItemCustomWeapon;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.List;

public class ItemWarHammerStone extends ItemCustomWeapon {

    public ItemWarHammerStone(ToolMaterial material) {
        super(material, 0.3F);

        this.setMaxStackSize(1);
        if(AgeOfWeapons.activateOnlyOneTab){
        	this.setCreativeTab(ModTabs.generalTab);
        } else {
        	this.setCreativeTab(ModTabs.middleAgesTab);
        }
    }

    
	@Override
	public void addInformation(ItemStack stack, World player, List<String> addList, ITooltipFlag advanced) {
		if(AgeOfWeapons.activateShowAges) {
			addList.add(ChatFormatting.DARK_GRAY + "Middle Ages");
		}	
	}
    
    
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == Item.getItemFromBlock(Blocks.COBBLESTONE);
	}  
	
	
	
	
	@Override
	   public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	    {
	        ItemStack itemstack = player.getHeldItem(hand);

	        if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack))
	        {
	            return EnumActionResult.FAIL;
	        }
	        else
	        {
	            IBlockState iblockstate = worldIn.getBlockState(pos);
	            Block block = iblockstate.getBlock();

	            if (facing != EnumFacing.DOWN && block == Blocks.STONE)
	            {
	                IBlockState iblockstate1 = Blocks.COBBLESTONE.getDefaultState();
	                worldIn.playSound(player, pos, SoundEvents.BLOCK_STONE_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);

	                if (!worldIn.isRemote)
	                {
	                    worldIn.setBlockState(pos, iblockstate1, 11);
	                    itemstack.damageItem(1, player);
	                }

	                return EnumActionResult.SUCCESS;
	            }
	            else
	            {
	                return EnumActionResult.PASS;
	            }
	        }
	    }
	
	
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		stack.damageItem(1, attacker);

		double d = attacker.posX - target.posX;
                double d1;
                for(d1 = attacker.posZ - target.posZ; d * d + d1 * d1 < 0.0001D; d1 = (Math.random() - Math.random()) * 1.01D) {
                    d = (Math.random() - Math.random()) * 1.1D;
                }

		target.isAirBorne = true;
		float f = MathHelper.sqrt(d * d + d1 * d1);
		float f1 = 1.500F;
		target.motionX /= 2D;
		target.motionY /= 2D;
		target.motionZ /= 2D;
		target.motionX -= (d / (double)f) * (double)f1;
		target.motionY += 0.80000000596046448D;
		target.motionZ -= (d1 / (double)f) * (double)f1;
        	if(target.motionY > 0.80000000596046448D) {
        		target.motionY = 0.80000000596046448D;
        	}
        	return true;
	}

}
