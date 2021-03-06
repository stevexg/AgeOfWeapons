package magmasrc.ageofweapons.entity.render;

import magmasrc.ageofweapons.entity.EntityHarpoon;
import magmasrc.ageofweapons.entity.model.ModelHarpoon;
import magmasrc.ageofweapons.main.AgeOfWeapons;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class RenderHarpoon extends Render<EntityHarpoon> {

	private static final ResourceLocation HARPOON = new ResourceLocation(AgeOfWeapons.MODID + ":textures/entity/harpoon.png");
	private ModelHarpoon model = new ModelHarpoon();		
	
	protected RenderHarpoon(RenderManager renderManager) {
		super(renderManager);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityHarpoon entity) {
		return HARPOON;
	}
	
	@Override
	public void doRender(EntityHarpoon entity, double x, double y, double z, float entityYaw, float partialTicks) {
		GL11.glPushMatrix();
		bindTexture(HARPOON);
		GL11.glTranslated(x - 0.5F, y, z);
        GlStateManager.rotate(entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * partialTicks - 90.0F, 0.0F, 1.0F, 0.0F);
        GlStateManager.rotate(entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * partialTicks, 0.0F, 0.0F, 1.0F);
		model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}
}
