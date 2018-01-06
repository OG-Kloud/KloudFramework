package net.kloud.framework.interfaces;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

public interface ICommandPermissions extends ICommand{
	
	public String getPermissionString();
	
	@Override
	public default boolean checkPermission(MinecraftServer server, ICommandSender sender) {
		return true;
	}

}
