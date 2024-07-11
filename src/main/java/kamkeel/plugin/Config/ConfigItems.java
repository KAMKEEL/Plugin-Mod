package kamkeel.plugin.Config;

import cpw.mods.fml.common.FMLLog;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import org.apache.logging.log4j.Level;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class ConfigItems
{
    public static Configuration config;

    public final static String GENERAL = "General";
    public final static String WEAPONS = "Weapons";

    /**
     *  General Properties
     **/
    public static Property DisableAllItemsProperty;
    public static boolean DisableAllItems = false;

    public static Property SpecialWeaponItemsProperty;
    public static boolean SpecialWeaponItems = true;

    public static Property PillItemsProperty;
    public static boolean PillItems = true;

    public static Property CoinItemsProperty;
    public static boolean CoinItems = true;

    public static Property EyeItemsProperty;
    public static boolean EyeItems = true;

    public static Property BallItemsProperty;
    public static boolean BallItems = true;

    public static Property ArtifactItemsProperty;
    public static boolean ArtifactItems = true;

    public static Property MiscItemsProperty;
    public static boolean MiscItems = true;

    public static Property EnergyAttackItemsProperty;
    public static boolean EnergyAttackItems = true;

    public static Property AppleItemsProperty;
    public static boolean AppleItems = true;

    public static Property CardItemsProperty;
    public static boolean CardItems = true;

    // Weapons
    public static Property AllWeaponsProperty;
    public static boolean DisableAllWeapons = false;

    public static Property GenericWeaponDamageProperty;
    public static double PluginWeaponDamage = 7.0F;

    public static Property GenericWeaponDurabilityProperty;
    public static int PluginWeaponDurability = 20000;

    public static Property KnifeWeaponsProperty;
    public static boolean KnifeWeapons = true;

    public static Property SwordWeaponsProperty;
    public static boolean SwordWeapons = true;

    public static Property BroadswordWeaponsProperty;
    public static boolean BroadswordWeapons = true;

    public static Property WarAxeWeaponsProperty;
    public static boolean WarAxeWeapons = true;

    public static Property BattleAxeWeaponsProperty;
    public static boolean BattleAxeWeapons = true;

    public static Property BowWeaponsProperty;
    public static boolean BowWeapons = true;

    public static Property ClawWeaponsProperty;
    public static boolean ClawWeapons = true;

    public static Property ScytheWeaponsProperty;
    public static boolean ScytheWeapons = true;

    public static Property DaggerWeaponsProperty;
    public static boolean DaggerWeapons = true;

    public static Property SpearWeaponsProperty;
    public static boolean SpearWeapons = true;

    public static Property StaffWeaponsProperty;
    public static boolean StaffWeapons = true;

    public static Property KatanaWeaponsProperty;
    public static boolean KatanaWeapons = true;

    public static Property ShieldWeaponsProperty;
    public static boolean ShieldWeapons = true;

    public static Property GlassWeaponsProperty;
    public static boolean GlassWeapons = true;

    public static Property HammerWeaponsProperty;
    public static boolean HammerWeapons = true;

    public static void init(File configFile)
    {
        config = new Configuration(configFile);

        try
        {
            config.load();

            // General
            DisableAllItemsProperty = config.get(GENERAL, "Disable All Items", false);
            DisableAllItems = DisableAllItemsProperty.getBoolean(false);

            PillItemsProperty = config.get(GENERAL, "Enable Pill Items", true);
            PillItems = PillItemsProperty.getBoolean(true);

            CoinItemsProperty = config.get(GENERAL, "Enable Coin Items", true);
            CoinItems = CoinItemsProperty.getBoolean(true);

            EyeItemsProperty = config.get(GENERAL, "Enable Eye Items", true);
            EyeItems = EyeItemsProperty.getBoolean(true);

            BallItemsProperty = config.get(GENERAL, "Enable Ball Items", true);
            BallItems = BallItemsProperty.getBoolean(true);

            ArtifactItemsProperty = config.get(GENERAL, "Enable Artifact Items", true);
            ArtifactItems = ArtifactItemsProperty.getBoolean(true);

            MiscItemsProperty = config.get(GENERAL, "Enable Misc Items", true);
            MiscItems = MiscItemsProperty.getBoolean(true);

            AppleItemsProperty = config.get(GENERAL, "Enable Apple Items", true);
            AppleItems = AppleItemsProperty.getBoolean(true);

            EnergyAttackItemsProperty = config.get(GENERAL, "Enable EnergyAttack Items", true);
            EnergyAttackItems = EnergyAttackItemsProperty.getBoolean(true);

            CardItemsProperty = config.get(GENERAL, "Enable Card Items", true);
            CardItems = CardItemsProperty.getBoolean(true);



            // Weapons
            config.setCategoryPropertyOrder(WEAPONS, new ArrayList<>(Arrays.asList("Disable All Weapons", "Generic Damage", "Generic Durability")));
            AllWeaponsProperty = config.get(WEAPONS, "Disable All Weapons", false);
            DisableAllWeapons = AllWeaponsProperty.getBoolean(false);

            GenericWeaponDamageProperty = config.get(WEAPONS, "Generic Damage", 7.0F, "The Damage Float inputted is always + 4.0F which is default MC Weapon Damage");
            PluginWeaponDamage = GenericWeaponDamageProperty.getDouble(7.0F);

            GenericWeaponDurabilityProperty = config.get(WEAPONS, "Generic Durability", 20000, "The amount of durability for all generic weapons");
            PluginWeaponDurability = GenericWeaponDurabilityProperty.getInt(20000);

            SpecialWeaponItemsProperty = config.get(WEAPONS, "Enable Special Weapons", true, "Includes Ingots, Parts and Materials for Special Weapons");
            SpecialWeaponItems = SpecialWeaponItemsProperty.getBoolean(true);

            KnifeWeaponsProperty = config.get(WEAPONS, "Enable Knife Weapons", true);
            KnifeWeapons = KnifeWeaponsProperty.getBoolean(true);

            SwordWeaponsProperty = config.get(WEAPONS, "Enable Sword Weapons", true);
            SwordWeapons = SwordWeaponsProperty.getBoolean(true);

            BroadswordWeaponsProperty = config.get(WEAPONS, "Enable Broadsword Weapons", true);
            BroadswordWeapons = BroadswordWeaponsProperty.getBoolean(true);

            WarAxeWeaponsProperty = config.get(WEAPONS, "Enable WarAxe Weapons", true);
            WarAxeWeapons = WarAxeWeaponsProperty.getBoolean(true);

            BattleAxeWeaponsProperty = config.get(WEAPONS, "Enable BattleAxe Weapons", true);
            BattleAxeWeapons = BattleAxeWeaponsProperty.getBoolean(true);

            BowWeaponsProperty = config.get(WEAPONS, "Enable Bow Weapons", true);
            BowWeapons = BowWeaponsProperty.getBoolean(true);

            ClawWeaponsProperty = config.get(WEAPONS, "Enable Claw Weapons", true);
            ClawWeapons = ClawWeaponsProperty.getBoolean(true);

            ScytheWeaponsProperty = config.get(WEAPONS, "Enable Scythe Weapons", true);
            ScytheWeapons = ScytheWeaponsProperty.getBoolean(true);

            DaggerWeaponsProperty = config.get(WEAPONS, "Enable Dagger Weapons", true);
            DaggerWeapons = DaggerWeaponsProperty.getBoolean(true);

            SpearWeaponsProperty = config.get(WEAPONS, "Enable Spear Weapons", true);
            SpearWeapons = SpearWeaponsProperty.getBoolean(true);

            StaffWeaponsProperty = config.get(WEAPONS, "Enable Staff Weapons", true);
            StaffWeapons = StaffWeaponsProperty.getBoolean(true);

            KatanaWeaponsProperty = config.get(WEAPONS, "Enable Katana Weapons", true);
            KatanaWeapons = KatanaWeaponsProperty.getBoolean(true);

            ShieldWeaponsProperty = config.get(WEAPONS, "Enable Shield Weapons", true);
            ShieldWeapons = ShieldWeaponsProperty.getBoolean(true);

            GlassWeaponsProperty = config.get(WEAPONS, "Enable Glass Weapons", true);
            GlassWeapons = GlassWeaponsProperty.getBoolean(true);

            HammerWeaponsProperty = config.get(WEAPONS, "Enable Hammer Weapons", true);
            HammerWeapons = HammerWeaponsProperty.getBoolean(true);
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