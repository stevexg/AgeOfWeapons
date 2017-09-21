package magmasrc.ageofweapons.entity.render;

import magmasrc.ageofweapons.entity.EntityGrenadePoison;
import magmasrc.ageofweapons.entity.model.ModelGrenadePoison;
import magmasrc.ageofweapons.main.AgeOfWeapons;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class RenderGrenadePoison extends Render<EntityGrenadePoison> {

	private static final ResourceLocation GRENADE = new ResourceLocation(AgeOfWeapons.MODID + ":textures/entity/grenade_poison.png");
	private ModelGrenadePoison model = new ModelGrenadePoison();		
	
	protected RenderGrenadePoison(RenderManager renderManager) {
		super(renderManager);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityGrenadePoison entity) {
		return GRENADE;
	}
	
	@Override
	public void doRender(EntityGrenadePoison entity, double x, double y, double z, float entityYaw, float partialTicks) {
		GL11.glPushMatrix();
		bindTexture(GRENADE);
		GL11.glTranslated(x, y, z);
		GL11.glRotatef(180, 0, 0, 1);
		model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}
}
