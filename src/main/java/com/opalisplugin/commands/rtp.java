package com.opalisplugin.commands;

import com.opalisplugin.gui.rtpGui;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;;

public class rtp implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {

            Player player = (Player) sender;
            player.openInventory(rtpGui.rtp());

        }


        return false;
    }
}
