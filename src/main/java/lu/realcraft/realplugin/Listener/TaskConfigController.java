package lu.realcraft.realplugin.Listener;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import lu.realcraft.realplugin.main.RealMain;


public class TaskConfigController {


	public static String gettask(Player p, String i) {
		

			FileConfiguration taskConf = RealMain.getPlugin().gettaskcfgm();
			
			
			String task = taskConf.getString("Task " + i + p.getName());
			
			
			return task;
			
		}
		
		
		public static void settask(Player p , String args,String t) {
			
			
			FileConfiguration taskConf = RealMain.getPlugin().gettaskcfgm();
			
			
			String task = taskConf.getString("Task " + args + p.getName());
			task = t;
					
			taskConf.set("Task " + args + p.getName(), task);		
			RealMain.getPlugin().savetaskcfgm();
		}



		
	}

