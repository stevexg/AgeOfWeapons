package magmasrc.ageofweapons.proxy;
 
import magmasrc.ageofweapons.entity.EntityCavemanSpear;
import magmasrc.ageofweapons.entity.EntityDynamite;
import magmasrc.ageofweapons.entity.render.EntityDynamiteRenderer;
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
		registerModel(ModItems.cloth, 0, new ModelResourceLocation(ModItems.cloth.getRegistryName(), "inventory"));
		
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
		registerModel(ModItems.nailsToxic, 0, new ModelResourceLocation   (ModItems.nailsToxic.getRegistryName(), "inventory"));
		registerModel(ModItems.blankRifle, 0, new ModelResourceLocation   (ModItems.blankRifle.getRegistryName(), "inventory"));


		//Mystic
		registerModel(ModItems.mysticKnive, 0, new ModelResourceLocation   (ModItems.mysticKnive.getRegistryName(), "inventory"));
		registerModel(ModItems.pufferfishStick, 0, new ModelResourceLocation   (ModItems.pufferfishStick.getRegistryName(), "inventory"));
		registerModel(ModItems.scepterUnholy, 0, new ModelResourceLocation   (ModItems.scepterUnholy.getRegistryName(), "inventory"));
		registerModel(ModItems.wandBasic, 0, new ModelResourceLocation   (ModItems.wandBasic.getRegistryName(), "inventory"));
		registerModel(ModItems.wandAether, 0, new ModelResourceLocation   (ModItems.wandAether.getRegistryName(), "inventory"));
		registerModel(ModItems.wandNether, 0, new ModelResourceLocation   (ModItems.wandNether.getRegistryName(), "inventory"));
		registerModel(ModItems.wandCurse, 0, new ModelResourceLocation   (ModItems.wandCurse.getRegistryName(), "inventory"));
		registerModel(ModItems.wandHoly, 0, new ModelResourceLocation   (ModItems.wandHoly.getRegistryName(), "inventory"));
		registerModel(ModItems.wandMaelstrom, 0, new ModelResourceLocation   (ModItems.wandMaelstrom.getRegistryName(), "inventory"));
		registerModel(ModItems.warhornDefensive, 0, new ModelResourceLocation   (ModItems.warhornDefensive.getRegistryName(), "inventory"));
		registerModel(ModItems.warhornOffensive, 0, new ModelResourceLocation   (ModItems.warhornOffensive.getRegistryName(), "inventory"));

		//Fantasy
		registerModel(ModItems.clawWood, 0, new ModelResourceLocation   (ModItems.clawWood.getRegistryName(), "inventory"));
		registerModel(ModItems.clawStone, 0, new ModelResourceLocation  (ModItems.clawStone.getRegistryName(), "inventory"));
		registerModel(ModItems.clawIron, 0, new ModelResourceLocation   (ModItems.clawIron.getRegistryName(), "inventory"));
		registerModel(ModItems.clawGold, 0, new ModelResourceLocation   (ModItems.clawGold.getRegistryName(), "inventory"));
		registerModel(ModItems.clawDiamond, 0, new ModelResourceLocation(ModItems.clawDiamond.getRegistryName(), "inventory"));
		registerModel(ModItems.clawSwordWood, 0, new ModelResourceLocation   (ModItems.clawSwordWood.getRegistryName(), "inventory"));
		registerModel(ModItems.clawSwordStone, 0, new ModelResourceLocation  (ModItems.clawSwordStone.getRegistryName(), "inventory"));
		registerModel(ModItems.clawSwordIron, 0, new ModelResourceLocation   (ModItems.clawSwordIron.getRegistryName(), "inventory"));
		registerModel(ModItems.clawSwordGold, 0, new ModelResourceLocation   (ModItems.clawSwordGold.getRegistryName(), "inventory"));
		registerModel(ModItems.clawSwordDiamond, 0, new ModelResourceLocation(ModItems.clawSwordDiamond.getRegistryName(), "inventory"));
		registerModel(ModItems.claymoreWood, 0, new ModelResourceLocation   (ModItems.claymoreWood.getRegistryName(), "inventory"));
		registerModel(ModItems.claymoreStone, 0, new ModelResourceLocation  (ModItems.claymoreStone.getRegistryName(), "inventory"));
		registerModel(ModItems.claymoreIron, 0, new ModelResourceLocation   (ModItems.claymoreIron.getRegistryName(), "inventory"));
		registerModel(ModItems.claymoreGold, 0, new ModelResourceLocation   (ModItems.claymoreGold.getRegistryName(), "inventory"));
		registerModel(ModItems.claymoreDiamond, 0, new ModelResourceLocation(ModItems.claymoreDiamond.getRegistryName(), "inventory"));
		registerModel(ModItems.fantasySwordWood, 0, new ModelResourceLocation   (ModItems.fantasySwordWood.getRegistryName(), "inventory"));
		registerModel(ModItems.fantasySwordStone, 0, new ModelResourceLocation  (ModItems.fantasySwordStone.getRegistryName(), "inventory"));
		registerModel(ModItems.fantasySwordIron, 0, new ModelResourceLocation   (ModItems.fantasySwordIron.getRegistryName(), "inventory"));
		registerModel(ModItems.fantasySwordGold, 0, new ModelResourceLocation   (ModItems.fantasySwordGold.getRegistryName(), "inventory"));
		registerModel(ModItems.fantasySwordDiamond, 0, new ModelResourceLocation(ModItems.fantasySwordDiamond.getRegistryName(), "inventory"));
		registerModel(ModItems.longClaymoreWood, 0, new ModelResourceLocation   (ModItems.longClaymoreWood.getRegistryName(), "inventory"));
		registerModel(ModItems.longClaymoreStone, 0, new ModelResourceLocation  (ModItems.longClaymoreStone.getRegistryName(), "inventory"));
		registerModel(ModItems.longClaymoreIron, 0, new ModelResourceLocation   (ModItems.longClaymoreIron.getRegistryName(), "inventory"));
		registerModel(ModItems.longClaymoreGold, 0, new ModelResourceLocation   (ModItems.longClaymoreGold.getRegistryName(), "inventory"));
		registerModel(ModItems.longClaymoreDiamond, 0, new ModelResourceLocation(ModItems.longClaymoreDiamond.getRegistryName(), "inventory"));
		registerModel(ModItems.lightBow, 0, new ModelResourceLocation   (ModItems.lightBow.getRegistryName(), "inventory"));
		registerModel(ModItems.shadowBow, 0, new ModelResourceLocation   (ModItems.shadowBow.getRegistryName(), "inventory"));

		//Edo Period
		registerModel(ModItems.katanaWood, 0, new ModelResourceLocation    (ModItems.katanaWood.getRegistryName(), "inventory"));
		registerModel(ModItems.katanaStone, 0, new ModelResourceLocation   (ModItems.katanaStone.getRegistryName(), "inventory"));
		registerModel(ModItems.katanaIron, 0, new ModelResourceLocation    (ModItems.katanaIron.getRegistryName(), "inventory"));
		registerModel(ModItems.katanaGold, 0, new ModelResourceLocation    (ModItems.katanaGold.getRegistryName(), "inventory"));
		registerModel(ModItems.katanaDiamond, 0, new ModelResourceLocation (ModItems.katanaDiamond.getRegistryName(), "inventory"));
		registerModel(ModItems.ninjatoWood, 0, new ModelResourceLocation    (ModItems.ninjatoWood.getRegistryName(), "inventory"));
		registerModel(ModItems.ninjatoStone, 0, new ModelResourceLocation   (ModItems.ninjatoStone.getRegistryName(), "inventory"));
		registerModel(ModItems.ninjatoIron, 0, new ModelResourceLocation    (ModItems.ninjatoIron.getRegistryName(), "inventory"));
		registerModel(ModItems.ninjatoGold, 0, new ModelResourceLocation    (ModItems.ninjatoGold.getRegistryName(), "inventory"));
		registerModel(ModItems.ninjatoDiamond, 0, new ModelResourceLocation (ModItems.ninjatoDiamond.getRegistryName(), "inventory"));
		registerModel(ModItems.blowgun, 0, new ModelResourceLocation(ModItems.blowgun.getRegistryName(), "inventory"));
		registerModel(ModItems.batonWood, 0, new ModelResourceLocation    (ModItems.batonWood.getRegistryName(), "inventory"));
		registerModel(ModItems.batonIron, 0, new ModelResourceLocation    (ModItems.batonIron.getRegistryName(), "inventory"));
		registerModel(ModItems.nunchuckWood, 0, new ModelResourceLocation    (ModItems.nunchuckWood.getRegistryName(), "inventory"));
		registerModel(ModItems.nunchuckIron, 0, new ModelResourceLocation    (ModItems.nunchuckIron.getRegistryName(), "inventory"));
		registerModel(ModItems.lash, 0, new ModelResourceLocation    (ModItems.lash.getRegistryName(), "inventory"));
		registerModel(ModItems.kunai, 0, new ModelResourceLocation    (ModItems.kunai.getRegistryName(), "inventory"));
		registerModel(ModItems.throwingStar, 0, new ModelResourceLocation    (ModItems.throwingStar.getRegistryName(), "inventory"));
		registerModel(ModItems.throwingKnifeIron, 0, new ModelResourceLocation    (ModItems.throwingKnifeIron.getRegistryName(), "inventory"));
		registerModel(ModItems.throwingKnifeGold, 0, new ModelResourceLocation    (ModItems.throwingKnifeGold.getRegistryName(), "inventory"));
		registerModel(ModItems.throwingKnifeDiamond, 0, new ModelResourceLocation    (ModItems.throwingKnifeDiamond.getRegistryName(), "inventory"));
	  	registerModel(ModItems.assassinHelmet, 0, new ModelResourceLocation(ModItems.assassinHelmet.getRegistryName(), "inventory"));
    	registerModel(ModItems.assassinChestplate, 0, new ModelResourceLocation(ModItems.assassinChestplate.getRegistryName(), "inventory"));
    	registerModel(ModItems.assassinLeggings, 0, new ModelResourceLocation(ModItems.assassinLeggings.getRegistryName(), "inventory"));
    	registerModel(ModItems.assassinBoots, 0, new ModelResourceLocation(ModItems.assassinBoots.getRegistryName(), "inventory"));
	  	registerModel(ModItems.ninjaHelmet, 0, new ModelResourceLocation(ModItems.ninjaHelmet.getRegistryName(), "inventory"));
    	registerModel(ModItems.ninjaChestplate, 0, new ModelResourceLocation(ModItems.ninjaChestplate.getRegistryName(), "inventory"));
    	registerModel(ModItems.ninjaLeggings, 0, new ModelResourceLocation(ModItems.ninjaLeggings.getRegistryName(), "inventory"));
    	registerModel(ModItems.ninjaBoots, 0, new ModelResourceLocation(ModItems.ninjaBoots.getRegistryName(), "inventory"));

    	//Modern Age
    	registerModel(ModItems.fieldGlasses, 0, new ModelResourceLocation(ModItems.fieldGlasses.getRegistryName(), "inventory"));
    	registerModel(ModItems.nightVisionGoggles, 0, new ModelResourceLocation(ModItems.nightVisionGoggles.getRegistryName(), "inventory"));
    	registerModel(ModItems.taser, 0, new ModelResourceLocation(ModItems.taser.getRegistryName(), "inventory"));
    	registerModel(ModItems.flameThrower, 0, new ModelResourceLocation(ModItems.flameThrower.getRegistryName(), "inventory"));
    	registerModel(ModItems.industrialExcavator, 0, new ModelResourceLocation(ModItems.industrialExcavator.getRegistryName(), "inventory"));
    	registerModel(ModItems.industrialMiner, 0, new ModelResourceLocation(ModItems.industrialMiner.getRegistryName(), "inventory"));
		registerModel(ModItems.tankFlame, 0, new ModelResourceLocation   (ModItems.tankFlame.getRegistryName(), "inventory"));
		registerModel(ModItems.machineCase, 0, new ModelResourceLocation   (ModItems.machineCase.getRegistryName(), "inventory"));
		registerModel(ModItems.ammoSmall, 0, new ModelResourceLocation   (ModItems.ammoSmall.getRegistryName(), "inventory"));
		registerModel(ModItems.ammoBig, 0, new ModelResourceLocation   (ModItems.ammoBig.getRegistryName(), "inventory"));
		registerModel(ModItems.ammoBundleSmall, 0, new ModelResourceLocation   (ModItems.ammoBundleSmall.getRegistryName(), "inventory"));
		registerModel(ModItems.ammoBundleBig, 0, new ModelResourceLocation   (ModItems.ammoBundleBig.getRegistryName(), "inventory"));
		registerModel(ModItems.concentratedGunpowder, 0, new ModelResourceLocation   (ModItems.concentratedGunpowder.getRegistryName(), "inventory"));
		registerModel(ModItems.magazineSmall, 0, new ModelResourceLocation   (ModItems.magazineSmall.getRegistryName(), "inventory"));
		registerModel(ModItems.magazineLong, 0, new ModelResourceLocation   (ModItems.magazineLong.getRegistryName(), "inventory"));
		registerModel(ModItems.magazineBig, 0, new ModelResourceLocation   (ModItems.magazineBig.getRegistryName(), "inventory"));
		registerModel(ModItems.magazineDrum, 0, new ModelResourceLocation   (ModItems.magazineDrum.getRegistryName(), "inventory"));
		registerModel(ModItems.shotgunAmmo, 0, new ModelResourceLocation   (ModItems.shotgunAmmo.getRegistryName(), "inventory"));
		registerModel(ModItems.shotgunAmmo2, 0, new ModelResourceLocation   (ModItems.shotgunAmmo2.getRegistryName(), "inventory"));
    	
    	//Future
		registerModel(ModItems.tankPoison, 0, new ModelResourceLocation   (ModItems.tankPoison.getRegistryName(), "inventory"));
    	registerModel(ModItems.poisonThrower, 0, new ModelResourceLocation(ModItems.poisonThrower.getRegistryName(), "inventory"));
    	registerModel(ModItems.industrialMultiTool, 0, new ModelResourceLocation(ModItems.industrialMultiTool.getRegistryName(), "inventory"));

		
/** TEMPLATE		
		registerModel(ModItems.Wood, 0, new ModelResourceLocation    (ModItems.Wood.getRegistryName(), "inventory"));
		registerModel(ModItems.Stone, 0, new ModelResourceLocation   (ModItems.Stone.getRegistryName(), "inventory"));
		registerModel(ModItems.Iron, 0, new ModelResourceLocation    (ModItems.Iron.getRegistryName(), "inventory"));
		registerModel(ModItems.Gold, 0, new ModelResourceLocation    (ModItems.Gold.getRegistryName(), "inventory"));
		registerModel(ModItems.Diamond, 0, new ModelResourceLocation (ModItems.Diamond.getRegistryName(), "inventory"));
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

    	registerModel(ModBlocks.neutronBomb, 0, new ModelResourceLocation(ModBlocks.neutronBomb.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.nuclearBomb, 0, new ModelResourceLocation(ModBlocks.nuclearBomb.getRegistryName(), "inventory"));

    	
    }
    
    
    
    
    
    
    
    
    
	/** Entitys **/
	
	public void registerRenderer() {

		
	/**
		RenderingRegistry.registerEntityRenderingHandler(EntityDynamite.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderSnowball<EntityDynamite>(manager, ModItems.dynamite, Minecraft.getMinecraft().getRenderItem());
			}
		}); **/
		 RenderingRegistry.registerEntityRenderingHandler(EntityDynamite.class, EntityDynamiteRenderer.FACTORY);

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
   

  