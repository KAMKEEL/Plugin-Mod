package KAMKEEL.PluginMod.Blocks;

import KAMKEEL.PluginMod.Blocks.ItemBlock.BlockDark;
import KAMKEEL.PluginMod.Enum.Blocks.*;
import KAMKEEL.PluginMod.PluginMod;
import KAMKEEL.PluginMod.Blocks.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;


/**
 * Stores, initializes, and registers items. Also adds recipes and ore dictionary entries. (Episode 4)
 */
public class ModBlocks {

    // Blocks
    public static Block Dark;


    /**
     * Declare and register items. Do NOT add recipes here!
     */
    public static void init() {

        // Blocks:
        Dark = new Dark();
        GameRegistry.registerBlock(Dark, BlockDark.class, "dark");

    }

    public static void initRecipes() {

    }
}