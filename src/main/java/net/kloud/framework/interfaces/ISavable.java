package net.kloud.framework.interfaces;

import java.io.File;
import java.io.IOException;

public interface ISavable {
	
	public void save(File file) throws IOException;
	
	public void load() throws IOException;
	
	public File getSaveDir();

}
