package lu.realcraft.realplugin.EffectTools;



import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;

public class EffectToolsVainminerPick {

	@EventHandler
	private void Vainminerpickuse(BlockBreakEvent e) {
		Player p = e.getPlayer();
		if(p.getItemInHand().equals(Material.GOLD_PICKAXE)) {
			if(p.getItemInHand().getItemMeta().getDisplayName().equals("VainMinerPick")) {

			}
		}
		
	}
	
}
