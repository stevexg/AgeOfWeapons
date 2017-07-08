package magmasrc.ageofweapons.items.future;

import java.util.List;
import java.util.Random;

import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.main.ModItems;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemPoisonGun extends Item {

    public ItemPoisonGun() {
        super();
        this.setCreativeTab(ModTabs.futureTab);
        this.setMaxStackSize(1);
        this.setMaxDamage(300);
    }
    
    
	@Override
	public void addInformation(ItemStack  stack, EntityPlayer playerIn, List addList, boolean advanced) {
			addList.add(ChatFormatting.GRAY + "Future");
	}
	
	

	
	
	
	
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		Vec3d lockVector = playerIn.getLookVec();
		double x = lockVector.xCoord / 10;
		double y = lockVector.yCoord / 10;
		double z = lockVector.zCoord / 10;
		Random random = new Random();
        ItemStack itemstack = playerIn.getHeldItem(handIn);
		for (int i = 0; i < 100; i++) {
			double xCoord = playerIn.posX + x * i + random.nextDouble();
			double yCoord = playerIn.posY + y * i + random.nextDouble();
			double zCoord = playerIn.posZ + z * i + random.nextDouble();

		playerIn.getCooldownTracker().setCooldown(this, 15);

			if (worldIn.isRemote) {
				worldIn.spawnParticle(EnumParticleTypes.TOTEM, xCoord, yCoord, zCoord, x * 10, y * 10, z * 10);	
			} else {
				worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_BLAZE_SHOOT, SoundCategory.PLAYERS, 0.2F, 0.5F / (itemRand.nextFloat() * 0.4F + 0.8F));


			for (Object obj : worldIn.getEntitiesWithinAABBExcludingEntity(playerIn, new AxisAlignedBB(xCoord - 1, yCoord - 1, zCoord - 1, xCoord + 1, yCoord + 1, zCoord + 1))) {
				if (obj instanceof EntityLivingBase) {
					EntityLivingBase entity = (EntityLivingBase) obj;
					entity.addPotionEffect(new PotionEffect(MobEffects.POISON, 500, 1));
				}
			 }
		  }
       }	
	   for(int i = 0; i < 100; i++) {
		   worldIn.spawnParticle(EnumParticleTypes.TOTEM, playerIn.posX + x * i + random.nextDouble(), playerIn.posY + y * i + random.nextDouble(), playerIn.posZ + z * i + random.nextDouble(), x * 10, y * 10, z * 10);
	   }

	   itemstack.damageItem(1, playerIn);
	   return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	}
	
	
	
	
	
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == ModItems.toxin;
	}  
}
