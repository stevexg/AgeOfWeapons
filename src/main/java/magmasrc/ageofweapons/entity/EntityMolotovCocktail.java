package magmasrc.ageofweapons.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAreaEffectCloud;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityMolotovCocktail extends EntityThrowable {

	public EntityMolotovCocktail(World worldIn) {
		super(worldIn);
	}
	
	public EntityMolotovCocktail(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);
	}
	
	@SideOnly(Side.CLIENT)
	public EntityMolotovCocktail(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}
	
	public static void registerFixesGrenade(DataFixer fixer) {
		EntityThrowable.registerFixesThrowable(fixer, "MolotovCocktail");
	}

	
	@Override
	public void onImpact(RayTraceResult result) {
	     if (result.entityHit instanceof Entity) {
	            int i = 1;
	     }
		     BlockPos pos = new BlockPos(posX, posY, posZ);
		     
		                    world.setBlockState(pos.add(0, 0, 0), Blocks.FIRE.getDefaultState(), 11);
		                    world.setBlockState(pos.add(1, 0, 0), Blocks.FIRE.getDefaultState(), 11);
		                    world.setBlockState(pos.add(0, 0, 1), Blocks.FIRE.getDefaultState(), 11);
		                    world.setBlockState(pos.add(-1, 0, 0), Blocks.FIRE.getDefaultState(), 11);
		                    world.setBlockState(pos.add(0, 0, -1), Blocks.FIRE.getDefaultState(), 11);
		                    
		                    world.setBlockState(pos.add(2, 0, 0), Blocks.FIRE.getDefaultState(), 11);
		                    world.setBlockState(pos.add(0, 0, 2), Blocks.FIRE.getDefaultState(), 11);
		                    world.setBlockState(pos.add(-2, 0, 0), Blocks.FIRE.getDefaultState(), 11);
		                    world.setBlockState(pos.add(0, 0, -2), Blocks.FIRE.getDefaultState(), 11);
		                    
		                    world.setBlockState(pos.add(2, 0, 1), Blocks.FIRE.getDefaultState(), 11);
		                    world.setBlockState(pos.add(1, 0, 2), Blocks.FIRE.getDefaultState(), 11);
		                    world.setBlockState(pos.add(-2, 0, 1), Blocks.FIRE.getDefaultState(), 11);
		                    world.setBlockState(pos.add(1, 0, -2), Blocks.FIRE.getDefaultState(), 11);
	    	                    
		            if(!world.isRemote) {        
		            	EntityAreaEffectCloud cloud = new EntityAreaEffectCloud(world, posX, posY, posZ);
		            	    cloud.setDuration(100);
		            	    cloud.setRadius(2.0F);
		            	    cloud.setParticle(EnumParticleTypes.LAVA);
		            	    world.spawnEntity(cloud);
		            }
				        this.world.setEntityState(this, (byte)1);		            	    
		            	this.setDead();
		    }	
}
