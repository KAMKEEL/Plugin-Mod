package KAMKEEL.PluginMod.Enum.Items.Suits;

public enum EnumClubsCard {

    ClubsAce(0, "Ace"),
    ClubsTwo(1, "Two"),
    ClubsThree(2, "Three"),
    ClubsFour(3, "Four"),
    ClubsFive(4, "Five"),
    ClubsSix(5, "Six"),
    ClubsSeven(6, "Seven"),
    ClubsEight(7, "Eight"),
    ClubsNine(8, "Nine"),
    ClubsTen(9, "Ten"),
    ClubsJack(10, "Jack"),
    ClubsQueen(11, "Queen"),
    ClubsKing(12, "King");

    private final int meta;
    private final String name;

    private EnumClubsCard(int meta, String name){

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
