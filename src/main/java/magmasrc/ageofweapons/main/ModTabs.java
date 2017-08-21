package magmasrc.ageofweapons.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModTabs {
	
	public static CreativeTabs generalTab = new CreativeTabs("generalTab") {
		
		@Override
		public ItemStack getTabIconItem() {    	
			return new ItemStack(ModBlocks.tableOfAges);	
		}
	};
	
	
	
	public static CreativeTabs stoneAgeTab = new CreativeTabs("stoneAgeTab") {
		
		@Override
		public ItemStack getTabIconItem() {    	
			return new ItemStack(ModItems.upgradeStoneAge);		   	
		}
	};
	
	
	public static CreativeTabs antiquityTab  = new CreativeTabs("antiquityTab") {
		
		@Override
		public ItemStack getTabIconItem() {    	
			return new ItemStack(ModItems.upgradeAtiquity);
		}
	};
	
	
	
	public static CreativeTabs middleAgesTab = new CreativeTabs("middleAgesTab") {
		
		@Override
		public ItemStack getTabIconItem() {    	
			return new ItemStack(ModItems.upgradeMiddleAges);		   
		}
	};
	
	
	public static CreativeTabs earlyModernAgeTab = new CreativeTabs("earlyModernAgeTab") {
		
		@Override
		public ItemStack getTabIconItem() {    	
			return new ItemStack(ModItems.upgradeEarlyModernAge);		   	
		}
	};
	
	
	public static CreativeTabs modernAgeTab = new CreativeTabs("modernAgeTab") {
		
		@Override
		public ItemStack getTabIconItem() {    	
			return new ItemStack(ModItems.upgradeModernAge);		     	
		}
	};
	
	
	
	public static CreativeTabs piracyTab = new CreativeTabs("piracyTab") {
		
		@Override
		public ItemStack getTabIconItem() {    	
			return new ItemStack(ModItems.upgradePiracy);		   	
		}
	};
	
	
	
	public static CreativeTabs edoTab = new CreativeTabs("edoTab") {
		
		@Override
		public ItemStack getTabIconItem() {    	
			return new ItemStack(ModItems.upgradeEdoPeriod);		   
		}
	};
	
	
	
	public static CreativeTabs mysticTab = new CreativeTabs("mysticTab") {
		
		@Override
		public ItemStack getTabIconItem() {    	
			return new ItemStack(ModItems.upgradeMystic);		   
		}
	};
	
	public static CreativeTabs fantasyTab = new CreativeTabs("fantasyTab") {
		
		@Override
		public ItemStack getTabIconItem() {    	
			return new ItemStack(ModItems.upgradeFantasy);		   	
		}
	};
	
	
	
	public static CreativeTabs bbyTab = new CreativeTabs("bbyTab") {
		
		@Override
		public ItemStack getTabIconItem() {    	
			return new ItemStack(ModItems.upgradeBBY);		 
		}
	};
	
	
	public static CreativeTabs epicTab = new CreativeTabs("epicTab") {
		
		@Override
		public ItemStack getTabIconItem() {    	
			return new ItemStack(ModItems.upgradeEpic);		   	
		}
	};
	
	
	public static CreativeTabs futureTab = new CreativeTabs("futureTab") {
		
		@Override
		public ItemStack getTabIconItem() {    	
			return new ItemStack(ModItems.upgradeFuture);		    	
		}
	};

}