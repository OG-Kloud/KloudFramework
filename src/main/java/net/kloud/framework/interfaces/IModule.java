package net.kloud.framework.interfaces;

import java.io.IOException;

import net.kloud.framework.KWriter;

interface IModule {
	
	public KWriter getWriter();
	
	public void save() throws IOException;
	
	public void load() throws IOException;
	
	

}
