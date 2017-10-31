package magmasrc.ageofweapons.items.modernage;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.item.Item;

public class ItemMagazineLong extends Item {
	
	public ItemMagazineLong () {
		super();
        if(AgeOfWeapons.activateOnlyOneTab){
        	this.setCreativeTab(ModTabs.generalTab);
        } else {
        	this.setCreativeTab(ModTabs.modernAgeTab);
        }		}

}
