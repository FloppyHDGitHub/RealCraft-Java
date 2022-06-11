
package lu.realcraft.realplugin.Permissions.Listener;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.bukkit.entity.Player;


import lu.realcraft.realplugin.main.RealMain;

public class PermissionManager {

	private Player player;
	private ArrayList<String> permissions;
	
	public PermissionManager(Player player) {
		this.player = player;
		permissions = getPermissions();
	}
	
	
	
	public void addPerm(String permission) {
		permissions.add(permission);
		updateperm();
	}
	
	public void removePerm(String permission) {
		permissions.remove(permission);
		updateperm();
	}
	
	public boolean hasPerm(String permission) {
		return permissions.contains(permission);
	}
	
	
	
	public void updateperm() {
		ArrayList<String> old = getPermissions();
		ArrayList<String> delete = new ArrayList<>();
		ArrayList<String> add = new ArrayList<>();
		
		
		old.forEach(s -> {
			if (!permissions.contains(s)) {
				delete.add(s);
			}
		});
		permissions.forEach(s -> {
			if (!old.contains(s)) {
				add.add(s);
			}
		});
		add.forEach(s -> {
			RealMain.getMySQL().update("INSERT INTO player_permissions(ID , UUID , PERMISSIONS) VALUES (" + getNextID("player_permissions") + ", '" + player.getUniqueId().toString() + "' , '" + s + "' );");
			
		});
		delete.forEach(s -> {
			RealMain.getMySQL().update("DELETE FROM player_permissions WHERE UUID='" + player.getUniqueId().toString() + "'AND PERMISSIONS= '" + s + "';");
		});
	}
	
	
	private ArrayList<String> getPermissions(){
		ArrayList<String> perm = new ArrayList<>();
		ResultSet r = RealMain.getMySQL().query("SELECT * FROM player_permissions WHERE UUID= '" + player.getUniqueId().toString() + "';");
		try {
			while (r.next()) {
				perm.add(r.getString("PERMISSIONS"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return perm;
	}
	
	public int getNextID(String db) {
		ResultSet rs = RealMain.getMySQL().query("SELECT * FROM " + db + ";");
		int i = 0;
		try {
			while (rs.next()) {
				if (rs.getInt("ID") > i ) {
					i = rs.getInt("ID");
				}
			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}
		return i+1;
	}
	
	public ArrayList<String> getPermisions(){
		return permissions;
		
	}
}










