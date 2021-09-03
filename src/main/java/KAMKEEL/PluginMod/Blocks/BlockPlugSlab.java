package KAMKEEL.PluginMod.Blocks;

import KAMKEEL.PluginMod.Compat.CompatibilityBiomesOPlenty;
import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.List;
import java.util.Random;

public class BlockPlugSlab extends BlockSlab
{

    public String name;

    public static enum SlabCategory
    {
        REGULAR, BOP;
    }

    private static final String[] regular = new String[] {"barrel"};
    private static final String[] bop = new String[] {"limestone", "limestonesmooth", "siltstone", "siltstonesmooth", "shale", "shalesmooth"};
    private IIcon[] textures;

    private final SlabCategory category;

    public BlockPlugSlab(boolean isDoubleSlab, Material material, SlabCategory cat)
    {
        super(isDoubleSlab, material);

        category = cat;

        if (material == Material.wood)
        {
            this.setHardness(2.0F);
            this.setResistance(5.0F);
            this.setStepSound(Block.soundTypeWood);
        }
        else if (material == Material.rock)
        {
            this.setHarvestLevel("pickaxe", 0);
            this.setHardness(1.8F);
            this.setStepSound(soundTypeStone);
        }

        if (!isDoubleSlab)
        {
            this.setCreativeTab(PluginMod.blocksTab);
        }

        useNeighborBrightness = true;
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        if (category == SlabCategory.REGULAR)
        {
            textures = new IIcon[regular.length];

            for (int i = 0; i < regular.length; ++i)
            {
                textures[i] = iconRegister.registerIcon("plug:"+regular[i]);
            }
        }
        else
        {
            textures = new IIcon[bop.length];

            for (int i = 0; i < bop.length; ++i)
            {
                textures[i] = iconRegister.registerIcon("biomesoplenty:"+bop[i]);
            }
        }
    }

    @Override
    public IIcon getIcon(int side, int meta)
    {
        if (category == SlabCategory.REGULAR)
            return textures[getRegularType(meta)];
        else
            return textures[getBOPType(meta)];
    }

    @Override
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list)
    {
        int max = 0;

        if (category == SlabCategory.REGULAR) {
            max = 1;
        }
        else if (category == SlabCategory.BOP) {
            max = 6;
        }

        for (int i = 0; i < max; ++i) {
            list.add(new ItemStack(block, 1, i));
        }
    }


    @Override
    public String func_150002_b(int meta)
    {
        if (category == SlabCategory.REGULAR)
            return (new StringBuilder()).append(regular[getRegularType(meta)]).toString();
        else
            return (new StringBuilder()).append(bop[getBOPType(meta)]).toString();
    }

    @Override
    public int damageDropped(int meta)
    {
        return meta & 7;
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune)
    {
        if (field_150004_a)
        {
            if (this == ModBlocks.regularDoubleSlab)
                return Item.getItemFromBlock(ModBlocks.regularSingleSlab);
            else
                return Item.getItemFromBlock(CompatibilityBiomesOPlenty.bopSingleSlab);
        }
        else
            return Item.getItemFromBlock(this);
    }

    @Override
    public float getBlockHardness(World world, int x, int y, int z)
    {
        int meta = world.getBlockMetadata(x, y, z);
        float hardness = blockHardness;

        if (category == SlabCategory.REGULAR)
        {
            switch (getTypeFromMeta(meta))
            {
                case 0:
                case 3:
                    hardness = 1.6F;
                    break;

                case 1:
                case 4:
                    hardness = 1.1F;
                    break;

                case 2:
                    hardness = 1.0F;
                    break;
            }
        }

        return hardness;
    }

    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z)
    {


        // Block block = !field_150004_a ? this : (this == ModBlocks.regularDoubleSlab ? ModBlocks.regularSingleSlab : (this == ModBlocks.woodenDoubleSlab2 ? ModBlocks.woodenSingleSlab2 : ModBlocks.stoneSingleSlab));

        Block block = !field_150004_a ? this : (this == ModBlocks.regularDoubleSlab ? ModBlocks.regularSingleSlab : CompatibilityBiomesOPlenty.bopSingleSlab);

        return new ItemStack(block, 1, world.getBlockMetadata(x, y, z));
    }

    @Override
    protected ItemStack createStackedBlock(int meta)
    {
        return new ItemStack(this, 2, meta);
    }

    private int getBOPType(int meta)
    {
        meta = getTypeFromMeta(meta);
        if (meta < bop.length)
            return meta;

        return 0;
    }

    private int getRegularType(int meta)
    {
        meta = getTypeFromMeta(meta);
        if (meta < regular.length)
            return meta;

        return 0;
    }

    private static int getTypeFromMeta(int meta)
    {
        return meta & 7;
    }

    public static Block registerBlock(Block block)
    {
        GameRegistry.registerBlock(block, block.getUnlocalizedName().replace("tile.", "").replace(LocalizationHelper.MOD_PREFIX, ""));

        return block;
    }

    public static Block registerBlock(Block block, Class<? extends ItemBlock> itemBlockClass, Object... constructorArgs)
    {
        GameRegistry.registerBlock(block, itemBlockClass, block.getUnlocalizedName().replace("tile.", "").replace(LocalizationHelper.MOD_PREFIX, ""), constructorArgs);

        return block;
    }

}
