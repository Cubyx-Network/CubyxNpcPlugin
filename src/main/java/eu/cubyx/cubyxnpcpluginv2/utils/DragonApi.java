package eu.cubyx.cubyxnpcpluginv2.utils;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class DragonApi {


    public void FillSmallChestMarginsWithMaterial( Material matname, Inventory inventory){
        for(int i=0; i<9; i++){
            inventory.setItem(i, new ItemStack(matname));
        }
        for(int s=18; s<27; s++){
            inventory.setItem(s, new ItemStack(matname));
        }
        inventory.setItem(9, new ItemStack(matname));
        inventory.setItem(17, new ItemStack(matname));
    }

    public void FillBigChestMarginsWithMaterial( Material matname, Inventory inventory){
        for(int i=0; i<9; i++){
            inventory.setItem(i, new ItemStack(matname));
        }
        for(int s=45; s<54; s++){
            inventory.setItem(s, new ItemStack(matname));
        }
        inventory.setItem(9, new ItemStack(matname));
        inventory.setItem(18, new ItemStack(matname));
        inventory.setItem(27, new ItemStack(matname));
        inventory.setItem(36, new ItemStack(matname));
        inventory.setItem(17, new ItemStack(matname));
        inventory.setItem(26, new ItemStack(matname));
        inventory.setItem(35, new ItemStack(matname));
        inventory.setItem(45, new ItemStack(matname));
        inventory.setItem(44, new ItemStack(matname));
    }

    public void FillSmallChestMarginsWithItemStack( ItemStack itemStack, Inventory inventory){
        for(int i=0; i<9; i++){
            inventory.setItem(i, itemStack);
        }
        for(int s=18; s<27; s++){
            inventory.setItem(s, itemStack);
        }
        inventory.setItem(9, itemStack);
        inventory.setItem(17, itemStack);
    }

    public void FillBigChestMarginsWithItemStack( ItemStack itemStack, Inventory inventory){
        for(int i=0; i<9; i++){
            inventory.setItem(i, itemStack);
        }
        for(int s=45; s<54; s++){
            inventory.setItem(s, itemStack);
        }
        inventory.setItem(9, itemStack);
        inventory.setItem(18, itemStack);
        inventory.setItem(27, itemStack);
        inventory.setItem(36, itemStack);
        inventory.setItem(17, itemStack);
        inventory.setItem(26, itemStack);
        inventory.setItem(35, itemStack);
        inventory.setItem(45, itemStack);
        inventory.setItem(44, itemStack);
    }

    public static void sendActionbar(Player player, String message){
        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(message));
    }

    public static void openUi(Player player, Inventory inventory){
        player.openInventory(inventory);
    }
}

