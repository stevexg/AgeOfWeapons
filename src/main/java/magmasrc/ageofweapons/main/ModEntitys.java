package magmasrc.ageofweapons.main;

import magmasrc.ageofweapons.entity.EntityDynamite;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntitys {
	
	public static void registerEntities(){
		EntityRegistry.registerModEntity(new ModelResourceLocation(AgeOfWeapons.MODID + ":dynamite"), EntityDynamite.class, "Dynamite", 0, AgeOfWeapons.instance, 64, 1, true);
	}
	
	

/**
	
	private void register() {
		//ResourceLocation loc = new ResourceLocation(AgeOfWeapons.MODID, "dynamite");    test
		EntityRegistry.registerModEntity(new ResourceLocation(AgeOfWeapons.MODID, "textures/items/earlymodernage/dynamite.png"), EntityDynamite.class, "dynamite", dynamite, AgeOfWeapons.instance, 64, 1, true);			
	}
**/
}
