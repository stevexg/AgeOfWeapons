package magmasrc.ageofweapons.items.modernage;

import java.util.List;
import java.util.Set;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModTabs;
import magmasrc.ageofweapons.util.ItemCustomIndustrial;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.google.common.collect.Sets;
import com.mojang.realmsclient.gui.ChatFormatting;

public class ItemIndustrialExcavator extends ItemCustomIndustrial {

	private static final Set EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.CLAY, Blocks.DIRT, Blocks.FARMLAND, Blocks.GRASS, Blocks.GRAVEL, 
					Blocks.MYCELIUM, Blocks.SAND, Blocks.SNOW, Blocks.SNOW_LAYER, Blocks.SOUL_SAND, Blocks.SNOW_LAYER});
	
    public ItemIndustrialExcavator(ToolMaterial material) {
    	super(1, 0, 0F, material, EFFECTIVE_ON, "shovel", 3, 0.5F);
        this.setMaxStackSize(1);
        if(AgeOfWeapons.activateOnlyOneTab){
        	this.setCreativeTab(ModTabs.generalTab);
        } else {
        	this.setCreativeTab(ModTabs.modernAgeTab);
        }	
    }
    
    
	@Override
	public void addInformation(ItemStack  stack, EntityPlayer playerIn, List addList, boolean advanced) {
		if(AgeOfWeapons.activateShowAges) {	
			addList.add(ChatFormatting.GRAY + "Modern Age");
		}
	}
	
	
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == Items.GOLD_INGOT;
	}  
	

}
