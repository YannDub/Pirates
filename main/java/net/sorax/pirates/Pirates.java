package net.sorax.pirates;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.sorax.pirates.common.CommonProxy;
import net.sorax.pirates.common.entities.EntityBoulet;
import net.sorax.pirates.common.entities.EntityKnife;
import net.sorax.pirates.common.items.ItemPirates;

@Mod(modid = Pirates.MODID, name = "Pirate's", version = Pirates.VERSION)

public class Pirates {
	
	public static final String MODID = "pirates";
	public static final String VERSION = "0.0.1";
	
	@Instance(MODID)
	public static Pirates instance;
	
	@SidedProxy(clientSide = "net.sorax.pirates.client.ClientProxy", serverSide = "net.sorax.pirates.common.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.registerRenderers();
		ItemPirates.load();
		
		EntityRegistry.registerModEntity(EntityBoulet.class, "EntityBoulet", 2, instance, 160, 1, false);
		EntityRegistry.registerModEntity(EntityKnife.class, "EntityKnife", 3, instance, 160, 1, false);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		
	}
}