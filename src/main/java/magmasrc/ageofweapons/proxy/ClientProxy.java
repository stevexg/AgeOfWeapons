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
		registerModel(ModItems.upgradeStoneAge, 0, new ModelResourceLocation(ModItems.upgradeStoneAge.getRegistryName(), "inventory"));
		registerModel(ModItems.upgradeAtiquity, 0, new ModelResourceLocation(ModItems.upgradeAtiquity.getRegistryName(), "inventory"));
		registerModel(ModItems.upgradeMystic, 0, new ModelResourceLocation(ModItems.upgradeMystic.getRegistryName(), "inventory"));
		registerModel(ModItems.upgradeMiddleAges, 0, new ModelResourceLocation(ModItems.upgradeMiddleAges.getRegistryName(), "inventory"));
		registerModel(ModItems.upgradeEdoPeriod, 0, new ModelResourceLocation(ModItems.upgradeEdoPeriod.getRegistryName(), "inventory"));
		registerModel(ModItems.upgradePiracy, 0, new ModelResourceLocation(ModItems.upgradePiracy.getRegistryName(), "inventory"));
		registerModel(ModItems.upgradeEarlyModernAge, 0, new ModelResourceLocation(ModItems.upgradeEarlyModernAge.getRegistryName(), "inventory"));
		registerModel(ModItems.upgradeFantasy, 0, new ModelResourceLocation(ModItems.upgradeFantasy.getRegistryName(), "inventory"));
		registerModel(ModItems.upgradeModernAge, 0, new ModelResourceLocation(ModItems.upgradeModernAge.getRegistryName(), "inventory"));
		registerModel(ModItems.upgradeEpic, 0, new ModelResourceLocation(ModItems.upgradeEpic.getRegistryName(), "inventory"));
		registerModel(ModItems.upgradeFuture, 0, new ModelResourceLocation(ModItems.upgradeFuture.getRegistryName(), "inventory"));
		registerModel(ModItems.upgradeBBY, 0, new ModelResourceLocation(ModItems.upgradeBBY.getRegistryName(), "inventory"));

		// StoneAge
		registerModel(ModItems.rock, 0, new ModelResourceLocation(ModItems.rock.getRegistryName(), "inventory"));
		registerModel(ModItems.handAxStone, 0, new ModelResourceLocation(ModItems.handAxStone.getRegistryName(), "inventory"));

    	
    	
    	
    	
    	/** Blocks **/
    	
    	registerModel(ModBlocks.tableOfAges, 0, new ModelResourceLocation(ModBlocks.tableOfAges.getRegistryName(), "inventory"));
    	
    	
    	
    	
    	
    	
    	/** Ore Dictionary **/
    	
    	//Items//
    	OreDictionary.registerOre("upgradeCreativeAoW", ModItems.upgradeCreative);
		OreDictionary.registerOre("upgradeStoneAgeAoW", ModItems.upgradeStoneAge);
		OreDictionary.registerOre("upgradeAntiquityAoW", ModItems.upgradeAtiquity);
		OreDictionary.registerOre("upgradeMysticAoW", ModItems.upgradeMystic);
		OreDictionary.registerOre("upgradeMiddleAgesAoW", ModItems.upgradeMiddleAges);
		OreDictionary.registerOre("upgradeEdoPeriodAoW", ModItems.upgradeMiddleAges);
		OreDictionary.registerOre("upgradePiracyAoW", ModItems.upgradeMiddleAges);
		OreDictionary.registerOre("upgradeEarlyModernAgeAoW", ModItems.upgradeEarlyModernAge);
		OreDictionary.registerOre("upgradeFantasyAoW", ModItems.upgradeFantasy);
		OreDictionary.registerOre("upgradeModernAgeAoW", ModItems.upgradeModernAge);
		OreDictionary.registerOre("upgradeEpicAoW", ModItems.upgradeEpic);
		OreDictionary.registerOre("upgradeFutureAoW", ModItems.upgradeFuture);
		OreDictionary.registerOre("upgradeBBYAoW", ModItems.upgradeBBY);

    	
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
   

  