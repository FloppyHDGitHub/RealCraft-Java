package lu.realcraft.realplugin.Permissions.Listener;


import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import lu.realcraft.realplugin.main.RealMain;
import net.md_5.bungee.api.ChatColor;


public class perrmissionsCommands implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String string, String[] arg3) {
		if(sender.hasPermission("RealCraft.RealPex.Command")) {
		if(arg3.length == 3) {
			if (Bukkit.getPlayer(arg3[0]) == null) {
				sender.sendMessage("§4Not Online!!");
				return false;
			}
			Player player = Bukkit.getPlayer(arg3[0]);
			if(arg3[1].equalsIgnoreCase("add")) {
				if(!RealMain.getPlugin().getPermissions(player).contains(arg3[2])) {
					PermissionManager permissionManager = new PermissionManager(player);
					permissionManager.addPerm(arg3[2]);
					sender.sendMessage(player.getName() + " add " + arg3[2]);
				}else {
					sender.sendMessage("§4The Player alrady has this Permission");
				}
			}else if(arg3[1].equalsIgnoreCase("remove")) {
				if(RealMain.getPlugin().getPermissions(player).contains(arg3[2])) {
					PermissionManager permissionManager = new PermissionManager(player);
					permissionManager.removePerm(arg3[2]);
					sender.sendMessage(player.getName() + " remove " + arg3[2]);
				}else {
					sender.sendMessage("§4The Player dont has this Permission");
				}
			}else if(arg3[1].equalsIgnoreCase("list")) {
				if(arg3[2].equals("all")) {
				sender.sendMessage(ChatColor.AQUA + player.getName() + "  §2List:§3 " + RealMain.getPlugin().getPermissions(player));
				}else {
					sender.sendMessage("§d/RealPex <Player> <add/remove/list> <permission/all>");
				}
			}
		}else {
			sender.sendMessage("§d/RealPex <Player> <add/remove/list> <permission/all>");
		}
		
		
	}else {
		sender.sendMessage("§4you missing Permission");
	}
		return false;
	}
}
