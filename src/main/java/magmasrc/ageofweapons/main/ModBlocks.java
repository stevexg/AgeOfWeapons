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
import net.minecraftforge.fml.common.registry.ForgeRegistries;
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
	public static Block witheredIronBlock;
	public static Block rubyOre;
	public static Block sapphireOre;
	public static Block amethystOre;
	public static Block topazOre;
	public static Block amberOre;
	
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
	public static Block barbedWireFence;
	public static Block obstacle;
	
	public static Block neutronBomb;
	public static Block nuclearBomb;
	public static Block spikes;
	public static Block spikesOn;
	public static Block spikesToxic;
	public static Block spikesToxicOn;
	public static Block timeBomb;
	
	
	
	
	
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
			rubyOre = new BlockRubyOre();
			sapphireOre = new BlockSapphireOre();
			amethystOre = new BlockAmethystOre();
			topazOre = new BlockTopazOre();
			amberOre = new BlockAmberOre();
			witheredIronBlock = new BlockWitheredIron();
			
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
			barbedWireFence = new BlockBarbedWireFence();
			obstacle = new BlockObstacle();
			
			neutronBomb = new BlockNeutronBomb();
			nuclearBomb = new BlockNuclearBomb();
			spikes = new BlockSpikes(false);
			spikesOn = new BlockSpikes(true);
			spikesToxic = new BlockSpikesToxic(false);
			spikesToxicOn = new BlockSpikesToxic(true);
			timeBomb = new BlockTimeBomb();

			
			
			
			
			
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
			NameHandler.setNames(witheredIronBlock, "withered_iron_block");
			NameHandler.setNames(rubyOre, "ruby_ore");
			NameHandler.setNames(sapphireOre, "sapphire_ore");
			NameHandler.setNames(amethystOre, "amethyst_ore");
			NameHandler.setNames(topazOre, "topaz_ore");
			NameHandler.setNames(amberOre, "amber_ore");
			
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
			NameHandler.setNames(barbedWireFence, "barbed_wire_fence");
			NameHandler.setNames(obstacle, "obstacle");
			
			NameHandler.setNames(neutronBomb, "neutron_bomb");
			NameHandler.setNames(nuclearBomb, "nuclear_bomb");
			NameHandler.setNames(spikesOn, "spikes_on");
			NameHandler.setNames(spikes, "spikes");
			NameHandler.setNames(spikesToxicOn, "spikes_toxic_on");
			NameHandler.setNames(spikesToxic, "spikes_toxic");
			NameHandler.setNames(timeBomb, "time_bomb");
			

		}
		
		
		
		public void register() {
			

			registerBlock(tableOfAges);
			registerBlock(crusher);
			ForgeRegistries.BLOCKS.register(crusherOn);
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
			registerBlock(witheredIronBlock);
			registerBlock(rubyOre);
			registerBlock(sapphireOre);
			registerBlock(amethystOre);
			registerBlock(topazOre);
			registerBlock(amberOre);
			
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
			registerBlock(barbedWireFence);
			registerBlock(obstacle);
			
			registerBlock(neutronBomb);
			registerBlock(nuclearBomb);
			registerBlock(spikes);
			ForgeRegistries.BLOCKS.register(spikesOn);
			registerBlock(spikesToxic);
			ForgeRegistries.BLOCKS.register(spikesToxicOn);
			registerBlock(timeBomb);

			
			



			GameRegistry.registerTileEntity(TileEntityTableOfAges.class, AgeOfWeapons.MODID+"tableofages");
			GameRegistry.registerTileEntity(TileEntityCrusher.class, AgeOfWeapons.MODID+"crusher");
			NetworkRegistry.INSTANCE.registerGuiHandler(AgeOfWeapons.instance, GuiHandlerRegistry.getInstance());
			GuiHandlerRegistry.getInstance().registerGuiHandler(new GuiHandlerTOA(), GuiHandlerTOA.getGuiID());
			GuiHandlerRegistry.getInstance().registerGuiHandler(new GuiHandlerCrusher(), GuiHandlerCrusher.getGuiID());
		}
		
		
		
		
		
		private static void registerBlock(Block block) {
			ForgeRegistries.BLOCKS.register(block);
			ItemBlock itemblock = new ItemBlock(block);
			itemblock.setRegistryName(block.getRegistryName());
			ForgeRegistries.ITEMS.register(itemblock);
		}
}
