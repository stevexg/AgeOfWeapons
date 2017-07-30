package magmasrc.ageofweapons.items.middleages;

import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModTabs;
import magmasrc.ageofweapons.util.ItemCustomAxe;
import magmasrc.ageofweapons.util.ItemCustomWeapon;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemBattleAxeWood extends ItemCustomAxe {

    public ItemBattleAxeWood(ToolMaterial material) {
        super(material, 1.2F);

        this.setCreativeTab(ModTabs.middleAgesTab);
        this.setMaxStackSize(1);
    }

    
    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List addList, boolean advanced) {
    	if(AgeOfWeapons.activateShowAges) {
    		addList.add(ChatFormatting.DARK_GRAY + "Middle Ages");
    	}	
    }
    
    
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == Item.getItemFromBlock(Blocks.PLANKS);
	}  

}
