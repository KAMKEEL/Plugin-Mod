package kamkeel.plugin.Enum.Blocks;

public enum EnumEldritch implements IBlockEnum {

    Base(0, "Base", 1),
    Natural(1, "Natural", 1),
    Engraved(2, "Engraved", 1),
    Brick(3, "Brick", 1),
    Tile(4, "Tile", 1),
    Stone(5, "Stone", 1),
    Lamp(6, "Lamp", 1);

    private final int meta;
    private final String name;
    private final int harvestLevel;

    private EnumEldritch(int meta, String name, int harvestLevel){

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
}
