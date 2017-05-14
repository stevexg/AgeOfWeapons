package magmasrc.ageofweapons.main;

import magmasrc.ageofweapons.items.*;
import magmasrc.ageofweapons.items.stoneage.*;
import magmasrc.ageofweapons.util.NameUtils;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModItems {
	
	
	/** Tool-Materials **/
	
	public static ToolMaterial rockToolMaterial;
	public static ToolMaterial handAxStoneToolMaterial;
	public static ToolMaterial cavemanKnifeStoneToolMaterial;
	
	
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
	
	// Stone Age
	public static Item rock;
	public static Item handAxStone;
	public static Item cavemanKnifeStone;
	
		
		


	

	public void init() {
		
		
		   /** Tool-Materials **/   
			/**
				Default Materials!
				WOOD(0, 59, 2.0F, 0.0F, 15),
				STONE(1, 131, 4.0F, 1.0F, 5),
				IRON(2, 250, 6.0F, 2.0F, 14),
				DIAMOND(3, 1561, 8.0F, 3.0F, 10),
				GOLD(0, 32, 12.0F, 0.0F, 22);
			 **/
   	    rockToolMaterial = EnumHelper.addToolMaterial("Rock", 0, 500, 3.0F, 0.0F, 20);
		handAxStoneToolMaterial = EnumHelper.addToolMaterial("handAxStone", 0, 400, 3.0F, 0.5F, 20);
		cavemanKnifeStoneToolMaterial = EnumHelper.addToolMaterial("cavemanKnifeStone", 0, 100, 3.0F, 1.0F, 20);

		
   	    
   	    
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
		
		
		// Stone Age
		rock = new ItemRock(rockToolMaterial);
		handAxStone = new ItemHandAxStone(handAxStoneToolMaterial);
		cavemanKnifeStone = new ItemCavemanKnifeStone(cavemanKnifeStoneToolMaterial);
		

		
		
		
		
		
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


		
		
		// Stone Age
		NameUtils.setNames(rock, "rock");
		NameUtils.setNames(handAxStone, "handaxstone");
		NameUtils.setNames(cavemanKnifeStone, "cavemanknifestone");

		
		
   	    

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
		registerItem(toxin);
		registerItem(radioactiveToxin);
		registerItem(diamondShard);
		registerItem(emeraldShard);
		registerItem(rubyShard);
		registerItem(sapphireShard);
		registerItem(goldShard);
		registerItem(ironShard);
		registerItem(stoneShard);
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
		registerItem(cavemanKnifeStone);
		
		
		
	
	}
	
	
	
	
	private void registerItem(Item item) {
		GameRegistry.register(item);
	}

	
}
