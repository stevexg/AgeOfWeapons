package magmasrc.ageofweapons.entity.render;

import magmasrc.ageofweapons.entity.EntityCastNet;
import magmasrc.ageofweapons.entity.model.ModelCastNet;
import magmasrc.ageofweapons.main.AgeOfWeapons;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class RenderCastNet extends Render<EntityCastNet> {

	private static final ResourceLocation NET = new ResourceLocation(AgeOfWeapons.MODID + ":textures/entity/cast_net.png");
	private ModelCastNet model = new ModelCastNet();		
	
	protected RenderCastNet(RenderManager renderManager) {
		super(renderManager);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityCastNet entity) {
		return NET;
	}
	
	@Override
	public void doRender(EntityCastNet entity, double x, double y, double z, float entityYaw, float partialTicks) {
		GL11.glPushMatrix();
		bindTexture(NET);
		GL11.glTranslated(x + 0.5F, y + 0.6F, z);
		GL11.glRotatef(180, 0, 0, 1);
		GL11.glRotatef(45, 0, 1, 0);
		model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}
}
