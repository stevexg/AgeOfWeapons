package magmasrc.ageofweapons.blocks;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;
import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModItems;
import magmasrc.ageofweapons.main.ModTabs;
import magmasrc.ageofweapons.util.ModelHandler;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockWeaponBox extends BlockDirectional {

	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

	public BlockWeaponBox() {
		super(Material.WOOD);
		this.setCreativeTab(ModTabs.generalTab);
		this.setHardness(0.5F);
		this.setResistance(1.0F);
		this.setSoundType(SoundType.WOOD);		
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));

	}

	
	
		// Function
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {

		List<Item> myItems = ForgeRegistries.ITEMS.getValues().stream().filter(it -> it.getRegistryName().getResourceDomain().equals("ageofweapons")).collect(Collectors.toList());

	
		 int index = rand.nextInt(myItems.size());
	        Item item = myItems.get(index);
	        return item;
	        
	    	/**	     old
	    	   switch(rand.nextInt(6)){
			case 1:
				return ModItems.ax;
			case 2:
				return ModItems.batonIron;
			case 3:
				return ModItems.batonWood;
			case 4:
				return ModItems.battleAxeDiamond;
			case 5:
				return ModItems.battleAxeGold;
			default:
				return ModItems.battleAxeIron;
			}  
			**/
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

		        if (enumfacing.getAxis() == EnumFacing.Axis.Y){
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

	
