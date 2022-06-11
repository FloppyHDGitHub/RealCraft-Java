package lu.realcraft.realplugin.Listener.Esentials;

import org.bukkit.Bukkit;
import org.bukkit.Difficulty;

public class WorldSettinghs {
    public void prepareMaps() {
        Bukkit.getWorlds().forEach(current -> {
            current.setTime(6000L);
            current.setPVP(true);
            current.setDifficulty(Difficulty.PEACEFUL);
            current.setGameRuleValue("doMobSpawning", "false");
            current.setGameRuleValue("doDaylightCycle", "false");
            current.setGameRuleValue("doWeatheCycle", "false");

            if(current.isThundering())
                current.setThundering(false);

            

        });
    }
}
