package com.opalisplugin.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class feed implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player) {

            Player player = (Player) commandSender;

            player.setFoodLevel(20);
            player.setSaturation(20);
            player.sendMessage(ChatColor.GREEN + "FEED > " + ChatColor.WHITE + "Vous avez été rassasié");

            return true;
        }


        return false;
    }
}
