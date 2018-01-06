package net.kloud.framework.interfaces;

import net.kloud.framework.permission.PermissionNode;

public interface IPermissionModule extends IModule {
	
	public boolean addPermission(PermissionNode node);
	public boolean removePermission(PermissionNode node);
	public boolean checkForPermission(PermissionNode node);
	
	default boolean isPermissionOP() {
		return false;
	}

}
