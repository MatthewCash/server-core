package com.matthewcash.network;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ServerCore extends JavaPlugin {
    private static ServerCore plugin;

    public static ServerCore getPlugin() {
        return plugin;
    }

    @Override
    public void onEnable() {
        plugin = this;

        saveResource("config.yml", false);

        Bukkit.getPluginManager().registerEvents(new ChatEvent(), this);

        if (getConfig().getBoolean("real_day_time.enable", false))
            RealDayTime.startTimer();

        getLogger().info("Enabled ServerCore!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Disabled ServerCore!");
    }
}
