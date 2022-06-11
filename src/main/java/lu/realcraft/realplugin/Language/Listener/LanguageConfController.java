package lu.realcraft.realplugin.Language.Listener;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import lu.realcraft.realplugin.main.RealMain;

public class LanguageConfController {


	public static String getLang(Player p) {
		

			FileConfiguration langConf = RealMain.getPlugin().getLangcfgm();
			
			
			String Lang = langConf.getConfigurationSection("Player").getString(p.getName());
			
			
			return Lang;
			
		}
		
		
		public static void setLang(Player p , String l) {
			
			
			FileConfiguration langConf = RealMain.getPlugin().getLangcfgm();
			
			
			String Lang = langConf.getConfigurationSection("Player").getString(p.getName());
			Lang = l;
					
			langConf.getConfigurationSection("Player").set(p.getName() , Lang);		
			RealMain.getPlugin().saveLangcfgm();
		}
}
