package magmasrc.ageofweapons.items;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.item.Item;

public class ItemToxin extends Item {
	
	public ItemToxin () {
		super();
		this.setCreativeTab(ModTabs.generalTab);
		this.setMaxStackSize(1);
	}

}
