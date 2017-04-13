package magmasrc.ageofweapons.proxy;
 
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
 
public class ClientProxy extends ServerProxy {
 
    @Override
    public void registerClientStuff() {
    	

    }
    
    
    
    
    
    public void registerModel(Object obj, int meta, ModelResourceLocation loc) {
    	Item item = null;
    	if(obj instanceof Item) {
    		item = (Item) obj;
    	} else if(obj instanceof Block) {
    		item = Item.getItemFromBlock((Block)obj);
    	} else {
    		throw new IllegalArgumentException();
    	}	
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, loc);
    	}
	}
   

  