package magmasrc.ageofweapons.blocks;

import java.util.List;

import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import com.mojang.realmsclient.gui.ChatFormatting;

public class BlockSapphire extends Block {

	public BlockSapphire() {
		super(Material.IRON);
		this.setCreativeTab(ModTabs.generalTab);
		this.setHardness(5.0F);
		this.setResistance(10.0F);
		this.setSoundType(SoundType.STONE);	
	}
	
}
