package KAMKEEL.PluginMod.Enum.Items.Suits;

public enum EnumAddonCard {

    Whisperer(0, "Whisperer"),
    Daybreak(1, "Daybreak"),
    Awen(2, "Awen"),
    Radiance(3, "Radiance");

    private final int meta;
    private final String name;

    private EnumAddonCard(int meta, String name){

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
