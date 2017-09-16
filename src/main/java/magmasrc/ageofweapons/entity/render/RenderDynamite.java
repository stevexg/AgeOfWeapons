package magmasrc.ageofweapons.entity.render;

import org.lwjgl.opengl.GL11;

import magmasrc.ageofweapons.entity.EntityDynamite;
import magmasrc.ageofweapons.entity.model.ModelDynamite;
import magmasrc.ageofweapons.main.AgeOfWeapons;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDynamite extends Render<EntityDynamite> {

	private static final ResourceLocation DYNAMITE = new ResourceLocation(AgeOfWeapons.MODID + ":textures/entity/dynamite.png");
	private ModelDynamite model = new ModelDynamite();		
	
	protected RenderDynamite(RenderManager renderManager) {
		super(renderManager);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityDynamite entity) {
		return DYNAMITE;
	}
	
	@Override
	public void doRender(EntityDynamite entity, double x, double y, double z, float entityYaw, float partialTicks) {
		GL11.glPushMatrix();
		bindTexture(DYNAMITE);
		GL11.glTranslated(x, y, z);
		GL11.glRotatef(180, 0, 0, 1);
		model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}
}
