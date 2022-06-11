package lu.realcraft.realplugin.Permissions.Listener;

import lu.realcraft.realplugin.main.RealMain;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;


public class PermissionsPrefix implements Listener {


	
	public static String RealPexSuffix;
	public static String RealPexPrefix;
	private static String lvl;
	private static String RealPexPrefixchat;
	private static String RealPexSuffixchat;
	public static String level;
	
	@EventHandler
	public void PerfixUser(final AsyncPlayerChatEvent e) {
		
		final Player player = e.getPlayer();
		final String message = e.getMessage().replace("%", "%%"); 
		
        String level = "%alonsolevels_colored_level_format%";
        level = PlaceholderAPI.setPlaceholders(player, level);
        
		if(RealMain.getPlugin().getchatcfgm() != null) {
			lvl = level;
		}else {
			lvl = "";
		}
		if(RealMain.getPlugin().getchatcfgm() != null) {
			RealPexPrefixchat = RealPexPrefix;
		}else {
			RealPexPrefixchat = "";
		}
		if(RealMain.getPlugin().getchatcfgm() != null) {
			RealPexSuffixchat = RealPexSuffix;
		}else {
			RealPexSuffixchat = "";
		}
		
		
		e.setFormat(RealPexPrefixchat + player.getName() +" "+ lvl + " " + RealPexSuffixchat +" : "+ message);
		}
		
	@EventHandler
	public void PrefixLoader(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		if(player.hasPermission("RealCraft.Defaut")) {
			RealPexPrefix = "";
			RealPexSuffix = "";
		}
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		if(player.hasPermission("RealCraft.Gruop.Owner")) {
			RealPexPrefix = "§0[§4Owner§0]§r ";
		}
	}
}
