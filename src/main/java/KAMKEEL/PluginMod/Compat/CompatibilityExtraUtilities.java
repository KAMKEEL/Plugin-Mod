package KAMKEEL.PluginMod.Compat;

import KAMKEEL.PluginMod.Blocks.*;
import KAMKEEL.PluginMod.Blocks.ItemBlock.ItemBlockColorSlab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import static cpw.mods.fml.common.registry.GameRegistry.findBlock;
import static cpw.mods.fml.common.registry.GameRegistry.registerBlock;

public class CompatibilityExtraUtilities {

    // Stairs
    public static BlockColorStair EUStair;

    // Slabs
    public static Block euSingleSlab;
    public static Block euDoubleSlab;

    static {
        System.out.println("ExtraUtilities compatibility is enabled and running");
        registerItems();
        registerBlocks();
        registerRecipes();
    }

    private static void registerItems() {

    }

    private static void registerBlocks(){

        // Adding Stair Variants
        Block EUCobblestone = findBlock("ExtraUtilities", "color_stonebrick");

        Block EUStoneBrick = findBlock("ExtraUtilities", "colorStoneBrick");

        if(EUCobblestone != null){

            EUStair = new BlockColorStair(EUCobblestone, 0, "euCobble");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUCobblestone, 1, "euCobble");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUCobblestone, 2, "euCobble");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUCobblestone, 3, "euCobble");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUCobblestone, 4, "euCobble");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUCobblestone, 5, "euCobble");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUCobblestone, 6, "euCobble");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUCobblestone, 7, "euCobble");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUCobblestone, 8, "euCobble");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUCobblestone, 9, "euCobble");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUCobblestone, 10, "euCobble");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUCobblestone, 11, "euCobble");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUCobblestone, 12, "euCobble");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUCobblestone, 13, "euCobble");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUCobblestone, 14, "euCobble");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUCobblestone, 15, "euCobble");
            registerBlock(EUStair, EUStair.getFullBlockName());


            // Slabs
            BlockColorSlab singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euCobble","cobblestone", 0);
            BlockColorSlab doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euCobble","cobblestone", 0);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euCobble","cobblestone", 1);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euCobble","cobblestone", 1);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euCobble","cobblestone", 2);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euCobble","cobblestone", 2);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euCobble","cobblestone", 3);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euCobble","cobblestone", 3);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euCobble","cobblestone", 4);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euCobble","cobblestone", 4);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euCobble","cobblestone", 5);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euCobble","cobblestone", 5);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euCobble","cobblestone", 6);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euCobble","cobblestone", 6);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euCobble","cobblestone", 7);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euCobble","cobblestone", 7);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euCobble","cobblestone", 8);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euCobble","cobblestone", 8);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euCobble","cobblestone", 9);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euCobble","cobblestone", 9);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euCobble","cobblestone", 10);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euCobble","cobblestone", 10);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euCobble","cobblestone", 11);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euCobble","cobblestone", 11);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euCobble","cobblestone", 12);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euCobble","cobblestone", 12);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euCobble","cobblestone", 13);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euCobble","cobblestone", 13);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euCobble","cobblestone", 14);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euCobble","cobblestone", 14);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euCobble","cobblestone", 15);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euCobble","cobblestone", 15);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
        }

        if(EUStoneBrick != null){

            EUStair = new BlockColorStair(EUStoneBrick, 0, "euStoneBrick");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUStoneBrick, 1, "euStoneBrick");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUStoneBrick, 2, "euStoneBrick");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUStoneBrick, 3, "euStoneBrick");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUStoneBrick, 4, "euStoneBrick");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUStoneBrick, 5, "euStoneBrick");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUStoneBrick, 6, "euStoneBrick");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUStoneBrick, 7, "euStoneBrick");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUStoneBrick, 8, "euStoneBrick");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUStoneBrick, 9, "euStoneBrick");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUStoneBrick, 10, "euStoneBrick");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUStoneBrick, 11, "euStoneBrick");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUStoneBrick, 12, "euStoneBrick");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUStoneBrick, 13, "euStoneBrick");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUStoneBrick, 14, "euStoneBrick");
            registerBlock(EUStair, EUStair.getFullBlockName());

            EUStair = new BlockColorStair(EUStoneBrick, 15, "euStoneBrick");
            registerBlock(EUStair, EUStair.getFullBlockName());

            // Slabs
            BlockColorSlab singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euStoneBrick","stonebrick", 0);
            BlockColorSlab doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euStoneBrick","stonebrick", 0);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euStoneBrick","stonebrick", 1);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euStoneBrick","stonebrick", 1);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euStoneBrick","stonebrick", 2);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euStoneBrick","stonebrick", 2);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euStoneBrick","stonebrick", 3);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euStoneBrick","stonebrick", 3);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euStoneBrick","stonebrick", 4);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euStoneBrick","stonebrick", 4);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euStoneBrick","stonebrick", 5);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euStoneBrick","stonebrick", 5);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euStoneBrick","stonebrick", 6);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euStoneBrick","stonebrick", 6);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euStoneBrick","stonebrick", 7);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euStoneBrick","stonebrick", 7);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euStoneBrick","stonebrick", 8);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euStoneBrick","stonebrick", 8);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euStoneBrick","stonebrick", 9);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euStoneBrick","stonebrick", 9);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euStoneBrick","stonebrick", 10);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euStoneBrick","stonebrick", 10);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euStoneBrick","stonebrick", 11);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euStoneBrick","stonebrick", 11);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euStoneBrick","stonebrick", 12);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euStoneBrick","stonebrick", 12);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euStoneBrick","stonebrick", 13);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euStoneBrick","stonebrick", 13);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euStoneBrick","stonebrick", 14);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euStoneBrick","stonebrick", 14);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

            singleSlab = (BlockColorSlab)new BlockColorSlab(false, Material.rock, "euStoneBrick","stonebrick", 15);
            doubleSlab = (BlockColorSlab)new BlockColorSlab(true, Material.rock, "euStoneBrick","stonebrick", 15);
            doubleSlab.setDropSlab(singleSlab);

            euSingleSlab = BlockColorSlab.registerBlock(singleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);
            euDoubleSlab = BlockColorSlab.registerBlock(doubleSlab, ItemBlockColorSlab.class, singleSlab, doubleSlab);

        }
    }

    private static void registerRecipes() {

    }
}
