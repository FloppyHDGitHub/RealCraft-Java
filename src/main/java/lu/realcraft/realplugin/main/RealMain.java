package lu.realcraft.realplugin.main;


import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import lu.realcraft.realplugin.Econemy.Econemy;
import lu.realcraft.realplugin.Econemy.EconemyCommandF;
import lu.realcraft.realplugin.Econemy.EconomyCommandPay;
import lu.realcraft.realplugin.Econemy.EconomyCommandset;
import lu.realcraft.realplugin.Language.Listener.LanguageConfController;
import lu.realcraft.realplugin.Listener.BedWarsJoinMenu.BWModeInv;
import lu.realcraft.realplugin.Listener.BedWarsJoinMenu.BWSoloMapSelector;
import lu.realcraft.realplugin.Listener.BedWarsJoinMenu.OpeningCommand;
import lu.realcraft.realplugin.Listener.Commands.*;
import lu.realcraft.realplugin.Listener.Esentials.*;
import lu.realcraft.realplugin.Listener.Handy;
import lu.realcraft.realplugin.Listener.HandyApps.*;
import lu.realcraft.realplugin.Listener.TaskConfigController;
import lu.realcraft.realplugin.Listener.Taskcommands;
import lu.realcraft.realplugin.Permissions.Listener.PermissionManager;
import lu.realcraft.realplugin.Permissions.Listener.PermissionsEvents;
import lu.realcraft.realplugin.Permissions.Listener.PermissionsPrefix;
import lu.realcraft.realplugin.Permissions.Listener.perrmissionsCommands;
import net.md_5.bungee.api.ChatColor;
import org.apache.commons.codec.binary.Base64;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.ObjectInputFilter.Config;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.UUID;


public class RealMain extends JavaPlugin implements Listener {
	
	
	public static String prefix = "§0[§3Realcraft§0] §7";
	private static RealMain plugin;
	private static Config config; 
	private static MySQL mySQL;
	public static ItemStack SpawnerX; 
	private ConfigManager cfgm;
	
	
	
    public ScoreboardManager getScoreboardManager() {
        return new ScoreboardManager();
    }

	@Override 
	public void onEnable() {

		plugin = this;
		mySQL = new MySQL("localhost", "realcraft", "root", "", 3306);
		
		Bukkit.getPluginManager().registerEvents(new PermissionsEvents(), plugin);

		PluginManager pluginManager = Bukkit.getPluginManager();
		pluginManager.registerEvents(new Handy(), this);

		PluginManager pluginManager1 = Bukkit.getPluginManager();
		pluginManager1.registerEvents(new Join(), this);
		
		PluginManager pluginManager2 = Bukkit.getPluginManager();
		pluginManager2.registerEvents(new BankInv(), this);
		
		PluginManager pluginManager3 = Bukkit.getPluginManager();
		pluginManager3.registerEvents(new PortalGunInv(), this);
		
		PluginManager pluginManager4 = Bukkit.getPluginManager();
		pluginManager4.registerEvents(new HandySettings(), this);
		
		PluginManager pluginManager5 = Bukkit.getPluginManager();
		pluginManager5.registerEvents(new AdminInv(), this);
		
		PluginManager pluginManager6 = Bukkit.getPluginManager();
		pluginManager6.registerEvents(new BWModeInv(), this);
		
		PluginManager pluginManager7 = Bukkit.getPluginManager();
		pluginManager7.registerEvents(new BWSoloMapSelector(), this);
		
		PluginManager pluginManager8 = Bukkit.getPluginManager();
		pluginManager8.registerEvents(new RealChatScan(), this);
		
		PluginManager pluginManager11 = Bukkit.getPluginManager();
		pluginManager11.registerEvents(new MusicInv(), this);
		
		PluginManager pluginManager12 = Bukkit.getPluginManager();
		pluginManager12.registerEvents(new GamesInv(), this);
		
		PluginManager pluginManager13 = Bukkit.getPluginManager();
		pluginManager13.registerEvents(new GamesInv(), this);
		
		PluginManager pluginManager14 = Bukkit.getPluginManager();
		pluginManager14.registerEvents(new MultiverseInvListener(), this);
		
		PluginManager pluginManager15 = Bukkit.getPluginManager();
		pluginManager15.registerEvents(new PermissionsPrefix(), this);

		PluginManager pluginManager16 = Bukkit.getPluginManager();
		pluginManager16.registerEvents( new getCustoHead(), this);
		
		getCommand("ClearRealCraftChat").setExecutor(new ClearRealCraftChat());
		getCommand("Handy").setExecutor(new HandyOpenerCommand());
		getCommand("BankInv").setExecutor(new BankInvOpenerCommand());
		getCommand("HandySettings").setExecutor(new HandySettingsInvOpenerCommand());
		getCommand("AdminInv").setExecutor(new AdminInvCommand());
		getCommand("Fly").setExecutor(new FlyCommand());
		getCommand("ClearLag").setExecutor(new ClearLag());
		getCommand("RealBedwarsMenuOpener").setExecutor(new OpeningCommand());
		getCommand("lobby").setExecutor(new LobbyCommandlobby());
		getCommand("l").setExecutor(new LobbyCommandl());
		getCommand("hub").setExecutor(new LobbyCommandhub());
		getCommand("load").setExecutor(new Load());
		getCommand("BackHandy").setExecutor(new HandyHomeCommand());
		getCommand("GiveMyPhoneBack").setExecutor(new GiveHandyCommand());
		getCommand("Realtask").setExecutor(new Taskcommands());
		getCommand("RealPerm").setExecutor(new perrmissionsCommands());
		getCommand("mvinv").setExecutor(new MultiverseInvCommand());
		getCommand("money").setExecutor(new EconemyCommandF());
		getCommand("pay").setExecutor(new EconomyCommandPay());
		getCommand("eco").setExecutor(new EconomyCommandset());
		getCommand("rlRealcraftconfigs").setExecutor(new confRlcommand());
		getCommand("Getcustomhead").setExecutor(new getCustoHead());
		
		
		getServer().getConsoleSender().sendMessage(org.bukkit.ChatColor.AQUA + "RealCraft"); 
		

		
		
		
		 
		

		
		
		
		//Recipes
		
		SpawnerX = new ItemStack(Material.MOB_SPAWNER);
		ItemMeta SpawnerXmeta = SpawnerX.getItemMeta();
		SpawnerXmeta.setDisplayName(ChatColor.DARK_PURPLE + "Spawner");
		SpawnerX.setItemMeta(SpawnerXmeta);
		
		
		ShapedRecipe SpawnerXrecipe = new ShapedRecipe(SpawnerX);
		SpawnerXrecipe.shape("AAA", "AAA","AAT");

		SpawnerXrecipe.setIngredient('T',Material.ACACIA_DOOR_ITEM);
		
		Bukkit.addRecipe(SpawnerXrecipe);

		loadConfigManager();
		loadConfig();	

		Econemy.setEcoSy(Econemy.getEcoSymbol());
		
		


		
		
		
		
		
		
		

		saveConfig();
	}

	 public static ItemStack getSkull(String url) {
         ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);

               if (url == null || url.isEmpty())
                   return skull;
               ItemMeta skullMeta = skull.getItemMeta();
               GameProfile profile = new GameProfile(UUID.randomUUID(), null);
               byte[] encodedData = Base64.encodeBase64(String.format("{textures:{SKIN:{url:\"%s\"}}}", "http://textures.minecraft.net/texture/" + url).getBytes());
               profile.getProperties().put("textures", new Property("textures", new String(encodedData)));
               Field profileField = null;
               try {
                   profileField = skullMeta.getClass().getDeclaredField("profile");
               } catch (NoSuchFieldException | SecurityException e) {
                   e.printStackTrace();
               }
               profileField.setAccessible(true);
               try {
                   profileField.set(skullMeta, profile);
               } catch (IllegalArgumentException | IllegalAccessException e) {
                   e.printStackTrace();
               }
               skull.setItemMeta(skullMeta);
               return skull;
       }




	
	
	
	public void loadConfigManager() {
		cfgm = new ConfigManager();
		cfgm.setup();
		cfgm.setupEconemy();
		cfgm.setupchat();
		cfgm.setuptaskconf();
		cfgm.setupServerSettingsconf();
		cfgm.setupLangconf();
		
		
		
		cfgm.savecolors();
		cfgm.saveEco();
		cfgm.savechat();
		cfgm.savetaskconf();
		cfgm.saveServerSettingsconf();
		cfgm.saveLangconf();
		
		
		
		cfgm.reloadcolors();
		cfgm.reloadEco();
		cfgm.reloadchat();
		cfgm.reloadtaskconf();
		cfgm.reloadServerSettingsconf();
		cfgm.reloadLangconf();
		
	}
	public FileConfiguration getcolorscfgm() {
		return cfgm.getcolors();
	}

	public void saveColorscfgm() {
		cfgm.savecolors();
	}
	
	
	
	
	public FileConfiguration getchatcfgm() {
		return cfgm.getchat();
	}

	public void savechatcfgm() {
		cfgm.savechat();
	}
	
	
	
	
	
	public FileConfiguration gettaskcfgm() {
		return cfgm.gettaskconf();
	}

	public void savetaskcfgm() {
		cfgm.savetaskconf();
	}
	

	
	
	public FileConfiguration getEconemycfgm() {
		return cfgm.getEco();
	}
	public void saveEconemycfgm() {
		cfgm.saveEco();
	}

	
	
	
	
	public FileConfiguration getServerSettingscfgm() {
		return cfgm.getServerSettingsconf();
	}
	public void saveServerSettingscfgm() {
		cfgm.saveServerSettingsconf();
	}
	

	public FileConfiguration getLangcfgm() {
		return cfgm.getLangconf();
	}
	public void saveLangcfgm() {
		cfgm.saveLangconf();
	}


	public String getVersion ()
	{
		String version;

		Class<?> serverClass = Bukkit.getServer ().getClass ();
		if (!serverClass.getSimpleName ().equals ("CraftServer"))
		{
			return null;
		}
		else
		{
			if (serverClass.getName ().equals ("org.bukkit.craftbukkit.CraftServer"))
			{
				version = "";
			}
			else
			{
				version = serverClass.getName ().substring ("org.bukkit.craftbukkit.".length ());
				version = version.substring (0, version.length () - "CraftServer.".length ());
			}
		}
		return "net.minecraft.server." + version + ".";
	}
	
	
	
	
	
	
	
	
	public static Config getconfig() {
		return config;
	}
	public static RealMain getPlugin() {
		return plugin;
	}

	public static MySQL getMySQL() {
		return mySQL;
		
	}
	
	
	public ArrayList<String> getPermissions(Player player) {

		
		return new PermissionManager(player).getPermisions();
		
	}
	public void loadConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
	
	@EventHandler
	public void PlayerJoinfirstTime(PlayerLoginEvent event) {
	Player p = event.getPlayer();
	if(!p.hasPlayedBefore()) {
		LanguageConfController.setLang(p, "US-us");
		TaskConfigController.settask(p, "1", " ");
		TaskConfigController.settask(p, "2", " ");
		TaskConfigController.settask(p, "3", " ");
		TaskConfigController.settask(p, "4", " ");
		TaskConfigController.settask(p, "5", " ");
		TaskConfigController.settask(p, "6", " ");
		TaskConfigController.settask(p, "7", " ");
		TaskConfigController.settask(p, "8", " ");
		TaskConfigController.settask(p, "9", " ");
		TaskConfigController.settask(p, "10", " ");
	}
	}
	
}






