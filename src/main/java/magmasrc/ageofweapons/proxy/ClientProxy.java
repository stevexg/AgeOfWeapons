package magmasrc.ageofweapons.proxy;
 
import magmasrc.ageofweapons.main.ModBlocks;
import magmasrc.ageofweapons.main.ModItems;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
 
public class ClientProxy extends ServerProxy {
 
    @Override
    public void registerClientStuff() {
    	
    	/** Items **/
    	
    	registerModel(ModItems.upgradeCreative, 0, new ModelResourceLocation(ModItems.upgradeCreative.getRegistryName(), "inventory"));
    	
    	
    	
    	
    	/** Blocks **/
    	
    	registerModel(ModBlocks.tableOfAges, 0, new ModelResourceLocation(ModBlocks.tableOfAges.getRegistryName(), "inventory"));
    	
    	
    	
    	
    	
    	
    	/** Ore Dictionary **/
    	
    	//Items//
    	OreDictionary.registerOre("upgradeCreativeAoW", ModItems.upgradeCreative);
    	
    	//Blocks//
    	OreDictionary.registerOre("craftingTableAoW", ModBlocks.tableOfAges);

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
   

  