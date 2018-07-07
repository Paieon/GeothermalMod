package ca.zeor.geothermal;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	
	public static BlockBase kineticGenerator = new BlockBase(Material.ROCK, "kinetic_generator");
	
	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				kineticGenerator
				
		);
		
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
				kineticGenerator.createItemBlock()
				
		);
	}
	
	public static void registerModels() {
		kineticGenerator.registerItemModel(Item.getItemFromBlock(kineticGenerator));
		
	}
}
