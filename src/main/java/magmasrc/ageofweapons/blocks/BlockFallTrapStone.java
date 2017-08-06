package magmasrc.ageofweapons.blocks;

import javax.annotation.Nullable;

import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockFallTrapStone extends Block {
	

	public BlockFallTrapStone() {
		super(Material.CORAL);
		this.setCreativeTab(ModTabs.earlyModernAgeTab);
		this.setHardness(3.0F);
		this.setResistance(3.0F);
		this.setSoundType(SoundType.STONE);	
		this.setLightOpacity(1);
	}
	
	
	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, SoundEvents.ENTITY_ITEM_BREAK, SoundCategory.BLOCKS, 10, 3, false);

		if (!worldIn.isRemote) {
			worldIn.setBlockToAir(pos);
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
