package magmasrc.ageofweapons.blocks;

import java.util.Random;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModBlocks;
import magmasrc.ageofweapons.main.ModTabs;
import magmasrc.ageofweapons.tileentitys.TileEntityCrusher;
import magmasrc.ageofweapons.util.GuiHandlerCrusher;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockCrusher extends BlockContainer {
	

	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    private final boolean isBurning;
    private static boolean keepInventory;
    
	public BlockCrusher(boolean isBurning) {
		super(Material.ROCK);
		this.setCreativeTab(ModTabs.generalTab);
		this.setHardness(2.5F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.STONE);		
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        this.isBurning = isBurning;


	}


	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand,
									EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (worldIn.isRemote) {
			return true;
		} else {
			TileEntity tileentity = worldIn.getTileEntity(pos);

			if (tileentity instanceof TileEntityCrusher) {
				playerIn.openGui(AgeOfWeapons.instance, GuiHandlerCrusher.getGuiID(), worldIn, pos.getX(), pos.getY(), pos.getZ());
				playerIn.addStat(StatList.FURNACE_INTERACTION);
			}
			return true;
		}
	}



	    public static void setState(boolean active, World worldIn, BlockPos pos)
	    {
	        IBlockState iblockstate = worldIn.getBlockState(pos);
	        TileEntity tileentity = worldIn.getTileEntity(pos);
	        keepInventory = true;

	        if (active)
	        {
	            worldIn.setBlockState(pos, ModBlocks.crusherOn.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
	            worldIn.setBlockState(pos, ModBlocks.crusherOn.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
	        }
	        else
	        {
	            worldIn.setBlockState(pos, ModBlocks.crusher.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
	            worldIn.setBlockState(pos, ModBlocks.crusher.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
	        }

	        keepInventory = false;

	        if (tileentity != null)
	        {
	            tileentity.validate();
	            worldIn.setTileEntity(pos, tileentity);
	        }
	    }


	    public TileEntity createNewTileEntity(World worldIn, int meta) {
	        return new TileEntityCrusher();
	    }    
	
	
	    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
	    {
	        worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);

	        if (stack.hasDisplayName())
	        {
	            TileEntity tileentity = worldIn.getTileEntity(pos);

	            if (tileentity instanceof TileEntityCrusher)
	            {
	                ((TileEntityCrusher)tileentity).setCustomInventoryName(stack.getDisplayName());
	            }
	        }
	    }

	    @Override
	    public void breakBlock(World worldIn, BlockPos pos, IBlockState state)
	    {
	        if (!keepInventory)
	        {
	            TileEntity tileentity = worldIn.getTileEntity(pos);

	            if (tileentity instanceof TileEntityCrusher)
	            {
	                InventoryHelper.dropInventoryItems(worldIn, pos, (TileEntityCrusher)tileentity);
	                worldIn.updateComparatorOutputLevel(pos, this);
	            }
	        }

	        super.breakBlock(worldIn, pos, state);
	    }

	    @Override
	    public boolean hasComparatorInputOverride(IBlockState state) {
	        return true;
	    }

	    @Override
	    public int getComparatorInputOverride(IBlockState blockState, World worldIn, BlockPos pos) {
	        return Container.calcRedstone(worldIn.getTileEntity(pos));
	    }

	    @Override
	    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state){
	        return new ItemStack(ModBlocks.crusher);
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
	
	
		    
		    
		    
		    // other //

			@Override
			public EnumBlockRenderType getRenderType(IBlockState iBlockState) {
				return EnumBlockRenderType.MODEL;
			}
			
			
			 @SideOnly(Side.CLIENT)
			    @Override
			    @SuppressWarnings("incomplete-switch")
			    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
			    {
			        if (this.isBurning)
			        {
			            EnumFacing enumfacing = (EnumFacing)stateIn.getValue(FACING);
			            double d0 = (double)pos.getX() + 0.5D;
			            double d1 = (double)pos.getY() + rand.nextDouble() * 6.0D / 16.0D;
			            double d2 = (double)pos.getZ() + 0.5D;
			            double d3 = 0.52D;
			            double d4 = rand.nextDouble() * 0.6D - 0.3D;

			            if (rand.nextDouble() < 0.1D)
			            {
			                worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_ANVIL_DESTROY, SoundCategory.BLOCKS, 0.3F, 0.5F, false);
			            }

			            switch (enumfacing)
			            {
			                case WEST:
			                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 - 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
			                    break;
			                case EAST:
			                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
			                    break;
			                case NORTH:
			                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 - 0.52D, 0.0D, 0.0D, 0.0D, new int[0]);
			                    break;
			                case SOUTH:
			                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 + 0.52D, 0.0D, 0.0D, 0.0D, new int[0]);
			            }
			        }
			    }



}
