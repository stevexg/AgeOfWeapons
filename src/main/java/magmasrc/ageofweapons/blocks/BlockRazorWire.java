package magmasrc.ageofweapons.blocks;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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

import com.mojang.realmsclient.gui.ChatFormatting;

public class BlockRazorWire extends Block {
	
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

	public BlockRazorWire() {
		super(Material.IRON);
		this.setHardness(15.0F);
		this.setResistance(20.0F);
		this.setSoundType(SoundType.METAL);	
		this.setLightOpacity(1);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        if(AgeOfWeapons.activateOnlyOneTab){
        	this.setCreativeTab(ModTabs.generalTab);
        } else {
        	this.setCreativeTab(ModTabs.earlyModernAgeTab);
        }
		}
	
	
	
	//General
	
		@Override
		public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
				entityIn.setInWeb();
			
			if (!worldIn.isRemote) {
				entityIn.attackEntityFrom(DamageSource.GENERIC, 3.0F);
			}
	    }

	 
	  	@Override
	    public boolean isOpaqueCube(IBlockState state) {
	        return false;
	    }

	    @Override
	    @Nullable
	    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
	        return NULL_AABB;
	    }

	    
	    @Override
	    public boolean isFullCube(IBlockState state){
	        return false;
	    }

	  
	    @Override
	    @SideOnly(Side.CLIENT)
	    public BlockRenderLayer getBlockLayer() {
	        return BlockRenderLayer.CUTOUT;
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
