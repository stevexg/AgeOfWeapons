package magmasrc.ageofweapons.util;

import net.minecraftforge.fml.common.event.FMLInterModComms;

public class ChiselHelper {
	
	public static void chisel() {

		FMLInterModComms.sendMessage("chisel", "variation:add", "ruby|AgeOfWeapons:ruby_block|0");
		FMLInterModComms.sendMessage("chisel", "variation:add", "sapphire|AgeOfWeapons:sapphire_block|0");
		FMLInterModComms.sendMessage("chisel", "variation:add", "amethyst|AgeOfWeapons:amethyst_block|0");
		FMLInterModComms.sendMessage("chisel", "variation:add", "topaz|AgeOfWeapons:topaz_block|0");
		FMLInterModComms.sendMessage("chisel", "variation:add", "amber|AgeOfWeapons:amber_block|0");
	}
}
