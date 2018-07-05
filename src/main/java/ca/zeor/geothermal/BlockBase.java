package ca.zeor.geothermal;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import ca.zeor.geothermal.GeothermalMod;

public class BlockBase extends Block{
	
	protected String name;
	
	public BlockBase(Material material, String name) {
		super(material);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(GeothermalMod.creativeTab);
	}
	
	public void registerItemModel(Item itemBlock) {
		GeothermalMod.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
}
