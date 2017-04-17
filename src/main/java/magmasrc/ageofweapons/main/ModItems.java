package magmasrc.ageofweapons.main;

import magmasrc.ageofweapons.items.*;
import magmasrc.ageofweapons.util.NameUtils;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModItems {
	
	
	
	public static Item upgradeCreative;
		
		


	

	public void init() {
		
		
		upgradeCreative = new ItemUpgradeCreative();
		
		
		
		
		
		
		
		NameUtils.setNames(upgradeCreative, "upgrade_creative");
		
		
		
		
   	    

	}
	

	
	
	public void register() {
		

		registerItem(upgradeCreative);
		
		
		
	
	}
	
	
	
	
	private void registerItem(Item item) {
		GameRegistry.register(item);
	}

	
}
