package kamkeel.plugin.Enum.Blocks;

public enum EnumLightStone implements IBlockEnum {

    Cobble(0, "Cobble", 1),
    Brick(1, "Brick", 1),
    Bismuth(2, "Bismuth", 1),
    Layer(3, "Layer", 1),
    Neon(4, "Neon", 1),
    Prism(5, "Prism", 1),
    Spiral(6, "Spiral", 1),
    Tile(7, "Tile", 1),
    Raw(8, "Raw", 1),
    Crack(9, "Crack", 1);

    private final int meta;
    private final String name;
    private final int harvestLevel;

    private EnumLightStone(int meta, String name, int harvestLevel){

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
