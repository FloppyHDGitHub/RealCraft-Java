package lu.realcraft.realplugin.Listener.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


import lu.realcraft.realplugin.main.RealMain;

public class LobbyCommandlobby implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player P = (Player) sender;
		if(P.hasPermission("Realcraft.LobbyCommand")) {
			Bukkit.dispatchCommand(sender, "warp lobby");
			P.sendMessage(RealMain.prefix + " &§You got teleported to Lobby");
			}else {
				P.sendMessage(RealMain.prefix + "§cMissing Permission");
			}
				
		return false;
	}
}
