package com.opalisplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class nick implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player) {
            Player player = (Player) commandSender;
            Player target = Bukkit.getServer().getPlayerExact(strings[0]);
            strings[0] = "";
            if(player.isOp()) {

                String delimiter = " ";

                StringBuilder sb = new StringBuilder();
                for (String str : strings)
                    sb.append(str).append(delimiter);
                String compiled_name = sb.substring(0, sb.length());

                player.setDisplayName(compiled_name);
                player.sendMessage("Le joueur " + target.getDisplayName() + " a été renommé " + compiled_name);

                return true;
            }
        }


        return false;
    }
}
