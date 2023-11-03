package kamkeel.plugin.Config;

import cpw.mods.fml.common.FMLLog;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import org.apache.logging.log4j.Level;

import java.io.File;

public class ConfigCompat
{
    public static Configuration config;

    public final static String SERVER = "SERVER";
    public final static String GENERAL = "General";


    /**
     *  Client Properties
     **/
    public static Property KeybindingsProperty;
    public static boolean Keybindings = true;

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

            KeybindingsProperty = config.get(SERVER, "Enable Keybinds", true, "Client should also disable this for visual look");
            Keybindings = KeybindingsProperty.getBoolean(true);

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