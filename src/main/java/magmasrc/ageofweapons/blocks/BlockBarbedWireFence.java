package magmasrc.ageofweapons.blocks;

import java.util.List;

import javax.annotation.Nullable;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModBlocks;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockBarbedWireFence extends Block {
	
	 public static final PropertyBool NORTH = PropertyBool.create("north");
	 public static final PropertyBool EAST = PropertyBool.create("east");
	 public static final PropertyBool SOUTH = PropertyBool.create("south");
	 public static final PropertyBool WEST = PropertyBool.create("west");
	 protected static final AxisAlignedBB[] AABB_BY_INDEX = new AxisAlignedBB[] {new AxisAlignedBB(0.4375D, 0.0D, 0.4375D, 0.5625D, 1.0D, 0.5625D), new AxisAlignedBB(0.4375D, 0.0D, 0.4375D, 0.5625D, 1.0D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.4375D, 0.5625D, 1.0D, 0.5625D), new AxisAlignedBB(0.0D, 0.0D, 0.4375D, 0.5625D, 1.0D, 1.0D), new AxisAlignedBB(0.4375D, 0.0D, 0.0D, 0.5625D, 1.0D, 0.5625D), new AxisAlignedBB(0.4375D, 0.0D, 0.0D, 0.5625D, 1.0D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.5625D, 1.0D, 0.5625D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.5625D, 1.0D, 1.0D), new AxisAlignedBB(0.4375D, 0.0D, 0.4375D, 1.0D, 1.0D, 0.5625D), new AxisAlignedBB(0.4375D, 0.0D, 0.4375D, 1.0D, 1.0D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.4375D, 1.0D, 1.0D, 0.5625D), new AxisAlignedBB(0.0D, 0.0D, 0.4375D, 1.0D, 1.0D, 1.0D), new AxisAlignedBB(0.4375D, 0.0D, 0.0D, 1.0D, 1.0D, 0.5625D), new AxisAlignedBB(0.4375D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.5625D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)};

	
	public BlockBarbedWireFence() {
		super(Material.IRON);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(3.0F);
		this.setResistance(10.0F);
		this.setSoundType(SoundType.METAL);
        if(AgeOfWeapons.activateOnlyOneTab){
        	this.setCreativeTab(ModTabs.generalTab);
        } else {
        	this.setCreativeTab(ModTabs.earlyModernAgeTab);
        }

	    this.setDefaultState(this.blockState.getBaseState().withProperty(NORTH, Boolean.valueOf(false)).withProperty(EAST, Boolean.valueOf(false)).withProperty(SOUTH, Boolean.valueOf(false)).withProperty(WEST, Boolean.valueOf(false)));

	}
	
	
	   @Override
	   public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean p_185477_7_) {
	        if (!p_185477_7_){
	            state = this.getActualState(state, worldIn, pos);
	        }

	        addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_BY_INDEX[0]);

	        if (((Boolean)state.getValue(NORTH)).booleanValue())
	        {
	            addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_BY_INDEX[getBoundingBoxIndex(EnumFacing.NORTH)]);
	        }

	        if (((Boolean)state.getValue(SOUTH)).booleanValue())
	        {
	            addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_BY_INDEX[getBoundingBoxIndex(EnumFacing.SOUTH)]);
	        }

	        if (((Boolean)state.getValue(EAST)).booleanValue())
	        {
	            addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_BY_INDEX[getBoundingBoxIndex(EnumFacing.EAST)]);
	        }

	        if (((Boolean)state.getValue(WEST)).booleanValue())
	        {
	            addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_BY_INDEX[getBoundingBoxIndex(EnumFacing.WEST)]);
	        }
	    }


	    private static int getBoundingBoxIndex(EnumFacing p_185729_0_) {
	        return 1 << p_185729_0_.getHorizontalIndex();
	    }

	    @Override
	    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos){
	        state = this.getActualState(state, source, pos);
	        return AABB_BY_INDEX[getBoundingBoxIndex(state)];
	    }

	    
	    private static int getBoundingBoxIndex(IBlockState state){
	        int i = 0;

	        if (((Boolean)state.getValue(NORTH)).booleanValue())
	        {
	            i |= getBoundingBoxIndex(EnumFacing.NORTH);
	        }

	        if (((Boolean)state.getValue(EAST)).booleanValue())
	        {
	            i |= getBoundingBoxIndex(EnumFacing.EAST);
	        }

	        if (((Boolean)state.getValue(SOUTH)).booleanValue())
	        {
	            i |= getBoundingBoxIndex(EnumFacing.SOUTH);
	        }

	        if (((Boolean)state.getValue(WEST)).booleanValue())
	        {
	            i |= getBoundingBoxIndex(EnumFacing.WEST);
	        }

	        return i;
	    }

	    /**
	     * Get the actual Block state of this Block at the given position. This applies properties not visible in the
	     * metadata, such as fence connections.
	     */
	    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos){
	        return state.withProperty(NORTH, canPaneConnectTo(worldIn, pos, EnumFacing.NORTH))
	                .withProperty(SOUTH, canPaneConnectTo(worldIn, pos, EnumFacing.SOUTH))
	                .withProperty(WEST, canPaneConnectTo(worldIn, pos, EnumFacing.WEST))
	                .withProperty(EAST, canPaneConnectTo(worldIn, pos, EnumFacing.EAST));
	    }

	    /**
	     * Get the Item that this Block should drop when harvested.
	     */
	    /**
	    @Override
	    public Item getItemDropped(IBlockState state, Random rand, int fortune){
	        return !this.canDrop ? Items.AIR : super.getItemDropped(state, rand, fortune);
	    }

	    /**
	     * Used to determine ambient occlusion and culling when rebuilding chunks for render
	     */
	    @Override
	    public boolean isOpaqueCube(IBlockState state){
	        return false;
	    }

	    @Override
	    public boolean isFullCube(IBlockState state){
	        return false;
	    }

	    
	    public final boolean canPaneConnectToBlock(Block blockIn) {
	        return blockIn.getDefaultState().isFullCube() || blockIn == this;
	    }
	    

	    @Override
	    @SideOnly(Side.CLIENT)
	    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
	        return blockAccess.getBlockState(pos.offset(side)).getBlock() == this ? false : super.shouldSideBeRendered(blockState, blockAccess, pos, side);
	    }

	    @Override
	    protected boolean canSilkHarvest(){
	        return true;
	    }

	    @Override
	    @SideOnly(Side.CLIENT)
	    public BlockRenderLayer getBlockLayer(){
	        return BlockRenderLayer.CUTOUT_MIPPED;
	    }

	    /**
	     * Convert the BlockState into the correct metadata value
	     */
	    @Override
	    public int getMetaFromState(IBlockState state){
	        return 0;
	    }

	    /**
	     * Returns the blockstate with the given rotation from the passed blockstate. If inapplicable, returns the passed
	     * blockstate.
	     */
	    @Override
	    public IBlockState withRotation(IBlockState state, Rotation rot){
	        switch (rot)
	        {
	            case CLOCKWISE_180:
	                return state.withProperty(NORTH, state.getValue(SOUTH)).withProperty(EAST, state.getValue(WEST)).withProperty(SOUTH, state.getValue(NORTH)).withProperty(WEST, state.getValue(EAST));
	            case COUNTERCLOCKWISE_90:
	                return state.withProperty(NORTH, state.getValue(EAST)).withProperty(EAST, state.getValue(SOUTH)).withProperty(SOUTH, state.getValue(WEST)).withProperty(WEST, state.getValue(NORTH));
	            case CLOCKWISE_90:
	                return state.withProperty(NORTH, state.getValue(WEST)).withProperty(EAST, state.getValue(NORTH)).withProperty(SOUTH, state.getValue(EAST)).withProperty(WEST, state.getValue(SOUTH));
	            default:
	                return state;
	        }
	    }

	    /**
	     * Returns the blockstate with the given mirror of the passed blockstate. If inapplicable, returns the passed
	     * blockstate.
	     */
	    @Override
	    public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
	        switch (mirrorIn)
	        {
	            case LEFT_RIGHT:
	                return state.withProperty(NORTH, state.getValue(SOUTH)).withProperty(SOUTH, state.getValue(NORTH));
	            case FRONT_BACK:
	                return state.withProperty(EAST, state.getValue(WEST)).withProperty(WEST, state.getValue(EAST));
	            default:
	                return super.withMirror(state, mirrorIn);
	        }
	    }

	    @Override
	    protected BlockStateContainer createBlockState(){
	        return new BlockStateContainer(this, new IProperty[] {NORTH, EAST, WEST, SOUTH});
	    }
	    
	    
	    
	    
	    
	    

		@Override
		public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
				entityIn.setInWeb();
			
			if (!worldIn.isRemote) {
				entityIn.attackEntityFrom(DamageSource.GENERIC, 1.0F);
			}
	    }

		
	    @Override
	    @Nullable
	    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
	        return NULL_AABB;
	    }

	    

	    /* ======================================== FORGE START ======================================== */
	    
	    @Override
	    public boolean canBeConnectedTo(IBlockAccess world, BlockPos pos, EnumFacing facing){
	        Block connector = world.getBlockState(pos.offset(facing)).getBlock();
	        return connector instanceof BlockPane;
	    }

	    public boolean canPaneConnectTo(IBlockAccess world, BlockPos pos, EnumFacing dir){
	        IBlockState state = world.getBlockState(pos.offset(dir));
	        return state.getBlock().canBeConnectedTo(world, pos.offset(dir), dir.getOpposite()) || canPaneConnectToBlock(state.getBlock()) || state.isSideSolid(world, pos.offset(dir), dir.getOpposite());
	    }
		
	    /* ======================================== FORGE END ======================================== */
	
}
