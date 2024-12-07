package kamkeel.plugin.Enum.Blocks;

public enum EnumDeepCrystal {

    Dark(0, "Dark", 1),
    PureDark(1, "PureDark", 1),
    Toxic(2, "Toxic", 1),
    Void(3, "Void", 1),
    PureVoid(4, "PureVoid", 1),
    Ovy(5, "Ovy", 1),
    Rune(6, "Rune", 1),
    Grey(7, "Grey", 1),
    Shadow(8, "Shadow", 1),
    Destox(9, "Destox", 1);

    private final int meta;
    private final String name;
    private final int harvestLevel;

    private EnumDeepCrystal(int meta, String name, int harvestLevel){

        this.meta = meta;
        this.name = name;
        this.harvestLevel = harvestLevel;
    }

    public int getMeta(){
        return this.meta;
    }

    public String getName(){
        return this.name;
    }

    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    public static int count(){
        return values().length;
    }
}
