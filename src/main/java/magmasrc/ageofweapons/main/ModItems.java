package magmasrc.ageofweapons.main;

import magmasrc.ageofweapons.items.*;
import magmasrc.ageofweapons.items.antiquity.*;
import magmasrc.ageofweapons.items.earlymodernage.*;
import magmasrc.ageofweapons.items.edoperiod.*;
import magmasrc.ageofweapons.items.epic.*;
import magmasrc.ageofweapons.items.fantasy.*;
import magmasrc.ageofweapons.items.future.*;
import magmasrc.ageofweapons.items.middleages.*;
import magmasrc.ageofweapons.items.modernage.*;
import magmasrc.ageofweapons.items.mystic.*;
import magmasrc.ageofweapons.items.piracy.*;
import magmasrc.ageofweapons.items.stoneage.*;
import magmasrc.ageofweapons.util.NameHandler;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModItems {
	
	/** Armor-Materials **/
	
	public static ArmorMaterial cavemanAM;
	public static ArmorMaterial assassinAM;
	public static ArmorMaterial ninjaAM;
	public static ArmorMaterial nightVisionGogglesAM;
	public static ArmorMaterial masterAM;
	public static ArmorMaterial soldierAM;
	public static ArmorMaterial modernSoldierAM;
	public static ArmorMaterial futureSoldierAM;
	

	/** Tool-Materials **/
	
	public static ToolMaterial rockTM;
	public static ToolMaterial handAxStoneTM;
	public static ToolMaterial cavemanKniveStoneTM;
	public static ToolMaterial cavemanKniveBoneTM;
	public static ToolMaterial cavemanSpearTM;
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
	public static ToolMaterial scytheWoodTM;
	public static ToolMaterial scytheStoneTM;
	public static ToolMaterial scytheIronTM;
	public static ToolMaterial scytheGoldTM;
	public static ToolMaterial scytheDiamondTM;
	public static ToolMaterial lanceWoodTM;
	public static ToolMaterial lanceStoneTM;
	public static ToolMaterial lanceIronTM;
	public static ToolMaterial lanceGoldTM;
	public static ToolMaterial lanceDiamondTM;
	public static ToolMaterial heavyStaffWoodTM;
	public static ToolMaterial heavyStaffStoneTM;
	public static ToolMaterial heavyStaffIronTM;
	public static ToolMaterial heavyStaffGoldTM;
	public static ToolMaterial heavyStaffDiamondTM;
	
	public static ToolMaterial multiToolWoodTM;
	public static ToolMaterial multiToolStoneTM;
	public static ToolMaterial multiToolIronTM;
	public static ToolMaterial multiToolGoldTM;
	public static ToolMaterial multiToolDiamondTM;
	
	public static ToolMaterial mysticKniveTM;
	
	public static ToolMaterial clawWoodTM;
	public static ToolMaterial clawStoneTM;
	public static ToolMaterial clawIronTM;
	public static ToolMaterial clawGoldTM;
	public static ToolMaterial clawDiamondTM;
	public static ToolMaterial clawSwordWoodTM;
	public static ToolMaterial clawSwordStoneTM;
	public static ToolMaterial clawSwordIronTM;
	public static ToolMaterial clawSwordGoldTM;
	public static ToolMaterial clawSwordDiamondTM;
	public static ToolMaterial claymoreWoodTM;
	public static ToolMaterial claymoreStoneTM;
	public static ToolMaterial claymoreIronTM;
	public static ToolMaterial claymoreGoldTM;
	public static ToolMaterial claymoreDiamondTM;
	public static ToolMaterial longClaymoreWoodTM;
	public static ToolMaterial longClaymoreStoneTM;
	public static ToolMaterial longClaymoreIronTM;
	public static ToolMaterial longClaymoreGoldTM;
	public static ToolMaterial longClaymoreDiamondTM;
	public static ToolMaterial fantasySwordWoodTM;
	public static ToolMaterial fantasySwordStoneTM;
	public static ToolMaterial fantasySwordIronTM;
	public static ToolMaterial fantasySwordGoldTM;
	public static ToolMaterial fantasySwordDiamondTM;
	
	public static ToolMaterial batonIronTM;
	public static ToolMaterial batonWoodTM;
	public static ToolMaterial katanaWoodTM;
	public static ToolMaterial katanaStoneTM;
	public static ToolMaterial katanaIronTM;
	public static ToolMaterial katanaGoldTM;
	public static ToolMaterial katanaDiamondTM;
	public static ToolMaterial ninjatoWoodTM;
	public static ToolMaterial ninjatoStoneTM;
	public static ToolMaterial ninjatoIronTM;
	public static ToolMaterial ninjatoGoldTM;
	public static ToolMaterial ninjatoDiamondTM;
	public static ToolMaterial kunaiTM;
	public static ToolMaterial lashTM;
	public static ToolMaterial nunchuckWoodTM;
	public static ToolMaterial nunchuckIronTM;
	public static ToolMaterial throwingKniveIronTM;
	public static ToolMaterial throwingKniveGoldTM;
	public static ToolMaterial throwingKniveDiamondTM;
	
	public static ToolMaterial industrialTM;
	
	public static ToolMaterial herobrineSwordTM;
	public static ToolMaterial epicBattleAxeTM;
	public static ToolMaterial epicKatanaTM;
	public static ToolMaterial epicWaraxeTM;
	public static ToolMaterial legendarySwordTM;
	public static ToolMaterial masterTM;
	public static ToolMaterial paradoxStaffTM;
	public static ToolMaterial sentinelGlaveTM;
	
	public static ToolMaterial macheteWoodTM;
	public static ToolMaterial macheteStoneTM;
	public static ToolMaterial macheteIronTM;
	public static ToolMaterial macheteGoldTM;
	public static ToolMaterial macheteDiamondTM;
	public static ToolMaterial saberWoodTM;
	public static ToolMaterial saberStoneTM;
	public static ToolMaterial saberIronTM;
	public static ToolMaterial saberGoldTM;
	public static ToolMaterial saberDiamondTM;
	public static ToolMaterial grapplingIronTM;
	public static ToolMaterial harpoonTM;

	

	
	
	
	
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
	public static Item cloth;
	public static Item blankRifle;
	public static Item witherDust;
	public static Item witheredIronIngot;
	public static Item witheredIronShard;
	public static Item broadBladeWithered;
	public static Item swordBladeWithered;
	public static Item axeBladeWithered;
	
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
	public static Item scytheWood;
	public static Item scytheStone;
	public static Item scytheIron;
	public static Item scytheGold;
	public static Item scytheDiamond;
	public static Item lanceWood;
	public static Item lanceStone;
	public static Item lanceIron;
	public static Item lanceGold;
	public static Item lanceDiamond;
	public static Item heavyStaffWood;
	public static Item heavyStaffStone;
	public static Item heavyStaffIron;
	public static Item heavyStaffGold;
	public static Item heavyStaffDiamond;
	
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
	public static ItemArmor soldierHelmet;
	public static ItemArmor soldierChestplate;
	public static ItemArmor soldierLeggings;
	public static ItemArmor soldierBoots;
	
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
	public static Item wandStorm;
	public static Item scepterChanging;
	
	// Fantasy
	public static Item clawWood;
	public static Item clawStone;
	public static Item clawIron;
	public static Item clawGold;
	public static Item clawDiamond;
	public static Item clawSwordWood;
	public static Item clawSwordStone;
	public static Item clawSwordIron;
	public static Item clawSwordGold;
	public static Item clawSwordDiamond;
	public static Item claymoreWood;
	public static Item claymoreStone;
	public static Item claymoreIron;
	public static Item claymoreGold;
	public static Item claymoreDiamond;
	public static Item longClaymoreWood;
	public static Item longClaymoreStone;
	public static Item longClaymoreIron;
	public static Item longClaymoreGold;
	public static Item longClaymoreDiamond;
	public static Item fantasySwordWood;
	public static Item fantasySwordStone;
	public static Item fantasySwordIron;
	public static Item fantasySwordGold;
	public static Item fantasySwordDiamond;
	public static Item lightBow;
	public static Item shadowBow;
	
	// Edo Period
	public static Item batonWood;
	public static Item batonIron;
	public static Item blowgun;
	public static Item katanaWood;
	public static Item katanaStone;
	public static Item katanaIron;
	public static Item katanaGold;
	public static Item katanaDiamond;	
	public static Item ninjatoWood;
	public static Item ninjatoStone;
	public static Item ninjatoIron;
	public static Item ninjatoGold;
	public static Item ninjatoDiamond;
	public static Item kunai;
	public static Item lash;
	public static Item nunchuckWood;
	public static Item nunchuckIron;
	public static Item throwingStar;
	public static Item throwingKnifeIron;
	public static Item throwingKnifeGold;
	public static Item throwingKnifeDiamond;
	public static ItemArmor assassinHelmet;
	public static ItemArmor assassinChestplate;
	public static ItemArmor assassinLeggings;
	public static ItemArmor assassinBoots;
	public static ItemArmor ninjaHelmet;
	public static ItemArmor ninjaChestplate;
	public static ItemArmor ninjaLeggings;
	public static ItemArmor ninjaBoots;
	
	// Modern Age 
	public static Item tankFlame;
	public static Item machineCase;
	public static Item ammoSmall;
	public static Item ammoBig;
	public static Item ammoBundleSmall;
	public static Item ammoBundleBig;
	public static Item concentratedGunpowder;    
	public static Item magazineSmall;
	public static Item magazineBig;
	public static Item magazineLong;
	public static Item magazineDrum;
	public static Item shotgunAmmo;
	public static Item shotgunAmmo2;   
	public static ItemArmor modernSoldierHelmet;
	public static ItemArmor modernSoldierChestplate;
	public static ItemArmor modernSoldierLeggings;
	public static ItemArmor modernSoldierBoots;
	
	public static Item fieldGlasses;
	public static Item nightVisionGoggles;
	public static Item taser;
	public static Item flameThrower;
	public static Item industrialMiner;
	public static Item industrialExcavator;
	public static Item grenade;
	public static Item grenadeFrag;
	public static Item grenadeSmoke;
	public static Item grenadePoison;
	public static Item molotovCocktail;
	
	// Future
	public static Item poisonThrower;
	public static Item industrialMultiTool;
	public static Item waterThrower;
	public static Item tankPoison;
	public static Item tankWater;
	public static Item imploder;
	public static ItemArmor futureSoldierHelmet;
	public static ItemArmor futureSoldierChestplate;
	public static ItemArmor futureSoldierLeggings;
	public static ItemArmor futureSoldierBoots;
	
	// Epic
	public static Item herobrineBow;
	public static Item herobrineSword;
	public static Item epicBattleAxe;
	public static Item legendarySword;
	public static Item masterAxe;
	public static Item masterPickaxe;
	public static Item masterShovel;
	public static Item masterSword;
	public static Item epicKatana;
	public static Item epicWaraxe;
	public static Item paradoxStaff;
	public static Item sentinelGlave;
	public static ItemArmor masterHelmet;
	public static ItemArmor masterChestplate;
	public static ItemArmor masterLeggings;
	public static ItemArmor masterBoots;
	
	// Piracy
	public static Item castNet;
	public static Item grapplingHook;
	public static Item grapplingIron;
	public static Item harpoon;
	public static Item macheteWood;
	public static Item macheteStone;
	public static Item macheteIron;
	public static Item macheteGold;
	public static Item macheteDiamond;
	public static Item saberWood;
	public static Item saberStone;
	public static Item saberIron;
	public static Item saberGold;
	public static Item saberDiamond;
	public static Item telescope;

	  //Items so formatieren:     <GEGENSTAND><MATERIAL>     (example: swordIron, "sword_iron")

	
		
		


	

	public void init() {
		
		
		    /** Tool-Materials **/   
		                                      																    				/**
																			Default Materials, Tools!				  Sword dmg.
																	WOOD          (0,   59,  2.0F,  0.0F,  15);			4.0F
																	STONE         (1,  131,  4.0F,  1.0F,  5);			5.0F
																	IRON          (2,  250,  6.0F,  2.0F,  14);			6.0F
																	GOLD          (0,   32, 12.0F,  0.0F,  22);			4.0F
																	DIAMOND       (3, 1561,  8.0F,  3.0F,  10);			7.0F  	 **/															
		                                                             //     harv.lvl, uses, efficy., dmg., enchant.,
   	    rockTM = EnumHelper.addToolMaterial ("rock",                               0,  500,  0.0F,  4.0F,  0);
		handAxStoneTM = EnumHelper.addToolMaterial("handAxStone",                  0,  400,  1.0F,  4.3F,  0);
		cavemanKniveStoneTM = EnumHelper.addToolMaterial("cavemanKniveStone",      0,  100,  1.0F,  3.5F,  0);
		cavemanKniveBoneTM = EnumHelper.addToolMaterial("cavemanKniveBone",        0,   80,  1.0F,  3.5F,  0);
		woodCudgelTM = EnumHelper.addToolMaterial("woodCudgel",                    0,  150,  1.0F,  5.0F,  0);
		stoneCudgelTM = EnumHelper.addToolMaterial("stoneCudgel",                  1,  200,  1.0F,  5.5F,  0);
		axTM = EnumHelper.addToolMaterial("ax",                                    1,  500,  3.0F,  5.2F,  3);
		cavemanSpearTM = EnumHelper.addToolMaterial("cavemanSpear",                0,   30,  0.5F,  1.0F,  0);
		
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
		battleAxeIronTM = EnumHelper.addToolMaterial("battleAxeIron",              2,  500,  6.0F,  7.80F, 14);
		battleAxeGoldTM = EnumHelper.addToolMaterial("battleAxeGold",              0,  160, 12.0F,   7.0F, 22);
		battleAxeDiamondTM = EnumHelper.addToolMaterial("battleAxeDiamond",        3, 1500,  8.0F,   8.0F, 10);
		flailStoneTM = EnumHelper.addToolMaterial("flailStone",                    1,   30,  1.0F,   7.0F,  5);
		flailIronTM = EnumHelper.addToolMaterial("flailIron",                      2,   50,  1.0F,  7.50F, 14);
		flailGoldTM = EnumHelper.addToolMaterial("flailGold",                      0,   20,  1.0F,   7.0F, 22);
		flailDiamondTM = EnumHelper.addToolMaterial("flailDiamond",                3,  300,  1.0F,   8.0F, 10);
		halbertWoodTM = EnumHelper.addToolMaterial("halbertWood",                  0,  250,  1.0F,  7.50F, 15); 
		halbertStoneTM = EnumHelper.addToolMaterial("halbertStone",                1,  300,  1.0F,   8.0F,  5);
		halbertIronTM = EnumHelper.addToolMaterial("halbertIron",                  2,  350,  1.0F,  8.80F, 14);
		halbertGoldTM = EnumHelper.addToolMaterial("halbertGold",                  0,  280,  1.0F,  2.80F, 22);
		halbertDiamondTM = EnumHelper.addToolMaterial("halbertDiamond",            3, 1700,  1.0F,   9.0F, 10);
		longswordWoodTM = EnumHelper.addToolMaterial("longswordWood",              0,  180,  2.0F,  6.50F, 15);
		longswordStoneTM = EnumHelper.addToolMaterial("longswordStone",            1,  250,  4.0F,   7.0F,  5);
		longswordIronTM = EnumHelper.addToolMaterial("longswordIron",              2,  300,  6.0F,  7.50F, 14);
		longswordGoldTM = EnumHelper.addToolMaterial("longswordGold",              0,  190, 12.0F,   7.0F, 22);
		longswordDiamondTM = EnumHelper.addToolMaterial("longswordDiamond",        3, 1600,  8.0F,   8.0F, 10);
		spearWoodTM = EnumHelper.addToolMaterial("spearWood",                      0,  135,  2.0F,   4.0F, 15);
		spearStoneTM = EnumHelper.addToolMaterial("spearStone",                    1,  180,  4.0F,   4.5F,  5);
		spearIronTM = EnumHelper.addToolMaterial("spearIron",                      2,  230,  6.0F,   5.0F, 14);
		spearGoldTM = EnumHelper.addToolMaterial("spearGold",                      0,  140, 12.0F,   4.3F, 22);
		spearDiamondTM = EnumHelper.addToolMaterial("spearDiamond",                3,  500,  8.0F,   6.0F, 10);
		tridentWoodTM = EnumHelper.addToolMaterial("tridentWood",                  0,  155,  2.0F,  2.85F, 15);
		tridentStoneTM = EnumHelper.addToolMaterial("tridentStone",                1,  200,  4.0F,  5.30F,  5);
		tridentIronTM = EnumHelper.addToolMaterial("tridentIron",                  2,  250,  6.0F,  6.80F, 14);
		tridentGoldTM = EnumHelper.addToolMaterial("tridentGold",                  0,  165, 12.0F,  5.35F, 22);
		tridentDiamondTM = EnumHelper.addToolMaterial("tridentDiamond",            3, 1000,  8.0F,  7.10F, 10);
		waraxeWoodTM = EnumHelper.addToolMaterial("waraxeWood",                    0,  200,  2.0F,   7.0F, 15);
		waraxeStoneTM = EnumHelper.addToolMaterial("waraxeStone",                  1,  300,  4.0F,  8.50F,  5);
		waraxeIronTM = EnumHelper.addToolMaterial("waraxeIron",                    2,  350,  6.0F,   9.0F, 14);
		waraxeGoldTM = EnumHelper.addToolMaterial("waraxeGold",                    0,  215, 12.0F,   8.3F, 22);
		waraxeDiamondTM = EnumHelper.addToolMaterial("waraxeDiamond",              3, 2000,  8.0F,   9.5F, 10);
		warhammerWoodTM = EnumHelper.addToolMaterial("warhammerWood",              0,  200,  2.0F,   7.5F, 15);
		warhammerStoneTM = EnumHelper.addToolMaterial("warhammerStone",            1,  300,  4.0F,   8.0F,  5);
		warhammerIronTM = EnumHelper.addToolMaterial("warhammerIron",              2,  800,  6.0F,   8.6F, 14);
		warhammerGoldTM = EnumHelper.addToolMaterial("warhammerGold",              0,  280, 12.0F,   7.8F, 22);
		warhammerDiamondTM = EnumHelper.addToolMaterial("warhammerDiamond",        3, 5000,  8.0F,   9.0F, 10);
		scytheWoodTM = EnumHelper.addToolMaterial("scytheWood",                    0,  135,  2.5F,   4.0F, 15);
		scytheStoneTM = EnumHelper.addToolMaterial("scytheStone",                  1,  180,  4.5F,   4.5F,  5);
		scytheIronTM = EnumHelper.addToolMaterial("scytheIron",                    2,  230,  6.5F,   5.0F, 14);
		scytheGoldTM = EnumHelper.addToolMaterial("scytheGold",                    0,  140, 12.5F,   4.3F, 22);
		scytheDiamondTM = EnumHelper.addToolMaterial("scytheDiamond",              3,  500,  8.5F,   6.0F, 10);
		lanceWoodTM = EnumHelper.addToolMaterial("lanceWood",                      0,  140,  2.0F,   2.0F, 15);
		lanceStoneTM = EnumHelper.addToolMaterial("lanceStone",                    1,  190,  4.0F,   2.5F,  5);
		lanceIronTM = EnumHelper.addToolMaterial("lanceIron",                      2,  240,  6.0F,   3.0F, 14);
		lanceGoldTM = EnumHelper.addToolMaterial("lanceGold",                      0,  150, 12.0F,   2.3F, 22);
		lanceDiamondTM = EnumHelper.addToolMaterial("lanceDiamond",                3,  520,  8.0F,   4.0F, 10);
		heavyStaffWoodTM = EnumHelper.addToolMaterial("heavyStaffWood",            0,  155,  2.0F,   3.0F, 15);
		heavyStaffStoneTM = EnumHelper.addToolMaterial("heavyStaffStone",          1,  200,  4.0F,   5.5F,  5);
		heavyStaffIronTM = EnumHelper.addToolMaterial("heavyStaffIron",            2,  250,  6.0F,   6.8F, 14);
		heavyStaffGoldTM = EnumHelper.addToolMaterial("heavyStaffGold",            0,  165, 12.0F,   5.3F, 22);
		heavyStaffDiamondTM = EnumHelper.addToolMaterial("heavyStaffDiamond",      3, 1000,  8.0F,   7.2F, 10);
                                                                     //     harv.lvl, uses, efficy., dmg., enchant.,
		multiToolWoodTM = EnumHelper.addToolMaterial("multiToolWood",              0,  120,  2.0F,   5.0F, 15);
		multiToolStoneTM = EnumHelper.addToolMaterial("multiToolStone",            1,  160,  4.0F,   5.5F,  5);
		multiToolIronTM = EnumHelper.addToolMaterial("multiToolIron",         	   2,  230,  6.0F,   6.0F, 14);
		multiToolGoldTM = EnumHelper.addToolMaterial("multiToolGold",              0,  130, 12.0F,   5.2F, 22);
		multiToolDiamondTM = EnumHelper.addToolMaterial("multiToolDiamond",        3, 1000,  8.0F,   7.0F, 10);
        															//     harv.lvl, uses, efficy., dmg., enchant.,
		mysticKniveTM = EnumHelper.addToolMaterial("mysticKnive",                  3,  250,  1.0F,  6.50F, 40);
																	//     harv.lvl, uses, efficy., dmg., enchant.,
		clawWoodTM = EnumHelper.addToolMaterial("clawWood",         	           0,   50,  2.0F,   5.5F, 18);
		clawStoneTM = EnumHelper.addToolMaterial("clawStone",            	       1,  120,  4.0F,   6.0F,  8);
		clawIronTM = EnumHelper.addToolMaterial("clawIron",                  	   2,  240,  6.0F,   6.5F, 17);
		clawGoldTM = EnumHelper.addToolMaterial("clawGold",                        0,   30, 12.0F,   5.7F, 25);
		clawDiamondTM = EnumHelper.addToolMaterial("clawDiamond",            	   3, 1550,  8.0F,   7.0F, 13);
		clawSwordWoodTM = EnumHelper.addToolMaterial("clawSwordWood",              0,   70,  2.0F,   6.0F, 18);
		clawSwordStoneTM = EnumHelper.addToolMaterial("clawSwordStone",            1,  150,  4.0F,   6.5F,  8);
		clawSwordIronTM = EnumHelper.addToolMaterial("clawSwordIron",              2,  270,  6.0F,   7.0F, 17);
		clawSwordGoldTM = EnumHelper.addToolMaterial("clawSwordGold",              0,   50, 12.0F,   6.3F, 25);
		clawSwordDiamondTM = EnumHelper.addToolMaterial("clawSwordDiamond",        3, 1580,  8.0F,   7.5F, 13);
		claymoreWoodTM = EnumHelper.addToolMaterial("claymoreWood",                0,  250,  2.0F,   5.5F, 18);
		claymoreStoneTM = EnumHelper.addToolMaterial("claymoreStone",              1,  330,  4.0F,   6.0F,  8);
		claymoreIronTM = EnumHelper.addToolMaterial("claymoreIron",                2,  550,  6.0F,   7.0F, 17);
		claymoreGoldTM = EnumHelper.addToolMaterial("claymoreGold",                0,  232, 12.0F,   5.8F, 25);
		claymoreDiamondTM = EnumHelper.addToolMaterial("claymoreDiamond",          3, 1760,  8.0F,   8.0F, 13);
		longClaymoreWoodTM = EnumHelper.addToolMaterial("longClaymoreWood",        0,  500,  2.0F,   6.5F, 18);
		longClaymoreStoneTM = EnumHelper.addToolMaterial("longClaymoreStone",      1,  650,  4.0F,   7.0F,  8);
		longClaymoreIronTM = EnumHelper.addToolMaterial("longClaymoreIron",        2,  800,  6.0F,   7.5F, 17);
		longClaymoreGoldTM = EnumHelper.addToolMaterial("longClaymoreGold",        0,  530, 12.0F,   6.8F, 25);
		longClaymoreDiamondTM = EnumHelper.addToolMaterial("longClaymoreDiamond",  3, 2000,  8.0F,   8.0F, 13);
		fantasySwordWoodTM = EnumHelper.addToolMaterial("fantasySwordWood",        0,  450,  2.0F,   7.0F, 15);
		fantasySwordStoneTM = EnumHelper.addToolMaterial("fantasySwordStone",      1,  600,  4.0F,   7.5F, 20);
		fantasySwordIronTM = EnumHelper.addToolMaterial("fantasySwordIron",        2,  750,  6.0F,   9.0F, 19);
		fantasySwordGoldTM = EnumHelper.addToolMaterial("fantasySwordGold",        0,  480, 12.0F,   8.3F, 27);
		fantasySwordDiamondTM = EnumHelper.addToolMaterial("fantasySwordDiamond",  3, 1950,  8.0F,  10.0F, 15);
																	//     harv.lvl, uses, efficy., dmg., enchant.,
		katanaWoodTM = EnumHelper.addToolMaterial("katanaWood",                    0,  550,  2.0F,   7.0F, 15);
		katanaStoneTM = EnumHelper.addToolMaterial("katanaStone",                  1,  700,  4.0F,   7.5F,  5);
		katanaIronTM = EnumHelper.addToolMaterial("katanaIron",                    2,  850,  6.0F,   8.0F, 14);
		katanaGoldTM = EnumHelper.addToolMaterial("katanaGold",                    0,  580, 12.0F,   7.3F, 22);
		katanaDiamondTM = EnumHelper.addToolMaterial("katanaDiamond",              3, 2050,  8.0F,   8.5F, 15);
		ninjatoWoodTM = EnumHelper.addToolMaterial("ninjatoWood",                  0,  600,  2.0F,   6.5F, 15);
		ninjatoStoneTM = EnumHelper.addToolMaterial("ninjatoStone",                1,  700,  4.0F,   7.0F,  5);
		ninjatoIronTM = EnumHelper.addToolMaterial("ninjatoIron",                  2,  900,  6.0F,   7.5F, 14);
		ninjatoGoldTM = EnumHelper.addToolMaterial("ninjatoGold",                  0,  650, 12.0F,   6.8F, 22);
		ninjatoDiamondTM = EnumHelper.addToolMaterial("ninjatoDiamond",            3, 2100,  8.0F,   8.0F, 13);
		kunaiTM = EnumHelper.addToolMaterial("kunai",                              0,   80,  1.0F,   1.3F, 10);
		throwingKniveIronTM = EnumHelper.addToolMaterial("throwingKniveIron",      0,   50,  1.0F,   1.5F,  8);
		throwingKniveGoldTM = EnumHelper.addToolMaterial("throwingKniveGold",      0,   20,  1.0F,   2.0F, 15);
		throwingKniveDiamondTM = EnumHelper.addToolMaterial("throwingKniveDiamond",0,  100,  1.0F,   2.5F, 10);
		lashTM = EnumHelper.addToolMaterial("lash",                                0,  120,  1.0F,   1.5F,  0);
		batonWoodTM = EnumHelper.addToolMaterial("batonWood",                      0,  100,  1.0F,   2.0F,  5);
		batonIronTM = EnumHelper.addToolMaterial("batonIron",                      0,  300,  1.0F,   2.8F, 10);
		nunchuckWoodTM = EnumHelper.addToolMaterial("nunchuckWood",                0,  100,  8.0F,   2.5F,  8);
		nunchuckIronTM = EnumHelper.addToolMaterial("nunchuckIron",                0,  300,  8.0F,   3.3F, 10);
																	//     harv.lvl, uses, efficy., dmg., enchant.,
		industrialTM = EnumHelper.addToolMaterial("industrial",                    3,  800, 12.0F,   5.0F, 10);
		masterTM = EnumHelper.addToolMaterial("master",                            3, 1500, 10.0F,   4.0F,  8);
		herobrineSwordTM = EnumHelper.addToolMaterial("herobrine",                 3, 3000, 10.0F,   8.0F,  0);
		legendarySwordTM = EnumHelper.addToolMaterial("legendarySword",            3, 2000,  8.0F,  12.0F, 20);
		epicBattleAxeTM = EnumHelper.addToolMaterial("epicBattleAxe",              3, 2000,  8.0F,   8.5F, 15);
		epicKatanaTM = EnumHelper.addToolMaterial("epicKatana",                    3, 2500,  8.0F,   9.0F, 20);
		epicWaraxeTM = EnumHelper.addToolMaterial("epicWaraxe",                    3, 2500,  8.0F,  10.0F, 15);
		paradoxStaffTM = EnumHelper.addToolMaterial("paradoxStaff",                3, 2000,  9.0F,  10.0F,  5);
		sentinelGlaveTM = EnumHelper.addToolMaterial("sentinelGlave",              3, 2000,  9.0F,  10.0F, 10);
																	//     harv.lvl, uses, efficy., dmg., enchant.,
		grapplingIronTM = EnumHelper.addToolMaterial("grapplingIron",              0,   90,  1.0F,   1.0F,  3);
		harpoonTM = EnumHelper.addToolMaterial("harpoon",                          0,  200,  8.0F,   6.0F,  0);
		macheteWoodTM = EnumHelper.addToolMaterial("macheteWood",                  0,  100,  2.0F,   4.5F, 15);
		macheteStoneTM = EnumHelper.addToolMaterial("macheteStone",                1,  150,  4.0F,   5.0F,  5);
		macheteIronTM = EnumHelper.addToolMaterial("macheteIron",                  2,  300,  6.0F,   5.5F, 14);
		macheteGoldTM = EnumHelper.addToolMaterial("macheteGold",                  0,   50, 12.0F,   4.8F, 22);
		macheteDiamondTM = EnumHelper.addToolMaterial("macheteDiamond",            3, 1600,  8.0F,   6.0F, 10);
		saberWoodTM = EnumHelper.addToolMaterial("saberWood",                      0,  150,  2.0F,   4.5F, 20);
		saberStoneTM = EnumHelper.addToolMaterial("saberStone",                    1,  200,  4.0F,   5.0F, 10);
		saberIronTM = EnumHelper.addToolMaterial("saberIron",                      2,  350,  6.0F,   5.5F, 19);
		saberGoldTM = EnumHelper.addToolMaterial("saberGold",                      0,  100, 12.0F,   4.8F, 27);
		saberDiamondTM = EnumHelper.addToolMaterial("saberDiamond",                3, 1700,  8.0F,   6.0F, 15);




		
/** TEMPLATE		
		WoodTM = EnumHelper.addToolMaterial("Wood",                  0,  x,  2.0F,   xF, 15);
		StoneTM = EnumHelper.addToolMaterial("Stone",                1,  x,  4.0F,   xF,  5);
		IronTM = EnumHelper.addToolMaterial("Iron",                  2,  x,  6.0F,   xF, 14);
		GoldTM = EnumHelper.addToolMaterial("Gold",                  0,  x, 12.0F,   xF, 22);
		DiamondTM = EnumHelper.addToolMaterial("Diamond",            3,  x,  8.0F,   xF, 10);
		
		
		
		
		
		
		
																			Default Materials, Tools			     Sword dmg.
																	WOOD          (0,   59,  2.0F,  0.0F,  15);			4.0F
																	STONE         (1,  131,  4.0F,  1.0F,  5);			5.0F
																	IRON          (2,  250,  6.0F,  2.0F,  14);			6.0F
																	GOLD          (0,   32, 12.0F,  0.0F,  22);			4.0F
																	DIAMOND       (3, 1561,  8.0F,  3.0F,  10);			7.0F
**/   	    
		
		
		
		
		
		/** Armor-Materials **/
																																	                      		     		/**
		    																                       		 5               {1, 3, 2, 1} for leather armor (7 at all)
		    																                    		15    			 {2, 5, 4, 1} for chain armor   (12 at all)
		    																                    		15    			 {2, 6, 5, 2} for iron armor    (15 at all)
		    																	                      	 7    			 {2, 5, 3, 1} for gold armor    (11 at all)
		    														   			                     	32               {3, 8, 6, 3} for diamond armor (20 at all - do not use more!)
		 																																	                       			**/
		 cavemanAM = EnumHelper.addArmorMaterial("caveman", "ageofweapons:caveman",					     3, new int[] {1, 2, 1, 1},  0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
		 ninjaAM = EnumHelper.addArmorMaterial("ninja", "ageofweapons:ninja", 							10, new int[] {1, 4, 3, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
		 assassinAM = EnumHelper.addArmorMaterial("assassin", "ageofweapons:assassin", 					12, new int[] {2, 4, 3, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
         nightVisionGogglesAM = EnumHelper.addArmorMaterial("nightVisionGoggles", "ageofweapons:night_vision_goggles", 10, new int[]{1, 0, 0, 0}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
		 masterAM = EnumHelper.addArmorMaterial("master", "ageofweapons:master", 						30, new int[] {3, 7, 5, 3},  5, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2);
		 soldierAM = EnumHelper.addArmorMaterial("soldier", "ageofweapons:soldier", 					20, new int[] {2, 5, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
		 modernSoldierAM = EnumHelper.addArmorMaterial("modern_soldier", "ageofweapons:modern_soldier", 20, new int[] {2, 7, 6, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
		 futureSoldierAM = EnumHelper.addArmorMaterial("future_soldier", "ageofweapons:future_soldier", 20, new int[] {3, 8, 6, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON,    1);

		
		
		
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
		cloth = new ItemCloth();
		tankFlame = new ItemTankFlame();
		tankPoison = new ItemTankPoison();
		tankWater = new ItemTankWater();
		machineCase = new ItemMachineCase();
		ammoSmall = new ItemAmmoSmall();
		ammoBig = new ItemAmmoBig();
		ammoBundleSmall = new ItemAmmoBundleSmall();
		ammoBundleBig = new ItemAmmoBig();
		concentratedGunpowder = new ItemConcentratedGunpowder();
		magazineSmall = new ItemMagazineSmall();
		magazineLong = new ItemMagazineLong();
		magazineBig = new ItemMagazineBig();
		magazineDrum = new ItemMagazineDrum();
		shotgunAmmo = new ItemShotgunAmmo();
		shotgunAmmo2 = new ItemShotgunAmmo2();
		blankRifle = new ItemBlankRifle();
		witherDust = new ItemWitherDust();
		witheredIronIngot = new ItemWitheredIronIngot();
		witheredIronShard = new ItemWitheredIronShard();
		broadBladeWithered = new ItemBroadBladeWithered();
		swordBladeWithered = new ItemSwordBladeWithered();
		axeBladeWithered = new ItemAxeBladeWithered();
		
		
		
		// Stone Age
		rock = new ItemRock(rockTM);
		handAxStone = new ItemHandAxStone(handAxStoneTM);
		cavemanKniveStone = new ItemCavemanKniveStone(cavemanKniveStoneTM);
		cavemanKniveBone = new ItemCavemanKniveStone(cavemanKniveBoneTM);
		woodCudgel = new ItemWoodCudgel(woodCudgelTM);
		stoneCudgel = new ItemStoneCudgel(stoneCudgelTM);
		ax = new ItemAx(axTM);
		throwWood = new ItemThrowWood();
		cavemanSpear = new ItemCavemanSpear(cavemanSpearTM);
		cavemanHelmet = new ItemArmorCaveman(cavemanAM, 1, EntityEquipmentSlot.HEAD); 
		cavemanChestplate = new ItemArmorCaveman(cavemanAM, 1, EntityEquipmentSlot.CHEST);
		cavemanLeggings = new ItemArmorCaveman(cavemanAM, 2, EntityEquipmentSlot.LEGS); 
		cavemanBoots = new ItemArmorCaveman(cavemanAM, 1, EntityEquipmentSlot.FEET); 
		
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
		scytheWood = new ItemScytheWood(scytheWoodTM);
		scytheStone = new ItemScytheStone(scytheStoneTM);
		scytheIron = new ItemScytheIron(scytheIronTM);
		scytheGold = new ItemScytheGold(scytheGoldTM);
		scytheDiamond = new ItemScytheDiamond(scytheDiamondTM);
		lanceWood = new ItemLanceWood(lanceWoodTM);
		lanceStone = new ItemLanceStone(lanceStoneTM);
		lanceIron = new ItemLanceIron(lanceIronTM);
		lanceGold = new ItemLanceGold(lanceGoldTM);
		lanceDiamond = new ItemLanceDiamond(lanceDiamondTM);
		heavyStaffWood = new ItemHeavyStaffWood(heavyStaffWoodTM);
		heavyStaffStone = new ItemHeavyStaffStone(heavyStaffStoneTM);
		heavyStaffIron = new ItemHeavyStaffIron(heavyStaffIronTM);
		heavyStaffGold = new ItemHeavyStaffGold(heavyStaffGoldTM);
		heavyStaffDiamond = new ItemHeavyStaffDiamond(heavyStaffDiamondTM);
		
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
		soldierHelmet = new ItemArmorSoldier(soldierAM, 1, EntityEquipmentSlot.HEAD); 
		soldierChestplate = new ItemArmorSoldier(soldierAM, 1, EntityEquipmentSlot.CHEST);
		soldierLeggings = new ItemArmorSoldier(soldierAM, 2, EntityEquipmentSlot.LEGS); 
		soldierBoots = new ItemArmorSoldier(soldierAM, 1, EntityEquipmentSlot.FEET); 
		
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
		wandStorm = new ItemWandStorm();
		scepterChanging = new ItemScepterChanging();
		
		// Fantasy
		clawWood = new ItemClawWood(clawWoodTM);
		clawStone = new ItemClawStone(clawStoneTM);
		clawIron = new ItemClawIron(clawIronTM);
		clawGold = new ItemClawGold(clawGoldTM);
		clawDiamond = new ItemClawDiamond(clawDiamondTM);
		clawSwordWood = new ItemClawSwordWood(clawSwordWoodTM);
		clawSwordStone = new ItemClawSwordStone(clawSwordStoneTM);
		clawSwordIron = new ItemClawSwordIron(clawSwordIronTM);
		clawSwordGold = new ItemClawSwordGold(clawSwordGoldTM);
		clawSwordDiamond = new ItemClawSwordDiamond(clawSwordDiamondTM);
		claymoreWood = new ItemClaymoreWood(claymoreWoodTM);
		claymoreStone = new ItemClaymoreStone(claymoreStoneTM);
		claymoreIron = new ItemClaymoreIron(claymoreIronTM);
		claymoreGold = new ItemClaymoreGold(claymoreGoldTM);
		claymoreDiamond = new ItemClaymoreDiamond(claymoreDiamondTM);
		longClaymoreWood = new ItemLongClaymoreWood(longClaymoreWoodTM);
		longClaymoreStone = new ItemLongClaymoreStone(longClaymoreStoneTM);
		longClaymoreIron = new ItemLongClaymoreIron(longClaymoreIronTM);
		longClaymoreGold = new ItemLongClaymoreGold(longClaymoreGoldTM);
		longClaymoreDiamond = new ItemLongClaymoreDiamond(longClaymoreDiamondTM);
		fantasySwordWood = new ItemFantasySwordWood(fantasySwordWoodTM);
		fantasySwordStone = new ItemFantasySwordStone(fantasySwordStoneTM);
		fantasySwordIron = new ItemFantasySwordIron(fantasySwordIronTM);
		fantasySwordGold = new ItemFantasySwordGold(fantasySwordGoldTM);
		fantasySwordDiamond = new ItemFantasySwordDiamond(fantasySwordDiamondTM);
		lightBow = new ItemLightBow();
		shadowBow = new ItemShadowBow();
		
		// Edo Period
		katanaWood = new ItemKatanaWood(katanaWoodTM);
		katanaStone = new ItemKatanaStone(katanaStoneTM);
		katanaIron = new ItemKatanaIron(katanaIronTM);
		katanaGold = new ItemKatanaGold(katanaGoldTM);
		katanaDiamond = new ItemKatanaDiamond(katanaDiamondTM);
		ninjatoWood = new ItemNinjatoWood(ninjatoWoodTM);
		ninjatoStone = new ItemNinjatoStone(ninjatoStoneTM);
		ninjatoIron = new ItemNinjatoIron(ninjatoIronTM);
		ninjatoGold = new ItemNinjatoGold(ninjatoGoldTM);
		ninjatoDiamond = new ItemNinjatoDiamond(ninjatoDiamondTM);
		batonWood = new ItemBatonWood(batonWoodTM);
		batonIron = new ItemBatonIron(batonIronTM);
		blowgun = new ItemBlowgun();
		kunai = new ItemKunai(kunaiTM);
		lash = new ItemLash(lashTM);
		throwingStar = new ItemThrowingStar();
		nunchuckWood = new ItemNunchuckWood(nunchuckWoodTM);
		nunchuckIron = new ItemNunchuckIron(nunchuckIronTM);
		throwingKnifeIron = new ItemThrowingKniveIron(throwingKniveIronTM);
		throwingKnifeGold = new ItemThrowingKniveGold(throwingKniveGoldTM);
		throwingKnifeDiamond = new ItemThrowingKniveDiamond(throwingKniveDiamondTM);
		assassinHelmet = new ItemArmorAssassin(assassinAM, 1, EntityEquipmentSlot.HEAD); 
		assassinChestplate = new ItemArmorAssassin(assassinAM, 1, EntityEquipmentSlot.CHEST);
		assassinLeggings = new ItemArmorAssassin(assassinAM, 2, EntityEquipmentSlot.LEGS); 
		assassinBoots = new ItemArmorAssassin(assassinAM, 1, EntityEquipmentSlot.FEET); 
		ninjaHelmet = new ItemArmorNinja(ninjaAM, 1, EntityEquipmentSlot.HEAD); 
		ninjaChestplate = new ItemArmorNinja(ninjaAM, 1, EntityEquipmentSlot.CHEST);
		ninjaLeggings = new ItemArmorNinja(ninjaAM, 2, EntityEquipmentSlot.LEGS); 
		ninjaBoots = new ItemArmorNinja(ninjaAM, 1, EntityEquipmentSlot.FEET); 
		
		// Modern Age
		fieldGlasses = new ItemFieldGlasses();
		taser = new ItemTaser();
		flameThrower = new ItemFlameThrower();
		industrialMiner = new ItemIndustrialMiner(industrialTM);
		industrialExcavator = new ItemIndustrialExcavator(industrialTM);
		nightVisionGoggles = new ItemNightVisionGoggles(nightVisionGogglesAM, 1, EntityEquipmentSlot.HEAD); 
		grenade = new ItemGrenade();
		grenadeFrag = new ItemGrenadeFrag();
		grenadeSmoke = new ItemGrenadeSmoke();
		grenadePoison = new ItemGrenadePoison();
		molotovCocktail = new ItemMolotovCocktail();
		modernSoldierHelmet = new ItemArmorModernSoldier(modernSoldierAM, 1, EntityEquipmentSlot.HEAD); 
		modernSoldierChestplate = new ItemArmorModernSoldier(modernSoldierAM, 1, EntityEquipmentSlot.CHEST);
		modernSoldierLeggings = new ItemArmorModernSoldier(modernSoldierAM, 2, EntityEquipmentSlot.LEGS); 
		modernSoldierBoots = new ItemArmorModernSoldier(modernSoldierAM, 1, EntityEquipmentSlot.FEET); 
		
		// Future
		poisonThrower = new ItemPoisonGun();
		industrialMultiTool = new ItemIndustrialMultiTool(industrialTM);
		waterThrower = new ItemWaterThrower();
		imploder = new ItemImploder();
		futureSoldierHelmet = new ItemArmorFutureSoldier(futureSoldierAM, 1, EntityEquipmentSlot.HEAD); 
		futureSoldierChestplate = new ItemArmorFutureSoldier(futureSoldierAM, 1, EntityEquipmentSlot.CHEST);
		futureSoldierLeggings = new ItemArmorFutureSoldier(futureSoldierAM, 2, EntityEquipmentSlot.LEGS); 
		futureSoldierBoots = new ItemArmorFutureSoldier(futureSoldierAM, 1, EntityEquipmentSlot.FEET); 
		
		// Epic
		herobrineBow = new ItemHerobrineBow();
		herobrineSword = new ItemHerobrineSword(herobrineSwordTM);
		epicBattleAxe = new ItemEpicBattleAxe(epicBattleAxeTM);
		legendarySword = new ItemLegendarySword(legendarySwordTM);
		epicKatana = new ItemEpicKatana(epicKatanaTM);
		epicWaraxe = new ItemEpicWaraxe(epicWaraxeTM);
		masterAxe = new ItemMasterAxe(masterTM);
		masterPickaxe = new ItemMasterPickaxe(masterTM);
		masterShovel = new ItemMasterShovel(masterTM);
		masterSword = new ItemMasterSword(masterTM);
		paradoxStaff = new ItemParadoxStaff(paradoxStaffTM);
		sentinelGlave = new ItemSentinelGlave(sentinelGlaveTM);
		masterHelmet = new ItemArmorMaster(masterAM, 1, EntityEquipmentSlot.HEAD); 
		masterChestplate = new ItemArmorMaster(masterAM, 1, EntityEquipmentSlot.CHEST);
		masterLeggings = new ItemArmorMaster(masterAM, 2, EntityEquipmentSlot.LEGS); 
		masterBoots = new ItemArmorMaster(masterAM, 1, EntityEquipmentSlot.FEET);
		
		// Piracy
		castNet = new ItemCastNet();
		grapplingHook = new ItemGrapplingHook();
		grapplingIron = new ItemGrapplingIron(grapplingIronTM);
		harpoon = new ItemHarpoon();
		telescope = new ItemTelescope();
		macheteWood = new ItemMacheteWood(macheteWoodTM);
		macheteStone = new ItemMacheteStone(macheteStoneTM);
		macheteIron = new ItemMacheteIron(macheteIronTM);
		macheteGold = new ItemMacheteGold(macheteGoldTM);
		macheteDiamond = new ItemMacheteDiamond(macheteDiamondTM);
		saberWood = new ItemSaberWood(saberWoodTM);
		saberStone = new ItemSaberStone(saberStoneTM);
		saberIron = new ItemSaberIron(saberIronTM);
		saberGold = new ItemSaberGold(saberGoldTM);
		saberDiamond = new ItemSaberDiamond(saberDiamondTM);

		
/** TEMPLATE		
		Wood = new ItemWood(WoodTM);
		Stone = new ItemStone(StoneTM);
		Iron = new ItemIron(IronTM);
		Gold = new ItemGold(GoldTM);
		Diamond = new ItemDiamond(DiamondTM);
**/	
		
		
		
		
		
		
		
		
		
		
		
		
		
		NameHandler.setNames(upgradeCreative, "upgrade_creative");
		NameHandler.setNames(upgradeStoneAge, "upgrade_stone_age");
		NameHandler.setNames(upgradeAtiquity, "upgrade_antiquity");
		NameHandler.setNames(upgradeMystic, "upgrade_mystic");
		NameHandler.setNames(upgradeMiddleAges, "upgrade_middle_ages");
		NameHandler.setNames(upgradeEdoPeriod, "upgrade_edo_period");
		NameHandler.setNames(upgradePiracy, "upgrade_piracy");
		NameHandler.setNames(upgradeEarlyModernAge, "upgrade_early_modern_age");
		NameHandler.setNames(upgradeFantasy, "upgrade_fantasy");
		NameHandler.setNames(upgradeEpic, "upgrade_epic");
		NameHandler.setNames(upgradeModernAge, "upgrade_modern_age");
		NameHandler.setNames(upgradeFuture, "upgrade_future");
		NameHandler.setNames(upgradeBBY, "upgrade_bby");
		
		NameHandler.setNames(axeBladeDiamond, "axe_blade_diamond");
		NameHandler.setNames(axeBladeGold, "axe_blade_gold");
		NameHandler.setNames(axeBladeIron, "axe_blade_iron");
		NameHandler.setNames(axeBladeStone, "axe_blade_stone");
		NameHandler.setNames(axeBladeWood, "axe_blade_wood");
		NameHandler.setNames(swordBladeDiamond, "sword_blade_diamond");
		NameHandler.setNames(swordBladeGold, "sword_blade_gold");
		NameHandler.setNames(swordBladeIron, "sword_blade_iron");
		NameHandler.setNames(swordBladeStone, "sword_blade_stone");
		NameHandler.setNames(swordBladeWood, "sword_blade_wood");
		NameHandler.setNames(broadBladeDiamond, "broad_blade_diamond");
		NameHandler.setNames(broadBladeGold, "broad_blade_gold");
		NameHandler.setNames(broadBladeIron, "broad_blade_iron");
		NameHandler.setNames(broadBladeStone, "broad_blade_stone");
		NameHandler.setNames(broadBladeWood, "broad_blade_wood");
		NameHandler.setNames(ironStick, "iron_stick");
		NameHandler.setNames(ironLongstick, "iron_longstick");
		NameHandler.setNames(woodLongstick, "wood_longstick");
		NameHandler.setNames(lumber, "lumber");
		NameHandler.setNames(radioactiveToxin, "radioactive_toxin");
		NameHandler.setNames(ruby, "ruby");
		NameHandler.setNames(sapphire, "sapphire");
		NameHandler.setNames(swordHandle, "sword_handle");
		NameHandler.setNames(toxin, "toxin");
		NameHandler.setNames(diamondShard, "diamond_shard");
		NameHandler.setNames(emeraldShard, "emerald_shard");
		NameHandler.setNames(goldShard, "gold_shard");
		NameHandler.setNames(ironShard, "iron_shard");
		NameHandler.setNames(rubyShard, "ruby_shard");
		NameHandler.setNames(sapphireShard, "sapphire_shard");
		NameHandler.setNames(stoneShard, "stone_shard");
		NameHandler.setNames(woodShard, "wood_shard");
		NameHandler.setNames(barrel, "barrel");
		NameHandler.setNames(gunHandle, "gun_handle");   
		NameHandler.setNames(blankGun, "blank_gun");
		NameHandler.setNames(haftIron, "haft_iron");
		NameHandler.setNames(haftWood, "haft_wood");
		NameHandler.setNames(visor, "visor");
		NameHandler.setNames(amber, "amber");
		NameHandler.setNames(amethyst, "amethyst");
		NameHandler.setNames(topaz, "topaz");
		NameHandler.setNames(amethystShard, "amethyst_shard");
		NameHandler.setNames(topazShard, "topaz_shard");
		NameHandler.setNames(glassShard, "glass_shard");
		NameHandler.setNames(hammer, "hammer");
		NameHandler.setNames(cloth, "cloth");
		NameHandler.setNames(tankFlame, "tank_flame");
		NameHandler.setNames(tankPoison, "tank_poison");
		NameHandler.setNames(tankWater, "tank_water");
		NameHandler.setNames(machineCase, "machine_case");
		NameHandler.setNames(ammoSmall, "ammo_small");
		NameHandler.setNames(ammoBig, "ammo_big");
		NameHandler.setNames(ammoBundleSmall, "ammo_bundle_small");
		NameHandler.setNames(ammoBundleBig, "ammo_bundle_big");
		NameHandler.setNames(concentratedGunpowder, "concentrated_gunpowder");
		NameHandler.setNames(magazineSmall, "magazine_small");
		NameHandler.setNames(magazineLong, "magazine_long");
		NameHandler.setNames(magazineBig, "magazine_big");
		NameHandler.setNames(magazineDrum, "magazine_drum");
		NameHandler.setNames(shotgunAmmo, "shotgun_ammo");
		NameHandler.setNames(shotgunAmmo2, "shotgun_ammo2");
		NameHandler.setNames(blankRifle, "blank_rifle");
		NameHandler.setNames(witherDust, "wither_dust");
		NameHandler.setNames(witheredIronIngot, "withered_iron_ingot");
		NameHandler.setNames(witheredIronShard, "withered_iron_shard");
		NameHandler.setNames(broadBladeWithered, "broad_blade_withered");
		NameHandler.setNames(swordBladeWithered, "sword_blade_withered");
		NameHandler.setNames(axeBladeWithered, "axe_blade_withered");
		
		// Stone Age
		NameHandler.setNames(rock, "rock");
		NameHandler.setNames(handAxStone, "hand_ax_stone");
		NameHandler.setNames(cavemanKniveStone, "caveman_knive_stone");
		NameHandler.setNames(cavemanKniveBone, "caveman_knive_bone");
		NameHandler.setNames(woodCudgel, "wood_cudgel");
		NameHandler.setNames(stoneCudgel, "stone_cudgel");
		NameHandler.setNames(ax, "ax");
		NameHandler.setNames(throwWood, "throw_wood");
		NameHandler.setNames(cavemanSpear, "caveman_spear");
		NameHandler.setNames(cavemanHelmet, "caveman_helmet");
		NameHandler.setNames(cavemanChestplate, "caveman_chestplate");
		NameHandler.setNames(cavemanLeggings, "caveman_leggings");
		NameHandler.setNames(cavemanBoots, "caveman_boots");
		
		// Antiquity
		NameHandler.setNames(kniveWood, "knive_wood");
		NameHandler.setNames(kniveStone, "knive_stone");
		NameHandler.setNames(kniveIron, "knive_iron");
		NameHandler.setNames(kniveGold, "knive_gold");
		NameHandler.setNames(kniveDiamond, "knive_diamond");
		NameHandler.setNames(daggerWood, "dagger_wood");
		NameHandler.setNames(daggerStone, "dagger_stone");
		NameHandler.setNames(daggerIron, "dagger_iron");
		NameHandler.setNames(daggerGold, "dagger_gold");
		NameHandler.setNames(daggerDiamond, "dagger_diamond");
		NameHandler.setNames(skewerWood, "skewer_wood");
		NameHandler.setNames(skewerStone, "skewer_stone");
		NameHandler.setNames(skewerIron, "skewer_iron");
		NameHandler.setNames(skewerGold, "skewer_gold");
		NameHandler.setNames(skewerDiamond, "skewer_diamond");
		NameHandler.setNames(recurveBow, "recurve_bow");
		
		// Middle Ages
		NameHandler.setNames(battleAxeWood, "battle_axe_wood");
		NameHandler.setNames(battleAxeStone, "battle_axe_stone");
		NameHandler.setNames(battleAxeIron, "battle_axe_iron");
		NameHandler.setNames(battleAxeGold, "battle_axe_gold");
		NameHandler.setNames(battleAxeDiamond, "battle_axe_diamond");
		NameHandler.setNames(flailStone, "flail_stone");
		NameHandler.setNames(flailIron, "flail_iron");
		NameHandler.setNames(flailGold, "flail_gold");
		NameHandler.setNames(flailDiamond, "flail_diamond");
		NameHandler.setNames(halbertWood, "halbert_wood");
		NameHandler.setNames(halbertStone, "halbert_stone");
		NameHandler.setNames(halbertIron, "halbert_iron");
		NameHandler.setNames(halbertGold, "halbert_gold");
		NameHandler.setNames(halbertDiamond, "halbert_diamond");
		NameHandler.setNames(longswordWood, "longsword_wood");
		NameHandler.setNames(longswordStone, "longsword_stone");
		NameHandler.setNames(longswordIron, "longsword_iron");
		NameHandler.setNames(longswordGold, "longsword_gold");
		NameHandler.setNames(longswordDiamond, "longsword_diamond");
		NameHandler.setNames(spearWood, "spear_wood");
		NameHandler.setNames(spearStone, "spear_stone");
		NameHandler.setNames(spearIron, "spear_iron");
		NameHandler.setNames(spearGold, "spear_gold");
		NameHandler.setNames(spearDiamond, "spear_diamond");
		NameHandler.setNames(tridentWood, "trident_wood");
		NameHandler.setNames(tridentStone, "trident_stone");
		NameHandler.setNames(tridentIron, "trident_iron");
		NameHandler.setNames(tridentGold, "trident_gold");
		NameHandler.setNames(tridentDiamond, "trident_diamond");
		NameHandler.setNames(waraxeWood, "war_axe_wood");
		NameHandler.setNames(waraxeStone, "war_axe_stone");
		NameHandler.setNames(waraxeIron, "war_axe_iron");
		NameHandler.setNames(waraxeGold, "war_axe_gold");
		NameHandler.setNames(waraxeDiamond, "war_axe_diamond");
		NameHandler.setNames(warhammerWood, "war_hammer_wood");
		NameHandler.setNames(warhammerStone, "war_hammer_stone");
		NameHandler.setNames(warhammerIron, "war_hammer_iron");
		NameHandler.setNames(warhammerGold, "war_hammer_gold");
		NameHandler.setNames(warhammerDiamond, "war_hammer_diamond");
		NameHandler.setNames(longbow, "longbow");
		NameHandler.setNames(crossbow, "crossbow");
		NameHandler.setNames(scytheWood, "scythe_wood");
		NameHandler.setNames(scytheStone, "scythe_stone");
		NameHandler.setNames(scytheIron, "scythe_iron");
		NameHandler.setNames(scytheGold, "scythe_gold");
		NameHandler.setNames(scytheDiamond, "scythe_diamond");
		NameHandler.setNames(lanceWood, "lance_wood");
		NameHandler.setNames(lanceStone, "lance_stone");
		NameHandler.setNames(lanceIron, "lance_iron");
		NameHandler.setNames(lanceGold, "lance_gold");
		NameHandler.setNames(lanceDiamond, "lance_diamond");
		NameHandler.setNames(heavyStaffWood, "heavy_staff_wood");
		NameHandler.setNames(heavyStaffStone, "heavy_staff_stone");
		NameHandler.setNames(heavyStaffIron, "heavy_staff_iron");
		NameHandler.setNames(heavyStaffGold, "heavy_staff_gold");
		NameHandler.setNames(heavyStaffDiamond, "heavy_staff_diamond");
		
		// Early Modern Age
		NameHandler.setNames(multiToolWood, "multi_tool_wood");
		NameHandler.setNames(multiToolStone, "multi_tool_stone");
		NameHandler.setNames(multiToolIron, "multi_tool_iron");
		NameHandler.setNames(multiToolGold, "multi_tool_gold");
		NameHandler.setNames(multiToolDiamond, "multi_tool_diamond");
		NameHandler.setNames(oldAmmo, "old_ammo");
		NameHandler.setNames(oldShotgunAmmo, "old_shotgun_ammo");
		NameHandler.setNames(cannonball, "cannonball");
		NameHandler.setNames(pebble, "pebble");
		NameHandler.setNames(dynamite, "dynamite");
		NameHandler.setNames(compoundBow, "compound_bow");
		NameHandler.setNames(nails, "nails");
		NameHandler.setNames(nailsToxic, "nails_toxic");
		NameHandler.setNames(soldierHelmet, "soldier_helmet");
		NameHandler.setNames(soldierChestplate, "soldier_chestplate");
		NameHandler.setNames(soldierLeggings, "soldier_leggings");
		NameHandler.setNames(soldierBoots, "soldier_boots");
		
		// Mystic
		NameHandler.setNames(mysticKnive, "mystic_knive");
		NameHandler.setNames(pufferfishStick, "pufferfish_stick");
		NameHandler.setNames(scepterUnholy, "scepter_unholy");
		NameHandler.setNames(wandAether, "wand_aether");
		NameHandler.setNames(wandNether, "wand_nether");
		NameHandler.setNames(wandBasic, "wand_basic");
		NameHandler.setNames(wandCurse, "wand_curse");
		NameHandler.setNames(wandHoly, "wand_holy");
		NameHandler.setNames(wandMaelstrom, "wand_maelstrom");
		NameHandler.setNames(warhornDefensive, "warhorn_defensive");
		NameHandler.setNames(warhornOffensive, "warhorn_offensive");
		NameHandler.setNames(wandStorm, "wand_storm");
		NameHandler.setNames(scepterChanging, "scepter_changing");
		
		// Fantasy
		NameHandler.setNames(clawWood, "claw_wood");
		NameHandler.setNames(clawStone, "claw_stone");
		NameHandler.setNames(clawIron, "claw_iron");
		NameHandler.setNames(clawGold, "claw_gold");
		NameHandler.setNames(clawDiamond, "claw_diamond");
		NameHandler.setNames(claymoreWood, "claymore_wood");
		NameHandler.setNames(claymoreStone, "claymore_stone");
		NameHandler.setNames(claymoreIron, "claymore_iron");
		NameHandler.setNames(claymoreGold, "claymore_gold");
		NameHandler.setNames(claymoreDiamond, "claymore_diamond");
		NameHandler.setNames(clawSwordWood, "claw_sword_wood");
		NameHandler.setNames(clawSwordStone, "claw_sword_stone");
		NameHandler.setNames(clawSwordIron, "claw_sword_iron");
		NameHandler.setNames(clawSwordGold, "claw_sword_gold");
		NameHandler.setNames(clawSwordDiamond, "claw_sword_diamond");
		NameHandler.setNames(longClaymoreWood, "long_claymore_wood");
		NameHandler.setNames(longClaymoreStone, "long_claymore_stone");
		NameHandler.setNames(longClaymoreIron, "long_claymore_iron");
		NameHandler.setNames(longClaymoreGold, "long_claymore_gold");
		NameHandler.setNames(longClaymoreDiamond, "long_claymore_diamond");
		NameHandler.setNames(fantasySwordWood, "fantasy_sword_wood");
		NameHandler.setNames(fantasySwordStone, "fantasy_sword_stone");
		NameHandler.setNames(fantasySwordIron, "fantasy_sword_iron");
		NameHandler.setNames(fantasySwordGold, "fantasy_sword_gold");
		NameHandler.setNames(fantasySwordDiamond, "fantasy_sword_diamond");
		NameHandler.setNames(lightBow, "light_bow");
		NameHandler.setNames(shadowBow, "shadow_bow");
		
		// Edo Period
		NameHandler.setNames(katanaWood, "katana_wood");
		NameHandler.setNames(katanaStone, "katana_stone");
		NameHandler.setNames(katanaIron, "katana_iron");
		NameHandler.setNames(katanaGold, "katana_gold");
		NameHandler.setNames(katanaDiamond, "katana_diamond");
		NameHandler.setNames(ninjatoWood, "ninjato_wood");
		NameHandler.setNames(ninjatoStone, "ninjato_stone");
		NameHandler.setNames(ninjatoIron, "ninjato_iron");
		NameHandler.setNames(ninjatoGold, "ninjato_gold");
		NameHandler.setNames(ninjatoDiamond, "ninjato_diamond");
		NameHandler.setNames(batonWood, "baton_wood");
		NameHandler.setNames(batonIron, "baton_iron");
		NameHandler.setNames(blowgun, "blowgun");
		NameHandler.setNames(kunai, "kunai");
		NameHandler.setNames(lash, "lash");
		NameHandler.setNames(nunchuckWood, "nunchuck_wood");
		NameHandler.setNames(nunchuckIron, "nunchuck_iron");
		NameHandler.setNames(throwingStar, "throwing_star");
		NameHandler.setNames(throwingKnifeIron, "throwing_knive_iron");
		NameHandler.setNames(throwingKnifeGold, "throwing_knive_gold");
		NameHandler.setNames(throwingKnifeDiamond, "throwing_knive_diamond");
		NameHandler.setNames(assassinHelmet, "assassin_helmet");
		NameHandler.setNames(assassinChestplate, "assassin_chestplate");
		NameHandler.setNames(assassinLeggings, "assassin_leggings");
		NameHandler.setNames(assassinBoots, "assassin_boots");
		NameHandler.setNames(ninjaHelmet, "ninja_helmet");
		NameHandler.setNames(ninjaChestplate, "ninja_chestplate");
		NameHandler.setNames(ninjaLeggings, "ninja_leggings");
		NameHandler.setNames(ninjaBoots, "ninja_boots");
		
		// Modern Age
		NameHandler.setNames(fieldGlasses, "field_glasses");
		NameHandler.setNames(nightVisionGoggles, "night_vision_goggles");
		NameHandler.setNames(taser, "taser");
		NameHandler.setNames(flameThrower, "flame_thrower");
		NameHandler.setNames(industrialMiner, "industrial_miner");
		NameHandler.setNames(industrialExcavator, "industrial_excavator");
		NameHandler.setNames(grenade, "grenade");
		NameHandler.setNames(grenadeFrag, "grenade_frag");
		NameHandler.setNames(grenadePoison, "grenade_poison");
		NameHandler.setNames(grenadeSmoke, "grenade_smoke");
		NameHandler.setNames(molotovCocktail, "molotov_cocktail");
		NameHandler.setNames(modernSoldierHelmet, "modern_soldier_helmet");
		NameHandler.setNames(modernSoldierChestplate, "modern_soldier_chestplate");
		NameHandler.setNames(modernSoldierLeggings, "modern_soldier_leggings");
		NameHandler.setNames(modernSoldierBoots, "modern_soldier_boots");
		
		// Future
		NameHandler.setNames(poisonThrower, "poison_thrower");
		NameHandler.setNames(industrialMultiTool, "industrial_multi_tool");
		NameHandler.setNames(waterThrower, "water_thrower");
		NameHandler.setNames(imploder, "imploder");
		NameHandler.setNames(futureSoldierHelmet, "future_soldier_helmet");
		NameHandler.setNames(futureSoldierChestplate, "future_soldier_chestplate");
		NameHandler.setNames(futureSoldierLeggings, "future_soldier_leggings");
		NameHandler.setNames(futureSoldierBoots, "future_soldier_boots");
		
		// Epic
		NameHandler.setNames(herobrineBow, "herobrine_bow");
		NameHandler.setNames(herobrineSword, "herobrine_sword");
		NameHandler.setNames(epicBattleAxe, "epic_battle_axe");
		NameHandler.setNames(epicKatana, "epic_katana");
		NameHandler.setNames(epicWaraxe, "epic_waraxe");
		NameHandler.setNames(legendarySword, "legendary_sword");
		NameHandler.setNames(masterAxe, "master_axe");
		NameHandler.setNames(masterPickaxe, "master_pickaxe");
		NameHandler.setNames(masterShovel, "master_shovel");
		NameHandler.setNames(masterSword, "master_sword");
		NameHandler.setNames(masterHelmet, "master_helmet");
		NameHandler.setNames(masterChestplate, "master_chestplate");
		NameHandler.setNames(masterLeggings, "master_leggings");
		NameHandler.setNames(masterBoots, "master_boots");
		NameHandler.setNames(paradoxStaff, "paradox_staff");
		NameHandler.setNames(sentinelGlave, "sentinel_glave");

		// Piracy
		NameHandler.setNames(castNet, "cast_net");
		NameHandler.setNames(grapplingHook, "grappling_hook");
		NameHandler.setNames(grapplingIron, "grappling_iron");
		NameHandler.setNames(harpoon, "harpoon");
		NameHandler.setNames(telescope, "telescope");
		NameHandler.setNames(macheteWood, "machete_wood");
		NameHandler.setNames(macheteStone, "machete_stone");
		NameHandler.setNames(macheteIron, "machete_iron");
		NameHandler.setNames(macheteGold, "machete_gold");
		NameHandler.setNames(macheteDiamond, "machete_diamond");
		NameHandler.setNames(saberWood, "saber_wood");
		NameHandler.setNames(saberStone, "saber_stone");
		NameHandler.setNames(saberIron, "saber_iron");
		NameHandler.setNames(saberGold, "saber_gold");
		NameHandler.setNames(saberDiamond, "saber_diamond");
		
/**		
		NameHandler.setNames(Wood, "_wood");
		NameHandler.setNames(Stone, "_stone");
		NameHandler.setNames(Iron, "_iron");
		NameHandler.setNames(Gold, "_gold");
		NameHandler.setNames(Diamond, "_diamond");
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
		
		registerItem(axeBladeWithered);
		registerItem(axeBladeDiamond);
		registerItem(axeBladeGold);
		registerItem(axeBladeIron);
		registerItem(axeBladeStone);
		registerItem(axeBladeWood);
		registerItem(swordBladeWithered);
		registerItem(swordBladeDiamond);
		registerItem(swordBladeGold);
		registerItem(swordBladeIron);
		registerItem(swordBladeStone);
		registerItem(swordBladeWood);
		registerItem(broadBladeWithered);
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
		registerItem(witheredIronIngot);
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
		registerItem(witheredIronShard);
		registerItem(glassShard);
		registerItem(cloth);
		registerItem(witherDust);
		registerItem(hammer);
		registerItem(tankFlame);
		registerItem(tankPoison);
		registerItem(tankWater);
		registerItem(machineCase);
		registerItem(concentratedGunpowder);
		registerItem(ammoSmall);
		registerItem(ammoBig);
		registerItem(ammoBundleSmall);
		registerItem(ammoBundleBig);
		registerItem(magazineSmall);
		registerItem(magazineLong);
		registerItem(magazineBig);
		registerItem(magazineDrum);
		registerItem(shotgunAmmo);
		registerItem(shotgunAmmo2);
		
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
		registerItem(scytheWood);
		registerItem(scytheStone);
		registerItem(scytheIron);
		registerItem(scytheGold);
		registerItem(scytheDiamond);
		registerItem(lanceWood);
		registerItem(lanceStone);
		registerItem(lanceIron);
		registerItem(lanceGold);
		registerItem(lanceDiamond);		
		registerItem(heavyStaffWood);
		registerItem(heavyStaffStone);
		registerItem(heavyStaffIron);
		registerItem(heavyStaffGold);
		registerItem(heavyStaffDiamond);
		
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
		registerItem(blankRifle);
		registerItem(gunHandle);
		registerItem(haftIron);
		registerItem(haftWood);
		registerItem(visor);
		registerItem(nails);
		registerItem(nailsToxic);
		registerItem(soldierHelmet);
		registerItem(soldierChestplate);
		registerItem(soldierLeggings);
		registerItem(soldierBoots);
		
		// Mystic
		registerItem(mysticKnive);
		registerItem(pufferfishStick);
		registerItem(scepterChanging);
		registerItem(scepterUnholy);
		registerItem(wandBasic);
		registerItem(wandNether);
		registerItem(wandAether);
		registerItem(wandHoly);
		registerItem(wandCurse);
		registerItem(wandMaelstrom);
		registerItem(wandStorm);
		registerItem(warhornDefensive);
		registerItem(warhornOffensive);
		
		// Fantasy
		registerItem(clawWood);
		registerItem(clawStone);
		registerItem(clawIron);
		registerItem(clawGold);
		registerItem(clawDiamond);
		registerItem(clawSwordWood);
		registerItem(clawSwordStone);
		registerItem(clawSwordIron);
		registerItem(clawSwordGold);
		registerItem(clawSwordDiamond);
		registerItem(claymoreWood);
		registerItem(claymoreStone);
		registerItem(claymoreIron);
		registerItem(claymoreGold);
		registerItem(claymoreDiamond);
		registerItem(longClaymoreWood);
		registerItem(longClaymoreStone);
		registerItem(longClaymoreIron);
		registerItem(longClaymoreGold);
		registerItem(longClaymoreDiamond);
		registerItem(fantasySwordWood);
		registerItem(fantasySwordStone);
		registerItem(fantasySwordIron);
		registerItem(fantasySwordGold);
		registerItem(fantasySwordDiamond);
		registerItem(lightBow);
		registerItem(shadowBow);
		
		// Edo Period
		registerItem(batonWood);
		registerItem(batonIron);
		registerItem(blowgun);
		registerItem(katanaWood);
		registerItem(katanaStone);
		registerItem(katanaIron);
		registerItem(katanaGold);
		registerItem(katanaDiamond);
		registerItem(throwingKnifeIron);
		registerItem(throwingKnifeGold);
		registerItem(throwingKnifeDiamond);
		registerItem(throwingStar);
		registerItem(kunai);
		registerItem(ninjatoWood);
		registerItem(ninjatoStone);
		registerItem(ninjatoIron);
		registerItem(ninjatoGold);
		registerItem(ninjatoDiamond);
		registerItem(nunchuckWood);
		registerItem(nunchuckIron);
		registerItem(lash);
		registerItem(assassinHelmet);
		registerItem(assassinChestplate);
		registerItem(assassinLeggings);
		registerItem(assassinBoots);
		registerItem(ninjaHelmet);
		registerItem(ninjaChestplate);
		registerItem(ninjaLeggings);
		registerItem(ninjaBoots);
		
		// Modern Age
		registerItem(fieldGlasses);
		registerItem(nightVisionGoggles);
		registerItem(taser);
		registerItem(flameThrower);
		registerItem(industrialMiner);
		registerItem(industrialExcavator);
		registerItem(grenade);
		registerItem(grenadeFrag);
		registerItem(grenadePoison);
		registerItem(grenadeSmoke);
		registerItem(molotovCocktail);
		registerItem(modernSoldierHelmet);
		registerItem(modernSoldierChestplate);
		registerItem(modernSoldierLeggings);
		registerItem(modernSoldierBoots);
		
		// Future
		registerItem(poisonThrower);
		registerItem(waterThrower);
		registerItem(industrialMultiTool);
		registerItem(imploder);
		registerItem(futureSoldierHelmet);
		registerItem(futureSoldierChestplate);
		registerItem(futureSoldierLeggings);
		registerItem(futureSoldierBoots);
		
		// Epic
		registerItem(masterHelmet);
		registerItem(masterChestplate);
		registerItem(masterLeggings);
		registerItem(masterBoots);
		registerItem(masterAxe);
		registerItem(masterPickaxe);
		registerItem(masterShovel);
		registerItem(masterSword);
		registerItem(legendarySword);
		registerItem(epicKatana);
		registerItem(epicWaraxe);
		registerItem(epicBattleAxe);
		registerItem(herobrineBow);
		registerItem(herobrineSword);
		registerItem(paradoxStaff);
		registerItem(sentinelGlave);
		
		registerItem(castNet);
		registerItem(grapplingIron);
		registerItem(grapplingHook);
		registerItem(harpoon);
		registerItem(telescope);
		registerItem(macheteWood);
		registerItem(macheteStone);
		registerItem(macheteIron);
		registerItem(macheteGold);
		registerItem(macheteDiamond);
		registerItem(saberWood);
		registerItem(saberStone);
		registerItem(saberIron);
		registerItem(saberGold);
		registerItem(saberDiamond);
		
/** TEMPLATE		
		registerItem(Wood);
		registerItem(Stone);
		registerItem(Iron);
		registerItem(Gold);
		registerItem(Diamond);
**/		

	}
	
	
	
	
	private static void registerItem(Item item) {
		ForgeRegistries.ITEMS.register(item);
	}


	
}
