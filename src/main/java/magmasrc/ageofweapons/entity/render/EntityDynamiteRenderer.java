package magmasrc.ageofweapons.entity.render;

import magmasrc.ageofweapons.entity.EntityDynamite;
import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

public class EntityDynamiteRenderer extends Render<EntitySnowball>{

    public static Factory FACTORY = new Factory();

    protected EntityDynamiteRenderer(RenderManager renderManager) {
        super(renderManager);
    }


	@Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntitySnowball entity) {
        return new ResourceLocation(AgeOfWeapons.MODID, "textures/items/earlymodernage/dynamite.png");
    }

    public static class Factory implements IRenderFactory<EntityDynamite>{

/**        @Override
        public Render<? super EntityDynamite> createRenderFor(RenderManager manager) {
            return new EntityDynamiteRenderer(manager);
        }
**/

		@Override
		public Render createRenderFor(RenderManager manager) {
			return new RenderSnowball<EntityDynamite>(manager, ModItems.dynamite, Minecraft.getMinecraft().getRenderItem());
		}
	};
    	
}