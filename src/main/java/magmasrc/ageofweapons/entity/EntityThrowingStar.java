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

public class EntityThrowingStar extends EntityThrowable {

	public EntityThrowingStar(World worldIn) {
		super(worldIn);
	}
	
	
	public EntityThrowingStar(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);
	}

	
	@Override
	public void onImpact(RayTraceResult result) {
		     if (result.entityHit instanceof Entity) {
		            int i = 1;

		            result.entityHit.attackEntityFrom(DamageSource.GENERIC, 1.0F);
		        }

		        if (!this.world.isRemote) {
		            this.world.setEntityState(this, (byte)1);
		            this.setDead();
		        }
	}


	@SideOnly(Side.CLIENT)
	public EntityThrowingStar(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}
	
	public static void registerFix(DataFixer fixer) {
		EntityThrowable.registerFixesThrowable(fixer, "ThrowingStar");
	}
	
}
