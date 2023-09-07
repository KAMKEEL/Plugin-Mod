package kamkeel.plugin.Enum.Blocks;

public enum EnumRage {

    Lucid(0, "Lucid", 1),
    Base(1, "Base", 1),
    Natural(2, "Natural", 1),
    Pure(3, "Pure", 1),
    Danger(4, "Danger", 1),
    Compressed(5, "Compressed", 1);

    private final int meta;
    private final String name;
    private final int harvestLevel;

    private EnumRage(int meta, String name, int harvestLevel){

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
