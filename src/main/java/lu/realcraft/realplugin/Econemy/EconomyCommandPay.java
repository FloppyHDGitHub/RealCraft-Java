package lu.realcraft.realplugin.Econemy;



import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class EconomyCommandPay implements CommandExecutor {
	



		@Override
		public boolean onCommand(CommandSender sender, Command comand, String s, String[] string) {
			
			if(sender instanceof Player) {
				Player p = (Player) sender;
				if(string.length == 2)  {
					
					Player player = Bukkit.getPlayer(string[0]);
					if(player != null) {
						int amount;
						try {
							amount = Integer.parseInt(string[1]);
							
							
							
							
						}catch (NumberFormatException e) {
							sender.sendMessage("§4you wanna pay an amount from another universe!PLEASE type again but an corrct §4NUMBER!!!");
							return true;}
						if(amount < Econemy.getmoney(p.getUniqueId())) {
						
						Econemy.removemoney(p.getUniqueId(), Integer.parseInt(string[1]));
						Econemy.addmoney(player.getUniqueId(), Integer.parseInt(string[1]));
						
						p.sendMessage("§6You have payd §4"+ amount + "§6 of You F to " + player.getName() + " now you have only " + Econemy.getmoney(p.getUniqueId())+" F");
						player.sendMessage("§6I dont know why but, " + sender.getName() + " payd you §a" + amount + "§6 from his F Realy Nice now you have " + Econemy.getmoney(player.getUniqueId())+" F");
					}else {
						p.sendMessage("§4You Dont have Enaught F to pay you suggybabe ");
					}
					}
				}
			}
				
			return false;
		}
}
