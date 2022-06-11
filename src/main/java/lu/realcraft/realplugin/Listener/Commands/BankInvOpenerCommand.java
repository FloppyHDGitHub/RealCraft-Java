package lu.realcraft.realplugin.Listener.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import lu.realcraft.realplugin.Listener.HandyApps.BankInv;

public class BankInvOpenerCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player P = (Player) sender;
		P.openInventory(BankInv.OpenBankInv(P));
		return false;
	}	
}