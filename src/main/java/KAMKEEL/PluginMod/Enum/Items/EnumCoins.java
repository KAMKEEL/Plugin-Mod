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
    EARTH(12, "Earth"); // Earth Token;

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
