package magmasrc.ageofweapons.items.middleages;

import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModTabs;
import magmasrc.ageofweapons.util.ItemCustomWeapon;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.List;

public class ItemLanceStone extends ItemCustomWeapon {

    public ItemLanceStone(ToolMaterial material) {
        super(material, 1.4F);

        this.setMaxStackSize(1);
        if(AgeOfWeapons.activateOnlyOneTab){
        	this.setCreativeTab(ModTabs.generalTab);
        } else {
        	this.setCreativeTab(ModTabs.middleAgesTab);
        }
    }

    
	@Override
	public void addInformation(ItemStack stack, World player, List<String> addList, ITooltipFlag advanced) {
		if(AgeOfWeapons.activateShowAges) {
			addList.add(ChatFormatting.DARK_GRAY + "Middle Ages");
		}	
	}
    
    
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == Item.getItemFromBlock(Blocks.COBBLESTONE);
	}  
	
	
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		stack.damageItem(1, attacker);

		double d = attacker.posX - target.posX;
                double d1;
                for(d1 = attacker.posZ - target.posZ; d * d + d1 * d1 < 0.0001D; d1 = (Math.random() - Math.random()) * 0.01D) {
                    d = (Math.random() - Math.random()) * 0.01D;
                }

		target.isAirBorne = true;
		float f = MathHelper.sqrt(d * d + d1 * d1);
		float f1 = 0.500F;
		target.motionX /= 2D;
		target.motionY /= 2D;
		target.motionZ /= 2D;
		target.motionX -= (d / (double)f) * (double)f1;
		target.motionY += 0.40000000596046448D;
		target.motionZ -= (d1 / (double)f) * (double)f1;
        	if(target.motionY > 0.40000000596046448D) {
        		target.motionY = 0.40000000596046448D;
        	}
        	return true;
	}
}
