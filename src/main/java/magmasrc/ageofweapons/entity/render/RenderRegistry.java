package magmasrc.ageofweapons.entity.render;

import magmasrc.ageofweapons.entity.*;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderRegistry {

	public static void registerEntityRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(EntityDynamite.class, new IRenderFactory<EntityDynamite>() {

			@Override
			public Render<? super EntityDynamite> createRenderFor(RenderManager manager) {
				return new RenderDynamite(manager);
			}
		});
	
	
		RenderingRegistry.registerEntityRenderingHandler(EntityThrowingStar.class, new IRenderFactory<EntityThrowingStar>() {

			public Render<? super EntityThrowingStar> createRenderFor(RenderManager manager) {
				return new RenderThrowingStar(manager);
			}
		});
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityKunai.class, new IRenderFactory<EntityKunai>() {

			public Render<? super EntityKunai> createRenderFor(RenderManager manager) {
				return new RenderKunai(manager);
			}
		});
		
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityCastNet.class, new IRenderFactory<EntityCastNet>() {

			public Render<? super EntityCastNet> createRenderFor(RenderManager manager) {
				return new RenderCastNet(manager);
			}
		});
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityThrowingIronKnive.class, new IRenderFactory<EntityThrowingIronKnive>() {

			public Render<? super EntityThrowingIronKnive> createRenderFor(RenderManager manager) {
				return new RenderThrowingIronKnive(manager);
			}
		});
		
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityThrowingGoldKnive.class, new IRenderFactory<EntityThrowingGoldKnive>() {

			public Render<? super EntityThrowingGoldKnive> createRenderFor(RenderManager manager) {
				return new RenderThrowingGoldKnive(manager);
			}
		});
		
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityThrowingDiamondKnive.class, new IRenderFactory<EntityThrowingDiamondKnive>() {

			public Render<? super EntityThrowingDiamondKnive> createRenderFor(RenderManager manager) {
				return new RenderThrowingDiamondKnive(manager);
			}
		});

		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityCavemanSpear.class, new IRenderFactory<EntityCavemanSpear>() {

			public Render<? super EntityCavemanSpear> createRenderFor(RenderManager manager) {
				return new RenderCavemanSpear(manager);
			}
		});
		
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityThrowWood.class, new IRenderFactory<EntityThrowWood>() {

			public Render<? super EntityThrowWood> createRenderFor(RenderManager manager) {
				return new RenderThrowWood(manager);
			}
		});
	
	
		
		RenderingRegistry.registerEntityRenderingHandler(EntitySpearWood.class, new IRenderFactory<EntitySpearWood>() {

			public Render<? super EntitySpearWood> createRenderFor(RenderManager manager) {
				return new RenderSpearWood(manager);
			}
		});
		
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntitySpearStone.class, new IRenderFactory<EntitySpearStone>() {

			public Render<? super EntitySpearStone> createRenderFor(RenderManager manager) {
				return new RenderSpearStone(manager);
			}
		});
		
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntitySpearIron.class, new IRenderFactory<EntitySpearIron>() {

			public Render<? super EntitySpearIron> createRenderFor(RenderManager manager) {
				return new RenderSpearIron(manager);
			}
		});
		
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntitySpearGold.class, new IRenderFactory<EntitySpearGold>() {

			public Render<? super EntitySpearGold> createRenderFor(RenderManager manager) {
				return new RenderSpearGold(manager);
			}
		});
		
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntitySpearDiamond.class, new IRenderFactory<EntitySpearDiamond>() {

			public Render<? super EntitySpearDiamond> createRenderFor(RenderManager manager) {
				return new RenderSpearDiamond(manager);
			}
		});
		
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityHarpoon.class, new IRenderFactory<EntityHarpoon>() {

			public Render<? super EntityHarpoon> createRenderFor(RenderManager manager) {
				return new RenderHarpoon(manager);
			}
		});
		
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new IRenderFactory<EntityGrenade>() {

			public Render<? super EntityGrenade> createRenderFor(RenderManager manager) {
				return new RenderGrenade(manager);
			}
		});
		
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenadeFrag.class, new IRenderFactory<EntityGrenadeFrag>() {

			public Render<? super EntityGrenadeFrag> createRenderFor(RenderManager manager) {
				return new RenderGrenadeFrag(manager);
			}
		});
		
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenadeSmoke.class, new IRenderFactory<EntityGrenadeSmoke>() {

			public Render<? super EntityGrenadeSmoke> createRenderFor(RenderManager manager) {
				return new RenderGrenadeSmoke(manager);
			}
		});
		
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenadePoison.class, new IRenderFactory<EntityGrenadePoison>() {

			public Render<? super EntityGrenadePoison> createRenderFor(RenderManager manager) {
				return new RenderGrenadePoison(manager);
			}
		});
		
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityImploder.class, new IRenderFactory<EntityImploder>() {

			public Render<? super EntityImploder> createRenderFor(RenderManager manager) {
				return new RenderImploder(manager);
			}
		});
		
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMolotovCocktail.class, new IRenderFactory<EntityMolotovCocktail>() {

			public Render<? super EntityMolotovCocktail> createRenderFor(RenderManager manager) {
				return new RenderMolotovCocktail(manager);
			}
		});
	}
}
