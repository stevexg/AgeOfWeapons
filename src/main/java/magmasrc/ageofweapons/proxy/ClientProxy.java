package magmasrc.ageofweapons.proxy;
 
import magmasrc.ageofweapons.entity.EntityCavemanSpear;
import magmasrc.ageofweapons.entity.EntityDynamite;
import magmasrc.ageofweapons.main.ModBlocks;
import magmasrc.ageofweapons.main.ModItems;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
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
		registerModel(ModItems.barrel, 0, new ModelResourceLocation(ModItems.barrel.getRegistryName(), "inventory"));
		registerModel(ModItems.blankGun, 0, new ModelResourceLocation(ModItems.blankGun.getRegistryName(), "inventory"));
		registerModel(ModItems.gunHandle, 0, new ModelResourceLocation(ModItems.gunHandle.getRegistryName(), "inventory"));
		registerModel(ModItems.haftIron, 0, new ModelResourceLocation(ModItems.haftIron.getRegistryName(), "inventory"));
		registerModel(ModItems.haftWood, 0, new ModelResourceLocation(ModItems.haftWood.getRegistryName(), "inventory"));
		registerModel(ModItems.visor, 0, new ModelResourceLocation(ModItems.visor.getRegistryName(), "inventory"));
		registerModel(ModItems.amethyst, 0, new ModelResourceLocation(ModItems.amethyst.getRegistryName(), "inventory"));
		registerModel(ModItems.amethystShard, 0, new ModelResourceLocation(ModItems.amethystShard.getRegistryName(), "inventory"));
		registerModel(ModItems.topaz, 0, new ModelResourceLocation(ModItems.topaz.getRegistryName(), "inventory"));
		registerModel(ModItems.topazShard, 0, new ModelResourceLocation(ModItems.topazShard.getRegistryName(), "inventory"));
		registerModel(ModItems.amber, 0, new ModelResourceLocation(ModItems.amber.getRegistryName(), "inventory"));
		registerModel(ModItems.glassShard, 0, new ModelResourceLocation(ModItems.glassShard.getRegistryName(), "inventory"));
		registerModel(ModItems.hammer, 0, new ModelResourceLocation(ModItems.hammer.getRegistryName(), "inventory"));
		
		// StoneAge
		registerModel(ModItems.rock, 0, new ModelResourceLocation(ModItems.rock.getRegistryName(), "inventory"));
		registerModel(ModItems.handAxStone, 0, new ModelResourceLocation(ModItems.handAxStone.getRegistryName(), "inventory"));
		registerModel(ModItems.cavemanKniveStone, 0, new ModelResourceLocation(ModItems.cavemanKniveStone.getRegistryName(), "inventory"));
		registerModel(ModItems.cavemanKniveBone, 0, new ModelResourceLocation(ModItems.cavemanKniveBone.getRegistryName(), "inventory"));
		registerModel(ModItems.woodCudgel, 0, new ModelResourceLocation(ModItems.woodCudgel.getRegistryName(), "inventory"));
		registerModel(ModItems.stoneCudgel, 0, new ModelResourceLocation(ModItems.stoneCudgel.getRegistryName(), "inventory"));
		registerModel(ModItems.ax, 0, new ModelResourceLocation(ModItems.ax.getRegistryName(), "inventory"));
		registerModel(ModItems.throwWood, 0, new ModelResourceLocation(ModItems.throwWood.getRegistryName(), "inventory"));
		registerModel(ModItems.cavemanSpear, 0, new ModelResourceLocation(ModItems.cavemanSpear.getRegistryName(), "inventory"));
	  	registerModel(ModItems.cavemanHelmet, 0, new ModelResourceLocation(ModItems.cavemanHelmet.getRegistryName(), "inventory"));
    	registerModel(ModItems.cavemanChestplate, 0, new ModelResourceLocation(ModItems.cavemanChestplate.getRegistryName(), "inventory"));
    	registerModel(ModItems.cavemanLeggings, 0, new ModelResourceLocation(ModItems.cavemanLeggings.getRegistryName(), "inventory"));
    	registerModel(ModItems.cavemanBoots, 0, new ModelResourceLocation(ModItems.cavemanBoots.getRegistryName(), "inventory"));
		
		// Antiquity
		registerModel(ModItems.kniveWood, 0, new ModelResourceLocation    (ModItems.kniveWood.getRegistryName(), "inventory"));
		registerModel(ModItems.kniveStone, 0, new ModelResourceLocation   (ModItems.kniveStone.getRegistryName(), "inventory"));
		registerModel(ModItems.kniveIron, 0, new ModelResourceLocation	  (ModItems.kniveIron.getRegistryName(), "inventory"));
		registerModel(ModItems.kniveGold, 0, new ModelResourceLocation    (ModItems.kniveGold.getRegistryName(), "inventory"));
		registerModel(ModItems.kniveDiamond, 0, new ModelResourceLocation (ModItems.kniveDiamond.getRegistryName(), "inventory"));
		registerModel(ModItems.daggerWood, 0, new ModelResourceLocation   (ModItems.daggerWood.getRegistryName(), "inventory"));
		registerModel(ModItems.daggerStone, 0, new ModelResourceLocation  (ModItems.daggerStone.getRegistryName(), "inventory"));
		registerModel(ModItems.daggerIron, 0, new ModelResourceLocation   (ModItems.daggerIron.getRegistryName(), "inventory"));
		registerModel(ModItems.daggerGold, 0, new ModelResourceLocation   (ModItems.daggerGold.getRegistryName(), "inventory"));
		registerModel(ModItems.daggerDiamond, 0, new ModelResourceLocation(ModItems.daggerDiamond.getRegistryName(), "inventory"));
		registerModel(ModItems.skewerWood, 0, new ModelResourceLocation   (ModItems.skewerWood.getRegistryName(), "inventory"));
		registerModel(ModItems.skewerStone, 0, new ModelResourceLocation  (ModItems.skewerStone.getRegistryName(), "inventory"));
		registerModel(ModItems.skewerIron, 0, new ModelResourceLocation   (ModItems.skewerIron.getRegistryName(), "inventory"));
		registerModel(ModItems.skewerGold, 0, new ModelResourceLocation   (ModItems.skewerGold.getRegistryName(), "inventory"));
		registerModel(ModItems.skewerDiamond, 0, new ModelResourceLocation(ModItems.skewerDiamond.getRegistryName(), "inventory"));
		registerModel(ModItems.recurveBow, 0, new ModelResourceLocation(ModItems.recurveBow.getRegistryName(), "inventory"));
		
		// MiddleAges
		registerModel(ModItems.crossbow, 0, new ModelResourceLocation(ModItems.crossbow.getRegistryName(), "inventory"));
		registerModel(ModItems.longbow, 0, new ModelResourceLocation(ModItems.longbow.getRegistryName(), "inventory"));
		registerModel(ModItems.battleAxeWood, 0, new ModelResourceLocation   (ModItems.battleAxeWood.getRegistryName(), "inventory"));
		registerModel(ModItems.battleAxeStone, 0, new ModelResourceLocation  (ModItems.battleAxeStone.getRegistryName(), "inventory"));
		registerModel(ModItems.battleAxeIron, 0, new ModelResourceLocation   (ModItems.battleAxeIron.getRegistryName(), "inventory"));
		registerModel(ModItems.battleAxeGold, 0, new ModelResourceLocation   (ModItems.battleAxeGold.getRegistryName(), "inventory"));
		registerModel(ModItems.battleAxeDiamond, 0, new ModelResourceLocation(ModItems.battleAxeDiamond.getRegistryName(), "inventory"));
		registerModel(ModItems.flailStone, 0, new ModelResourceLocation  (ModItems.flailStone.getRegistryName(), "inventory"));
		registerModel(ModItems.flailIron, 0, new ModelResourceLocation   (ModItems.flailIron.getRegistryName(), "inventory"));
		registerModel(ModItems.flailGold, 0, new ModelResourceLocation   (ModItems.flailGold.getRegistryName(), "inventory"));
		registerModel(ModItems.flailDiamond, 0, new ModelResourceLocation(ModItems.flailDiamond.getRegistryName(), "inventory"));
		registerModel(ModItems.halbertWood, 0, new ModelResourceLocation   (ModItems.halbertWood.getRegistryName(), "inventory"));
		registerModel(ModItems.halbertStone, 0, new ModelResourceLocation  (ModItems.halbertStone.getRegistryName(), "inventory"));
		registerModel(ModItems.halbertIron, 0, new ModelResourceLocation   (ModItems.halbertIron.getRegistryName(), "inventory"));
		registerModel(ModItems.halbertGold, 0, new ModelResourceLocation   (ModItems.halbertGold.getRegistryName(), "inventory"));
		registerModel(ModItems.halbertDiamond, 0, new ModelResourceLocation(ModItems.halbertDiamond.getRegistryName(), "inventory"));
		registerModel(ModItems.longswordWood, 0, new ModelResourceLocation   (ModItems.longswordWood.getRegistryName(), "inventory"));
		registerModel(ModItems.longswordStone, 0, new ModelResourceLocation  (ModItems.longswordStone.getRegistryName(), "inventory"));
		registerModel(ModItems.longswordIron, 0, new ModelResourceLocation   (ModItems.longswordIron.getRegistryName(), "inventory"));
		registerModel(ModItems.longswordGold, 0, new ModelResourceLocation   (ModItems.longswordGold.getRegistryName(), "inventory"));
		registerModel(ModItems.longswordDiamond, 0, new ModelResourceLocation(ModItems.longswordDiamond.getRegistryName(), "inventory"));
		registerModel(ModItems.spearWood, 0, new ModelResourceLocation   (ModItems.spearWood.getRegistryName(), "inventory"));
		registerModel(ModItems.spearStone, 0, new ModelResourceLocation  (ModItems.spearStone.getRegistryName(), "inventory"));
		registerModel(ModItems.spearIron, 0, new ModelResourceLocation   (ModItems.spearIron.getRegistryName(), "inventory"));
		registerModel(ModItems.spearGold, 0, new ModelResourceLocation   (ModItems.spearGold.getRegistryName(), "inventory"));
		registerModel(ModItems.spearDiamond, 0, new ModelResourceLocation(ModItems.spearDiamond.getRegistryName(), "inventory"));
		registerModel(ModItems.tridentWood, 0, new ModelResourceLocation   (ModItems.tridentWood.getRegistryName(), "inventory"));
		registerModel(ModItems.tridentStone, 0, new ModelResourceLocation  (ModItems.tridentStone.getRegistryName(), "inventory"));
		registerModel(ModItems.tridentIron, 0, new ModelResourceLocation   (ModItems.tridentIron.getRegistryName(), "inventory"));
		registerModel(ModItems.tridentGold, 0, new ModelResourceLocation   (ModItems.tridentGold.getRegistryName(), "inventory"));
		registerModel(ModItems.tridentDiamond, 0, new ModelResourceLocation(ModItems.tridentDiamond.getRegistryName(), "inventory"));
		registerModel(ModItems.waraxeWood, 0, new ModelResourceLocation   (ModItems.waraxeWood.getRegistryName(), "inventory"));
		registerModel(ModItems.waraxeStone, 0, new ModelResourceLocation  (ModItems.waraxeStone.getRegistryName(), "inventory"));
		registerModel(ModItems.waraxeIron, 0, new ModelResourceLocation   (ModItems.waraxeIron.getRegistryName(), "inventory"));
		registerModel(ModItems.waraxeGold, 0, new ModelResourceLocation   (ModItems.waraxeGold.getRegistryName(), "inventory"));
		registerModel(ModItems.waraxeDiamond, 0, new ModelResourceLocation(ModItems.waraxeDiamond.getRegistryName(), "inventory"));
		registerModel(ModItems.warhammerWood, 0, new ModelResourceLocation   (ModItems.warhammerWood.getRegistryName(), "inventory"));
		registerModel(ModItems.warhammerStone, 0, new ModelResourceLocation  (ModItems.warhammerStone.getRegistryName(), "inventory"));
		registerModel(ModItems.warhammerIron, 0, new ModelResourceLocation   (ModItems.warhammerIron.getRegistryName(), "inventory"));
		registerModel(ModItems.warhammerGold, 0, new ModelResourceLocation   (ModItems.warhammerGold.getRegistryName(), "inventory"));
		registerModel(ModItems.warhammerDiamond, 0, new ModelResourceLocation(ModItems.warhammerDiamond.getRegistryName(), "inventory"));
		
		//Early Modern Age
		registerModel(ModItems.multiToolWood, 0, new ModelResourceLocation   (ModItems.multiToolWood.getRegistryName(), "inventory"));
		registerModel(ModItems.multiToolStone, 0, new ModelResourceLocation  (ModItems.multiToolStone.getRegistryName(), "inventory"));
		registerModel(ModItems.multiToolIron, 0, new ModelResourceLocation   (ModItems.multiToolIron.getRegistryName(), "inventory"));
		registerModel(ModItems.multiToolGold, 0, new ModelResourceLocation   (ModItems.multiToolGold.getRegistryName(), "inventory"));
		registerModel(ModItems.multiToolDiamond, 0, new ModelResourceLocation(ModItems.multiToolDiamond.getRegistryName(), "inventory"));
		registerModel(ModItems.compoundBow, 0, new ModelResourceLocation   (ModItems.compoundBow.getRegistryName(), "inventory"));
		registerModel(ModItems.dynamite, 0, new ModelResourceLocation   (ModItems.dynamite.getRegistryName(), "inventory"));
		registerModel(ModItems.oldAmmo, 0, new ModelResourceLocation   (ModItems.oldAmmo.getRegistryName(), "inventory"));
		registerModel(ModItems.oldShotgunAmmo, 0, new ModelResourceLocation   (ModItems.oldShotgunAmmo.getRegistryName(), "inventory"));
		registerModel(ModItems.cannonball, 0, new ModelResourceLocation   (ModItems.cannonball.getRegistryName(), "inventory"));
		registerModel(ModItems.pebble, 0, new ModelResourceLocation   (ModItems.pebble.getRegistryName(), "inventory"));
		registerModel(ModItems.nails, 0, new ModelResourceLocation   (ModItems.nails.getRegistryName(), "inventory"));
		registerModel(ModItems.nails_toxic, 0, new ModelResourceLocation   (ModItems.nails_toxic.getRegistryName(), "inventory"));

		
		
/** TEMPLATE		
		registerModel(ModItems.Wood, 0, new ModelResourceLocation   (ModItems.Wood.getRegistryName(), "inventory"));
		registerModel(ModItems.Stone, 0, new ModelResourceLocation  (ModItems.Stone.getRegistryName(), "inventory"));
		registerModel(ModItems.Iron, 0, new ModelResourceLocation   (ModItems.Iron.getRegistryName(), "inventory"));
		registerModel(ModItems.Gold, 0, new ModelResourceLocation   (ModItems.Gold.getRegistryName(), "inventory"));
		registerModel(ModItems.Diamond, 0, new ModelResourceLocation(ModItems.Diamond.getRegistryName(), "inventory"));
**/    	
		
		
		
		
		
		
    	
		
		
    	
    	/** Blocks **/
    	
    	registerModel(ModBlocks.tableOfAges, 0, new ModelResourceLocation(ModBlocks.tableOfAges.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.crusher, 0, new ModelResourceLocation(ModBlocks.crusher.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.crusherOn, 0, new ModelResourceLocation(ModBlocks.crusherOn.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.nexus, 0, new ModelResourceLocation(ModBlocks.nexus.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.nexus2, 0, new ModelResourceLocation(ModBlocks.nexus2.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.nexus3, 0, new ModelResourceLocation(ModBlocks.nexus3.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.nexus4, 0, new ModelResourceLocation(ModBlocks.nexus4.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.weaponBox, 0, new ModelResourceLocation(ModBlocks.weaponBox.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.rubyBlock, 0, new ModelResourceLocation(ModBlocks.rubyBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.sapphireBlock, 0, new ModelResourceLocation(ModBlocks.sapphireBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.amethystBlock, 0, new ModelResourceLocation(ModBlocks.amethystBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.amberBlock, 0, new ModelResourceLocation(ModBlocks.amberBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.topazBlock, 0, new ModelResourceLocation(ModBlocks.topazBlock.getRegistryName(), "inventory"));

    	registerModel(ModBlocks.barbedWire, 0, new ModelResourceLocation(ModBlocks.barbedWire.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.nailTrap, 0, new ModelResourceLocation(ModBlocks.nailTrap.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.toxicNailTrap, 0, new ModelResourceLocation(ModBlocks.toxicNailTrap.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.explosiveMine, 0, new ModelResourceLocation(ModBlocks.explosiveMine.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.toxicMine, 0, new ModelResourceLocation(ModBlocks.toxicMine.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.razorWire, 0, new ModelResourceLocation(ModBlocks.razorWire.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.bearTrap, 0, new ModelResourceLocation(ModBlocks.bearTrap.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.fallTrapDirt, 0, new ModelResourceLocation(ModBlocks.fallTrapDirt.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.fallTrapPlanks, 0, new ModelResourceLocation(ModBlocks.fallTrapPlanks.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.fallTrapStone, 0, new ModelResourceLocation(ModBlocks.fallTrapStone.getRegistryName(), "inventory"));


    	

    //==============================================================================================================//	
    	
    	
    	/** Ore Dictionary **/
    	
    	/**Items**/
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
		OreDictionary.registerOre("gemAmethyst", ModItems.amethyst);
		OreDictionary.registerOre("gemTopaz", ModItems.topaz);
		OreDictionary.registerOre("gemAmber", ModItems.amber);
		OreDictionary.registerOre("shardWood", ModItems.woodShard);
		OreDictionary.registerOre("shardIron", ModItems.ironShard);
		OreDictionary.registerOre("shardStone", ModItems.stoneShard);
		OreDictionary.registerOre("shardGold", ModItems.goldShard);
		OreDictionary.registerOre("shardDiamond", ModItems.diamondShard);
		OreDictionary.registerOre("shardEmerald", ModItems.emeraldShard);
		OreDictionary.registerOre("shardSapphire", ModItems.sapphireShard);
		OreDictionary.registerOre("shardRuby", ModItems.rubyShard);
		OreDictionary.registerOre("shardTopaz", ModItems.topazShard);
		OreDictionary.registerOre("shardAmethyst", ModItems.amethystShard);
		OreDictionary.registerOre("shardGlass", ModItems.glassShard);
		OreDictionary.registerOre("handleSword", ModItems.swordHandle);
		OreDictionary.registerOre("potionToxin", ModItems.toxin);
		OreDictionary.registerOre("potionRadioactive", ModItems.radioactiveToxin);
		OreDictionary.registerOre("partBarrel", ModItems.barrel);
		OreDictionary.registerOre("partBlankGun", ModItems.blankGun);
		OreDictionary.registerOre("partHandleGun", ModItems.gunHandle);
		OreDictionary.registerOre("partHaftWood", ModItems.haftWood);
		OreDictionary.registerOre("partHaftIron", ModItems.haftIron);
		OreDictionary.registerOre("partVisor", ModItems.visor);
		OreDictionary.registerOre("toolHammer", ModItems.hammer);
		
		//Stone Age
		OreDictionary.registerOre("weaponRock", ModItems.rock);
		OreDictionary.registerOre("weaponHandAx", ModItems.handAxStone);
		OreDictionary.registerOre("kniveCavemanStone", ModItems.cavemanKniveStone);
		OreDictionary.registerOre("kniveCavemanBone", ModItems.cavemanKniveBone);
		OreDictionary.registerOre("cudgelWood", ModItems.woodCudgel);
		OreDictionary.registerOre("cudgelStone", ModItems.stoneCudgel);
		OreDictionary.registerOre("weaponAx", ModItems.ax);
		OreDictionary.registerOre("weaponThrowWood", ModItems.throwWood);
		OreDictionary.registerOre("spearCaveman", ModItems.cavemanSpear);
		
		//Antiquity
		OreDictionary.registerOre("kniveWood",    ModItems.kniveWood);
		OreDictionary.registerOre("kniveStone",   ModItems.kniveStone);
		OreDictionary.registerOre("kniveIron",    ModItems.kniveIron);
		OreDictionary.registerOre("kniveGold",    ModItems.kniveGold);
		OreDictionary.registerOre("kniveDiamond", ModItems.kniveDiamond);
		OreDictionary.registerOre("daggerWood",    ModItems.daggerWood);
		OreDictionary.registerOre("daggerStone",   ModItems.daggerStone);
		OreDictionary.registerOre("daggerIron",    ModItems.daggerIron);
		OreDictionary.registerOre("daggerGold",    ModItems.daggerGold);
		OreDictionary.registerOre("daggerDiamond", ModItems.daggerDiamond);
		OreDictionary.registerOre("skewerWood",    ModItems.skewerWood);
		OreDictionary.registerOre("skewerStone",   ModItems.skewerStone);
		OreDictionary.registerOre("skewerIron",    ModItems.skewerIron);
		OreDictionary.registerOre("skewerGold",    ModItems.skewerGold);
		OreDictionary.registerOre("skewerDiamond", ModItems.skewerDiamond);
		OreDictionary.registerOre("bowRecurve",   ModItems.recurveBow);
		
		/*******/
		
		//Early Modern Age
		OreDictionary.registerOre("ammoOld", ModItems.oldAmmo);
		OreDictionary.registerOre("ammoShotgunOld", ModItems.oldShotgunAmmo);
		OreDictionary.registerOre("ammoPebble", ModItems.pebble);
		OreDictionary.registerOre("ammoCannonball", ModItems.cannonball);
		OreDictionary.registerOre("bowCompound", ModItems.compoundBow);

		
		
/** TEMPLATE		
		OreDictionary.registerOre("Wood",    ModItems.Wood);
		OreDictionary.registerOre("Stone",   ModItems.Stone);
		OreDictionary.registerOre("Iron",    ModItems.Iron);
		OreDictionary.registerOre("Gold",    ModItems.Gold);
		OreDictionary.registerOre("Diamond", ModItems.Diamond);
**/		

		
		
		
		
		
		
    	
    	/**Blocks**/
    	OreDictionary.registerOre("craftingTableAoW", ModBlocks.tableOfAges);
    	OreDictionary.registerOre("crusherAoW", ModBlocks.crusher);
    	OreDictionary.registerOre("crusherOnAoW", ModBlocks.crusherOn);
    	OreDictionary.registerOre("weaponBoxAoW", ModBlocks.weaponBox);
    	OreDictionary.registerOre("nexusAoW", ModBlocks.nexus);
    	OreDictionary.registerOre("nexusAoW", ModBlocks.nexus2);
    	OreDictionary.registerOre("nexusAoW", ModBlocks.nexus3);
    	OreDictionary.registerOre("nexusAoW", ModBlocks.nexus4);
    	OreDictionary.registerOre("blockRuby", ModBlocks.rubyBlock);
    	OreDictionary.registerOre("blockSapphire", ModBlocks.sapphireBlock);
    	OreDictionary.registerOre("blockAmethyst", ModBlocks.amethystBlock);
    	OreDictionary.registerOre("blockTopaz", ModBlocks.topazBlock);
    	OreDictionary.registerOre("blockAmber", ModBlocks.amberBlock);



    }
    
    
    
    
	/** Entitys **/
	
	public void registerRenderer() {
	/**	RenderingRegistry.registerEntityRenderingHandler(EntityCavemanSpear.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderSnowball<EntityCavemanSpear>(manager, ModItems.cavemanSpear, Minecraft.getMinecraft().getRenderItem());
			}
		});
	**/	
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityDynamite.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderSnowball<EntityDynamite>(manager, ModItems.dynamite, Minecraft.getMinecraft().getRenderItem());
			}
		});
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
   

  