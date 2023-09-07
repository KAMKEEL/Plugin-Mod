package KAMKEEL.PluginMod.Config;

import jdk.nashorn.internal.runtime.regexp.joni.Config;

import java.io.File;

public class LoadConfiguration {
    public static File blocksConfig;
    public static File itemsConfig;
    public static File compatConfig;

    public static void init(String configpath)
    {
        blocksConfig = new File(configpath + "blocks.cfg");
        itemsConfig = new File(configpath + "items.cfg");
        compatConfig = new File(configpath + "compat.cfg");

        ConfigBlocks.init(blocksConfig);
        ConfigItems.init(itemsConfig);
        ConfigCompat.init(compatConfig);
    }
}
