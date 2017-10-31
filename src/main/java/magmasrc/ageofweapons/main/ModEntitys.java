package magmasrc.ageofweapons.main;

import magmasrc.ageofweapons.entity.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntitys {
	
	public static void registerEntities(){
		EntityRegistry.registerModEntity(new ModelResourceLocation(AgeOfWeapons.MODID + ":dynamite"), EntityDynamite.class, "Dynamite", 0, AgeOfWeapons.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ModelResourceLocation(AgeOfWeapons.MODID + ":throwing_star"), EntityThrowingStar.class, "ThrowingStar", 1, AgeOfWeapons.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ModelResourceLocation(AgeOfWeapons.MODID + ":kunai"), EntityKunai.class, "Kunai", 2, AgeOfWeapons.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ModelResourceLocation(AgeOfWeapons.MODID + ":cast_net"), EntityCastNet.class, "CastNet", 3, AgeOfWeapons.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ModelResourceLocation(AgeOfWeapons.MODID + ":throwing_iron_knive"), EntityThrowingIronKnive.class, "ThrowingIronKnive", 4, AgeOfWeapons.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ModelResourceLocation(AgeOfWeapons.MODID + ":throwing_gold_knive"), EntityThrowingGoldKnive.class, "ThrowingGoldKnive", 5, AgeOfWeapons.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ModelResourceLocation(AgeOfWeapons.MODID + ":throwing_diamond_knive"), EntityThrowingDiamondKnive.class, "ThrowingDimaondKnive", 6, AgeOfWeapons.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ModelResourceLocation(AgeOfWeapons.MODID + ":caveman_spear"), EntityCavemanSpear.class, "CavemanSpear", 7, AgeOfWeapons.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ModelResourceLocation(AgeOfWeapons.MODID + ":throw_wood"), EntityThrowWood.class, "ThrowWood", 8, AgeOfWeapons.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ModelResourceLocation(AgeOfWeapons.MODID + ":spear_wood"), EntitySpearWood.class, "SpearWood", 9, AgeOfWeapons.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ModelResourceLocation(AgeOfWeapons.MODID + ":spear_stone"), EntitySpearStone.class, "SpearStone", 10, AgeOfWeapons.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ModelResourceLocation(AgeOfWeapons.MODID + ":spear_iron"), EntitySpearIron.class, "SpearIron", 11, AgeOfWeapons.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ModelResourceLocation(AgeOfWeapons.MODID + ":spear_gold"), EntitySpearGold.class, "SpearGold", 12, AgeOfWeapons.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ModelResourceLocation(AgeOfWeapons.MODID + ":spear_diamond"), EntitySpearDiamond.class, "SpearDiamond", 13, AgeOfWeapons.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ModelResourceLocation(AgeOfWeapons.MODID + ":harpoon"), EntityHarpoon.class, "SpearHarpoon", 14, AgeOfWeapons.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ModelResourceLocation(AgeOfWeapons.MODID + ":grenade"), EntityGrenade.class, "Grenade", 15, AgeOfWeapons.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ModelResourceLocation(AgeOfWeapons.MODID + ":grenade_frag"), EntityGrenadeFrag.class, "GrenadeFrag", 16, AgeOfWeapons.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ModelResourceLocation(AgeOfWeapons.MODID + ":grenade_smoke"), EntityGrenadeSmoke.class, "GrenadeSmoke", 17, AgeOfWeapons.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ModelResourceLocation(AgeOfWeapons.MODID + ":grenade_poison"), EntityGrenadePoison.class, "GrenadePoison", 18, AgeOfWeapons.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ModelResourceLocation(AgeOfWeapons.MODID + ":imploder"), EntityImploder.class, "Imploder", 19, AgeOfWeapons.instance, 64, 1, true);
		EntityRegistry.registerModEntity(new ModelResourceLocation(AgeOfWeapons.MODID + ":molotov_cocktail"), EntityMolotovCocktail.class, "MolotovCocktail", 20, AgeOfWeapons.instance, 64, 1, true);

	}
	

}
