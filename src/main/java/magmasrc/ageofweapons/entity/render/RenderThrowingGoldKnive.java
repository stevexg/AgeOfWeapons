package magmasrc.ageofweapons.entity.render;

import magmasrc.ageofweapons.entity.EntityThrowingGoldKnive;
import magmasrc.ageofweapons.entity.model.ModelThrowingGoldKnive;
import magmasrc.ageofweapons.main.AgeOfWeapons;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class RenderThrowingGoldKnive extends Render<EntityThrowingGoldKnive> {

	private static final ResourceLocation KNIVE = new ResourceLocation(AgeOfWeapons.MODID + ":textures/entity/throwing_knive_gold.png");
	private ModelThrowingGoldKnive model = new ModelThrowingGoldKnive();		
	
	protected RenderThrowingGoldKnive(RenderManager renderManager) {
		super(renderManager);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityThrowingGoldKnive entity) {
		return KNIVE;
	}
	
	@Override
	public void doRender(EntityThrowingGoldKnive entity, double x, double y, double z, float entityYaw, float partialTicks) {
		GL11.glPushMatrix();
		bindTexture(KNIVE);
		GL11.glTranslated(x, y - 0.3, z);
        GlStateManager.rotate(entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * partialTicks - 90.0F, 0.0F, 1.0F, 0.0F);
        GlStateManager.rotate(entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * partialTicks, 0.0F, 0.0F, 1.0F);
		model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}
}
