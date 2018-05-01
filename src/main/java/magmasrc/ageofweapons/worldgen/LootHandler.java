package magmasrc.ageofweapons.worldgen;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModBlocks;
import magmasrc.ageofweapons.main.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LootHandler 
	{
	    private void addLoot(LootPool pool, Item plakat, int weight)
	    {
	        pool.addEntry(new LootEntryItem(plakat, weight, 0, new LootFunction[0], new LootCondition[0], plakat.getRegistryName().toString()));
	    }

	    @SubscribeEvent
	    public void onLootLoad(LootTableLoadEvent event)
	    {
	    	
	    	// Tier1
	        if(event.getName().equals(LootTableList.CHESTS_SIMPLE_DUNGEON))
	        {
	            LootPool pool = event.getTable().getPool("main");
	            addLoot(pool, ModItems.amethyst, 3);
	            addLoot(pool, ModItems.ruby, 3);
	            addLoot(pool, ModItems.sapphire, 3);
	            addLoot(pool, ModItems.amber, 3);
	            
			     if(AgeOfWeapons.activateDungeonLoot) {	
			            addLoot(pool, ModItems.handAxStone, 3);
			            addLoot(pool, ModItems.daggerIron, 3);
			            addLoot(pool, ModItems.daggerStone, 3);
			            addLoot(pool, ModItems.kniveWood, 3);
			            addLoot(pool, ModItems.kniveGold, 3);
			            addLoot(pool, ModItems.recurveBow, 3);
			            addLoot(pool, ModItems.skewerDiamond, 3);
			            addLoot(pool, ModItems.skewerIron, 3);
			            addLoot(pool, ModItems.battleAxeGold, 3);
			            addLoot(pool, ModItems.crossbow, 2);
			            addLoot(pool, ModItems.flailStone, 3);
			            addLoot(pool, ModItems.halbertGold, 3);
			            addLoot(pool, ModItems.hammer, 3);
			            addLoot(pool, ModItems.longswordWood, 3);
			            addLoot(pool, ModItems.longswordIron, 3);
			            addLoot(pool, ModItems.spearWood, 3);
			            addLoot(pool, ModItems.spearIron, 3);
			            addLoot(pool, ModItems.spearDiamond, 3);
			            addLoot(pool, ModItems.tridentWood, 3);
			            addLoot(pool, ModItems.waraxeIron, 3);
			            addLoot(pool, ModItems.warhammerStone, 3);
			            addLoot(pool, ModItems.multiToolStone, 2);
			            addLoot(pool, ModItems.multiToolGold, 2);
			            addLoot(pool, ModItems.compoundBow, 1);
				     }
	        }
	        
	        
	        if(event.getName().equals(LootTableList.CHESTS_ABANDONED_MINESHAFT))
	        {
	            LootPool pool = event.getTable().getPool("main");
	            addLoot(pool, ModItems.amethyst, 3);
	            addLoot(pool, ModItems.ruby, 3);
	            addLoot(pool, ModItems.sapphire, 3);
	            addLoot(pool, ModItems.amber, 3);
	            
			     if(AgeOfWeapons.activateDungeonLoot) {	
			            addLoot(pool, ModItems.handAxStone, 3);
			            addLoot(pool, ModItems.daggerIron, 3);
			            addLoot(pool, ModItems.daggerStone, 3);
			            addLoot(pool, ModItems.kniveWood, 3);
			            addLoot(pool, ModItems.kniveGold, 3);
			            addLoot(pool, ModItems.recurveBow, 3);
			            addLoot(pool, ModItems.skewerDiamond, 3);
			            addLoot(pool, ModItems.skewerIron, 3);
			            addLoot(pool, ModItems.battleAxeGold, 3);
			            addLoot(pool, ModItems.crossbow, 2);
			            addLoot(pool, ModItems.flailStone, 3);
			            addLoot(pool, ModItems.halbertGold, 3);
			            addLoot(pool, ModItems.hammer, 3);
			            addLoot(pool, ModItems.longswordWood, 3);
			            addLoot(pool, ModItems.longswordIron, 3);
			            addLoot(pool, ModItems.spearWood, 3);
			            addLoot(pool, ModItems.spearIron, 3);
			            addLoot(pool, ModItems.spearDiamond, 3);
			            addLoot(pool, ModItems.tridentWood, 3);
			            addLoot(pool, ModItems.waraxeIron, 3);
			            addLoot(pool, ModItems.warhammerStone, 3);
			            addLoot(pool, ModItems.multiToolStone, 2);
			            addLoot(pool, ModItems.multiToolGold, 2);
			            addLoot(pool, ModItems.compoundBow, 1);
				     }
	        }
	        
	        
	        if(event.getName().equals(LootTableList.CHESTS_DESERT_PYRAMID))
	        {
	            LootPool pool = event.getTable().getPool("main");
	            addLoot(pool, ModItems.amethyst, 3);
	            addLoot(pool, ModItems.ruby, 3);
	            addLoot(pool, ModItems.sapphire, 3);
	            addLoot(pool, ModItems.amber, 3);
	            
			     if(AgeOfWeapons.activateDungeonLoot) {	
			            addLoot(pool, ModItems.handAxStone, 3);
			            addLoot(pool, ModItems.daggerIron, 3);
			            addLoot(pool, ModItems.daggerStone, 3);
			            addLoot(pool, ModItems.kniveWood, 3);
			            addLoot(pool, ModItems.kniveGold, 3);
			            addLoot(pool, ModItems.recurveBow, 3);
			            addLoot(pool, ModItems.skewerDiamond, 3);
			            addLoot(pool, ModItems.skewerIron, 3);
			            addLoot(pool, ModItems.battleAxeGold, 3);
			            addLoot(pool, ModItems.crossbow, 2);
			            addLoot(pool, ModItems.flailStone, 3);
			            addLoot(pool, ModItems.halbertGold, 3);
			            addLoot(pool, ModItems.hammer, 3);
			            addLoot(pool, ModItems.longswordWood, 3);
			            addLoot(pool, ModItems.longswordIron, 3);
			            addLoot(pool, ModItems.spearWood, 3);
			            addLoot(pool, ModItems.spearIron, 3);
			            addLoot(pool, ModItems.spearDiamond, 3);
			            addLoot(pool, ModItems.tridentWood, 3);
			            addLoot(pool, ModItems.waraxeIron, 3);
			            addLoot(pool, ModItems.warhammerStone, 3);
			            addLoot(pool, ModItems.multiToolStone, 2);
			            addLoot(pool, ModItems.multiToolGold, 2);
			            addLoot(pool, ModItems.compoundBow, 1);
				     }
	        }
	        
	        
	        
	        
	        if(event.getName().equals(LootTableList.CHESTS_VILLAGE_BLACKSMITH))
	        {
	         if(AgeOfWeapons.activateDungeonLoot) {	
	            LootPool pool = event.getTable().getPool("main");
	            addLoot(pool, ModItems.swordHandle, 5);
	            addLoot(pool, ModItems.swordBladeGold, 5);
	            addLoot(pool, ModItems.swordBladeIron, 5);
	            addLoot(pool, ModItems.axeBladeIron, 5);
	            addLoot(pool, ModItems.ironStick, 5);
	            
	            addLoot(pool, ModItems.handAxStone, 3);
	            addLoot(pool, ModItems.daggerIron, 3);
	            addLoot(pool, ModItems.daggerStone, 3);
	            addLoot(pool, ModItems.kniveWood, 3);
	            addLoot(pool, ModItems.kniveGold, 3);
	            addLoot(pool, ModItems.recurveBow, 3);
	            addLoot(pool, ModItems.skewerDiamond, 3);
	            addLoot(pool, ModItems.skewerIron, 3);
	            addLoot(pool, ModItems.battleAxeGold, 3);
	            addLoot(pool, ModItems.crossbow, 2);
	            addLoot(pool, ModItems.flailStone, 3);
	            addLoot(pool, ModItems.halbertGold, 3);
	            addLoot(pool, ModItems.hammer, 3);
	            addLoot(pool, ModItems.longswordWood, 3);
	            addLoot(pool, ModItems.longswordIron, 3);
	            addLoot(pool, ModItems.spearWood, 3);
	            addLoot(pool, ModItems.spearIron, 3);
	            addLoot(pool, ModItems.spearDiamond, 3);
	            addLoot(pool, ModItems.tridentWood, 3);
	            addLoot(pool, ModItems.waraxeIron, 3);
	            addLoot(pool, ModItems.warhammerStone, 3);
	            addLoot(pool, ModItems.multiToolStone, 2);
	            addLoot(pool, ModItems.multiToolGold, 2);
	            addLoot(pool, ModItems.compoundBow, 1);
	          }  
	        }
	        
	        
	        
	        
	        
	        
	        
	        
	        //Tier2
	        if(event.getName().equals(LootTableList.CHESTS_NETHER_BRIDGE))
	        {
	            LootPool pool = event.getTable().getPool("main");
	            addLoot(pool, ModItems.amethyst, 10);
	            addLoot(pool, ModItems.ruby, 10);
	            addLoot(pool, ModItems.sapphire, 10);
	            addLoot(pool, ModItems.amber, 10);
	            addLoot(pool, ModItems.upgradeEpic, 1);
	            addLoot(pool, ModItems.topaz, 1);
	            addLoot(pool, ModItems.witherDust, 5);
	            
		     if(AgeOfWeapons.activateDungeonLoot) {	
	            addLoot(pool, ModItems.handAxStone, 3);
	            addLoot(pool, ModItems.daggerIron, 3);
	            addLoot(pool, ModItems.daggerStone, 3);
	            addLoot(pool, ModItems.kniveWood, 3);
	            addLoot(pool, ModItems.kniveGold, 3);
	            addLoot(pool, ModItems.recurveBow, 3);
	            addLoot(pool, ModItems.skewerDiamond, 3);
	            addLoot(pool, ModItems.skewerIron, 3);
	            addLoot(pool, ModItems.battleAxeGold, 3);
	            addLoot(pool, ModItems.crossbow, 2);
	            addLoot(pool, ModItems.flailStone, 3);
	            addLoot(pool, ModItems.halbertGold, 3);
	            addLoot(pool, ModItems.hammer, 3);
	            addLoot(pool, ModItems.longswordWood, 3);
	            addLoot(pool, ModItems.longswordIron, 3);
	            addLoot(pool, ModItems.spearWood, 3);
	            addLoot(pool, ModItems.spearIron, 3);
	            addLoot(pool, ModItems.spearDiamond, 3);
	            addLoot(pool, ModItems.tridentWood, 3);
	            addLoot(pool, ModItems.waraxeIron, 3);
	            addLoot(pool, ModItems.warhammerStone, 3);
	            addLoot(pool, ModItems.multiToolStone, 2);
	            addLoot(pool, ModItems.multiToolGold, 2);
	            addLoot(pool, ModItems.compoundBow, 1);
		     }
	        }
	        
	        
	        if(event.getName().equals(LootTableList.CHESTS_WOODLAND_MANSION))
	        {
	            LootPool pool = event.getTable().getPool("main");
	            addLoot(pool, ModItems.amethyst, 10);
	            addLoot(pool, ModItems.ruby, 10);
	            addLoot(pool, ModItems.sapphire, 10);
	            addLoot(pool, ModItems.amber, 10);
	            addLoot(pool, ModItems.upgradeEpic, 1);
	            addLoot(pool, ModItems.topaz, 1);
	            addLoot(pool, ModItems.witherDust, 1);

	            
			     if(AgeOfWeapons.activateDungeonLoot) {	
			            addLoot(pool, ModItems.handAxStone, 3);
			            addLoot(pool, ModItems.daggerIron, 3);
			            addLoot(pool, ModItems.daggerStone, 3);
			            addLoot(pool, ModItems.kniveWood, 3);
			            addLoot(pool, ModItems.kniveGold, 3);
			            addLoot(pool, ModItems.recurveBow, 3);
			            addLoot(pool, ModItems.skewerDiamond, 3);
			            addLoot(pool, ModItems.skewerIron, 3);
			            addLoot(pool, ModItems.battleAxeGold, 3);
			            addLoot(pool, ModItems.crossbow, 2);
			            addLoot(pool, ModItems.flailStone, 3);
			            addLoot(pool, ModItems.halbertGold, 3);
			            addLoot(pool, ModItems.hammer, 3);
			            addLoot(pool, ModItems.longswordWood, 3);
			            addLoot(pool, ModItems.longswordIron, 3);
			            addLoot(pool, ModItems.spearWood, 3);
			            addLoot(pool, ModItems.spearIron, 3);
			            addLoot(pool, ModItems.spearDiamond, 3);
			            addLoot(pool, ModItems.tridentWood, 3);
			            addLoot(pool, ModItems.waraxeIron, 3);
			            addLoot(pool, ModItems.warhammerStone, 3);
			            addLoot(pool, ModItems.multiToolStone, 2);
			            addLoot(pool, ModItems.multiToolGold, 2);
			            addLoot(pool, ModItems.compoundBow, 1);
				     }
	        }
	        
	        
	        if(event.getName().equals(LootTableList.CHESTS_STRONGHOLD_LIBRARY))
	        {
	            LootPool pool = event.getTable().getPool("main");
	            addLoot(pool, ModItems.amethyst, 10);
	            addLoot(pool, ModItems.ruby, 10);
	            addLoot(pool, ModItems.sapphire, 10);
	            addLoot(pool, ModItems.amber, 10);
	            addLoot(pool, ModItems.upgradeEpic, 1);
	            addLoot(pool, ModItems.topaz, 1);
	            addLoot(pool, ModItems.witherDust, 5);
	            addLoot(pool, ModItems.witheredIronIngot, 1);
	            
			     if(AgeOfWeapons.activateDungeonLoot) {	
			            addLoot(pool, ModItems.handAxStone, 3);
			            addLoot(pool, ModItems.daggerIron, 3);
			            addLoot(pool, ModItems.daggerStone, 3);
			            addLoot(pool, ModItems.kniveWood, 3);
			            addLoot(pool, ModItems.kniveGold, 3);
			            addLoot(pool, ModItems.recurveBow, 3);
			            addLoot(pool, ModItems.skewerDiamond, 3);
			            addLoot(pool, ModItems.skewerIron, 3);
			            addLoot(pool, ModItems.battleAxeGold, 3);
			            addLoot(pool, ModItems.crossbow, 2);
			            addLoot(pool, ModItems.flailStone, 3);
			            addLoot(pool, ModItems.halbertGold, 3);
			            addLoot(pool, ModItems.hammer, 3);
			            addLoot(pool, ModItems.longswordWood, 3);
			            addLoot(pool, ModItems.longswordIron, 3);
			            addLoot(pool, ModItems.spearWood, 3);
			            addLoot(pool, ModItems.spearIron, 3);
			            addLoot(pool, ModItems.spearDiamond, 3);
			            addLoot(pool, ModItems.tridentWood, 3);
			            addLoot(pool, ModItems.waraxeIron, 3);
			            addLoot(pool, ModItems.warhammerStone, 3);
			            addLoot(pool, ModItems.multiToolStone, 2);
			            addLoot(pool, ModItems.multiToolGold, 2);
			            addLoot(pool, ModItems.compoundBow, 1);
				     }
	        }
	        
	        
	        if(event.getName().equals(LootTableList.CHESTS_END_CITY_TREASURE))
	        {
	            LootPool pool = event.getTable().getPool("main");
	            addLoot(pool, ModItems.amethyst, 10);
	            addLoot(pool, ModItems.ruby, 10);
	            addLoot(pool, ModItems.sapphire, 10);
	            addLoot(pool, ModItems.amber, 10);
	            addLoot(pool, ModItems.upgradeEpic, 1);
	            addLoot(pool, ModItems.topaz, 5);
	            addLoot(pool, ModItems.witherDust, 5);
	            addLoot(pool, ModItems.witheredIronIngot, 5);
	        }
	        
	        
	        
	        
	        if(event.getName().equals(LootTableList.ENTITIES_WITHER_SKELETON))
	        {
	            LootPool pool = event.getTable().getPool("main");
	            addLoot(pool, ModItems.witherDust, 30);
	        }

	    }
	}
