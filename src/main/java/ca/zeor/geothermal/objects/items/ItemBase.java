package ca.zeor.geothermal.objects.items;

import ca.zeor.geothermal.GeothermalMod;
import ca.zeor.geothermal.init.ItemInit;
import ca.zeor.geothermal.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		GeothermalMod.proxy.registerItemRenderer(this, 0, "inventory");
			
	}
	
	
	
	
}
