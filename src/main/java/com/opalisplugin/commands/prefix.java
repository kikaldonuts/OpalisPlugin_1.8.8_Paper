package com.opalisplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class prefix implements CommandExecutor {
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
                String compiled_prefix = sb.substring(0, sb.length());

                target.setDisplayName(ChatColor.RED + compiled_prefix + ChatColor.WHITE + player.getDisplayName());
                player.sendMessage("le prefix de " +  target.getDisplayName() + " est maintenant : " + compiled_prefix);

                return true;
            }
        }return false;
    }
}
