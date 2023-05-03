package com.opalisplugin.gui;

import com.opalisplugin.Opalis;
import com.opalisplugin.util.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class rtpGui {

    public static Inventory rtp() {

        @SuppressWarnings("unused")

        Inventory rtp = Bukkit.createInventory(null, 45, "§6§lTeleportation Aléatoire !");

        ItemStack distance_1 = new ItemBuilder(Material.GOLD_ORE).setName("§6Distance 1").toItemStack();
        ArrayList<String> lore_1 = new ArrayList<>();
        lore_1.add("§6Teleportation entre une distance de 0 et 4 000 Blocs !");
        distance_1.getItemMeta().setLore(lore_1);


        ItemStack distance_2 = new ItemBuilder(Material.DIAMOND).setName("§6Distance 2").toItemStack();
        ArrayList<String>  lore_2 = new ArrayList<>();
        lore_2.add("§3Teleportation entre une distance de 4 000 et 8 000 Blocs !");
        distance_2.getItemMeta().setLore(lore_2);

        ItemStack distance_3 = new ItemBuilder(Material.EMERALD).setName("§6Distance 3").toItemStack();
        ArrayList<String>  lore_3 = new ArrayList<>();
        lore_3.add("§2Teleportation entre une distance de 8 000 et 12 000 Blocs !");
        distance_3.getItemMeta().setLore(lore_3);

        rtp.setItem(20, distance_1);
        rtp.setItem(23, distance_2);
        rtp.setItem(26, distance_3);

        ItemStack glass = new ItemBuilder(Material.STAINED_GLASS_PANE).setName("").toItemStack();
        for(Integer s : Opalis.returnAllGlassPostion()) {
            rtp.setItem(s, glass);
        }


        return rtp;
    }

}
