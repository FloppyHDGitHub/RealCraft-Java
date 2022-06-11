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




public class HandySettings implements Listener {

	private final static String HS = "§7§lHandy§8§lSettings";
	private final static String colorInv = "§7§lColor§8§lSettings";
	private final static String slotInv = "§7§lSlot§8§lSettings";
	
		public static Inventory OpenHandySettingsInv(Player player) {
			
			if(player.hasPermission("Realcraft.OpenHandySettings")) {
				Inventory inventory = Bukkit.createInventory(null, 3*9, HS);

				ItemStack setting0 = new ItemStack(Material.STAINED_GLASS,1,(short)0);
				ItemMeta setting0meta = setting0.getItemMeta();
				setting0meta.setDisplayName("§4colorsettings");
				setting0.setItemMeta(setting0meta);
 		
				ItemStack setting2 = new ItemStack(Material.CARROT_STICK);
				ItemMeta setting2meta = setting2.getItemMeta();
				setting2meta.setDisplayName("§3HandySlot");
				setting2.setItemMeta(setting2meta);
				
				ItemStack setting3 = new ItemStack(Material.NAME_TAG);
				ItemMeta setting3meta = setting3.getItemMeta();
				setting3meta.setDisplayName("§1ChatOverlay");
				setting3.setItemMeta(setting3meta);
				
				
				
				ItemStack setting1 = new ItemStack(Material.COMPASS);
				ItemMeta setting1meta = setting1.getItemMeta();
				setting1meta.setDisplayName("§eBack");
				setting1.setItemMeta(setting1meta);
 			
				
		 	 		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)colorsystemmethode.getcolor(player));
		 	 	 	ItemMeta emptymeta = empty.getItemMeta();
		 	 	 	emptymeta.setDisplayName(" ");
		 	 	 	empty.setItemMeta(emptymeta);
		 	 	 	
		 	 	 	
		 	 	 	
			 	 	 	inventory.setItem(0,setting0);
			 	 		inventory.setItem(1,setting2);
			 	 		inventory.setItem(2,setting3);
			 	 		inventory.setItem(4,empty);
			 	 		inventory.setItem(3,empty);
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
			 	 		inventory.setItem(22,setting1);
			 	 		inventory.setItem(23,empty);
			 	 		inventory.setItem(24,empty);
			 	 		inventory.setItem(25,empty);
			 	 		inventory.setItem(26,empty);
		 	 		
	 	 	 		
		 		
 				player.openInventory(inventory);
			
		return inventory;
			}
			return null;
	}

 	
 	@EventHandler
 	public void HandelHandyHSclick(InventoryClickEvent event) {
 		if(!(event.getWhoClicked()instanceof Player)) return;
 		Player player = (Player)event.getWhoClicked();
 		if(event.getClickedInventory().getTitle().equals(HS)) {
 			event.setCancelled(true);
 			switch(event.getSlot()) {

 		 	case 0:
 		 		player.openInventory(OpenHandySettingsColorInv(player));
 				break;
 		 	case 1:
 		 		player.openInventory(OpenHandySettingsSlotInv(player));
 		 		
 		 		break;
 		 	case 2:
 		 		
 		 		break;
 		 	case 22:
 		 		Handy.OpenGUI(player);
 		 		break;

			default:
				break;
 			}
 			}
 		}
		public static Inventory OpenHandySettingsColorInv(Player player) {
			
			if(player.hasPermission("Realcraft.OpenHandySettings")) {
				Inventory inventory = Bukkit.createInventory(null, 3*9, colorInv);

				ItemStack setting0 = new ItemStack(Material.COMPASS);
				ItemMeta setting0meta = setting0.getItemMeta();
				setting0meta.setDisplayName("§eBack");
				setting0.setItemMeta(setting0meta);
 		
				ItemStack color0 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)0);
				ItemMeta color0meta = color0.getItemMeta();
				color0meta.setDisplayName("§fWhite");
				color0.setItemMeta(color0meta);
				
				ItemStack color1 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)1);
				ItemMeta color1meta = color1.getItemMeta();
				color1meta.setDisplayName("§6Orange");
				color1.setItemMeta(color1meta);
				
				ItemStack color2 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)2);
				ItemMeta color2meta = color2.getItemMeta();
				color2meta.setDisplayName("§dMagenta");
				color2.setItemMeta(color2meta);
				
				ItemStack color3 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)3);
				ItemMeta color3meta = color3.getItemMeta();
				color3meta.setDisplayName("§bLight Blue");
				color3.setItemMeta(color3meta);
				
				ItemStack color4 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)4);
				ItemMeta color4meta = color4.getItemMeta();
				color4meta.setDisplayName("§eYellow");
				color4.setItemMeta(color4meta);
				
				ItemStack color5 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)5);
				ItemMeta color5meta = color5.getItemMeta();
				color5meta.setDisplayName("§aLime");
				color5.setItemMeta(color5meta);
				
				ItemStack color6 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)6);
				ItemMeta color6meta = color6.getItemMeta();
				color6meta.setDisplayName("§dPink");
				color6.setItemMeta(color6meta);
				
				ItemStack color7 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)7);
				ItemMeta color7meta = color7.getItemMeta();
				color7meta.setDisplayName("§8Dark Gray");
				color7.setItemMeta(color7meta);
				
				ItemStack color8 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)8);
				ItemMeta color8meta = color8.getItemMeta();
				color8meta.setDisplayName("§7Gray");
				color8.setItemMeta(color8meta);
				
				ItemStack color9 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)9);
				ItemMeta color9meta = color9.getItemMeta();
				color9meta.setDisplayName("§3Cyan");
				color9.setItemMeta(color9meta);
				
				ItemStack color10 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)10);
				ItemMeta color10meta = color10.getItemMeta();
				color10meta.setDisplayName("§5Purple");
				color10.setItemMeta(color10meta);
				
				ItemStack color11 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)11);
				ItemMeta color11meta = color11.getItemMeta();
				color11meta.setDisplayName("§1Dark Blue");
				color11.setItemMeta(color11meta);
				
				ItemStack color12 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)12);
				ItemMeta color12meta = color12.getItemMeta();
				color12meta.setDisplayName("§8Brown");
				color12.setItemMeta(color12meta);
				
				ItemStack color13 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)13);
				ItemMeta color13meta = color13.getItemMeta();
				color13meta.setDisplayName("§2Green");
				color13.setItemMeta(color13meta);
				
				ItemStack color14 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)14);
				ItemMeta color14meta = color14.getItemMeta();
				color14meta.setDisplayName("§4Red");
				color14.setItemMeta(color2meta);
				
				ItemStack color15 = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)15);
				ItemMeta color15meta = color15.getItemMeta();
				color15meta.setDisplayName("§0Black");
				color15.setItemMeta(color15meta);
				
				
				ItemStack setting1 = new ItemStack(Material.COMPASS);
				ItemMeta setting1meta = setting1.getItemMeta();
				setting1meta.setDisplayName("§eBack");
				setting1.setItemMeta(setting1meta);
 			

			 	 	inventory.setItem(0,color0);
			 		inventory.setItem(1,color1);
			 		inventory.setItem(2,color2);
			 		inventory.setItem(3,color3);
			 	 	inventory.setItem(4,color4);
			 		inventory.setItem(5,color5);
			 		inventory.setItem(6,color6);
			 		inventory.setItem(7,color7);
			 	 	inventory.setItem(8,color8);
			 		inventory.setItem(9,color9);
			 		inventory.setItem(10,color10);
			 		inventory.setItem(11,color11);
			 	 	inventory.setItem(12,color12);
			 		inventory.setItem(13,color13);
			 		inventory.setItem(14,color14);
			 		inventory.setItem(15,color15);
			 		
			 		inventory.setItem(22,setting1);

 				player.openInventory(inventory);
			
		return inventory;
			}
			return null;
	}
 	
 	@EventHandler
 	public void HandelHandyColorclick(InventoryClickEvent event) {
 		if(!(event.getWhoClicked()instanceof Player)) return;
 		Player player = (Player)event.getWhoClicked();
 		if(event.getClickedInventory().getTitle().equals(colorInv)) {
 			event.setCancelled(true);
 			switch(event.getSlot()) {

 		 	case 0:
 		 		colorsystemmethode.setcolor(player, 0);
 				break;
 	
 		 	case 1:
 		 		colorsystemmethode.setcolor(player, 1);
 				break;
 				
 		 	case 2:
 		 		colorsystemmethode.setcolor(player, 2);
 				break;
 				
 		 	case 3:
 		 		colorsystemmethode.setcolor(player, 3);
 				break;
 				
 		 	case 4:
 		 		colorsystemmethode.setcolor(player, 4);
 				break;
 				
 		 	case 5:
 		 		colorsystemmethode.setcolor(player, 5);
 				break;
 				
 		 	case 6:
 		 		colorsystemmethode.setcolor(player, 6);
 				break;
 				
 		 	case 7:
 		 		colorsystemmethode.setcolor(player, 7);
 				break;
 				
 		 	case 8:
 		 		colorsystemmethode.setcolor(player, 8);
 				break;
 				
 		 	case 9:
 		 		colorsystemmethode.setcolor(player, 9);
 				break;
 				
 		 	case 10:
 		 		colorsystemmethode.setcolor(player, 10);
 				break;
 				
 		 	case 11:
 		 		colorsystemmethode.setcolor(player, 11);
 				break;
 				
 		 	case 12:
 		 		colorsystemmethode.setcolor(player, 12);
 				break;
 				
 		 	case 13:
 		 		colorsystemmethode.setcolor(player, 13);
 				break;
 				
 		 	case 14:
 		 		colorsystemmethode.setcolor(player, 14);
 				break;
 				
 		 	case 15:	 		
 		 		colorsystemmethode.setcolor(player, 15);
 				break;
 				

 		 	case 22:
 		 		OpenHandySettingsInv(player);
 		 		break;

			default:
				break;

 			}
 		}
 	}
 	
 	public static Inventory OpenHandySettingsSlotInv(Player player) {
		
		if(player.hasPermission("Realcraft.OpenHandySettings")) {
			Inventory inventory = Bukkit.createInventory(null, 2*9, slotInv);
		
			ItemStack color0 = new ItemStack(Material.PAPER,1);
			ItemMeta color0meta = color0.getItemMeta();
			color0meta.setDisplayName("§fWhite");
			color0.setItemMeta(color0meta);
			
			ItemStack color1 = new ItemStack(Material.PAPER,2);
			ItemMeta color1meta = color1.getItemMeta();
			color1meta.setDisplayName("§6Orange");
			color1.setItemMeta(color1meta);
			
			ItemStack color2 = new ItemStack(Material.PAPER,3);
			ItemMeta color2meta = color2.getItemMeta();
			color2meta.setDisplayName("§dMagenta");
			color2.setItemMeta(color2meta);
			
			ItemStack color3 = new ItemStack(Material.PAPER,4);
			ItemMeta color3meta = color3.getItemMeta();
			color3meta.setDisplayName("§bLight Blue");
			color3.setItemMeta(color3meta);
			
			ItemStack color4 = new ItemStack(Material.PAPER,5);
			ItemMeta color4meta = color4.getItemMeta();
			color4meta.setDisplayName("§eYellow");
			color4.setItemMeta(color4meta);
			
			ItemStack color5 = new ItemStack(Material.PAPER,6);
			ItemMeta color5meta = color5.getItemMeta();
			color5meta.setDisplayName("§aLime");
			color5.setItemMeta(color5meta);
			
			ItemStack color6 = new ItemStack(Material.PAPER,7);
			ItemMeta color6meta = color6.getItemMeta();
			color6meta.setDisplayName("§dPink");
			color6.setItemMeta(color6meta);
			
			ItemStack color7 = new ItemStack(Material.PAPER,8);
			ItemMeta color7meta = color7.getItemMeta();
			color7meta.setDisplayName("§8Dark Gray");
			color7.setItemMeta(color7meta);
			
			ItemStack color8 = new ItemStack(Material.PAPER,9);
			ItemMeta color8meta = color8.getItemMeta();
			color8meta.setDisplayName("§7Gray");
			color8.setItemMeta(color8meta);
			
	 		ItemStack close = new ItemStack(Material.SKULL_ITEM,1, (short) SkullType.PLAYER.ordinal());
	 		SkullMeta closemeta = (SkullMeta)close.getItemMeta();
	 		closemeta.setDisplayName("§eBack");
	 		closemeta.setOwner("MHF_ArrowLeft");
	 		close.setItemMeta(closemeta);
			

 	 		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)colorsystemmethode.getcolor(player));
 	 	 	ItemMeta emptymeta = empty.getItemMeta();
 	 	 	emptymeta.setDisplayName(" ");
 	 	 	empty.setItemMeta(emptymeta);
			
			
		 	 	inventory.setItem(0,color0);
		 		inventory.setItem(1,color1);
		 		inventory.setItem(2,color2);
		 		inventory.setItem(3,color3);
		 	 	inventory.setItem(4,color4);
		 		inventory.setItem(5,color5);
		 		inventory.setItem(6,color6);
		 		inventory.setItem(7,color7);
		 	 	inventory.setItem(8,color8);
		 	 	
		 		inventory.setItem(9,empty);
		 		inventory.setItem(10,empty);
		 		inventory.setItem(11,empty);
		 	 	inventory.setItem(12,empty);
		 		inventory.setItem(13,close);
		 		inventory.setItem(14,empty);
		 		inventory.setItem(15,empty);
		 		inventory.setItem(16,empty);
		 		inventory.setItem(17,empty);
		 		

				player.openInventory(inventory);
		
	return inventory;
		}
		return null;
}
	
	@EventHandler
	public void HandelHandySlotclick(InventoryClickEvent event) {
		if(!(event.getWhoClicked()instanceof Player)) return;
		Player player = (Player)event.getWhoClicked();
		if(event.getClickedInventory().getTitle().equals(slotInv)) {
			event.setCancelled(true);
	 		ItemStack Handy = new ItemStack(Material.CARROT_STICK);
	 		ItemMeta HandyMeta = Handy.getItemMeta();
	 		HandyMeta.setDisplayName("§bHandy");
	 		Handy.setItemMeta(HandyMeta);
			switch(event.getSlot()) {

			
			
		 	case 0:
		 		if(player.getInventory().getItem(0) == null) {
		 			player.getInventory().remove(Handy);
		 			colorsystemmethode.setHandyslot(player, 0);
		 			player.getInventory().setItem(colorsystemmethode.getHandyslot(player), Handy);
		 		}else if(colorsystemmethode.getHandyslot(player) == 0) {
		 			player.sendMessage("You Handy is already on this Slot");
				}else {player.sendMessage("No space at you chois slot");}
				break;
	
		 	case 1:
		 		if(player.getInventory().getItem(1) == null) {
		 			player.getInventory().remove(Handy);
		 			colorsystemmethode.setHandyslot(player, 1);
		 			player.getInventory().setItem(colorsystemmethode.getHandyslot(player), Handy);
		 		}else if(colorsystemmethode.getHandyslot(player) == 1) {
		 			player.sendMessage("You Handy is already on this Slot");
				}else {player.sendMessage("No space at you chois slot");}
				break;
				
		 	case 2:
		 		if(player.getInventory().getItem(2) == null) {
		 			player.getInventory().remove(Handy);
		 			colorsystemmethode.setHandyslot(player, 2);
		 			player.getInventory().setItem(colorsystemmethode.getHandyslot(player), Handy);
		 		}else if(colorsystemmethode.getHandyslot(player) == 2) {
		 			player.sendMessage("You Handy is already on this Slot");
				}else {player.sendMessage("No space at you chois slot");}
		 	case 3:
		 		if(player.getInventory().getItem(3) == null) {
		 			player.getInventory().remove(Handy);
		 			colorsystemmethode.setHandyslot(player, 3);
		 			player.getInventory().setItem(colorsystemmethode.getHandyslot(player), Handy);
		 		}else if(colorsystemmethode.getHandyslot(player) == 3) {
		 			player.sendMessage("You Handy is already on this Slot");
				}else {player.sendMessage("No space at you chois slot");}
				break;
				
		 	case 4:
		 		if(player.getInventory().getItem(4) == null) {
		 			player.getInventory().remove(Handy);
		 			colorsystemmethode.setHandyslot(player, 4);
		 			player.getInventory().setItem(colorsystemmethode.getHandyslot(player), Handy);
		 		}else if(colorsystemmethode.getHandyslot(player) == 4) {
		 			player.sendMessage("You Handy is already on this Slot");
				}else {player.sendMessage("No space at you chois slot");}
				break;
				
		 	case 5:
		 		if(player.getInventory().getItem(5) == null) {
		 			player.getInventory().remove(Handy);
		 			colorsystemmethode.setHandyslot(player, 5);
		 			player.getInventory().setItem(colorsystemmethode.getHandyslot(player), Handy);
		 		}else if(colorsystemmethode.getHandyslot(player) == 5) {
		 			player.sendMessage("You Handy is already on this Slot");
				}else {player.sendMessage("No space at you chois slot");}
				break;
				
		 	case 6:
		 		if(player.getInventory().getItem(6) == null) {
		 			player.getInventory().remove(Handy);
		 			colorsystemmethode.setHandyslot(player, 6);
		 			player.getInventory().setItem(colorsystemmethode.getHandyslot(player), Handy);
		 		}else if(colorsystemmethode.getHandyslot(player) == 6) {
		 			player.sendMessage("You Handy is already on this Slot");
				}else {player.sendMessage("No space at you chois slot");}
				break;
				
		 	case 7:
		 		if(player.getInventory().getItem(7) == null) {
		 			player.getInventory().remove(Handy);
		 			colorsystemmethode.setHandyslot(player, 7);
		 			player.getInventory().setItem(colorsystemmethode.getHandyslot(player), Handy);
		 		}else if(colorsystemmethode.getHandyslot(player) == 7) {
		 			player.sendMessage("You Handy is already on this Slot");
				}else {player.sendMessage("No space at you chois slot");}
				break;
				
		 	case 8:
		 		if(player.getInventory().getItem(8) == null) {
		 			player.getInventory().remove(Handy);
		 			colorsystemmethode.setHandyslot(player, 8);
		 			player.getInventory().setItem(colorsystemmethode.getHandyslot(player), Handy);
		 		}else if(colorsystemmethode.getHandyslot(player) == 8) {
		 			player.sendMessage("You Handy is already on this Slot");
				}else {player.sendMessage("No space at you chois slot");}
				break;
				

		 	case 13:
		 		OpenHandySettingsInv(player);
		 		break;

		default:
			break;

			}
		}
	}
	
 	}

 	
