package magmasrc.ageofweapons.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityGrenadeFrag extends EntityThrowable {

	public EntityGrenadeFrag(World worldIn) {
		super(worldIn);
	}
	
	public EntityGrenadeFrag(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);
	}
	
	@SideOnly(Side.CLIENT)
	public EntityGrenadeFrag(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}
	
	public static void registerFixesGrenade(DataFixer fixer) {
		EntityThrowable.registerFixesThrowable(fixer, "GrenadeFrag");
	}

	
	@Override
	public void onImpact(RayTraceResult result) {
		     if (result.entityHit instanceof Entity) {
		            int i = 1;
		            }

		        if (!world.isRemote) {
					this.world.createExplosion(this, posX, posY, posZ, 5.0F, true);
					
					try {
						Thread.sleep(350);
						this.world.createExplosion(this, posX + 5, posY, posZ, 3.0F, true);
						this.world.createExplosion(this, posX - 5, posY, posZ, 3.0F, true);
						this.world.createExplosion(this, posX, posY, posZ + 5, 3.0F, true);
						this.world.createExplosion(this, posX, posY, posZ - 5, 3.0F, true);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

		            this.world.setEntityState(this, (byte)1);
		            this.setDead();
		        }
		    }	
}
