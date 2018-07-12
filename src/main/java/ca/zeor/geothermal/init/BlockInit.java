package ca.zeor.geothermal.init;

import java.util.ArrayList;
import java.util.List;

import ca.zeor.geothermal.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block KINETIC_GENERATOR = new BlockBase("kinetic_generator", Material.IRON);
	
	public static final Block SALT_BLOCK = new BlockBase("salt_block", Material.SPONGE);
	
	public static final Block SALT_HEATER = new BlockBase("salt_heater", Material.ANVIL);
	
	public static final Block TURBINE_BLOCK = new BlockBase("turbine_block", Material.IRON);
	
	
}
