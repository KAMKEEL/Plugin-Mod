package kamkeel.plugin.Enum.Blocks;

public enum EnumMidnight {

    Base(0, "Base", 1),
    Natural(1, "Natural", 1),
    Pure(2, "Pure", 1),
    Hyper(3, "Hyper", 1),
    Compressed(4, "Compressed", 1);

    private final int meta;
    private final String name;
    private final int harvestLevel;

    private EnumMidnight(int meta, String name, int harvestLevel){

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
