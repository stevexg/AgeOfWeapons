package magmasrc.ageofweapons.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAreaEffectCloud;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityCastNet extends EntityThrowable {

	public EntityCastNet(World worldIn) {
		super(worldIn);
	}
	
	
	public EntityCastNet(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);
	}

	
	@Override
	public void onImpact(RayTraceResult result) { 
	     if (result.entityHit instanceof Entity) {
	            int i = 1;
	            
	    	    if(!world.isRemote) {        
	    	    	EntityAreaEffectCloud cloud = new EntityAreaEffectCloud(world, result.entityHit.getPosition().getX(), result.entityHit.getPosition().getY(), result.entityHit.getPosition().getZ());
	    	        cloud.setDuration(5);
	    	    	cloud.setRadius(1.5F);
	    	    	cloud.setParticle(EnumParticleTypes.TOWN_AURA);
	    	    	cloud.addEffect(new PotionEffect(MobEffects.SLOWNESS, 200, 3));
	    	    	world.spawnEntity(cloud);
	    	    } 
	    	    } else {
		    	    if(!world.isRemote) {        
		    	    	EntityAreaEffectCloud cloud = new EntityAreaEffectCloud(world, result.getBlockPos().getX(), result.getBlockPos().getY(), result.getBlockPos().getZ());
		    	        cloud.setDuration(5);
		    	    	cloud.setRadius(1);
		    	    	cloud.setParticle(EnumParticleTypes.TOWN_AURA);
		    	    	cloud.addEffect(new PotionEffect(MobEffects.SLOWNESS, 150, 0));
		    	    	world.spawnEntity(cloud);
		    	    }
		            this.world.setEntityState(this, (byte)1);
		            this.setDead();
		        }
	}


	

	@SideOnly(Side.CLIENT)
	public EntityCastNet(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}
	
	public static void registerFix(DataFixer fixer) {
		EntityThrowable.registerFixesThrowable(fixer, "CastNet");
	}
	
}
