package magmasrc.ageofweapons.entity.render;

import magmasrc.ageofweapons.entity.EntityMolotovCocktail;
import magmasrc.ageofweapons.entity.model.ModelMolotovCocktail;
import magmasrc.ageofweapons.main.AgeOfWeapons;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class RenderMolotovCocktail extends Render<EntityMolotovCocktail> {

	private static final ResourceLocation MOLOTOV = new ResourceLocation(AgeOfWeapons.MODID + ":textures/entity/molotov_cocktail.png");
	private ModelMolotovCocktail model = new ModelMolotovCocktail();		
	
	protected RenderMolotovCocktail(RenderManager renderManager) {
		super(renderManager);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityMolotovCocktail entity) {
		return MOLOTOV;
	}
	
	@Override
	public void doRender(EntityMolotovCocktail entity, double x, double y, double z, float entityYaw, float partialTicks) {
		GL11.glPushMatrix();
		bindTexture(MOLOTOV);
		GL11.glTranslated(x, y, z);
		GL11.glRotatef(180, 0, 0, 1);
		model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}
}
