package com.github.thereverend403;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class chatsounds extends JavaPlugin {
	@Override
	public void onEnable(){
		
		FileConfiguration config = this.getConfig();
		getLogger().info("ChatSounds has successfully enabled");
		getServer().getPluginManager().registerEvents(new PlayerListener(this), this);
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new PlayerListener(this), this);
		config = getConfig();
		config.addDefault("chatsounds.global", true);
		config.options().copyDefaults(true);
			saveConfig();
			}
	
	@Override
	public void onDisable(){
		//Do more things.
		getLogger().info("ChatSounds has successfully disabled");
	}
}