package com.opalisplugin.util;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Ranks {

    public static ItemStack Iron(int level) { return new ItemBuilder(Material.IRON_HOE).setName("Iron" + String.valueOf(level)).toItemStack(); }

    public static ItemStack Gold(int level) { return new ItemBuilder(Material.GOLD_HOE).setName("Gold" + String.valueOf(level)).toItemStack(); }

    public static ItemStack Diamond(int level) { return new ItemBuilder(Material.DIAMOND_HOE).setName("Diamond" + String.valueOf(level)).toItemStack(); }

    public static ItemStack Platinium(int level) { return new ItemBuilder(Material.NETHER_BRICK).setName("Platinium" + String.valueOf(level)).toItemStack(); }

    public static ItemStack Survivant(int level) { return new ItemBuilder(Material.ROTTEN_FLESH).setName("Survivant" + String.valueOf(level)).toItemStack(); }

    public static ItemStack Experimented(int level) { return new ItemBuilder(Material.BOW).setName("Experimented" + String.valueOf(level)).toItemStack(); }

    public static ItemStack Boss(int level) { return new ItemBuilder(Material.ENDER_PEARL).setName("Boss" + String.valueOf(level)).toItemStack(); }

    public static ItemStack Legend(int level) {  return new ItemBuilder(Material.GOLDEN_CARROT).setName("Legend" + String.valueOf(level)).toItemStack();  }

    public static ItemStack SuperLegendaryLegend(int level) {  return new ItemBuilder(Material.GOLDEN_APPLE).setName("SuperLegendaryLegend" + String.valueOf(level)).toItemStack(); }

    public static ItemStack Void(int level) {  return new ItemBuilder(Material.ENDER_PORTAL_FRAME).setName("Void" + String.valueOf(level)).toItemStack(); }

    public static ItemStack WhoAreYou() {  return new ItemBuilder(Material.ENCHANTED_BOOK).setName("WhoAreYou?").toItemStack(); }

    public static ItemStack Alien() {  return new ItemBuilder(Material.FIRE).setName("Alien?").toItemStack(); }

}
