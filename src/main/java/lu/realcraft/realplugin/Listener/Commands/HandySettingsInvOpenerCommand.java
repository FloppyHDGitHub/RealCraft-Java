package lu.realcraft.realplugin.Listener.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import lu.realcraft.realplugin.Listener.HandyApps.HandySettings;

public class HandySettingsInvOpenerCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player P = (Player) sender;
		if(P.hasPermission("Realcraft.OpenHandySettings")) {
			P.openInventory(HandySettings.OpenHandySettingsInv(P));
			}
		return false;
	}

	
	
}
