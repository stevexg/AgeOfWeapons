package magmasrc.ageofweapons.blocks;

import java.util.List;
import java.util.Random;

import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.mojang.realmsclient.gui.ChatFormatting;

public class BlockWitheredIron extends Block {

	public BlockWitheredIron() {
		super(Material.IRON);
		this.setCreativeTab(ModTabs.generalTab);
		this.setHardness(5.0F);
		this.setResistance(10.0F);
		this.setSoundType(SoundType.STONE);	
	}
	
	
	

	protected static final AxisAlignedBB CUSTOM_COLLISION_AABB = new AxisAlignedBB(
			0.0625D, 0.0625D, 0.0625D, 0.9375D, 0.9375D, 0.9375D);
	

	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return CUSTOM_COLLISION_AABB;
	}
	

	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		if (entityIn instanceof EntityPlayer && !worldIn.isRemote) {
			EntityPlayer player = (EntityPlayer) entityIn;
			player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 100));
		}

		if (entityIn instanceof EntityLiving && !worldIn.isRemote) {
			EntityLiving entity = (EntityLiving) entityIn;
			entity.addPotionEffect(new PotionEffect(MobEffects.WITHER, 100));
		}
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		double d0 = (double) ((float) pos.getX() + rand.nextFloat());
		double d1 = (double) ((float) pos.getY() + 1.0F);
		double d2 = (double) ((float) pos.getZ() + rand.nextFloat());
		double d3 = 0.0D;
		double d4 = 0.0D;
		double d5 = 0.0D;
		worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
	}
	
}
