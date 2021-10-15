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
            CONCRETE_BURGUNDY = 0,
            CONCRETE_CARAMEL = 1,
            CONCRETE_CHOCOLATE = 2,
            CONCRETE_DENIM = 3,
            CONCRETE_HAZE = 4,
            CONCRETE_MINT = 5,
            CONCRETE_PEANUT = 6,
            CONCRETE_CLOVER = 7,
            CONCRETE_PEARL = 8,
            CONCRETE_MUSTARD = 9,
            CONCRETE_SKY_BLUE = 10,
            CONCRETE_PERIWINKLE = 11,
            CONCRETE_PEACH = 12,
            CONCRETE_PLUM = 13,
            CONCRETE_AVOCADO = 14,
            CONCRETE_RED_BROWN = 15,

            CONCRETE_BLOOD = 16,
            CONCRETE_SEAFOAM = 17,
            CONCRETE_MAUVE = 18,
            CONCRETE_SEAWEED = 19,
            CONCRETE_CARBON = 20,
            CONCRETE_INDIGO = 21,
            CONCRETE_KHAKI = 22,
            CONCRETE_ASH = 23,
            CONCRETE_IVY = 24,
            CONCRETE_IVORY = 25,
            CONCRETE_CAMEL = 26,
            CONCRETE_SALMON = 27;

    public static String concreteToString(int meta) {
        switch(meta) {
            case CONCRETE_BURGUNDY:
                return "burgundy";
            case CONCRETE_CARAMEL:
                return "caramel";
            case CONCRETE_CHOCOLATE:
                return "chocolate";
            case CONCRETE_DENIM:
                return "denim";
            case CONCRETE_HAZE:
                return "haze";
            case CONCRETE_MINT:
                return "mint";
            case CONCRETE_PEANUT:
                return "peanut";
            case CONCRETE_CLOVER:
                return "clover";
            case CONCRETE_PEARL:
                return "pearl";
            case CONCRETE_MUSTARD:
                return "mustard";
            case CONCRETE_SKY_BLUE:
                return "sky_blue";
            case CONCRETE_PERIWINKLE:
                return "periwinkle";
            case CONCRETE_PEACH:
                return "peach";
            case CONCRETE_PLUM:
                return "plum";
            case CONCRETE_AVOCADO:
                return "avocado";
            case CONCRETE_RED_BROWN:
                return "red_brown";
            case CONCRETE_BLOOD:
                return "blood";
            case CONCRETE_SEAFOAM:
                return "seafoam";
            case CONCRETE_MAUVE:
                return "mauve";
            case CONCRETE_SEAWEED:
                return "seaweed";
            case CONCRETE_CARBON:
                return "carbon";
            case CONCRETE_KHAKI:
                return "khaki";
            case CONCRETE_INDIGO:
                return "indigo";
            case CONCRETE_ASH:
                return "ash";
            case CONCRETE_IVY:
                return "ivy";
            case CONCRETE_IVORY:
                return "ivory";
            case CONCRETE_CAMEL:
                return "camel";
            case CONCRETE_SALMON:
                return "salmon";

            default: return "unknown_color";
        }
    }

    public static MapColor metaToMapColorConcrete(int meta) {
        switch(meta) {
            case CONCRETE_BURGUNDY:
                return MapColor.redColor;
            case CONCRETE_CARAMEL:
                return MapColor.brownColor;
            case CONCRETE_CHOCOLATE:
                return MapColor.brownColor;
            case CONCRETE_DENIM:
                return MapColor.blueColor;
            case CONCRETE_HAZE:
                return MapColor.purpleColor;
            case CONCRETE_MINT:
                return MapColor.grassColor;
            case CONCRETE_PEANUT:
                return MapColor.sandColor;
            case CONCRETE_CLOVER:
                return MapColor.greenColor;
            case CONCRETE_PEARL:
                return MapColor.sandColor;
            case CONCRETE_MUSTARD:
                return MapColor.yellowColor;
            case CONCRETE_SKY_BLUE:
                return MapColor.lightBlueColor;
            case CONCRETE_PERIWINKLE:
                return MapColor.purpleColor;
            case CONCRETE_PEACH:
                return MapColor.clayColor;
            case CONCRETE_PLUM:
                return MapColor.purpleColor;
            case CONCRETE_AVOCADO:
                return MapColor.grassColor;
            case CONCRETE_RED_BROWN:
                return MapColor.brownColor;
            case CONCRETE_BLOOD:
                return MapColor.brownColor;
            case CONCRETE_MAUVE:
                return MapColor.pinkColor;
            case CONCRETE_SEAFOAM:
                return MapColor.blueColor;
            case CONCRETE_CARBON:
                return MapColor.grayColor;
            case CONCRETE_KHAKI:
                return MapColor.brownColor;
            case CONCRETE_INDIGO:
                return MapColor.blueColor;
            case CONCRETE_ASH:
                return MapColor.grayColor;
            case CONCRETE_SEAWEED:
                return MapColor.greenColor;
            case CONCRETE_IVY:
                return MapColor.greenColor;
            case CONCRETE_IVORY:
                return MapColor.sandColor;
            case CONCRETE_CAMEL:
                return MapColor.sandColor;
            case CONCRETE_SALMON:
                return MapColor.pinkColor;

            default: return MapColor.airColor;
        }
    }


}
