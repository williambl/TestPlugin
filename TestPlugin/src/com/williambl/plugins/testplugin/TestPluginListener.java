package com.williambl.plugins.testplugin;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class TestPluginListener implements Listener{

	@EventHandler
	public void onBlockPlace(BlockPlaceEvent event){
		Player p = event.getPlayer();
		Block bp = event.getBlockPlaced();
		
		p.sendMessage("You placed a " + bp.getType().toString());
	}
}
