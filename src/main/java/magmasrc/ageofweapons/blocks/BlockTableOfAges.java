package magmasrc.ageofweapons.blocks;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.tileentitys.TileEntityTableOfAges;
import magmasrc.ageofweapons.util.GuiHandlerTOA;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockTableOfAges extends BlockContainer {

	public BlockTableOfAges() {
		super(Material.WOOD);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);        //TODO
		this.setHardness(2.5F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.STONE);
		
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityTableOfAges();
	}

	@Override
	public boolean hasTileEntity(IBlockState state)
	{
		return true;
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand,
									EnumFacing side, float hitX, float hitY, float hitZ) {
		if (worldIn.isRemote) return true;

		playerIn.openGui(AgeOfWeapons.instance, GuiHandlerTOA.getGuiID(), worldIn, pos.getX(), pos.getY(), pos.getZ());
		System.out.println("Clicked! Block Class");
		return true;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}

	@Override
	public EnumBlockRenderType getRenderType(IBlockState iBlockState) {
		return EnumBlockRenderType.MODEL;
	}

	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.SOLID;
	}


}
