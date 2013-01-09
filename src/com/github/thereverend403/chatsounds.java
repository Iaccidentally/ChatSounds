package com.github.thereverend403;

import org.bukkit.plugin.java.JavaPlugin;

public class chatsounds extends JavaPlugin {
	
	@Override
	public void onEnable(){
		//Do things.
		getLogger().info("ChatSounds has successfully enabled");
		getServer().getPluginManager().registerEvents(new PlayerListener(this), this);
		}
	
	@Override
	public void onDisable(){
		//Do more things.
		getLogger().info("ChatSounds has successfully disabled");
	}
}