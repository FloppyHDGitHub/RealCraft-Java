package lu.realcraft.realplugin.Listener.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import lu.realcraft.realplugin.Listener.HandyApps.AdminInv;

public class AdminInvCommand implements CommandExecutor {

	
    
    
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(!p.hasPermission("Realcraft.Admin")) {
			p.sendMessage("§4");
		}else {
			p.openInventory(AdminInv.OpenAdminInv(p));
		}	
		return false;
	}	
}