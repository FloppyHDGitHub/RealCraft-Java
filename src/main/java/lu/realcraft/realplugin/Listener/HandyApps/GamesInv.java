package lu.realcraft.realplugin.Listener.HandyApps;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import lu.realcraft.realplugin.Listener.BedWarsJoinMenu.BWModeInv;


public class GamesInv implements Listener {

	private final static String GameInv = "Game Inventory";
	
	
	public static Inventory OpenGUIGames(Player player) {
 		Inventory inventory = Bukkit.createInventory(null, 3*9,GameInv);
 		
 		
 		ItemStack gm0 = new ItemStack(Material.BED);
 		ItemMeta gm0meta = gm0.getItemMeta();
 		gm0meta.setDisplayName("§4Bed§fWars");
 		gm0.setItemMeta(gm0meta);
 		
 		ItemStack gm1 = new ItemStack(Material.IRON_SWORD);
 		ItemMeta gm1meta = gm1.getItemMeta();
 		gm1meta.setDisplayName("§7Murder Mystery");
 		gm1.setItemMeta(gm1meta);
 		
 		ItemStack gm2 = new ItemStack(Material.MUSHROOM_SOUP);
 		ItemMeta gm2meta = gm2.getItemMeta();
 		gm2meta.setDisplayName("§cSoup §4 S O O N");
 		gm2.setItemMeta(gm2meta);
 		
 		ItemStack gm3 = new ItemStack(Material.DIAMOND_BOOTS);
 		ItemMeta gm3meta = gm3.getItemMeta();
 		gm3meta.setDisplayName("§1Jump §3Leauge §4 S O O N");
 		gm3.setItemMeta(gm3meta);
 		
 		ItemStack gm4 = new ItemStack(Material.IRON_PICKAXE);
 		ItemMeta gm4meta = gm4.getItemMeta();
 		gm4meta.setDisplayName("§8Masterbuilders §4 S O O N");
 		gm4.setItemMeta(gm4meta);
 		
 		ItemStack gm5 = new ItemStack(Material.GRASS);
 		ItemMeta gm5meta = gm5.getItemMeta();
 		gm5meta.setDisplayName("§2Sky§aWars §4 S O O N");
 		gm5.setItemMeta(gm5meta);
 		
 		ItemStack gm6 = new ItemStack(Material.GOLDEN_APPLE);
 		ItemMeta gm6meta = gm6.getItemMeta();
 		gm6meta.setDisplayName("§6SPEED UHC §4 S O O N");
 		gm6.setItemMeta(gm6meta);
 		
 		ItemStack gm7 = new ItemStack(Material.ENDER_PORTAL_FRAME);
 		ItemMeta gm7meta = gm7.getItemMeta();
 		gm7meta.setDisplayName("§4S§6P§eE§aC§bI§1A§5L OF THE MONTH §4 S O O N");
 		gm7.setItemMeta(gm7meta);
 		
 		ItemStack gm8 = new ItemStack(Material.BLAZE_ROD);
 		ItemMeta gm8meta = gm8.getItemMeta();
 		gm8meta.setDisplayName("§6Hide and Seek §4 S O O N");
 		gm8.setItemMeta(gm8meta);
 		
 		ItemStack gm9 = new ItemStack(Material.TNT);
 		ItemMeta gm9meta = gm9.getItemMeta();
 		gm9meta.setDisplayName("§4T§0N§4T Games S O O N");
 		gm9.setItemMeta(gm9meta);
 		
 		ItemStack gm10 = new ItemStack(Material.DIAMOND_SWORD);
 		ItemMeta gm10meta = gm10.getItemMeta();
 		gm10meta.setDisplayName("§bKit §3PvP §4 S O O N");
 		gm10.setItemMeta(gm10meta);
 		
 		ItemStack gm11 = new ItemStack(Material.STICK);
 		ItemMeta gm11meta = gm11.getItemMeta();
 		gm11meta.addEnchant(Enchantment.KNOCKBACK, 1, true);
 		gm11meta.setDisplayName("§6MLG Rush §4 S O O N");
 		gm11.setItemMeta(gm11meta);
 		
 		ItemStack gm12 = new ItemStack(Material.FEATHER);
 		ItemMeta gm12meta = gm12.getItemMeta();
 		gm12meta.setDisplayName("§eGravety §4 S O O N");
 		gm12.setItemMeta(gm12meta);
 		
 		ItemStack gm13 = new ItemStack(Material.REDSTONE);
 		ItemMeta gm13meta = gm13.getItemMeta();
 		gm13meta.setDisplayName("§4Redstone Games S O O N");
 		gm13.setItemMeta(gm13meta);
 		
 		ItemStack gm14 = new ItemStack(Material.NETHER_STAR);
 		ItemMeta gm14meta = gm14.getItemMeta();
 		gm14meta.setDisplayName("§dBOSS BATTLE §4S O O N");
 		gm14.setItemMeta(gm14meta);
 		
 		
 		
 		if(player.hasPermission("color0")) {
 		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)colorsystemmethode.getcolor(player));
 	 	ItemMeta emptymeta = empty.getItemMeta();
 	 	emptymeta.setDisplayName(" ");
 	 	empty.setItemMeta(emptymeta);
 		
 	 	inventory.setItem(0,gm0);
 		inventory.setItem(1,empty);
 		inventory.setItem(2,gm1);
 		inventory.setItem(3,empty);
 		inventory.setItem(4,gm2);
 		inventory.setItem(5,empty);
 		inventory.setItem(6,gm3);
 		inventory.setItem(7,empty);
 		inventory.setItem(8,gm4);
 		
 		inventory.setItem(9,empty);
 		inventory.setItem(10,gm5);
 		inventory.setItem(11,empty);
 		inventory.setItem(12,gm6);
 		inventory.setItem(13,gm7);
 		inventory.setItem(14,gm8);
 		inventory.setItem(15,empty);
 		inventory.setItem(16,gm9);
 		inventory.setItem(17,empty);
 		
 		inventory.setItem(18,gm10);
 		inventory.setItem(19,empty);
 		inventory.setItem(20,gm11);
 		inventory.setItem(21,empty);
 		inventory.setItem(22,gm12);
 		inventory.setItem(23,empty);
 		inventory.setItem(24,gm13);
 		inventory.setItem(25,empty);
 		inventory.setItem(26,gm14);

 		}
	
 		player.openInventory(inventory);
		return inventory;
 	}

 	@EventHandler
 	public void HandelHandyColorclickt(InventoryClickEvent event) {
 		if(!(event.getWhoClicked()instanceof Player)) return;
 		Player player = (Player)event.getWhoClicked();
 		if(event.getClickedInventory().getTitle().equals(GameInv)) {
 			event.setCancelled(true);
 			switch(event.getSlot()) {

 			case 0: 
 				BWModeInv.OpenBMGInv(player);
 				break;
 				
			default:
				break;
 				
 			}
 		} 
 	}
}