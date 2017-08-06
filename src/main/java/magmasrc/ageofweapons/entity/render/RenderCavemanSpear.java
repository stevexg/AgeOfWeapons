package magmasrc.ageofweapons.entity.render;

import magmasrc.ageofweapons.entity.EntityCavemanSpear;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
/**
@SideOnly(Side.CLIENT)
public class RenderCavemanSpear extends RenderArrow<EntityCavemanSpear>{

	public static final ResourceLocation res = new ResourceLocation("textures/entity/objects.png");
	
	public RenderCavemanSpear(RenderManager rm) {
		super(rm);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityCavemanSpear entity) {
		return res;
	}
	

}**/
