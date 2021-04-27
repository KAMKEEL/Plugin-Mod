package KAMKEEL.PluginMod.Items;

import KAMKEEL.PluginMod.Items.Cards.*;
import KAMKEEL.PluginMod.Items.Misc.*;
import KAMKEEL.PluginMod.Items.Weapons.*;
import KAMKEEL.PluginMod.Items.Weapons.Customs.*;
import KAMKEEL.PluginMod.Items.Weapons.Customs.Debug.ItemDebugDagger;
import KAMKEEL.PluginMod.Items.Weapons.Customs.Debug.ItemDebugDaggerBroken;
import KAMKEEL.PluginMod.Items.Weapons.Customs.Debug.ItemDebugDaggerReversed;
import KAMKEEL.PluginMod.Items.Weapons.Customs.Debug.ItemDebugDaggerReversedBroken;
import KAMKEEL.PluginMod.PluginMod;
import KAMKEEL.PluginMod.Enum.Items.EnumToolMaterials;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Stores, initializes, and registers items. Also adds recipes and ore dictionary entries. (Episode 4)
 */
public class ModItems {

    // Cards
    public static Item HeartCard;
    public static Item DiamondCard;
    public static Item SpadeCard;
    public static Item ClubsCard;
    public static Item CardIcon;
    public static Item JokerCard;
    public static Item AddonCard;

    // Misc
    public static Item Pills;
    public static Item Coins;
    public static Item Balls;
    public static Item Eyes;
    public static Item Artifacts;
    public static Item TreasureMap;
    public static Item PaperBomb;

    // Energy
    public static Item EnergyAttacks;
    public static Item VoidRasenshuriken;
    public static Item MassiveRasengan;
    public static Item MassiveRasenganSpin;

    // Materials
    public static Item dark_metal_ingot;
    public static Item blue_steel_ingot;
    public static Item jungle_ingot;
    public static Item glass_shard;

    public static Item codium_ingot;
    public static Item damascus_ingot;
    public static Item deep_ingot;
    public static Item energy_quartz;

    // Weapons
    public static Item DarkMetalDagger;
    public static Item DarkMetalDaggerReversed;
    public static Item SilverFang;
    public static Item SilverFangReversed;
    public static Item HunterKnife;
    public static Item HunterKnifeReversed;
    public static Item SpiritKnife;
    public static Item EternalKnife;
    public static Item SpiritKnifeReversed;
    public static Item EternalKnifeReversed;
    public static Item LeafStaff;
    public static Item BloodScythe;
    public static Item DarkScythe;
    public static Item DarkScytheEnergized;
    public static Item CrystalSpear;


    public static Item GeneralSword;
    public static Item GeneralBroadsword;
    public static Item GeneralBattleAxe;
    public static Item GeneralBow;
    public static Item GeneralClaw;
    public static Item GeneralScythe;
    public static Item GeneralDagger;
    public static Item GeneralDaggerReversed;

    // Custom Weapons
    public static Item DarkDagger;
    public static Item DarkDaggerReversed;
    public static Item DarkDaggerEnergized;
    public static Item DarkDaggerReversedEnergized;
    public static Item DarkDaggerBroken;
    public static Item DarkDaggerReversedBroken;
    public static Item BlueLongSword;
    public static Item BlueLongSwordEnergized;
    public static Item BlueLongSwordBroken;
    public static Item GlassPan;
    public static Item GlassPanEnergized;
    public static Item GlassPanBroken;
    public static Item GlassKunai;
    public static Item GlassKunaiReversed;
    public static Item GlassCutlass;
    public static Item GlassDagger;
    public static Item GlassDaggerReversed;
    public static Item GlassBlade;
    public static Item JungleAxe;
    public static Item JungleAxeEnergized;
    public static Item JungleAxeBroken;



    // Debug Items
    public static Item TestItem;
    public static Item DebugDagger;
    public static Item DebugDaggerReversed;
    public static Item DebugDaggerEnergized;
    public static Item DebugDaggerReversedEnergized;
    public static Item DebugDaggerBroken;
    public static Item DebugDaggerReversedBroken;

    // Custom Weapon Parts
    public static Item BlueLongSwordBlade;
    public static Item BlueLongSwordGuard;
    public static Item BlueLongSwordRod;
    public static Item DarkDaggerBlade;
    public static Item DarkDaggerHandle;
    public static Item VoidCharm;
    public static Item GlassDisc;
    public static Item GlassPanHandle;
    public static Item GlassPanBinding;
    public static Item JungleAxeHead;
    public static Item JungleAxeBinding;
    public static Item JungleAxeRod;


    /**
     * Declare and register items. Do NOT add recipes here!
     */
    public static void init() {

        // Tool Materials
        Item.ToolMaterial dark_metal = EnumHelper.addToolMaterial("DARK_METAL", EnumToolMaterials.DARK_METAL.getHarvestLevel(), EnumToolMaterials.DARK_METAL.getMaxUses(), EnumToolMaterials.DARK_METAL.getEfficiencyOnProperMaterial(), EnumToolMaterials.DARK_METAL.getDamageVsEntity(), EnumToolMaterials.DARK_METAL.getEnchantability());
        Item.ToolMaterial blue_steel = EnumHelper.addToolMaterial("BLUE_STEEL", EnumToolMaterials.BLUE_STEEL.getHarvestLevel(), EnumToolMaterials.BLUE_STEEL.getMaxUses(), EnumToolMaterials.BLUE_STEEL.getEfficiencyOnProperMaterial(), EnumToolMaterials.BLUE_STEEL.getDamageVsEntity(), EnumToolMaterials.BLUE_STEEL.getEnchantability());
        Item.ToolMaterial jungle = EnumHelper.addToolMaterial("JUNGLE", EnumToolMaterials.JUNGLE.getHarvestLevel(), EnumToolMaterials.JUNGLE.getMaxUses(), EnumToolMaterials.JUNGLE.getEfficiencyOnProperMaterial(), EnumToolMaterials.JUNGLE.getDamageVsEntity(), EnumToolMaterials.JUNGLE.getEnchantability());
        Item.ToolMaterial glass = EnumHelper.addToolMaterial("GLASS", EnumToolMaterials.GLASS.getHarvestLevel(), EnumToolMaterials.GLASS.getMaxUses(), EnumToolMaterials.GLASS.getEfficiencyOnProperMaterial(), EnumToolMaterials.GLASS.getDamageVsEntity(), EnumToolMaterials.GLASS.getEnchantability());

        Item.ToolMaterial brokenTool = EnumHelper.addToolMaterial("BROKEN", Item.ToolMaterial.IRON.getHarvestLevel(), 0, Item.ToolMaterial.IRON.getEfficiencyOnProperMaterial(), 1, 0);
        Item.ToolMaterial custom_dark_metal = EnumHelper.addToolMaterial("DARK_METAL", EnumToolMaterials.DARK_METAL.getHarvestLevel(), 100000, EnumToolMaterials.DARK_METAL.getEfficiencyOnProperMaterial(), 7, 0);
        Item.ToolMaterial custom_blue_steel = EnumHelper.addToolMaterial("BLUE_STEEL", EnumToolMaterials.BLUE_STEEL.getHarvestLevel(), 100000, EnumToolMaterials.BLUE_STEEL.getEfficiencyOnProperMaterial(), 7, 0);
        Item.ToolMaterial custom_jungle = EnumHelper.addToolMaterial("JUNGLE", EnumToolMaterials.JUNGLE.getHarvestLevel(), 100000, EnumToolMaterials.JUNGLE.getEfficiencyOnProperMaterial(), 7, 0);
        Item.ToolMaterial custom_glass = EnumHelper.addToolMaterial("GLASS", EnumToolMaterials.GLASS.getHarvestLevel(), 100000, EnumToolMaterials.GLASS.getEfficiencyOnProperMaterial(), 7, 0);
        Item.ToolMaterial random = EnumHelper.addToolMaterial("RANDOM", EnumToolMaterials.GLASS.getHarvestLevel(), 20, EnumToolMaterials.GLASS.getEfficiencyOnProperMaterial(), 7, 0);

        Item.ToolMaterial PluginMaterial = EnumHelper.addToolMaterial("PluginMaterial", Item.ToolMaterial.IRON.getHarvestLevel(), 3000, Item.ToolMaterial.IRON.getEfficiencyOnProperMaterial(), 7, 0);

        // Ingots/Materials:
        codium_ingot = new PluginItemInterface(26712).setUnlocalizedName("codium_ingot").setCreativeTab(PluginMod.miscTab).setTextureName("plug:materials/codium_ingot");
        damascus_ingot = new PluginItemInterface(26713).setUnlocalizedName("damascus_ingot").setCreativeTab(PluginMod.miscTab).setTextureName("plug:materials/damascus_ingot");
        deep_ingot = new PluginItemInterface(26714).setUnlocalizedName("deep_ingot").setCreativeTab(PluginMod.miscTab).setTextureName("plug:materials/deep_ingot");
        energy_quartz = new PluginItemInterface(26715).setUnlocalizedName("energy_quartz").setCreativeTab(PluginMod.miscTab).setTextureName("plug:materials/energy_quartz");
        dark_metal_ingot = new PluginItemInterface(26700).setUnlocalizedName("dark_metal").setCreativeTab(PluginMod.miscTab).setTextureName("plug:materials/dark_metal_ingot");
        blue_steel_ingot = new PluginItemInterface(26700).setUnlocalizedName("blue_steel").setCreativeTab(PluginMod.miscTab).setTextureName("plug:materials/blue_steel");
        jungle_ingot = new PluginItemInterface(26700).setUnlocalizedName("jungle_ingot").setCreativeTab(PluginMod.miscTab).setTextureName("plug:materials/jungle_ingot");
        glass_shard = new PluginItemInterface(26700).setUnlocalizedName("glass_shard").setCreativeTab(PluginMod.miscTab).setTextureName("plug:materials/glass_shard");

        // General Weapons:

        // Daggers
        HunterKnife = new ItemDagger(26701, PluginMaterial).setUnlocalizedName("hunter_knife").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/hunter_knife");
        HunterKnifeReversed = new ItemDaggerReversed(26702, (ItemDagger) HunterKnife, PluginMaterial, HunterKnife).setUnlocalizedName("reverse_" + "hunter_knife").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/hunter_knife");
        ((ItemDagger) HunterKnife).setReverseState(HunterKnifeReversed);
        SpiritKnife = new ItemDagger(26701, Item.ToolMaterial.EMERALD).setUnlocalizedName("spirit_knife").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/spirit_knife");
        SpiritKnifeReversed = new ItemDaggerReversed(26702, (ItemDagger) SpiritKnife, Item.ToolMaterial.EMERALD, SpiritKnife).setUnlocalizedName("reverse_" + "spirit_knife").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/spirit_knife");
        ((ItemDagger) SpiritKnife).setReverseState(SpiritKnifeReversed);
        EternalKnife = new ItemDagger(26701, Item.ToolMaterial.EMERALD).setUnlocalizedName("eternal_knife").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/eternal_knife");
        EternalKnifeReversed = new ItemDaggerReversed(26702, (ItemDagger) EternalKnife, Item.ToolMaterial.EMERALD, EternalKnife).setUnlocalizedName("reverse_" + "eternal_knife").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/eternal_knife");
        ((ItemDagger) EternalKnife).setReverseState(EternalKnifeReversed);
        DarkMetalDagger = new ItemDagger(26701, dark_metal).setUnlocalizedName("dark_dagger").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/dark_dagger");
        DarkMetalDaggerReversed = new ItemDaggerReversed(26702, (ItemDagger) DarkMetalDagger, dark_metal, DarkMetalDagger).setUnlocalizedName("reverse_" + "dark_dagger").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/dark_dagger");
        ((ItemDagger) DarkMetalDagger).setReverseState(DarkMetalDaggerReversed);

        SilverFang = new ItemDagger(26701, dark_metal).setUnlocalizedName("silver_fang").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/silver_fang");
        SilverFangReversed = new ItemDaggerReversed(26702, (ItemDagger) SilverFang, dark_metal, SilverFang).setUnlocalizedName("reverse_" + "silver_fang").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/silver_fang");
        ((ItemDagger) SilverFang).setReverseState(SilverFangReversed);

        GeneralDagger = new ItemDagger(26701, dark_metal).setUnlocalizedName("earth_shard").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/earth_shard");
        GeneralDaggerReversed = new ItemDaggerReversed(26702, (ItemDagger) GeneralDagger, dark_metal, GeneralDagger).setUnlocalizedName("reverse_" + "earth_shard").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/earth_shard");
        ((ItemDagger) GeneralDagger).setReverseState(GeneralDaggerReversed);
        GeneralDagger = new ItemDagger(26701, dark_metal).setUnlocalizedName("livid_dagger").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/livid_dagger");
        GeneralDaggerReversed = new ItemDaggerReversed(26702, (ItemDagger) GeneralDagger, dark_metal, GeneralDagger).setUnlocalizedName("reverse_" + "livid_dagger").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/livid_dagger");
        ((ItemDagger) GeneralDagger).setReverseState(GeneralDaggerReversed);

        // Scythe
        BloodScythe = new ItemScythe(26701, PluginMaterial).setUnlocalizedName("blood_scythe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/blood_scythe");
        DarkScythe = new ItemDarkScythe(1, PluginMaterial).setFull3D().setUnlocalizedName("dark_scythe").setMaxStackSize(1).setTextureName("plug:weapons/dark_scythe");
        DarkScytheEnergized = new ItemDarkScythe(1, PluginMaterial, DarkScythe).setFull3D().setUnlocalizedName("dark_scythe_energized").setMaxStackSize(1).setTextureName("plug:weapons/dark_scythe_energized");
        ((ItemDarkScythe)DarkScythe).setTransformItem(DarkScytheEnergized);

        LeafStaff = new ItemGlaive(1, PluginMaterial).setUnlocalizedName("leaf_staff").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/leaf_staff");
        CrystalSpear = new ItemCrystalSpear(PluginMaterial).setUnlocalizedName("crystal_spear").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/crystal_spear");


        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("amethyst_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/amethyst_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("dragon_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/dragon_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("resin_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/resin_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("cleaver").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/cleaver");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("edible_mace").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/edible_mace");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("ember_mace").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/ember_mace");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("emerald_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/emerald_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("endstone_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/endstone_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("dark_metal_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/dark_metal_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("onyx_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/onyx_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("ivar_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/ivar_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("flame_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/flame_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("golem_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/golem_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("kitchen_knife").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/kitchen_knife");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("spider_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/spider_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("holy_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/holy_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("bronze_cutlass").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/bronze_cutlass");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("prismarine_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/prismarine_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("midnight_fang").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/midnight_fang");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("rogue_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/rogue_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("scorpion_foil").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/scorpion_foil");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("shaman_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/shaman_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("silk_edge").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/silk_edge");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("zero_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/zero_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("tactical_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/tactical_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("undead_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/undead_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("ice_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/ice_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("crimson_cutlass").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/crimson_cutlass");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("golden_cutlass").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/golden_cutlass");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("void_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/void_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("fury_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/fury_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("chaos_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/chaos_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("aspect_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/aspect_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("fiery_wand").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/fiery_wand");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("jade_dagger").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/jade_dagger");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("dark_steel_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/dark_steel_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("silver_rapier").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/silver_rapier");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("ingite").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/ingite");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("golem_sword_2").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/golem_sword_2");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("thorn_knife").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/thorn_knife");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("leaping_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/leaping_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("glass_reaper").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/glass_reaper");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("something_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/something_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("casian").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/casian");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("prismarine_cutlass").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/prismarine_cutlass");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("sacred_reaper").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/sacred_reaper");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("revenant_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/revenant_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("injection").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/injection");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("white_light").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/white_light");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("weaver_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/weaver_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("rotten_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/rotten_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("ooze_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/ooze_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("crystal_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/crystal_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("energy_saber").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/energy_saber");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("trinity_wand").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/trinity_wand");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("astraea").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/astraea");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("dreadlord_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/dreadlord_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("fel_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/fel_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("hyperion").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/hyperion");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("necromancer_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/necromancer_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("necron_blade").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/necron_blade");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("silent_death").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/silent_death");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("knight_cutlass").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/knight_cutlass");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("poison_cutlass").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/poison_cutlass");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("cryptic_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/cryptic_sword");

        GeneralBroadsword = new ItemBroadSword(PluginMaterial).setUnlocalizedName("dreadlord_broadsword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/dreadlord_sword");
        GeneralBroadsword = new ItemBroadSword(PluginMaterial).setUnlocalizedName("fel_broadsword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/fel_sword");

        GeneralBattleAxe = new ItemBattleAxe(1, PluginMaterial).setUnlocalizedName("raider_axe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/raider_axe");
        GeneralBattleAxe = new ItemBattleAxe(1, PluginMaterial).setUnlocalizedName("revenant_pickaxe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/revenant_pickaxe");
        GeneralBattleAxe = new ItemBattleAxe(1, PluginMaterial).setUnlocalizedName("woodsman").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/woodsman");
        GeneralBattleAxe = new ItemBattleAxe(1, PluginMaterial).setUnlocalizedName("dark_metal_axe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/dark_metal_axe");
        GeneralBattleAxe = new ItemBattleAxe(1, PluginMaterial).setUnlocalizedName("floral_axe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/floral_axe");
        GeneralBattleAxe = new ItemBattleAxe(1, PluginMaterial).setUnlocalizedName("leaf_axe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/leaf_axe");
        GeneralBattleAxe = new ItemBattleAxe(1, PluginMaterial).setUnlocalizedName("rusty_axe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/rusty_axe");
        GeneralBattleAxe = new ItemBattleAxe(1, PluginMaterial).setUnlocalizedName("mayan_axe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/mayan_axe");
        GeneralBattleAxe = new ItemBattleAxe(1, PluginMaterial).setUnlocalizedName("mythic_axe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/mythic_axe");
        GeneralBattleAxe = new ItemBattleAxe(1, PluginMaterial).setUnlocalizedName("melon_dicer").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/melon_dicer");
        GeneralBattleAxe = new ItemBattleAxe(1, PluginMaterial).setUnlocalizedName("blood_axe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/blood_axe");
        GeneralBattleAxe = new ItemBattleAxe(1, PluginMaterial).setUnlocalizedName("darkwood_axe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/darkwood_axe");
        GeneralBattleAxe = new ItemBattleAxe(1, PluginMaterial).setUnlocalizedName("mithril_pickaxe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/mithril_pickaxe");
        GeneralBattleAxe = new ItemBattleAxe(1, PluginMaterial).setUnlocalizedName("mayan_pickaxe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/mayan_pickaxe");


        GeneralClaw = new ItemClaw(1, PluginMaterial).setUnlocalizedName("quartz_claw").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/quartz_claw");
        GeneralClaw = new ItemClaw(1, PluginMaterial).setUnlocalizedName("gold_claws").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/gold_claws");
        GeneralClaw = new ItemClaw(1, PluginMaterial).setUnlocalizedName("serrated_claws").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/serrated_claws");
        GeneralClaw = new ItemClaw(1, PluginMaterial).setUnlocalizedName("iron_claws").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/iron_claws");

        GeneralScythe = new ItemScythe(26701, PluginMaterial).setUnlocalizedName("ice_scyte").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/ice_scyte");
        GeneralScythe = new ItemScythe(26701, PluginMaterial).setUnlocalizedName("frozen_scythe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/frozen_scythe");
        GeneralScythe = new ItemScythe(26701, PluginMaterial).setUnlocalizedName("energy_scyte").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/energy_scyte");
        GeneralScythe = new ItemScythe(26701, PluginMaterial).setUnlocalizedName("mayan_scythe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/mayan_scythe");
        GeneralScythe = new ItemScythe(26701, PluginMaterial).setUnlocalizedName("carrot_scythe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/carrot_scythe");
        GeneralScythe = new ItemScythe(26701, PluginMaterial).setUnlocalizedName("mythic_scythe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/mythic_scythe");
        GeneralScythe = new ItemScythe(26701, PluginMaterial).setUnlocalizedName("newton_scythe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/newton_scythe");
        GeneralScythe = new ItemScythe(26701, PluginMaterial).setUnlocalizedName("evil_scythe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/evil_scythe");



        // Bows
        GeneralBow = new ItemPluginBowInterface("dark_metal_bow").setFull3D().setUnlocalizedName("dark_metal_bow");
        GeneralBow = new ItemPluginBowInterface("death_bow").setFull3D().setUnlocalizedName("death_bow");
        GeneralBow = new ItemPluginBowInterface("end_stone_bow").setFull3D().setUnlocalizedName("end_stone_bow");
        GeneralBow = new ItemPluginBowInterface("explosive_bow").setFull3D().setUnlocalizedName("explosive_bow");
        GeneralBow = new ItemPluginBowInterface("hurricane_bow").setFull3D().setUnlocalizedName("hurricane_bow");
        GeneralBow = new ItemPluginBowInterface("magma_bow").setFull3D().setUnlocalizedName("magma_bow");
        GeneralBow = new ItemPluginBowInterface("mosquito_bow").setFull3D().setUnlocalizedName("mosquito_bow");
        GeneralBow = new ItemPluginBowInterface("scorpion_bow").setFull3D().setUnlocalizedName("scorpion_bow");
        GeneralBow = new ItemPluginBowInterface("spider_bow").setFull3D().setUnlocalizedName("spider_bow");

        // Register Glass Items in ClientProxy
        GlassBlade = new ItemGlassBlade(glass).setFull3D().setUnlocalizedName("glass_blade").setMaxStackSize(1).setTextureName("plug:weapons/glass_blade");
        GlassCutlass = new ItemGlass(glass).setFull3D().setUnlocalizedName("glass_cutlass").setMaxStackSize(1).setTextureName("plug:weapons/glass_cutlass");
        GlassKunai = new ItemGlassKunai(26703, glass).setFull3D().setUnlocalizedName("glass_kunai").setMaxStackSize(1).setTextureName("plug:weapons/glass_kunai");
        GlassKunaiReversed = new ItemGlassKunaiReversed(26703, (ItemKunai) GlassKunai, glass).setFull3D().setUnlocalizedName("reverse_glass_kunai").setMaxStackSize(1).setTextureName("plug:weapons/glass_kunai");
        GlassDagger = new ItemGlassDagger(26701, glass).setUnlocalizedName("glass_dagger").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/glass_dagger");
        GlassDaggerReversed = new ItemGlassDaggerReversed(26702, (ItemGlassDagger) GlassDagger, glass, GlassDagger).setUnlocalizedName("reverse_" + "glass_dagger").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/glass_dagger");
        ((ItemGlassDagger) GlassDagger).setReverseState(GlassDaggerReversed);

        // Parts:
        BlueLongSwordBlade = new PluginItemInterface(26700).setUnlocalizedName("blue_longsword_custom_blade").setCreativeTab(PluginMod.miscTab).setTextureName("plug:weapons/parts/blue_longsword_blade");
        BlueLongSwordGuard = new PluginItemInterface(26701).setUnlocalizedName("blue_longsword_custom_guard").setCreativeTab(PluginMod.miscTab).setTextureName("plug:weapons/parts/blue_longsword_guard");
        BlueLongSwordRod = new PluginItemInterface(26702).setUnlocalizedName("blue_longsword_custom_rod").setCreativeTab(PluginMod.miscTab).setTextureName("plug:weapons/parts/blue_longsword_rod");
        DarkDaggerBlade = new PluginItemInterface(26703).setUnlocalizedName("dark_dagger_custom_blade").setCreativeTab(PluginMod.miscTab).setTextureName("plug:weapons/parts/dark_dagger_custom_blade");
        DarkDaggerHandle = new PluginItemInterface(26704).setUnlocalizedName("dark_dagger_custom_handle").setCreativeTab(PluginMod.miscTab).setTextureName("plug:weapons/parts/dark_dagger_custom_handle");
        VoidCharm = new PluginItemInterface(26705).setUnlocalizedName("void_charm").setCreativeTab(PluginMod.miscTab).setTextureName("plug:weapons/parts/void_charm");
        GlassDisc = new PluginItemInterface(26705).setUnlocalizedName("glass_disc").setCreativeTab(PluginMod.miscTab).setTextureName("plug:weapons/parts/glass_disc");
        GlassPanHandle = new PluginItemInterface(26707).setUnlocalizedName("glass_pan_handle").setCreativeTab(PluginMod.miscTab).setTextureName("plug:weapons/parts/glass_pan_handle");
        GlassPanBinding = new PluginItemInterface(26708).setUnlocalizedName("glass_pan_binding").setCreativeTab(PluginMod.miscTab).setTextureName("plug:weapons/parts/glass_pan_binding");
        JungleAxeHead = new PluginItemInterface(26709).setUnlocalizedName("jungle_axe_head").setCreativeTab(PluginMod.miscTab).setTextureName("plug:weapons/parts/jungle_axe_head");
        JungleAxeBinding = new PluginItemInterface(26710).setUnlocalizedName("jungle_axe_binding").setCreativeTab(PluginMod.miscTab).setTextureName("plug:weapons/parts/jungle_axe_binding");
        JungleAxeRod = new PluginItemInterface(26711).setUnlocalizedName("jungle_axe_rod").setCreativeTab(PluginMod.miscTab).setTextureName("plug:weapons/parts/jungle_axe_rod");

        // Broken Weapons:
        DarkDaggerBroken = new ItemDarkDaggerBroken(26703, brokenTool).setFull3D().setUnlocalizedName("dark_dagger_custom_broken").setMaxStackSize(1).setTextureName("plug:weapons/dark_dagger_custom_broken");
        DarkDaggerReversedBroken = new ItemDarkDaggerReversedBroken(26704, (ItemDarkDaggerBroken) DarkDaggerBroken, brokenTool).setFull3D().setUnlocalizedName("reverse_" + "dark_dagger_custom_broken").setMaxStackSize(1).setTextureName("plug:weapons/dark_dagger_custom_broken");
        BlueLongSwordBroken = new ItemBlueLongswordBroken(26703, brokenTool).setFull3D().setUnlocalizedName("blue_longsword_custom_broken").setMaxStackSize(1).setTextureName("plug:weapons/blue_longsword_broken");
        JungleAxeBroken = new ItemJungleAxeBroken(26703, brokenTool).setFull3D().setUnlocalizedName("jungle_axe_custom_broken").setMaxStackSize(1).setTextureName("plug:weapons/jungle_axe_broken");
        GlassPanBroken = new ItemGlassPanBroken(26703, brokenTool).setFull3D().setUnlocalizedName("glass_pan_custom_broken").setMaxStackSize(1).setTextureName("plug:weapons/glass_pan_broken");

        // Custom Weapons:
        DarkDagger = new ItemDarkDagger(26703, custom_dark_metal, DarkDaggerBroken).setFull3D().setUnlocalizedName("dark_dagger_custom").setMaxStackSize(1).setTextureName("plug:weapons/dark_dagger_custom");
        DarkDaggerReversed = new ItemDarkDaggerReversed(26704, (ItemDagger) DarkDagger, custom_dark_metal, DarkDagger).setFull3D().setUnlocalizedName("reverse_" + "dark_dagger_custom").setMaxStackSize(1).setTextureName("plug:weapons/dark_dagger_custom");
        ((ItemDarkDagger) DarkDagger).setReverseState(DarkDaggerReversed);
        ((ItemDarkDagger) DarkDaggerReversed).setReverseState(DarkDagger);
        DarkDaggerEnergized = new ItemDarkDagger(26703, custom_dark_metal, DarkDaggerBroken, DarkDagger).setFull3D().setUnlocalizedName("dark_dagger_custom_energized").setMaxStackSize(1).setTextureName("plug:weapons/dark_dagger_custom_energized");
        DarkDaggerReversedEnergized = new ItemDarkDaggerReversed(26704, (ItemDagger) DarkDaggerEnergized, custom_dark_metal, DarkDaggerReversedBroken, DarkDaggerReversed).setFull3D().setUnlocalizedName("reverse_" + "dark_dagger_custom_energized").setMaxStackSize(1).setTextureName("plug:weapons/dark_dagger_custom_energized");
        ((ItemDagger) DarkDaggerEnergized).setReverseState(DarkDaggerReversedEnergized);
        ((ItemDagger) DarkDaggerReversedEnergized).setReverseState(DarkDaggerEnergized);
        ((ItemDarkDagger) DarkDagger).setTransformItem(DarkDaggerEnergized);
        ((ItemDarkDagger) DarkDaggerReversed).setTransformItem(DarkDaggerReversedEnergized);

        BlueLongSword = new ItemBlueLongsword(26703, custom_blue_steel, BlueLongSwordBroken).setFull3D().setUnlocalizedName("blue_longsword_custom").setMaxStackSize(1).setTextureName("plug:weapons/blue_longsword");
        BlueLongSwordEnergized = new ItemBlueLongsword(26703, custom_blue_steel, BlueLongSwordBroken, BlueLongSword).setFull3D().setUnlocalizedName("blue_longsword_custom_energized").setMaxStackSize(1).setTextureName("plug:weapons/blue_longsword_energized");
        ((ItemBlueLongsword)BlueLongSword).setTransformItem(BlueLongSwordEnergized);

        JungleAxe = new ItemJungleAxe(26703, custom_jungle, JungleAxeBroken).setFull3D().setUnlocalizedName("jungle_axe_custom").setMaxStackSize(1).setTextureName("plug:weapons/jungle_axe");
        JungleAxeEnergized = new ItemJungleAxe(26703, custom_jungle, JungleAxeBroken, JungleAxe).setFull3D().setUnlocalizedName("jungle_axe_custom_energized").setMaxStackSize(1).setTextureName("plug:weapons/jungle_axe_energized");
        ((ItemJungleAxe)JungleAxe).setTransformItem(JungleAxeEnergized);

        // Glass Items: Register Renderer in ClientProxy
        GlassPan = new ItemGlassPan(26703, custom_glass, GlassPanBroken).setFull3D().setUnlocalizedName("glass_pan_custom").setMaxStackSize(1).setTextureName("plug:weapons/glass_pan");
        GlassPanEnergized = new ItemGlassPan(27485, custom_glass, GlassPanBroken, GlassPan).setUnlocalizedName("glass_pan_custom_energized").setMaxStackSize(1).setTextureName("plug:weapons/glass_pan_energized");
        ((ItemGlassPan)GlassPan).setTransformItem(GlassPanEnergized);

        // Debug Weapons
        TestItem = new ItemPluginBrokenWeaponInterface(26703, random, GlassPanBroken).setFull3D().setUnlocalizedName("debug_item").setMaxStackSize(1).setTextureName("plug:weapons/glass_pan");
        DebugDaggerBroken = new ItemDebugDaggerBroken(101, random).setFull3D().setUnlocalizedName("debug_dagger_broken").setMaxStackSize(1).setTextureName("plug:weapons/debug_dagger_broken");
        DebugDaggerReversedBroken = new ItemDebugDaggerReversedBroken(102, (ItemDebugDaggerBroken) DebugDaggerBroken, random).setFull3D().setUnlocalizedName("reverse_debug_dagger_broken").setMaxStackSize(1).setTextureName("plug:weapons/debug_dagger_broken");
        DebugDagger = new ItemDebugDagger(103, random, DebugDaggerBroken).setFull3D().setUnlocalizedName("debug_dagger").setMaxStackSize(1).setTextureName("plug:weapons/debug_dagger");
        DebugDaggerReversed = new ItemDebugDaggerReversed(105, (ItemDagger) DebugDagger, random, DebugDaggerReversedBroken).setFull3D().setUnlocalizedName("reverse_debug_dagger").setMaxStackSize(1).setTextureName("plug:weapons/debug_dagger");
        DebugDaggerEnergized = new ItemDebugDagger(104, random, DebugDaggerBroken, DebugDagger).setFull3D().setUnlocalizedName("debug_dagger_energized").setMaxStackSize(1).setTextureName("plug:weapons/debug_dagger_energized");
        DebugDaggerReversedEnergized = new ItemDebugDaggerReversed(106, (ItemDagger) DebugDaggerEnergized, random, DebugDaggerReversedBroken, DebugDaggerReversed).setFull3D().setUnlocalizedName("reverse_debug_dagger_energized").setMaxStackSize(1).setTextureName("plug:weapons/debug_dagger_energized");
        ((ItemDagger) DebugDagger).setReverseState(DebugDaggerReversed);
        ((ItemDagger) DebugDaggerReversed).setReverseState(DebugDagger);
        ((ItemDagger) DebugDaggerEnergized).setReverseState(DebugDaggerReversedEnergized);
        ((ItemDagger) DebugDaggerReversedEnergized).setReverseState(DebugDaggerEnergized);
        ((ItemDebugDagger) DebugDagger).setTransformItem(DebugDaggerEnergized);
        ((ItemDebugDagger) DebugDaggerReversed).setTransformItem(DebugDaggerReversedEnergized);

        // Blocks:

        // Items:
        Pills = new Pills();
        GameRegistry.registerItem(Pills, "pills");
        Coins = new Coins();
        GameRegistry.registerItem(Coins, "coins");
        Eyes = new Eyes();
        GameRegistry.registerItem(Eyes, "eyes");
        Balls = new Balls();
        GameRegistry.registerItem(Balls, "balls");
        Artifacts = new Artifacts();
        GameRegistry.registerItem(Artifacts, "artifacts");
        EnergyAttacks = new Energy();
        GameRegistry.registerItem(EnergyAttacks, "energy");
        TreasureMap = new TreasureMap().setUnlocalizedName("TreasureMap").setTextureName("plug:extra/treasuremap");
        GameRegistry.registerItem(TreasureMap, TreasureMap.getUnlocalizedName());
        PaperBomb = new PaperBomb().setUnlocalizedName("PaperBomb").setTextureName("plug:weapons/paperbomb");
        GameRegistry.registerItem(PaperBomb, PaperBomb.getUnlocalizedName());

        Item miscItem = new PluginItemInterface(10001).setUnlocalizedName("medkit").setTextureName("plug:extra/medkit").setCreativeTab(PluginMod.miscTab);
        miscItem = new PluginItemInterface(10001).setUnlocalizedName("bell").setTextureName("plug:extra/bell").setCreativeTab(PluginMod.miscTab);
        miscItem = new PluginItemInterface(10001).setUnlocalizedName("burrito").setTextureName("plug:extra/burrito").setCreativeTab(PluginMod.miscTab);
        miscItem = new PluginItemInterface(10001).setUnlocalizedName("energy_catalyst").setTextureName("plug:materials/catalyst").setCreativeTab(PluginMod.miscTab);

        VoidRasenshuriken = new VoidRasenshuriken(10001, random).setUnlocalizedName("VoidRasenshuriken").setTextureName("plug:energy/voidrasenshuriken");
        MassiveRasengan = new MassiveRasengan().setUnlocalizedName("massiverasengan").setTextureName("plug:energy/massive_rasengan");
        MassiveRasenganSpin = new MassiveRasengan().setUnlocalizedName("massiverasengan_spin").setTextureName("plug:energy/massive_rasengan_spin");


        // Cards
        HeartCard = new HeartCard();
        GameRegistry.registerItem(HeartCard, "hearts_card");
        DiamondCard = new DiamondCard();
        GameRegistry.registerItem(DiamondCard, "diamond_card");
        SpadeCard = new SpadeCard();
        GameRegistry.registerItem(SpadeCard, "spade_card");
        ClubsCard = new ClubsCard();
        GameRegistry.registerItem(ClubsCard, "clubs_card");
        JokerCard = new JokerCard();
        GameRegistry.registerItem(JokerCard, "joker_card");
        CardIcon = new CardIcon().setUnlocalizedName("CardIcon").setTextureName("plug:cards/plugcard");
        GameRegistry.registerItem(CardIcon, CardIcon.getUnlocalizedName());
        AddonCard = new AddonCard();
        GameRegistry.registerItem(AddonCard, "addon_card");

        // Ingot Assignment
        dark_metal.customCraftingMaterial = dark_metal_ingot;
        custom_dark_metal.customCraftingMaterial = dark_metal_ingot;
        glass.customCraftingMaterial = glass_shard;
        custom_glass.customCraftingMaterial = glass_shard;
        random.customCraftingMaterial = glass_shard;
        jungle.customCraftingMaterial = jungle_ingot;
        custom_jungle.customCraftingMaterial = jungle_ingot;
        blue_steel.customCraftingMaterial = blue_steel_ingot;
        custom_blue_steel.customCraftingMaterial = blue_steel_ingot;
        OreDictCompact.registerOres();
    }

    public static void initRecipes() {
        GameRegistry.addRecipe(new ItemStack(ModItems.energy_quartz), "121", "232", "121", '1', Items.blaze_powder, '2', Items.quartz, '3', Items.diamond);

        GameRegistry.addRecipe(new ItemStack(ModItems.blue_steel_ingot), "SCS", "CQC", "SCS", 'S', ModItems.damascus_ingot, 'C', ModItems.codium_ingot, 'Q', ModItems.energy_quartz);
        GameRegistry.addRecipe(new ItemStack(ModItems.dark_metal_ingot), "SCS", "CQC", "SCS", 'S', ModItems.damascus_ingot, 'C', ModItems.deep_ingot, 'Q', ModItems.energy_quartz);
        GameRegistry.addRecipe(new ItemStack(ModItems.jungle_ingot), "SCS", "CQC", "SCS", 'S', ModItems.damascus_ingot, 'C', Blocks.vine, 'Q', ModItems.energy_quartz);

        GameRegistry.addRecipe(new ItemStack(ModItems.BlueLongSword), "  1", " 2 ", "34 ", '1', ModItems.BlueLongSwordBlade, '2', ModItems.BlueLongSwordGuard, '3', ModItems.BlueLongSwordRod, '4', Items.lava_bucket);
        GameRegistry.addRecipe(new ItemStack(ModItems.JungleAxe), "  1", " 2 ", "34 ", '1', ModItems.JungleAxeHead, '2', ModItems.JungleAxeBinding, '3', ModItems.JungleAxeRod, '4', Items.lava_bucket);
        GameRegistry.addRecipe(new ItemStack(ModItems.DarkDagger), "  1", " 2 ", "34 ", '1', ModItems.DarkDaggerBlade, '2', ModItems.VoidCharm, '3', ModItems.DarkDaggerHandle, '4', Items.lava_bucket);
        GameRegistry.addRecipe(new ItemStack(ModItems.GlassPan), "  1", " 2 ", "34 ", '1', ModItems.GlassDisc, '2', ModItems.GlassPanBinding, '3', ModItems.GlassPanHandle, '4', Items.lava_bucket);
    }
}