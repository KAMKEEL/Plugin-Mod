package KAMKEEL.PluginMod.Enum.Items.Suits;

public enum EnumSpadeCard {

    SpadeAce(0, "Ace"),
    SpadeTwo(1, "Two"),
    SpadeThree(2, "Three"),
    SpadeFour(3, "Four"),
    SpadeFive(4, "Five"),
    SpadeSix(5, "Six"),
    SpadeSeven(6, "Seven"),
    SpadeEight(7, "Eight"),
    SpadeNine(8, "Nine"),
    SpadeTen(9, "Ten"),
    SpadeJack(10, "Jack"),
    SpadeQueen(11, "Queen"),
    SpadeKing(12, "King");

    private final int meta;
    private final String name;

    private EnumSpadeCard(int meta, String name){

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
