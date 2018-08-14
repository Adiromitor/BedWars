package cloud.alb.home.Schiimi_.BedWars;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import cloud.alb.home.Schiimi_.BedWars.EventListener.ChatEventListener;
import cloud.alb.home.Schiimi_.BedWars.EventListener.JoinEventListener;
import cloud.alb.home.Schiimi_.BedWars.EventListener.QuitEventListener;

public class BedWars extends JavaPlugin{

	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new JoinEventListener(), this);
		Bukkit.getPluginManager().registerEvents(new QuitEventListener(), this);
		Bukkit.getPluginManager().registerEvents(new ChatEventListener(), this);
		super.onEnable();
	}
	
	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		super.onDisable();
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		// TODO Auto-generated method stub
		return super.onCommand(sender, command, label, args);
	}
	
}
