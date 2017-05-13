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
	public static Block weaponBox;
	public static Block nexus;
	public static Block nexus2;
	public static Block nexus3;
	public static Block nexus4;
	public static Block rubyBlock;
	public static Block sapphireBlock;

	
	
	
	
	
		public void init() {
		
			tableOfAges = new BlockTableOfAges();
			crusher = new BlockCrusher();
			crusherOn = new BlockCrusherOn();
			weaponBox = new BlockWeaponBox();
			nexus = new BlockNexus();
			nexus2 = new BlockNexus2();
			nexus3 = new BlockNexus3();
			nexus4 = new BlockNexus4();
			rubyBlock = new BlockRuby();
			sapphireBlock = new BlockSapphire();
			
			
			
			
			
			
			NameUtils.setNames(tableOfAges,"table_of_ages");
			NameUtils.setNames(crusher, "crusher");
			NameUtils.setNames(crusherOn, "crusher_on");
			NameUtils.setNames(weaponBox, "weapon_box");
			NameUtils.setNames(nexus, "nexus");
			NameUtils.setNames(nexus2, "nexus2");
			NameUtils.setNames(nexus3, "nexus3");
			NameUtils.setNames(nexus4, "nexus4");
			NameUtils.setNames(rubyBlock, "ruby_block");
			NameUtils.setNames(sapphireBlock, "sapphire_block");

		}
		
		
		
		public void register() {
			

			registerBlock(tableOfAges);
			registerBlock(crusher);
			registerBlock(crusherOn);
			registerBlock(weaponBox);
			registerBlock(nexus);
			registerBlock(nexus2);
			registerBlock(nexus3);
			registerBlock(nexus4);
			registerBlock(rubyBlock);
			registerBlock(sapphireBlock);




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
