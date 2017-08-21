package magmasrc.ageofweapons.proxy;

import magmasrc.ageofweapons.entity.EntityDynamite;
import magmasrc.ageofweapons.entity.render.EntityDynamiteRenderer;
import magmasrc.ageofweapons.main.ModBlocks;
import magmasrc.ageofweapons.main.ModItems;
import magmasrc.ageofweapons.util.ModelHandler;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
 
public class ClientProxy extends ServerProxy {
 
    @Override
    public void registerClientStuff() {
    	
 	/** Items **/
    	
    	ModelHandler.registerModel(ModItems.upgradeAtiquity);
    	ModelHandler.registerModel(ModItems.upgradeBBY);
    	ModelHandler.registerModel(ModItems.upgradeCreative);
    	ModelHandler.registerModel(ModItems.upgradeEarlyModernAge);
    	ModelHandler.registerModel(ModItems.upgradeEdoPeriod);
    	ModelHandler.registerModel(ModItems.upgradeEpic);
    	ModelHandler.registerModel(ModItems.upgradeFantasy);
    	ModelHandler.registerModel(ModItems.upgradeFuture);
    	ModelHandler.registerModel(ModItems.upgradeMiddleAges);
    	ModelHandler.registerModel(ModItems.upgradeModernAge);
    	ModelHandler.registerModel(ModItems.upgradeMystic);
    	ModelHandler.registerModel(ModItems.upgradePiracy);
    	ModelHandler.registerModel(ModItems.upgradeStoneAge);
    	
    	ModelHandler.registerModel(ModItems.axeBladeDiamond);
    	ModelHandler.registerModel(ModItems.axeBladeGold);
    	ModelHandler.registerModel(ModItems.axeBladeIron);
    	ModelHandler.registerModel(ModItems.axeBladeStone);
    	ModelHandler.registerModel(ModItems.axeBladeWood);
    	ModelHandler.registerModel(ModItems.swordBladeDiamond);
    	ModelHandler.registerModel(ModItems.swordBladeGold);
    	ModelHandler.registerModel(ModItems.swordBladeIron);
    	ModelHandler.registerModel(ModItems.swordBladeStone);
    	ModelHandler.registerModel(ModItems.swordBladeWood);
    	ModelHandler.registerModel(ModItems.broadBladeDiamond);
    	ModelHandler.registerModel(ModItems.broadBladeGold);
    	ModelHandler.registerModel(ModItems.broadBladeIron);
    	ModelHandler.registerModel(ModItems.broadBladeStone);
    	ModelHandler.registerModel(ModItems.broadBladeWood);
    	ModelHandler.registerModel(ModItems.ironStick);
    	ModelHandler.registerModel(ModItems.ironLongstick);
    	ModelHandler.registerModel(ModItems.woodLongstick);
    	ModelHandler.registerModel(ModItems.lumber);
    	ModelHandler.registerModel(ModItems.ruby);
    	ModelHandler.registerModel(ModItems.sapphire);
    	ModelHandler.registerModel(ModItems.swordHandle);
    	ModelHandler.registerModel(ModItems.toxin);
    	ModelHandler.registerModel(ModItems.radioactiveToxin);
    	ModelHandler.registerModel(ModItems.diamondShard);
    	ModelHandler.registerModel(ModItems.emeraldShard);
    	ModelHandler.registerModel(ModItems.goldShard);
    	ModelHandler.registerModel(ModItems.ironShard);
    	ModelHandler.registerModel(ModItems.rubyShard);
    	ModelHandler.registerModel(ModItems.sapphireShard);
    	ModelHandler.registerModel(ModItems.stoneShard);
    	ModelHandler.registerModel(ModItems.woodShard);
    	ModelHandler.registerModel(ModItems.barrel);
    	ModelHandler.registerModel(ModItems.blankGun);
    	ModelHandler.registerModel(ModItems.gunHandle);
    	ModelHandler.registerModel(ModItems.haftIron);
    	ModelHandler.registerModel(ModItems.haftWood);
    	ModelHandler.registerModel(ModItems.visor);
    	ModelHandler.registerModel(ModItems.amethyst);
    	ModelHandler.registerModel(ModItems.amethystShard);
    	ModelHandler.registerModel(ModItems.topazShard);
    	ModelHandler.registerModel(ModItems.topaz);
    	ModelHandler.registerModel(ModItems.amber);
    	ModelHandler.registerModel(ModItems.glassShard);
    	ModelHandler.registerModel(ModItems.hammer);
    	ModelHandler.registerModel(ModItems.cloth);
    	ModelHandler.registerModel(ModItems.witherDust);
    	ModelHandler.registerModel(ModItems.witheredIronIngot);
    	ModelHandler.registerModel(ModItems.witheredIronShard);
    	ModelHandler.registerModel(ModItems.broadBladeWithered);
    	ModelHandler.registerModel(ModItems.axeBladeWithered);
    	ModelHandler.registerModel(ModItems.swordBladeWithered);

		// StoneAge
    	ModelHandler.registerModel(ModItems.rock);
    	ModelHandler.registerModel(ModItems.handAxStone);
    	ModelHandler.registerModel(ModItems.cavemanKniveStone);
    	ModelHandler.registerModel(ModItems.cavemanKniveBone);
    	ModelHandler.registerModel(ModItems.woodCudgel);
    	ModelHandler.registerModel(ModItems.stoneCudgel);
    	ModelHandler.registerModel(ModItems.ax);
    	ModelHandler.registerModel(ModItems.throwWood);
    	ModelHandler.registerModel(ModItems.cavemanSpear);
    	ModelHandler.registerModel(ModItems.cavemanBoots);
    	ModelHandler.registerModel(ModItems.cavemanChestplate);
    	ModelHandler.registerModel(ModItems.cavemanHelmet);
    	ModelHandler.registerModel(ModItems.cavemanLeggings);

		// Antiquity
    	ModelHandler.registerModel(ModItems.kniveDiamond);
    	ModelHandler.registerModel(ModItems.kniveGold);
    	ModelHandler.registerModel(ModItems.kniveIron);
    	ModelHandler.registerModel(ModItems.kniveStone);
    	ModelHandler.registerModel(ModItems.kniveWood);
    	ModelHandler.registerModel(ModItems.daggerDiamond);
    	ModelHandler.registerModel(ModItems.daggerGold);
    	ModelHandler.registerModel(ModItems.daggerIron);
    	ModelHandler.registerModel(ModItems.daggerStone);
    	ModelHandler.registerModel(ModItems.daggerWood);
    	ModelHandler.registerModel(ModItems.skewerDiamond);
    	ModelHandler.registerModel(ModItems.skewerGold);
    	ModelHandler.registerModel(ModItems.skewerIron);
    	ModelHandler.registerModel(ModItems.skewerStone);
    	ModelHandler.registerModel(ModItems.skewerWood);
    	ModelHandler.registerModel(ModItems.recurveBow);

		// MiddleAges
    	ModelHandler.registerModel(ModItems.crossbow);
    	ModelHandler.registerModel(ModItems.longbow);
    	ModelHandler.registerModel(ModItems.battleAxeDiamond);
    	ModelHandler.registerModel(ModItems.battleAxeGold);
    	ModelHandler.registerModel(ModItems.battleAxeIron);
    	ModelHandler.registerModel(ModItems.battleAxeStone);
    	ModelHandler.registerModel(ModItems.battleAxeWood);
    	ModelHandler.registerModel(ModItems.flailStone);
    	ModelHandler.registerModel(ModItems.flailGold);
    	ModelHandler.registerModel(ModItems.flailDiamond);
    	ModelHandler.registerModel(ModItems.flailIron);
    	ModelHandler.registerModel(ModItems.halbertDiamond);
    	ModelHandler.registerModel(ModItems.halbertGold);
    	ModelHandler.registerModel(ModItems.halbertIron);
    	ModelHandler.registerModel(ModItems.halbertStone);
    	ModelHandler.registerModel(ModItems.halbertWood);
    	ModelHandler.registerModel(ModItems.longswordDiamond);
    	ModelHandler.registerModel(ModItems.longswordGold);
    	ModelHandler.registerModel(ModItems.longswordIron);
    	ModelHandler.registerModel(ModItems.longswordStone);
    	ModelHandler.registerModel(ModItems.longswordWood);
    	ModelHandler.registerModel(ModItems.spearDiamond);
    	ModelHandler.registerModel(ModItems.spearGold);
    	ModelHandler.registerModel(ModItems.spearIron);
    	ModelHandler.registerModel(ModItems.spearStone);
    	ModelHandler.registerModel(ModItems.spearWood);
    	ModelHandler.registerModel(ModItems.tridentDiamond);
    	ModelHandler.registerModel(ModItems.tridentGold);
    	ModelHandler.registerModel(ModItems.tridentGold);
    	ModelHandler.registerModel(ModItems.tridentIron);
    	ModelHandler.registerModel(ModItems.tridentStone);
    	ModelHandler.registerModel(ModItems.tridentWood);
    	ModelHandler.registerModel(ModItems.waraxeDiamond);
    	ModelHandler.registerModel(ModItems.waraxeGold);
    	ModelHandler.registerModel(ModItems.waraxeIron);
    	ModelHandler.registerModel(ModItems.waraxeStone);
    	ModelHandler.registerModel(ModItems.waraxeWood);
    	ModelHandler.registerModel(ModItems.warhammerDiamond);
    	ModelHandler.registerModel(ModItems.warhammerGold);
    	ModelHandler.registerModel(ModItems.warhammerIron);
    	ModelHandler.registerModel(ModItems.warhammerStone);
    	ModelHandler.registerModel(ModItems.warhammerWood);

		//Early Modern Age
    	ModelHandler.registerModel(ModItems.multiToolDiamond);
    	ModelHandler.registerModel(ModItems.multiToolGold);
    	ModelHandler.registerModel(ModItems.multiToolIron);
    	ModelHandler.registerModel(ModItems.multiToolStone);
    	ModelHandler.registerModel(ModItems.multiToolWood);
    	ModelHandler.registerModel(ModItems.compoundBow);
    	ModelHandler.registerModel(ModItems.dynamite);
    	ModelHandler.registerModel(ModItems.oldAmmo);
    	ModelHandler.registerModel(ModItems.oldShotgunAmmo);
    	ModelHandler.registerModel(ModItems.cannonball);
    	ModelHandler.registerModel(ModItems.pebble);
    	ModelHandler.registerModel(ModItems.nails);
    	ModelHandler.registerModel(ModItems.nailsToxic);
    	ModelHandler.registerModel(ModItems.blankRifle);
    	
		//Mystic
    	ModelHandler.registerModel(ModItems.mysticKnive);
    	ModelHandler.registerModel(ModItems.pufferfishStick);
    	ModelHandler.registerModel(ModItems.scepterUnholy);
    	ModelHandler.registerModel(ModItems.wandAether);
    	ModelHandler.registerModel(ModItems.wandBasic);
    	ModelHandler.registerModel(ModItems.wandCurse);
    	ModelHandler.registerModel(ModItems.wandHoly);
    	ModelHandler.registerModel(ModItems.wandMaelstrom);
    	ModelHandler.registerModel(ModItems.wandNether);
    	ModelHandler.registerModel(ModItems.warhornDefensive);
    	ModelHandler.registerModel(ModItems.warhornOffensive);

		//Fantasy
    	ModelHandler.registerModel(ModItems.clawDiamond);
    	ModelHandler.registerModel(ModItems.clawGold);
    	ModelHandler.registerModel(ModItems.clawIron);
    	ModelHandler.registerModel(ModItems.clawStone);
    	ModelHandler.registerModel(ModItems.clawWood);
    	ModelHandler.registerModel(ModItems.clawSwordDiamond);
    	ModelHandler.registerModel(ModItems.clawSwordGold);
    	ModelHandler.registerModel(ModItems.clawSwordIron);
    	ModelHandler.registerModel(ModItems.clawSwordStone);
    	ModelHandler.registerModel(ModItems.clawSwordWood);
    	ModelHandler.registerModel(ModItems.claymoreDiamond);
    	ModelHandler.registerModel(ModItems.claymoreGold);
    	ModelHandler.registerModel(ModItems.claymoreIron);
    	ModelHandler.registerModel(ModItems.claymoreStone);
    	ModelHandler.registerModel(ModItems.claymoreWood);
    	ModelHandler.registerModel(ModItems.fantasySwordDiamond);
    	ModelHandler.registerModel(ModItems.fantasySwordGold);
    	ModelHandler.registerModel(ModItems.fantasySwordIron);
    	ModelHandler.registerModel(ModItems.fantasySwordStone);
    	ModelHandler.registerModel(ModItems.fantasySwordWood);
    	ModelHandler.registerModel(ModItems.longClaymoreDiamond);
    	ModelHandler.registerModel(ModItems.longClaymoreGold);
    	ModelHandler.registerModel(ModItems.longClaymoreIron);
    	ModelHandler.registerModel(ModItems.longClaymoreStone);
    	ModelHandler.registerModel(ModItems.longClaymoreWood);
    	ModelHandler.registerModel(ModItems.lightBow);
    	ModelHandler.registerModel(ModItems.shadowBow);

		//Edo Period
    	ModelHandler.registerModel(ModItems.katanaDiamond);
    	ModelHandler.registerModel(ModItems.katanaGold);
    	ModelHandler.registerModel(ModItems.katanaIron);
    	ModelHandler.registerModel(ModItems.katanaStone);
    	ModelHandler.registerModel(ModItems.katanaWood);
    	ModelHandler.registerModel(ModItems.ninjatoDiamond);
    	ModelHandler.registerModel(ModItems.ninjatoGold);
    	ModelHandler.registerModel(ModItems.ninjatoIron);
    	ModelHandler.registerModel(ModItems.ninjatoStone);
    	ModelHandler.registerModel(ModItems.ninjatoWood);
    	ModelHandler.registerModel(ModItems.blowgun);
    	ModelHandler.registerModel(ModItems.batonIron);
    	ModelHandler.registerModel(ModItems.batonWood);
    	ModelHandler.registerModel(ModItems.nunchuckIron);
    	ModelHandler.registerModel(ModItems.nunchuckWood);
    	ModelHandler.registerModel(ModItems.lash);
    	ModelHandler.registerModel(ModItems.kunai);
    	ModelHandler.registerModel(ModItems.throwingKnifeDiamond);
    	ModelHandler.registerModel(ModItems.throwingKnifeGold);
    	ModelHandler.registerModel(ModItems.throwingKnifeIron);
    	ModelHandler.registerModel(ModItems.throwingStar);
    	ModelHandler.registerModel(ModItems.assassinBoots);
    	ModelHandler.registerModel(ModItems.assassinChestplate);
    	ModelHandler.registerModel(ModItems.assassinHelmet);
    	ModelHandler.registerModel(ModItems.assassinLeggings);
    	ModelHandler.registerModel(ModItems.ninjaBoots);
    	ModelHandler.registerModel(ModItems.ninjaChestplate);
    	ModelHandler.registerModel(ModItems.ninjaHelmet);
    	ModelHandler.registerModel(ModItems.ninjaLeggings);

    	//Modern Age
    	ModelHandler.registerModel(ModItems.fieldGlasses);
    	ModelHandler.registerModel(ModItems.nightVisionGoggles);
    	ModelHandler.registerModel(ModItems.taser);
    	ModelHandler.registerModel(ModItems.flameThrower);
    	ModelHandler.registerModel(ModItems.industrialExcavator);
    	ModelHandler.registerModel(ModItems.industrialMiner);
    	ModelHandler.registerModel(ModItems.tankFlame);
    	ModelHandler.registerModel(ModItems.machineCase);
    	ModelHandler.registerModel(ModItems.ammoBig);
    	ModelHandler.registerModel(ModItems.ammoSmall);
    	ModelHandler.registerModel(ModItems.ammoBundleBig);
    	ModelHandler.registerModel(ModItems.ammoBundleSmall);
    	ModelHandler.registerModel(ModItems.concentratedGunpowder);
    	ModelHandler.registerModel(ModItems.magazineSmall);
    	ModelHandler.registerModel(ModItems.magazineBig);
    	ModelHandler.registerModel(ModItems.magazineLong);
    	ModelHandler.registerModel(ModItems.magazineDrum);
    	ModelHandler.registerModel(ModItems.shotgunAmmo);
    	ModelHandler.registerModel(ModItems.shotgunAmmo2);

    	//Future
    	ModelHandler.registerModel(ModItems.tankPoison);
    	ModelHandler.registerModel(ModItems.poisonThrower);
    	ModelHandler.registerModel(ModItems.industrialMultiTool);
    	ModelHandler.registerModel(ModItems.waterThrower);
    	ModelHandler.registerModel(ModItems.tankWater);
    	
    	//Epic
    	ModelHandler.registerModel(ModItems.herobrineBow);
    	ModelHandler.registerModel(ModItems.herobrineSword);
    	ModelHandler.registerModel(ModItems.masterAxe);
    	ModelHandler.registerModel(ModItems.masterBoots);
    	ModelHandler.registerModel(ModItems.masterChestplate);
    	ModelHandler.registerModel(ModItems.masterHelmet);
    	ModelHandler.registerModel(ModItems.masterLeggings);
    	ModelHandler.registerModel(ModItems.masterPickaxe);
    	ModelHandler.registerModel(ModItems.masterShovel);
    	ModelHandler.registerModel(ModItems.masterSword);
    	ModelHandler.registerModel(ModItems.epicBattleAxe);
    	ModelHandler.registerModel(ModItems.epicKatana);
    	ModelHandler.registerModel(ModItems.epicWaraxe);
    	ModelHandler.registerModel(ModItems.legendarySword);



		
		
    	
    	/** Blocks **/
    	
    	ModelHandler.registerModel(ModBlocks.tableOfAges);
    	ModelHandler.registerModel(ModBlocks.crusher);
      //ModelHandler.registerModel(ModBlocks.crusherOn);
    	ModelHandler.registerModel(ModBlocks.nexus);
    	ModelHandler.registerModel(ModBlocks.nexus2);
    	ModelHandler.registerModel(ModBlocks.nexus3);
    	ModelHandler.registerModel(ModBlocks.nexus4);
    	ModelHandler.registerModel(ModBlocks.weaponBox);
    	ModelHandler.registerModel(ModBlocks.rubyBlock);
    	ModelHandler.registerModel(ModBlocks.sapphireBlock);
    	ModelHandler.registerModel(ModBlocks.amethystBlock);
    	ModelHandler.registerModel(ModBlocks.amberBlock);
    	ModelHandler.registerModel(ModBlocks.topazBlock);
    	ModelHandler.registerModel(ModBlocks.witheredIronBlock);
    	
    	ModelHandler.registerModel(ModBlocks.barbedWire);
    	ModelHandler.registerModel(ModBlocks.nailTrap);
    	ModelHandler.registerModel(ModBlocks.toxicNailTrap);
    	ModelHandler.registerModel(ModBlocks.explosiveMine);
    	ModelHandler.registerModel(ModBlocks.toxicMine);
    	ModelHandler.registerModel(ModBlocks.razorWire);
    	ModelHandler.registerModel(ModBlocks.bearTrap);
    	ModelHandler.registerModel(ModBlocks.fallTrapDirt);
    	ModelHandler.registerModel(ModBlocks.fallTrapPlanks);
    	ModelHandler.registerModel(ModBlocks.fallTrapStone);
    	ModelHandler.registerModel(ModBlocks.barbedWireFence);
    	
    	ModelHandler.registerModel(ModBlocks.neutronBomb);
    	ModelHandler.registerModel(ModBlocks.nuclearBomb);
    	ModelHandler.registerModel(ModBlocks.spikes);
        //ModelHandler.registerModel(ModBlocks.spikesOn);
  
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

}
   

  