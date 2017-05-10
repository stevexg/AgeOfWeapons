package magmasrc.ageofweapons.main;

import magmasrc.ageofweapons.blocks.*;
import magmasrc.ageofweapons.tileentitys.TileEntityTableOfAges;
import magmasrc.ageofweapons.util.GuiHandlerRegistry;
import magmasrc.ageofweapons.util.GuiHandlerTOA;
import magmasrc.ageofweapons.util.NameUtils;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	
	public static Block tableOfAges;
	public static Block crusher;
	public static Block crusherOn;

	
	
	
	
	
		public void init() {
		
			tableOfAges = new BlockTableOfAges();
			crusher = new BlockCrusher();
			crusherOn = new BlockCrusherOn();
			
			
			
			
			
			
			NameUtils.setNames(tableOfAges,"table_of_ages");
			NameUtils.setNames(crusher, "crusher");
			NameUtils.setNames(crusherOn, "crusher_on");

		}
		
		
		
		public void register() {
			

			registerBlock(tableOfAges);
			registerBlock(crusher);
			registerBlock(crusherOn);




			GameRegistry.registerTileEntity(TileEntityTableOfAges.class, AgeOfWeapons.MODID+"tableofages");
			NetworkRegistry.INSTANCE.registerGuiHandler(AgeOfWeapons.instance, GuiHandlerRegistry.getInstance());
			GuiHandlerRegistry.getInstance().registerGuiHandler(new GuiHandlerTOA(), GuiHandlerTOA.getGuiID());
		}
		
		
		
		
		private void registerBlock(Block block) {
			GameRegistry.register(block);
			ItemBlock itemblock = new ItemBlock(block);
			itemblock.setUnlocalizedName(block.getUnlocalizedName()).setRegistryName(block.getRegistryName());
			GameRegistry.register(itemblock);
		}
}
