package com.opalisplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.block.*;

public class spawn implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player) {
            Player player = (Player) commandSender;

            Location spawn = new Location(player.getWorld(), 0.5, 33, 0.5);
            player.teleport(spawn);
            player.sendMessage(ChatColor.AQUA + "Opalis " + ChatColor.WHITE + ">> " + ChatColor.YELLOW + "Vous avez été téléportés au spawn !");
            return true;

        }

        return false;
    }
}
