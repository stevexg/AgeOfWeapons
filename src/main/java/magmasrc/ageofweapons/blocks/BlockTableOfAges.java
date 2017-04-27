package magmasrc.ageofweapons.blocks;

import magmasrc.ageofweapons.client.gui.GuiTableOfAges;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockTableOfAges extends Block {

	public BlockTableOfAges() {
		super(Material.WOOD);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);        //   to-do!!!!
		this.setHardness(2.5F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.STONE);
		
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

		Minecraft.getMinecraft().displayGuiScreen(new GuiTableOfAges());
		return true;
	}

}
