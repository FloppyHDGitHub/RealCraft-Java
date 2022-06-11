package lu.realcraft.realplugin.Econemy;

import lu.realcraft.realplugin.main.RealMain;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.UUID;

public class Econemy {

	public static int getmoney(UUID p) {
		FileConfiguration Moneylist = RealMain.getPlugin().getEconemycfgm();
		
		
		int money = Moneylist.getInt("Economy " + p.toString());
		
		return money;
		
	}
	
	public static void addmoney(UUID p , int amount) {
		
		FileConfiguration Moneylist = RealMain.getPlugin().getEconemycfgm();
		
		
		int money = Moneylist.getInt("Economy " + p.toString());
		money = money + amount;
				
		Moneylist.set("Economy " + p.toString(), money);		
		RealMain.getPlugin().saveEconemycfgm();
	}
	
	public static void removemoney(UUID p , int amount) {
		
		FileConfiguration Moneylist = RealMain.getPlugin().getEconemycfgm();
		
		
		int money = Moneylist.getInt("Economy " + p.toString());
		money = money - amount;
				
		Moneylist.set("Economy " + p.toString(), money);		
		RealMain.getPlugin().saveEconemycfgm();
	}
	
	public static void setmoney(UUID p , int amount) {
		
		FileConfiguration Moneylist = RealMain.getPlugin().getEconemycfgm();
		
		
		int money = Moneylist.getInt("Economy " + p.toString());
		money = amount;
				
		Moneylist.set("Economy " + p.toString(), money);		
		RealMain.getPlugin().saveEconemycfgm();
	}

	public static String getEcoSymbol() {
		
		FileConfiguration config = RealMain.getPlugin().getServerSettingscfgm();
		
		String EcoSy = config.getString("EcoSymbol --> ");

		return EcoSy;
		
	}
	public static void setEcoSy(String string) {
		
		FileConfiguration config = RealMain.getPlugin().getServerSettingscfgm();
		
		String EcoSy = config.getString("EcoSymbol --> ");
		EcoSy = string;
		
		config.set("EcoSymbol --> ", EcoSy);		
		RealMain.getPlugin().saveServerSettingscfgm();
	}
	
}
