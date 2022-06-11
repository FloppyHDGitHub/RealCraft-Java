package lu.realcraft.realplugin.Listener.Esentials;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import lu.realcraft.realplugin.main.RealMain;

public class RealChatScan implements Listener {
	public static String Insult = "§cPlease pay attention to your choice of words!";
	public static String Horny = "§5This is not an +18 Server. You horny little something!";
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		String m = e.getMessage();
		Player p = e.getPlayer();
			if(m.toLowerCase().contains("wixxer")) {
				e.setCancelled(true);
				p.sendMessage(RealMain.prefix + Horny);
			}
			if(m.toLowerCase().contains("arsch")) {
				e.setCancelled(true);
				p.sendMessage(RealMain.prefix  + Insult);
			}
			if(m.toLowerCase().contains("dumm")) {
				e.setCancelled(true);
				p.sendMessage(RealMain.prefix  + Insult);
			}
			if(m.toLowerCase().equals("hs")) {
				e.setCancelled(true);
				p.sendMessage(RealMain.prefix  + Insult);
			}
			if(m.toLowerCase().contains("nazi")) {
				e.setCancelled(true);
				p.sendMessage(RealMain.prefix  + Insult);
			}
			if(m.toLowerCase().contains("huren")) {
				e.setCancelled(true);
				p.sendMessage(RealMain.prefix  + Horny);
			}
			if(m.toLowerCase().contains("bastard")) {
				e.setCancelled(true);
				p.sendMessage(RealMain.prefix + Insult);
			}
			if(m.toLowerCase().contains("missgeburt")) {
				e.setCancelled(true);
				p.sendMessage(RealMain.prefix  + Insult);
			}
    		if(m.toLowerCase().contains("acab")) {
                e.setCancelled(true);
                p.sendMessage(RealMain.prefix  + Insult);
            }
    		if(m.toLowerCase().contains("bitch")) {
                e.setCancelled(true);
                p.sendMessage(RealMain.prefix  + Insult);
            }
    		if(m.toLowerCase().contains("nigger")) {
                e.setCancelled(true);
                p.sendMessage(RealMain.prefix  + Insult);
    		}
            if(m.toLowerCase().contains("nigga")) {
                e.setCancelled(true);
                p.sendMessage(RealMain.prefix  + Insult);
            }
            if(m.toLowerCase().contains("7l")) {
                e.setCancelled(true);
                p.sendMessage(RealMain.prefix + "Do you mean /L?");
            }
            if(m.toLowerCase().contains("cunt")) {
            	 e.setCancelled(true);
            	 p.sendMessage(RealMain.prefix + Horny);
            }
            if(m.toLowerCase().contains("fuck")) {
            	 e.setCancelled(true);
            	 p.sendMessage(RealMain.prefix + Horny);
            }
            if(m.toLowerCase().contains("asshole")) {
            	 e.setCancelled(true);
            	 p.sendMessage(RealMain.prefix + Horny);
            }
            if(m.toLowerCase().contains("bastard")) {
            	 e.setCancelled(true);
            	 p.sendMessage(RealMain.prefix + Insult);
            }
            if(m.toLowerCase().contains("bugger off")) {
            	 e.setCancelled(true);
            	 p.sendMessage(RealMain.prefix + Insult);
            }
            if(m.toLowerCase().contains("suck")) {
            	 e.setCancelled(true);
            	 p.sendMessage(RealMain.prefix + Horny);
            }
            if(m.toLowerCase().contains("jerk")) {
            	 e.setCancelled(true);
            	 p.sendMessage(RealMain.prefix + Horny);
            }
           	if(m.toLowerCase().contains("shit")) {
            	 e.setCancelled(true);
            	 p.sendMessage(RealMain.prefix + Insult);
            }
           	if(m.toLowerCase().contains("wanker")) {
            	 e.setCancelled(true);
            	 p.sendMessage(RealMain.prefix + Insult);
            }
            if(m.toLowerCase().contains("whore")) {
            	 e.setCancelled(true);
            	 p.sendMessage(RealMain.prefix + Insult);
            }
            if(m.toLowerCase().contains("waifu")) {
            	 e.setCancelled(true);
            	 p.sendMessage(RealMain.prefix + Horny);
            }
		

        if(m.toLowerCase().contains("&0")){
        	m.toLowerCase().equals(ChatColor.BLACK);
        }
        if(m.toLowerCase().contains("&1")){
        	m.toLowerCase().equals(ChatColor.DARK_BLUE);
        }
        if(m.toLowerCase().contains("&2")){
        	m.toLowerCase().equals(ChatColor.DARK_GREEN);
        }
        if(m.toLowerCase().contains("&3")){
        	m.toLowerCase().equals(ChatColor.DARK_AQUA);
        }
        if(m.toLowerCase().contains("&4")){
        	m.toLowerCase().equals(ChatColor.DARK_RED);
        }
        if(m.toLowerCase().contains("&5")){
        	m.toLowerCase().equals(ChatColor.DARK_PURPLE);
        }
        if(m.toLowerCase().contains("&6")){
        	m.toLowerCase().equals(ChatColor.GOLD);
        }
        if(m.toLowerCase().contains("&7")){
        	m.toLowerCase().equals(ChatColor.GRAY);
        }
        if(m.toLowerCase().contains("&8")){
        	m.toLowerCase().equals(ChatColor.DARK_GRAY);
        }
        if(m.toLowerCase().contains("&9")){
        	m.toLowerCase().equals(ChatColor.BLUE);
        }
        if(m.toLowerCase().contains("&a")){
        	m.toLowerCase().equals(ChatColor.GREEN);
        }
        if(m.toLowerCase().contains("&b")){
        	m.toLowerCase().equals(ChatColor.AQUA);
        }
        if(m.toLowerCase().contains("&c")){
        	m.toLowerCase().equals(ChatColor.RED);
        }
        if(m.toLowerCase().contains("&d")){
        	m.toLowerCase().equals(ChatColor.LIGHT_PURPLE);
        }
        if(m.toLowerCase().contains("&e")){
        	m.toLowerCase().equals(ChatColor.YELLOW);
        }
        if(m.toLowerCase().contains("&f")){
        	m.toLowerCase().equals(ChatColor.WHITE);
        }
       
               
	}

	}