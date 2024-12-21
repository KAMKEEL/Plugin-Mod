package kamkeel.plugin.Enum.Blocks;

public enum EnumCreate implements IBlockEnum {

    Raw(0, "Raw", 1),
    Polished(1, "Polished", 1),
    Layer(2, "Layer", 1),
    Brick(3, "Brick", 1),
    Small_Brick(4, "Small_Brick", 1),
    Cut(5, "Cut", 1),
    Pillar(6, "Pillar", 1);

    private final int meta;
    private final String name;
    private final int harvestLevel;

    private EnumCreate(int meta, String name, int harvestLevel){

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
