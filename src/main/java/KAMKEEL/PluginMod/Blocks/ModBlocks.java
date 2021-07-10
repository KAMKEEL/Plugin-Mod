package KAMKEEL.PluginMod.Blocks;

import KAMKEEL.PluginMod.Blocks.ItemBlock.ItemBlockDark;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;


/**
 * Stores, initializes, and registers items. Also adds recipes and ore dictionary entries. (Episode 4)
 */
public class ModBlocks {

    // Tab Icon
    public static Block Cherry_Barrel;

    // Blocks
    public static Block Dark;
    public static Block Barrel;

    // Sub-Blocks
    public static BlockConcrete concreteBlock;
    public static BlockConcretePowder concretePowder;
    public static BlockEnergy energyBlock;


    /**
     * Declare and register items. Do NOT add recipes here!
     */
    public static void init() {

        // Blocks:
        Dark = new BlockDark();
        GameRegistry.registerBlock(Dark, ItemBlockDark.class, "dark");


        concreteBlock = new BlockConcrete();
        concreteBlock.register();
        concretePowder = new BlockConcretePowder();
        concretePowder.register();

        energyBlock = new BlockEnergy();
        energyBlock.register();

        //////////////////////////////////////
        //             BARRELS
        //////////////////////////////////////
        // Name = WOOD_barrel
        Barrel = new BlockBarrel("oak");
        ((BlockBarrel)Barrel).register();

        Barrel = new BlockBarrel("spruce");
        ((BlockBarrel)Barrel).register();

        Barrel = new BlockBarrel("birch");
        ((BlockBarrel)Barrel).register();

        Barrel = new BlockBarrel("jungle");
        ((BlockBarrel)Barrel).register();

        Barrel = new BlockBarrel("dark_oak");
        ((BlockBarrel)Barrel).register();

        Barrel = new BlockBarrel("acacia");
        ((BlockBarrel)Barrel).register();

        Barrel = new BlockBarrel("warped");
        ((BlockBarrel)Barrel).register();

        Barrel = new BlockBarrel("crimson");
        ((BlockBarrel)Barrel).register();

        // Custom Barrels
        Cherry_Barrel = new BlockBarrel("cherry");
        ((BlockBarrel)Cherry_Barrel).register();

        Barrel = new BlockBarrel("ethereal");
        ((BlockBarrel)Barrel).register();

        Barrel = new BlockBarrel("hellbark");
        ((BlockBarrel)Barrel).register();

        Barrel = new BlockBarrel("fir");
        ((BlockBarrel)Barrel).register();

        Barrel = new BlockBarrel("palm");
        ((BlockBarrel)Barrel).register();

        Barrel = new BlockBarrel("willow");
        ((BlockBarrel)Barrel).register();

        Barrel = new BlockBarrel("jacaranda");
        ((BlockBarrel)Barrel).register();

        Barrel = new BlockBarrel("magic");
        ((BlockBarrel)Barrel).register();

        Barrel = new BlockBarrel("mahogany");
        ((BlockBarrel)Barrel).register();

        Barrel = new BlockBarrel("mangrove");
        ((BlockBarrel)Barrel).register();

        Barrel = new BlockBarrel("redwood");
        ((BlockBarrel)Barrel).register();

        //////////////////////////////////////

    }

    public static void initRecipes() {

    }
}