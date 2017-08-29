package magmasrc.ageofweapons.entity.render;

import magmasrc.ageofweapons.entity.EntityDynamite;
import magmasrc.ageofweapons.main.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderRegistry {
/**	
	public static void registerEntityRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(EntityDynamite.class, new IRenderFactory<EntityDynamite>() {

			@Override
			public Render<? super EntityDynamite> createRenderFor(RenderManager manager) {
				return new RenderSnowball<EntityDynamite>(manager, ModItems.dynamite, Minecraft.getMinecraft().getRenderItem());
			}
		});;
	}
**/                              //old
	
	
	
	public static void registerEntityRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(EntityDynamite.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderSnowball<EntityDynamite>(manager, ModItems.dynamite, Minecraft.getMinecraft().getRenderItem());
			}
		});
	}	
	
}
