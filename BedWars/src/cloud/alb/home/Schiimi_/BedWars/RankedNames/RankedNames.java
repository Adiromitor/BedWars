package cloud.alb.home.Schiimi_.BedWars.RankedNames;

import org.bukkit.entity.Player;

public class RankedNames {

	public static void setRankedName(Player p) {
		switch(getRank(p)) {
		case ADMIN:
			p.setCustomName("§4Admin | " + p.getName());
			break;
		case DEVELOPER:
			p.setCustomName("§bDev | " + p.getName());
			break;
		case MODERATOR:
			p.setCustomName("§cMod | " + p.getName());
			break;
		case SUPPORTER:
			p.setCustomName("§9Sup | "+ p.getName());
			break;
		case PREMIUM:
			p.setCustomName("§6Prem |" +p.getName());
			break;
		default:
			p.setCustomName("§7" +p.getName());
			break;
		}
	}
	public static String getPrefix(Player p) {
		switch(getRank(p)) {
		case ADMIN:
			return "§4Admin | ";
		case DEVELOPER:
			return "§bDev | ";
		case MODERATOR:
			return "§cMod | ";
		case SUPPORTER:
			return "§9Sup | ";
		case PREMIUM:
			return "§6Prem | ";
		default:
			return "§7";
		}
	}
	
	public static Rank getRank(Player p) {
		if(p.hasPermission("group.ADMIN")) {
			return Rank.ADMIN;
		}if(p.hasPermission("group.DEVELOPER")) {
			return Rank.DEVELOPER;
		}if(p.hasPermission("group.MODERATOR")) {
			return Rank.MODERATOR;
		}if(p.hasPermission("group.SUPPORTER")) {
			return Rank.SUPPORTER;
		}if(p.hasPermission("group.SUPPORTER")) {
			return Rank.SUPPORTER;
		}if(p.hasPermission("group.PREMIUM")) {
			return Rank.PREMIUM;
		}else {
			return Rank.USER;
		}
	}
	
	public static String getAfterFix(Player p) {
		
		switch(getRank(p)) {
		case ADMIN:
			return " §4[Admin]";
		case DEVELOPER:
			return " §b[Dev]";
		case MODERATOR:
			return " §c[Mod]";
		case SUPPORTER:
			return " §b[Sup]";
		case PREMIUM:
			return " §6[+]";
		default:
			return "";
		}
		
	}
	
}
