package KAMKEEL.PluginMod.Enum.Items.Suits;

public enum EnumDiamondCard {

    DiamondAce(0, "Ace"),
    DiamondTwo(1, "Two"),
    DiamondThree(2, "Three"),
    DiamondFour(3, "Four"),
    DiamondFive(4, "Five"),
    DiamondSix(5, "Six"),
    DiamondSeven(6, "Seven"),
    DiamondEight(7, "Eight"),
    DiamondNine(8, "Nine"),
    DiamondTen(9, "Ten"),
    DiamondJack(10, "Jack"),
    DiamondQueen(11, "Queen"),
    DiamondKing(12, "King");

    private final int meta;
    private final String name;

    private EnumDiamondCard(int meta, String name){

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
