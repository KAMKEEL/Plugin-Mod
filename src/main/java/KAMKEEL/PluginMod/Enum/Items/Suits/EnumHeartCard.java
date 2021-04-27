package KAMKEEL.PluginMod.Enum.Items.Suits;

public enum EnumHeartCard {

    HeartsAce(0, "Ace"),
    HeartsTwo(1, "Two"),
    HeartsThree(2, "Three"),
    HeartsFour(3, "Four"),
    HeartsFive(4, "Five"),
    HeartsSix(5, "Six"),
    HeartsSeven(6, "Seven"),
    HeartsEight(7, "Eight"),
    HeartsNine(8, "Nine"),
    HeartsTen(9, "Ten"),
    HeartsJack(10, "Jack"),
    HeartsQueen(11, "Queen"),
    HeartsKing(12, "King");

    private final int meta;
    private final String name;

    private EnumHeartCard(int meta, String name){

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
