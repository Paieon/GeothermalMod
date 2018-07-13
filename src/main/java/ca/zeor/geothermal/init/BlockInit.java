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
	
	// Resources
	
	public static final Block SALT_BLOCK = new BlockBase("salt_block", Material.SPONGE);
	
	public static final Block SYLVITE_ORE = new BlockBase("sylvite_ore", Material.ROCK);
	
	// Turbine Blocks
	
	public static final Block TURBINE_CONTROLLER_T1 = new BlockBase("turbine_controller_t1", Material.IRON);

	public static final Block TURBINE_CONTROLLER_T2 = new BlockBase("turbine_controller_t2", Material.IRON);

	public static final Block TURBINE_CONTROLLER_T3 = new BlockBase("turbine_controller_t3", Material.IRON);

	public static final Block TURBINE_CONTROLLER_T4 = new BlockBase("turbine_controller_t4", Material.IRON);
	
	public static final Block TURBINE_ROTOR_BASE_T1 = new BlockBase("turbine_rotor_base_t1", Material.IRON);

	public static final Block TURBINE_ROTOR_BASE_T2 = new BlockBase("turbine_rotor_base_t2", Material.IRON);
	
	public static final Block TURBINE_ROTOR_BASE_T3 = new BlockBase("turbine_rotor_base_t3", Material.IRON);
	
	public static final Block TURBINE_ROTOR_BASE_T4 = new BlockBase("turbine_rotor_base_t4", Material.IRON);
	
	public static final Block TURBINE_VALVE = new BlockBase("turbine_valve", Material.IRON);
	
	public static final Block TURBINE_ROTOR_END = new BlockBase("turbine_rotor_end", Material.IRON);
	
	public static final Block TURBINE_CASING = new BlockBase("turbine_casing", Material.IRON);
	
	// Salt Heater Blocks
	
	public static final Block SALT_HEATER = new BlockBase("salt_heater", Material.ANVIL);
	
	public static final Block HEATSINK_T1 = new BlockBase("heatsink_t1", Material.ANVIL);
	
	public static final Block HEATSINK_T2 = new BlockBase("heatsink_t2", Material.ANVIL);
	
	public static final Block HEATSINK_T3 = new BlockBase("heatsink_t3", Material.ANVIL);
	
	public static final Block HEATSINK_T4 = new BlockBase("heatsink_t4", Material.ANVIL);
	
	// Cooling Tower Blocks
	
	public static final Block COOLING_TOWER_VALVE = new BlockBase("cooling_tower_valve", Material.IRON);
	
	public static final Block COOLING_TOWER_HEAT_CHANNEL = new BlockBase("cooling_tower_heat_channel", Material.IRON);
	
	public static final Block COOLING_TOWER_THERMOELECTRIC_GENERATOR = new BlockBase("cooling_tower_thermoelectric_generator", Material.IRON);
	
	public static final Block COOLING_TOWER_CASING = new BlockBase("cooling_tower_casing", Material.IRON);
	
}
