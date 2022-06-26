package me.thecatisbest.AnticheatGUISelect;

import me.thecatisbest.AnticheatGUISelect.Commands.OpenGUICommand;
import me.thecatisbest.AnticheatGUISelect.Events.ACSelectEvents;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        PluginDescriptionFile pdf = this.getDescription();

        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&7[]=======&d[&bAnticheatSelectGUI&d]&7=======[]"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&7| &eInformation:"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&7| &eStatus: &aEnabled"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&7| &eVersion: &a" + pdf.getVersion()));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&7[]==================================[]"));

        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&d[&bAnticheatSelectGUI&d] &aSuccess Enabled plugin!"));

        getCommand("ac").setExecutor(new OpenGUICommand());
        getServer().getPluginManager().registerEvents(new ACSelectEvents(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        PluginDescriptionFile pdf = this.getDescription();

        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&7[]=======&d[&bAnticheatSelectGUI&d]&7=======[]"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&7| &eInformation:"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&7| &eStatus: &cDisabled"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&7| &eVersion: &a" + pdf.getVersion()));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&7[]==================================[]"));

        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&d[&bAnticheatSelectGUI&d] &cSuccess Disabled plugin!"));
    }
}
