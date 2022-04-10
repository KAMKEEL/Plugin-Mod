package KAMKEEL.PluginMod.Items.Weapons;

import KAMKEEL.PluginMod.Enum.Items.EnumToolMaterials;
import KAMKEEL.PluginMod.Items.Weapons.Broken.ItemBrokenDagger;
import KAMKEEL.PluginMod.Items.Weapons.Broken.ItemBrokenJungleAxe;
import KAMKEEL.PluginMod.Items.Weapons.Broken.ItemBrokenReversedDagger;
import KAMKEEL.PluginMod.Items.Weapons.Unique.*;
import KAMKEEL.PluginMod.Items.Weapons.Glass.*;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import static KAMKEEL.PluginMod.Util.PluginMaterials.*;

public class ModWeapons {

    ////////////////////////////////////////////////
    // Weapons

    public static Item HunterKnife;
    public static Item HunterKnifeReversed;
    public static Item LeafStaff;
    public static Item BloodScythe;
    public static Item DarkScythe;
    public static Item DarkScytheEnergized;
    public static Item CrystalSpear;

    public static Item GeneralSword;
    public static Item GeneralBroadsword;
    public static Item GeneralWarAxe;
    public static Item GeneralBattleAxe;
    public static Item GeneralBow;
    public static Item GeneralClaw;
    public static Item GeneralScythe;
    public static Item GeneralDagger;
    public static Item GeneralDaggerReversed;
    public static Item GeneralSpear;
    public static Item GeneralStaff;
    public static Item GeneralKatana;
    public static Item GeneralShield;

    // Glass Weapons
    public static Item GlassPan;
    public static Item GlassPanEnergized;
    public static Item GlassPanBroken;
    public static Item GlassKunai;
    public static Item GlassKunaiReversed;
    public static Item GlassCutlass;
    public static Item GlassDagger;
    public static Item GlassDaggerReversed;
    public static Item GlassBlade;

    //-----------------------------------------------------------------------//
    // Unique Weapons
    //// General Uniques
    public static Item GeneralUniqueSword;
    public static Item GeneralUniqueSwordEnergized;

    //// Custom Uniques
    public static Item DarkDagger;
    public static Item DarkDaggerReversed;
    public static Item DarkDaggerEnergized;
    public static Item DarkDaggerReversedEnergized;
    public static Item DarkDaggerBroken;
    public static Item DarkDaggerReversedBroken;
    public static Item BlueLongSword;
    public static Item BlueLongSwordEnergized;
    public static Item BlueLongSwordBroken;
    public static Item JungleAxeBroken;
    public static Item JungleAxe;
    public static Item JungleAxeEnergized;
    //-----------------------------------------------------------------------//

    // Debug Items
    public static Item DebugDagger;
    public static Item DebugDaggerReversed;
    public static Item DebugDaggerEnergized;
    public static Item DebugDaggerReversedEnergized;
    public static Item DebugDaggerBroken;
    public static Item DebugDaggerReversedBroken;

    public static void setTransformItems(ItemUniqueWeapon item1, ItemUniqueWeapon item2){
        item1.setTransformItem(item2);
        item2.setTransformItem(item1);
    }

    public static void setReverseState(ItemUniqueWeapon item1, ItemUniqueWeapon item2){
        item1.setReverseState(item2);
        item2.setReverseState(item1);
    }

    public static void createDagger(String texture, Item.ToolMaterial mat){
        GeneralDagger = new ItemDagger(26701, mat).setUnlocalizedName(texture).setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/" + texture);
        GeneralDaggerReversed = new ItemDaggerReversed(26702, (ItemDagger) GeneralDagger, mat, GeneralDagger).setUnlocalizedName("reverse_" + texture).setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/" + texture);
        ((ItemDagger) GeneralDagger).setReverseState(GeneralDaggerReversed);
    }
    public static void createSpear(String texture, Item.ToolMaterial mat){
        GeneralSpear = new ItemSpear(1, mat).setUnlocalizedName(texture).setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/" + texture);
    }
    public static void createWarAxe(String texture, Item.ToolMaterial mat){
        GeneralWarAxe = new ItemWarAxe(1, mat).setUnlocalizedName(texture).setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/" + texture);
    }
    public static void createBattleAxe(String texture, Item.ToolMaterial mat){
        GeneralBattleAxe = new ItemBattleAxe(1, mat).setUnlocalizedName(texture).setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/" + texture);
    }
    public static void createHammer(String texture, Item.ToolMaterial mat){
        GeneralSpear = new ItemHammer(1, mat).setUnlocalizedName(texture).setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/" + texture);
    }
    public static void createSword(String texture, Item.ToolMaterial mat){
        GeneralSword = new ItemPluginWeaponInterface(1, mat).setUnlocalizedName(texture).setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/" + texture);
    }
    public static void createBroadsword(String texture, Item.ToolMaterial mat){
        GeneralBroadsword = new ItemBroadSword(mat).setUnlocalizedName(texture).setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/" + texture);
    }
    public static void createShield(String texture, EnumToolMaterials mat){
        GeneralShield = new ItemShield(1, mat).setUnlocalizedName(texture).setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/shields/" + texture);
    }
    public static void createRotatedShield(String texture, EnumToolMaterials mat){
        GeneralShield = new ItemRotatedShield(1, mat).setUnlocalizedName(texture).setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/shields/" + texture);
    }

    public static void loadDebugWeapons(){
        // Debug Weapons
        DebugDaggerBroken = new ItemBrokenDagger(1, random).setFull3D().setUnlocalizedName("debug_dagger_broken").setMaxStackSize(1).setTextureName("plug:weapons/debug_dagger_broken");
        DebugDaggerReversedBroken = new ItemBrokenReversedDagger(1, (ItemBrokenDagger) DebugDaggerBroken, random).setFull3D().setUnlocalizedName("reverse_debug_dagger_broken").setMaxStackSize(1).setTextureName("plug:weapons/debug_dagger_broken");
        ((ItemBrokenDagger) DebugDaggerBroken).setReverseState(DebugDaggerReversedBroken);
        ((ItemBrokenReversedDagger) DebugDaggerReversedBroken).setReverseState(DebugDaggerBroken);

        DebugDagger = new ItemUniqueDagger(1, random, true, true, DebugDaggerBroken).setFull3D().setUnlocalizedName("debug_dagger").setMaxStackSize(1).setTextureName("plug:weapons/debug_dagger");
        DebugDaggerReversed = new ItemUniqueDaggerReversed(1, random, true, true, DebugDaggerReversedBroken, (ItemUniqueDagger) DebugDagger).setFull3D().setUnlocalizedName("reverse_" + "debug_dagger").setMaxStackSize(1).setTextureName("plug:weapons/debug_dagger");
        setReverseState((ItemUniqueWeapon)DebugDagger, (ItemUniqueWeapon)DebugDaggerReversed);

        DebugDaggerEnergized = new ItemUniqueDagger(1, random, true, true, DebugDaggerBroken).setFull3D().setUnlocalizedName("debug_dagger_energized").setMaxStackSize(1).setTextureName("plug:weapons/debug_dagger_energized");
        DebugDaggerReversedEnergized = new ItemUniqueDaggerReversed(1, random, true, true, DebugDaggerReversedBroken, (ItemUniqueDagger) DebugDaggerEnergized).setFull3D().setUnlocalizedName("reverse_" + "debug_dagger_energized").setMaxStackSize(1).setTextureName("plug:weapons/debug_dagger_energized");
        setReverseState((ItemUniqueWeapon)DebugDaggerEnergized, (ItemUniqueWeapon)DebugDaggerReversedEnergized);

        setTransformItems((ItemUniqueWeapon)DebugDagger, (ItemUniqueWeapon)DebugDaggerEnergized);
        setTransformItems((ItemUniqueWeapon)DebugDaggerReversed, (ItemUniqueWeapon)DebugDaggerReversedEnergized);
    }

    public static void loadUniqueWeapons(){
        // Broken Weapons:
        DarkDaggerBroken = new ItemBrokenDagger(1, brokenTool).setFull3D().setUnlocalizedName("dark_dagger_custom_broken").setMaxStackSize(1).setTextureName("plug:weapons/dark_dagger_custom_broken");
        DarkDaggerReversedBroken = new ItemBrokenReversedDagger(1, (ItemBrokenDagger) DarkDaggerBroken, brokenTool).setFull3D().setUnlocalizedName("reverse_" + "dark_dagger_custom_broken").setMaxStackSize(1).setTextureName("plug:weapons/dark_dagger_custom_broken");
        ((ItemBrokenDagger) DarkDaggerBroken).setReverseState(DarkDaggerReversedBroken);
        ((ItemBrokenReversedDagger) DarkDaggerReversedBroken).setReverseState(DarkDaggerBroken);

        BlueLongSwordBroken = new ItemWeaponBroken(1, brokenTool).setFull3D().setUnlocalizedName("blue_longsword_custom_broken").setMaxStackSize(1).setTextureName("plug:weapons/blue_longsword_broken");
        JungleAxeBroken = new ItemBrokenJungleAxe(1, brokenTool).setFull3D().setUnlocalizedName("jungle_axe_custom_broken").setMaxStackSize(1).setTextureName("plug:weapons/jungle_axe_broken");
        GlassPanBroken = new ItemGlassPanBroken(1, brokenTool).setFull3D().setUnlocalizedName("glass_pan_custom_broken").setMaxStackSize(1).setTextureName("plug:weapons/glass_pan_broken");

        // Custom Weapons:
        BlueLongSword = new ItemUniqueWeapon(1, custom_blue_steel, true, false, BlueLongSwordBroken).setFull3D().setUnlocalizedName("blue_longsword_custom").setMaxStackSize(1).setTextureName("plug:weapons/blue_longsword");
        BlueLongSwordEnergized = new ItemUniqueWeapon(1, custom_blue_steel, true, false, BlueLongSwordBroken).setFull3D().setUnlocalizedName("blue_longsword_custom_energized").setMaxStackSize(1).setTextureName("plug:weapons/blue_longsword_energized");
        setTransformItems((ItemUniqueWeapon)BlueLongSword, (ItemUniqueWeapon)BlueLongSwordEnergized);

        JungleAxe = new ItemUniqueAxe(1, custom_jungle, true, false, JungleAxeBroken).setFull3D().setUnlocalizedName("jungle_axe_custom").setMaxStackSize(1).setTextureName("plug:weapons/jungle_axe");
        JungleAxeEnergized = new ItemUniqueAxe(1, custom_jungle, true, false, JungleAxeBroken).setFull3D().setUnlocalizedName("jungle_axe_custom_energized").setMaxStackSize(1).setTextureName("plug:weapons/jungle_axe_energized");
        setTransformItems((ItemUniqueWeapon)JungleAxe, (ItemUniqueWeapon)JungleAxeEnergized);

        // Glass Items: Register Renderer in ClientProxy
        GlassPan = new ItemGlassPan(1, custom_glass, true, false,  GlassPanBroken).setFull3D().setUnlocalizedName("glass_pan_custom").setMaxStackSize(1).setTextureName("plug:weapons/glass_pan");
        GlassPanEnergized = new ItemGlassPan(1, custom_glass, true, false,  GlassPanBroken).setUnlocalizedName("glass_pan_custom_energized").setMaxStackSize(1).setTextureName("plug:weapons/glass_pan_energized");
        setTransformItems((ItemUniqueWeapon)GlassPan, (ItemUniqueWeapon)GlassPanEnergized);

        DarkScythe = new ItemUniqueScythe(1, PluginMaterial, true, false).setFull3D().setUnlocalizedName("dark_scythe").setMaxStackSize(1).setTextureName("plug:weapons/dark_scythe");
        DarkScytheEnergized = new ItemUniqueScythe(1, PluginMaterial, true, false).setFull3D().setUnlocalizedName("dark_scythe_energized").setMaxStackSize(1).setTextureName("plug:weapons/dark_scythe_energized");
        setTransformItems((ItemUniqueWeapon)DarkScythe, (ItemUniqueWeapon)DarkScytheEnergized);

        // Unique Daggers
        DarkDagger = new ItemUniqueDagger(1, custom_dark_metal, true, true, DarkDaggerBroken).setFull3D().setUnlocalizedName("dark_dagger_custom").setMaxStackSize(1).setTextureName("plug:weapons/dark_dagger_custom");
        DarkDaggerReversed = new ItemUniqueDaggerReversed(1, custom_dark_metal, true, true, DarkDaggerReversedBroken, (ItemUniqueDagger) DarkDagger).setFull3D().setUnlocalizedName("reverse_" + "dark_dagger_custom").setMaxStackSize(1).setTextureName("plug:weapons/dark_dagger_custom");
        setReverseState((ItemUniqueWeapon)DarkDagger, (ItemUniqueWeapon)DarkDaggerReversed);
        DarkDaggerEnergized = new ItemUniqueDagger(1, custom_dark_metal, true, true, DarkDaggerBroken).setFull3D().setUnlocalizedName("dark_dagger_custom_energized").setMaxStackSize(1).setTextureName("plug:weapons/dark_dagger_custom_energized");
        DarkDaggerReversedEnergized = new ItemUniqueDaggerReversed(1, custom_dark_metal, true, true, DarkDaggerReversedBroken, (ItemUniqueDagger) DarkDaggerEnergized).setFull3D().setUnlocalizedName("reverse_" + "dark_dagger_custom_energized").setMaxStackSize(1).setTextureName("plug:weapons/dark_dagger_custom_energized");
        setReverseState((ItemUniqueWeapon)DarkDaggerEnergized, (ItemUniqueWeapon)DarkDaggerReversedEnergized);
        setTransformItems((ItemUniqueWeapon)DarkDagger, (ItemUniqueWeapon)DarkDaggerEnergized);
        setTransformItems((ItemUniqueWeapon)DarkDaggerReversed, (ItemUniqueWeapon)DarkDaggerReversedEnergized);


        // General Customs:
        GeneralUniqueSword = new ItemUniqueWeapon(1, PluginMaterial, true, false).setFull3D().setUnlocalizedName("aurora_katana").setMaxStackSize(1).setTextureName("plug:weapons/aurora_katana");
        GeneralUniqueSwordEnergized = new ItemUniqueWeapon(1, PluginMaterial, true, false).setFull3D().setUnlocalizedName("aurora_katana_energized").setMaxStackSize(1).setTextureName("plug:weapons/aurora_katana_energized");
        setTransformItems((ItemUniqueWeapon)GeneralUniqueSword, (ItemUniqueWeapon)GeneralUniqueSwordEnergized);

        GeneralUniqueSword = new ItemUniqueWeapon(1, PluginMaterial, true, false).setFull3D().setUnlocalizedName("codium_longsword").setMaxStackSize(1).setTextureName("plug:weapons/codium_longsword");
        GeneralUniqueSwordEnergized = new ItemUniqueWeapon(1, PluginMaterial, true, false).setFull3D().setUnlocalizedName("codium_longsword_energized").setMaxStackSize(1).setTextureName("plug:weapons/codium_longsword_energized");
        setTransformItems((ItemUniqueWeapon)GeneralUniqueSword, (ItemUniqueWeapon)GeneralUniqueSwordEnergized);
    }

    public static void loadGlassWeapons(){
        Item.ToolMaterial glass = EnumHelper.addToolMaterial("GLASS", EnumToolMaterials.GLASS.getHarvestLevel(), EnumToolMaterials.GLASS.getMaxUses(), EnumToolMaterials.GLASS.getEfficiencyOnProperMaterial(), EnumToolMaterials.GLASS.getDamageVsEntity(), EnumToolMaterials.GLASS.getEnchantability());

        GlassBlade = new ItemGlassBlade(glass).setFull3D().setUnlocalizedName("glass_blade").setMaxStackSize(1).setTextureName("plug:weapons/glass_blade");
        GlassCutlass = new ItemGlass(glass).setFull3D().setUnlocalizedName("glass_cutlass").setMaxStackSize(1).setTextureName("plug:weapons/glass_cutlass");
        GlassKunai = new ItemGlassKunai(26703, glass).setFull3D().setUnlocalizedName("glass_kunai").setMaxStackSize(1).setTextureName("plug:weapons/glass_kunai");
        GlassKunaiReversed = new ItemGlassKunaiReversed(26703, (ItemKunai) GlassKunai, glass).setFull3D().setUnlocalizedName("reverse_glass_kunai").setMaxStackSize(1).setTextureName("plug:weapons/glass_kunai");
        GlassDagger = new ItemGlassDagger(26701, glass).setUnlocalizedName("glass_dagger").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/glass_dagger");
        GlassDaggerReversed = new ItemGlassDaggerReversed(26702, (ItemGlassDagger) GlassDagger, glass, GlassDagger).setUnlocalizedName("reverse_" + "glass_dagger").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/glass_dagger");
        ((ItemGlassDagger) GlassDagger).setReverseState(GlassDaggerReversed);

        CrystalSpear = new ItemCrystalSpear(glass).setUnlocalizedName("crystal_spear").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/crystal_spear");

    }

    public static void loadDaggers(){

        HunterKnife = new ItemDagger(26701, PluginMaterial).setUnlocalizedName("hunter_knife").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/" + "hunter_knife");
        HunterKnifeReversed = new ItemDaggerReversed(26702, (ItemDagger) HunterKnife, PluginMaterial, HunterKnife).setUnlocalizedName("reverse_" + "hunter_knife").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/" + "hunter_knife");
        ((ItemDagger) HunterKnife).setReverseState(HunterKnifeReversed);

        createDagger("spirit_knife", PluginMaterial);
        createDagger("eternal_knife", PluginMaterial);
        createDagger("dark_dagger", PluginMaterial);
        createDagger("silver_fang", PluginMaterial);
        createDagger("earth_shard", PluginMaterial);
        createDagger("livid_dagger", PluginMaterial);

        createDagger("amorth_dagger", PluginMaterial);
        createDagger("barrow_dagger", PluginMaterial);
        createDagger("basrol_dagger", PluginMaterial);
        createDagger("bluesteel_dagger", PluginMaterial);
        createDagger("corsair_dagger", PluginMaterial);
        createDagger("cutlin_dagger", PluginMaterial);
        createDagger("cystel_dagger", PluginMaterial);
        createDagger("daedra_dagger", PluginMaterial);
        createDagger("dale_dagger", PluginMaterial);
        createDagger("dated_dagger", PluginMaterial);
        createDagger("doltek_dagger", PluginMaterial);
        createDagger("dyvel_dagger", PluginMaterial);
        createDagger("invar_dagger", PluginMaterial);
        createDagger("kevlo_dagger", PluginMaterial);
        createDagger("light_dagger", PluginMaterial);
        createDagger("orc_dagger", PluginMaterial);
        createDagger("primal_dagger", PluginMaterial);
        createDagger("rol_dagger", PluginMaterial);
        createDagger("ronin_dagger", PluginMaterial);
        createDagger("rustic_dagger", PluginMaterial);
        createDagger("silver_dagger", PluginMaterial);
        createDagger("sinbar_dagger", PluginMaterial);
        createDagger("troy_dagger", PluginMaterial);
        createDagger("vulcan_dagger", PluginMaterial);
        createDagger("wildscum_dagger", PluginMaterial);
        createDagger("obsidian_dagger", PluginMaterial);
        createDagger("maeve_dagger", PluginMaterial);
        createDagger("brass_dagger", PluginMaterial);

        createDagger("cactus_knife", PluginMaterial);

        createDagger("ritual_dagger", PluginMaterial);
    }
    public static void loadSpears(){

        createSpear("vulcan_polearm", PluginMaterial);
        createSpear("cystel_polearm", PluginMaterial);
        createSpear("elvo_polearm", PluginMaterial);
        createSpear("orc_polearm", PluginMaterial);
        createSpear("rol_polearm", PluginMaterial);
        createSpear("silver_polearm", PluginMaterial);

        createSpear("blue_steel_spear", PluginMaterial);
        createSpear("corsair_spear", PluginMaterial);
        createSpear("cutlin_spear", PluginMaterial);
        createSpear("cystel_spear", PluginMaterial);
        createSpear("dale_spear", PluginMaterial);
        createSpear("dark_steel_spear", PluginMaterial);
        createSpear("doltek_spear", PluginMaterial);
        createSpear("dyvel_spear", PluginMaterial);
        createSpear("elvo_spear", PluginMaterial);
        createSpear("hell_spear", PluginMaterial);

        createSpear("invar_spear", PluginMaterial);
        createSpear("jungle_spear", PluginMaterial);
        createSpear("kelvo_spear", PluginMaterial);
        createSpear("light_spear", PluginMaterial);
        createSpear("orc_spear", PluginMaterial);
        createSpear("primal_spear", PluginMaterial);
        createSpear("rol_spear", PluginMaterial);
        createSpear("ronin_spear", PluginMaterial);
        createSpear("rustic_spear", PluginMaterial);
        createSpear("silver_spear", PluginMaterial);

        createSpear("sinbar_spear", PluginMaterial);
        createSpear("uruk_spear", PluginMaterial);
        createSpear("vulcan_spear", PluginMaterial);
        createSpear("wildscum_spear", PluginMaterial);

        createSpear("blue_steel_pike", PluginMaterial);
        createSpear("dale_pike", PluginMaterial);
        createSpear("doltek_pike", PluginMaterial);
        createSpear("invar_pike", PluginMaterial);
        createSpear("kevlo_pike", PluginMaterial);
        createSpear("peldris_trident", PluginMaterial);
        createSpear("rock_pike", PluginMaterial);
        createSpear("rol_pike", PluginMaterial);
        createSpear("rustic_pike", PluginMaterial);
        createSpear("uruk_pike", PluginMaterial);
        createSpear("vulcan_pike", PluginMaterial);
        createSpear("wildscum_pike", PluginMaterial);

    }
    public static void loadWarAxes(){

        createWarAxe("primal_waraxe", PluginMaterial);
        createWarAxe("losar_waraxe", PluginMaterial);
        createWarAxe("rol_waraxe", PluginMaterial);
        createWarAxe("dale_waraxe", PluginMaterial);
        createWarAxe("hell_waraxe", PluginMaterial);
        createWarAxe("kevlo_waraxe", PluginMaterial);
        createWarAxe("orc_waraxe", PluginMaterial);
        createWarAxe("rock_waraxe", PluginMaterial);
        createWarAxe("ronin_waraxe", PluginMaterial);
        createWarAxe("uruk_waraxe", PluginMaterial);
        createWarAxe("wildscum_waraxe", PluginMaterial);

    }
    public static void loadBattleAxe(){
        createBattleAxe("raider_axe", PluginMaterial);
        createBattleAxe("revenant_pickaxe", PluginMaterial);
        createBattleAxe("woodsman", PluginMaterial);
        createBattleAxe("dark_metal_axe", PluginMaterial);
        createBattleAxe("floral_axe", PluginMaterial);
        createBattleAxe("leaf_axe", PluginMaterial);
        createBattleAxe("rusty_axe", PluginMaterial);
        createBattleAxe("mythic_axe", PluginMaterial);
        createBattleAxe("melon_dicer", PluginMaterial);
        createBattleAxe("blood_axe", PluginMaterial);
        createBattleAxe("darkwood_axe", PluginMaterial);
        createBattleAxe("mithril_pickaxe", PluginMaterial);
        createBattleAxe("mayan_pickaxe", PluginMaterial);
        createBattleAxe("heavy_axe", PluginMaterial);
        createBattleAxe("mayan_axe", PluginMaterial);
        createBattleAxe("blue_steel_axe", PluginMaterial);
        createBattleAxe("doltek_axe", PluginMaterial);
        createBattleAxe("elvo_axe", PluginMaterial);
        createBattleAxe("invar_axe", PluginMaterial);
        createBattleAxe("light_axe", PluginMaterial);
        createBattleAxe("native_axe", PluginMaterial);
        createBattleAxe("orc_axe", PluginMaterial);
        createBattleAxe("silver_axe", PluginMaterial);
        createBattleAxe("uruk_axe", PluginMaterial);
        createBattleAxe("wildscum_axe", PluginMaterial);
        createBattleAxe("blue_steel__battleaxe", PluginMaterial);
        createBattleAxe("corsair_battleaxe", PluginMaterial);
        createBattleAxe("dol_battleaxe", PluginMaterial);
        createBattleAxe("doltek_battleaxe", PluginMaterial);
        createBattleAxe("elvo_battleaxe", PluginMaterial);
        createBattleAxe("hell_battleaxe", PluginMaterial);
        createBattleAxe("invar_battleaxe", PluginMaterial);

        createBattleAxe("pig_axe", PluginMaterial);
        createBattleAxe("cow_axe", PluginMaterial);
        createBattleAxe("fungi_cutter", PluginMaterial);
        createBattleAxe("jungle_pickaxe", PluginMaterial);



    }
    public static void loadHammers(){
        createHammer("blue_steel_hammer", PluginMaterial);
        createHammer("cutlin_hammer", PluginMaterial);
        createHammer("doltek_hammer", PluginMaterial);
        createHammer("elvo_hammer", PluginMaterial);
        createHammer("gondor_hammer", PluginMaterial);
        createHammer("hell_hammer", PluginMaterial);
        createHammer("invar_hammer", PluginMaterial);
        createHammer("kevlo_hammer", PluginMaterial);
        createHammer("orc_hammer", PluginMaterial);
        createHammer("rock_hammer", PluginMaterial);
        createHammer("uruk_hammer", PluginMaterial);
        createHammer("wildscum_hammer", PluginMaterial);
    }
    public static void loadSwords(){
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
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("the_necromancer").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/the_necromancer");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("earth_sword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/earth_sword");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("forest_roots").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/forest_roots");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("the_vampire").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/the_vampire");
        GeneralSword = new ItemPluginWeaponInterface(1, PluginMaterial).setUnlocalizedName("blacksmith_hammer").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/blacksmith_hammer");

        createSword("amorth_sword", PluginMaterial);
        createSword("blue_steel_sword", PluginMaterial);
        createSword("brass_sword", PluginMaterial);
        createSword("corsair_sword", PluginMaterial);
        createSword("cystel_sword", PluginMaterial);
        createSword("dale_sword", PluginMaterial);
        createSword("dark_steel_sword_2", PluginMaterial);
        createSword("doltek_sword", PluginMaterial);
        createSword("dyvel_sword", PluginMaterial);
        createSword("elvo_sword", PluginMaterial);
        createSword("glamdo_sword", PluginMaterial);
        createSword("gondor_sword", PluginMaterial);
        createSword("heavy_orc_sword", PluginMaterial);
        createSword("hell_sword", PluginMaterial);
        createSword("invar_sword", PluginMaterial);
        createSword("jungle_sword", PluginMaterial);
        createSword("kevlo_sword", PluginMaterial);
        createSword("light_silver_sword", PluginMaterial);
        createSword("light_sword", PluginMaterial);
        createSword("rol_sword", PluginMaterial);
        createSword("ronin_sword", PluginMaterial);
        createSword("rustic_sword", PluginMaterial);
        createSword("silver_sword", PluginMaterial);
        createSword("sinbar_sword", PluginMaterial);
        createSword("sinbar_sword_2", PluginMaterial);
        createSword("wildscum_sword", PluginMaterial);
        createSword("vulcan_scimitar", PluginMaterial);
        createSword("cutlin_scimitar", PluginMaterial);
        createSword("orc_scimitar", PluginMaterial);
        createSword("orc_scimitar_2", PluginMaterial);
        createSword("rock_scimitar", PluginMaterial);
        createSword("rustic_sickle", PluginMaterial);
        createSword("black_steel_mace", PluginMaterial);
        createSword("rock_mace", PluginMaterial);
        createSword("burnt_mace", PluginMaterial);
        createSword("vulcan_mace", PluginMaterial);
        createSword("sauro_mace", PluginMaterial);

        createSword("vorpal_katana", PluginMaterial);
        createSword("conjuring", PluginMaterial);
        createSword("ruin_dagger", PluginMaterial);
        createSword("valkyrie", PluginMaterial);
        createSword("silver_cutlass", PluginMaterial);
        createSword("revenant", PluginMaterial);
        createSword("warped_sword", PluginMaterial);
        createSword("wither_cloak_sword", PluginMaterial);
        createSword("crypt_sword", PluginMaterial);
        createSword("blaze_sword", PluginMaterial);
        createSword("nether_soul_sword", PluginMaterial);
        createSword("atonement", PluginMaterial);

        createSword("valonite_sword", PluginMaterial);
        createSword("corrosive_sword", PluginMaterial);
        createSword("kuruzi_bat", PluginMaterial);
    }
    public static void loadKatanas(){

        GeneralKatana = new ItemKatana(1, PluginMaterial).setUnlocalizedName("light_katana").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/light_katana");
        GeneralKatana = new ItemKatana(1, PluginMaterial).setUnlocalizedName("jungle_katana").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/jungle_katana");
        GeneralKatana = new ItemKatana(1, PluginMaterial).setUnlocalizedName("wildscum_katana").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/wildscum_katana");
    }
    public static void loadBroadswords(){

        GeneralBroadsword = new ItemBroadSword(PluginMaterial).setUnlocalizedName("dreadlord_broadsword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/dreadlord_sword");
        GeneralBroadsword = new ItemBroadSword(PluginMaterial).setUnlocalizedName("fel_broadsword").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/fel_sword");

        createBroadsword("amorth_broadsword", PluginMaterial);
        createBroadsword("cystel_broadsword", PluginMaterial);
        createBroadsword("gondor_broadsword", PluginMaterial);
        createBroadsword("kevlo_broadsword", PluginMaterial);
        createBroadsword("orc_broadsword", PluginMaterial);
        createBroadsword("rock_broadsword", PluginMaterial);
        createBroadsword("silver_broadsword", PluginMaterial);
        createBroadsword("sinbar_broadsword", PluginMaterial);
        createBroadsword("uruk_broadsword", PluginMaterial);
    }
    public static void loadStaffs(){
        LeafStaff = new ItemGlaive(1, PluginMaterial).setUnlocalizedName("leaf_staff").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/leaf_staff");

        GeneralStaff = new ItemLongStaff(1, PluginMaterial).setUnlocalizedName("jungle_staff").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/jungle_staff");
        GeneralStaff = new ItemLongStaff(1, PluginMaterial).setUnlocalizedName("light_staff").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/light_staff");
    }
    public static void loadScythes(){
        BloodScythe = new ItemScythe(26701, PluginMaterial).setUnlocalizedName("blood_scythe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/blood_scythe");

        GeneralScythe = new ItemScythe(26701, PluginMaterial).setUnlocalizedName("ice_scyte").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/ice_scyte");
        GeneralScythe = new ItemScythe(26701, PluginMaterial).setUnlocalizedName("frozen_scythe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/frozen_scythe");
        GeneralScythe = new ItemScythe(26701, PluginMaterial).setUnlocalizedName("energy_scyte").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/energy_scyte");
        GeneralScythe = new ItemScythe(26701, PluginMaterial).setUnlocalizedName("mayan_scythe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/mayan_scythe");
        GeneralScythe = new ItemScythe(26701, PluginMaterial).setUnlocalizedName("carrot_scythe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/carrot_scythe");
        GeneralScythe = new ItemScythe(26701, PluginMaterial).setUnlocalizedName("mythic_scythe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/mythic_scythe");
        GeneralScythe = new ItemScythe(26701, PluginMaterial).setUnlocalizedName("newton_scythe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/newton_scythe");
        GeneralScythe = new ItemScythe(26701, PluginMaterial).setUnlocalizedName("evil_scythe").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/evil_scythe");
        GeneralScythe = new ItemScythe(26701, PluginMaterial).setUnlocalizedName("crook").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/crook");

        GeneralScythe = new ItemScythe(26701, PluginMaterial).setUnlocalizedName("soul_crook").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/soul_crook");

    }
    public static void loadClaws(){
        GeneralClaw = new ItemClaw(1, PluginMaterial).setUnlocalizedName("quartz_claw").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/quartz_claw");
        GeneralClaw = new ItemClaw(1, PluginMaterial).setUnlocalizedName("gold_claws").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/gold_claws");
        GeneralClaw = new ItemClaw(1, PluginMaterial).setUnlocalizedName("serrated_claws").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/serrated_claws");
        GeneralClaw = new ItemClaw(1, PluginMaterial).setUnlocalizedName("iron_claws").setFull3D().setMaxStackSize(1).setTextureName("plug:weapons/iron_claws");
    }

    public static void loadBows(){
        GeneralBow = new ItemPluginBowInterface("dark_metal_bow").setFull3D().setUnlocalizedName("dark_metal_bow");
        GeneralBow = new ItemPluginBowInterface("death_bow").setFull3D().setUnlocalizedName("death_bow");
        GeneralBow = new ItemPluginBowInterface("end_stone_bow").setFull3D().setUnlocalizedName("end_stone_bow");
        GeneralBow = new ItemPluginBowInterface("explosive_bow").setFull3D().setUnlocalizedName("explosive_bow");
        GeneralBow = new ItemPluginBowInterface("hurricane_bow").setFull3D().setUnlocalizedName("hurricane_bow");
        GeneralBow = new ItemPluginBowInterface("magma_bow").setFull3D().setUnlocalizedName("magma_bow");
        GeneralBow = new ItemPluginBowInterface("mosquito_bow").setFull3D().setUnlocalizedName("mosquito_bow");
        GeneralBow = new ItemPluginBowInterface("scorpion_bow").setFull3D().setUnlocalizedName("scorpion_bow");
        GeneralBow = new ItemPluginBowInterface("spider_bow").setFull3D().setUnlocalizedName("spider_bow");

        GeneralBow = new ItemPluginBowInterface("reaper_bow").setFull3D().setUnlocalizedName("reaper_bow");
        GeneralBow = new ItemPluginBowInterface("cryptic_bow").setFull3D().setUnlocalizedName("cryptic_bow");
        GeneralBow = new ItemPluginBowInterface("sniper_bow").setFull3D().setUnlocalizedName("sniper_bow");
        GeneralBow = new ItemPluginBowInterface("soulstealer_bow").setFull3D().setUnlocalizedName("soulstealer_bow");
        GeneralBow = new ItemPluginBowInterface("spirit_bow").setFull3D().setUnlocalizedName("spirit_bow");
        GeneralBow = new ItemPluginBowInterface("undead_bow").setFull3D().setUnlocalizedName("undead_bow");

    }
    public static void loadShields(){
        createRotatedShield("blackstone_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("blue_steel_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("brass_shield", EnumToolMaterials.PLUGINMATERIAL);
        createShield("constellas_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("copper_shield", EnumToolMaterials.PLUGINMATERIAL);
        createShield("corsair_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("cutlin_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("dark_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("dark_steel_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("deep_shield", EnumToolMaterials.PLUGINMATERIAL);

        createRotatedShield("dread_shield", EnumToolMaterials.PLUGINMATERIAL);
        createShield("electrum_shield", EnumToolMaterials.PLUGINMATERIAL);
        createShield("elementium_shield", EnumToolMaterials.PLUGINMATERIAL);
        createShield("elvo_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("ender_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("flux_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("gold_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("hard_diamond_shield", EnumToolMaterials.PLUGINMATERIAL);
        createShield("heavy_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("heavy_stone_shield", EnumToolMaterials.PLUGINMATERIAL);

        createRotatedShield("invar_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("jungle_shield", EnumToolMaterials.PLUGINMATERIAL);
        createShield("knight_shield", EnumToolMaterials.PLUGINMATERIAL);
        createShield("koi_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("lapis_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("lead_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("light_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("manasteel_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("obsidian_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("orc_shield", EnumToolMaterials.PLUGINMATERIAL);

        createRotatedShield("platinum_shield", EnumToolMaterials.PLUGINMATERIAL);
        createShield("primal_shield", EnumToolMaterials.PLUGINMATERIAL);
        createShield("rock_shield", EnumToolMaterials.PLUGINMATERIAL);
        createShield("rol_shield", EnumToolMaterials.PLUGINMATERIAL);
        createShield("rose_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("royal_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("rune_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("sandstone_shield", EnumToolMaterials.PLUGINMATERIAL);
        createShield("signalum_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("silver_shield", EnumToolMaterials.PLUGINMATERIAL);

        createRotatedShield("sinbar_shield", EnumToolMaterials.PLUGINMATERIAL);
        createShield("spectral_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("steel_shield", EnumToolMaterials.PLUGINMATERIAL);
        createShield("stone_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("terrasteel_shield", EnumToolMaterials.PLUGINMATERIAL);
        createShield("tin_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("turtle_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("uruk_shield", EnumToolMaterials.PLUGINMATERIAL);
        createRotatedShield("void_shield", EnumToolMaterials.PLUGINMATERIAL);
        createShield("wood_shield", EnumToolMaterials.PLUGINMATERIAL);

    }

    public static void init() {
        loadUniqueWeapons();
        loadGlassWeapons();

        loadDaggers();
        loadSpears();
        loadWarAxes();
        loadBattleAxe();
        loadHammers();
        loadSwords();
        loadKatanas();
        loadBroadswords();
        loadStaffs();
        loadScythes();
        loadClaws();

        loadBows();
        loadShields();

        loadDebugWeapons();
    }

}
