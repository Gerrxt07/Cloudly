package de.cloudly;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main plugin class for Cloudly
 * Compatible with Paper 1.21.1+ and Java 21+
 */
public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Cloudly plugin has been enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Cloudly plugin has been disabled!");
    }
}