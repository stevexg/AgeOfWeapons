package magmasrc.ageofweapons.blocks;

import java.util.List;
import java.util.Random;

import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityAreaEffectCloud;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.mojang.realmsclient.gui.ChatFormatting;

public class BlockNexus3 extends Block {

	public BlockNexus3() {
		super(Material.IRON);
		this.setCreativeTab(ModTabs.generalTab);
		this.setHardness(100.0F);
		this.setResistance(2000.0F);
		this.setSoundType(SoundType.METAL);	
		this.setHarvestLevel("axe", 3);
        this.setLightOpacity(0);
        this.setLightLevel(10.0F);
	}

	
	
		// Function

	@Override
	public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn) {
			worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, SoundEvents.ENTITY_TNT_PRIMED, SoundCategory.BLOCKS, 1, 0, false);

		if(!worldIn.isRemote) {
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString(TextFormatting.YELLOW + "The Nexus is attacked!"));	
	    	EntityAreaEffectCloud cloud = new EntityAreaEffectCloud(worldIn, pos.getX() + 0.5F, pos.getY()+ 0.5F, pos.getZ() + 0.5F);
	    	cloud.addEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, 200, 0));
	    	cloud.setDuration(50);
	    	cloud.setRadius(5);
	    	cloud.setCustomNameTag("Nexus");
	    	cloud.setWaitTime(250);
	    	cloud.setParticle(EnumParticleTypes.SMOKE_NORMAL);
	    	worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_ANVIL_BREAK, SoundCategory.BLOCKS, 1, 0, false);
	    	worldIn.spawnEntity(cloud);
	    	}   
	 } 
	
	
	@Override
	public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
			worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, SoundEvents.ENTITY_ENDERDRAGON_DEATH, SoundCategory.BLOCKS, 10, 0, false);
    		worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, SoundEvents.ENTITY_LIGHTNING_IMPACT, SoundCategory.BLOCKS, 10, 0, false);

		if(!worldIn.isRemote) {
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString(TextFormatting.YELLOW + "The Nexus is destroyed!"));	
		}
	}	
	
	
	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
			worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.BLOCKS, 1, 0, false);

		if(!worldIn.isRemote) {
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString(TextFormatting.YELLOW + "The Nexus is placed!"));	
		}
	}	
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		double d0 = (double) ((float) pos.getX() + rand.nextFloat());
		double d1 = (double) ((float) pos.getY() + 1.5F);
		double d2 = (double) ((float) pos.getZ() + rand.nextFloat());
		double d3 = 0.0D;
		double d4 = 0.0D;
		double d5 = 0.0D;
		worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
	}

	
	
	
	
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Items.NETHER_STAR;
    }
	

	
	// Custom Model
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
    @Override
    public boolean isPassable(IBlockAccess worldIn, BlockPos pos){
        return false;
    }

	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer(){
		return BlockRenderLayer.CUTOUT;
	}
	

	@Override
	public boolean isFullCube(IBlockState state){
		return false;
	} 

	@Override
	public EnumBlockRenderType getRenderType(IBlockState iBlockState) {
		return EnumBlockRenderType.MODEL;
	}
	
	
	protected static final AxisAlignedBB NEXUS_AABB = new AxisAlignedBB(0.00D, 0.00D, 0.00D, 1.00D, 2.00D, 1.00D);

	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return NEXUS_AABB;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return NEXUS_AABB;
	}
	
	
	
	
		// other //
		    
	@Override
	public void addInformation(ItemStack stack, World player, List<String> addList, ITooltipFlag advanced) {
		addList.add(ChatFormatting.RED + "Work in progress");
	}

	}
