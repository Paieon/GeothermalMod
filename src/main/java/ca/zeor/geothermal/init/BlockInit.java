package ca.zeor.geothermal.init;

import java.util.ArrayList;
import java.util.List;

import ca.zeor.geothermal.objects.items.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_TEST = new BlockBase("test_block", Material.IRON);
	
	
}
