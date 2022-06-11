package lu.realcraft.realplugin.Listener.HandyApps;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import lu.realcraft.realplugin.Listener.Handy;

public class MusicInv implements Listener {

	private final static String Realfiy = "§6§lRealFiy";

	
	public static Inventory OpenBankInv(Player player) {
		Inventory Musicinv = Bukkit.createInventory(null, 5*9, Realfiy);
 		
 		ItemStack bank0 = new ItemStack(Material.RECORD_12);
 		ItemMeta bank0meta = bank0.getItemMeta();
 		bank0meta.setDisplayName("§2§lMusic");
 		bank0.setItemMeta(bank0meta);

 		ItemStack close = new ItemStack(Material.SKULL_ITEM,1, (short) SkullType.PLAYER.ordinal());
 		SkullMeta closemeta = (SkullMeta)close.getItemMeta();
 		closemeta.setDisplayName("§eBack");
 		closemeta.setOwner("MHF_ArrowLeft");
 		close.setItemMeta(closemeta);
 		
 		Musicinv.setItem(25,bank0);
 		
 		
 	 	player.openInventory(Musicinv);
 	 	
		return Musicinv;
	
}
 	@EventHandler
 	public void HandelHandyBankclick(InventoryClickEvent event) {
 		if(!(event.getWhoClicked()instanceof Player)) return;
 		Player player = (Player)event.getWhoClicked();
 		if(event.getClickedInventory().getTitle().equals(Realfiy)) {
 			event.setCancelled(true);
 			switch(event.getCurrentItem().getType()) {
 			
 		 	case RECORD_12:
 		 		player.playSound(player.getLocation(), Sound.AMBIENCE_CAVE, 100, 100);
 				break;
 		 	case COMPASS:
 		 		Handy.OpenGUI(player);
 		 		break;
			default:
				break;
 				

 			
 			
 			}
 		}
 	}

}
