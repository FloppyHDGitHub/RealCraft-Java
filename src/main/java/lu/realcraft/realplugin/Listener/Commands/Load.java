package lu.realcraft.realplugin.Listener.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.scheduler.BukkitRunnable;

import lu.realcraft.realplugin.main.RealMain;

public class Load implements CommandExecutor {
	
	private int time;	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		time = 15;
		
		BukkitRunnable runnable = new BukkitRunnable() {
			
			@Override
			public void run() {
				
				switch (time) {
				case 1:
					Bukkit.getOnlinePlayers().forEach(player -> {
						player.kickPlayer("Reload");
					});
					break;
				}
				
				
				
				
				
				Bukkit.getOnlinePlayers().forEach(player -> {
					Bukkit.dispatchCommand(player, "title @e title §5RELOAD");
					
				});
				
				
				
				
				if (time == 0) {
					Bukkit.dispatchCommand(sender, "reload");
					cancel();
					return;
				}
				time--;
			}
		};
		runnable.runTaskTimer(RealMain.getPlugin(), 0, 20);
		
		return true;
	}

	
	
	
}
