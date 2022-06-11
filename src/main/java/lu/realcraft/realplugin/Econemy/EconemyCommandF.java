package lu.realcraft.realplugin.Econemy;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import org.bukkit.entity.Player;



public class EconemyCommandF implements CommandExecutor {

	

	@Override
	public boolean onCommand(CommandSender sender, Command comand, String String, String[] string) {
		
		if(sender instanceof Player) {
			Player p = (Player) sender;
			if(string.length == 0) {
				
				p.sendMessage("§aBalance §6" + Econemy.getmoney(p.getUniqueId()) + " §6§lF");
			}else if(String.length() == 1) {
				Player player = Bukkit.getPlayer(string[0]);
					if(player != null) {
						p.sendMessage("§aBalance from§6 " + player.getName() + " : " + Econemy.getmoney(player.getUniqueId()) +" §6§lF");
					
				}
			}
		}
		
		return false;
	}

	
	
	
}
