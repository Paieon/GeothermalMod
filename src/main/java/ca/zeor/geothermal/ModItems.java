package ca.zeor.geothermal;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	public static ItemBase salt = new ItemBase("salt");
		
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				salt
		);
	}
	
	public static void registerModels() {
		salt.registerItemModel();
	}
}
