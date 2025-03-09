package com.eofitg.worldinit;

import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldLoadEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Map;

public final class World_Init extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Save default config if it doesn't exist
        saveDefaultConfig();
        // Register the event listener
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onWorldLoad(WorldLoadEvent event) {
        World world = event.getWorld();

        // Get the game rules configuration from the config file
        Map<String, Object> gamerules = getConfig().getConfigurationSection("gamerules").getValues(false);

        // Apply game rules to the world
        applyGamerulesToWorld(world, gamerules);
    }

    private void applyGamerulesToWorld(World world, Map<String, Object> gamerules) {
        for (Map.Entry<String, Object> ruleEntry : gamerules.entrySet()) {
            String ruleName = ruleEntry.getKey();
            String value = ruleEntry.getValue().toString();

            // Set the gamerule
            world.setGameRuleValue(ruleName, value);
        }
    }

}
