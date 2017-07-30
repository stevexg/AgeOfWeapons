package magmasrc.ageofweapons.items;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.item.Item;

public class ItemBlankRifle extends Item {
	
	public ItemBlankRifle () {
		super();
		this.setCreativeTab(ModTabs.earlyModernAgeTab);
		this.setMaxStackSize(16);
	}

}
