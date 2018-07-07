package ca.zeor.geothermal;

import javax.annotation.Nullable;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

public class BlockKineticGenerator extends BlockTileEntity<TileEntityKineticGenerator> {
	
	public BlockKineticGenerator() {
		super(Material.ROCK, "kinetic_generator");
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) { //If it is on the server side...
			TileEntityKineticGenerator tile = getTileEntity(world, pos);
			player.sendMessage(new TextComponentString("Power: " + tile.getPower()));
		}
		return true;
	}
	
	@Override
	public Class<TileEntityKineticGenerator> getTileEntityClass() {
		return TileEntityKineticGenerator.class;
	}
	
	@Nullable
	@Override
	public TileEntityKineticGenerator createTileEntity(World world, IBlockState state) {
		return new TileEntityKineticGenerator();
	}
}
