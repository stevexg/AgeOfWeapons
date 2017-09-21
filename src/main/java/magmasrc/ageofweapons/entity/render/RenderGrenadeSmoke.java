package magmasrc.ageofweapons.entity.render;

import magmasrc.ageofweapons.entity.EntityGrenadeSmoke;
import magmasrc.ageofweapons.entity.model.ModelGrenadeSmoke;
import magmasrc.ageofweapons.main.AgeOfWeapons;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class RenderGrenadeSmoke extends Render<EntityGrenadeSmoke> {

	private static final ResourceLocation GRENADE = new ResourceLocation(AgeOfWeapons.MODID + ":textures/entity/grenade_smoke.png");
	private ModelGrenadeSmoke model = new ModelGrenadeSmoke();		
	
	protected RenderGrenadeSmoke(RenderManager renderManager) {
		super(renderManager);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityGrenadeSmoke entity) {
		return GRENADE;
	}
	
	@Override
	public void doRender(EntityGrenadeSmoke entity, double x, double y, double z, float entityYaw, float partialTicks) {
		GL11.glPushMatrix();
		bindTexture(GRENADE);
		GL11.glTranslated(x, y, z);
		GL11.glRotatef(180, 0, 0, 1);
		model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}
}
