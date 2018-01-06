package net.kloud.framework.permission;

import net.kloud.framework.interfaces.IPermissionNode;

public class PermissionNode implements IPermissionNode{
	
	private String modid;
	private String permission;
	private String completePermission;
	
	public PermissionNode(String mod, String permissino) {
		this.modid = mod;
		this.permission = permissino;
		init();
	}
	
	private void init() {
		this.completePermission = modid+"."+permission;
	}

	@Override
	public String getModid() {
		return modid;
	}

	@Override
	public String getPermissionString() {
		return permission;
	}
	
	public String getPermission() {
		return completePermission;
	}

}
