package lu.realcraft.realplugin.Listener.Esentials;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;

import lu.realcraft.realplugin.main.RealMain;

public class ClearLag implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if(cmd.getName().equalsIgnoreCase("ClearLag")) {
			if(sender.hasPermission("RealCraft.ClearLag")) {
				for(Entity entity : Bukkit.getWorld("PlotWorld").getEntities()) {
					if(entity instanceof Item) {
						entity.remove();
					}
				}
				Bukkit.broadcastMessage(RealMain.prefix + "Alle boden Items wurden von " + sender.getName());
			}
		}
		
		return false;
	}

	
	
}
