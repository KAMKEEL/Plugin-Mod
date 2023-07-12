package KAMKEEL.PluginMod.Config;

import java.io.File;

public class LoadConfiguration {
    public static File blocksConfig;
    public static File compatConfig;
    public static File itemConfig;

    public static void init(String configpath)
    {
        blocksConfig = new File(configpath + "blocks.cfg");
        compatConfig = new File(configpath + "compat.cfg");
        itemConfig   = new File(configpath + "item.cfg");

        ConfigBlocks.init(blocksConfig);
        ConfigCompat.init(compatConfig);
        ConfigItems.init(itemConfig);
    }
}
