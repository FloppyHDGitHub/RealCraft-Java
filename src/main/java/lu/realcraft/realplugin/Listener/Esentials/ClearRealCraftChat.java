package lu.realcraft.realplugin.Listener.Esentials;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class ClearRealCraftChat implements CommandExecutor {
    private String prefix = "§0[§bRealcraft§0] §7";
    
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(!p.hasPermission("RealCraft.ClearChat")) {
			p.sendMessage("§4Missing Permmision");
		}else {
			for(int i=0; i < 105; ++i) {
				for(Player all : Bukkit.getOnlinePlayers()) {
					if(!all.hasPermission("RealCraft.ClearChat")) {
						all.sendMessage("");
					}
				}
			}
			Bukkit.broadcastMessage(prefix + " §3  Chat was cleaning by " + p.getName());
			return true;
		}
		return false;
	}	
}
