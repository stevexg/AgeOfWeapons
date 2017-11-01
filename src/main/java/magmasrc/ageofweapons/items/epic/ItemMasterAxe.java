package magmasrc.ageofweapons.items.epic;

import java.util.List;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModItems;
import magmasrc.ageofweapons.main.ModTabs;
import magmasrc.ageofweapons.util.ItemCustomAxe;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.mojang.realmsclient.gui.ChatFormatting;

public class ItemMasterAxe extends ItemCustomAxe {

    public ItemMasterAxe(ToolMaterial material) {
        super(material, 0.9F);

        this.setMaxStackSize(1);
        if(AgeOfWeapons.activateOnlyOneTab){
        	this.setCreativeTab(ModTabs.generalTab);
        } else {
        	this.setCreativeTab(ModTabs.epicTab);
        }
    }

    
    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List addList, boolean advanced) {
    	if(AgeOfWeapons.activateShowAges) {
    		addList.add(ChatFormatting.DARK_GRAY + "Epic");
    	}	
    }
    
    
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == ModItems.witheredIronIngot;
	}  

}