package magmasrc.ageofweapons.main;

import magmasrc.ageofweapons.proxy.ServerProxy;
import magmasrc.ageofweapons.util.Events;
import magmasrc.ageofweapons.util.LootHandler;
import magmasrc.ageofweapons.util.OreDictionaryHandler;
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
    public static final String VERSION = "0.8.0";

   
    @Instance("ageofweapons")
    public static AgeOfWeapons instance;
    
    @SidedProxy(clientSide = "magmasrc.ageofweapons.proxy.ClientProxy", serverSide = "magmasrc.ageofweapons.proxy.ServerProxy")
    public static ServerProxy proxy;

    //TODO Steve: JEI Support!, ThrowWood/Caveman Spear, Crusher, Schusswaffen, schauen wegen OreRecipes, Weapon Box, item das einen block setzt...weil ich das ned hinkriege xD ._.

    
    // Items //
    public ModItems items;
    
    // Blocks //
    public ModBlocks blocks;
    
    // Entitys //
    public ModEntitys entitys;
    
    // Recipes //
    public ModRecipes recipes;
    
    // Creative-Tab //
    public ModTabs tabs;
    
    // Config //
    public static boolean activateUpdateChecker;
    public static boolean activateOnlyOneTab;     			// TODO later
    public static boolean activateChainArmorCrafting;
    public static boolean activateBasicRecipesOnWorkbench;
    public static boolean activateWeaponBoxRecipe;
    public static boolean activateNexusRecipe;
    public static boolean activateShowAges;
    public static boolean activateDungeonLoot;
    public static boolean activateHardcoreMode;			
    
    public static boolean activatePiracy;
    public static boolean activateEdoPeriod;
    public static boolean activateMystic;
    public static boolean activateBBY;
    public static boolean activateFantasy;
    public static boolean activateEpic;
    public static boolean activateFuture;
    
    public static float battleAxeMultiplier;					//TODO later (for all weapon types)



	
	
	

    
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
    		activateBasicRecipesOnWorkbench = config.get("CRAFTING", "Activate basic AoW recipes on the normal crafting table", true, "[true/false]").getBoolean();
    		activateWeaponBoxRecipe = config.get("CRAFTING", "Activate the crafting recipe for the Weapon Box", true, "[true/false]").getBoolean();
    		activateNexusRecipe = config.get("CRAFTING", "Activate the crafting recipe for the Nexus", false, "[true/false]").getBoolean();
    		activateShowAges = config.get("GENERAL", "Show the age under the item name", true, "[true/false]").getBoolean();
    		activateDungeonLoot = config.get("GENERATION", "Generate dungeon loot (means only the not important items for the mod)", true, "[true/false]").getBoolean();
    		activateHardcoreMode = config.get("GENERAL", "You can only craft vanilla tools/weapons/armor in the Table of Ages and in the right age", false, "[true/false]").getBoolean();
    		
    		activateBBY = config.get("AGES", "Activate the recipe for the BBY Upgrade", true, "[true/false]").getBoolean();
    		activateEdoPeriod = config.get("AGES", "Activate the recipe for the Edo Period Upgrade", true, "[true/false]").getBoolean();
    		activateEpic = config.get("AGES", "Activate the recipe for the Epic Upgrade", true, "[true/false]").getBoolean();
    		activateFantasy = config.get("AGES", "Activate the recipe for the Fantasy Upgrade", true, "[true/false]").getBoolean();
    		activateFuture = config.get("AGES", "Activate the recipe for the Future Upgrade", true, "[true/false]").getBoolean();
    		activateMystic = config.get("AGES", "Activate the recipe for the Mystic Upgrade", true, "[true/false]").getBoolean();
    		activatePiracy = config.get("AGES", "Activate the recipe for the Piracy Upgrade", true, "[true/false]").getBoolean();
    		
    	config.save();	

    	
    	
    // Update-Checker //	
    UpdateChecker.checkForUpdates();  
    
    // Events //
    MinecraftForge.EVENT_BUS.register(new Events());  
    
    // Entity Renderer //
    proxy.registerRenderer();
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
    	
    	// Entitys //
    	entitys = new ModEntitys();
    	
    	// Recipes //
    	recipes = new ModRecipes();
    	recipes.unregister();
    	recipes.register();
    	
        // Creative Tabs //
      	tabs = new ModTabs();
    	
    	
    	// proxy //
        proxy.registerClientStuff();
        

         
         /** Handler **/
        
     	// OreDictionary //
     	OreDictionaryHandler.registerOreDictionary();
       
      	 // Loot Gen //
     	 MinecraftForge.EVENT_BUS.register(new LootHandler());

    }
   
   
    
    
    
    
    
    
    
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
 
}