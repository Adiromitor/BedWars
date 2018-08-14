package cloud.alb.home.Schiimi_.BedWars.EventListener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitEventListener implements Listener{

	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
		
		e.setQuitMessage("§6- | §7" + e.getPlayer().getDisplayName());
		
	}
	
}
