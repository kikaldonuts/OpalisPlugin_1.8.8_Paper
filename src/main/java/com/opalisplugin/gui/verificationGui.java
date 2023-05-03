package com.opalisplugin.gui;

import com.opalisplugin.Opalis;
import com.opalisplugin.util.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class verificationGui {

    public static Inventory verificationGui(String answer_string) {

        Inventory inv = Bukkit.createInventory(null, 45, "Etes vous sur ?");

        ItemStack red = new ItemStack(Material.STAINED_GLASS_PANE,1,(short)14);
        ItemStack green = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 5);
        ItemStack answer = new ItemBuilder(Material.COMMAND).setName( "§f♦ §c§l§o" + answer_string + " §f♦").toItemStack();

        inv.setItem(13, answer);
        inv.setItem(22, answer);
        inv.setItem(31, answer);

        ItemStack glass = new ItemBuilder(Material.STAINED_GLASS_PANE).setName("").toItemStack();
        inv.setItem(0, glass);
        inv.setItem(8, glass);
        inv.setItem(36, glass);
        inv.setItem(44, glass);

        ArrayList<Integer> gr = new ArrayList<>();
        gr.add(2);
        gr.add(3);
        gr.add(10);
        gr.add(11);
        gr.add(12);
        gr.add(19);
        gr.add(20);
        gr.add(21);
        gr.add(28);
        gr.add(29);
        gr.add(30);
        gr.add(38);
        gr.add(39);
        for(int Slot : gr) {
            inv.setItem(Slot, green);
        }

        ArrayList<Integer> rd = new ArrayList<>();
        rd.add(5);
        rd.add(6);
        rd.add(14);
        rd.add(15);
        rd.add(16);
        rd.add(23);
        rd.add(24);
        rd.add(25);
        rd.add(32);
        rd.add(33);
        rd.add(34);
        rd.add(41);
        rd.add(42);
        for(int Slot : rd) {
            inv.setItem(Slot, red);
        }


        return inv;
    }


}
