package magmasrc.ageofweapons.items.fantasy;

import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModTabs;
import magmasrc.ageofweapons.util.ItemCustomWeapon;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class ItemClawSwordGold extends ItemCustomWeapon {

    public ItemClawSwordGold(ToolMaterial material) {
        super(material, 1.4F);

        this.setCreativeTab(ModTabs.fantasyTab);
        this.setMaxStackSize(1);
    }

    
    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List addList, boolean advanced) {
    	if(AgeOfWeapons.activateShowAges) {
    		addList.add(ChatFormatting.DARK_GRAY + "Fantasy");
    	}	
    }
    
    
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == Items.GOLD_INGOT;
	}  
	
	
	
	 @Override
	 @SuppressWarnings("incomplete-switch")
	    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	    {
	        ItemStack itemstack = player.getHeldItem(hand);

	        if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack))
	        {
	            return EnumActionResult.FAIL;
	        }
	        else
	        {
	            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, player, worldIn, pos);
	            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

	            IBlockState iblockstate = worldIn.getBlockState(pos);
	            Block block = iblockstate.getBlock();

	            if (facing != EnumFacing.DOWN && worldIn.isAirBlock(pos.up()))
	            {
	                if (block == Blocks.GRASS || block == Blocks.GRASS_PATH)
	                {
	                    this.setBlock(itemstack, player, worldIn, pos, Blocks.FARMLAND.getDefaultState());
	                    return EnumActionResult.SUCCESS;
	                }

	                if (block == Blocks.DIRT)
	                {
	                    switch ((BlockDirt.DirtType)iblockstate.getValue(BlockDirt.VARIANT))
	                    {
	                        case DIRT:
	                            this.setBlock(itemstack, player, worldIn, pos, Blocks.FARMLAND.getDefaultState());
	                            return EnumActionResult.SUCCESS;
	                        case COARSE_DIRT:
	                            this.setBlock(itemstack, player, worldIn, pos, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
	                            return EnumActionResult.SUCCESS;
	                    }
	                }
	            }

	            return EnumActionResult.PASS;
	        }
	    }
	 
	 
	 
	 protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state)
	    {
	        worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

	        if (!worldIn.isRemote)
	        {
	            worldIn.setBlockState(pos, state, 11);
	            stack.damageItem(1, player);
	        }
	    }

}