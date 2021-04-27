package KAMKEEL.PluginMod.Enum.Items;

public enum EnumBalls {

    One(0, "One"),
    Two(1, "Two"),
    Three(2, "Three"),
    Four(3, "Four"),
    Five(4, "Five"),
    Six(5, "Six"),
    Seven(6, "Seven");

    private final int meta;
    private final String name;

    private EnumBalls(int meta, String name){

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
