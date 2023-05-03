package com.opalisplugin.customItems;

import com.opalisplugin.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import sun.security.krb5.internal.crypto.Des;

import java.util.ArrayList;

public class CustomItems {

    public static ItemStack ChunkKiller() {
        ItemStack item = new ItemBuilder(Material.EMERALD).toItemStack();
        item.getItemMeta().setDisplayName("Chunk  Buster");
        item.addUnsafeEnchantment(Enchantment.LURE, 100);
        item.getItemMeta().addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ArrayList<String> desc = new ArrayList<>();

        desc.add("");
        desc.add("§dRaretée: §e★★★★☆");
        desc.add("");
        desc.add("§f====================================");
        desc.add("§7<         §dITEM RARE           §7>");
        desc.add("§f====================================");
        desc.add("");
        desc.add("§fDescription :");
        desc.add("  §aPermet de Totalement casser un");
        desc.add("  §achunk en faisant un clic droit !");
        desc.add("");
        desc.add("§f====================================");
        desc.add("§7<         §dITEM RARE           §7>");
        desc.add("§f====================================");

        item.getItemMeta().setLore(desc);
        return item;
    }

    public static ItemStack ChestFinder() {
        ItemStack item = new ItemBuilder(Material.EMERALD).toItemStack();
        item.getItemMeta().setDisplayName("Chunk  Buster");
        ArrayList<String> desc = new ArrayList<>();

        desc.add("");
        desc.add("§dRaretée: §e★★★★☆");
        desc.add("");
        desc.add("§f====================================");
        desc.add("§7<         §dITEM RARE           §7>");
        desc.add("§f====================================");
        desc.add("");
        desc.add("§fDescription :");
        desc.add("  §aPermet de trouver le nombre de  ");
        desc.add("  §aprésents dans le Chunk ou vous  ");
        desc.add("  §avous trouvez !");
        desc.add("");
        desc.add("§f====================================");
        desc.add("§7<         §dITEM RARE           §7>");
        desc.add("§f====================================");

        item.getItemMeta().setLore(desc);
        return item;
    }


}
