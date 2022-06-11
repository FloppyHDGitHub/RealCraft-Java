package lu.realcraft.realplugin.Listener.HandyApps;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class AdminInv implements Listener {

	private final static String AI = "§7§lAdmin§8§lInv";
	
	public static Inventory OpenAdminInv(Player player) {
		Inventory HSinv = Bukkit.createInventory(null, 5*9, AI);
 		
 		ItemStack admin0 = new ItemStack(Material.REDSTONE_TORCH_ON);
 		ItemMeta admin0meta = admin0.getItemMeta();
 		admin0meta.setDisplayName("§4Creativ");
 		admin0.setItemMeta(admin0meta);
 		
 		ItemStack admin1 = new ItemStack(Material.GRASS);
 		ItemMeta admin1meta = admin1.getItemMeta();
 		admin1meta.setDisplayName("§4Survival");
 		admin1.setItemMeta(admin1meta);
 		
 		ItemStack admin2 = new ItemStack(Material.EYE_OF_ENDER);
 		ItemMeta admin2meta = admin2.getItemMeta();
 		admin2meta.setDisplayName("§4Spectator");
 		admin2.setItemMeta(admin2meta);
 		
 		ItemStack allitems = new ItemStack(Material.BEACON);
 		ItemMeta allitemsmeta = allitems.getItemMeta();
 		allitemsmeta.setDisplayName("§l§4ALLITEMS SOON");
 		allitems.setItemMeta(allitemsmeta);
 		
 		
 		
 		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)colorsystemmethode.getcolor(player));
 		ItemMeta emptymeta = empty.getItemMeta();
 		emptymeta.setDisplayName(".");
 		empty.setItemMeta(emptymeta);

 		
 		HSinv.setItem(0,empty);
 		HSinv.setItem(1,empty);
 		HSinv.setItem(2,empty);
 		HSinv.setItem(4,empty);
 		HSinv.setItem(3,empty);
 		HSinv.setItem(5,empty);
 		HSinv.setItem(6,empty);
 		HSinv.setItem(7,empty);
 		HSinv.setItem(8,empty);
 		
 		HSinv.setItem(9,empty);
 		HSinv.setItem(10,empty);
 		HSinv.setItem(11,empty);
 		HSinv.setItem(12,admin0);
 		HSinv.setItem(13,admin1);
 		HSinv.setItem(14,admin2);
 		HSinv.setItem(15,empty);
 		HSinv.setItem(16,empty);
 		HSinv.setItem(17,empty);
 		
 		HSinv.setItem(18,empty);
 		HSinv.setItem(19,empty);
 		HSinv.setItem(20,empty);
 		HSinv.setItem(21,empty);
 		HSinv.setItem(22,allitems);
 		HSinv.setItem(23,empty);
 		HSinv.setItem(24,empty);
 		HSinv.setItem(25,empty);
 		HSinv.setItem(26,empty);

 	 	player.openInventory(HSinv);
 	 	
		return HSinv;
	}
 	
 	@EventHandler
 	public void HandelHandyAIclick(InventoryClickEvent event) {
 		if(!(event.getWhoClicked()instanceof Player)) return;
 		Player p = (Player)event.getWhoClicked();
 		if(event.getClickedInventory().getTitle().equals(AI)) {
 			event.setCancelled(true);
 			switch(event.getCurrentItem().getType()) {

 		 	case REDSTONE_TORCH_ON:
 		 		p.setGameMode(GameMode.CREATIVE);
 				break;
 				
 		 	case GRASS:
 		 		p.setGameMode(GameMode.SURVIVAL);
 				break;
 				
 		 	case EYE_OF_ENDER:
 		 		p.setGameMode(GameMode.SPECTATOR);
 				break;	

			default:
				break;
 			}
 		}
 		
 	}

}