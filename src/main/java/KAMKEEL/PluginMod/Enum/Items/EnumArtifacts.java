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
    Gold_scroll(47, "gold_scroll"),
    Precursor_gem(48, "precursor_gem"),
    Sorrow(49, "sorrow"),
    Zem_orb(50, "zem_orb"),
    Forbidden_flower(51, "forbidden_flower"),
    Spirit_leap(52, "spirit_leap"),
    Blood_skull(53, "blood_skull"),
    Master_skull(54, "master_skull"),
    Krodo_orb(55, "krodo_orb"),
    Golden_lasso(56, "golden_lasso"),
    Heat_core(57, "heat_core"),
    Codex(58, "codex"),
    Poison_blob(59, "poison_blob"),
    Void_scroll(60, "void_scroll"),
    Red_scarf(62, "red_scarf"),
    Veskin_hide(63, "veskin_hide"),
    Crimson_vortex(64, "crimson_vortex"),
    Saving_grace(65, "saving_grace"),
    Bonzo_fragment(66, "bonzo_fragment"),
    Livid_fragment(67, "livid_fragment"),
    Prehistoric_egg(68, "prehistoric_egg"),
    Queen_soul(69, "queen_soul"),
    Aspiring_leap(70, "aspiring_leap"),
    Reaper_orb(71, "reaper_orb"),
    Hidden_zone(72, "hidden_zone"),
    Lucky_dice(73, "lucky_dice"),
    Moon_gem(74, "moon_gem"),
    Holy_stone(75, "holy_stone"),
    Dark_auction(76, "dark_auction"),
    Magma_bucket(77, "magma_bucket"),
    Corleonite(78, "corleonite"),
    Jungle_heart(79, "jungle_heart"),
    Wither_catalyst(80, "wither_catalyst"),
    Blue_blood(81, "blue_blood");

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
