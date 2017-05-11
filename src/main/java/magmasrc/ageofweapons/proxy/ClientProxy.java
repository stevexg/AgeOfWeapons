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
		
		registerModel(ModItems.axeBladeDiamond, 0, new ModelResourceLocation(ModItems.axeBladeDiamond.getRegistryName(), "inventory"));
		registerModel(ModItems.axeBladeGold, 0, new ModelResourceLocation(ModItems.axeBladeGold.getRegistryName(), "inventory"));
		registerModel(ModItems.axeBladeIron, 0, new ModelResourceLocation(ModItems.axeBladeIron.getRegistryName(), "inventory"));
		registerModel(ModItems.axeBladeStone, 0, new ModelResourceLocation(ModItems.axeBladeStone.getRegistryName(), "inventory"));
		registerModel(ModItems.axeBladeWood, 0, new ModelResourceLocation(ModItems.axeBladeWood.getRegistryName(), "inventory"));
		registerModel(ModItems.swordBladeDiamond, 0, new ModelResourceLocation(ModItems.swordBladeDiamond.getRegistryName(), "inventory"));
		registerModel(ModItems.swordBladeGold, 0, new ModelResourceLocation(ModItems.swordBladeGold.getRegistryName(), "inventory"));
		registerModel(ModItems.swordBladeIron, 0, new ModelResourceLocation(ModItems.swordBladeIron.getRegistryName(), "inventory"));
		registerModel(ModItems.swordBladeStone, 0, new ModelResourceLocation(ModItems.swordBladeStone.getRegistryName(), "inventory"));
		registerModel(ModItems.swordBladeWood, 0, new ModelResourceLocation(ModItems.swordBladeWood.getRegistryName(), "inventory"));
		registerModel(ModItems.broadBladeDiamond, 0, new ModelResourceLocation(ModItems.broadBladeDiamond.getRegistryName(), "inventory"));
		registerModel(ModItems.broadBladeGold, 0, new ModelResourceLocation(ModItems.broadBladeGold.getRegistryName(), "inventory"));
		registerModel(ModItems.broadBladeIron, 0, new ModelResourceLocation(ModItems.broadBladeIron.getRegistryName(), "inventory"));
		registerModel(ModItems.broadBladeStone, 0, new ModelResourceLocation(ModItems.broadBladeStone.getRegistryName(), "inventory"));
		registerModel(ModItems.broadBladeWood, 0, new ModelResourceLocation(ModItems.broadBladeWood.getRegistryName(), "inventory"));
		registerModel(ModItems.ironStick, 0, new ModelResourceLocation(ModItems.ironStick.getRegistryName(), "inventory"));
		registerModel(ModItems.ironLongstick, 0, new ModelResourceLocation(ModItems.ironLongstick.getRegistryName(), "inventory"));
		registerModel(ModItems.woodLongstick, 0, new ModelResourceLocation(ModItems.woodLongstick.getRegistryName(), "inventory"));
		registerModel(ModItems.lumber, 0, new ModelResourceLocation(ModItems.lumber.getRegistryName(), "inventory"));
		registerModel(ModItems.ruby, 0, new ModelResourceLocation(ModItems.ruby.getRegistryName(), "inventory"));
		registerModel(ModItems.sapphire, 0, new ModelResourceLocation(ModItems.sapphire.getRegistryName(), "inventory"));
		registerModel(ModItems.swordHandle, 0, new ModelResourceLocation(ModItems.swordHandle.getRegistryName(), "inventory"));
		registerModel(ModItems.toxin, 0, new ModelResourceLocation(ModItems.toxin.getRegistryName(), "inventory"));
		registerModel(ModItems.radioactiveToxin, 0, new ModelResourceLocation(ModItems.radioactiveToxin.getRegistryName(), "inventory"));
		registerModel(ModItems.diamondShard, 0, new ModelResourceLocation(ModItems.diamondShard.getRegistryName(), "inventory"));
		registerModel(ModItems.emeraldShard, 0, new ModelResourceLocation(ModItems.emeraldShard.getRegistryName(), "inventory"));
		registerModel(ModItems.goldShard, 0, new ModelResourceLocation(ModItems.goldShard.getRegistryName(), "inventory"));
		registerModel(ModItems.ironShard, 0, new ModelResourceLocation(ModItems.ironShard.getRegistryName(), "inventory"));
		registerModel(ModItems.rubyShard, 0, new ModelResourceLocation(ModItems.rubyShard.getRegistryName(), "inventory"));
		registerModel(ModItems.sapphireShard, 0, new ModelResourceLocation(ModItems.sapphireShard.getRegistryName(), "inventory"));
		registerModel(ModItems.stoneShard, 0, new ModelResourceLocation(ModItems.stoneShard.getRegistryName(), "inventory"));
		registerModel(ModItems.woodShard, 0, new ModelResourceLocation(ModItems.woodShard.getRegistryName(), "inventory"));





		// StoneAge
		registerModel(ModItems.rock, 0, new ModelResourceLocation(ModItems.rock.getRegistryName(), "inventory"));

    	
    	
    	
		
		
    	
    	/** Blocks **/
    	
    	registerModel(ModBlocks.tableOfAges, 0, new ModelResourceLocation(ModBlocks.tableOfAges.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.crusher, 0, new ModelResourceLocation(ModBlocks.crusher.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.crusherOn, 0, new ModelResourceLocation(ModBlocks.crusherOn.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.nexus, 0, new ModelResourceLocation(ModBlocks.nexus.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.weaponBox, 0, new ModelResourceLocation(ModBlocks.weaponBox.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.rubyBlock, 0, new ModelResourceLocation(ModBlocks.rubyBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.sapphireBlock, 0, new ModelResourceLocation(ModBlocks.sapphireBlock.getRegistryName(), "inventory"));


    	
    	
    	
    	
    	
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
		
		OreDictionary.registerOre("bladeAxeDiamond", ModItems.axeBladeDiamond);
		OreDictionary.registerOre("bladeAxeGold", ModItems.axeBladeGold);
		OreDictionary.registerOre("bladeAxeIron", ModItems.axeBladeIron);
		OreDictionary.registerOre("bladeAxeStone", ModItems.axeBladeStone);
		OreDictionary.registerOre("bladeAxeWood", ModItems.axeBladeWood);
		OreDictionary.registerOre("bladeSwordDiamond", ModItems.swordBladeDiamond);
		OreDictionary.registerOre("bladeSwordGold", ModItems.swordBladeGold);
		OreDictionary.registerOre("bladeSwordIron", ModItems.swordBladeIron);
		OreDictionary.registerOre("bladeSwordStone", ModItems.swordBladeStone);
		OreDictionary.registerOre("bladeSwordWood", ModItems.swordBladeWood);
		OreDictionary.registerOre("broadbladeDiamond", ModItems.broadBladeDiamond);
		OreDictionary.registerOre("broadbladeGold", ModItems.broadBladeGold);
		OreDictionary.registerOre("broadbladeIron", ModItems.broadBladeIron);
		OreDictionary.registerOre("broadbladeStone", ModItems.broadBladeStone);
		OreDictionary.registerOre("broadbladeWood", ModItems.broadBladeWood);
		OreDictionary.registerOre("stickIron", ModItems.ironStick);
		OreDictionary.registerOre("longstickIron", ModItems.ironLongstick);
		OreDictionary.registerOre("longstickWood", ModItems.woodLongstick);
		OreDictionary.registerOre("lumber", ModItems.lumber);
		OreDictionary.registerOre("gemRuby", ModItems.ruby);
		OreDictionary.registerOre("gemSapphire", ModItems.sapphire);
		OreDictionary.registerOre("handleSword", ModItems.swordHandle);
		OreDictionary.registerOre("potionToxin", ModItems.toxin);
		OreDictionary.registerOre("potionRadioactive", ModItems.radioactiveToxin);

    	
    	//Blocks//
    	OreDictionary.registerOre("craftingTableAoW", ModBlocks.tableOfAges);
    	OreDictionary.registerOre("crusherAoW", ModBlocks.crusher);
    	OreDictionary.registerOre("crusherOnAoW", ModBlocks.crusherOn);
    	OreDictionary.registerOre("weaponBoxAoW", ModBlocks.weaponBox);
    	OreDictionary.registerOre("nexusAoW", ModBlocks.nexus);
    	OreDictionary.registerOre("blockRuby", ModBlocks.rubyBlock);
    	OreDictionary.registerOre("blockSapphire", ModBlocks.sapphireBlock);



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
   

  