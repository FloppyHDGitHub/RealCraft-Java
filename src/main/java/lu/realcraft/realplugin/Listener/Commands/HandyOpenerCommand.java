package lu.realcraft.realplugin.Listener.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import lu.realcraft.realplugin.Listener.Handy;

public class HandyOpenerCommand implements CommandExecutor{
	
    private String prefix = "§0[§bRealcraft§0] §7";
    
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(!p.hasPermission("Realcraft.HandyOpen")) {
			p.sendMessage("§4Missing Permmision");
		}else {
			p.openInventory(Handy.OpenGUI(p));
			p.sendMessage(prefix + "Handy Startup");
		}	
		return false;
	}	
}

