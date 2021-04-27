package KAMKEEL.PluginMod.Enum.Items;

public enum EnumEyes {

    SharinganOne(0, "SharinganOne"),
    SharinganTwo(1, "SharinganTwo"),
    SharinganThree(2, "SharinganThree"),
    Byakugan(3, "Byakugan"),
    Rinnegan(4, "Rinnegan");

    private final int meta;
    private final String name;

    private EnumEyes(int meta, String name){

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
