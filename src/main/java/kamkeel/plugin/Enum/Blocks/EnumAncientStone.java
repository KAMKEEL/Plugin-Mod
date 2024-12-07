package kamkeel.plugin.Enum.Blocks;

public enum EnumAncientStone implements IBlockEnum {

    Base(0, "Base", 1),
    Bricks(1, "Bricks", 1),
    Sigil(2, "Sigil", 1),
    Tiles(3, "Tiles", 1),
    Embossed(4, "Embossed", 1),
    Tile(5, "Tile", 1);

    private final int meta;
    private final String name;
    private final int harvestLevel;

    private EnumAncientStone(int meta, String name, int harvestLevel){

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
