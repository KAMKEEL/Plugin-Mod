package KAMKEEL.PluginMod.Items;

import KAMKEEL.PluginMod.Items.Cards.*;
import KAMKEEL.PluginMod.Items.Misc.*;
import KAMKEEL.PluginMod.Items.Weapons.*;
import KAMKEEL.PluginMod.PluginMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static KAMKEEL.PluginMod.Util.PluginMaterials.*;

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
    public static Item Apples;
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
    public static Item plug_ingot;

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

        // Ingots/Materials:
        codium_ingot = new PluginItemInterface(26712).setUnlocalizedName("codium_ingot").setCreativeTab(PluginMod.miscTab).setTextureName("plug:materials/codium_ingot");
        damascus_ingot = new PluginItemInterface(26713).setUnlocalizedName("damascus_ingot").setCreativeTab(PluginMod.miscTab).setTextureName("plug:materials/damascus_ingot");
        deep_ingot = new PluginItemInterface(26714).setUnlocalizedName("deep_ingot").setCreativeTab(PluginMod.miscTab).setTextureName("plug:materials/deep_ingot");
        energy_quartz = new PluginItemInterface(26715).setUnlocalizedName("energy_quartz").setCreativeTab(PluginMod.miscTab).setTextureName("plug:materials/energy_quartz");
        dark_metal_ingot = new PluginItemInterface(26700).setUnlocalizedName("dark_metal").setCreativeTab(PluginMod.miscTab).setTextureName("plug:materials/dark_metal_ingot");
        blue_steel_ingot = new PluginItemInterface(26700).setUnlocalizedName("blue_steel").setCreativeTab(PluginMod.miscTab).setTextureName("plug:materials/blue_steel");
        jungle_ingot = new PluginItemInterface(26700).setUnlocalizedName("jungle_ingot").setCreativeTab(PluginMod.miscTab).setTextureName("plug:materials/jungle_ingot");
        glass_shard = new PluginItemInterface(26700).setUnlocalizedName("glass_shard").setCreativeTab(PluginMod.miscTab).setTextureName("plug:materials/glass_shard");
        plug_ingot = new PluginItemInterface(26712).setUnlocalizedName("plug_ingot").setCreativeTab(PluginMod.miscTab).setTextureName("plug:materials/plug_ingot");

        // Load Weapons
        ModWeapons.init();

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

        // Metadata Items:
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
        Apples = new Apple(4, 1.2F, false);
        GameRegistry.registerItem(Apples, "apples");

        TreasureMap = new TreasureMap().setUnlocalizedName("TreasureMap").setTextureName("plug:extra/treasuremap");
        GameRegistry.registerItem(TreasureMap, TreasureMap.getUnlocalizedName());
        PaperBomb = new PaperBomb().setUnlocalizedName("PaperBomb").setTextureName("plug:weapons/paperbomb");
        GameRegistry.registerItem(PaperBomb, PaperBomb.getUnlocalizedName());

        Item miscItem = new PluginItemInterface(10001).setUnlocalizedName("medkit").setTextureName("plug:extra/medkit").setCreativeTab(PluginMod.miscTab);
        miscItem = new PluginItemInterface(10001).setUnlocalizedName("bandages").setTextureName("plug:extra/bandages").setCreativeTab(PluginMod.miscTab);
        miscItem = new PluginItemInterface(10001).setUnlocalizedName("bell").setTextureName("plug:extra/bell").setCreativeTab(PluginMod.miscTab);
        miscItem = new PluginItemInterface(10001).setUnlocalizedName("energy_catalyst").setTextureName("plug:materials/catalyst").setCreativeTab(PluginMod.miscTab);
        miscItem = new PluginItemInterface(10001).setUnlocalizedName("hyper_catalyst").setTextureName("plug:materials/hyper_catalyst").setCreativeTab(PluginMod.miscTab);
        miscItem = new PluginItemInterface(10001).setUnlocalizedName("horn").setTextureName("plug:extra/horn").setCreativeTab(PluginMod.miscTab);
        miscItem = new PluginItemInterface(10001).setUnlocalizedName("rope").setTextureName("plug:extra/rope").setCreativeTab(PluginMod.miscTab);
        miscItem = new PluginItemInterface(10001).setUnlocalizedName("painkiller").setTextureName("plug:extra/painkiller").setCreativeTab(PluginMod.miscTab);

        miscItem = new PluginItemFoodInterface(10, 0.8F, true).setUnlocalizedName("burrito").setTextureName("plug:extra/burrito").setCreativeTab(PluginMod.miscTab);


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
        PluginMaterial.customCraftingMaterial = plug_ingot;

        OreDictCompact.registerOres();
    }

    public static void initRecipes() {
        GameRegistry.addRecipe(new ItemStack(ModItems.energy_quartz), "121", "232", "121", '1', Items.blaze_powder, '2', Items.quartz, '3', Items.diamond);

        GameRegistry.addRecipe(new ItemStack(ModItems.blue_steel_ingot), "SCS", "CQC", "SCS", 'S', ModItems.damascus_ingot, 'C', ModItems.codium_ingot, 'Q', ModItems.energy_quartz);
        GameRegistry.addRecipe(new ItemStack(ModItems.dark_metal_ingot), "SCS", "CQC", "SCS", 'S', ModItems.damascus_ingot, 'C', ModItems.deep_ingot, 'Q', ModItems.energy_quartz);
        GameRegistry.addRecipe(new ItemStack(ModItems.jungle_ingot), "SCS", "CQC", "SCS", 'S', ModItems.damascus_ingot, 'C', Blocks.vine, 'Q', ModItems.energy_quartz);

        GameRegistry.addRecipe(new ItemStack(ModWeapons.BlueLongSword), "  1", " 2 ", "34 ", '1', ModItems.BlueLongSwordBlade, '2', ModItems.BlueLongSwordGuard, '3', ModItems.BlueLongSwordRod, '4', Items.lava_bucket);
        GameRegistry.addRecipe(new ItemStack(ModWeapons.JungleAxe), "  1", " 2 ", "34 ", '1', ModItems.JungleAxeHead, '2', ModItems.JungleAxeBinding, '3', ModItems.JungleAxeRod, '4', Items.lava_bucket);
        GameRegistry.addRecipe(new ItemStack(ModWeapons.DarkDagger), "  1", " 2 ", "34 ", '1', ModItems.DarkDaggerBlade, '2', ModItems.VoidCharm, '3', ModItems.DarkDaggerHandle, '4', Items.lava_bucket);
        GameRegistry.addRecipe(new ItemStack(ModWeapons.GlassPan), "  1", " 2 ", "34 ", '1', ModItems.GlassDisc, '2', ModItems.GlassPanBinding, '3', ModItems.GlassPanHandle, '4', Items.lava_bucket);

        // Apple Recipes
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Apples, 1, 0), new ItemStack(Items.golden_apple, 1, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Apples, 1, 3), new ItemStack(ModItems.Apples, 1, 1), new ItemStack(Items.blaze_powder, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Apples, 1, 4), new ItemStack(ModItems.Apples, 1, 1), new ItemStack(Items.ghast_tear, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Apples, 1, 5), new ItemStack(ModItems.Apples, 1, 1), new ItemStack(Items.iron_ingot, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Apples, 1, 6), new ItemStack(ModItems.Apples, 1, 1), new ItemStack(Items.glowstone_dust, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Apples, 1, 7), new ItemStack(ModItems.Apples, 1, 1), new ItemStack(Items.sugar, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Apples, 1, 8), new ItemStack(ModItems.Apples, 1, 1), new ItemStack(Items.speckled_melon, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Apples, 1, 9), new ItemStack(ModItems.Apples, 1, 1), new ItemStack(Items.golden_carrot, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Apples, 1, 10), new ItemStack(ModItems.Apples, 1, 1), new ItemStack(Items.magma_cream, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Apples, 1, 11), new ItemStack(ModItems.Apples, 1, 1), new ItemStack(Items.bread, 1, 0));

    }
}