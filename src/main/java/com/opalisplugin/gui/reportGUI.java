package com.opalisplugin.gui;

import com.opalisplugin.Opalis;
import com.opalisplugin.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import static org.bukkit.Bukkit.createInventory;

public class reportGUI {

    public static Inventory report(Player target) {
        Inventory inventory = createInventory(null, 45,"§4Report un joueur");
        //CHEATING
        ItemStack Cheating = new ItemBuilder(Material.DIAMOND_SWORD).setName("§4Logiciel de triche").toItemStack();

        //XRAY
        ItemStack XRAY = new ItemBuilder(Material.DIAMOND_ORE).setName("§3Xray").toItemStack();


        //Insultes / Spam
        ItemStack CHAT = new ItemBuilder(Material.PAPER).setName("§dInsultes / Spam").toItemStack();

        //TPKILL
        ItemStack TPKILL = new ItemBuilder(Material.ENDER_PEARL).setName("§2TP Kill").toItemStack();

        //Joueur report
        ItemStack CloseInventory = new ItemBuilder(Material.BARRIER).setName("§4Fermer").toItemStack();

        //PLAYERHEAD
        ItemStack Playerhead = new ItemBuilder(Material.SKULL).setSkullOwner(target.getDisplayName()).setName("§6§lJoueur cible : " + target.getDisplayName() ).toItemStack();


        ItemStack glass = new ItemBuilder(Material.STAINED_GLASS_PANE).setName("").toItemStack();
        for(Integer s : Opalis.returnAllGlassPostion()) {
            inventory.setItem(s, glass);
        }

        inventory.setItem(4, Playerhead);
        inventory.setItem(20, Cheating);
        inventory.setItem(21, XRAY);
        inventory.setItem(23, CHAT);
        inventory.setItem(24, TPKILL);
        inventory.setItem(40, CloseInventory);

        return inventory;
    };

}
