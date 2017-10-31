package magmasrc.ageofweapons.entity.render;

import magmasrc.ageofweapons.entity.EntityThrowWood;
import magmasrc.ageofweapons.entity.model.ModelThrowWood;
import magmasrc.ageofweapons.main.AgeOfWeapons;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class RenderThrowWood extends Render<EntityThrowWood> {

	private static final ResourceLocation THROWWOOD = new ResourceLocation(AgeOfWeapons.MODID + ":textures/entity/throw_wood.png");
	private ModelThrowWood model = new ModelThrowWood();		
	
	protected RenderThrowWood(RenderManager renderManager) {
		super(renderManager);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityThrowWood entity) {
		return THROWWOOD;
	}
	
	@Override
	public void doRender(EntityThrowWood entity, double x, double y, double z, float entityYaw, float partialTicks) {
		GL11.glPushMatrix();
		bindTexture(THROWWOOD);
		GL11.glTranslated(x, y - 0.3, z);
        GlStateManager.rotate(entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * partialTicks - 90.0F, 0.0F, 1.0F, 0.0F);
        GlStateManager.rotate(entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * partialTicks, 0.0F, 0.0F, 1.0F);
		model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}
}
