package magmasrc.ageofweapons.blocks;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTableOfAges extends Block {

	public BlockTableOfAges() {
		super(Material.WOOD);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);        //   to-do!!!!
		this.setHardness(2.5F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.STONE);
		
	}

}
