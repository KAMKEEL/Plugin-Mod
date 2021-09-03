package KAMKEEL.PluginMod.Compat;

import KAMKEEL.PluginMod.Blocks.BlockBarrel;
import KAMKEEL.PluginMod.Blocks.BlockPlugSlab;
import KAMKEEL.PluginMod.Blocks.BlockPlugStair;
import KAMKEEL.PluginMod.Blocks.ItemBlock.ItemBlockSlab;
import KAMKEEL.PluginMod.LocalizationHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import static cpw.mods.fml.common.registry.GameRegistry.*;

public class CompatibilityBiomesOPlenty {

    public static Block BOPBarrel;
    public static Block BOPStair;

    // Slabs
    public static Block bopSingleSlab;
    public static Block bopDoubleSlab;

    static {
        System.out.println("Biomes O Plenty compatibility is enabled and running");
        registerItems();
        registerBlocks();
        registerRecipes();
    }

    private static void registerItems() {

    }

    private static void registerBlocks(){
        BOPBarrel = new BlockBarrel("ethereal");
        ((BlockBarrel) BOPBarrel).register();

        BOPBarrel = new BlockBarrel("hellbark");
        ((BlockBarrel) BOPBarrel).register();

        BOPBarrel = new BlockBarrel("fir");
        ((BlockBarrel) BOPBarrel).register();

        BOPBarrel = new BlockBarrel("palm");
        ((BlockBarrel) BOPBarrel).register();

        BOPBarrel = new BlockBarrel("willow");
        ((BlockBarrel) BOPBarrel).register();

        BOPBarrel = new BlockBarrel("jacaranda");
        ((BlockBarrel) BOPBarrel).register();

        BOPBarrel = new BlockBarrel("magic");
        ((BlockBarrel) BOPBarrel).register();

        BOPBarrel = new BlockBarrel("mahogany");
        ((BlockBarrel) BOPBarrel).register();

        BOPBarrel = new BlockBarrel("mangrove");
        ((BlockBarrel) BOPBarrel).register();

        BOPBarrel = new BlockBarrel("redwood");
        ((BlockBarrel) BOPBarrel).register();

        // Adding Stair Variants
        Block BOPRocks = findBlock("BiomesOPlenty", "rocks");
        if(BOPRocks != null){

            BOPStair = new BlockPlugStair(BOPRocks, 0, "limestone").setHardness(1.8F);
            BlockPlugSlab.registerBlock(BOPStair);

            BOPStair = new BlockPlugStair(BOPRocks, 1, "limestonesmooth").setHardness(1.8F);
            BlockPlugSlab.registerBlock(BOPStair);

            BOPStair = new BlockPlugStair(BOPRocks, 2, "siltstone").setHardness(1.8F);
            BlockPlugSlab.registerBlock(BOPStair);

            BOPStair = new BlockPlugStair(BOPRocks, 3, "siltstonesmooth").setHardness(1.8F);
            BlockPlugSlab.registerBlock(BOPStair);

            BOPStair = new BlockPlugStair(BOPRocks, 4, "shale").setHardness(1.8F);
            BlockPlugSlab.registerBlock(BOPStair);

            BOPStair = new BlockPlugStair(BOPRocks, 5, "shalesmooth").setHardness(1.8F);
            BlockPlugSlab.registerBlock(BOPStair);

            BlockPlugSlab singleSlab = (BlockPlugSlab)new BlockPlugSlab(false, Material.rock, BlockPlugSlab.SlabCategory.BOP).setBlockName(LocalizationHelper.MOD_PREFIX + "bopSingleSlab");
            BlockPlugSlab doubleSlab = (BlockPlugSlab)new BlockPlugSlab(true, Material.rock, BlockPlugSlab.SlabCategory.BOP).setBlockName(LocalizationHelper.MOD_PREFIX + "bopDoubleSlab");

            bopSingleSlab = BlockPlugSlab.registerBlock(singleSlab, ItemBlockSlab.class, singleSlab, doubleSlab);
            bopDoubleSlab = BlockPlugSlab.registerBlock(doubleSlab, ItemBlockSlab.class, singleSlab, doubleSlab);

        }
    }

    private static void registerRecipes() {

    }

}
