package lu.realcraft.realplugin.Listener.Commands;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import lu.realcraft.realplugin.Listener.Esentials.MultiverseInvListener;
import lu.realcraft.realplugin.main.RealMain;

public class MultiverseInvCommand implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player P = (Player) sender;
		if(P.hasPermission("Realcraft.MultiVersInv")) {
			MultiverseInvListener.OpenBMGInv(P);
			
			}else {
				P.sendMessage(RealMain.prefix + "§cMissing Permission");
			}
				
		return false;
	}
}