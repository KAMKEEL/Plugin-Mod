package KAMKEEL.PluginMod.Enum.Items;

public enum EnumCoins {

    WOOD(0, "Wood"), // 1
    STONE(1, "Stone"), // 5
    ZINC(2, "Zinc"), // 10
    BRONZE(3, "Bronze"), // 20
    OBSIDIAN(4, "Obsidian"), // 50
    IRON(5, "Iron"), // 100
    GOLD(6, "Gold"), // 1000
    PLATINUM(7, "Platinum"), // 5000
    EMERALD(8, "Emerald"), // 10000
    RUBY(9, "Ruby"), // 50000
    DIAMOND(10, "Diamond"), // 100000
    AMETHYST(11, "Amethyst"), // 1000000
    EARTH(12, "Earth"), // Earth Token;

    OTHER_AMETHYST(13, "Other_Amethyst"),
    OTHER_BRONZE(14, "Other_Bronze"),
    OTHER_COBALT(15, "Other_Cobalt"),
    OTHER_DIAMOND(16, "Other_Diamond"),
    OTHER_EMERALD(17, "Other_Emerald"),
    OTHER_GOLD(18, "Other_Gold"),
    OTHER_IRON(19, "Other_Iron"),
    OTHER_OBSIDIAN(20, "Other_Obsidian"),
    OTHER_ROSE(21, "Other_Rose"),
    OTHER_RUBY(22, "Other_Ruby"),
    OTHER_WOOD(23, "Other_Wood"),

    OTHER2_DARK_STEEL(24, "Other2_Dark_Steel"),
    OTHER2_BRONZE(25, "Other2_Bronze"),
    OTHER2_DIAMOND(26, "Other2_Diamond"),
    OTHER2_RUBY(27, "Other2_Ruby"),
    OTHER2_SILVER(28, "Other2_Silver"),
    OTHER2_COPPER(29, "Other2_Copper"),
    OTHER2_EMERALD(30, "Other2_Emerald"),
    OTHER2_GOLD(31, "Other2_Gold");

    private final int meta;
    private final String name;

    private EnumCoins(int meta, String name){

        this.meta = meta;
        this.name = name;
    }

    public int getMeta(){
        return this.meta;
    }

    public String getName(){
        return this.name;
    }

    public static int count(){
        return values().length;
    }
}
