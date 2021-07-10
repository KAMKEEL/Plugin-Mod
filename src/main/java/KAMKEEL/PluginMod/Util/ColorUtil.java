package KAMKEEL.PluginMod.Util;

import net.minecraft.block.material.MapColor;

public class ColorUtil {
    private ColorUtil() {}

    public static final int
            BLOOD_RED = 0,
            BABY_BLUE = 1,
            DARK_BLUE = 2,
            DEEP_BLUE = 3,
            GREEN = 4,
            HOT_PINK = 5,
            LEMON = 6,
            LIGHT_BLUE = 7,
            LIME = 8,
            MAGENTA = 9,
            ORANGE = 10,
            PURPLE = 11,
            RED = 12,
            TEAL = 13,
            TURQUOISE = 14,
            YELLOW = 15;


    public static String energyToString(int meta) {
        switch(meta) {
            case BLOOD_RED:
                return "blood_red";
            case BABY_BLUE:
                return "baby_blue";
            case DARK_BLUE:
                return "dark_blue";
            case DEEP_BLUE:
                return "deep_blue";
            case GREEN:
                return "green";
            case HOT_PINK:
                return "hot_pink";
            case LEMON:
                return "lemon";
            case LIGHT_BLUE:
                return "light_blue";
            case LIME:
                return "lime";
            case MAGENTA:
                return "magenta";
            case ORANGE:
                return "orange";
            case PURPLE:
                return "purple";
            case RED:
                return "red";
            case TEAL:
                return "teal";
            case TURQUOISE:
                return "turquoise";
            case YELLOW:
                return "yellow";

            default: return "unknown_color";
        }
    }

    public static MapColor metaToMapColorEnergy(int meta) {
        switch(meta) {
            case BLOOD_RED:
                return MapColor.redColor;
            case BABY_BLUE:
                return MapColor.lightBlueColor;
            case DARK_BLUE:
                return MapColor.blueColor;
            case DEEP_BLUE:
                return MapColor.blueColor;
            case GREEN:
                return MapColor.greenColor;
            case HOT_PINK:
                return MapColor.pinkColor;
            case LEMON:
                return MapColor.yellowColor;
            case LIGHT_BLUE:
                return MapColor.lightBlueColor;
            case LIME:
                return MapColor.limeColor;
            case MAGENTA:
                return MapColor.magentaColor;
            case ORANGE:
                return MapColor.clayColor;
            case PURPLE:
                return MapColor.purpleColor;
            case RED:
                return MapColor.redColor;
            case TEAL:
                return MapColor.waterColor;
            case TURQUOISE:
                return MapColor.waterColor;
            case YELLOW:
                return MapColor.sandColor;

            default: return MapColor.airColor;
        }
    }


    // Concrete
    public static final int
            META_BURGUNDY = 0,
            META_CARAMEL = 1,
            META_CHOCOLATE = 2,
            META_DENIM = 3,
            META_HAZE = 4,
            META_MINT = 5,
            META_PEANUT = 6,
            META_CLOVER = 7,
            META_PEARL = 8,
            META_MUSTARD = 9,
            META_SKY_BLUE = 10,
            META_PERIWINKLE = 11,
            META_PEACH = 12,
            META_PLUM = 13,
            META_AVOCADO = 14,
            META_RED_BROWN = 15;

    public static String concreteToString(int meta) {
        switch(meta) {
            case META_BURGUNDY:
                return "burgundy";
            case META_CARAMEL:
                return "caramel";
            case META_CHOCOLATE:
                return "chocolate";
            case META_DENIM:
                return "denim";
            case META_HAZE:
                return "haze";
            case META_MINT:
                return "mint";
            case META_PEANUT:
                return "peanut";
            case META_CLOVER:
                return "clover";
            case META_PEARL:
                return "pearl";
            case META_MUSTARD:
                return "mustard";
            case META_SKY_BLUE:
                return "sky_blue";
            case META_PERIWINKLE:
                return "periwinkle";
            case META_PEACH:
                return "peach";
            case META_PLUM:
                return "plum";
            case META_AVOCADO:
                return "avocado";
            case META_RED_BROWN:
                return "red_brown";

            default: return "unknown_color";
        }
    }

    public static MapColor metaToMapColorConcrete(int meta) {
        switch(meta) {
            case META_BURGUNDY:
                return MapColor.redColor;
            case META_CARAMEL:
                return MapColor.brownColor;
            case META_CHOCOLATE:
                return MapColor.brownColor;
            case META_DENIM:
                return MapColor.blueColor;
            case META_HAZE:
                return MapColor.purpleColor;
            case META_MINT:
                return MapColor.grassColor;
            case META_PEANUT:
                return MapColor.sandColor;
            case META_CLOVER:
                return MapColor.greenColor;
            case META_PEARL:
                return MapColor.sandColor;
            case META_MUSTARD:
                return MapColor.yellowColor;
            case META_SKY_BLUE:
                return MapColor.lightBlueColor;
            case META_PERIWINKLE:
                return MapColor.purpleColor;
            case META_PEACH:
                return MapColor.clayColor;
            case META_PLUM:
                return MapColor.purpleColor;
            case META_AVOCADO:
                return MapColor.grassColor;
            case META_RED_BROWN:
                return MapColor.brownColor;

            default: return MapColor.airColor;
        }
    }
}
