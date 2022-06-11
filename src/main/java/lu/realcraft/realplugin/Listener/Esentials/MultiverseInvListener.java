package lu.realcraft.realplugin.Listener.Esentials;

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

public class MultiverseInvListener implements Listener {

private final static String BMG = "§7§lWorlds§8§lof§7§lBuild";
	
	public static Inventory OpenBMGInv(Player player) {
		Inventory inventory = Bukkit.createInventory(null, 3*9, BMG);
 		
 		ItemStack W1 = new ItemStack(Material.SKULL_ITEM,1, (short) SkullType.PLAYER.ordinal());
 		SkullMeta friendsmeta = (SkullMeta) W1.getItemMeta();
 		friendsmeta.setDisplayName("§4§lBW-l1");
 		friendsmeta.setOwner("BlockminersTV");
 		W1.setItemMeta(friendsmeta);
 		
 		if(player.hasPermission("color0")) {
 	 		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)0);
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
	 	 		inventory.setItem(10,W1);
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
	 	 		inventory.setItem(22,empty);
	 	 		inventory.setItem(23,empty);
	 	 		inventory.setItem(24,empty);
	 	 		inventory.setItem(25,empty);
	 	 		inventory.setItem(26,empty);
 	 		}
 	 	 	
 	 		if(player.hasPermission("color1")) {
 	 		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)1);
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
	 	 		inventory.setItem(10,W1);
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
	 	 		inventory.setItem(22,empty);
	 	 		inventory.setItem(23,empty);
	 	 		inventory.setItem(24,empty);
	 	 		inventory.setItem(25,empty);
	 	 		inventory.setItem(26,empty);
 	 	 	
 	 		}
 	 		
 	 		if(player.hasPermission("color2")) {
 	 	 		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)2);
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
 	 	 		inventory.setItem(10,W1);
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
 	 	 		inventory.setItem(22,empty);
 	 	 		inventory.setItem(23,empty);
 	 	 		inventory.setItem(24,empty);
 	 	 		inventory.setItem(25,empty);
 	 	 		inventory.setItem(26,empty);

 	 	 	 	
 	 	 		}
 	 		if(player.hasPermission("color3")) {
 	 	 		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)3);
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
 	 	 		inventory.setItem(10,W1);
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
 	 	 		inventory.setItem(22,empty);
 	 	 		inventory.setItem(23,empty);
 	 	 		inventory.setItem(24,empty);
 	 	 		inventory.setItem(25,empty);
 	 	 		inventory.setItem(26,empty);

 	 	 	 	
 	 	 		}
 	 		if(player.hasPermission("color4")) {
 	 	 		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)4);
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
 	 	 		inventory.setItem(10,W1);
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
 	 	 		inventory.setItem(22,empty);
 	 	 		inventory.setItem(23,empty);
 	 	 		inventory.setItem(24,empty);
 	 	 		inventory.setItem(25,empty);
 	 	 		inventory.setItem(26,empty);

 	 	 	 	
 	 	 		}
 	 		if(player.hasPermission("color5")) {
 	 	 		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)5);
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
 	 	 		inventory.setItem(10,W1);
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
 	 	 		inventory.setItem(22,empty);
 	 	 		inventory.setItem(23,empty);
 	 	 		inventory.setItem(24,empty);
 	 	 		inventory.setItem(25,empty);
 	 	 		inventory.setItem(26,empty);

 	 	 	 	
 	 	 		}
 	 		if(player.hasPermission("color6")) {
 	 	 		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)6);
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
 	 	 		inventory.setItem(10,W1);
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
 	 	 		inventory.setItem(22,empty);
 	 	 		inventory.setItem(23,empty);
 	 	 		inventory.setItem(24,empty);
 	 	 		inventory.setItem(25,empty);
 	 	 		inventory.setItem(26,empty);

 	 	 	 	
 	 	 		}
 	 		if(player.hasPermission("color7")) {
 	 	 		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)7);
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
 	 	 		inventory.setItem(10,W1);
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
 	 	 		inventory.setItem(22,empty);
 	 	 		inventory.setItem(23,empty);
 	 	 		inventory.setItem(24,empty);
 	 	 		inventory.setItem(25,empty);
 	 	 		inventory.setItem(26,empty);

 	 	 	 	
 	 	 		}
 	 		if(player.hasPermission("color8")) {
 	 	 		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)8);
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
 	 	 		inventory.setItem(10,W1);
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
 	 	 		inventory.setItem(22,empty);
 	 	 		inventory.setItem(23,empty);
 	 	 		inventory.setItem(24,empty);
 	 	 		inventory.setItem(25,empty);
 	 	 		inventory.setItem(26,empty);

 	 	 	 	
 	 	 		}
 	 		if(player.hasPermission("color9")) {
 	 	 		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)9);
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
 	 	 		inventory.setItem(10,W1);
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
 	 	 		inventory.setItem(22,empty);
 	 	 		inventory.setItem(23,empty);
 	 	 		inventory.setItem(24,empty);
 	 	 		inventory.setItem(25,empty);
 	 	 		inventory.setItem(26,empty);

 	 	 	 	
 	 	 		}
 	 		if(player.hasPermission("color10")) {
 	 	 		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)10);
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
 	 	 		inventory.setItem(10,W1);
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
 	 	 		inventory.setItem(22,empty);
 	 	 		inventory.setItem(23,empty);
 	 	 		inventory.setItem(24,empty);
 	 	 		inventory.setItem(25,empty);
 	 	 		inventory.setItem(26,empty);

 	 	 	 	
 	 	 		}
 	 		if(player.hasPermission("color11")) {
 	 	 		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)11);
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
 	 	 		inventory.setItem(10,W1);
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
 	 	 		inventory.setItem(22,empty);
 	 	 		inventory.setItem(23,empty);
 	 	 		inventory.setItem(24,empty);
 	 	 		inventory.setItem(25,empty);
 	 	 		inventory.setItem(26,empty);

 	 	 	 	
 	 	 		}
 	 		if(player.hasPermission("color12")) {
 	 	 		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)12);
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
 	 	 		inventory.setItem(10,W1);
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
 	 	 		inventory.setItem(22,empty);
 	 	 		inventory.setItem(23,empty);
 	 	 		inventory.setItem(24,empty);
 	 	 		inventory.setItem(25,empty);
 	 	 		inventory.setItem(26,empty);

 	 	 	 	
 	 	 		}
 	 		if(player.hasPermission("color13")) {
 	 	 		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)13);
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
 	 	 		inventory.setItem(10,W1);
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
 	 	 		inventory.setItem(22,empty);
 	 	 		inventory.setItem(23,empty);
 	 	 		inventory.setItem(24,empty);
 	 	 		inventory.setItem(25,empty);
 	 	 		inventory.setItem(26,empty);
 	 	 	 	
 	 	 		}
 	 		if(player.hasPermission("color14")) {
 	 	 		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)14);
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
 	 	 		inventory.setItem(10,W1);
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
 	 	 		inventory.setItem(22,empty);
 	 	 		inventory.setItem(23,empty);
 	 	 		inventory.setItem(24,empty);
 	 	 		inventory.setItem(25,empty);
 	 	 		inventory.setItem(26,empty);
 	 	 	 	
 	 	 		}
 	 		if(player.hasPermission("color15")) {
 	 	 		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)15);
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
 	 	 		inventory.setItem(10,W1);
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
 	 	 		inventory.setItem(22,empty);
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

 			case 10:
 				
 				Bukkit.dispatchCommand(p, "mvtp BW-l1");
 				
 				break;
 			
 			
			default:
				break;
 			}
 		}
 		
 	}	
	
}
