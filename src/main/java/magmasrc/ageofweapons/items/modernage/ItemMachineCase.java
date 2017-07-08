package magmasrc.ageofweapons.items.modernage;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.item.Item;

public class ItemMachineCase extends Item {
	
	public ItemMachineCase () {
		super();
		this.setCreativeTab(ModTabs.modernAgeTab);
		this.setMaxStackSize(16);
	}

}
