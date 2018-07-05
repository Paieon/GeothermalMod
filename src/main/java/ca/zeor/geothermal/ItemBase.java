package ca.zeor.geothermal;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item{

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(GeothermalMod.creativeTab);
	}
	
	public void registerItemModel() {
		GeothermalMod.proxy.registerItemRenderer(this, 0, name);
	}
}
