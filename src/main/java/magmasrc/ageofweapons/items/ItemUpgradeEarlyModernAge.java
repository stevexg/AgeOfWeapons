package magmasrc.ageofweapons.items;

import com.mojang.realmsclient.gui.ChatFormatting;
import magmasrc.ageofweapons.main.ModTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemUpgradeEarlyModernAge extends Item {

    public ItemUpgradeEarlyModernAge() {
        super();
        setCreativeTab(ModTabs.generalTab);
        setMaxStackSize(1);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List addList, boolean advanced) {
        addList.add(ChatFormatting.GRAY + "Early Modern Age");
    }
}

