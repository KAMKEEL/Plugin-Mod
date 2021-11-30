package KAMKEEL.PluginMod.Enum.Items;

public enum EnumApples {

    Classic(0, "Classic"),          // Regular
    Founding(1, "Founding"),        // Crafting Apple
    Vintage(2, "Vintage"),          // Stronger Regular
    Rage(3, "Rage"),                // Strength
    Mend(4, "Mend"),                // + Regen
    Shield(5, "Shield"),            // Resistance
    Buffer(6, "Buffer"),            // + Absorption
    Swift(7, "Swift"),              // Speed
    Boost(8, "Boost"),              // + Instant Health [IntHealth]
    Alert(9, "Alert"),              // Night Vision, Haste
    Element(10, "Element"),         // Water Breathing, Fire Resistance
    Full(11, "Full"),               // Saturation
    Drunk(12, "Drunk"),             // Strength, Speed          --- Nausea
    Tank(13, "Tank"),               // Resistance, Absorption   --- Slowness
    Rotten(14, "Rotten"),           // Regen, IntHealth         --- Hunger
    Corrupt(15, "Corrupt"),         // Random Effect [Stronger]
    Reinforced(16, "Reinforced"),   // Resistance III           --- Weakness
    Toxic(17, "Toxic"),             // Saturation, IntHealth    --- Poison
    Odd(18, "Odd");                 // NightVis, FireRes

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
