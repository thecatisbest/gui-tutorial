package me.thecatisbest.AnticheatGUISelect.Menus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ACSelect implements InventoryHolder {

    private final Inventory inv;

    public ACSelect() {
        inv = Bukkit.createInventory(this, 9, "Selection Screen"); //54 max size\
        init();
    }

    private void init() {
        ItemStack item;
        for (int i = 0; i < 4; i++) {
            item = createItem(tcibcolor("&a&lAccept"), Material.LIME_STAINED_GLASS_PANE, Collections.singletonList(tcibcolor("&7Accepts the request!")));
            //inv.addItem(item); -- Dont use! Panes will pile into one slot
            inv.setItem(i, item);
        }

        List<String> lore = new ArrayList<>();
        lore.add(tcibcolor("&7Select either accept or deny"));
        lore.add(tcibcolor("&7to make a decision."));
        item = createItem(tcibcolor("&b&lMake a Selection"), Material.BOOK, lore);
        inv.setItem(inv.firstEmpty(), item);

        for (int i = 5; i < 9; i++) {
            item = createItem(tcibcolor("&c&lDeny"), Material.RED_STAINED_GLASS_PANE, Collections.singletonList(tcibcolor("&7Denies the request!")));
            inv.setItem(i, item);
        }
    }

    private ItemStack createItem(String name, Material mat, List<String> lore) {
        ItemStack item = new ItemStack(mat, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    @Override
    public Inventory getInventory() {
        return inv;
    }

    public String tcibcolor(String msg){
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

}
