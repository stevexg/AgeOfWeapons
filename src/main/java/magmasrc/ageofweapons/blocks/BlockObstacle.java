package magmasrc.ageofweapons.blocks;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockObstacle extends Block {
	
	
    protected static final AxisAlignedBB CUSTOM_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.5D, 1.0D);


	public BlockObstacle() {
		super(Material.IRON);
		this.setHardness(20.0F);
		this.setResistance(100.0F);
		this.setSoundType(SoundType.METAL);	
		this.setHarvestLevel("pickaxe", 1);
		this.setLightOpacity(1);
        if(AgeOfWeapons.activateOnlyOneTab){
        	this.setCreativeTab(ModTabs.generalTab);
        } else {
        	this.setCreativeTab(ModTabs.earlyModernAgeTab);
        }
		}
	

	  
	    @Override
	    @SideOnly(Side.CLIENT)
	    public BlockRenderLayer getBlockLayer() {
	        return BlockRenderLayer.CUTOUT;
	    }
	    
	    

	  	@Override
	    public boolean isOpaqueCube(IBlockState state) {
	        return false;
	    }
	  	
	  	
	  	
	  	@Override
	  	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
	  		return CUSTOM_AABB;
	  	}
	  	
	
	
}
