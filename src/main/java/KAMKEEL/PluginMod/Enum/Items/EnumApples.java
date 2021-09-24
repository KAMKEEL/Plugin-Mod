package KAMKEEL.PluginMod.Enum.Items;

public enum EnumApples {

    Classic(0, "Classic"),   // Regular
    Founding(1, "Founding"), // Crafting Apple
    Vintage(2, "Vintage"),   // Stronger Regular
    Rage(3, "Rage"),         // Strength Apple
    Mend(4, "Mend"),         // More Regen
    Shield(5, "Shield"),     // More Resistance
    Buffer(6, "Buffer"),     // More Absorption
    Swift(7, "Swift"),       // More Speed
    Boost(8, "Boost"),       // More Instant Health
    Alert(9, "Alert"),       // Night Vision, Haste
    Element(10, "Element"),  // Water Breathing, Fire Resistance
    Full(11, "Full"),        // Saturation Apple
    Drunk(12, "Drunk"),      // Strong Boost   ---  Nausea
    Tank(13, "Tank");        // Resistance, Absorption --- Slowness

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
