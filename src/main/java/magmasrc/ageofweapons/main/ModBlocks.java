package magmasrc.ageofweapons.main;

import magmasrc.ageofweapons.blocks.*;
import magmasrc.ageofweapons.tileentitys.TileEntityCrusher;
import magmasrc.ageofweapons.tileentitys.TileEntityTableOfAges;
import magmasrc.ageofweapons.util.GuiHandlerCrusher;
import magmasrc.ageofweapons.util.GuiHandlerRegistry;
import magmasrc.ageofweapons.util.GuiHandlerTOA;
import magmasrc.ageofweapons.util.NameHandler;
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
	public static Block amethystBlock;
	public static Block topazBlock;
	public static Block amberBlock;
	
	public static Block barbedWire;
	public static Block nailTrap;
	public static Block toxicNailTrap;
	public static Block explosiveMine;
	public static Block toxicMine;
	public static Block razorWire;
	public static Block fallTrapStone;
	public static Block fallTrapDirt;
	public static Block fallTrapPlanks;
	public static Block bearTrap;
	
	public static Block neutronBomb;
	public static Block nuclearBomb;
	
	
	
	
	
		public void init() {
		
			tableOfAges = new BlockTableOfAges();
			crusher = new BlockCrusher(false);
			crusherOn = new BlockCrusher(true);
			weaponBox = new BlockWeaponBox();
			nexus = new BlockNexus();
			nexus2 = new BlockNexus2();
			nexus3 = new BlockNexus3();
			nexus4 = new BlockNexus4();
			rubyBlock = new BlockRuby();
			sapphireBlock = new BlockSapphire();
			amethystBlock = new BlockAmethyst();
			topazBlock = new BlockTopaz();
			amberBlock = new BlockAmber();
			
			barbedWire = new BlockBarbedWire();
			nailTrap = new BlockNailTrap();
			toxicNailTrap = new BlockToxicNailTrap();
			explosiveMine = new BlockExplosiveMine();
			toxicMine = new BlockToxicMine();
			razorWire = new BlockRazorWire();
			fallTrapDirt = new BlockFallTrapDirt();
			fallTrapPlanks = new BlockFallTrapPlanks();
			fallTrapStone = new BlockFallTrapStone();
			bearTrap = new BlockBearTrap();
			
			neutronBomb = new BlockNeutronBomb();
			nuclearBomb = new BlockNuclearBomb();
			
			
			
			
			
			NameHandler.setNames(tableOfAges,"table_of_ages");
			NameHandler.setNames(crusher, "crusher");
			NameHandler.setNames(crusherOn, "crusher_on");
			NameHandler.setNames(weaponBox, "weapon_box");
			NameHandler.setNames(nexus, "nexus");
			NameHandler.setNames(nexus2, "nexus2");
			NameHandler.setNames(nexus3, "nexus3");
			NameHandler.setNames(nexus4, "nexus4");
			NameHandler.setNames(rubyBlock, "ruby_block");
			NameHandler.setNames(sapphireBlock, "sapphire_block");
			NameHandler.setNames(amethystBlock, "amethyst_block");
			NameHandler.setNames(topazBlock, "topaz_block");
			NameHandler.setNames(amberBlock, "amber_block");
			
			NameHandler.setNames(barbedWire, "barbed_wire");
			NameHandler.setNames(nailTrap, "nail_trap");
			NameHandler.setNames(toxicNailTrap, "toxic_nail_trap");
			NameHandler.setNames(explosiveMine, "explosive_mine");
			NameHandler.setNames(toxicMine, "toxic_mine");
			NameHandler.setNames(razorWire, "razor_wire");
			NameHandler.setNames(fallTrapDirt, "fall_trap_dirt");
			NameHandler.setNames(fallTrapPlanks, "fall_trap_planks");
			NameHandler.setNames(fallTrapStone, "fall_trap_stone");
			NameHandler.setNames(bearTrap, "bear_trap");
			
			NameHandler.setNames(neutronBomb, "neutron_bomb");
			NameHandler.setNames(nuclearBomb, "nuclear_bomb");

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
			registerBlock(amethystBlock);
			registerBlock(topazBlock);
			registerBlock(amberBlock);
			
			registerBlock(barbedWire);
			registerBlock(razorWire);
			registerBlock(nailTrap);
			registerBlock(toxicNailTrap);
			registerBlock(explosiveMine);
			registerBlock(toxicMine);
			registerBlock(bearTrap);
			registerBlock(fallTrapDirt);
			registerBlock(fallTrapPlanks);
			registerBlock(fallTrapStone);
			
			registerBlock(neutronBomb);
			registerBlock(nuclearBomb);
			
			



			GameRegistry.registerTileEntity(TileEntityTableOfAges.class, AgeOfWeapons.MODID+"tableofages");
			GameRegistry.registerTileEntity(TileEntityCrusher.class, AgeOfWeapons.MODID+"crusher");
			NetworkRegistry.INSTANCE.registerGuiHandler(AgeOfWeapons.instance, GuiHandlerRegistry.getInstance());
			GuiHandlerRegistry.getInstance().registerGuiHandler(new GuiHandlerTOA(), GuiHandlerTOA.getGuiID());
			GuiHandlerRegistry.getInstance().registerGuiHandler(new GuiHandlerCrusher(), GuiHandlerCrusher.getGuiID());
		}
		
		
		
		
		private void registerBlock(Block block) {
			GameRegistry.register(block);
			ItemBlock itemblock = new ItemBlock(block);
			itemblock.setUnlocalizedName(block.getUnlocalizedName()).setRegistryName(block.getRegistryName());
			GameRegistry.register(itemblock);
		}
}
