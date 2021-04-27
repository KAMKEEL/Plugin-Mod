package KAMKEEL.PluginMod.Enum.Items;

public enum EnumArtifacts {

    StoneEgg(0, "artifact_stoneegg"),
    Primary(1, "artifact_primary"),
    Amulet(2, "artifact_amulet"),
    Book(3, "artifact_book"),
    Totem(4, "artifact_totem"),
    Necklace(5, "artifact_necklace"),
    Doll(6, "artifact_doll"),
    Tooth(7, "artifact_tooth"),
    Trinity(8, "artifact_trinity"),
    Resonant_Pearl(9, "artifact_resonant_pearl"),
    Energy_amplifier(10, "artifact_energy_amplifier"),
    Divinity(11, "artifact_divinity"),
    Magic_stew(12, "artifact_magic_stew"),
    Luck(13, "artifact_luck"),
    Void_lasso(14, "void_lasso"),
    Dark_orb(15, "dark_orb"),
    Diamond_Atom(16, "diamond_atom"),
    Dungeon_chest_key(17, "dungeon_chest_key"),
    Seal_scroll(18, "seal_scroll"),
    Charge_crystal(19, "charge_crystal"),
    Journal_entry(20, "journal_entry"),
    Eyes_of_remnant(21, "eyes_of_remnant"),
    lasr_eye(22, "lasr_eye"),
    Dark_pendant(23, "dark_pendant"),
    Magical_map(24, "magical_map"),
    Mimic_fragment(25, "mimic_fragment"),
    Ward(26, "ward"),
    Chalice(27, "chalice"),
    Warped_stone(28, "warped_stone"),
    Health_cube(29, "health_cube"),
    Power_cube(30, "power_cube"),
    Poison_cube(31, "poison_cube"),
    Midas_jewel(32, "midas_jewel"),
    Necromancer(33, "necromancer"),
    Ancient_rose(34, "ancient_rose"),
    Shark_fin(35, "shark_fin"),
    Shark_necklace(36, "shark_necklace"),
    Villium(37, "villium"),
    Glacite_jewel(38, "glacite_jewel"),
    Goblin_egg(39, "goblin_egg"),
    Petrified_stone(40, "petrified_stone"),
    Crystal_geode(41, "crystal_geode"),
    Plasma_nucleus(42, "plasma_nucleus"),
    Kat_flower(43, "kat_flower"),
    Balance_scroll(44, "balance_scroll"),
    Dark_scroll(45, "dark_scroll"),
    Demon_scroll(46, "demon_scroll"),
    Gold_scroll(47, "gold_scroll");

    private final int meta;
    private final String name;

    private EnumArtifacts(int meta, String name){

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
