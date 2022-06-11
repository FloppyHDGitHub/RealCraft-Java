package lu.realcraft.realplugin.Listener.Commands;

import lu.realcraft.realplugin.Listener.HandyApps.colorsystemmethode;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class getCustoHead implements CommandExecutor, Listener {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String arg2, String[] arg3) {

		Player p = (Player) sender;

		if (p.hasPermission("RealCraft.Command.getCustomHead")) {

			if (arg3.length == 1) {
				Inventory inventory = Bukkit.createInventory(null, 3 * 9, "Head from " + arg3[0]);

				ItemStack Music = new ItemStack(Material.SKULL_ITEM, 1, (short) SkullType.PLAYER.ordinal());
				SkullMeta musicmeta = (SkullMeta) Music.getItemMeta();
				musicmeta.setDisplayName(arg3[0]);
				musicmeta.setOwner(arg3[0]);
				Music.setItemMeta(musicmeta);

				ItemStack Music1 = new ItemStack(Material.SKULL_ITEM, 8, (short) SkullType.PLAYER.ordinal());
				SkullMeta musicmeta1 = (SkullMeta) Music1.getItemMeta();
				musicmeta1.setDisplayName(arg3[0]);
				musicmeta1.setOwner(arg3[0]);
				Music1.setItemMeta(musicmeta1);

				ItemStack Music2 = new ItemStack(Material.SKULL_ITEM, 16, (short) SkullType.PLAYER.ordinal());
				SkullMeta musicmeta2 = (SkullMeta) Music.getItemMeta();
				musicmeta2.setDisplayName(arg3[0]);
				musicmeta2.setOwner(arg3[0]);
				Music2.setItemMeta(musicmeta2);

				ItemStack Music3 = new ItemStack(Material.SKULL_ITEM, 32, (short) SkullType.PLAYER.ordinal());
				SkullMeta musicmeta3 = (SkullMeta) Music1.getItemMeta();
				musicmeta3.setDisplayName(arg3[0]);
				musicmeta3.setOwner(arg3[0]);
				Music3.setItemMeta(musicmeta3);

				ItemStack Music4 = new ItemStack(Material.SKULL_ITEM, 64, (short) SkullType.PLAYER.ordinal());
				SkullMeta musicmeta4 = (SkullMeta) Music4.getItemMeta();
				musicmeta4.setDisplayName(arg3[0]);
				musicmeta4.setOwner(arg3[0]);
				Music4.setItemMeta(musicmeta4);

				ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) colorsystemmethode.getcolor(p));
				ItemMeta emptymeta = empty.getItemMeta();
				emptymeta.setDisplayName(" ");
				empty.setItemMeta(emptymeta);

				inventory.setItem(0, empty);
				inventory.setItem(1, empty);
				inventory.setItem(2, empty);
				inventory.setItem(4, empty);
				inventory.setItem(3, empty);
				inventory.setItem(5, empty);
				inventory.setItem(6, empty);
				inventory.setItem(7, empty);
				inventory.setItem(8, empty);

				inventory.setItem(9, empty);
				inventory.setItem(10, empty);
				inventory.setItem(11, Music);
				inventory.setItem(12, Music1);
				inventory.setItem(13, Music2);
				inventory.setItem(14, Music3);
				inventory.setItem(15, Music4);
				inventory.setItem(16, empty);
				inventory.setItem(17, empty);

				inventory.setItem(18, empty);
				inventory.setItem(19, empty);
				inventory.setItem(20, empty);
				inventory.setItem(21, empty);
				inventory.setItem(22, empty);
				inventory.setItem(23, empty);
				inventory.setItem(24, empty);
				inventory.setItem(25, empty);
				inventory.setItem(26, empty);
				p.openInventory(inventory);

			}
		}


		return true;
	}
	@EventHandler
	public void HandelHandyBankclick(InventoryClickEvent event) {
		if(!(event.getWhoClicked()instanceof Player)) return;
		Player player = (Player)event.getWhoClicked();
		if(event.getClickedInventory().getTitle().contains("Head from ")) {
			event.setCancelled(true);
			switch(event.getSlot()) {

				case 11:
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"give " + ((Player) event.getWhoClicked()).getDisplayName() + " " + "minecraft:skull 1 3 {SkullOwner:" + event.getCurrentItem().getItemMeta().getDisplayName() + "}");
					break;
				case 12:
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"give " + ((Player) event.getWhoClicked()).getDisplayName() + " " + "minecraft:skull 8 3 {SkullOwner:" + event.getCurrentItem().getItemMeta().getDisplayName() + "}");
					break;
				case 13:
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"give " + ((Player) event.getWhoClicked()).getDisplayName() + " " + "minecraft:skull 16 3 {SkullOwner:" + event.getCurrentItem().getItemMeta().getDisplayName() + "}");
					break;
				case 14:
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"give " + ((Player) event.getWhoClicked()).getDisplayName() + " " + "minecraft:skull 32 3 {SkullOwner:" + event.getCurrentItem().getItemMeta().getDisplayName() + "}");
					break;
				case 15:
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"give " + ((Player) event.getWhoClicked()).getDisplayName() + " " + "minecraft:skull 64 3 {SkullOwner:" + event.getCurrentItem().getItemMeta().getDisplayName() + "}");
					break;

				default:
					break;




			}
		}
	}




}