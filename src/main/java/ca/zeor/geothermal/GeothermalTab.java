package ca.zeor.geothermal;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import ca.zeor.geothermal.GeothermalMod;
import ca.zeor.geothermal.ModItems;

public class GeothermalTab extends CreativeTabs{
	
	public GeothermalTab() {
		super(GeothermalMod.modId);
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.salt);
	}
}
