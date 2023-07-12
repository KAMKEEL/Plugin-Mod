package KAMKEEL.PluginMod.Config;

import cpw.mods.fml.common.FMLLog;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import org.apache.logging.log4j.Level;

import java.io.File;

public class ConfigItems
{
    public static Configuration config;

    public final static String GENERAL = "General";

    /**
     *  General Properties
     **/
    public static Property DisableAllItemsProperty;
    public static boolean DisableAllItems = false;

    public static Property CardItemsProperty;
    public static boolean CardItems = true;

    public static Property PillItemsProperty;
    public static boolean PillItems = true;

    public static Property EyeItemsProperty;
    public static boolean EyeItems = true;

    public static Property BallItemsProperty;
    public static boolean BallItems = true;

    public static Property ArtifactItemsProperty;
    public static boolean ArtifactItems = true;

    public static Property EnergyAttackItemsProperty;
    public static boolean EnergyAttackItems = true;

    public static Property AppleItemsProperty;
    public static boolean AppleItems = true;

    public static Property CoinItemsProperty;
    public static boolean CoinItems = true;

    public static Property MiscItemsProperty;
    public static boolean MiscItems = true;

    public static void init(File configFile)
    {
        config = new Configuration(configFile);

        try
        {
            config.load();

            // General
            DisableAllItemsProperty = config.get(GENERAL, "Disable All Items", false);
            DisableAllItems = DisableAllItemsProperty.getBoolean(false);

            CardItemsProperty = config.get(GENERAL, "Enable Cards", true);
            CardItems = CardItemsProperty.getBoolean(true);

            PillItemsProperty = config.get(GENERAL, "Enable Pills", true);
            PillItems = PillItemsProperty.getBoolean(true);

            EyeItemsProperty = config.get(GENERAL, "Enable Eyes", true);
            EyeItems = EyeItemsProperty.getBoolean(true);

            BallItemsProperty = config.get(GENERAL, "Enable Balls (lol)", true);
            BallItems = BallItemsProperty.getBoolean(true);

            ArtifactItemsProperty = config.get(GENERAL, "Enable Artifacts", true);
            ArtifactItems = ArtifactItemsProperty.getBoolean(true);

            EnergyAttackItemsProperty = config.get(GENERAL, "Enable Energy Attacks", true);
            EnergyAttackItems = EnergyAttackItemsProperty.getBoolean(true);

            AppleItemsProperty = config.get(GENERAL, "Enable Apples", true);
            AppleItems = AppleItemsProperty.getBoolean(true);

            CoinItemsProperty = config.get(GENERAL, "Enable Coins", true);
            CoinItems = CoinItemsProperty.getBoolean(true);

            MiscItemsProperty = config.get(GENERAL, "Enable Misc Items", true);
            MiscItems = MiscItemsProperty.getBoolean(true);

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