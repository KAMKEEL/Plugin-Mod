package kamkeel.plugin.Blocks;

import kamkeel.plugin.Blocks.ItemBlock.*;
import kamkeel.plugin.Config.ConfigBlocks;
import kamkeel.plugin.Enum.Blocks.EnumAncientStone;
import kamkeel.plugin.Enum.Blocks.EnumCreate;
import kamkeel.plugin.Enum.Blocks.EnumEldritch;
import kamkeel.plugin.Enum.Blocks.EnumLightStone;
import kamkeel.plugin.LocalizationHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;


/**
 * Stores, initializes, and registers items. Also adds recipes and ore dictionary entries. (Episode 4)
 */
public class ModBlocks {


    // Tab Icon
    public static Block Cherry_Barrel;

    // Blocks
    public static Block Dark;
    public static Block Midnight;
    public static Block Rage;
    public static Block DeepCrystal;
    public static Block Eldritch;
    public static Block AncientStone;
    public static Block Lightstone;
    public static Block Barrel;

    // Create
    public static Block Asurine;
    public static Block Crimsite;
    public static Block Deepslate;
    public static Block Dripstone;
    public static Block Limestone;
    public static Block Tuff;
    public static Block Ochrum;
    public static Block Veridium;
    public static Block Scoria;
    public static Block Scorchia;

    public static Block caveVines;
    public static Block caveVinesGrowing;


    // Sub-Blocks
    public static BlockConcrete concreteBlock;
    public static BlockConcretePowder concretePowder;

    public static BlockConcrete concreteBlock2;
    public static BlockConcretePowder concretePowder2;

    public static BlockEnergy energyBlock;

    // Slabs
    public static Block regularSingleSlab;
    public static Block regularDoubleSlab;

    /**
     * Declare and register items. Do NOT add recipes here!
     */
    public static void init() {
        if(ConfigBlocks.DisableAllBlocks){
           return;
        }

        // Blocks:
        if(ConfigBlocks.DarkBlocks){
            Dark = new BlockDark();
            GameRegistry.registerBlock(Dark, ItemBlockDark.class, "dark");
        }

        if(ConfigBlocks.MidnightBlocks){
            Midnight = new BlockMidnight();
            GameRegistry.registerBlock(Midnight, ItemBlockMidnight.class, "midnight");
        }

        if(ConfigBlocks.RageBlocks){
            Rage = new BlockRage();
            GameRegistry.registerBlock(Rage, ItemBlockRage.class, "rage");
        }

        if(ConfigBlocks.DeepCrystalBlocks){
            DeepCrystal = new BlockDeepCrystal();
            GameRegistry.registerBlock(DeepCrystal, ItemBlockDeepCrystal.class, "deep_crystal");
        }

        if(ConfigBlocks.CaveVinesBlocks){
            caveVines = registerBlock(new BlockCaveVines().setBlockName(LocalizationHelper.MOD_PREFIX + "caveVines"), (Class<? extends ItemBlock>) ItemBlockCaveVines.class);
            caveVinesGrowing = registerBlock(new BlockCaveVinesGrowing().setBlockName(LocalizationHelper.MOD_PREFIX + "caveVinesGrowing"), (Class<? extends ItemBlock>) ItemBlockCaveVinesGrowing.class);
        }

        if(ConfigBlocks.ConcreteBlocks){
            concreteBlock = new BlockConcrete(0, "concrete");
            concreteBlock.register();
            concretePowder = new BlockConcretePowder(0, "concrete_powder", concreteBlock);
            concretePowder.register();

            concreteBlock2 = new BlockConcrete(1, "concrete2");
            concreteBlock2.register();
            concretePowder2 = new BlockConcretePowder(1, "concrete_powder2", concreteBlock2);
            concretePowder2.register();
        }

        if(ConfigBlocks.EnergyBlocks){
            energyBlock = new BlockEnergy();
            energyBlock.register();
        }

        if(ConfigBlocks.EldritchBlocks){
            Eldritch = new BlockEldritch("eldritch", EnumEldritch.class);
            GameRegistry.registerBlock(Eldritch, ItemBlockEldritch.class, "eldritch");
        }

        if (ConfigBlocks.AncientStoneBlocks) {
            AncientStone = new BlockAncientStone("ancient_stone", EnumAncientStone.class);
            GameRegistry.registerBlock(AncientStone, ItemBlockAncientStone.class, "ancient_stone");
        }

        if (ConfigBlocks.LightstoneBlocks) {
            Lightstone = new BlockLightStone("lightstone", EnumLightStone.class);
            GameRegistry.registerBlock(Lightstone, ItemBlockLightStone.class, "lightstone");
        }

        if (ConfigBlocks.CreateBlocks) {
            Crimsite = new BlockCreate("crimsite", EnumCreate.class);
            GameRegistry.registerBlock(Crimsite, ItemBlockCreateCrimsite.class, "crimsite");

            Deepslate = new BlockCreate("deepslate", EnumCreate.class);
            GameRegistry.registerBlock(Deepslate, ItemBlockCreateDeepslate.class, "deepslate");

            Asurine = new BlockCreate("asurine", EnumCreate.class);
            GameRegistry.registerBlock(Asurine, ItemBlockCreateAsurine.class, "asurine");

            Dripstone = new BlockCreate("dripstone", EnumCreate.class);
            GameRegistry.registerBlock(Dripstone, ItemBlockCreateDripstone.class, "dripstone");

            Limestone = new BlockCreate("limestone", EnumCreate.class);
            GameRegistry.registerBlock(Limestone, ItemBlockCreateLimestone.class, "limestone");

            Tuff = new BlockCreate("tuff", EnumCreate.class);
            GameRegistry.registerBlock(Tuff, ItemBlockCreateTuff.class, "tuff");

            Ochrum = new BlockCreate("ochrum", EnumCreate.class);
            GameRegistry.registerBlock(Ochrum, ItemBlockCreateOchrum.class, "ochrum");

            Veridium = new BlockCreate("veridium", EnumCreate.class);
            GameRegistry.registerBlock(Veridium, ItemBlockCreateVeridium.class, "veridium");

            Scoria = new BlockCreate("scoria", EnumCreate.class);
            GameRegistry.registerBlock(Scoria, ItemBlockCreateScoria.class, "scoria");

            Scorchia = new BlockCreate("scorchia", EnumCreate.class);
            GameRegistry.registerBlock(Scorchia, ItemBlockCreateScorchia.class, "scorchia");
        }


        if(ConfigBlocks.BarrelBlocks){
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