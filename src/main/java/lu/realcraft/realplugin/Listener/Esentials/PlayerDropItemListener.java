package lu.realcraft.realplugin.Listener.Esentials;

// The project Stream - MLGRush is developed and updated by PXAV.
// You are not allowed to claim this as your own, give it to 
// others or even sell it.
//
// Contact me on:
// YouTube: https://www.youtube.com/channel/UCtXSAGTwurKVeEbwEKMlFog
// Twitter: https://twitter.com/OrigPXAV
// 
// (c) 2018 PXAV     

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class PlayerDropItemListener implements Listener {

    @EventHandler
    public void onPlayerDropItem(final PlayerDropItemEvent event) {
    	if (event.getPlayer().getWorld().getName().contains("-l")){
    		if (event.getPlayer().hasPermission("RealCraft.LobbyDopItems")) {
    			
    		}else {
    			event.setCancelled(true);
    		}
    		
    	}
        
    }

}
