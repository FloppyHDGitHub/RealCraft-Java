package lu.realcraft.realplugin.Permissions.Listener;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissibleBase;

import lu.realcraft.realplugin.main.RealMain;


public class PermissionsBase extends PermissibleBase{

	private Player player;
	
	public PermissionsBase(Player player) {
		super(player);
		this.player = player;
	}
	
	@Override
	public boolean hasPermission(String inName) {
		
		ArrayList<String> permissions = RealMain.getPlugin().getPermissions(player);
		if(Arrays.asList("bukkit.broadcast.user", "bukkit.broadcast", "bukkit.command.version").contains(inName)) {
			return true;
		}
		if(permissions.contains("-" + inName)) {
			return false;
		}
		if (permissions.contains("*")) {
			return true;
		}
		
		
		return permissions.contains(inName);
		
	}
}
