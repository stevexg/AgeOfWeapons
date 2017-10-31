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

public class EntityGrenadeSmoke extends EntityThrowable {

	public EntityGrenadeSmoke(World worldIn) {
		super(worldIn);
	}
	
	public EntityGrenadeSmoke(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);
	}
	
	@SideOnly(Side.CLIENT)
	public EntityGrenadeSmoke(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}
	
	public static void registerFixesGrenade(DataFixer fixer) {
		EntityThrowable.registerFixesThrowable(fixer, "GrenadeSmoke");
	}

	
	@Override
	public void onImpact(RayTraceResult result) {
		     if (result.entityHit instanceof Entity) {
		            int i = 1;
		     }

		        if (!world.isRemote) {       
		    	    	EntityAreaEffectCloud cloud = new EntityAreaEffectCloud(world, posX, posY, posZ);
		    	        	cloud.setDuration(1000);
		    	        	cloud.setRadius(10);
		    	        	cloud.setParticle(EnumParticleTypes.SMOKE_LARGE);
		    	    	world.spawnEntity(cloud);
		    	    	world.spawnEntity(cloud);
		    	    	EntityAreaEffectCloud cloud1 = new EntityAreaEffectCloud(world, posX, posY + 1, posZ);
		    	        	cloud1.setDuration(990);
		    	        	cloud1.setRadius(10);
		    	        	cloud1.setParticle(EnumParticleTypes.SMOKE_LARGE);
		    	    	world.spawnEntity(cloud1);
		    	    	world.spawnEntity(cloud1);	
		    	    	EntityAreaEffectCloud cloud2 = new EntityAreaEffectCloud(world, posX, posY + 2, posZ);
		    	        	cloud2.setDuration(980);
		    	        	cloud2.setRadius(9);
		    	        	cloud2.setParticle(EnumParticleTypes.SMOKE_LARGE);
		    	    	world.spawnEntity(cloud2);
		    	    	EntityAreaEffectCloud cloud3 = new EntityAreaEffectCloud(world, posX, posY + 3, posZ);
		    	        	cloud3.setDuration(970);
		    	        	cloud3.setRadius(8);
		    	        	cloud3.setParticle(EnumParticleTypes.SMOKE_LARGE);
		    	    	world.spawnEntity(cloud3);
		    	    this.world.setEntityState(this, (byte)1);
		            this.setDead();
		        }
		    }	
}
