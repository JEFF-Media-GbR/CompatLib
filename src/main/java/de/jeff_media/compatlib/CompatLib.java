package de.jeff_media.compatlib;

import org.apache.commons.lang3.Validate;
import org.bukkit.plugin.java.JavaPlugin;

public class CompatLib extends JavaPlugin {

    @Override
    public void onEnable() {
        Validate.notNull("");
        try {
            Class.forName("org.bukkit.craftbukkit.libs.org.apache.commons.lang3.Validate");
            getLogger().info("Libraries loaded");
        } catch (ClassNotFoundException e) {
            getLogger().severe("Could not load libraries:");
            e.printStackTrace();
        }
    }
}
