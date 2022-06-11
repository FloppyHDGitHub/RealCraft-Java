package lu.realcraft.realplugin.Listener.BedWarsJoinMenu;

import lu.realcraft.realplugin.Listener.HandyApps.colorsystemmethode;
import lu.realcraft.realplugin.main.RealMain;
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

public class BWSoloMapSelector implements Listener {

	private final static String BWSMS = "§7§lBWSoloMapSelector";

	public static Inventory BWSoloMapInv(Player player) {
	Inventory inventory = Bukkit.createInventory(null, 6*9, BWSMS);
		
		ItemStack r = new ItemStack(Material.FIREWORK);
		ItemMeta rm = r.getItemMeta();
		rm.setDisplayName("§4Random");
		r.setItemMeta(rm);

		ItemStack m1 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m1m = m1.getItemMeta();
		m1m.setDisplayName("§3BW[8x1]RoofTop");
		m1.setItemMeta(m1m);
		
		ItemStack next = new ItemStack(Material.ARROW);
		ItemMeta m1mn = next.getItemMeta();
		m1mn.setDisplayName("§3Next Side");
		next.setItemMeta(m1mn);
		
		ItemStack m2 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m2m = m2.getItemMeta();
		m2m.setDisplayName("§3BW[2x1]SkyShip");
		m2.setItemMeta(m2m);
		
		ItemStack m3 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m3m = m3.getItemMeta();
		m3m.setDisplayName("§3BW[2x1]SkyShip");
		m3.setItemMeta(m3m);
		
		ItemStack m4 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m4m = m4.getItemMeta();
		m4m.setDisplayName("§3BW[2x1]SkyShip");
		m4.setItemMeta(m4m);
		
		ItemStack m5 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m5m = m5.getItemMeta();
		m5m.setDisplayName("§3BW[2x1]SkyShip");
		m5.setItemMeta(m5m);
		
		ItemStack m6 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m6m = m6.getItemMeta();
		m6m.setDisplayName("§3BW[2x1]SkyShip");
		m6.setItemMeta(m6m);
		
		ItemStack m7 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m7m = m7.getItemMeta();
		m7m.setDisplayName("§3BW[2x1]SkyShip");
		m7.setItemMeta(m7m);
		
		ItemStack m8 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m8m = m8.getItemMeta();
		m8m.setDisplayName("§3BW[2x1]SkyShip");
		m8.setItemMeta(m8m);
		
		ItemStack m9 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m9m = m9.getItemMeta();
		m9m.setDisplayName("§3BW[2x1]SkyShip");
		m9.setItemMeta(m9m);
		
		ItemStack m10 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m10m = m10.getItemMeta();
		m10m.setDisplayName("§3BW[2x1]SkyShip");
		m10.setItemMeta(m10m);
		
		ItemStack m11 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m11m = m11.getItemMeta();
		m11m.setDisplayName("§3BW[2x1]SkyShip");
		m11.setItemMeta(m11m);
		
		ItemStack m12 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m12m = m12.getItemMeta();
		m12m.setDisplayName("§3BW[2x1]SkyShip");
		m12 .setItemMeta(m12m);
		
		ItemStack m13 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m13m = m13.getItemMeta();
		m13m.setDisplayName("§3BW[2x1]SkyShip");
		m13.setItemMeta(m13m);
		
		ItemStack m14 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m14m = m14.getItemMeta();
		m14m.setDisplayName("§3BW[2x1]SkyShip");
		m14.setItemMeta(m14m);
		
		ItemStack m15 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m15m = m15.getItemMeta();
		m15m.setDisplayName("§3BW[2x1]SkyShip");
		m15.setItemMeta(m15m);
		
		ItemStack m16 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m16m = m16.getItemMeta();
		m16m.setDisplayName("§3BW[2x1]SkyShip");
		m16.setItemMeta(m16m);
		
		ItemStack m17 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m17m = m17.getItemMeta();
		m17m.setDisplayName("§3BW[2x1]SkyShip");
		m17.setItemMeta(m17m);
		
		ItemStack m18 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m18m = m18.getItemMeta();
		m18m.setDisplayName("§3BW[2x1]SkyShip");
		m18.setItemMeta(m18m);
		
		ItemStack m19 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m19m = m19.getItemMeta();
		m19m.setDisplayName("§3BW[2x1]SkyShip");
		m19.setItemMeta(m19m);
		
		ItemStack m20 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m20m = m20.getItemMeta();
		m20m.setDisplayName("§3BW[2x1]SkyShip");
		m20.setItemMeta(m20m);
		
		ItemStack m21 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m21m = m21.getItemMeta();
		m21m.setDisplayName("§3BW[2x1]SkyShip");
		m21.setItemMeta(m21m);
		
		ItemStack m22 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m22m = m22.getItemMeta();
		m22m.setDisplayName("§3BW[2x1]SkyShip");
		m22.setItemMeta(m22m);
		
		ItemStack m23 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m23m = m23.getItemMeta();
		m23m.setDisplayName("§3BW[2x1]SkyShip");
		m23.setItemMeta(m23m);
		
		ItemStack m24 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m24m = m24.getItemMeta();
		m24m.setDisplayName("§3BW[2x1]SkyShip");
		m24.setItemMeta(m24m);
		
		ItemStack m25 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m25m = m25.getItemMeta();
		m25m.setDisplayName("§3BW[2x1]SkyShip");
		m25.setItemMeta(m25m);
		
		ItemStack m26 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m26m = m26.getItemMeta();
		m26m.setDisplayName("§3BW[2x1]SkyShip");
		m26.setItemMeta(m26m);
		
		ItemStack m27 = new ItemStack(Material.EMPTY_MAP);
		ItemMeta m27m = m27.getItemMeta();
		m27m.setDisplayName("§3BW[2x1]SkyShip");
		m27.setItemMeta(m27m);
		
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
	 	 		inventory.setItem(10,m1);
	 	 		inventory.setItem(11,m2);
	 	 		inventory.setItem(12,m3);
	 	 		inventory.setItem(13,r);
	 	 		inventory.setItem(14,m4);
	 	 		inventory.setItem(15,m5);
	 	 		inventory.setItem(16,m6);
	 	 		inventory.setItem(17,empty);
	 	 		
	 	 		inventory.setItem(18,empty);
	 	 		inventory.setItem(19,m7);
	 	 		inventory.setItem(20,m8);
	 	 		inventory.setItem(21,m9);
	 	 		inventory.setItem(22,m10);
	 	 		inventory.setItem(23,m11);
	 	 		inventory.setItem(24,m12);
	 	 		inventory.setItem(25,m13);
	 	 		inventory.setItem(26,empty);
	 	 		
	 	 		inventory.setItem(27,empty);
	 	 		inventory.setItem(28,m14);
	 	 		inventory.setItem(29,m15);
	 	 		inventory.setItem(30,m16);
	 	 		inventory.setItem(31,m17);
	 	 		inventory.setItem(32,m18);
	 	 		inventory.setItem(33,m19);
	 	 		inventory.setItem(34,m20);
	 	 		inventory.setItem(35,empty);
	 	 		
	 	 		inventory.setItem(36,empty);
	 	 		inventory.setItem(37,m21);
	 	 		inventory.setItem(38,m22);
	 	 		inventory.setItem(39,m23);
	 	 		inventory.setItem(40,m24);
	 	 		inventory.setItem(41,m25);
	 	 		inventory.setItem(42,m26);
	 	 		inventory.setItem(43,m27);
	 	 		inventory.setItem(44,empty);
	 	 		
	 	 		inventory.setItem(45,empty);
	 	 		inventory.setItem(46,empty);
	 	 		inventory.setItem(47,empty);
	 	 		inventory.setItem(48,empty);
	 	 		inventory.setItem(49,close);
	 	 		inventory.setItem(50,empty);
	 	 		inventory.setItem(51,next);
	 	 		inventory.setItem(52,empty);
	 	 		inventory.setItem(53,empty);
 	 		}
 		
 	 		player.openInventory(inventory);
 			return inventory;
	}
	
	@EventHandler
	public void HandelHandyAIclick(InventoryClickEvent event) {
		if(!(event.getWhoClicked()instanceof Player)) return;
		Player p = (Player)event.getWhoClicked();
		if(event.getClickedInventory().getTitle().equals(BWSMS)) {
			event.setCancelled(true);
			switch(event.getSlot()) {

		 	case 13:
		 		Bukkit.dispatchCommand(p, "bw randomjoin solo");
				break;
		 	case 11:
		 		if(p.hasPermission("RealCraft.BW.SoloMap.BW[12x1]SkyShip")) {
		 			Bukkit.dispatchCommand(p, "bw join BW[12x1]SkyShip");
		 		}else {
		 			p.sendMessage(RealMain.prefix + "§4You need §0[§aVIP§0]§r§4 or higher to use this function!!");
		 		}
				break;

		 	case 10:
		 		if(p.hasPermission("RealCraft.BW.SoloMap.BW[8x1]RoofTop")) {
		 			Bukkit.dispatchCommand(p, "bw join BW[8x1]RoofTop");
		 		}else {
		 			p.sendMessage(RealMain.prefix + "§4You need §0[§aVIP§0]§r§4 or higher to use this function!!");
		 		}
				break;

				
		 	case 49:
		 		BWModeInv.OpenBMGInv(p);
				
		default:
			break;
			}
		}
		
	}
}