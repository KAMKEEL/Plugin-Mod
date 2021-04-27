package KAMKEEL.PluginMod.Enum.Items;

public enum EnumEnergy {

    DarkRasengan(0, "dark_rasengan"),
    DarkRasenganSpin(1, "dark_rasengan_spin"),
    Rasengan(2, "rasengan"),
    RasenganSpin(3, "rasengan_spin");

    private final int meta;
    private final String name;

    private EnumEnergy(int meta, String name){

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
