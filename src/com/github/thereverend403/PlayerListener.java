package com.github.thereverend403;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerListener extends JavaPlugin implements Listener {

	public static String user;
	public chatsounds plugin;
	boolean b;
	static float pitch;
	static float volume;
	public PlayerListener(chatsounds instance) {
		plugin = instance;
	}

	@EventHandler
	public void onChat(AsyncPlayerChatEvent event) {
		// There has to be a more efficient way to do this...
		// Only triggering if the player has permission, but still checking on
		// every chat event...
		Player player = event.getPlayer();
		boolean b = plugin.getConfig().getBoolean("chatsounds.global");
		if (player.hasPermission("chatsounds.allow")) {
			String message = event.getMessage();
			if (message.contains("meow")| (message.contains("purr") || (message.contains("woof") || (message.contains("grrr") || (message.contains("hiss") || (message.contains("moo") || (message.contains("cluck") || (message.contains("slender") || (message.contains("oink") || (message.contains("baaa"))))))))))) {
				
				if(message.contains("meow")){
					Sound s = Sound.CAT_MEOW;
					if(b){
						for(Player p : Bukkit.getOnlinePlayers()){
							playSound(p, s);
						}
					}else{
						playSound(player, s);
					}
				}
				if(message.contains("purr")){
					Sound s = Sound.CAT_PURR;
					if(b){
						for(Player p : Bukkit.getOnlinePlayers()){
							playSound(p, s);
						}
					}else{
						playSound(player, s);
					}
				}
				if(message.contains("woof")){
					Sound s = Sound.WOLF_BARK;
					if(b){
						for(Player p : Bukkit.getOnlinePlayers()){
							playSound(p, s);
						}
					}else{
						playSound(player, s);
					}
				}
				if(message.contains("grrr")){
					Sound s = Sound.WOLF_GROWL;
					if(b){
						for(Player p : Bukkit.getOnlinePlayers()){
							playSound(p, s);
						}
					}else{
						playSound(player, s);
					}
				}
				if(message.contains("hiss")){
					Sound s = Sound.CREEPER_HISS;
					if(b){
						for(Player p : Bukkit.getOnlinePlayers()){
							playSound(p, s);
						}
					}else{
						playSound(player, s);
					}
				}
				if(message.contains("moo")){
					Sound s = Sound.COW_HURT;
					if(b){
						for(Player p : Bukkit.getOnlinePlayers()){
							playSound(p, s);
						}
					}else{
						playSound(player, s);
					}
				}
				if(message.contains("cluck")){
					Sound s = Sound.CHICKEN_IDLE;
					if(b){
						for(Player p : Bukkit.getOnlinePlayers()){
							playSound(p, s);
						}
					}else{
						playSound(player, s);
					}
				}
				if(message.contains("slender")){
					Sound s = Sound.ENDERMAN_STARE;
					if(b){
						for(Player p : Bukkit.getOnlinePlayers()){
							playSound(p, s);
						}
					}else{
						playSound(player, s);
					}
				}
				if(message.contains("oink")){
					Sound s = Sound.PIG_IDLE;
					if(b){
						for(Player p : Bukkit.getOnlinePlayers()){
							playSound(p, s);
						}
					}else{
						playSound(player, s);
					}
				}
				if(message.contains("baaa")){
					Sound s = Sound.SHEEP_IDLE;
					if(b){
						for(Player p : Bukkit.getOnlinePlayers()){
							playSound(p, s);
						}
					}else{
						playSound(player, s);
					}
				}
			}
		}
	}
	public static void playSound(Player p, Sound s){
		p.playSound(p.getLocation(), s, volume,pitch);
	}
}
