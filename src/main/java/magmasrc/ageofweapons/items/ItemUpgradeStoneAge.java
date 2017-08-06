package magmasrc.ageofweapons.items;

import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;

import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemUpgradeStoneAge extends Item {

    public ItemUpgradeStoneAge() {
        super();
        this.setCreativeTab(ModTabs.generalTab);
        this.setMaxStackSize(1);
    }
    
    
	@Override
	public void addInformation(ItemStack  stack, EntityPlayer playerIn, List addList, boolean advanced) {
			addList.add(ChatFormatting.GRAY + "Stone Age");
	}
}
