package lu.realcraft.realplugin.Permissions.Listener;

import lu.realcraft.realplugin.main.RealMain;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

import java.lang.reflect.Field;

public class PermissionsEvents implements Listener {

    @EventHandler
    public void onLogin(PlayerLoginEvent e) {

        try {
            Field f = Class.forName(RealMain.getPlugin().getVersion() + "entity.CraftHumanEntity").getDeclaredField("perm");
            f.setAccessible(true);
            f.set(e.getPlayer(), new PermissionsBase(e.getPlayer()));
            f.setAccessible(false);
        } catch (NoSuchFieldException | IllegalAccessException | ClassNotFoundException noSuchFieldException) {
            noSuchFieldException.printStackTrace();
        }

    }



}
