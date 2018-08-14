package cloud.alb.home.Schiimi_.BedWars.EventListener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import cloud.alb.home.Schiimi_.BedWars.RankedNames.RankedNames;

public class JoinEventListener implements Listener{
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		RankedNames.setRankedName(p);
		p.setDisplayName("§7" + p.getName() + RankedNames.getAfterFix(p));
		p.setPlayerListName("§7" + p.getName() + RankedNames.getAfterFix(p) + "§7");
		e.setJoinMessage("§6+ | " + p.getCustomName());
	}

}
