package KAMKEEL.PluginMod.Enum.Blocks;

public enum EnumDark {

    Signature(0, "Signature", 1),
    PureSignature(1, "PureSignature", 1),
    Impure(2, "Impure", 1),
    Pure(3, "Pure", 1);

    private final int meta;
    private final String name;
    private final int harvestLevel;

    private EnumDark(int meta, String name, int harvestLevel){

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
