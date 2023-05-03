package com.opalisplugin.gui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ranksGUi{

    public static Inventory rankGui(Player player) {
        Inventory inv = Bukkit.createInventory(null, 45);

        new Datas.PlayerConfig(player);

        ItemStack rank =

        return inv;

    }
}
