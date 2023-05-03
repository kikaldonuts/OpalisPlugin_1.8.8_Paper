package com.opalisplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class msg implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String mdg, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;

            if(args.length < 2) {
                player.sendMessage("Utilisation de la commande : /msg <Joueur> <Message>");
            }else {
                Player target = Bukkit.getPlayer(args[0]);
                String[] message = new String[999];
                args[0] = "";
                String delimiter = " ";

                StringBuilder sb = new StringBuilder();
                for (String str : args)
                    sb.append(str).append(delimiter);
                String compiled_message = sb.substring(0, sb.length());




                target.sendMessage("[ " + ChatColor.GOLD + player.getDisplayName() + ChatColor.DARK_GRAY +" >> " + ChatColor.GOLD +"you "+ ChatColor.WHITE + "]"+ ChatColor.GOLD + " : " + ChatColor.YELLOW +  compiled_message);

                return true;
            }



        }


        return false;
    }
}
