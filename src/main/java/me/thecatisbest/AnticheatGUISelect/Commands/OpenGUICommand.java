package me.thecatisbest.AnticheatGUISelect.Commands;

import me.thecatisbest.AnticheatGUISelect.Menus.ACSelect;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OpenGUICommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command!");
            return true;
        }

        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("ac")) {
            ACSelect screen = new ACSelect();
            player.openInventory(screen.getInventory());
            player.sendMessage(ChatColor.AQUA + "Please make a selection!");
        }
        return true;
    }
}