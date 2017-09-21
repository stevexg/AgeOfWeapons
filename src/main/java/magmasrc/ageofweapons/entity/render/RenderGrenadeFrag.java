package magmasrc.ageofweapons.entity.render;

import magmasrc.ageofweapons.entity.EntityGrenadeFrag;
import magmasrc.ageofweapons.entity.model.ModelGrenadeFrag;
import magmasrc.ageofweapons.main.AgeOfWeapons;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class RenderGrenadeFrag extends Render<EntityGrenadeFrag> {

	private static final ResourceLocation GRENADE = new ResourceLocation(AgeOfWeapons.MODID + ":textures/entity/grenade_frag.png");
	private ModelGrenadeFrag model = new ModelGrenadeFrag();		
	
	protected RenderGrenadeFrag(RenderManager renderManager) {
		super(renderManager);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityGrenadeFrag entity) {
		return GRENADE;
	}
	
	@Override
	public void doRender(EntityGrenadeFrag entity, double x, double y, double z, float entityYaw, float partialTicks) {
		GL11.glPushMatrix();
		bindTexture(GRENADE);
		GL11.glTranslated(x, y, z);
		GL11.glRotatef(180, 0, 0, 1);
		model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}
}
