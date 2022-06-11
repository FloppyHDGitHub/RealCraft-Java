package lu.realcraft.realplugin.Listener.Esentials;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import lu.realcraft.realplugin.Language.Listener.LanguageConfController;
import lu.realcraft.realplugin.Listener.HandyApps.colorsystemmethode;
import lu.realcraft.realplugin.main.RealMain;
import me.clip.placeholderapi.PlaceholderAPI;



public class Join implements Listener {

	
	public ItemStack Handy;
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		

		LanguageConfController.setLang(p,LanguageConfController.getLang(p));
 		if(LanguageConfController.getLang(p) == null) {
 			LanguageConfController.setLang(p,"US-us");
		}
		String joinText = RealMain.prefix + "§0[§2+§0]§9 " + "%player_name%";
		

 		ItemStack Handy = new ItemStack(Material.CARROT_STICK);
 		ItemMeta HandyMeta = Handy.getItemMeta();
 		HandyMeta.setDisplayName("§bHandy");
 		Handy.setItemMeta(HandyMeta);
 		
 		
 		
 	
 		
 		p.getInventory().setItem(colorsystemmethode.getHandyslot(p), Handy);
 		
 		joinText = PlaceholderAPI.setPlaceholders(p, joinText);
 		
 		e.setJoinMessage(joinText);
 		
 		
 		RealMain.getPlugin().getScoreboardManager().setBoard(e.getPlayer());

        Bukkit.getScheduler().runTaskTimer(RealMain.getPlugin(), () -> {
        	RealMain.getPlugin().getScoreboardManager().updateBoard(e.getPlayer());

        }, 0, 20);
        
        
        
	}
 	@EventHandler
 	public void onItemMove(InventoryClickEvent e) {
 		if(e.getCurrentItem().getType() == Material.CARROT_STICK) {
 			e.setCancelled(true);
 		}
 	} 
 	@EventHandler
    public void onItemDrop (PlayerDropItemEvent e) {
            Item drop = e.getItemDrop();
            if (drop.getItemStack().getType() == Material.CARROT_STICK) {
                e.setCancelled(true);
            } 
    }
}













