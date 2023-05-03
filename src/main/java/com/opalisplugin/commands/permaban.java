package com.opalisplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class permaban implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(args.length == 1 && player.isOp()) {
                Player target = Bukkit.getPlayerExact(args[0]);
                target.setBanned(true);
                player.sendMessage("Le joueur " + target.getName() + " a bien été banni !");
                Bukkit.banIP(target.getAddress().getHostName());

            }
        }


        return false;
    }
}
