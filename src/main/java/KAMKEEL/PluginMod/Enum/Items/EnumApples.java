package KAMKEEL.PluginMod.Enum.Items;

public enum EnumApples {

    Classic(0, "Classic"), // Regular
    Vintage(1, "Vintage"), // Stronger Regular
    Rage(2, "Rage"),       // Strength Apple
    Mend(3, "Mend"),       // More Regen
    Shield(4, "Shield"),   // More Resistance
    Buffer(5, "Buffer"),   // More Absorption
    Swift(6, "Swift"),     // More Speed
    Boost(7, "Boost"),     // More Instant Health
    Alert(8, "Alert"),     // Night Vision, Haste
    Element(9, "Element"), // Water Breathing, Fire Resistance
    Full(10, "Full"),      // Saturation Apple
    Drunk(11, "Drunk"),    // Strong Boost   ---  Nausea
    Tank(12, "Tank");      // Resistance, Absorption --- Slowness

    private final int meta;
    private final String name;

    private EnumApples(int meta, String name){

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
