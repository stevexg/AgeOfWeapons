package magmasrc.ageofweapons.items.epic;

import java.util.List;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModItems;
import magmasrc.ageofweapons.main.ModTabs;
import magmasrc.ageofweapons.util.ItemCustomWeapon;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.mojang.realmsclient.gui.ChatFormatting;

public class ItemMasterSword extends ItemCustomWeapon {

    public ItemMasterSword(ToolMaterial material) {
        super(material, 1.6F);

        this.setMaxStackSize(1);
        if(AgeOfWeapons.activateOnlyOneTab){
        	this.setCreativeTab(ModTabs.generalTab);
        } else {
        	this.setCreativeTab(ModTabs.epicTab);
        }
    }

    
	@Override
	public void addInformation(ItemStack stack, World player, List<String> addList, ITooltipFlag advanced) {
		if(AgeOfWeapons.activateShowAges) {
			addList.add(ChatFormatting.DARK_GRAY + "Epic");
		}	
	}
    
	@Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.EPIC;
    }
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == ModItems.witheredIronIngot;
	}  

}
