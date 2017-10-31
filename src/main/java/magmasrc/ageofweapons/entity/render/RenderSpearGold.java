package magmasrc.ageofweapons.entity.render;

import magmasrc.ageofweapons.entity.EntitySpearGold;
import magmasrc.ageofweapons.entity.EntitySpearIron;
import magmasrc.ageofweapons.entity.model.ModelSpearGold;
import magmasrc.ageofweapons.main.AgeOfWeapons;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class RenderSpearGold extends Render<EntitySpearGold> {

	private static final ResourceLocation SPEAR = new ResourceLocation(AgeOfWeapons.MODID + ":textures/entity/spear_gold.png");
	private ModelSpearGold model = new ModelSpearGold();		
	
	protected RenderSpearGold(RenderManager renderManager) {
		super(renderManager);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntitySpearGold entity) {
		return SPEAR;
	}
	
	@Override
	public void doRender(EntitySpearGold entity, double x, double y, double z, float entityYaw, float partialTicks) {
		GL11.glPushMatrix();
		bindTexture(SPEAR);
		GL11.glTranslated(x - 0.5F, y, z);
        GlStateManager.rotate(entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * partialTicks - 90.0F, 0.0F, 1.0F, 0.0F);
        GlStateManager.rotate(entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * partialTicks, 0.0F, 0.0F, 1.0F);
		model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}
}
