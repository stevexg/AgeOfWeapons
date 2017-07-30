package magmasrc.ageofweapons.items.stoneage;

import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModItems;
import magmasrc.ageofweapons.main.ModTabs;
import magmasrc.ageofweapons.util.ItemCustomWeapon;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemHandAxStone extends ItemCustomWeapon {

    public ItemHandAxStone(ToolMaterial material) {
        super(material, 3);

        this.setCreativeTab(ModTabs.stoneAgeTab);
        this.setMaxStackSize(16);
    }



    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List addList, boolean advanced) {
    	if(AgeOfWeapons.activateShowAges) {
    		addList.add(ChatFormatting.DARK_GRAY + "Stone Age");
    	}	
    }
    
    
    
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == Item.getItemFromBlock(Blocks.COBBLESTONE);
	}  


}
