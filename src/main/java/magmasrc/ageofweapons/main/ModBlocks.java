package magmasrc.ageofweapons.main;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	
	

	
		public void init() {
		
			

		}
		
		
		
		public void register() {
			

			
			
		}
		
		
		
		
		private void registerBlock(Block block) {
			GameRegistry.register(block);
			ItemBlock itemblock = new ItemBlock(block);
			itemblock.setUnlocalizedName(block.getUnlocalizedName()).setRegistryName(block.getRegistryName());
			GameRegistry.register(itemblock);
		}
		
}
