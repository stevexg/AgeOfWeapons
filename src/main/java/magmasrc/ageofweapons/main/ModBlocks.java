package magmasrc.ageofweapons.main;

import magmasrc.ageofweapons.blocks.*;
import magmasrc.ageofweapons.util.NameUtils;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	
	public static Block tableOfAges;

	
	
	
	
	
		public void init() {
		
			tableOfAges = new BlockTableOfAges();
			
			
			
			
			
			
			NameUtils.setNames(tableOfAges, "table_of_ages");
			

		}
		
		
		
		public void register() {
			

			registerBlock(tableOfAges);
			
			
		}
		
		
		
		
		private void registerBlock(Block block) {
			GameRegistry.register(block);
			ItemBlock itemblock = new ItemBlock(block);
			itemblock.setUnlocalizedName(block.getUnlocalizedName()).setRegistryName(block.getRegistryName());
			GameRegistry.register(itemblock);
		}
		
}
