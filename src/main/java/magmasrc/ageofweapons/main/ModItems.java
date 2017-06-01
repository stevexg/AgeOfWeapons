package magmasrc.ageofweapons.main;

import magmasrc.ageofweapons.items.*;
import magmasrc.ageofweapons.items.antiquity.*;
import magmasrc.ageofweapons.items.stoneage.*;
import magmasrc.ageofweapons.util.NameUtils;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModItems {
	
	
	/** Tool-Materials **/
	
	public static ToolMaterial rockTM;
	public static ToolMaterial handAxStoneTM;
	public static ToolMaterial cavemanKniveStoneTM;
	public static ToolMaterial cavemanKniveBoneTM;
	public static ToolMaterial woodCudgelTM;
	public static ToolMaterial stoneCudgelTM;
	public static ToolMaterial axTM;
	
	public static ToolMaterial kniveWoodTM;
	public static ToolMaterial kniveStoneTM;
	public static ToolMaterial kniveIronTM;
	public static ToolMaterial kniveGoldTM;
	public static ToolMaterial kniveDiamondTM;
	public static ToolMaterial daggerWoodTM;
	public static ToolMaterial daggerStoneTM;
	public static ToolMaterial daggerIronTM;
	public static ToolMaterial daggerGoldTM;
	public static ToolMaterial daggerDiamondTM;
	public static ToolMaterial skewerWoodTM;
	public static ToolMaterial skewerStoneTM;
	public static ToolMaterial skewerIronTM;
	public static ToolMaterial skewerGoldTM;
	public static ToolMaterial skewerDiamondTM;
	
	
	
	
	/** Items **/
	
	public static Item upgradeCreative;
	public static Item upgradeStoneAge;
	public static Item upgradeAtiquity;
	public static Item upgradeMystic;
	public static Item upgradeMiddleAges;
	public static Item upgradeEdoPeriod;
	public static Item upgradePiracy;
	public static Item upgradeEarlyModernAge;
	public static Item upgradeFantasy;
	public static Item upgradeModernAge;
	public static Item upgradeEpic;
	public static Item upgradeFuture;
	public static Item upgradeBBY;
	
	public static Item axeBladeDiamond;
	public static Item axeBladeGold;
	public static Item axeBladeIron;
	public static Item axeBladeStone;
	public static Item axeBladeWood;
	public static Item swordBladeDiamond;
	public static Item swordBladeGold;
	public static Item swordBladeIron;
	public static Item swordBladeStone;
	public static Item swordBladeWood;
	public static Item broadBladeDiamond;
	public static Item broadBladeGold;
	public static Item broadBladeIron;
	public static Item broadBladeStone;
	public static Item broadBladeWood;
	public static Item swordHandle;
	public static Item lumber;
	public static Item ironStick;
	public static Item ironLongstick;
	public static Item woodLongstick;
	public static Item toxin;
	public static Item radioactiveToxin;
	public static Item ruby;
	public static Item sapphire;
	public static Item diamondShard;
	public static Item emeraldShard;
	public static Item goldShard;
	public static Item ironShard;
	public static Item rubyShard;
	public static Item sapphireShard;
	public static Item stoneShard;
	public static Item woodShard;
	public static Item barrel;
	public static Item blankGun;
	public static Item gunHandle;
	public static Item haftIron;
	public static Item haftWood;
	public static Item visor;
	public static Item amethyst;
	public static Item amber;
	public static Item topaz;
	public static Item amethystShard;
	public static Item topazShard;
	public static Item glassShard;
	
	// Stone Age
	public static Item rock;
	public static Item handAxStone;
	public static Item cavemanKniveStone;
	public static Item cavemanKniveBone;
	public static Item woodCudgel;
	public static Item stoneCudgel;
	public static Item ax;
	public static Item throwWood;
	public static Item cavemanSpear;
	
	// Antiquity
	public static Item kniveWood;
	public static Item kniveStone;
	public static Item kniveIron;
	public static Item kniveGold;
	public static Item kniveDiamond;
	public static Item daggerWood;
	public static Item daggerStone;
	public static Item daggerIron;
	public static Item daggerGold;
	public static Item daggerDiamond;
	public static Item skewerWood;
	public static Item skewerStone;
	public static Item skewerIron;
	public static Item skewerGold;
	public static Item skewerDiamond;
	public static Item recurveBow;
	
	  //TODO: Zukünftige Items so formatieren=         <GEGENSTAND><MATERIAL>     (example: swordIron, "sword_iron")
	  //
	  // ist übersichtlicher in den ordnern
	
		
		


	

	public void init() {
		
		
		    /** Tool-Materials **/   
		                                      																    	/**
																			Default Materials!
																	WOOD          (0,   59,  2.0F,  0.0F,  15),
																	STONE         (1,  131,  4.0F,  1.0F,  5),
																	IRON          (2,  250,  6.0F,  2.0F,  14),
																	GOLD          (0,   32, 12.0F,  0.0F,  22);
																	DIAMOND       (3, 1561,  8.0F,  3.0F,  10),     **/															
		                                                           //     harv.lvl, uses, efficy., dmg., enchant.,
   	    rockTM = EnumHelper.addToolMaterial ("rock",                               0,  500,  0.0F,  4.0F,  0);
		handAxStoneTM = EnumHelper.addToolMaterial("handAxStone",                  0,  400,  1.0F,  4.5F,  0);
		cavemanKniveStoneTM = EnumHelper.addToolMaterial("cavemanKniveStone",      0,  100,  1.0F,  5.0F,  0);
		cavemanKniveBoneTM = EnumHelper.addToolMaterial("cavemanKniveBone",        0,   80,  1.0F,  5.0F,  0);
		woodCudgelTM = EnumHelper.addToolMaterial("woodCudgel",                    0,  150,  1.0F,  5.0F,  0);
		stoneCudgelTM = EnumHelper.addToolMaterial("stoneCudgel",                  1,  200,  1.0F,  6.0F,  0);
		axTM = EnumHelper.addToolMaterial("ax",                                    1,  500,  3.0F, 5.10F,  3);
		
		kniveWoodTM = EnumHelper.addToolMaterial("kniveWood",                      0,   50,  1.0F,  4.5F,  15);
		kniveStoneTM = EnumHelper.addToolMaterial("kniveStone",                    1,   80,  1.0F,  5.0F,  5);
		kniveIronTM = EnumHelper.addToolMaterial("kniveIron",                      2,  120,  1.0F,  6.0F,  14);
		kniveGoldTM = EnumHelper.addToolMaterial("kniveGold",                      0,   60,  1.0F,  4.70F, 22);
		kniveDiamondTM = EnumHelper.addToolMaterial("kniveDiamond",                3,  200,  1.0F,  6.50F, 10);
		daggerWoodTM = EnumHelper.addToolMaterial("daggerWood",                    0,   80,  1.0F,  5.0F,  15);
		daggerStoneTM = EnumHelper.addToolMaterial("daggerStone",                  1,  100,  1.0F,  5.5F,  5);
		daggerIronTM = EnumHelper.addToolMaterial("daggerIron",                    2,  150,  1.0F,  6.0F,  14);
		daggerGoldTM = EnumHelper.addToolMaterial("daggerGold",                    0,   90,  1.0F,  5.5F,  22);
		daggerDiamondTM = EnumHelper.addToolMaterial("daggerDiamond",              3,  210,  1.0F,  6.80F, 10);	
		skewerWoodTM = EnumHelper.addToolMaterial("skewerWood",                    0,  100,  1.0F,  4.5F,  15);
		skewerStoneTM = EnumHelper.addToolMaterial("skewerStone",                  1,  150,  1.0F,  5.0F,  5);
		skewerIronTM = EnumHelper.addToolMaterial("skewerIron",                    2,  250,  1.0F,  6.0F,  14);
		skewerGoldTM = EnumHelper.addToolMaterial("skewerGold",                    0,  120,  1.0F,  4.70F, 22);
		skewerDiamondTM = EnumHelper.addToolMaterial("skewerDiamond",              3,  330,  1.0F,  6.80F, 10);

   	    
   	    
		
		
		
		
   	    /** Items **/
		
		upgradeCreative = new ItemUpgradeCreative();
		upgradeStoneAge = new ItemUpgradeStoneAge();
		upgradeAtiquity = new ItemUpgradeAntiquity();
		upgradeMystic = new ItemUpgradeMystic();
		upgradeMiddleAges = new ItemUpgradeMiddleAges();
		upgradeEdoPeriod = new ItemUpgradeEdoPeriod();
		upgradePiracy = new ItemUpgradePiracy();
		upgradeEarlyModernAge = new ItemUpgradeEarlyModernAge();
		upgradeFantasy = new ItemUpgradeFantasy();
		upgradeModernAge = new ItemUpgradeModernAge();
		upgradeEpic = new ItemUpgradeEpic();
		upgradeFuture = new ItemUpgradeFuture();
		upgradeBBY = new ItemUpgradeBBY();
		
		axeBladeDiamond = new ItemAxeBladeDiamond();
		axeBladeGold = new ItemAxeBladeGold();
		axeBladeIron = new ItemAxeBladeIron();
		axeBladeStone = new ItemAxeBladeStone();
		axeBladeWood = new ItemAxeBladeWood();
		swordBladeDiamond = new ItemSwordBladeDiamond();
		swordBladeGold = new ItemSwordBladeGold();
		swordBladeIron = new ItemSwordBladeIron();
		swordBladeStone = new ItemSwordBladeStone();
		swordBladeWood = new ItemSwordBladeWood();
		broadBladeDiamond = new ItemBroadBladeDiamond();
		broadBladeGold = new ItemBroadBladeGold();
		broadBladeIron = new ItemBroadBladeIron();
		broadBladeStone = new ItemBroadBladeStone();
		broadBladeWood = new ItemBroadBladeWood();
		ironStick = new ItemIronStick();
		ironLongstick = new ItemIronLongstick();
		woodLongstick = new ItemWoodLongstick();
		lumber = new ItemLumber();
		radioactiveToxin = new ItemRadioactiveToxin();
		ruby = new ItemRuby();
		sapphire = new ItemSapphire();
		swordHandle = new ItemSwordHandle();
		toxin = new ItemToxin();
		diamondShard = new ItemDiamondShard();
		emeraldShard = new ItemEmeraldShard();
		goldShard = new ItemGoldShard();
		ironShard = new ItemIronShard();
		rubyShard = new ItemRubyShard();
		sapphireShard = new ItemSapphireShard();
		stoneShard = new ItemStoneShard();
		woodShard = new ItemWoodShard();
		barrel = new ItemBarrel();
		blankGun = new ItemBlankGun();
		gunHandle = new ItemGunHandle();
		haftIron = new ItemHaftIron();
		haftWood = new ItemHaftWood();
		visor = new ItemVisor();
		amethyst = new ItemAmethyst();
		amber = new ItemAmber();
		topaz = new ItemTopaz();
		amethystShard = new ItemAmethystShard();
		topazShard = new ItemTopazShard();
		glassShard = new ItemGlassShard();
		
		// Stone Age
		rock = new ItemRock(rockTM);
		handAxStone = new ItemHandAxStone(handAxStoneTM);
		cavemanKniveStone = new ItemCavemanKniveStone(cavemanKniveStoneTM);
		cavemanKniveBone = new ItemCavemanKniveStone(cavemanKniveBoneTM);
		woodCudgel = new ItemWoodCudgel(woodCudgelTM);
		stoneCudgel = new ItemStoneCudgel(stoneCudgelTM);
		ax = new ItemAx(axTM);
		throwWood = new ItemThrowWood();
		cavemanSpear = new ItemCavemanSpear();
		
		// Antiquity
		
		kniveWood = new ItemKniveWood(kniveWoodTM);
		kniveStone = new ItemKniveStone(kniveStoneTM);
		kniveIron = new ItemKniveIron(kniveIronTM);
		kniveGold = new ItemKniveGold(kniveGoldTM);
		kniveDiamond = new ItemKniveDiamond(kniveDiamondTM);
		daggerWood = new ItemDaggerWood(daggerWoodTM);
		daggerStone = new ItemDaggerStone(daggerStoneTM);
		daggerIron = new ItemDaggerIron(daggerIronTM);
		daggerGold = new ItemDaggerGold(daggerGoldTM);
		daggerDiamond = new ItemDaggerDiamond(daggerDiamondTM);
		skewerWood = new ItemSkewerWood(skewerWoodTM);
		skewerStone = new ItemSkewerStone(skewerStoneTM);
		skewerIron = new ItemSkewerIron(skewerIronTM);
		skewerGold = new ItemSkewerGold(skewerGoldTM);
		skewerDiamond = new ItemSkewerDiamond(skewerDiamondTM);
		recurveBow = new ItemRecurveBow();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		NameUtils.setNames(upgradeCreative, "upgrade_creative");
		NameUtils.setNames(upgradeStoneAge, "upgrade_stone_age");
		NameUtils.setNames(upgradeAtiquity, "upgrade_antiquity");
		NameUtils.setNames(upgradeMystic, "upgrade_mystic");
		NameUtils.setNames(upgradeMiddleAges, "upgrade_middle_ages");
		NameUtils.setNames(upgradeEdoPeriod, "upgrade_edo_period");
		NameUtils.setNames(upgradePiracy, "upgrade_piracy");
		NameUtils.setNames(upgradeEarlyModernAge, "upgrade_early_modern_age");
		NameUtils.setNames(upgradeFantasy, "upgrade_fantasy");
		NameUtils.setNames(upgradeEpic, "upgrade_epic");
		NameUtils.setNames(upgradeModernAge, "upgrade_modern_age");
		NameUtils.setNames(upgradeFuture, "upgrade_future");
		NameUtils.setNames(upgradeBBY, "upgrade_bby");
		
		NameUtils.setNames(axeBladeDiamond, "axe_blade_diamond");
		NameUtils.setNames(axeBladeGold, "axe_blade_gold");
		NameUtils.setNames(axeBladeIron, "axe_blade_iron");
		NameUtils.setNames(axeBladeStone, "axe_blade_stone");
		NameUtils.setNames(axeBladeWood, "axe_blade_wood");
		NameUtils.setNames(swordBladeDiamond, "sword_blade_diamond");
		NameUtils.setNames(swordBladeGold, "sword_blade_gold");
		NameUtils.setNames(swordBladeIron, "sword_blade_iron");
		NameUtils.setNames(swordBladeStone, "sword_blade_stone");
		NameUtils.setNames(swordBladeWood, "sword_blade_wood");
		NameUtils.setNames(broadBladeDiamond, "broad_blade_diamond");
		NameUtils.setNames(broadBladeGold, "broad_blade_gold");
		NameUtils.setNames(broadBladeIron, "broad_blade_iron");
		NameUtils.setNames(broadBladeStone, "broad_blade_stone");
		NameUtils.setNames(broadBladeWood, "broad_blade_wood");
		NameUtils.setNames(ironStick, "iron_stick");
		NameUtils.setNames(ironLongstick, "iron_longstick");
		NameUtils.setNames(woodLongstick, "wood_longstick");
		NameUtils.setNames(lumber, "lumber");
		NameUtils.setNames(radioactiveToxin, "radioactive_toxin");
		NameUtils.setNames(ruby, "ruby");
		NameUtils.setNames(sapphire, "sapphire");
		NameUtils.setNames(swordHandle, "sword_handle");
		NameUtils.setNames(toxin, "toxin");
		NameUtils.setNames(diamondShard, "diamond_shard");
		NameUtils.setNames(emeraldShard, "emerald_shard");
		NameUtils.setNames(goldShard, "gold_shard");
		NameUtils.setNames(ironShard, "iron_shard");
		NameUtils.setNames(rubyShard, "ruby_shard");
		NameUtils.setNames(sapphireShard, "sapphire_shard");
		NameUtils.setNames(stoneShard, "stone_shard");
		NameUtils.setNames(woodShard, "wood_shard");
		NameUtils.setNames(barrel, "barrel");
		NameUtils.setNames(gunHandle, "gun_handle");   
		NameUtils.setNames(blankGun, "blank_gun");
		NameUtils.setNames(haftIron, "haft_iron");
		NameUtils.setNames(haftWood, "haft_wood");
		NameUtils.setNames(visor, "visor");
		NameUtils.setNames(amber, "amber");
		NameUtils.setNames(amethyst, "amethyst");
		NameUtils.setNames(topaz, "topaz");
		NameUtils.setNames(amethystShard, "amethyst_shard");
		NameUtils.setNames(topazShard, "topaz_shard");
		NameUtils.setNames(glassShard, "glass_shard");

		// Stone Age
		NameUtils.setNames(rock, "rock");
		NameUtils.setNames(handAxStone, "hand_ax_stone");
		NameUtils.setNames(cavemanKniveStone, "caveman_knive_stone");
		NameUtils.setNames(cavemanKniveBone, "caveman_knive_bone");
		NameUtils.setNames(woodCudgel, "wood_cudgel");
		NameUtils.setNames(stoneCudgel, "stone_cudgel");
		NameUtils.setNames(ax, "ax");
		NameUtils.setNames(throwWood, "throw_wood");
		NameUtils.setNames(cavemanSpear, "caveman_spear");
		
		// Antiquity
		NameUtils.setNames(kniveWood, "knive_wood");
		NameUtils.setNames(kniveStone, "knive_stone");
		NameUtils.setNames(kniveIron, "knive_iron");
		NameUtils.setNames(kniveGold, "knive_gold");
		NameUtils.setNames(kniveDiamond, "knive_diamond");
		NameUtils.setNames(daggerWood, "dagger_wood");
		NameUtils.setNames(daggerStone, "dagger_stone");
		NameUtils.setNames(daggerIron, "dagger_iron");
		NameUtils.setNames(daggerGold, "dagger_gold");
		NameUtils.setNames(daggerDiamond, "dagger_diamond");
		NameUtils.setNames(skewerWood, "skewer_wood");
		NameUtils.setNames(skewerStone, "skewer_stone");
		NameUtils.setNames(skewerIron, "skewer_iron");
		NameUtils.setNames(skewerGold, "skewer_gold");
		NameUtils.setNames(skewerDiamond, "skewer_diamond");
		NameUtils.setNames(recurveBow, "recurve_bow");


		
   	    

	}
	

	
	
	public void register() {
		

		registerItem(upgradeCreative);
		registerItem(upgradeStoneAge);
		registerItem(upgradeAtiquity);
		registerItem(upgradeMystic);
		registerItem(upgradeMiddleAges);
		registerItem(upgradeEdoPeriod);
		registerItem(upgradePiracy);
		registerItem(upgradeEarlyModernAge);
		registerItem(upgradeFantasy);
		registerItem(upgradeModernAge);
		registerItem(upgradeEpic);
		registerItem(upgradeFuture);
		registerItem(upgradeBBY);
		
		registerItem(axeBladeDiamond);
		registerItem(axeBladeGold);
		registerItem(axeBladeIron);
		registerItem(axeBladeStone);
		registerItem(axeBladeWood);
		registerItem(swordBladeDiamond);
		registerItem(swordBladeGold);
		registerItem(swordBladeIron);
		registerItem(swordBladeStone);
		registerItem(swordBladeWood);
		registerItem(broadBladeDiamond);
		registerItem(broadBladeGold);
		registerItem(broadBladeIron);
		registerItem(broadBladeStone);
		registerItem(broadBladeWood);
		registerItem(swordHandle);
		registerItem(ironStick);
		registerItem(ironLongstick);
		registerItem(woodLongstick);
		registerItem(lumber);
		registerItem(ruby);
		registerItem(sapphire);
		registerItem(amethyst);
		registerItem(topaz);
		registerItem(amber);
		registerItem(toxin);
		registerItem(radioactiveToxin);
		registerItem(diamondShard);
		registerItem(emeraldShard);
		registerItem(rubyShard);
		registerItem(sapphireShard);
		registerItem(amethystShard);
		registerItem(topazShard);
		registerItem(goldShard);
		registerItem(ironShard);
		registerItem(stoneShard);
		registerItem(glassShard);
		registerItem(woodShard);
		registerItem(barrel);
		registerItem(blankGun);
		registerItem(gunHandle);
		registerItem(haftIron);
		registerItem(haftWood);
		registerItem(visor);
		
		// Stone Age
		registerItem(rock);
		registerItem(handAxStone);
		registerItem(cavemanKniveStone);
		registerItem(cavemanKniveBone);
		registerItem(woodCudgel);
		registerItem(stoneCudgel);
		registerItem(ax);
		registerItem(throwWood);
		registerItem(cavemanSpear);
		
		// Antiquity
		registerItem(kniveWood);
		registerItem(kniveStone);
		registerItem(kniveIron);
		registerItem(kniveGold);
		registerItem(kniveDiamond);
		registerItem(daggerWood);
		registerItem(daggerStone);
		registerItem(daggerIron);
		registerItem(daggerGold);
		registerItem(daggerDiamond);
		registerItem(skewerWood);
		registerItem(skewerStone);
		registerItem(skewerIron);
		registerItem(skewerGold);
		registerItem(skewerDiamond);
		registerItem(recurveBow);
		
		
		
	
	}
	
	
	
	
	private void registerItem(Item item) {
		GameRegistry.register(item);
	}

	
}
