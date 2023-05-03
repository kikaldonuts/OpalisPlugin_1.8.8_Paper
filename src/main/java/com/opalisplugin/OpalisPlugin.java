package com.opalisplugin;

import com.opalisplugin.commands.*;
import com.opalisplugin.events.Events;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public final class OpalisPlugin extends JavaPlugin {

    @Override
    public void onEnable() {


        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("[  <===================>  ===> OPALIS <===  <===================>  ]");
        System.out.println("                 Opalis Plugin s'est bien initialise                ");
        System.out.println("[ <===============> Dev: KikalDonuts pour Opalis <===============> ]");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");


        getCommand("spawn").setExecutor(new spawn());
        getCommand("feed").setExecutor(new feed());
        getCommand("msg").setExecutor(new msg());
        getCommand("nick").setExecutor(new nick());
        getCommand("prefix").setExecutor(new prefix());
        getCommand("chat").setExecutor(new chat());
        getCommand("report").setExecutor(new report());
        getCommand("permaban").setExecutor(new permaban());
        getCommand("rtp").setExecutor(new rtp());
        getServer().getPluginManager().registerEvents(new Events(), this);
    }

    @Override
    public void onDisable() {

    }


    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        return super.onTabComplete(sender, command, alias, args);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(command.getName().equalsIgnoreCase("help")) {

        }

        return super.onCommand(sender, command, label, args);
    }
}
