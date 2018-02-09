package magmasrc.ageofweapons.blocks;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModTabs;
import magmasrc.ageofweapons.tileentitys.TileEntityTableOfAges;
import magmasrc.ageofweapons.util.GuiHandlerTOA;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockTableOfAges extends BlockContainer  {
	

	private static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

    
	public BlockTableOfAges() {
		super(Material.IRON);
		this.setCreativeTab(ModTabs.generalTab);
		this.setHardness(2.5F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.STONE);		
	    this.setLightOpacity(0);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));

	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand,
									EnumFacing side, float hitX, float hitY, float hitZ) {
		if (worldIn.isRemote) {
			return true;
		} else {
			TileEntity tileentity = worldIn.getTileEntity(pos);

			if (tileentity instanceof TileEntityTableOfAges) {
				playerIn.openGui(AgeOfWeapons.instance, 0, worldIn, pos.getX(), pos.getY(), pos.getZ());
				playerIn.addStat(StatList.CRAFTING_TABLE_INTERACTION);
			}

			return true;
		}
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityTableOfAges();
	}

	@Override
	public boolean hasTileEntity(IBlockState state){
		return true;
	}

	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {

		TileEntity tileentity = worldIn.getTileEntity(pos);

		if (tileentity instanceof IInventory)
		{
			InventoryHelper.dropInventoryItems(worldIn, pos, (IInventory)tileentity);
			worldIn.updateComparatorOutputLevel(pos, this);
		}



		super.breakBlock(worldIn, pos, state);

	}





	// Custom Model
	


    @Override
    public boolean isPassable(IBlockAccess worldIn, BlockPos pos){
        return true;
    }

	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer(){
		return BlockRenderLayer.CUTOUT;
	}


	@Override
	public boolean isFullCube(IBlockState state){
		return true;
	}

	@Override
	public EnumBlockRenderType getRenderType(IBlockState iBlockState) {
		return EnumBlockRenderType.MODEL;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return FULL_BLOCK_AABB;
	}





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
	
	


}
