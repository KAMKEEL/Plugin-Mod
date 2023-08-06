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
        itemConfig = new File(configpath + "items.cfg");

        ConfigBlocks.init(blocksConfig);
        ConfigCompat.init(compatConfig);
        ConfigItem.init(itemConfig);
    }
}
