package net.kloud.framework;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.kloud.framework.interfaces.IEconomyModule;
import net.kloud.framework.interfaces.IPermissionModule;
import net.kloud.framework.interfaces.IPermissionNode;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppedEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main {
	
	public static final String MODID = "kloudframework", NAME = "Kloud Framework", VERSION = "0.0.6-dev";
	public static final boolean isDevMode = false, useDefaultEconomy = true, useDefaultPermissions = true, useDefaultRegion = true;
	public static File saveDir;
	public static IEconomyModule economy;
	public static IPermissionModule permission;
	public static List<IPermissionNode> permissionNodes = new ArrayList<IPermissionNode>();
	public static List<EconomyModuleEntry> economyModules = new ArrayList<EconomyModuleEntry>();
	
	
	@Mod.Instance
	public static Main instance;
	
	public void registerEconomyInstance(IEconomyModule module, int priority, String modid) {
		economyModules.add(new EconomyModuleEntry(module, priority, modid));
	}
	
	public void initiateModules(int pri) {
		IEconomyModule econ = null;
		for(EconomyModuleEntry entry : economyModules) {
			if(entry.priority == pri) econ = entry.module;
		}
		if(econ == null) initiateModules(pri++);
		if(econ == null) System.out.println("No economy plugin detected, will cause crash. Either no economy installed or not registered with the Framework");
	}
	
	public void registerPermissionNode(IPermissionNode node) {
		Main.permissionNodes.add(node);
	}
	
	@EventHandler
	public void pre(FMLPreInitializationEvent e) {
		saveDir = new File(e.getModConfigurationDirectory().getParentFile(), "KloudData");
		saveDir.mkdirs();
		
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		initiateModules(0);
	}
	
	@EventHandler
	public void starting(FMLServerStartingEvent e) {

	}
	
	@EventHandler
	public void stopping(FMLServerStoppingEvent e) {
		
	}
	
	@EventHandler 
	public void stopped(FMLServerStoppedEvent e) {
		
	}

}
