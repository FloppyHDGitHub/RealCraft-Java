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

public class PortalGunInv implements Listener {

	private final static String PG = "§5§lPortal§d§lGun";
	
	public static Inventory OpenPortalGunInv(Player player) {
		Inventory inventory = Bukkit.createInventory(null, 3*9, PG);
 		
 		ItemStack warp1 = new ItemStack(Material.IRON_PICKAXE);
 		ItemMeta warp1meta = warp1.getItemMeta();
 		warp1meta.setDisplayName("§2§lOverworld");
 		warp1.setItemMeta(warp1meta);
 		
 		ItemStack warp2 = new ItemStack(Material.OBSIDIAN);
 		ItemMeta warp2meta = warp2.getItemMeta();
 		warp2meta.setDisplayName("§4§lNether");
 		warp2.setItemMeta(warp2meta);
 		
 		ItemStack warp3 = new ItemStack(Material.ENDER_PORTAL_FRAME);
 		ItemMeta warp3meta = warp3.getItemMeta();
 		warp3meta.setDisplayName("§5§lEnd");
 		warp3.setItemMeta(warp3meta);
 		
 		ItemStack warp4 = new ItemStack(Material.GLOWSTONE);
 		ItemMeta warp4meta = warp4.getItemMeta();
 		warp4meta.setDisplayName("§3§lAether");
 		warp4.setItemMeta(warp4meta);

 		ItemStack warp18 = new ItemStack(Material.NETHER_STAR);
 		ItemMeta warp18meta = warp18.getItemMeta();
 		warp18meta.setDisplayName("§b§lLobby");
 		warp18.setItemMeta(warp18meta);
 		
 		ItemStack warp9 = new ItemStack(Material.SKULL_ITEM,1, (short) SkullType.PLAYER.ordinal());
 		SkullMeta warp9meta = (SkullMeta)warp9.getItemMeta();
 		warp9meta.setDisplayName("§7§lPlot Home");
 		warp9meta.setOwner(player.getName());
 		warp9.setItemMeta(warp9meta);
 		
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
	 	 	 	inventory.setItem(0,warp1);
	 	 		inventory.setItem(1,empty);
	 	 		inventory.setItem(2,warp2);
	 	 		inventory.setItem(4,warp3);
	 	 		inventory.setItem(3,empty);
	 	 		inventory.setItem(5,empty);
	 	 		inventory.setItem(6,warp4);
	 	 		inventory.setItem(7,empty);
	 	 		inventory.setItem(8,warp9);
	 	 		
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
	 	 		inventory.setItem(23,warp18);
	 	 		inventory.setItem(24,empty);
	 	 		inventory.setItem(25,empty);
	 	 		inventory.setItem(26,empty);
 	 		}
 	 	 	
 	 
 		
 	 	player.openInventory(inventory);
 	 	
		return inventory;
	}
 	
 	@EventHandler
 	public void HandelHandyPGclick(InventoryClickEvent event) {
 		if(!(event.getWhoClicked()instanceof Player)) return;
 		Player player = (Player)event.getWhoClicked();
 		if(event.getClickedInventory().getTitle().equals(PG)) {
 			event.setCancelled(true);
 			switch(event.getSlot()) {
 			
 		 	case 0:
 		 		player.sendMessage(RealMain.prefix + "Warping");
 		 		Bukkit.dispatchCommand(player, "warp Farmwelt");
 				break;
		 	case 2:
 		 		player.sendMessage(RealMain.prefix + "Warping");
 		 		Bukkit.dispatchCommand(player, "warp Nether");
 				break;
 		 	case 4:
 		 		player.sendMessage(RealMain.prefix + "Warping");
 		 		Bukkit.dispatchCommand(player, "warp End");
 				break;
 		 	case 6:
 		 		player.sendMessage(RealMain.prefix + "Warping");
 				break;
 		 	case 8:
 		 		player.sendMessage(RealMain.prefix + "Warping");
		 		Bukkit.dispatchCommand(player, "plot home");
		 		break;
 		 	case 23:
 		 		player.sendMessage(RealMain.prefix + "Warping");
 		 		break;
 		 	case 22:
 		 		Handy.OpenGUI(player);
 		 		break;
 		 		
			default:
				break;
 				

 			
 			
 			
 			}
 		}
 		
 	}
 	

 	
 	
 	
 	

 	
}