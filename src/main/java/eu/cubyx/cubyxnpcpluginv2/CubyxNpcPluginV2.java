package eu.cubyx.cubyxnpcpluginv2;

import eu.cubyx.cubyxnpcpluginv2.listener.PlayerInteractWithEntityListener;
import eu.cubyx.cubyxnpcpluginv2.utils.FileBuilder;
import eu.cubyx.cubyxnpcpluginv2.utils.PluginSetupInterface;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public final class CubyxNpcPluginV2 extends JavaPlugin implements PluginSetupInterface {
    private static CubyxNpcPluginV2 instance;
    private static FileBuilder fileBuilder = new FileBuilder("plugins//CubyxNpcPluginV2", "config.yml");
    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        cmdRegistry();
        listenerRegistry();
        initConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public void cmdRegistry() {

    }

    @Override
    public void listenerRegistry() {
        PluginManager pm = Bukkit.getPluginManager();
        if(!fileBuilder.getBoolean("CubyxNpcPlugin.isEnabled")) {
            pm.registerEvents(new PlayerInteractWithEntityListener(), this);
        }
    }

    public void initConfig(){
        if(!fileBuilder.exist()){
            fileBuilder.setValue("CubyxNpcPlugin.isEnabled", false);
            //---Npc: 1---
            fileBuilder.setValue("CubyxNpcPlugin.Npc1.NpcName", "NPC Name");
            fileBuilder.setValue("CubyxNpcPlugin.Npc1.TargetServerName", "Target Server (Name)");
            //---Npc: 2---
            fileBuilder.setValue("CubyxNpcPlugin.Npc2.NpcName", "NPC Name");
            fileBuilder.setValue("CubyxNpcPlugin.Npc2.TargetServerName", "Target Server (Name)");
            //---Npc: 3---
            fileBuilder.setValue("CubyxNpcPlugin.Npc3.NpcName", "NPC Name");
            fileBuilder.setValue("CubyxNpcPlugin.Npc3.TargetServerName", "Target Server (Name)");
            //---Npc: 4---
            fileBuilder.setValue("CubyxNpcPlugin.Npc4.NpcName", "NPC Name");
            fileBuilder.setValue("CubyxNpcPlugin.Npc4.TargetServerName", "Target Server (Name)");
            //---Npc: 5---
            fileBuilder.setValue("CubyxNpcPlugin.Npc5.NpcName", "NPC Name");
            fileBuilder.setValue("CubyxNpcPlugin.Npc5.TargetServerName", "Target Server (Name)");
            //---Npc: 6---
            fileBuilder.setValue("CubyxNpcPlugin.Npc6.NpcName", "NPC Name");
            fileBuilder.setValue("CubyxNpcPlugin.Npc6.TargetServerName", "Target Server (Name)");
            //---Npc: 7---
            fileBuilder.setValue("CubyxNpcPlugin.Npc7.NpcName", "NPC Name");
            fileBuilder.setValue("CubyxNpcPlugin.Npc7.TargetServerName", "Target Server (Name)");
            //---Npc: 8---
            fileBuilder.setValue("CubyxNpcPlugin.Npc8.NpcName", "NPC Name");
            fileBuilder.setValue("CubyxNpcPlugin.Npc8.TargetServerName", "Target Server (Name)");
            //---Npc: 9---
            fileBuilder.setValue("CubyxNpcPlugin.Npc9.NpcName", "NPC Name");
            fileBuilder.setValue("CubyxNpcPlugin.Npc9.TargetServerName", "Target Server (Name)");
            //---Npc: 10---
            fileBuilder.setValue("CubyxNpcPlugin.Npc10.NpcName", "NPC Name");
            fileBuilder.setValue("CubyxNpcPlugin.Npc10.TargetServerName", "Target Server (Name)");
            fileBuilder.save();
        }
    }

    public static CubyxNpcPluginV2 getInstance() {
        return instance;
    }

    public static FileBuilder getFileBuilder() {
        return fileBuilder;
    }
}
