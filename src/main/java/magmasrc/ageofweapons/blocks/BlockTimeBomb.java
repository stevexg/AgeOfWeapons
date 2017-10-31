package magmasrc.ageofweapons.blocks;

import java.util.List;

import javax.annotation.Nullable;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.mojang.realmsclient.gui.ChatFormatting;

public class BlockTimeBomb extends Block {
	
	
    protected static final AxisAlignedBB TRAP_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.10D, 1.0D);


	public BlockTimeBomb() {
		super(Material.CORAL);
		this.setHardness(1.0F);
		this.setSoundType(SoundType.METAL);	
		this.setLightOpacity(1);
        if(AgeOfWeapons.activateOnlyOneTab){
        	this.setCreativeTab(ModTabs.generalTab);
        } else {
        	this.setCreativeTab(ModTabs.modernAgeTab);
        }
	}
	
	
	
    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List addList, boolean advanced) {
        addList.add(ChatFormatting.RED + "Work in progress");
    }	
	


	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
    	worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_DISPENSER_DISPENSE, SoundCategory.BLOCKS, 1, 0, false);
    	
    	if (!worldIn.isRemote) {
    		this.setBlockUnbreakable();
			try {
				Thread.sleep(5000);
				
				//worldIn.getEntities....attackEntityFrom(DamageSource.GENERIC, 15.0F);    old
				/**
				double a = (double)pos.getX() + 0;
			    double b = (double)pos.getY() + 0;
			    double c = (double)pos.getZ() + 0;
				double x = (double)pos.getX() - 0;      // ????
			    double y = (double)pos.getY() - 0;
			    double z = (double)pos.getZ() - 0;
			    AxisAlignedBB hurtArea = new AxisAlignedBB(a, b, c, x, y, z);
			    
			    List entities = worldIn.getEntitiesWithinAABB(EntityLivingBase.class, hurtArea);
			    List players = worldIn.getEntitiesWithinAABB(EntityPlayer.class, hurtArea);

			    if(entities.size() > 0){
			        Entity entity = (Entity)entities.get(0);
			        if(entity instanceof EntityLivingBase ) {
			            entity.attackEntityFrom(DamageSource.GENERIC, 15.0F);
			        }
			    }
				**/
	            worldIn.setBlockState(pos, Blocks.AIR.getDefaultState(), 11);
				worldIn.createExplosion(playerIn, pos.getX(), pos.getY(), pos.getZ(), 8, true);
				this.setHardness(1.0F);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
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
    
    
    
    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos){
        return this.canBePlacedOn(worldIn, pos.down());
    }

 
    @Override
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos){
        if (!this.canBePlacedOn(worldIn, pos.down()))
        {
            this.dropBlockAsItem(worldIn, pos, state, 0);
            worldIn.setBlockToAir(pos);
        }
    }

    
    private boolean canBePlacedOn(World worldIn, BlockPos pos){
        return worldIn.getBlockState(pos).isFullyOpaque() || worldIn.getBlockState(pos).getBlock() instanceof BlockFence;
    }
	
}
