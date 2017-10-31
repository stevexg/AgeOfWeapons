package magmasrc.ageofweapons.entity.render;

import magmasrc.ageofweapons.entity.EntityDynamite;
import magmasrc.ageofweapons.entity.EntityThrowingStar;
import magmasrc.ageofweapons.entity.model.ModelDynamite;
import magmasrc.ageofweapons.entity.model.ModelThrowingStar;
import magmasrc.ageofweapons.main.AgeOfWeapons;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class RenderThrowingStar extends Render<EntityThrowingStar> {

	private static final ResourceLocation THROWINGSTAR = new ResourceLocation(AgeOfWeapons.MODID + ":textures/entity/throwing_star.png");
	private ModelThrowingStar model = new ModelThrowingStar();		
	
	protected RenderThrowingStar(RenderManager renderManager) {
		super(renderManager);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityThrowingStar entity) {
		return THROWINGSTAR;
	}
	
	@Override
	public void doRender(EntityThrowingStar entity, double x, double y, double z, float entityYaw, float partialTicks) {
		GL11.glPushMatrix();
		bindTexture(THROWINGSTAR);
		GL11.glTranslated(x + 0.5F, y + 0.6F, z);
		GL11.glRotatef(180, 0, 1, 1);
		model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}
}
