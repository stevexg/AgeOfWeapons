package magmasrc.ageofweapons.main;

import magmasrc.ageofweapons.items.*;
import magmasrc.ageofweapons.util.NameUtils;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModItems {
	
	
	
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
		
		


	

	public void init() {
		
		
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
		
		
		
	
	}
	
	
	
	
	private void registerItem(Item item) {
		GameRegistry.register(item);
	}

	
}
