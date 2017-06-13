package magmasrc.ageofweapons.main;

import magmasrc.ageofweapons.items.*;
import magmasrc.ageofweapons.items.antiquity.*;
import magmasrc.ageofweapons.items.earlymodernage.*;
import magmasrc.ageofweapons.items.middleages.*;
import magmasrc.ageofweapons.items.mystic.*;
import magmasrc.ageofweapons.items.stoneage.*;
import magmasrc.ageofweapons.util.NameUtils;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModItems {
	
	/** Armor-Materials **/
	
	public static ArmorMaterial cavemanAM;
	

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
	
	public static ToolMaterial battleAxeWoodTM;
	public static ToolMaterial battleAxeStoneTM;
	public static ToolMaterial battleAxeIronTM;
	public static ToolMaterial battleAxeGoldTM;
	public static ToolMaterial battleAxeDiamondTM;
	public static ToolMaterial flailStoneTM;
	public static ToolMaterial flailIronTM;
	public static ToolMaterial flailGoldTM;
	public static ToolMaterial flailDiamondTM;
	public static ToolMaterial halbertWoodTM;
	public static ToolMaterial halbertStoneTM;
	public static ToolMaterial halbertIronTM;
	public static ToolMaterial halbertGoldTM;
	public static ToolMaterial halbertDiamondTM;
	public static ToolMaterial longswordWoodTM;
	public static ToolMaterial longswordStoneTM;
	public static ToolMaterial longswordIronTM;
	public static ToolMaterial longswordGoldTM;
	public static ToolMaterial longswordDiamondTM;
	public static ToolMaterial spearWoodTM;
	public static ToolMaterial spearStoneTM;
	public static ToolMaterial spearIronTM;
	public static ToolMaterial spearGoldTM;
	public static ToolMaterial spearDiamondTM;
	public static ToolMaterial tridentWoodTM;
	public static ToolMaterial tridentStoneTM;
	public static ToolMaterial tridentIronTM;
	public static ToolMaterial tridentGoldTM;
	public static ToolMaterial tridentDiamondTM;
	public static ToolMaterial waraxeWoodTM;
	public static ToolMaterial waraxeStoneTM;
	public static ToolMaterial waraxeIronTM;
	public static ToolMaterial waraxeGoldTM;
	public static ToolMaterial waraxeDiamondTM;
	public static ToolMaterial warhammerWoodTM;
	public static ToolMaterial warhammerStoneTM;
	public static ToolMaterial warhammerIronTM;
	public static ToolMaterial warhammerGoldTM;
	public static ToolMaterial warhammerDiamondTM;
	
	public static ToolMaterial multiToolWoodTM;
	public static ToolMaterial multiToolStoneTM;
	public static ToolMaterial multiToolIronTM;
	public static ToolMaterial multiToolGoldTM;
	public static ToolMaterial multiToolDiamondTM;
	
	public static ToolMaterial mysticKniveTM;

	
	
	
	
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
	public static Item hammer;
	
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
	public static ItemArmor cavemanHelmet;
	public static ItemArmor cavemanChestplate;
	public static ItemArmor cavemanLeggings;
	public static ItemArmor cavemanBoots;
	
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
	
	// Middle Ages
	public static Item battleAxeWood;
	public static Item battleAxeStone;
	public static Item battleAxeIron;
	public static Item battleAxeGold;
	public static Item battleAxeDiamond;
	public static Item flailStone;
	public static Item flailIron;
	public static Item flailGold;
	public static Item flailDiamond;
	public static Item halbertWood;
	public static Item halbertStone;
	public static Item halbertIron;
	public static Item halbertGold;
	public static Item halbertDiamond;
	public static Item longswordWood;
	public static Item longswordStone;
	public static Item longswordIron;
	public static Item longswordGold;
	public static Item longswordDiamond;
	public static Item spearWood;
	public static Item spearStone;
	public static Item spearIron;
	public static Item spearGold;
	public static Item spearDiamond;
	public static Item tridentWood;
	public static Item tridentStone;
	public static Item tridentIron;
	public static Item tridentGold;
	public static Item tridentDiamond;
	public static Item waraxeWood;
	public static Item waraxeStone;
	public static Item waraxeIron;
	public static Item waraxeGold;
	public static Item waraxeDiamond;
	public static Item warhammerWood;
	public static Item warhammerStone;
	public static Item warhammerIron;
	public static Item warhammerGold;
	public static Item warhammerDiamond;
	public static Item longbow;
	public static Item crossbow;
	
	// Early Modern Age
	public static Item multiToolWood;
	public static Item multiToolStone;
	public static Item multiToolIron;
	public static Item multiToolGold;
	public static Item compoundBow;
	public static Item dynamite;
	public static Item multiToolDiamond;
	public static Item oldAmmo;
	public static Item oldShotgunAmmo;
	public static Item cannonball;
	public static Item pebble;
	public static Item nails;
	public static Item nailsToxic;
	
	// Mystic
	public static Item mysticKnive;
	public static Item pufferfishStick;
	public static Item scepterUnholy;
	public static Item wandAether;
	public static Item wandBasic;
	public static Item wandCurse;
	public static Item wandHoly;
	public static Item wandMaelstrom;
	public static Item wandNether;
	public static Item warhornOffensive;
	public static Item warhornDefensive;

	
	
	
	
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
                                                                     //     harv.lvl, uses, efficy., dmg., enchant.,
		battleAxeWoodTM = EnumHelper.addToolMaterial("battleAxeWood",              0,  150,  2.0F,  6.50F, 15);
		battleAxeStoneTM = EnumHelper.addToolMaterial("battleAxeStone",            1,  230,  4.0F,   7.0F,  5);
		battleAxeIronTM = EnumHelper.addToolMaterial("battleAxeIron",              2,  300,  6.0F,  7.80F, 14);
		battleAxeGoldTM = EnumHelper.addToolMaterial("battleAxeGold",              0,  160, 12.0F,   7.0F, 22);
		battleAxeDiamondTM = EnumHelper.addToolMaterial("battleAxeDiamond",        3,  350,  8.0F,   8.0F, 10);
		flailStoneTM = EnumHelper.addToolMaterial("flailStone",                    1,   30,  1.0F,   7.0F,  5);
		flailIronTM = EnumHelper.addToolMaterial("flailIron",                      2,   50,  1.0F,  7.50F, 14);
		flailGoldTM = EnumHelper.addToolMaterial("flailGold",                      0,   20,  1.0F,   7.0F, 22);
		flailDiamondTM = EnumHelper.addToolMaterial("flailDiamond",                3,   80,  1.0F,   8.0F, 10);
		halbertWoodTM = EnumHelper.addToolMaterial("halbertWood",                  0,  250,  1.0F,  7.50F, 15); 
		halbertStoneTM = EnumHelper.addToolMaterial("halbertStone",                1,  300,  1.0F,   8.0F,  5);
		halbertIronTM = EnumHelper.addToolMaterial("halbertIron",                  2,  350,  1.0F,  8.80F, 14);
		halbertGoldTM = EnumHelper.addToolMaterial("halbertGold",                  0,  280,  1.0F,  2.80F, 22);
		halbertDiamondTM = EnumHelper.addToolMaterial("halbertDiamond",            3,  390,  1.0F,   9.0F, 10);
		longswordWoodTM = EnumHelper.addToolMaterial("longswordWood",              0,  180,  2.0F,  6.50F, 15);
		longswordStoneTM = EnumHelper.addToolMaterial("longswordStone",            1,  250,  4.0F,   7.0F,  5);
		longswordIronTM = EnumHelper.addToolMaterial("longswordIron",              2,  300,  6.0F,  7.50F, 14);
		longswordGoldTM = EnumHelper.addToolMaterial("longswordGold",              0,  190, 12.0F,   7.0F, 22);
		longswordDiamondTM = EnumHelper.addToolMaterial("longswordDiamond",        3,  360,  8.0F,   8.0F, 10);
		spearWoodTM = EnumHelper.addToolMaterial("spearWood",                      0,  135,  2.0F,   4.0F, 15);
		spearStoneTM = EnumHelper.addToolMaterial("spearStone",                    1,  180,  4.0F,   4.5F,  5);
		spearIronTM = EnumHelper.addToolMaterial("spearIron",                      2,  230,  6.0F,   5.0F, 14);
		spearGoldTM = EnumHelper.addToolMaterial("spearGold",                      0,  140, 12.0F,   4.3F, 22);
		spearDiamondTM = EnumHelper.addToolMaterial("spearDiamond",                3,  280,  8.0F,   6.0F, 10);
		tridentWoodTM = EnumHelper.addToolMaterial("tridentWood",                  0,  155,  2.0F,  2.85F, 15);
		tridentStoneTM = EnumHelper.addToolMaterial("tridentStone",                1,  200,  4.0F,  5.30F,  5);
		tridentIronTM = EnumHelper.addToolMaterial("tridentIron",                  2,  250,  6.0F,  6.80F, 14);
		tridentGoldTM = EnumHelper.addToolMaterial("tridentGold",                  0,  165, 12.0F,  5.35F, 22);
		tridentDiamondTM = EnumHelper.addToolMaterial("tridentDiamond",            3,  290,  8.0F,  7.10F, 10);
		waraxeWoodTM = EnumHelper.addToolMaterial("waraxeWood",                    0,  200,  2.0F,   7.0F, 15);
		waraxeStoneTM = EnumHelper.addToolMaterial("waraxeStone",                  1,  300,  4.0F,  8.50F,  5);
		waraxeIronTM = EnumHelper.addToolMaterial("waraxeIron",                    2,  350,  6.0F,   9.0F, 14);
		waraxeGoldTM = EnumHelper.addToolMaterial("waraxeGold",                    0,  215, 12.0F,   8.3F, 22);
		waraxeDiamondTM = EnumHelper.addToolMaterial("waraxeDiamond",              3,  400,  8.0F,   9.5F, 10);
		warhammerWoodTM = EnumHelper.addToolMaterial("warhammerWood",              0,  100,  2.0F,   7.5F, 15);
		warhammerStoneTM = EnumHelper.addToolMaterial("warhammerStone",            1,  150,  4.0F,   8.0F,  5);
		warhammerIronTM = EnumHelper.addToolMaterial("warhammerIron",              2,  200,  6.0F,   8.6F, 14);
		warhammerGoldTM = EnumHelper.addToolMaterial("warhammerGold",              0,  160, 12.0F,   7.8F, 22);
		warhammerDiamondTM = EnumHelper.addToolMaterial("warhammerDiamond",        3,  250,  8.0F,   9.0F, 10);
                                                                     //     harv.lvl, uses, efficy., dmg., enchant.,
		multiToolWoodTM = EnumHelper.addToolMaterial("multiToolWood",              0,  120,  2.0F,   5.0F, 15);
		multiToolStoneTM = EnumHelper.addToolMaterial("multiToolStone",            1,  160,  4.0F,   5.5F,  5);
		multiToolIronTM = EnumHelper.addToolMaterial("multiToolIron",         	   2,  230,  6.0F,   6.0F, 14);
		multiToolGoldTM = EnumHelper.addToolMaterial("multiToolGold",              0,  130, 12.0F,   5.2F, 22);
		multiToolDiamondTM = EnumHelper.addToolMaterial("multiToolDiamond",        3, 1000,  8.0F,   7.0F, 10);
        															//     harv.lvl, uses, efficy., dmg., enchant.,
		mysticKniveTM = EnumHelper.addToolMaterial("mysticKnive",                  3,  250,  1.0F,  6.50F, 40);

		
/** TEMPLATE		
		WoodTM = EnumHelper.addToolMaterial("Wood",                  0,  x,  2.0F,   xF, 15);
		StoneTM = EnumHelper.addToolMaterial("Stone",                1,  x,  4.0F,   xF,  5);
		IronTM = EnumHelper.addToolMaterial("Iron",                  2,  x,  6.0F,   xF, 14);
		GoldTM = EnumHelper.addToolMaterial("Gold",                  0,  x, 12.0F,   xF, 22);
		DiamondTM = EnumHelper.addToolMaterial("Diamond",            3,  x,  8.0F,   xF, 10);
**/   	    
		
		
		
		
		
		/** Armor-Materials **/
																																						/**
		    																					 {1, 3, 2, 1} for leather armor (7 at all)
		    																					 {2, 5, 4, 1} for chain armor (12 at all)
		    																					 {2, 6, 5, 2} for iron armor (15 at all)
		    																					 {2, 5, 3, 1} for gold armor (11 at all)
		    																				   	 {3, 8, 6, 3} for diamond armor (20 at all - do not use more!)
		 																																				**/
		 cavemanAM = EnumHelper.addArmorMaterial("caveman", "ageofweapons:caveman", 10, new int[]{1, 2, 1, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
			
		
		
		
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
		hammer = new ItemHammer();
		
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
		cavemanHelmet = new ItemCavemanArmor(cavemanAM, 1, EntityEquipmentSlot.HEAD); 
		cavemanChestplate = new ItemCavemanArmor(cavemanAM, 1, EntityEquipmentSlot.CHEST);
		cavemanLeggings = new ItemCavemanArmor(cavemanAM, 2, EntityEquipmentSlot.LEGS); 
		cavemanBoots = new ItemCavemanArmor(cavemanAM, 1, EntityEquipmentSlot.FEET); 
		
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

		// Middle Ages
		battleAxeWood = new ItemBattleAxeWood(battleAxeWoodTM);
		battleAxeStone = new ItemBattleAxeStone(battleAxeStoneTM);
		battleAxeIron = new ItemBattleAxeIron(battleAxeIronTM);
		battleAxeGold = new ItemBattleAxeGold(battleAxeGoldTM);
		battleAxeDiamond = new ItemBattleAxeDiamond(battleAxeDiamondTM);
		flailStone = new ItemFlailStone(flailStoneTM);
		flailIron = new ItemFlailIron(flailIronTM);
		flailGold = new ItemFlailGold(flailGoldTM);
		flailDiamond = new ItemFlailDiamond(flailDiamondTM);
		halbertWood = new ItemHalbertWood(halbertWoodTM);
		halbertStone = new ItemHalbertStone(halbertStoneTM);
		halbertIron = new ItemHalbertIron(halbertIronTM);
		halbertGold = new ItemHalbertGold(halbertGoldTM);
		halbertDiamond = new ItemHalbertDiamond(halbertDiamondTM);
		longswordWood = new ItemLongswordWood(longswordWoodTM);
		longswordStone = new ItemLongswordStone(longswordStoneTM);
		longswordIron = new ItemLongswordIron(longswordIronTM);
		longswordGold = new ItemLongswordGold(longswordGoldTM);
		longswordDiamond = new ItemLongswordDiamond(longswordDiamondTM);
		spearWood = new ItemSpearWood(spearWoodTM);
		spearStone = new ItemSpearStone(spearStoneTM);
		spearIron = new ItemSpearIron(spearIronTM);
		spearGold = new ItemSpearGold(spearGoldTM);
		spearDiamond = new ItemSpearDiamond(spearDiamondTM);
		tridentWood = new ItemTridentWood(tridentWoodTM);
		tridentStone = new ItemTridentStone(tridentStoneTM);
		tridentIron = new ItemTridentIron(tridentIronTM);
		tridentGold = new ItemTridentGold(tridentGoldTM);
		tridentDiamond = new ItemTridentDiamond(tridentDiamondTM);
		waraxeWood = new ItemWarAxeWood(waraxeWoodTM);
		waraxeStone = new ItemWarAxeStone(waraxeStoneTM);
		waraxeIron = new ItemWarAxeIron(waraxeIronTM);
		waraxeGold = new ItemWarAxeGold(waraxeGoldTM);
		waraxeDiamond = new ItemWarAxeDiamond(waraxeDiamondTM);
		warhammerWood = new ItemWarHammerWood(warhammerWoodTM);
		warhammerStone = new ItemWarHammerStone(warhammerStoneTM);
		warhammerIron = new ItemWarHammerIron(warhammerIronTM);
		warhammerGold = new ItemWarHammerGold(warhammerGoldTM);
		warhammerDiamond = new ItemWarHammerDiamond(warhammerDiamondTM);
		longbow = new ItemLongbow();
		crossbow = new ItemCrossbow();
		
		// Early Modern Age
		multiToolWood = new ItemMultiToolWood(multiToolWoodTM);
		multiToolStone = new ItemMultiToolStone(multiToolStoneTM);
		multiToolIron = new ItemMultiToolIron(multiToolIronTM);
		multiToolGold = new ItemMultiToolGold(multiToolGoldTM);
		multiToolDiamond = new ItemMultiToolDiamond(multiToolDiamondTM);
		oldAmmo = new ItemOldAmmo();
		oldShotgunAmmo = new ItemOldShotgunAmmo();
		cannonball = new ItemCannonball();
		pebble = new ItemPebble();
		dynamite = new ItemDynamite();
		compoundBow = new ItemCompoundBow();
		nails = new ItemNails();
		nailsToxic = new ItemToxicNails();
		
		// Mystic
		mysticKnive = new ItemMysticKnive(mysticKniveTM);
		pufferfishStick = new ItemPufferfishStick();
		scepterUnholy = new ItemScepterUnholy();
		wandAether = new ItemWandAether();
		wandBasic = new ItemWandBasic();
		wandHoly = new ItemWandHoly();
		wandCurse = new ItemWandCurse();
		wandMaelstrom = new ItemWandMaelstrom();
		wandNether = new ItemWandNether();
		warhornOffensive = new ItemWarhornOffensive();
		warhornDefensive = new ItemWarhornDefensive();
		
		
/** TEMPLATE		
		Wood = new ItemWood(WoodTM);
		Stone = new ItemStone(StoneTM);
		Iron = new ItemIron(IronTM);
		Gold = new ItemGold(GoldTM);
		Diamond = new ItemDiamond(DiamondTM);
**/	
		
		
		
		
		
		
		
		
		
		
		
		
		
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
		NameUtils.setNames(hammer, "hammer");

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
		NameUtils.setNames(cavemanHelmet, "caveman_helmet");
		NameUtils.setNames(cavemanChestplate, "caveman_chestplate");
		NameUtils.setNames(cavemanLeggings, "caveman_leggings");
		NameUtils.setNames(cavemanBoots, "caveman_boots");
		
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
		
		// Middle Ages
		NameUtils.setNames(battleAxeWood, "battle_axe_wood");
		NameUtils.setNames(battleAxeStone, "battle_axe_stone");
		NameUtils.setNames(battleAxeIron, "battle_axe_iron");
		NameUtils.setNames(battleAxeGold, "battle_axe_gold");
		NameUtils.setNames(battleAxeDiamond, "battle_axe_diamond");
		NameUtils.setNames(flailStone, "flail_stone");
		NameUtils.setNames(flailIron, "flail_iron");
		NameUtils.setNames(flailGold, "flail_gold");
		NameUtils.setNames(flailDiamond, "flail_diamond");
		NameUtils.setNames(halbertWood, "halbert_wood");
		NameUtils.setNames(halbertStone, "halbert_stone");
		NameUtils.setNames(halbertIron, "halbert_iron");
		NameUtils.setNames(halbertGold, "halbert_gold");
		NameUtils.setNames(halbertDiamond, "halbert_diamond");
		NameUtils.setNames(longswordWood, "longsword_wood");
		NameUtils.setNames(longswordStone, "longsword_stone");
		NameUtils.setNames(longswordIron, "longsword_iron");
		NameUtils.setNames(longswordGold, "longsword_gold");
		NameUtils.setNames(longswordDiamond, "longsword_diamond");
		NameUtils.setNames(spearWood, "spear_wood");
		NameUtils.setNames(spearStone, "spear_stone");
		NameUtils.setNames(spearIron, "spear_iron");
		NameUtils.setNames(spearGold, "spear_gold");
		NameUtils.setNames(spearDiamond, "spear_diamond");
		NameUtils.setNames(tridentWood, "trident_wood");
		NameUtils.setNames(tridentStone, "trident_stone");
		NameUtils.setNames(tridentIron, "trident_iron");
		NameUtils.setNames(tridentGold, "trident_gold");
		NameUtils.setNames(tridentDiamond, "trident_diamond");
		NameUtils.setNames(waraxeWood, "war_axe_wood");
		NameUtils.setNames(waraxeStone, "war_axe_stone");
		NameUtils.setNames(waraxeIron, "war_axe_iron");
		NameUtils.setNames(waraxeGold, "war_axe_gold");
		NameUtils.setNames(waraxeDiamond, "war_axe_diamond");
		NameUtils.setNames(warhammerWood, "war_hammer_wood");
		NameUtils.setNames(warhammerStone, "war_hammer_stone");
		NameUtils.setNames(warhammerIron, "war_hammer_iron");
		NameUtils.setNames(warhammerGold, "war_hammer_gold");
		NameUtils.setNames(warhammerDiamond, "war_hammer_diamond");
		NameUtils.setNames(longbow, "longbow");
		NameUtils.setNames(crossbow, "crossbow");
		
		// Early Modern Age
		NameUtils.setNames(multiToolWood, "multi_tool_wood");
		NameUtils.setNames(multiToolStone, "multi_tool_stone");
		NameUtils.setNames(multiToolIron, "multi_tool_iron");
		NameUtils.setNames(multiToolGold, "multi_tool_gold");
		NameUtils.setNames(multiToolDiamond, "multi_tool_diamond");
		NameUtils.setNames(oldAmmo, "old_ammo");
		NameUtils.setNames(oldShotgunAmmo, "old_shotgun_ammo");
		NameUtils.setNames(cannonball, "cannonball");
		NameUtils.setNames(pebble, "pebble");
		NameUtils.setNames(dynamite, "dynamite");
		NameUtils.setNames(compoundBow, "compound_bow");
		NameUtils.setNames(nails, "nails");
		NameUtils.setNames(nailsToxic, "nails_toxic");
		
		// Mystic
		NameUtils.setNames(mysticKnive, "mystic_knive");
		NameUtils.setNames(pufferfishStick, "pufferfish_stick");
		NameUtils.setNames(scepterUnholy, "scepter_unholy");
		NameUtils.setNames(wandAether, "wand_aether");
		NameUtils.setNames(wandNether, "wand_nether");
		NameUtils.setNames(wandBasic, "wand_basic");
		NameUtils.setNames(wandCurse, "wand_curse");
		NameUtils.setNames(wandHoly, "wand_holy");
		NameUtils.setNames(wandMaelstrom, "wand_maelstrom");
		NameUtils.setNames(warhornDefensive, "warhorn_defensive");
		NameUtils.setNames(warhornOffensive, "warhorn_offensive");
		

		
		
/**		
		NameUtils.setNames(Wood, "_wood");
		NameUtils.setNames(Stone, "_stone");
		NameUtils.setNames(Iron, "_iron");
		NameUtils.setNames(Gold, "_gold");
		NameUtils.setNames(Diamond, "_diamond");
**/
		
   	    

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
		registerItem(hammer);
		
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
		registerItem(cavemanHelmet);
		registerItem(cavemanChestplate);
		registerItem(cavemanLeggings);
		registerItem(cavemanBoots);
		
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
		
		// MiddleAges
		registerItem(battleAxeWood);
		registerItem(battleAxeStone);
		registerItem(battleAxeIron);
		registerItem(battleAxeGold);
		registerItem(battleAxeDiamond);
		registerItem(flailStone);
		registerItem(flailIron);
		registerItem(flailGold);
		registerItem(flailDiamond);
		registerItem(halbertWood);
		registerItem(halbertStone);
		registerItem(halbertIron);
		registerItem(halbertGold);
		registerItem(halbertDiamond);
		registerItem(longswordWood);
		registerItem(longswordStone);
		registerItem(longswordIron);
		registerItem(longswordGold);
		registerItem(longswordDiamond);
		registerItem(spearWood);
		registerItem(spearStone);
		registerItem(spearIron);
		registerItem(spearGold);
		registerItem(spearDiamond);
		registerItem(tridentWood);
		registerItem(tridentStone);
		registerItem(tridentIron);
		registerItem(tridentGold);
		registerItem(tridentDiamond);
		registerItem(waraxeWood);
		registerItem(waraxeStone);
		registerItem(waraxeIron);
		registerItem(waraxeGold);
		registerItem(waraxeDiamond);
		registerItem(warhammerWood);
		registerItem(warhammerStone);
		registerItem(warhammerIron);
		registerItem(warhammerGold);
		registerItem(warhammerDiamond);
		registerItem(longbow);
		registerItem(crossbow);
		
		// Early Modern Age
		registerItem(multiToolWood);
		registerItem(multiToolStone);
		registerItem(multiToolIron);
		registerItem(multiToolGold);
		registerItem(multiToolDiamond);
		registerItem(dynamite);
		registerItem(compoundBow);
		registerItem(oldAmmo);
		registerItem(oldShotgunAmmo);
		registerItem(cannonball);
		registerItem(pebble);
		registerItem(woodShard);
		registerItem(barrel);
		registerItem(blankGun);
		registerItem(gunHandle);
		registerItem(haftIron);
		registerItem(haftWood);
		registerItem(visor);
		registerItem(nails);
		registerItem(nailsToxic);
		
		// Mystic
		registerItem(mysticKnive);
		registerItem(pufferfishStick);
		registerItem(scepterUnholy);
		registerItem(wandBasic);
		registerItem(wandNether);
		registerItem(wandAether);
		registerItem(wandHoly);
		registerItem(wandCurse);
		registerItem(wandMaelstrom);
		registerItem(warhornDefensive);
		registerItem(warhornOffensive);
		
		
		
/** TEMPLATE		
		registerItem(Wood);
		registerItem(Stone);
		registerItem(Iron);
		registerItem(Gold);
		registerItem(Diamond);
**/		
		
		
	
	}
	
	
	
	
	private void registerItem(Item item) {
		GameRegistry.register(item);
	}

	
}
