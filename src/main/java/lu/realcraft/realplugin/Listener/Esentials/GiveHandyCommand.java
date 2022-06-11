package lu.realcraft.realplugin.Listener.Esentials;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


import lu.realcraft.realplugin.Listener.HandyApps.colorsystemmethode;


public class GiveHandyCommand implements CommandExecutor {

	

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player P = (Player) sender;
		if(P.hasPermission("Realcraft.GiveHandyCommande")) {

	 		ItemStack Handy = new ItemStack(Material.CARROT_STICK);
	 		ItemMeta HandyMeta = Handy.getItemMeta();
	 		HandyMeta.setDisplayName("§bHandy");
	 		Handy.setItemMeta(HandyMeta);
	 		
	 		P.getInventory().setItem(colorsystemmethode.getHandyslot(P), Handy);
			}
		return false;
	}
}
