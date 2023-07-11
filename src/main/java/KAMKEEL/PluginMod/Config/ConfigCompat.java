package KAMKEEL.PluginMod.Config;

import cpw.mods.fml.common.FMLLog;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import org.apache.logging.log4j.Level;

import java.io.File;

public class ConfigCompat
{
    public static Configuration config;

    public final static String GENERAL = "General";

    /**
     *  General Properties
     **/
    public static Property ExtraUtilitiesProperty;
    public static boolean ExtraUtilities = true;

    public static Property BiomesOPlentyProperty;
    public static boolean BiomesOPlenty = true;

    public static void init(File configFile)
    {
        config = new Configuration(configFile);

        try
        {
            config.load();

            // General
            ExtraUtilitiesProperty = config.get(GENERAL, "Enable Extra Utilities Compat", true);
            ExtraUtilities = ExtraUtilitiesProperty.getBoolean(true);

            BiomesOPlentyProperty = config.get(GENERAL, "Enable Biomes O Plenty Compat", true);
            BiomesOPlenty = BiomesOPlentyProperty.getBoolean(true);

        }
        catch (Exception e)
        {
            FMLLog.log(Level.ERROR, e, "PluginMod has had a problem loading its compat configuration");
        }
        finally
        {
            if (config.hasChanged()) {
                config.save();
            }
        }
    }
}