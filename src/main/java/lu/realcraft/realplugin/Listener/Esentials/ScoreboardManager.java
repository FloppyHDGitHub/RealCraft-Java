package lu.realcraft.realplugin.Listener.Esentials;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

import lu.realcraft.realplugin.Econemy.Econemy;
import lu.realcraft.realplugin.Permissions.Listener.PermissionsPrefix;
import me.clip.placeholderapi.PlaceholderAPI;

public class ScoreboardManager {

    	public static String ProgressBar;

    public void setBoard(Player player) {
        Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();
    		
            String ProgressBar = "%alonsolevels_progress_bar%";
            ProgressBar = PlaceholderAPI.setPlaceholders(player, ProgressBar);
            
        Objective objective = board.registerNewObjective("123", "dummy");

        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective.setDisplayName("      §0[§3RealCraft§0]      ");

        objective.getScore("§2" + PermissionsPrefix.RealPexPrefix).setScore(12);
        objective.getScore("§c").setScore(11);
        objective.getScore("§3").setScore(10);
        objective.getScore("§5").setScore(9);
        objective.getScore("    §a  " + Econemy.getmoney(player.getUniqueId()) + Econemy.getEcoSymbol()).setScore(8);
        objective.getScore("§6").setScore(7);
        objective.getScore("§7").setScore(6);
        objective.getScore("§f").setScore(5);
        objective.getScore("§e").setScore(4);
        objective.getScore("§d").setScore(3);
        objective.getScore("§b").setScore(2);
        objective.getScore("§0["+ ProgressBar + "§0]").setScore(1);
        objective.getScore("§8").setScore(0);
        
        
        player.setScoreboard(board);
        
        
        
        
        
        
        
        
        
        
        
        
    }

    public void updateBoard(Player player) {
       setBoard(player);
 
    
    
    }
}