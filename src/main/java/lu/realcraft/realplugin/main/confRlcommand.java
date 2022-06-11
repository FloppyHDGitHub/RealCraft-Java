package lu.realcraft.realplugin.main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class confRlcommand implements CommandExecutor{
	private ConfigManager cfgm;
	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
		if(sender.hasPermission("RealCraft.Server.ADMIN")) {
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
		return true;
	}

	
}
