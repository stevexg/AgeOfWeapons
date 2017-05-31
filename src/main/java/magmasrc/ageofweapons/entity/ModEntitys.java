package magmasrc.ageofweapons.entity;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntitys {
	
	public static int cavemanSpear = 0;
	
	
	
	
	public ModEntitys(){
		register();
	}
	
	
	private void register() {
		EntityRegistry.registerModEntity(null, EntityCavemanSpear.class, "caveman_spear", cavemanSpear, AgeOfWeapons.instance, 64, 1, true);
	}

}
