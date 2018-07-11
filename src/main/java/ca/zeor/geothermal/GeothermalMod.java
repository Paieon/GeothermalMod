package ca.zeor.geothermal;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = GeothermalMod.modId, name = GeothermalMod.name, version = GeothermalMod.version)
public class GeothermalMod {

	public static final String modId = "geothermal";
	public static final String name = "Geothermal Mod";
	public static final String version = "1.0.0";
	
	@SidedProxy(serverSide = "ca.zeor.geothermal.CommonProxy", clientSide = "ca.zeor.geothermal.ClientProxy")
	public static CommonProxy proxy;
	
	@Mod.Instance(modId)
	public static GeothermalMod instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

	@Mod.EventBusSubscriber
	public static class RegistrationHandler{
		
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			
		}
		
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			
		}
		
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			
		}
	}
}

