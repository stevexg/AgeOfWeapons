package magmasrc.ageofweapons.items.modernage;

import java.util.List;

import javax.annotation.Nullable;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModItems;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.mojang.realmsclient.gui.ChatFormatting;

public class ItemFieldGlasses extends Item {

    public ItemFieldGlasses() {
        super();
        /**
        if(AgeOfWeapons.activateOnlyOneTab){
        	this.setCreativeTab(ModTabs.generalTab);
        } else {
        	this.setCreativeTab(ModTabs.modernAgeTab);
        }	**/
        this.setMaxStackSize(1);
        this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter()

        {
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
            {
                return entityIn == null ? 0.0F : (entityIn.getActiveItemStack().getItem() != ModItems.fieldGlasses ? 0.0F : (float)(stack.getMaxItemUseDuration() - entityIn.getItemInUseCount()) / 40.0F);   //20 = default speed
            }
        }); 
    }
    
    
 

   
	@Override
	public void addInformation(ItemStack stack, World player, List<String> addList, ITooltipFlag advanced) {
		if(AgeOfWeapons.activateShowAges) {
			addList.add(ChatFormatting.DARK_GRAY + "Modern Age");
		}	
	}
	
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		try {
			ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, Minecraft.getMinecraft().entityRenderer, 0.25F, "fovModifierHand", "field_78507_R");
		} catch(Exception e) {
			System.err.println(e);
		} 		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
}
