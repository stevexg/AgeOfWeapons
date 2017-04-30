package magmasrc.ageofweapons.main;

import magmasrc.ageofweapons.proxy.ServerProxy;
import magmasrc.ageofweapons.util.Events;
import magmasrc.ageofweapons.util.LootHandler;
import magmasrc.ageofweapons.util.UpdateChecker;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**---------------------------------------------------------------------------------*
 * @author MagmaSrc Team (Stvxv.g & XxRexRaptorxX (RexRaptor))
 * @forumThread 
 * @projectPage https://minecraft.curseforge.com/projects/age-of-weapons
 **---------------------------------------------------------------------------------*/


@Mod(modid = AgeOfWeapons.MODID, version = AgeOfWeapons.VERSION)
public class AgeOfWeapons {
   
    public static final String MODID = "ageofweapons";
    public static final String VERSION = "0.1.0";
    
   
    @Instance("ageofweapons")
    public static AgeOfWeapons instance;
    
    @SidedProxy(clientSide = "magmasrc.ageofweapons.proxy.ClientProxy", serverSide = "magmasrc.ageofweapons.proxy.ServerProxy")
    public static ServerProxy proxy;
    
    

    
    // Items //
    public ModItems items;
    
    // Blocks //
    public ModBlocks blocks;
    
    // Recipes //
    public ModRecipes recipes;
    
    // Creative-Tab //
    public ModTabs tabs;
    
    // Config //
    public static boolean activateUpdateChecker;
    public static boolean activateOnlyOneTab;
    public static boolean activateChainArmorCrafting;



	
	
	

    
    /***********************************************************************************************************************************/ 
    /***********************************************************************************************************************************/
    
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    	
    // Config //
    net.minecraftforge.common.config.Configuration config = new Configuration(event.getSuggestedConfigurationFile());
    	config.load();
        
    		activateUpdateChecker = config.get("EVENTS", "Activate Update-Checker", true, "[true/false]").getBoolean();
    		//activateOnlyOneTab = config.get("GENERAL", "Activate only one creative tab", false, "[true/false]").getBoolean();
    		activateChainArmorCrafting = config.get("CRAFTING", "Activate the crafting recipe for the chain armor (Table of Ages)", true, "[true/false]").getBoolean();

    		
    	config.save();	

    	
    	
    // Update-Checker //	
    UpdateChecker.checkForUpdates();  
    
    // Events //
    MinecraftForge.EVENT_BUS.register(new Events());  
    
    

    }
  
    
    
    
    
   
    @EventHandler
    public void Init(FMLInitializationEvent event) {
    	
    	
   
    	// Blocks //
    	blocks = new ModBlocks();
       	blocks.init();
    	blocks.register();
    	
    	// Items //
    	items = new ModItems();
       	items.init();
    	items.register();
    	
    	// Recipes //
    	recipes = new ModRecipes();
    	recipes.register();
    	
        // Creative Tabs //
      	tabs = new ModTabs();
    	
    	
    	// proxy //
         proxy.registerClientStuff();
        

         
         /** Handler **/
         
      	 // Loot Gen //
     	 MinecraftForge.EVENT_BUS.register(new LootHandler());

    }
   
   
    
    
    
    
    
    
    
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
              
    }
 
}