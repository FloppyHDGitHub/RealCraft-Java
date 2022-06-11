package lu.realcraft.realplugin.Listener.HandyApps;


import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import lu.realcraft.realplugin.main.RealMain;

public class colorsystemmethode {

public static int getcolor(Player p) {
	

		FileConfiguration colorConf = RealMain.getPlugin().getcolorscfgm();
		
		
		int color = colorConf.getInt("color " + p.getName());
		
		return color;
		
	}

public static int getHandyslot(Player p) {
	

	FileConfiguration colorConf = RealMain.getPlugin().getcolorscfgm();
	
	
	int slot = colorConf.getInt("HandySlot " + p.getName());
	
	return slot;
	
}
	
	
	public static void setcolor(Player p , int number) {
		
		
		FileConfiguration colorConf = RealMain.getPlugin().getcolorscfgm();
		
		
		int color = colorConf.getInt("color " + p.getName());
		color = number;
				
		colorConf.set("color " + p.getName(), color);		
		RealMain.getPlugin().saveColorscfgm();
	}
	
	public static void setHandyslot(Player p , int number) {
		
		
		FileConfiguration colorConf = RealMain.getPlugin().getcolorscfgm();
		
		
		int slot = colorConf.getInt("HandySlot " + p.getName());
		slot = number;
				
		colorConf.set("HandySlot " + p.getName(), slot);		
		RealMain.getPlugin().saveColorscfgm();
	}
	
	
	
	
}
