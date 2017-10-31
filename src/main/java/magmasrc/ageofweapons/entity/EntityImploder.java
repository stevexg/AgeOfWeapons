package magmasrc.ageofweapons.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityImploder extends EntityThrowable {

	public EntityImploder(World worldIn) {
		super(worldIn);
	}
	
	public EntityImploder(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);
	}
	
	@SideOnly(Side.CLIENT)
	public EntityImploder(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}
	
	public static void registerFixesGrenade(DataFixer fixer) {
		EntityThrowable.registerFixesThrowable(fixer, "Imploder");
	}

	
	@Override
	public void onImpact(RayTraceResult result) {
		     if (result.entityHit instanceof Entity) {
		            int i = 1;
		            }

		        if (!world.isRemote) {
					this.world.createExplosion(this, posX, posY, posZ, 15.0F, true);
		            this.world.setEntityState(this, (byte)1);
		            this.setDead();
		        }
		    }	
}
