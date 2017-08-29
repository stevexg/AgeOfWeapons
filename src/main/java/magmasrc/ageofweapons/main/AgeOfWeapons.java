package magmasrc.ageofweapons.main;

import magmasrc.ageofweapons.entity.render.RenderRegistry;
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
 * @forumThread https://www.planetminecraft.com/mod/age-of-weapons/
 * @projectPage https://minecraft.curseforge.com/projects/age-of-weapons
 **---------------------------------------------------------------------------------*/


@Mod(modid = AgeOfWeapons.MODID, version = AgeOfWeapons.VERSION)
public class AgeOfWeapons {
   
    public static final String MODID = "ageofweapons";
    public static final String VERSION = "0.11.1";

   
    @Instance("ageofweapons")
    public static AgeOfWeapons instance;
    
    @SidedProxy(clientSide = "magmasrc.ageofweapons.proxy.ClientProxy", serverSide = "magmasrc.ageofweapons.proxy.ServerProxy")
    public static ServerProxy proxy;

    //TODO Steve: ThrowWood/Caveman Spear, Schusswaffen, schauen wegen OreRecipes, item das einen block setzt...weil ich das ned hinkriege xD ._.
    
    
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
    public static boolean activateOnlyOneTab;
    public static boolean activateChainArmorCrafting;
    public static boolean activateBasicRecipesOnWorkbench;
    public static boolean activateWeaponBoxRecipe;
    public static boolean activateNexusRecipe;
    public static boolean activateShowAges;
    public static boolean activateDungeonLoot;
    public static boolean activateHardcoreMode;	
    public static boolean activateBombs;         
    
    public static boolean activatePiracy;
    public static boolean activateEdoPeriod;
    public static boolean activateMystic;
    public static boolean activateBBY;
    public static boolean activateFantasy;
    public static boolean activateEpic;
    public static boolean activateFuture;
    public static boolean activateModern;
    
    public static float daggerModifier;					//TODO later (for all weapon types)
    public static float kniveModifier;
    public static float skewerModifier;
    public static float cavemanKniveModifier;
    public static float boneKniveModifier;
    public static float cudgelModifier;
    public static float handAxModifier;
    public static float rockModifier;
    public static float battleAxeModifier;
    public static float flailModifier;
    public static float halbertModifier;
    public static float longswordModifier;
    public static float spearModifier;
    public static float tridentModifier;
    public static float warAxeModifier;
    public static float warHammerModifier;
    public static float industrialMinerModifier;
    public static float industrialExcavatorModifier;
    public static float industrialMultiToolModifier;
    public static float mysticKniveModifier;
    public static float multiToolModifier;
    public static float batonModifier;
    public static float katanaModifier;
    public static float ninjatoModifier;
    public static float nunchuckModifier;
    public static float clawModifier;
    public static float clawSwordModifier;
    public static float claymoreModifier;
    public static float fantasySwordModifier;
    public static float longClaymoreModifier;
    
    
    



	
	
	

    
    /***********************************************************************************************************************************/ 
    /***********************************************************************************************************************************/
    
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    	
    // Config //
    Configuration config = new Configuration(event.getSuggestedConfigurationFile());
    	config.load();
        
    		activateUpdateChecker = config.get("EVENTS", "Activate Update-Checker", true, "[true/false]").getBoolean();
          //activateOnlyOneTab = config.get("GENERAL", "Activate only one creative tab", false, "[true/false]").getBoolean();    TODO later
    		activateChainArmorCrafting = config.get("CRAFTING", "Activate the crafting recipe for the chain armor (Table of Ages)", true, "[true/false]").getBoolean();
    		activateBasicRecipesOnWorkbench = config.get("CRAFTING", "Activate basic AoW recipes on the normal crafting table", true, "[true/false]").getBoolean();
    		activateWeaponBoxRecipe = config.get("CRAFTING", "Activate the crafting recipe for the Weapon Box", true, "[true/false]").getBoolean();
    		activateNexusRecipe = config.get("CRAFTING", "Activate the crafting recipe for the Nexus", false, "[true/false]").getBoolean();
    		activateShowAges = config.get("GENERAL", "Show the age under the item name", true, "[true/false]").getBoolean();
    		activateDungeonLoot = config.get("GENERATION", "Generate dungeon loot (means only the not important items for the mod)", true, "[true/false]").getBoolean();
    		activateHardcoreMode = config.get("GENERAL", "You can only craft vanilla tools/weapons/armor in the Table of Ages and in the right age", false, "[true/false]").getBoolean();
    		activateBombs = config.get("CRAFTING", "Activate the crafting recipes for the bombs", true, "[true/false]").getBoolean();

    		
    		activateBBY = config.get("AGES", "Activate the recipe for the BBY Upgrade", true, "[true/false]").getBoolean();
    		activateEdoPeriod = config.get("AGES", "Activate the recipe for the Edo Period Upgrade", true, "[true/false]").getBoolean();
    		activateEpic = config.get("AGES", "Activate the recipe for the Epic Upgrade", true, "[true/false]").getBoolean();
    		activateFantasy = config.get("AGES", "Activate the recipe for the Fantasy Upgrade", true, "[true/false]").getBoolean();
    		activateFuture = config.get("AGES", "Activate the recipe for the Future Upgrade", true, "[true/false]").getBoolean();
    		activateMystic = config.get("AGES", "Activate the recipe for the Mystic Upgrade", true, "[true/false]").getBoolean();
    		activatePiracy = config.get("AGES", "Activate the recipe for the Piracy Upgrade", true, "[true/false]").getBoolean();
    		activateModern = config.get("AGES", "Activate the recipe for the Modern Age Upgrade", true, "[true/false]").getBoolean();

    		
    	config.save();	

    	
    	
    // Update-Checker //	
    UpdateChecker.checkForUpdates();  
    
    // Events //
    MinecraftForge.EVENT_BUS.register(new Events());  
    
    // Entity Renderer //
    RenderRegistry.registerEntityRenderers();
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
    	ModEntitys.registerEntities();
    	
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