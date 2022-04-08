package KAMKEEL.PluginMod.Blocks;

import KAMKEEL.PluginMod.Blocks.ItemBlock.ItemBlockCaveVines;
import KAMKEEL.PluginMod.Blocks.ItemBlock.ItemBlockCaveVinesGrowing;
import KAMKEEL.PluginMod.Blocks.ItemBlock.ItemBlockDark;
import KAMKEEL.PluginMod.LocalizationHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;

import static cpw.mods.fml.common.registry.GameRegistry.registerBlock;


/**
 * Stores, initializes, and registers items. Also adds recipes and ore dictionary entries. (Episode 4)
 */
public class ModBlocks {


    // Tab Icon
    public static Block Cherry_Barrel;

    // Blocks
    public static Block Dark;
    public static Block Barrel;

    public static Block caveVines;
    public static Block caveVinesGrowing;


    // Sub-Blocks
    public static BlockConcrete concreteBlock;
    public static BlockConcretePowder concretePowder;

    public static BlockConcrete concreteBlock2;
    public static BlockConcretePowder concretePowder2;


    public static BlockEnergy energyBlock;

    // Stairs
    public static BlockColorStair testStairBlock;
    public static Block testStairs;

    // Slabs
    public static Block regularSingleSlab;
    public static Block regularDoubleSlab;

    /**
     * Declare and register items. Do NOT add recipes here!
     */
    public static void init() {

        // Blocks:
        Dark = new BlockDark();
        GameRegistry.registerBlock(Dark, ItemBlockDark.class, "dark");

        caveVines = registerBlock(new BlockCaveVines().setBlockName(LocalizationHelper.MOD_PREFIX + "caveVines"), (Class<? extends ItemBlock>) ItemBlockCaveVines.class);
        caveVinesGrowing = registerBlock(new BlockCaveVinesGrowing().setBlockName(LocalizationHelper.MOD_PREFIX + "caveVinesGrowing"), (Class<? extends ItemBlock>) ItemBlockCaveVinesGrowing.class);

        concreteBlock = new BlockConcrete(0, "concrete");
        concreteBlock.register();
        concretePowder = new BlockConcretePowder(0, "concrete_powder", concreteBlock);
        concretePowder.register();

        concreteBlock2 = new BlockConcrete(1, "concrete2");
        concreteBlock2.register();
        concretePowder2 = new BlockConcretePowder(1, "concrete_powder2", concreteBlock2);
        concretePowder2.register();

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

        //////////////////////////////////////

    }

    public static void initRecipes() {

    }

    public static Block registerBlock(Block block) {
        return registerBlock(block, ItemBlock.class);
    }

    public static Block registerBlock(Block block, Class<? extends ItemBlock> itemblock) {
        String s = block.getUnlocalizedName().substring("tile.".length());
        s = s.replace("plug:", "");
        return GameRegistry.registerBlock(block, itemblock, s);
    }

    public static void registerTile(Class<? extends TileEntity> clazz, String name) {
        GameRegistry.registerTileEntity(clazz, name);
    }

    public static void registerTile(Class<? extends TileEntity> clazz) {
        GameRegistry.registerTileEntity(clazz, clazz.getSimpleName());
    }
}