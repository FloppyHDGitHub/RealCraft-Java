package lu.realcraft.realplugin.Permissions.Listener;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import lu.realcraft.realplugin.main.RealMain;

public class ChatformatConfig {

public static int getchatformart(Player p) {
	

		FileConfiguration colorConf = RealMain.getPlugin().getcolorscfgm();
		
		
		int color = colorConf.getInt("color " + p.getName());
		
		return color;
		
	}
	
	
	public static void setchatformat(Player p , int number) {
		
		
		FileConfiguration colorConf = RealMain.getPlugin().getcolorscfgm();
		
		
		int color = colorConf.getInt("color " + p.getName());
		color = number;
				
		colorConf.set("color " + p.getName(), color);		
		RealMain.getPlugin().saveColorscfgm();
	}
	
}
