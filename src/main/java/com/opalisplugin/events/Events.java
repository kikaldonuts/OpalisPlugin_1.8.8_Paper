package com.opalisplugin.events;

import com.opalisplugin.Opalis;
import com.opalisplugin.customItems.CustomItems;
import com.opalisplugin.util.ItemBuilder;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import com.opalisplugin.gui.*;

import java.util.ArrayList;

public class Events implements Listener {

    @EventHandler

    public void OnJoin(PlayerJoinEvent event) {

        ArrayList<String> Owners = new ArrayList<>();
        ArrayList<String> Dev = new ArrayList<>();
        ArrayList<String> Moderateur = new ArrayList<>();
        Owners.add("KikalDonuts");
        Dev.add("Etraxx_");
        Moderateur.add("Ghost_Killer80");
        Moderateur.add("pierre6207");
        Moderateur.add("pro_pappag");

        String grade = "";

        for(String p : Owners) {
                if(event.getPlayer().getDisplayName() == p) {

                }
        }

        Location spawn = new Location(event.getPlayer().getWorld(), 0.5, 33, 0.5);
        event.getPlayer().teleport(spawn);

        event.setJoinMessage(ChatColor.GRAY + "[" + ChatColor.GREEN + ">" + ChatColor.GRAY + "] " + ChatColor.GREEN + event.getPlayer().getDisplayName());
        Player player = event.getPlayer();

        player.setDisplayName("<Ranks> " + " <Faction> " + grade + " " + player.getDisplayName());

    }
    @EventHandler
    public void onRightClick(PlayerInteractEvent e) {
        if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if(e.getItem() == CustomItems.ChunkKiller()) {
                Chunk chunk = e.getPlayer().getLocation().getChunk();
                ArrayList<Block> blocks = Opalis.getBlocksOfAChunk(chunk);
                e.getPlayer().openInventory(verificationGui.verificationGui("Etes vous sur de vouloir utiliser le Chunk_Buster ( Il détruira le chunk dans lequel vous trouvez ) ?"));
                for(Block b : blocks) {
                    b.setType(Material.AIR);

                }
            }
        }

    }




    @EventHandler
    public void onDead(PlayerDeathEvent event) {

        Player player = event.getEntity();
        player.closeInventory();
        player.sendMessage(ChatColor.RED + "Vous etes morts, vous avez étés téléportés au spawn");
        player.setGameMode(GameMode.SURVIVAL);
        Location spawn = new Location(player.getWorld(), 0.5, 33, 0.5);
        player.teleport(spawn);

        event.setKeepLevel(true);
    }

    @EventHandler
    public void onTalk(PlayerChatEvent event) {

        Player player = event.getPlayer();
        if(!player.isOp() && Opalis.getMutedChat()) {
            event.setCancelled(true);
            player.sendMessage("Le chat est mute, désolé de la gène, votre message n'a pas été envoyé ...");
        }


        if(!player.isOp()) {
            event.setFormat(event.getPlayer().getDisplayName() + " >> " + event.getMessage() );

        }else{
            if(!player.isCustomNameVisible()){
                event.setFormat(event.getPlayer().getDisplayName() + " >> " + ChatColor.RED + ChatColor.BOLD + event.getMessage() );
            }
        }


    }

    @EventHandler
    public void onCLickOnIteminGUI(InventoryClickEvent event) {

        Player player = (Player) event.getWhoClicked();
        ItemStack item = event.getCurrentItem();

        String ReportingGUI = "§4Report un joueur";

        if(event.getInventory().getName() == ReportingGUI) {
            event.setCancelled(true);
        }

        String reportingValue = "";

        if(item.getItemMeta().getDisplayName() == "§4Logiciel de triche") {
            reportingValue = "Logiciel de triche";
            event.getWhoClicked().closeInventory();
        }
        if(item.getItemMeta().getDisplayName() == "§3Xray") {
            reportingValue = "XRAY";
            event.getWhoClicked().closeInventory();
        }
        if(item.getItemMeta().getDisplayName() == "§dInsultes / Spam") {
            reportingValue = "Spam / Insulte";
            event.getWhoClicked().closeInventory();
        }
        if(item .getItemMeta().getDisplayName() == "§2TP Kill") {
            reportingValue = "Tp Kill";
            event.getWhoClicked().closeInventory();
        }

        if(item.getItemMeta().getDisplayName() == "§4Fermer") {
            event.getWhoClicked().closeInventory();
        }

        if(!reportingValue.isEmpty()){
            for (OfflinePlayer operator : Bukkit.getOperators()) {
                    operator.getPlayer().sendMessage("§6§lADMIN REPORT >>> " +((Player) event.getWhoClicked())
                            .getDisplayName() + " vient de report " + event.getInventory().getItem(13)
                            .getItemMeta().getDisplayName().split(" ")[3] + " pour " + reportingValue);

            }


        }


    }


}
