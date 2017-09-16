package magmasrc.ageofweapons.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityDynamite extends EntityThrowable {

	public EntityDynamite(World worldIn) {
		super(worldIn);
	}
	
	public EntityDynamite(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);
	}
	
	@SideOnly(Side.CLIENT)
	public EntityDynamite(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}
	
	public static void registerFixesDynamite(DataFixer fixer) {
		EntityThrowable.registerFixesThrowable(fixer, "Dynamite");
	}

	
	@Override
	public void onImpact(RayTraceResult result) {
		     if (result.entityHit instanceof Entity) {
		            int i = 1;
		            }

		        if (!world.isRemote) {
					this.world.createExplosion(this, posX, posY, posZ, 2.0F, true);
		            this.world.setEntityState(this, (byte)1);
		            this.setDead();
		        }
		    }


	@Override
	public void onUpdate() {
		super.onUpdate();
		if (this.world.isRemote && !this.inGround) { // z +1 
			this.world.spawnParticle(EnumParticleTypes.LAVA, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D, new int[0]);
    		}
	}
	
	
}
