package cloud.alb.home.Schiimi_.BedWars.EventListener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

@SuppressWarnings("deprecation")
public class ChatEventListener implements Listener{

	@EventHandler
	public void onChat(PlayerChatEvent e) {
		Player p = e.getPlayer();
		e.setFormat("§l" + p.getDisplayName() + "  §r: " + e.getMessage());
	}
	
}
