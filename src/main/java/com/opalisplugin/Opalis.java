package com.opalisplugin;

import org.bukkit.*;
import org.bukkit.block.Block;

import java.util.ArrayList;

public class Opalis {


    public static ArrayList<Integer> returnAllGlassPostion() {
        ArrayList<Integer> Slots = new ArrayList<>();
        Slots.add(0);
        Slots.add(1);
        Slots.add(7);
        Slots.add(8);
        Slots.add(9);
        Slots.add(17);
        Slots.add(17);
        Slots.add(35);
        Slots.add(36);
        Slots.add(37);
        Slots.add(43);
        Slots.add(44);
        return Slots;
    }

    public static ArrayList<Block> getBlocksOfAChunk(final Chunk chunk) {
        final ArrayList<Block> blocks = new ArrayList<>();
        final int minX = chunk.getX() << 4;
        final int minZ = chunk.getZ() << 4;
        final int maxX = minX | 15;
        final int maxY = chunk.getWorld().getMaxHeight();
        final int maxZ = minZ | 15;

        for (int x = minX; x <= maxX; ++x) {
            for (int y = 0; y <= maxY; ++y) {
                for (int z = minZ; z <= maxZ; ++z) {
                    blocks.add(chunk.getBlock(x, y, z));
                }
            }
        }return blocks;
    }

    static boolean Is_Chat_Muted = false;
    static String AdminGrade = ChatColor.RED + " [" +ChatColor.BOLD +  "Admin " + ChatColor.RED + "]";

    public static String getAdminGrade() { return AdminGrade; }
    public static boolean getMutedChat() {
        return Is_Chat_Muted;
    }

    public static void setMutingChat(boolean MutedChat) {
        Is_Chat_Muted = MutedChat;
    }

}
