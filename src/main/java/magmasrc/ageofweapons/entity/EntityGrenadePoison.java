package magmasrc.ageofweapons.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAreaEffectCloud;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityGrenadePoison extends EntityThrowable {

	public EntityGrenadePoison(World worldIn) {
		super(worldIn);
	}
	
	public EntityGrenadePoison(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);
	}
	
	@SideOnly(Side.CLIENT)
	public EntityGrenadePoison(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}
	
	public static void registerFixesGrenade(DataFixer fixer) {
		EntityThrowable.registerFixesThrowable(fixer, "GrenadePoison");
	}

	
	@Override
	public void onImpact(RayTraceResult result) {
	     if (result.entityHit instanceof Entity) {
	            int i = 1;
	     }
		        if (!world.isRemote) {
					this.world.createExplosion(this, posX, posY, posZ, 1.0F, true);  
					EntityAreaEffectCloud cloud = new EntityAreaEffectCloud(world, posX, posY, posZ);
					cloud.setDuration(50);
		    	    cloud.setRadius(8F);
		    	    cloud.setColor(0x2ecc71);
			    	cloud.addEffect(new PotionEffect(MobEffects.POISON, 500, 1));
		    	    world.spawnEntity(cloud);
					EntityAreaEffectCloud cloud1 = new EntityAreaEffectCloud(world, posX + 1, posY, posZ);
					cloud1.setDuration(50);
		    	    cloud1.setRadius(8F);
		    	    cloud1.setColor(0x2ecc71);
			    	cloud1.addEffect(new PotionEffect(MobEffects.POISON, 500, 1));
		    	    world.spawnEntity(cloud1);
		            this.world.setEntityState(this, (byte)1);
		            this.setDead();
		        }
		    }	
}
