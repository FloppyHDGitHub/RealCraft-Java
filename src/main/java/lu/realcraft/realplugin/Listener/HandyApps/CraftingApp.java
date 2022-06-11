package lu.realcraft.realplugin.Listener.HandyApps;

import org.bukkit.entity.Player;

import lu.realcraft.realplugin.main.RealMain;

public class CraftingApp {

	
	public static void CraftingAppOpener(Player player) {
		Player p = (Player) player;
		if(p.hasPermission("RealCraft.CraftingTabelApp")) {
	 	p.sendMessage(RealMain.prefix + "Hear is you Crafting App");
		p.openWorkbench(null, true);
		}else {
	 		p.sendMessage(RealMain.prefix + "You Have To Buy the App First");
		}
		
	}
	
}
