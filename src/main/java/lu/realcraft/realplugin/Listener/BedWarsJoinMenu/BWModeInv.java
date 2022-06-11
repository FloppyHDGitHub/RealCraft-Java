package lu.realcraft.realplugin.Listener.BedWarsJoinMenu;

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

import lu.realcraft.realplugin.Listener.HandyApps.GamesInv;
import lu.realcraft.realplugin.Listener.HandyApps.colorsystemmethode;

public class BWModeInv implements Listener {

	

	private final static String BMG = "§7§lBedwars§8§lMode§7§lGUI";
	
	public static Inventory OpenBMGInv(Player player) {
		Inventory inventory = Bukkit.createInventory(null, 3*9, BMG);
 		
 		ItemStack solo = new ItemStack(Material.BED);
 		ItemMeta solometa = solo.getItemMeta();
 		solometa.setDisplayName("§bSolo");
 		solo.setItemMeta(solometa);
 		
 		ItemStack duo = new ItemStack(Material.BED,2);
 		ItemMeta duometa = duo.getItemMeta();
 		duometa.setDisplayName("§dDuo");
 		duo.setItemMeta(duometa);
 		
 		ItemStack trio = new ItemStack(Material.BED,3);
 		ItemMeta triometa = trio.getItemMeta();
 		triometa.setDisplayName("§aTrio"); 
 		trio.setItemMeta(triometa);
 		
 		ItemStack squad = new ItemStack(Material.BED,4);
 		ItemMeta squadmeta = squad.getItemMeta();
 		squadmeta.setDisplayName("§4Squad");
 		squad.setItemMeta(squadmeta);
 		
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
	 	 		inventory.setItem(3,empty);
	 	 		inventory.setItem(5,empty);
	 	 		inventory.setItem(6,empty);
	 	 		inventory.setItem(7,empty);
	 	 		inventory.setItem(8,empty);
	 	 		
	 	 		inventory.setItem(9,empty);
	 	 		inventory.setItem(10,solo);
	 	 		inventory.setItem(11,empty);
	 	 		inventory.setItem(12,duo);
	 	 		inventory.setItem(13,empty);
	 	 		inventory.setItem(14,trio);
	 	 		inventory.setItem(15,empty);
	 	 		inventory.setItem(16,squad);
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
 	public void HandelBMGclick(InventoryClickEvent event) {
 		if(!(event.getWhoClicked()instanceof Player)) return;
 		Player p = (Player)event.getWhoClicked();
 		if(event.getClickedInventory().getTitle().equals(BMG)) {
 			event.setCancelled(true);
 			switch(event.getSlot()) {

 		 	case 22:
 		 		GamesInv.OpenGUIGames(p);
 				break;	
			case 10:
 		 		BWSoloMapSelector.BWSoloMapInv(p);
 				break;	

			default:
				break;
 			}
 		}
 		
 	}
}
