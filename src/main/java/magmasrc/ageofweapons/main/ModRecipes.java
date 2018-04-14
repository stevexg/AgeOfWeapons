package magmasrc.ageofweapons.main;

import java.util.Iterator;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.registries.IForgeRegistryModifiable;

@EventBusSubscriber
public class ModRecipes {

		public void register() {
			
			GameRegistry.addSmelting(ModItems.daggerGold, new ItemStack(Items.GOLD_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.kniveGold, new ItemStack(Items.GOLD_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.skewerGold, new ItemStack(Items.GOLD_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.katanaGold, new ItemStack(Items.GOLD_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.ninjatoGold, new ItemStack(Items.GOLD_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.clawGold, new ItemStack(Items.GOLD_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.clawSwordGold, new ItemStack(Items.GOLD_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.claymoreGold, new ItemStack(Items.GOLD_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.fantasySwordGold, new ItemStack(Items.GOLD_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.longClaymoreGold, new ItemStack(Items.GOLD_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.battleAxeGold, new ItemStack(Items.GOLD_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.flailGold, new ItemStack(Items.GOLD_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.halbertGold, new ItemStack(Items.GOLD_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.longswordGold, new ItemStack(Items.GOLD_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.spearGold, new ItemStack(Items.GOLD_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.tridentGold, new ItemStack(Items.GOLD_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.waraxeGold, new ItemStack(Items.GOLD_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.warhammerGold, new ItemStack(Items.GOLD_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.scytheGold, new ItemStack(Items.GOLD_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.multiToolGold, new ItemStack(Items.GOLD_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.macheteGold, new ItemStack(Items.GOLD_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.saberGold, new ItemStack(Items.GOLD_NUGGET), 0);
			
			GameRegistry.addSmelting(ModItems.daggerIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.kniveIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.skewerIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.batonIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.katanaIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.ninjatoIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.nunchuckIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.clawIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.clawSwordIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.claymoreIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.fantasySwordIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.longClaymoreIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.battleAxeIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.flailIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.halbertIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.longswordIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.spearIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.tridentIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.waraxeIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.scytheIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.warhammerIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.multiToolIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.macheteIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.saberIron, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.grapplingHook, new ItemStack(Items.IRON_NUGGET), 0);
			GameRegistry.addSmelting(ModItems.grapplingIron, new ItemStack(Items.IRON_NUGGET), 0);
}	
	 
		
		
		// Recipe modes
		
		 @SubscribeEvent
		    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
		        IForgeRegistryModifiable modRegistry = (IForgeRegistryModifiable) event.getRegistry();

		     if(!AgeOfWeapons.activateWeaponBoxRecipe) {
		    	ResourceLocation weaponbox = new ResourceLocation("ageofweapons:weapon_box");
		        modRegistry.remove(weaponbox);
		     }
		     
		     if(!AgeOfWeapons.activateNexusRecipe) {
		    	ResourceLocation nexus1 = new ResourceLocation("ageofweapons:nexus1");
		    	ResourceLocation nexus2 = new ResourceLocation("ageofweapons:nexus2");
		    	ResourceLocation nexus3 = new ResourceLocation("ageofweapons:nexus3");
		    	ResourceLocation nexus4 = new ResourceLocation("ageofweapons:nexus4");
		        modRegistry.remove(nexus1);
		        modRegistry.remove(nexus2);
		        modRegistry.remove(nexus3);
		        modRegistry.remove(nexus4);
		     }
		     
		     if(!AgeOfWeapons.activateBasicRecipesOnWorkbench) {
			/** ResourceLocation basic0 = new ResourceLocation("ageofweapons:ruby");
			   	ResourceLocation basic1 = new ResourceLocation("ageofweapons:ruby_block");
			   	ResourceLocation basic2 = new ResourceLocation("ageofweapons:sapphire");
			   	ResourceLocation basic3 = new ResourceLocation("ageofweapons:sapphire_block");
			   	ResourceLocation basic4 = new ResourceLocation("ageofweapons:topaz");
		    	ResourceLocation basic5 = new ResourceLocation("ageofweapons:topaz_block");
		    	ResourceLocation basic6 = new ResourceLocation("ageofweapons:amber");
		    	ResourceLocation basic7 = new ResourceLocation("ageofweapons:amber_block");
			    ResourceLocation basic8 = new ResourceLocation("ageofweapons:withered_iron_block");
			   	ResourceLocation basic9 = new ResourceLocation("ageofweapons:withered_iron_ingot"); **/
			   	ResourceLocation basic10 = new ResourceLocation("ageofweapons:axe_blade_diamond");
			   	ResourceLocation basic11 = new ResourceLocation("ageofweapons:axe_blade_gold");
			   	ResourceLocation basic12 = new ResourceLocation("ageofweapons:axe_blade_iron");
			   	ResourceLocation basic13 = new ResourceLocation("ageofweapons:axe_blade_wood");
			   	ResourceLocation basic14 = new ResourceLocation("ageofweapons:axe_blade_stone");
			   	ResourceLocation basic15 = new ResourceLocation("ageofweapons:axe_blade_withered_iron");
			   	ResourceLocation basic16 = new ResourceLocation("ageofweapons:broad_blade_diamond");
			   	ResourceLocation basic17 = new ResourceLocation("ageofweapons:broad_blade_gold");
			   	ResourceLocation basic18 = new ResourceLocation("ageofweapons:broad_blade_iron");
			   	ResourceLocation basic19 = new ResourceLocation("ageofweapons:broad_blade_stone");
			   	ResourceLocation basic20 = new ResourceLocation("ageofweapons:broad_blade_wood");
			   	ResourceLocation basic21 = new ResourceLocation("ageofweapons:broad_blade_withered_iron");
			   	ResourceLocation basic22 = new ResourceLocation("ageofweapons:sword_blade_diamond");
			   	ResourceLocation basic23 = new ResourceLocation("ageofweapons:sword_blade_gold");
			   	ResourceLocation basic24 = new ResourceLocation("ageofweapons:sword_blade_iron");
			   	ResourceLocation basic25 = new ResourceLocation("ageofweapons:sword_blade_stone");
			   	ResourceLocation basic26 = new ResourceLocation("ageofweapons:sword_blade_wood");
			   	ResourceLocation basic27 = new ResourceLocation("ageofweapons:sword_blade_withered_iron");
			   	ResourceLocation basic28 = new ResourceLocation("ageofweapons:nexus1");
			   	ResourceLocation basic29 = new ResourceLocation("ageofweapons:nexus2");
			   	ResourceLocation basic30 = new ResourceLocation("ageofweapons:nexus3");
			   	ResourceLocation basic31 = new ResourceLocation("ageofweapons:nexus4");
			   	modRegistry.remove(basic10);
			    modRegistry.remove(basic11);
			    modRegistry.remove(basic12);
			    modRegistry.remove(basic13);
			    modRegistry.remove(basic14);
			    modRegistry.remove(basic15);
			    modRegistry.remove(basic16);
		        modRegistry.remove(basic17);
		        modRegistry.remove(basic18);
		        modRegistry.remove(basic19);
			    modRegistry.remove(basic30);
			   	modRegistry.remove(basic20);
			    modRegistry.remove(basic21);
			    modRegistry.remove(basic22);
			    modRegistry.remove(basic23);
			    modRegistry.remove(basic24);
			    modRegistry.remove(basic25);
			    modRegistry.remove(basic26);
		        modRegistry.remove(basic27);
		        modRegistry.remove(basic28);
		        modRegistry.remove(basic29);
			    modRegistry.remove(basic30);
			    modRegistry.remove(basic31);
		     }
		     
		    if(AgeOfWeapons.activateHardcoreMode) {
			    ResourceLocation default0 = new ResourceLocation("minecraft:wooden_axe");
			    ResourceLocation default1 = new ResourceLocation("minecraft:wooden_pickaxe");
			    ResourceLocation default2 = new ResourceLocation("minecraft:wooden_sword");
			    ResourceLocation default3 = new ResourceLocation("minecraft:wooden_shovel");
			    ResourceLocation default4 = new ResourceLocation("minecraft:wooden_hoe");
			    ResourceLocation default5 = new ResourceLocation("minecraft:stone_sword");
			    ResourceLocation default6 = new ResourceLocation("minecraft:stone_pickaxe");
			    ResourceLocation default7 = new ResourceLocation("minecraft:stone_axe");
			    ResourceLocation default8 = new ResourceLocation("minecraft:stone_shovel");
			    ResourceLocation default9 = new ResourceLocation("minecraft:stone_hoe");
			    ResourceLocation default10 = new ResourceLocation("minecraft:iron_sword");
			    ResourceLocation default11 = new ResourceLocation("minecraft:iron_axe");
			    ResourceLocation default12 = new ResourceLocation("minecraft:iron_pickaxe");
			    ResourceLocation default13 = new ResourceLocation("minecraft:iron_hoe");
			    ResourceLocation default14 = new ResourceLocation("minecraft:iron_shovel");
			    ResourceLocation default15 = new ResourceLocation("minecraft:golden_sword");
			    ResourceLocation default16 = new ResourceLocation("minecraft:golden_axe");
			    ResourceLocation default17 = new ResourceLocation("minecraft:golden_pickaxe");
			    ResourceLocation default18 = new ResourceLocation("minecraft:golden_hoe");
			    ResourceLocation default19 = new ResourceLocation("minecraft:golden_shovel");
			    ResourceLocation default20 = new ResourceLocation("minecraft:diamond_sword");
			    ResourceLocation default21 = new ResourceLocation("minecraft:diamond_axe");
			    ResourceLocation default22 = new ResourceLocation("minecraft:diamond_pickaxe");
			    ResourceLocation default23 = new ResourceLocation("minecraft:diamond_hoe");
			    ResourceLocation default24 = new ResourceLocation("minecraft:diamond_shovel");
			    ResourceLocation default25 = new ResourceLocation("minecraft:shield");
			    ResourceLocation default26 = new ResourceLocation("minecraft:bow");
			    ResourceLocation default27 = new ResourceLocation("minecraft:flint_and_steel");
			    ResourceLocation default28 = new ResourceLocation("minecraft:shears");
			    ResourceLocation default29 = new ResourceLocation("minecraft:fishing_rod");
			    ResourceLocation default30 = new ResourceLocation("minecraft:diamond_boots");
			    ResourceLocation default31 = new ResourceLocation("minecraft:diamond_helmet");
			    ResourceLocation default32 = new ResourceLocation("minecraft:diamond_leggings");
			    ResourceLocation default33 = new ResourceLocation("minecraft:diamond_chestplate");
			    ResourceLocation default34 = new ResourceLocation("minecraft:iron_boots");
			    ResourceLocation default35 = new ResourceLocation("minecraft:iron_helmet");
			    ResourceLocation default36 = new ResourceLocation("minecraft:iron_leggings");
			    ResourceLocation default37 = new ResourceLocation("minecraft:iron_chestplate");
			    ResourceLocation default38 = new ResourceLocation("minecraft:golden_helmet");
			    ResourceLocation default39 = new ResourceLocation("minecraft:golden_leggings");
			    ResourceLocation default40 = new ResourceLocation("minecraft:golden_chestplate");
			    ResourceLocation default41 = new ResourceLocation("minecraft:golden_boots");
			    ResourceLocation default42 = new ResourceLocation("minecraft:leather_helmet");
			    ResourceLocation default43 = new ResourceLocation("minecraft:leather_leggings");
			    ResourceLocation default44 = new ResourceLocation("minecraft:leather_boots");
			    ResourceLocation default45 = new ResourceLocation("minecraft:leather_chestplate");
			    ResourceLocation default46 = new ResourceLocation("minecraft:chainmail_helmet");
			    ResourceLocation default47 = new ResourceLocation("minecraft:chainmail_boots");
			    ResourceLocation default48 = new ResourceLocation("minecraft:chainmail_leggings");
			    ResourceLocation default49 = new ResourceLocation("minecraft:chainmail_chestplate");
			    
			    //modRegistry.remove(default0);
			    //modRegistry.remove(default1);
			    //modRegistry.remove(default2);
			    //modRegistry.remove(default3);
			    //modRegistry.remove(default4);
			    modRegistry.remove(default5);
			    modRegistry.remove(default6);
			    modRegistry.remove(default7);
			    modRegistry.remove(default8);
			    modRegistry.remove(default9);
			    modRegistry.remove(default10);
			    modRegistry.remove(default11);
			    modRegistry.remove(default12);
			    modRegistry.remove(default13);
			    modRegistry.remove(default14);
			    modRegistry.remove(default15);
			    modRegistry.remove(default16);
			    modRegistry.remove(default17);
			    modRegistry.remove(default18);
			    modRegistry.remove(default19);
			    modRegistry.remove(default20);
			    modRegistry.remove(default21);
			    modRegistry.remove(default22);
			    modRegistry.remove(default23);
			    modRegistry.remove(default24);
			    modRegistry.remove(default25);
			    modRegistry.remove(default26);
			    modRegistry.remove(default27);
			    modRegistry.remove(default28);
			    modRegistry.remove(default29);
			    modRegistry.remove(default30);
			    modRegistry.remove(default31);
			    modRegistry.remove(default32);
			    modRegistry.remove(default33);
			    modRegistry.remove(default34);
			    modRegistry.remove(default35);
			    modRegistry.remove(default36);
			    modRegistry.remove(default37);
			    modRegistry.remove(default38);
			    modRegistry.remove(default39);
			    modRegistry.remove(default40);
			    modRegistry.remove(default41);
			    modRegistry.remove(default42);
			    modRegistry.remove(default43);
			    modRegistry.remove(default44);
			    modRegistry.remove(default45);
			    modRegistry.remove(default46);
			    modRegistry.remove(default47);
			    modRegistry.remove(default48);
			    modRegistry.remove(default49);
		    }
		 }
}