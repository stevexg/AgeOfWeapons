package magmasrc.ageofweapons.blocks;

import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockCrusher extends BlockDirectional  {
	

	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

    
	public BlockCrusher() {
		super(Material.ROCK);
		this.setCreativeTab(ModTabs.generalTab);
		this.setHardness(2.5F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.STONE);		
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));

	}

	
	
		// Function

	

	
	
	
	
		// Facing
	
		@Override
		  public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
		        this.setDefaultFacing(worldIn, pos, state);
		    }


		    private void setDefaultFacing(World worldIn, BlockPos pos, IBlockState state)
		    {
		        if (!worldIn.isRemote)
		        {
		            IBlockState iblockstate = worldIn.getBlockState(pos.north());
		            IBlockState iblockstate1 = worldIn.getBlockState(pos.south());
		            IBlockState iblockstate2 = worldIn.getBlockState(pos.west());
		            IBlockState iblockstate3 = worldIn.getBlockState(pos.east());
		            EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);

		            if (enumfacing == EnumFacing.NORTH && iblockstate.isFullBlock() && !iblockstate1.isFullBlock())
		            {
		                enumfacing = EnumFacing.SOUTH;
		            }
		            else if (enumfacing == EnumFacing.SOUTH && iblockstate1.isFullBlock() && !iblockstate.isFullBlock())
		            {
		                enumfacing = EnumFacing.NORTH;
		            }
		            else if (enumfacing == EnumFacing.WEST && iblockstate2.isFullBlock() && !iblockstate3.isFullBlock())
		            {
		                enumfacing = EnumFacing.EAST;
		            }
		            else if (enumfacing == EnumFacing.EAST && iblockstate3.isFullBlock() && !iblockstate2.isFullBlock())
		            {
		                enumfacing = EnumFacing.WEST;
		            }

		            worldIn.setBlockState(pos, state.withProperty(FACING, enumfacing), 2);
		        }
		    }
		    
		    
		    @Override
		    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
		    {
		        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
		    }
		    

		    @Override
		    public IBlockState getStateFromMeta(int meta){
		        EnumFacing enumfacing = EnumFacing.getFront(meta);

		        if (enumfacing.getAxis() == EnumFacing.Axis.Y)
		        {
		            enumfacing = EnumFacing.NORTH;
		        }

		        return this.getDefaultState().withProperty(FACING, enumfacing);
		    }

		    @Override
		    public int getMetaFromState(IBlockState state) {
		        return ((EnumFacing)state.getValue(FACING)).getIndex();
		    }

		    @Override
		    public IBlockState withRotation(IBlockState state, Rotation rot)
		    {
		        return state.withProperty(FACING, rot.rotate((EnumFacing)state.getValue(FACING)));
		    }

		    @Override
		    public IBlockState withMirror(IBlockState state, Mirror mirrorIn){
		        return state.withRotation(mirrorIn.toRotation((EnumFacing)state.getValue(FACING)));
		    }

		    @Override
		    protected BlockStateContainer createBlockState() {
		        return new BlockStateContainer(this, new IProperty[] {FACING});
		    }
	
		    
		    
		    
		    
		    // other //
		    
		    @Override
		    public void addInformation(ItemStack stack, EntityPlayer playerIn, List addList, boolean advanced) {
		        addList.add(ChatFormatting.RED + "Work in progress");
		    }
	


}
