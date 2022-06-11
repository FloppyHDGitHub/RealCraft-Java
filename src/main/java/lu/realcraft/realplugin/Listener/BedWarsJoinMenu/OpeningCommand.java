package lu.realcraft.realplugin.Listener.BedWarsJoinMenu;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class OpeningCommand implements CommandExecutor {

	
    private String prefix = "§0[§3Realcraft§0] §7";
    
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(p.hasPermission("Realcraft.BWPlay")) {
			BWModeInv.OpenBMGInv(p);
			p.sendMessage(prefix + " Bw Mode Selector");
		}else {
			p.sendMessage("§4Missing Permmision");
		}	
		return false;
	}

}