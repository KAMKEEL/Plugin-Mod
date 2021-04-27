package KAMKEEL.PluginMod.Enum.Items;

public enum EnumPills {

    Basic(0, "Basic"), // 5
    Advanced(1, "Advanced"), // 10
    Pioneer(2, "Pioneer"), // 15
    Expertise(3, "Expertise"), // 30
    Arcane(4, "Arcane"), // 40
    Mystical(5, "Mystical"), // 50
    Godly(6, "Godly"), // Restore
    Split(7, "Split"), // 7-7
    Fissure(8, "Fissure"), // 15-15
    Shift(9, "Shift"), // 10 ANY CATEGORY
    Aqua(10, "Aqua"),
    Aura(11, "Aura"),
    Core(12, "Core"),
    Corrupt(13, "Corrupt"),
    Dark(14, "Dark"),
    Fiery(15, "Fiery"),
    Freeze(16, "Freeze"),
    Heart(17, "Heart"),
    Rebound(18, "Rebound"),
    Spirit(19, "Spirit"),
    Nature(20, "Nature"),
    Desert(21, "Desert"),
    Magma(22, "Magma"),
    ExtraOne(23, "ExtraOne"),
    ExtraTwo(24, "ExtraTwo"),
    ExtraThree(25, "ExtraThree"),
    ExtraFour(26, "ExtraFour"),
    ExtraFive(27, "ExtraFive"),
    ExtraSix(28, "ExtraSix"),
    ExtraSeven(29, "ExtraSeven"),
    ExtraEight(30, "ExtraEight"),
    ExtraNine(31, "ExtraNine"),
    ExtraTen(32, "ExtraTen"),
    Native(33, "Native"),
    Foreign(34, "Foreign"),
    AuraEnergy(35, "AuraEnergy");

    private final int meta;
    private final String name;

    private EnumPills(int meta, String name){

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
