package ca.zeor.geothermal.objects.items.blocks;

import ca.zeor.geothermal.GeothermalMod;
import ca.zeor.geothermal.init.BlockInit;
import ca.zeor.geothermal.init.ItemInit;
import ca.zeor.geothermal.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
	 super(material);
	 setUnlocalizedName(name);
	 setRegistryName(name);
	 setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	 
	 BlockInit.BLOCKS.add(this);
	 ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	 
	}

	@Override
	public void registerModels()
	{
		GeothermalMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		 
		
	}
 
}
