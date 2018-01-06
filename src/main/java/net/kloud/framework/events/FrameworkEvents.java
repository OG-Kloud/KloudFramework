package net.kloud.framework.events;

import net.kloud.framework.Main;
import net.minecraftforge.event.CommandEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class FrameworkEvents {
	
	@SubscribeEvent
	public void onEvent(PlayerLoggedInEvent e) {
		if(e.player == null) return;
		else {
			Main.economy.playerLogIn(e);
			Main.permission.playerLogIn(e);
		}
	}
	
	@SubscribeEvent
	public void onEvent(WorldEvent.Save e) {
		Main.economy.worldSaveEvent(e);
		Main.permission.worldSaveEvent(e);
	}
	
	@SubscribeEvent
	public void onEvent(CommandEvent e) {
		
	}
	
	@SubscribeEvent
	public void onEvent(PlayerInteractEvent.RightClickBlock e) {
		Main.economy.interactEvent(e);
		
	}
	
	@SubscribeEvent
	public void  onEvent(PlayerInteractEvent.LeftClickBlock e) {
		
	}

}
