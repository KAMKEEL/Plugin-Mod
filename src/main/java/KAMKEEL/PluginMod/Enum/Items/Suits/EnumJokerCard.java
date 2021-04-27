package KAMKEEL.PluginMod.Enum.Items.Suits;

public enum EnumJokerCard {

    JokerRed(0, "Red"),
    JokerBlack(1, "Black");

    private final int meta;
    private final String name;

    private EnumJokerCard(int meta, String name){

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
