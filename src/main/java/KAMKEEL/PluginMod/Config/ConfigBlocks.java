package KAMKEEL.PluginMod.Config;

import cpw.mods.fml.common.FMLLog;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import org.apache.logging.log4j.Level;

import java.io.File;

public class ConfigBlocks
{
    public static Configuration config;

    public final static String GENERAL = "General";

    /**
     *  General Properties
     **/
    public static Property DisableAllBlocksProperty;
    public static boolean DisableAllBlocks = false;

    public static Property DarkBlocksProperty;
    public static boolean DarkBlocks = true;

    public static Property CaveVinesBlocksProperty;
    public static boolean CaveVinesBlocks = true;

    public static Property ConcreteBlocksProperty;
    public static boolean ConcreteBlocks = true;

    public static Property EnergyBlocksProperty;
    public static boolean EnergyBlocks = true;

    public static Property BarrelBlocksProperty;
    public static boolean BarrelBlocks = true;

    public static void init(File configFile)
    {
        config = new Configuration(configFile);

        try
        {
            config.load();

            // General
            DisableAllBlocksProperty = config.get(GENERAL, "Disable All Blocks", false);
            DisableAllBlocks = DisableAllBlocksProperty.getBoolean(false);

            DarkBlocksProperty = config.get(GENERAL, "Enable Dark", true);
            DarkBlocks = DarkBlocksProperty.getBoolean(true);

            CaveVinesBlocksProperty = config.get(GENERAL, "Enable Cave Vines", true);
            CaveVinesBlocks = CaveVinesBlocksProperty.getBoolean(true);

            ConcreteBlocksProperty = config.get(GENERAL, "Enable Concrete", true);
            ConcreteBlocks = ConcreteBlocksProperty.getBoolean(true);

            EnergyBlocksProperty = config.get(GENERAL, "Enable Energy", true);
            EnergyBlocks = EnergyBlocksProperty.getBoolean(true);

            BarrelBlocksProperty = config.get(GENERAL, "Enable Barrel", true, "These are cosmetic only. They do not open or close.");
            BarrelBlocks = BarrelBlocksProperty.getBoolean(true);

        }
        catch (Exception e)
        {
            FMLLog.log(Level.ERROR, e, "PluginMod has had a problem loading its main configuration");
        }
        finally
        {
            if (config.hasChanged()) {
                config.save();
            }
        }
    }
}