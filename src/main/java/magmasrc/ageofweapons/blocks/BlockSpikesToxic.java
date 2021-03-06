package magmasrc.ageofweapons.blocks;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModBlocks;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockSpikesToxic extends Block {

    private final boolean isOn;
    protected static final AxisAlignedBB ON_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.50D, 1.0D);
    protected static final AxisAlignedBB OFF_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.10D, 1.0D);


	public BlockSpikesToxic(boolean isOn) {
		super(Material.IRON);
		this.setHardness(5.0F);
		this.setResistance(10.0F);
		this.setSoundType(SoundType.METAL);	
		this.setHarvestLevel("pickaxe", 1);
		this.setLightOpacity(1);
        if(AgeOfWeapons.activateOnlyOneTab){
        	this.setCreativeTab(ModTabs.generalTab);
        } else {
        	this.setCreativeTab(ModTabs.modernAgeTab);
        }
        this.isOn = isOn;
	}
	
	
	
	// function
	
	@Override
    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state){
    	worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_ANVIL_BREAK, SoundCategory.BLOCKS, 1, 0, false);

    	if (!worldIn.isRemote){
            if (this.isOn && !worldIn.isBlockPowered(pos)) {
    	        	worldIn.setBlockState(pos, ModBlocks.spikesToxic.getDefaultState(), 2);
            }	
            else if (!this.isOn && worldIn.isBlockPowered(pos)) {    	        
    	        	worldIn.setBlockState(pos, ModBlocks.spikesToxicOn.getDefaultState(), 2);
           }
    	}
    }
    
    
    @Override
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos){
    	worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_ANVIL_BREAK, SoundCategory.BLOCKS, 1, 0, false);
    	
    	if (!worldIn.isRemote){
            if (this.isOn && !worldIn.isBlockPowered(pos)) {
                worldIn.scheduleUpdate(pos, this, 4);
            }
            else if (!this.isOn && worldIn.isBlockPowered(pos)) {
    	    	worldIn.setBlockState(pos, ModBlocks.spikesToxicOn.getDefaultState(), 2);
           }	
    	}
        if (!this.canBePlacedOn(worldIn, pos.down()))
        {
            this.dropBlockAsItem(worldIn, pos, state, 0);
            worldIn.setBlockToAir(pos);
        }
    }
    
    
    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
            if (this.isOn && !worldIn.isBlockPowered(pos)) {
    	    	worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_ANVIL_BREAK, SoundCategory.BLOCKS, 1, 0, false);

    	    	if (!worldIn.isRemote){
    	    	worldIn.setBlockState(pos, ModBlocks.spikesToxic.getDefaultState(), 2);
    	    	}
            }	
    }
    
    
	
	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		if (entityIn instanceof EntityPlayer && !worldIn.isRemote && this.isOn) {
			EntityPlayer player = (EntityPlayer) entityIn;
			player.addPotionEffect(new PotionEffect(MobEffects.POISON, 250, 0));
			player.attackEntityFrom(DamageSource.GENERIC, 4.0F);
		}
		if (entityIn instanceof EntityLiving && !worldIn.isRemote && this.isOn) {
			EntityLiving entity = (EntityLiving) entityIn;
			entity.addPotionEffect(new PotionEffect(MobEffects.POISON, 250, 0));
			entity.attackEntityFrom(DamageSource.GENERIC, 4.0F);
		}
    }
	
    
    
	
	// general

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(ModBlocks.spikesToxic);
    }

    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
        return new ItemStack(ModBlocks.spikesToxic);
    }

    @Override
    protected ItemStack getSilkTouchDrop(IBlockState state){
        return new ItemStack(ModBlocks.spikesToxic);
    }
	
	@Override
	public void addInformation(ItemStack stack, World player, List<String> addList, ITooltipFlag advanced) {
		addList.add(ChatFormatting.GRAY + "Needs redstone power");
	}
    
    
    
    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos){
        return this.canBePlacedOn(worldIn, pos.down());
    }

    
    private boolean canBePlacedOn(World worldIn, BlockPos pos){
        return worldIn.getBlockState(pos).isFullCube() || worldIn.getBlockState(pos).getBlock() instanceof BlockFence;
    }
	
	
	
	// model
	
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
        if(this.isOn) {
        	return ON_AABB;
        } else {
        	return OFF_AABB;
        }
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
