package magmasrc.ageofweapons.blocks;

import java.util.List;

import javax.annotation.Nullable;

import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAreaEffectCloud;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.mojang.realmsclient.gui.ChatFormatting;

public class BlockToxicMine extends Block {
	
	
    protected static final AxisAlignedBB TRAP_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.10D, 1.0D);


	public BlockToxicMine() {
		super(Material.CORAL);
		this.setCreativeTab(ModTabs.earlyModernAgeTab);
		this.setHardness(1.0F);
		this.setResistance(1.0F);
		this.setSoundType(SoundType.METAL);	
		this.setHarvestLevel("shovel", 0);
		this.setLightOpacity(1);
	}
	
	
	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		if (!worldIn.isRemote) {
			entityIn.attackEntityFrom(DamageSource.GENERIC, 2.0F);
			worldIn.createExplosion(entityIn, pos.getX(), pos.getY(), pos.getZ(), 2, true);
			
	    	EntityAreaEffectCloud cloud = new EntityAreaEffectCloud(worldIn, pos.getX(), pos.getY()+ 0.5F, pos.getZ());
	    	cloud.addEffect(new PotionEffect(MobEffects.POISON, 280, 1));
	    	cloud.setDuration(50);
	    	cloud.setRadius(10);
	    	cloud.setColor(0x27ae60);
	    	cloud.setWaitTime(10);
	    	worldIn.spawnEntity(cloud);
		}
    }
	
	
  	@Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        return NULL_AABB;
    }
    
    
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return TRAP_AABB;
    }

    
    @Override
    public boolean isFullCube(IBlockState state){
        return false;
    }

  
    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }
	
}