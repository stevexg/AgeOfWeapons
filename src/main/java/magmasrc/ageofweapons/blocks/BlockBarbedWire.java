package magmasrc.ageofweapons.blocks;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.mojang.realmsclient.gui.ChatFormatting;

public class BlockBarbedWire extends Block {

	public BlockBarbedWire() {
		super(Material.IRON);
		this.setHardness(15.0F);
		this.setResistance(20.0F);
		this.setSoundType(SoundType.METAL);	
		this.setLightOpacity(1);
        if(AgeOfWeapons.activateOnlyOneTab){
        	this.setCreativeTab(ModTabs.generalTab);
        } else {
        	this.setCreativeTab(ModTabs.earlyModernAgeTab);
        }
		}
	
	
	
		@Override
		public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
				entityIn.setInWeb();
			
			if (!worldIn.isRemote) {
				entityIn.attackEntityFrom(DamageSource.GENERIC, 1.0F);
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
	    public boolean isFullCube(IBlockState state){
	        return false;
	    }

	  
	    @Override
	    @SideOnly(Side.CLIENT)
	    public BlockRenderLayer getBlockLayer() {
	        return BlockRenderLayer.CUTOUT;
	    }
	
}
