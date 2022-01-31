package eu.cubyx.cubyxnpcpluginv2.listener;

import eu.cubyx.cubyxnpcpluginv2.CubyxNpcPluginV2;
import eu.thesimplecloud.api.CloudAPI;
import eu.thesimplecloud.api.player.ICloudPlayer;
import eu.thesimplecloud.api.service.ICloudService;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

public class PlayerInteractWithEntityListener implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractAtEntityEvent event) {

        if (CubyxNpcPluginV2.getFileBuilder().exist()) {
            if (event.getRightClicked().getType().equals(EntityType.ARMOR_STAND)) {
                if (event.getRightClicked().getName().equals(CubyxNpcPluginV2.getFileBuilder().getString("CubyxNpcPlugin.Npc1.NpcName"))) {
                    ICloudPlayer player = CloudAPI.getInstance().getCloudPlayerManager().getCachedCloudPlayer(event.getPlayer().getName());
                    ICloudService iCloudService = CloudAPI.getInstance().getCloudServiceManager().getCloudServiceByName(CubyxNpcPluginV2.getFileBuilder().getString("CubyxNpcPlugin.Npc1.TargetServerName"));
                    if (player == null) return;
                    if (iCloudService == null) return;
                    player.connect(iCloudService);
                }
            }

            if (event.getRightClicked().getType().equals(EntityType.ARMOR_STAND)) {
                if (event.getRightClicked().getName().equals(CubyxNpcPluginV2.getFileBuilder().getString("CubyxNpcPlugin.Npc2.NpcName"))) {
                    ICloudPlayer player = CloudAPI.getInstance().getCloudPlayerManager().getCachedCloudPlayer(event.getPlayer().getName());
                    ICloudService iCloudService = CloudAPI.getInstance().getCloudServiceManager().getCloudServiceByName(CubyxNpcPluginV2.getFileBuilder().getString("CubyxNpcPlugin.Npc2.TargetServerName"));
                    if (player == null) return;
                    if (iCloudService == null) return;
                    player.connect(iCloudService);
                }
            }

            if (event.getRightClicked().getType().equals(EntityType.ARMOR_STAND)) {
                if (event.getRightClicked().getName().equals(CubyxNpcPluginV2.getFileBuilder().getString("CubyxNpcPlugin.Npc3.NpcName"))) {
                    ICloudPlayer player = CloudAPI.getInstance().getCloudPlayerManager().getCachedCloudPlayer(event.getPlayer().getName());
                    ICloudService iCloudService = CloudAPI.getInstance().getCloudServiceManager().getCloudServiceByName(CubyxNpcPluginV2.getFileBuilder().getString("CubyxNpcPlugin.Npc3.TargetServerName"));
                    if (player == null) return;
                    if (iCloudService == null) return;
                    player.connect(iCloudService);
                }
            }

            if (event.getRightClicked().getType().equals(EntityType.ARMOR_STAND)) {
                if (event.getRightClicked().getName().equals(CubyxNpcPluginV2.getFileBuilder().getString("CubyxNpcPlugin.Npc4.NpcName"))) {
                    ICloudPlayer player = CloudAPI.getInstance().getCloudPlayerManager().getCachedCloudPlayer(event.getPlayer().getName());
                    ICloudService iCloudService = CloudAPI.getInstance().getCloudServiceManager().getCloudServiceByName(CubyxNpcPluginV2.getFileBuilder().getString("CubyxNpcPlugin.Npc4.TargetServerName"));
                    if (player == null) return;
                    if (iCloudService == null) return;
                    player.connect(iCloudService);
                }
            }

            if (event.getRightClicked().getType().equals(EntityType.ARMOR_STAND)) {
                if (event.getRightClicked().getName().equals(CubyxNpcPluginV2.getFileBuilder().getString("CubyxNpcPlugin.Npc5.NpcName"))) {
                    ICloudPlayer player = CloudAPI.getInstance().getCloudPlayerManager().getCachedCloudPlayer(event.getPlayer().getName());
                    ICloudService iCloudService = CloudAPI.getInstance().getCloudServiceManager().getCloudServiceByName(CubyxNpcPluginV2.getFileBuilder().getString("CubyxNpcPlugin.Npc5.TargetServerName"));
                    if (player == null) return;
                    if (iCloudService == null) return;
                    player.connect(iCloudService);
                }
            }

            if (event.getRightClicked().getType().equals(EntityType.ARMOR_STAND)) {
                if (event.getRightClicked().getName().equals(CubyxNpcPluginV2.getFileBuilder().getString("CubyxNpcPlugin.Npc6.NpcName"))) {
                    ICloudPlayer player = CloudAPI.getInstance().getCloudPlayerManager().getCachedCloudPlayer(event.getPlayer().getName());
                    ICloudService iCloudService = CloudAPI.getInstance().getCloudServiceManager().getCloudServiceByName(CubyxNpcPluginV2.getFileBuilder().getString("CubyxNpcPlugin.Npc6.TargetServerName"));
                    if (player == null) return;
                    if (iCloudService == null) return;
                    player.connect(iCloudService);
                }
            }

            if (event.getRightClicked().getType().equals(EntityType.ARMOR_STAND)) {
                if (event.getRightClicked().getName().equals(CubyxNpcPluginV2.getFileBuilder().getString("CubyxNpcPlugin.Npc7.NpcName"))) {
                    ICloudPlayer player = CloudAPI.getInstance().getCloudPlayerManager().getCachedCloudPlayer(event.getPlayer().getName());
                    ICloudService iCloudService = CloudAPI.getInstance().getCloudServiceManager().getCloudServiceByName(CubyxNpcPluginV2.getFileBuilder().getString("CubyxNpcPlugin.Npc7.TargetServerName"));
                    if (player == null) return;
                    if (iCloudService == null) return;
                    player.connect(iCloudService);
                }
            }

            if (event.getRightClicked().getType().equals(EntityType.ARMOR_STAND)) {
                if (event.getRightClicked().getName().equals(CubyxNpcPluginV2.getFileBuilder().getString("CubyxNpcPlugin.Npc8.NpcName"))) {
                    ICloudPlayer player = CloudAPI.getInstance().getCloudPlayerManager().getCachedCloudPlayer(event.getPlayer().getName());
                    ICloudService iCloudService = CloudAPI.getInstance().getCloudServiceManager().getCloudServiceByName(CubyxNpcPluginV2.getFileBuilder().getString("CubyxNpcPlugin.Npc8.TargetServerName"));
                    if (player == null) return;
                    if (iCloudService == null) return;
                    player.connect(iCloudService);
                }
            }

            if (event.getRightClicked().getType().equals(EntityType.ARMOR_STAND)) {
                if (event.getRightClicked().getName().equals(CubyxNpcPluginV2.getFileBuilder().getString("CubyxNpcPlugin.Npc9.NpcName"))) {
                    ICloudPlayer player = CloudAPI.getInstance().getCloudPlayerManager().getCachedCloudPlayer(event.getPlayer().getName());
                    ICloudService iCloudService = CloudAPI.getInstance().getCloudServiceManager().getCloudServiceByName(CubyxNpcPluginV2.getFileBuilder().getString("CubyxNpcPlugin.Npc9.TargetServerName"));
                    if (player == null) return;
                    if (iCloudService == null) return;
                    player.connect(iCloudService);
                }
            }

            if (event.getRightClicked().getType().equals(EntityType.ARMOR_STAND)) {
                if (event.getRightClicked().getName().equals(CubyxNpcPluginV2.getFileBuilder().getString("CubyxNpcPlugin.Npc10.NpcName"))) {
                    ICloudPlayer player = CloudAPI.getInstance().getCloudPlayerManager().getCachedCloudPlayer(event.getPlayer().getName());
                    ICloudService iCloudService = CloudAPI.getInstance().getCloudServiceManager().getCloudServiceByName(CubyxNpcPluginV2.getFileBuilder().getString("CubyxNpcPlugin.Npc10.TargetServerName"));
                    if (player == null) return;
                    if (iCloudService == null) return;
                    player.connect(iCloudService);
                }
            }
        }
    }
}
