package KAMKEEL.PluginMod.Config;

import java.io.File;

public class LoadConfiguration {
    public static File blocksConfig;

    public static void init(String configpath)
    {
        blocksConfig = new File(configpath + "blocks.cfg");

        ConfigBlocks.init(blocksConfig);
    }
}
