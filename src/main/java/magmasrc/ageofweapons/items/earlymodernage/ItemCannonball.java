package magmasrc.ageofweapons.items.earlymodernage;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.item.Item;

public class ItemCannonball extends Item {
	
	public ItemCannonball () {
		super();
		this.setMaxStackSize(32);
        if(AgeOfWeapons.activateOnlyOneTab){
        	this.setCreativeTab(ModTabs.generalTab);
        } else {
        	this.setCreativeTab(ModTabs.earlyModernAgeTab);
        }
	}

}
