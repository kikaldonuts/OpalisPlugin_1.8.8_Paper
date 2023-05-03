package com.opalisplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.opalisplugin.gui.reportGUI;


import java.io.IOException;

import static org.bukkit.Bukkit.createInventory;

public class report implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {

            Player player = (Player) sender;

            if(args.length != 1) {
                player.sendMessage("Vous devez spécifier le pseudo du joueur que vous voulez report !");
                player.sendMessage("Usage: /report <Pseudo du joueur>");
            }else{
                Player target = Bukkit.getPlayerExact(args[0]);

                if(false) {
                    player.sendMessage("Vous ne pouvez pas vous report vous meme !");
                }else{
                    if(target.isOnline()) {

                        player.openInventory(reportGUI.report(target));

                        return true;
                    }else{
                        player.sendMessage("Ce joueur n'est pas en ligne !");
                    }
                }
            }
        }
        return false;
    }
}
