package magmasrc.ageofweapons.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityThrowingDiamondKnive extends EntityThrowable{

	public EntityThrowingDiamondKnive(World worldIn) {
		super(worldIn);
	}
	
	
	public EntityThrowingDiamondKnive(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);
	}

	
	@Override
	public void onImpact(RayTraceResult result) {
	
		     if (result.entityHit instanceof Entity) {
		            int i = 1;

		            result.entityHit.attackEntityFrom(DamageSource.GENERIC, 3.0F);
		        }

		        if (!this.world.isRemote) {
		            this.world.setEntityState(this, (byte)1);
		            this.setDead();
		        }
		    }

	
	
	@Override
	public void onUpdate() {
		super.onUpdate();
		
		if (!this.world.isRemote && !this.inGround) {
			this.world.spawnParticle(EnumParticleTypes.CRIT, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D, new int[0]);
		}
	}
	
	
}
