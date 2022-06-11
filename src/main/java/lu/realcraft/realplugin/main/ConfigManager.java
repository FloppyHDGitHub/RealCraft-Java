package lu.realcraft.realplugin.main;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;


public class ConfigManager {

	private RealMain plugin = RealMain.getPlugin(RealMain.class);
		
	public FileConfiguration colorscfg;
	public File colorsfile;
	public FileConfiguration Econemycfg;
	public File Econemyfile;
	public FileConfiguration chatformatcfg;
	public File chatformatfile;
	public FileConfiguration Taskscfg;
	public File tasksfile;
	public FileConfiguration ServerSettingscfg;
	public File ServerSettingsfile;
	public FileConfiguration Langcfg;
	public File Langfile;
	
	
	
	
	
	public void setup() {
		if(!plugin.getDataFolder().exists()) {
			plugin.getDataFolder().mkdir();	
		}
		colorsfile = new File(plugin.getDataFolder(),"Colors.yml");
		if(!colorsfile.exists()) {
			try {
				colorsfile.createNewFile();
			}catch (IOException e) {
				Bukkit.getServer().getConsoleSender().sendMessage("Could not create the colors.yml file");
			}
		}
		
		colorscfg = YamlConfiguration.loadConfiguration(colorsfile);
	}
	
	public FileConfiguration getcolors() {
		return colorscfg;
	}
	
	public void savecolors() {
		try {
			colorscfg.save(colorsfile);
		}catch (IOException e) {
			Bukkit.getServer().getConsoleSender().sendMessage("Could not save the colorrs.yml file");
		}
	}
	
	public void reloadcolors() {
		colorscfg = YamlConfiguration.loadConfiguration(colorsfile);
	}
	
	
	
	
	
	public void setupchat() {
		if(!plugin.getDataFolder().exists()) {
			plugin.getDataFolder().mkdir();	
		}
		chatformatfile = new File(plugin.getDataFolder(),"Chatformat.yml");
		if(!chatformatfile.exists()) {
			try {
				chatformatfile.createNewFile();
			}catch (IOException e) {
				Bukkit.getServer().getConsoleSender().sendMessage("Could not create the Chatformat.yml file");
			}
		}
		
		chatformatcfg = YamlConfiguration.loadConfiguration(chatformatfile);
	}
	public FileConfiguration getchat() {
		return chatformatcfg;
	}
	
	public void savechat() {
		try {
			chatformatcfg.save(chatformatfile);
		}catch (IOException e) {
			Bukkit.getServer().getConsoleSender().sendMessage("Could not save the Chatformat.yml file");
		}
	}
	
	public void reloadchat() {
		chatformatcfg = YamlConfiguration.loadConfiguration(chatformatfile);
	}
	
	
	
	
	
	public void setupEconemy() {
		if(!plugin.getDataFolder().exists()) {
			plugin.getDataFolder().mkdir();	
		}
		Econemyfile = new File(plugin.getDataFolder(),"Economy.yml");
		if(!Econemyfile.exists()) {
			try {
				Econemyfile.createNewFile();
			}catch (IOException e) {
				Bukkit.getServer().getConsoleSender().sendMessage("Could not create the Economy.yml file");
			}
		}
		
		Econemycfg = YamlConfiguration.loadConfiguration(Econemyfile);
	}
	public FileConfiguration getEco() {
		return Econemycfg;
	}
	
	public void saveEco() {
		try {
			Econemycfg.save(Econemyfile);
		}catch (IOException e) {
			Bukkit.getServer().getConsoleSender().sendMessage("Could not save the Economy.yml file");
		}
	}

	public void reloadEco() {
		Econemycfg = YamlConfiguration.loadConfiguration(Econemyfile);
	}
	
	
	
	
	
	
	
	public void setuptaskconf() {
		if(!plugin.getDataFolder().exists()) {
			plugin.getDataFolder().mkdir();	
		}
		tasksfile = new File(plugin.getDataFolder(),"Tasks.yml");
		if(!tasksfile.exists()) {
			try {
				tasksfile.createNewFile();
			}catch (IOException e) {
				Bukkit.getServer().getConsoleSender().sendMessage("Could not create the Tasks.yml file");
			}
		}

		Taskscfg = YamlConfiguration.loadConfiguration(tasksfile);
	}
	public FileConfiguration gettaskconf() {
		return Taskscfg;
	}
	
	public void savetaskconf() {
		try {
			Taskscfg.save(tasksfile);
		}catch (IOException e) {
			Bukkit.getServer().getConsoleSender().sendMessage("Could not save the Tasks.yml file");
		}
	}
	
	public void reloadtaskconf() {
		Taskscfg = YamlConfiguration.loadConfiguration(tasksfile);
	}
	
	
	
	
	
	
	public void setupServerSettingsconf() {
		if(!plugin.getDataFolder().exists()) {
			plugin.getDataFolder().mkdir();	
		}
		ServerSettingsfile = new File(plugin.getDataFolder(),"ServerSettings.yml");
		if(!ServerSettingsfile.exists()) {
			try {
				ServerSettingsfile.createNewFile();
			}catch (IOException e) {
				Bukkit.getServer().getConsoleSender().sendMessage("Could not create the ServerSettings.yml file");
			}
		}

		ServerSettingscfg = YamlConfiguration.loadConfiguration(ServerSettingsfile);
	}
	public FileConfiguration getServerSettingsconf() {
		return ServerSettingscfg;
	}
	
	public void saveServerSettingsconf() {
		try {
			ServerSettingscfg.save(ServerSettingsfile);
		}catch (IOException e) {
			Bukkit.getServer().getConsoleSender().sendMessage("Could not save the ServerSettings.yml file");
		}
	}
	
	public void reloadServerSettingsconf() {
		ServerSettingscfg = YamlConfiguration.loadConfiguration(ServerSettingsfile);
	}

	
	//LanguageConfig
	
	public void setupLangconf() {
		if(!plugin.getDataFolder().exists()) {
			plugin.getDataFolder().mkdir();	
		}
		Langfile = new File(plugin.getDataFolder(),"Lang.yml");
		if(!Langfile.exists()) {
			try {
				Langfile.createNewFile();
			}catch (IOException e) {
				Bukkit.getServer().getConsoleSender().sendMessage("Could not create the Lang.yml file");
			}
		}

		Langcfg = YamlConfiguration.loadConfiguration(Langfile);
	}
	public FileConfiguration getLangconf() {
		return Langcfg;
	}
	
	public void saveLangconf() {
		try {
			Langcfg.save(Langfile);
		}catch (IOException e) {
			Bukkit.getServer().getConsoleSender().sendMessage("Could not save the Lang.yml file");
		}
	}
	
	public void reloadLangconf() {
		Langcfg = YamlConfiguration.loadConfiguration(Langfile);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
