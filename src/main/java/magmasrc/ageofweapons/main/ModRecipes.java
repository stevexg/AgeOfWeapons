package magmasrc.ageofweapons.main;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModRecipes {
	
	public ModRecipes() {
	}
		public void register() {

			GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tableOfAges), "zzz", "xyx", "xox", 'x', Blocks.COBBLESTONE, 'o', Blocks.CHEST, 'y', Blocks.CRAFTING_TABLE, 'z', Blocks.STONE_SLAB);
			
			
		}
	}