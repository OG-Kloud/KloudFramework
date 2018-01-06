package net.kloud.framework;

import net.kloud.framework.interfaces.IEconomyModule;

class EconomyModuleEntry {
	
	public IEconomyModule module;
	public int priority;
	public String modid;
	
	public EconomyModuleEntry(IEconomyModule mod, int pri, String modid) {
		this.module = mod;
		this.priority = pri;
		this.modid = modid;
	}

}
