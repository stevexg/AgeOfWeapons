package magmasrc.ageofweapons.items.stoneage;

import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.main.ModTabs;
import magmasrc.ageofweapons.util.ItemCustomSword;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ItemRock extends ItemCustomSword {

    public ItemRock(ToolMaterial material) {
        super(material, 16);
        
        this.setCreativeTab(ModTabs.stoneAgeTab);
        this.setMaxStackSize(64);
    }
    
    
    
	@Override
	public void addInformation(ItemStack  stack, EntityPlayer playerIn, List addList, boolean advanced) {
			addList.add(ChatFormatting.GRAY + "Stone Age");
	}


}
