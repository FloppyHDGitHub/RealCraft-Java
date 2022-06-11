package lu.realcraft.realplugin.Listener.HandyApps;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import lu.realcraft.realplugin.Listener.Handy;
import lu.realcraft.realplugin.main.RealMain;

public class BankInv implements Listener {

	private final static String Bank = "§6§lBank";

	
	public static Inventory OpenBankInv(Player player) {
		Inventory inventory = Bukkit.createInventory(null, 3*9, Bank);

		
		
 		ItemStack Bank1 = new ItemStack(RealMain.getSkull("e36e94f6c34a35465fce4a90f2e25976389eb9709a12273574ff70fd4daa6852"));
 		SkullMeta musicmeta = (SkullMeta) Bank1.getItemMeta();
 		musicmeta.setDisplayName("§4§lBank test");
 		Bank1.setItemMeta(musicmeta);
		
		
 		ItemStack close = new ItemStack(Material.SKULL_ITEM,1, (short) SkullType.PLAYER.ordinal());
 		SkullMeta closemeta = (SkullMeta)close.getItemMeta();
 		closemeta.setDisplayName("§eBack");
 		closemeta.setOwner("MHF_ArrowLeft");
 		close.setItemMeta(closemeta);
 		
 		if(player.hasPermission("color0")) {
 	 		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)colorsystemmethode.getcolor(player));
 	 	 	ItemMeta emptymeta = empty.getItemMeta();
 	 	 	emptymeta.setDisplayName(" ");
 	 	 	empty.setItemMeta(emptymeta);
	 	 	 	inventory.setItem(0,empty);
	 	 		inventory.setItem(1,empty);
	 	 		inventory.setItem(2,empty);
	 	 		inventory.setItem(4,empty);
	 	 		inventory.setItem(3,Bank1);
	 	 		inventory.setItem(5,empty);
	 	 		inventory.setItem(6,empty);
	 	 		inventory.setItem(7,empty);
	 	 		inventory.setItem(8,empty);
	 	 		
	 	 		inventory.setItem(9,empty);
	 	 		inventory.setItem(10,empty);
	 	 		inventory.setItem(11,empty);
	 	 		inventory.setItem(12,empty);
	 	 		inventory.setItem(13,empty);
	 	 		inventory.setItem(14,empty);
	 	 		inventory.setItem(15,empty);
	 	 		inventory.setItem(16,empty);
	 	 		inventory.setItem(17,empty);
	 	 		
	 	 		inventory.setItem(18,empty);
	 	 		inventory.setItem(19,empty);
	 	 		inventory.setItem(20,empty);
	 	 		inventory.setItem(21,empty);
	 	 		inventory.setItem(22,close);
	 	 		inventory.setItem(23,empty);
	 	 		inventory.setItem(24,empty);
	 	 		inventory.setItem(25,empty);
	 	 		inventory.setItem(26,empty);
 	 		}
 		
 	 	player.openInventory(inventory);
 	 	
		return inventory;
	
}
 	@EventHandler
 	public void HandelHandyBankclick(InventoryClickEvent event) {
 		if(!(event.getWhoClicked()instanceof Player)) return;
 		Player player = (Player)event.getWhoClicked();
 		if(event.getClickedInventory().getTitle().equals(Bank)) {
 			event.setCancelled(true);
 			switch(event.getSlot()) {
 			

 		 	case 22:
 		 		Handy.OpenGUI(player);
 		 		break;
			default:
				break;
 				

 			
 			
 			}
 		}
 	}

}
