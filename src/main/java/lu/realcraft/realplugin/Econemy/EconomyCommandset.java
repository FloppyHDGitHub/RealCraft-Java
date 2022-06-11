package lu.realcraft.realplugin.Econemy;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EconomyCommandset implements CommandExecutor {
	



		@Override
		public boolean onCommand(CommandSender sender, Command comand, String s, String[] string) {
			
			if(sender instanceof Player) {
				if(sender.hasPermission("RealCraft.Server.eco.ADMIN")) {
					
		
				Player p = (Player) sender;
				if(string.length == 3)  {
					if (Bukkit.getPlayer(string[0]) == null) {
						sender.sendMessage("§4Not Online!!");
						return false;
					
						
						
					}
					Player player = Bukkit.getPlayer(string[0]);
					if(string[1].equalsIgnoreCase("set")) {
						try {
						}catch (NumberFormatException e) {
							sender.sendMessage("§4you wanna set an amount from another universe!PLEASE type again but an corrct §4NUMBER!!!");
						}
						Econemy.setmoney(player.getUniqueId(), Integer.parseInt(string[2]));
						p.sendMessage("§6 "+ Integer.parseInt(string[2]) +" F  " + player.getName());
						
					
					}else if(string[1].equalsIgnoreCase("add")) {
							try {
							}catch (NumberFormatException e) {
								sender.sendMessage("§4you wanna add an amount from another universe!PLEASE type again but an corrct §4NUMBER!!!");
			
							}
							Econemy.addmoney(player.getUniqueId(), Integer.parseInt(string[2]));
							p.sendMessage("§a+ "+ Integer.parseInt(string[2]) +" F  " + player.getName());
							
							
					}else if(string[1].equalsIgnoreCase("remove")) {
							try {
							}catch (NumberFormatException e) {
								sender.sendMessage("§4you wanna remove an amount from another universe!PLEASE type again but an corrct §4NUMBER!!!");
							}
							Econemy.removemoney(player.getUniqueId(), Integer.parseInt(string[2]));
							p.sendMessage("§4- "+ Integer.parseInt(string[2]) +" F  " + player.getName());
							}

					
					}else {
					sender.sendMessage("§d/Realeco <Player> <add/remove/set> <amount>");
				}
				}
			}else {
				sender.sendMessage("§4you missing Permission");
			}
				return false;
	}
}

