package com.github.thereverend403;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerListener extends JavaPlugin implements Listener{
	
	public static String user;
	
    @SuppressWarnings("unused")
	private chatsounds plugin;

    public PlayerListener(chatsounds instance) {
            plugin = instance;
    }
     
        public void onEnable() {
            {
                PluginManager pm = getServer().getPluginManager();
                pm.registerEvents(this, this);
            }
        }
	 @EventHandler
     public void onChat(AsyncPlayerChatEvent event) {
		 //There has to be a more efficient way to do this...
		 //Only triggering if the player has permission, but still checking on every chat event...
     	Player player = event.getPlayer();
     	if(player.hasPermission("chatsounds.allow")) {
     		String message = event.getMessage();
    		if(message.contains(".meow") || (message.contains(".purr") || (message.contains(".woof") || (message.contains(".grrr") || (message.contains(".hiss") || (message.contains(".moo") || (message.contains(".cluck") || (message.contains(".slender") || (message.contains(".oink") || (message.contains(".baaa"))))))))))) {
    			float pitch = 1.0F;
     			float volume = 1.0F;
     			Player[] onlinePlayerList = Bukkit.getServer().getOnlinePlayers();
				for(Player p : onlinePlayerList){
					if(message.contains(".meow")){
             			Sound sound = Sound.CAT_MEOW;
             			p.playSound(p.getLocation(), sound, volume, pitch);
     				}
     				if(message.contains(".purr")){
             			Sound sound = Sound.CAT_PURR;
             			p.playSound(p.getLocation(), sound, volume, pitch);
     				}
     				if(message.contains(".woof")){
             			Sound sound = Sound.WOLF_BARK;
             			p.playSound(p.getLocation(), sound, volume, pitch);
     				}
     				if(message.contains(".grrr")){
             			Sound sound = Sound.WOLF_GROWL;
             			p.playSound(p.getLocation(), sound, volume, pitch);
     				}
     				if(message.contains(".hiss")){
             			Sound sound = Sound.CREEPER_HISS;
             			p.playSound(p.getLocation(), sound, volume, pitch);
     				}
     				if(message.contains(".moo")){
             			Sound sound = Sound.COW_HURT;
             			p.playSound(p.getLocation(), sound, volume, pitch);
     				}
     				if(message.contains(".cluck")){
             			Sound sound = Sound.CHICKEN_IDLE;
             			p.playSound(p.getLocation(), sound, volume, pitch);
     				}
     				if(message.contains(".slender")){
             			Sound sound = Sound.ENDERMAN_STARE;
             			p.playSound(p.getLocation(), sound, volume, pitch);
     				}
     				if(message.contains(".oink")){
             			Sound sound = Sound.PIG_IDLE;
             			p.playSound(p.getLocation(), sound, volume, pitch);
     				}
     				if(message.contains(".baaa")){
             			Sound sound = Sound.SHEEP_IDLE;
             			p.playSound(p.getLocation(), sound, volume, pitch);
     				}
				}
    		}
     	}
	 }
}
