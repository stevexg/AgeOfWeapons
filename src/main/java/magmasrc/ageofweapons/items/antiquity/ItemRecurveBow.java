package magmasrc.ageofweapons.items.antiquity;

import java.util.List;

import javax.annotation.Nullable;

import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModItems;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemRecurveBow extends ItemBow {
	
	public ItemRecurveBow() {
		    this.maxStackSize = 1;
	        this.setMaxDamage(400);    
	        if(AgeOfWeapons.activateOnlyOneTab){
	        	this.setCreativeTab(ModTabs.generalTab);
	        } else {
	        	this.setCreativeTab(ModTabs.antiquityTab);
	        };
	        this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter()
	        

	        {
	            @SideOnly(Side.CLIENT)
	            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
	            {
	                return entityIn == null ? 0.0F : (entityIn.getActiveItemStack().getItem() != ModItems.recurveBow ? 0.0F : (float)(stack.getMaxItemUseDuration() - entityIn.getItemInUseCount()) / 10.0F);   //20 = default speed
	            }
	        });
	        this.addPropertyOverride(new ResourceLocation("pulling"), new IItemPropertyGetter()
	        {
	            @SideOnly(Side.CLIENT)
	            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
	            {
	                return entityIn != null && entityIn.isHandActive() && entityIn.getActiveItemStack() == stack ? 1.0F : 0.0F;
	            }
	        });

	}
	
	  private ItemStack findAmmo(EntityPlayer player)
	    {
	        if (this.isArrow(player.getHeldItem(EnumHand.OFF_HAND)))
	        {
	            return player.getHeldItem(EnumHand.OFF_HAND);
	        }
	        else if (this.isArrow(player.getHeldItem(EnumHand.MAIN_HAND)))
	        {
	            return player.getHeldItem(EnumHand.MAIN_HAND);
	        }
	        else
	        {
	            for (int i = 0; i < player.inventory.getSizeInventory(); ++i)
	            {
	                ItemStack itemstack = player.inventory.getStackInSlot(i);

	                if (this.isArrow(itemstack))
	                {
	                    return itemstack;
	                }
	            }

	            return ItemStack.EMPTY;
	        }
	    }
  
  
  public void onPlayerStoppedUsing(ItemStack stack, World worldIn, EntityLivingBase entityLiving, int timeLeft)
  {
      if (entityLiving instanceof EntityPlayer)
      {
          EntityPlayer entityplayer = (EntityPlayer)entityLiving;
          boolean flag = entityplayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantments.INFINITY, stack) > 0;
          ItemStack itemstack = this.findAmmo(entityplayer);

          int i = this.getMaxItemUseDuration(stack) - timeLeft;
          i = net.minecraftforge.event.ForgeEventFactory.onArrowLoose(stack, worldIn, (EntityPlayer)entityLiving, i, itemstack != null || flag);
          if (i < 0) return;

          if (!itemstack.isEmpty() || flag)
          {
              if (itemstack.isEmpty())
              {
                  itemstack = new ItemStack(Items.ARROW);
              }

                 float f = getArrowVelocity(i);
           /**   float f = (float) i / 5.0F;    // <- schnelleres aufladen (crit)

              if (f > 1.0F) {
                  f = 1.0F;
          } **/

              if ((double)f >= 0.1D)
              {
                  boolean flag1 = entityplayer.capabilities.isCreativeMode || (itemstack.getItem() instanceof ItemArrow ? ((ItemArrow)itemstack.getItem()).isInfinite(itemstack, stack, entityplayer) : false);

                  if (!worldIn.isRemote)
                  {
                      ItemArrow itemarrow = (ItemArrow)((ItemArrow)(itemstack.getItem() instanceof ItemArrow ? itemstack.getItem() : Items.ARROW));
                      EntityArrow entityarrow = itemarrow.createArrow(worldIn, itemstack, entityplayer);
                      entityarrow.shoot(entityplayer, entityplayer.rotationPitch, entityplayer.rotationYaw, 0.0F, f * 3.0F, 1.0F);

                      if (f == 1.0F)
                      {
                          entityarrow.setIsCritical(true);
                      }
                      
                                        // Damage
                      entityarrow.setDamage(3.0F);

                      int j = EnchantmentHelper.getEnchantmentLevel(Enchantments.POWER, stack);

                      if (j > 0)
                      {
                          entityarrow.setDamage(entityarrow.getDamage() + (double)j * 0.5D + 0.5D);
                      }

                      int k = EnchantmentHelper.getEnchantmentLevel(Enchantments.PUNCH, stack);

                      if (k > 0)
                      {
                          entityarrow.setKnockbackStrength(k);
                      }

                      if (EnchantmentHelper.getEnchantmentLevel(Enchantments.FLAME, stack) > 0)
                      {
                          entityarrow.setFire(100);
                      }

                      stack.damageItem(1, entityplayer);

                      if (flag1 || entityplayer.capabilities.isCreativeMode && (itemstack.getItem() == Items.SPECTRAL_ARROW || itemstack.getItem() == Items.TIPPED_ARROW))
                      {
                          entityarrow.pickupStatus = EntityArrow.PickupStatus.CREATIVE_ONLY;
                      }

                      worldIn.spawnEntity(entityarrow);
                  }

                  worldIn.playSound((EntityPlayer)null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

                  if (!flag1 && !entityplayer.capabilities.isCreativeMode)
                  {
                      itemstack.shrink(1);

                      if (itemstack.isEmpty())
                      {
                          entityplayer.inventory.deleteStack(itemstack);
                      }
                  }

                  entityplayer.addStat(StatList.getObjectUseStats(this));
              }
          }
      }
  }

	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == Item.getItemFromBlock(Blocks.PLANKS);
	} 
	
	
	@Override
	public void addInformation(ItemStack stack, World player, List<String> addList, ITooltipFlag advanced) {
		if(AgeOfWeapons.activateShowAges) {
			addList.add(ChatFormatting.DARK_GRAY + "Antiquity");
		}	
	}
}
