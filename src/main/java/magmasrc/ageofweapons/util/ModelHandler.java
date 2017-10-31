package magmasrc.ageofweapons.util;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ModelHandler {

	public static void registerModel(Object obj) {
		if(obj instanceof Item) {
			Item item = (Item) obj;
    			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		} else if (obj instanceof Block) {
			Item item = Item.getItemFromBlock((Block) obj);
				Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		} else {
			throw new IllegalArgumentException("Item or Block required!");	
		}
	}

}
