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
	
	public static ToolMaterial Rock;
	
	
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
	
	public static Item bladeAxeDiamond;
	public static Item bladeAxeGold;
	public static Item bladeAxeIron;
	public static Item bladeAxeStone;
	public static Item bladeAxeWood;
	public static Item bladeSwordDiamond;
	public static Item bladeSwordGold;
	public static Item bladeSwordIron;
	public static Item bladeSwordStone;
	public static Item bladeSwordWood;
	public static Item bladeBroadSwordDiamond;
	public static Item bladeBroadSwordGold;
	public static Item bladeBroadSwordIron;
	public static Item bladeBroadSwordStone;
	public static Item bladeBroadSwordWood;
	
	// Stone Age
	public static Item rock;
	
		
		


	

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
		//           			  name, harvestLvl, maxUses, efficienz, damage, enchant 
   	    Rock = EnumHelper.addToolMaterial("Rock", 0, 110, 3.0F, 0.5F, 20);

		
   	    
   	    
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
		
		// Stone Age
		rock = new ItemRock(Rock);
		

		
		
		
		
		
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
		
		// Stone Age
		NameUtils.setNames(rock, "rock");

		
		
   	    

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
		
		// Stone Age
		registerItem(rock);
		
		
		
	
	}
	
	
	
	
	private void registerItem(Item item) {
		GameRegistry.register(item);
	}

	
}
