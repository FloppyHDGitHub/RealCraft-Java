package lu.realcraft.realplugin.Listener;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import lu.realcraft.realplugin.Listener.HandyApps.BankInv;
import lu.realcraft.realplugin.Listener.HandyApps.CraftingApp;
import lu.realcraft.realplugin.Listener.HandyApps.GamesInv;
import lu.realcraft.realplugin.Listener.HandyApps.HandySettings;
import lu.realcraft.realplugin.Listener.HandyApps.MusicInv;
import lu.realcraft.realplugin.Listener.HandyApps.PortalGunInv;
import lu.realcraft.realplugin.Listener.HandyApps.colorsystemmethode;
import lu.realcraft.realplugin.main.RealMain;



public class Handy implements Listener {
	
	private final static String Handy = "§b§lReal§a§lPhone";

	
	public static Inventory OpenGUI(Player player) {
 		Inventory inventory = Bukkit.createInventory(null, 6*9,Handy);
 		
 		
 		ItemStack ec = new ItemStack(Material.ENDER_CHEST);
 		ItemMeta ecmeta = ec.getItemMeta();
 		ecmeta.setDisplayName("§5§lEnderChest");
 		ec.setItemMeta(ecmeta);
 		
 		ItemStack portalgun = new ItemStack(Material.SKULL_ITEM,1, (short) SkullType.PLAYER.ordinal());
 		SkullMeta portalgunmeta = (SkullMeta) portalgun.getItemMeta();
 		portalgunmeta.setDisplayName("§4§lWorlds");
 		portalgunmeta.setOwner("BlockminersTV");
 		portalgun.setItemMeta(portalgunmeta);
 		
 		ItemStack realstore = new ItemStack(Material.PRISMARINE_SHARD);
 		ItemMeta realstoremeta = realstore.getItemMeta();
 		realstoremeta.setDisplayName("§3§lRealStore");
 		realstore.setItemMeta(realstoremeta);
 				
 		ItemStack credits = new ItemStack(Material.PAPER);
 		ItemMeta creditsmeta = credits.getItemMeta();
 		creditsmeta.setDisplayName("§f§lCredits");
 		credits.setItemMeta(creditsmeta);
 		
 		ItemStack friends = new ItemStack(Material.SKULL_ITEM,1, (short) SkullType.PLAYER.ordinal());
 		SkullMeta friendsmeta = (SkullMeta) friends.getItemMeta();
 		friendsmeta.setDisplayName("§4§lFriends");
 		friendsmeta.setOwner(player.getName());
 		friends.setItemMeta(friendsmeta);
 		
 		ItemStack party = new ItemStack(Material.CAKE);
 		ItemMeta partymeta = party.getItemMeta();
 		partymeta.setDisplayName("§d§lParty");
 		party.setItemMeta(partymeta);
 		
 		ItemStack ench = new ItemStack(Material.ENCHANTED_BOOK);
 		ItemMeta enchmeta = ench.getItemMeta();
 		enchmeta.setDisplayName("§5§lRewards");
 		ench.setItemMeta(enchmeta);
 		
 		ItemStack crafting = new ItemStack(Material.WORKBENCH);
 		ItemMeta craftingmeta = crafting.getItemMeta();
 		craftingmeta.setDisplayName("§e§lCrafting");
 		crafting.setItemMeta(craftingmeta);
 		
 		ItemStack bank = new ItemStack(Material.EMERALD);
 		ItemMeta bankmeta = bank.getItemMeta();
 		bankmeta.setDisplayName("§6§lBank");
 		bank.setItemMeta(bankmeta);
 		
 		ItemStack settings = new ItemStack(Material.COMMAND);
 		ItemMeta settingsmeta = settings.getItemMeta();
 		settingsmeta.setDisplayName("§l§4settings");
 		settings.setItemMeta(settingsmeta);
 		
 		ItemStack Gadget = new ItemStack(Material.NETHER_STAR);
 		ItemMeta Gadgetmeta = Gadget.getItemMeta();
 		Gadgetmeta.setDisplayName("§dGadget");
 		Gadget.setItemMeta(Gadgetmeta);
 		
 		ItemStack Music = new ItemStack(Material.SKULL_ITEM,1, (short) SkullType.PLAYER.ordinal());
 		SkullMeta musicmeta = (SkullMeta) Music.getItemMeta();
 		musicmeta.setDisplayName("§4§lRealfiy");
 		musicmeta.setOwner("C418");
 		Music.setItemMeta(musicmeta);
 		
 		ItemStack TGames = new ItemStack(Material.SNOW_BALL);
 		ItemMeta TGamesmeta = TGames.getItemMeta();
 		TGamesmeta.setDisplayName("d");
 		TGames.setItemMeta(TGamesmeta);
 		
 		ItemStack quests = new ItemStack(Material.BOOK_AND_QUILL);
 		ItemMeta questsmeta = quests.getItemMeta();
 		questsmeta.setDisplayName("§2Quests");
 		quests.setItemMeta(questsmeta);
 		
 		ItemStack rebook = new ItemStack(Material.BOOK);
 		ItemMeta rebookmeta = rebook.getItemMeta();
 		rebookmeta.setDisplayName("§3Recipe Book");
 		rebook.setItemMeta(rebookmeta);
 		
 		ItemStack Games = new ItemStack(Material.BED);
 		ItemMeta Gamesmeta = Games.getItemMeta();
 		Gamesmeta.setDisplayName("§3Games");
 		Games.setItemMeta(Gamesmeta);
 		
 		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)colorsystemmethode.getcolor(player));
 	 	ItemMeta emptymeta = empty.getItemMeta();
 	 	emptymeta.setDisplayName(" ");
 	 	empty.setItemMeta(emptymeta);
 		
 	 	inventory.setItem(0,empty);
 		inventory.setItem(1,empty);
 		inventory.setItem(2,empty);
 		inventory.setItem(4,portalgun);
 		inventory.setItem(3,empty);
 		inventory.setItem(5,empty);
 		inventory.setItem(6,empty);
 		inventory.setItem(7,empty);
 		inventory.setItem(8,empty);
 		
 		inventory.setItem(9,empty);
 		inventory.setItem(10,quests);
 		inventory.setItem(11,empty);
 		inventory.setItem(12,empty);
 		inventory.setItem(13,empty);
 		inventory.setItem(14,empty);
 		inventory.setItem(15,empty);
 		inventory.setItem(16,Music);
 		inventory.setItem(17,empty);
 		
 		inventory.setItem(18,empty);
 		inventory.setItem(19,empty);
 		inventory.setItem(20,empty);
 		inventory.setItem(21,Games);
 		inventory.setItem(22,empty);
 		inventory.setItem(23,TGames);
 		inventory.setItem(24,empty);
 		inventory.setItem(25,empty);
 		inventory.setItem(26,empty);
 		
 		inventory.setItem(27,ench);
 		inventory.setItem(28,empty);
 		inventory.setItem(29,empty);
 		inventory.setItem(30,empty);
 		inventory.setItem(31,realstore);
 		inventory.setItem(32,empty);
 		inventory.setItem(33,empty);
 		inventory.setItem(34,empty);
 		inventory.setItem(35,rebook);
 		
 		inventory.setItem(36,Gadget);
 		inventory.setItem(37,empty);
 		inventory.setItem(38,empty);
 		inventory.setItem(39,empty);
 		inventory.setItem(40,empty);
 		inventory.setItem(41,empty);
 		inventory.setItem(42,empty);
 		inventory.setItem(43,empty);
 		inventory.setItem(44,bank);
 		
 		inventory.setItem(45,credits);
 		inventory.setItem(46,crafting); 
 		inventory.setItem(47,empty);
 		inventory.setItem(48,empty);
 		inventory.setItem(49,settings);
 		inventory.setItem(50,empty); 		
 		inventory.setItem(51,ec); 		
 		inventory.setItem(52,party); 		
 		inventory.setItem(53,friends);
 			
 		player.openInventory(inventory);
		return inventory;
 	}
	@EventHandler
 	public void HandelHandyOpener(PlayerInteractEvent event) {
 		if(event.getItem().getType() != Material.CARROT_STICK) return;
 		if(event.getAction() ==Action.RIGHT_CLICK_AIR || event.getAction() ==Action.RIGHT_CLICK_BLOCK)
 			OpenGUI(event.getPlayer());
	}

 	@EventHandler
 	public void HandelHandyGUIclick(InventoryClickEvent event) {
 		if(!(event.getWhoClicked()instanceof Player)) return;
 		Player player = (Player)event.getWhoClicked();
 		if(event.getClickedInventory().getTitle().equalsIgnoreCase(Handy)) {
 			event.setCancelled(true);
 			switch(event.getSlot()) {
 			
 		
 			
 	case 21:
 		GamesInv.OpenGUIGames(player);
 		break;
 	case 51: 
 		player.openInventory(player.getEnderChest());
		break;
 	case 4:
 		PortalGunInv.OpenPortalGunInv(player);
		break;
 	case 31:
	 	Bukkit.dispatchCommand(player,"Realshop");
 		break;
 	case 45:
 		player.sendMessage(RealMain.prefix + " Credits:");
 		break;
 	case 53:
 		Bukkit.dispatchCommand(player, "friend");
 		player.sendMessage(RealMain.prefix + " Friend Menu");
 		break;
 	case 52:
 		Bukkit.dispatchCommand(player, "party");
 		player.sendMessage(RealMain.prefix + " Party Menu");
 		break;
 	case 44:
 		player.sendMessage(RealMain.prefix + " Soon");
 	 	player.openInventory(BankInv.OpenBankInv(player));
 		break;
 	case 46:
 		CraftingApp.CraftingAppOpener(player);
 		break;
 	case 49: 
 		HandySettings.OpenHandySettingsInv(player);
 		
 		break;
 	case 36:
 		player.sendMessage(RealMain.prefix + "Gadgets");
 		Bukkit.dispatchCommand(player, "gmenu main");
 		break;
 	case 27:
 		player.sendMessage(RealMain.prefix + "Rewards");
 		Bukkit.dispatchCommand(player, "alonsolevel rewards");
 		break;
 	case 16:
 		MusicInv.OpenBankInv(player);
 		break;
 		
 	case 23:
 		Bukkit.dispatchCommand(player, "Gamebox");
 		break;
	default:
		break;
 			}
 		}
 	}
 }
 



 	
 	
 	
 	
 	
 	