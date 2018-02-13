package magmasrc.ageofweapons.main;

import java.util.Iterator;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;


public class ModRecipes {
	
	public ModRecipes() {}
	
		public void register() {

			//wichtige rezepte
			/**
			GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tableOfAges), "zzz", "xyx", "xox", 'x', Blocks.COBBLESTONE, 'o', Blocks.CHEST, 'y', Blocks.CRAFTING_TABLE, 'z', Blocks.STONE_SLAB);
			
			
			
			
			//alternative rezepte
		if(AgeOfWeapons.activateBasicRecipesOnWorkbench) {
			
			GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.rubyBlock), "xxx", "xxx", "xxx", 'x', ModItems.ruby);
			GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.sapphireBlock), "xxx", "xxx", "xxx", 'x', ModItems.sapphire);
			GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.amethystBlock), "xxx", "xxx", "xxx", 'x', ModItems.amethyst);
			GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.topazBlock), "xxx", "xxx", "xxx", 'x', ModItems.topaz);
			GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.amberBlock), "xxx", "xxx", "xxx", 'x', ModItems.amber);
			GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.witheredIronBlock), "xxx", "xxx", "xxx", 'x', ModItems.witheredIronIngot);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ruby, 9), ModBlocks.rubyBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sapphire, 9), ModBlocks.sapphireBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.amethyst, 9), ModBlocks.amethystBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.topaz, 9), ModBlocks.topazBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.amber, 9), ModBlocks.amberBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.witheredIronIngot, 9), ModBlocks.witheredIronBlock);
			GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.crusher), "xxx", "xzx", "xox", 'x', Blocks.COBBLESTONE, 'o', Blocks.FURNACE, 'z', Items.FLINT);
			GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.crusher), "xxx", "xzx", "xox", 'x', Blocks.COBBLESTONE, 'o', Blocks.FURNACE, 'z', ModItems.ironShard);
			GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.tableOfAges), "xxx", "ozo", "oyo", 'x', Blocks.STONE_SLAB, 'o', Blocks.STONE, 'z', Blocks.CRAFTING_TABLE, 'y', Blocks.CHEST);
		
			
			if(AgeOfWeapons.activateWeaponBoxRecipe) {    
			GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.weaponBox), "xxx", "xox", "xxx", 'x', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE), 'o', Items.EMERALD);
		  }
		  if(AgeOfWeapons.activateNexusRecipe) {                                                                                                                   
			  GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.nexus), 0, "v v", "vzv", "xox", 'x', new ItemStack(Blocks.IRON_BLOCK), 'o', new ItemStack(Blocks.WOOL, 1, 11), 'v', Items.IRON_INGOT, 'z', Items.NETHER_STAR );
			  GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.nexus2), 0, "v v", "vzv", "xox", 'x', new ItemStack(Blocks.IRON_BLOCK), 'o', new ItemStack(Blocks.WOOL, 1, 14), 'v', Items.IRON_INGOT, 'z', Items.NETHER_STAR );
			  GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.nexus3), 0, "v v", "vzv", "xox", 'x', new ItemStack(Blocks.IRON_BLOCK), 'o', new ItemStack(Blocks.WOOL, 1, 4), 'v', Items.IRON_INGOT, 'z', Items.NETHER_STAR );
			  GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.nexus4), 0, "v v", "vzv", "xox", 'x', new ItemStack(Blocks.IRON_BLOCK), 'o', new ItemStack(Blocks.WOOL, 1, 13), 'v', Items.IRON_INGOT, 'z', Items.NETHER_STAR );
		  }
		  
		  	
		  	//items
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.axeBladeDiamond), "xx ", "xo ", "   ", 'x', ModItems.diamondShard, 'o', Items.DIAMOND);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.axeBladeGold), "xx ", "xo ", "   ", 'x', ModItems.goldShard, 'o', Items.GOLD_INGOT);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.axeBladeIron), "xx ", "xo ", "   ", 'x', ModItems.ironShard, 'o', Items.IRON_INGOT);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.axeBladeWithered), "xx ", "xo ", "   ", 'x', ModItems.witheredIronShard, 'o', ModItems.witheredIronIngot);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.axeBladeStone), "xx ", "xo ", "   ", 'x', ModItems.stoneShard, 'o', Blocks.COBBLESTONE);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.axeBladeStone), "xx ", "xo ", "   ", 'x', Items.FLINT, 'o', Blocks.COBBLESTONE);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.axeBladeWood), "xx ", "xo ", "   ", 'x', ModItems.woodShard, 'o', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.swordBladeDiamond), " x ", " x ", "   ", 'x', Items.DIAMOND);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.swordBladeGold), " x ", " x ", "   ", 'x', Items.GOLD_INGOT);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.swordBladeIron), " x ", " x ", "   ", 'x', Items.IRON_INGOT);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.swordBladeWithered), " x ", " x ", "   ", 'x', ModItems.witheredIronIngot);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.swordBladeStone), " x ", " x ", "   ", 'x', Blocks.COBBLESTONE);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.swordBladeWood), " x ", " x ", "   ", 'x', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.broadBladeDiamond), "xx ", "xx ", "   ", 'x', ModItems.swordBladeDiamond);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.broadBladeGold), "xx ", "xx ", "   ", 'x', ModItems.swordBladeGold);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.broadBladeIron), "xx ", "xx ", "   ", 'x', ModItems.swordBladeIron);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.broadBladeWithered), "xx ", "xx ", "   ", 'x', ModItems.swordBladeWithered);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.broadBladeStone), "xx ", "xx ", "   ", 'x', ModItems.swordBladeStone);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.broadBladeWood), "xx ", "xx ", "   ", 'x', ModItems.swordBladeWood);
		  GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lumber, 3), new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.ironStick, 4), "   ", " x ", " x ", 'x', Items.IRON_INGOT);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.ironLongstick), "   ", " x ", " x ", 'x', ModItems.ironStick);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.woodLongstick), "   ", " x ", " x ", 'x', Items.STICK);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.swordHandle), "   ", "xxx", " o ", 'x', ModItems.ironShard, 'o', Items.STICK);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.toxin), "ixi", "xox", "ccc", 'x', new ItemStack(Items.FISH, 1, 3), 'o', Items.GLASS_BOTTLE, 'i', Items.ROTTEN_FLESH, 'c', Items.FERMENTED_SPIDER_EYE);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.radioactiveToxin), "xxx", "xox", "xxx", 'x', new ItemStack(Items.FISH, 1, 3), 'o', ModItems.toxin);
		  GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.radioactiveToxin, "xxx", "xox", "xxx", 'x', "uran", 'o', ModItems.toxin));
		  GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.radioactiveToxin, " x ", "xox", " x ", 'x', "uranium", 'o', ModItems.toxin));
		  GameRegistry.addShapelessRecipe(new ItemStack(ModItems.glassShard, 4), new ItemStack(Blocks.GLASS, 1, OreDictionary.WILDCARD_VALUE));
		  GameRegistry.addShapelessRecipe(new ItemStack(ModItems.glassShard, 4), new ItemStack(Blocks.GLASS_PANE, 1, OreDictionary.WILDCARD_VALUE));
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.cloth), "   ", "xxx", "xxx", 'x', Items.STRING);

		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.blankGun), "xxx", "  x", "  x", 'x', Items.IRON_INGOT);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.barrel), "   ", "xxx", "   ", 'x', Items.IRON_INGOT);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.gunHandle), "   ", " x ", "x  ", 'x', Items.IRON_INGOT);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.haftIron), " x ", " xx", " xx", 'x', Items.IRON_INGOT);
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.haftWood), " x ", " xx", " xx", 'x', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.visor), "xxx", "o o", "xxx", 'x', Items.IRON_INGOT, 'o', new ItemStack(Blocks.GLASS_PANE, 1, 3));
		  
		  GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woodShard, 3), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
		  GameRegistry.addShapelessRecipe(new ItemStack(ModItems.stoneShard, 3), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.COBBLESTONE, 1, OreDictionary.WILDCARD_VALUE));
		  GameRegistry.addShapelessRecipe(new ItemStack(ModItems.stoneShard, 3), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.STONE, 1, OreDictionary.WILDCARD_VALUE));
		  GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironShard, 3), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), Items.IRON_INGOT);
		  GameRegistry.addShapelessRecipe(new ItemStack(ModItems.goldShard, 3), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), Items.GOLD_INGOT);
		  GameRegistry.addShapelessRecipe(new ItemStack(ModItems.emeraldShard, 3), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), Items.EMERALD);
		  GameRegistry.addShapelessRecipe(new ItemStack(ModItems.diamondShard, 3), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), Items.DIAMOND);
		  GameRegistry.addShapelessRecipe(new ItemStack(ModItems.glassShard, 4), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.GLASS, 1, OreDictionary.WILDCARD_VALUE));
		  GameRegistry.addShapelessRecipe(new ItemStack(ModItems.glassShard, 4), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.GLASS_PANE, 1, OreDictionary.WILDCARD_VALUE));
		  GameRegistry.addShapelessRecipe(new ItemStack(ModItems.amethystShard, 3), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), ModItems.amethyst);
		  GameRegistry.addShapelessRecipe(new ItemStack(ModItems.rubyShard, 3), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), ModItems.ruby);
		  GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sapphireShard, 3), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), ModItems.sapphire);
		  GameRegistry.addShapelessRecipe(new ItemStack(ModItems.topazShard, 3), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), ModItems.topaz);
		  GameRegistry.addShapelessRecipe(new ItemStack(ModItems.witheredIronShard, 3), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), ModItems.witheredIronIngot);
		  GameRegistry.addShapelessRecipe(new ItemStack(ModItems.witherDust, 8), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.SKULL, 1, 1));
		  
		  GameRegistry.addShapedRecipe(new ItemStack(ModItems.hammer), " x ", " o ", " ", 'x', Blocks.STONE, 'o', Items.STICK);
		}
		**/
	}	
	 
		
		
		
		
		
		
		public void unregister() {
		/**	
		  if (AgeOfWeapons.activateHardcoreMode) {
			Iterator<IRecipe> it = CraftingManager.getInstance().getRecipeList().iterator();
			
			while(it.hasNext()) {
				IRecipe recipe = it.next();
				ItemStack output = recipe.getRecipeOutput();
				if(output != null && output.getItem() != null) {
					
					
					if(output.isItemEqual(new ItemStack(Items.WOODEN_AXE))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.WOODEN_SHOVEL))) {
						it.remove();
					}	
					if(output.isItemEqual(new ItemStack(Items.WOODEN_SWORD))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.WOODEN_HOE))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.WOODEN_PICKAXE))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.STONE_AXE))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.STONE_SHOVEL))) {
						it.remove();
					}	
					if(output.isItemEqual(new ItemStack(Items.STONE_SWORD))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.STONE_HOE))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.STONE_PICKAXE))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.GOLDEN_AXE))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.GOLDEN_SHOVEL))) {
						it.remove();
					}	
					if(output.isItemEqual(new ItemStack(Items.GOLDEN_SWORD))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.GOLDEN_HOE))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.GOLDEN_PICKAXE))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.DIAMOND_AXE))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.DIAMOND_SHOVEL))) {
						it.remove();
					}	
					if(output.isItemEqual(new ItemStack(Items.DIAMOND_SWORD))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.DIAMOND_HOE))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.DIAMOND_PICKAXE))) {
						it.remove();
					}
					
					if(output.isItemEqual(new ItemStack(Items.DIAMOND_BOOTS))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.DIAMOND_CHESTPLATE))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.DIAMOND_HELMET))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.DIAMOND_LEGGINGS))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.LEATHER_BOOTS))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.LEATHER_CHESTPLATE))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.LEATHER_HELMET))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.LEATHER_LEGGINGS))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.GOLDEN_BOOTS))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.GOLDEN_CHESTPLATE))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.GOLDEN_HELMET))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.GOLDEN_LEGGINGS))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.IRON_BOOTS))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.IRON_CHESTPLATE))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.IRON_HELMET))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.IRON_LEGGINGS))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.CHAINMAIL_BOOTS))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.CHAINMAIL_CHESTPLATE))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.CHAINMAIL_HELMET))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.CHAINMAIL_LEGGINGS))) {
						it.remove();
					}
					
					if(output.isItemEqual(new ItemStack(Items.BOW))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.FLINT_AND_STEEL))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.FISHING_ROD))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.SHIELD))) {
						it.remove();
					}
					if(output.isItemEqual(new ItemStack(Items.SHEARS))) {
						it.remove();
					}
					
				}
			 }
		   }
		   **/
		}
		
}