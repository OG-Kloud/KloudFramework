package net.kloud.framework.interfaces;

import java.io.IOException;

import net.kloud.framework.KWriter;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

interface IModule {
	
	public KWriter getWriter();
	
	public void save() throws IOException;
	
	public void load() throws IOException;
	
	public abstract void playerLogIn(PlayerLoggedInEvent e);
	
	public abstract void worldSaveEvent(WorldEvent.Save e);
	
	public abstract void interactEvent(PlayerInteractEvent.RightClickBlock e);
	
	public abstract void interactEvent(PlayerInteractEvent.LeftClickBlock e);
	
	public abstract void blockBreakEvent(BlockEvent.BreakEvent e);

}
