package com.opalisplugin.commands;

import com.opalisplugin.Opalis;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class chat implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;

            if(player.isOp()) {
                boolean Is_Chat_Muted = Opalis.getMutedChat();

                if(Is_Chat_Muted == true) {
                   Opalis.setMutingChat(false);
                    player.sendMessage("ADMINISTRATION >> Vous avez démuté le chat");
                }else{
                    Opalis.setMutingChat(true);
                    player.sendMessage("ADMINISTRATION >> Vous avez muté le chat");
                }

            }


        }

        return false;
    }
}
