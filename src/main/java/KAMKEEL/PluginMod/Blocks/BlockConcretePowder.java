package KAMKEEL.PluginMod.Blocks;

import java.util.List;
import java.util.Random;

import KAMKEEL.PluginMod.Blocks.ItemBlock.ItemBlockConcrete;
import KAMKEEL.PluginMod.Entity.EntityFallingConcretePowderBlock;
import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import KAMKEEL.PluginMod.Util.ColorUtil;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockConcretePowder extends BlockFalling {
    public static final int META_MAX = 27;
    public final int META_AMOUNT;
    public final int META_SET;

    public final String blockName;
    public final Block concrete;

    private IIcon[] iicons;
    public static boolean fallInstantly;

    public BlockConcretePowder(int metaSet, String blockName, Block concrete) {
        super(Material.sand);
        this.setHardness(0.5F);
        this.setStepSound(soundTypeSand);
        this.setCreativeTab(PluginMod.blocksTab);

        this.META_SET = metaSet;

        if(16 * (META_SET + 1) > META_MAX){
            this.META_AMOUNT = META_MAX % 16;
        }
        else {
            this.META_AMOUNT = 15;
        }

        this.blockName = blockName;
        this.concrete = concrete;
        this.iicons = new IIcon[META_AMOUNT + 1];
    }

    public void register() {
        this.setBlockName(LocalizationHelper.MOD_PREFIX + blockName);
        GameRegistry.registerBlock(this, ItemBlockConcrete.class, blockName, this.META_SET);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register) {
        for (int meta = 0; meta <= META_AMOUNT; ++meta) {
            iicons[meta] = register.registerIcon(LocalizationHelper.MOD_PREFIX + "concrete_powder" + "_" + ColorUtil.concreteToString(meta + (16 * META_SET)));
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
        return iicons[meta%(META_AMOUNT + 1)];
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(Item item, CreativeTabs creativeTab, List list) {
        for (int meta = 0; meta <= META_AMOUNT; ++meta) {
            list.add(new ItemStack(item, 1, meta));
        }
    }

    @Override
    public int damageDropped(int meta) {
        return meta;
    }

    @Override
    public MapColor getMapColor(int meta) {
        return ColorUtil.metaToMapColorConcrete(meta + (16 * META_SET));
    }

    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        tryReplaceToConcrete(world, x, y, z);
        world.scheduleBlockUpdate(x, y, z, this, this.tickRate(world));
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block neighborBlock) {
        tryReplaceToConcrete(world, x, y, z);
        world.scheduleBlockUpdate(x, y, z, this, this.tickRate(world));
    }

    private boolean tryReplaceToConcrete(World world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z);
        Block[] aroundBlocks = new Block[5];
        aroundBlocks[0] = (world.getBlock(x + 1, y, z));
        aroundBlocks[1] = (world.getBlock(x - 1, y, z));
        aroundBlocks[2] = (world.getBlock(x, y + 1, z));
        aroundBlocks[3] = (world.getBlock(x, y, z + 1));
        aroundBlocks[4] = (world.getBlock(x, y, z - 1));

        for (int i = 0; i < 5; ++i) {
            if (aroundBlocks[i].getMaterial() == Material.water) {
                world.setBlock(x, y, z, concrete, meta, 3);
                return true;
            }
        }

        return false;
    }

    /**
     * Ticks the block if it's been scheduled
     */
    @Override
    public void updateTick(World world, int x, int y, int z, Random rand) {
        if (!world.isRemote) {
            this.dropBlockFrom(world, x, y, z);
        }
    }

    private void dropBlockFrom(World world, int x, int y, int z) {
        if (func_149831_e(world, x, y - 1, z) && y >= 0) {
            byte range = 32;

            if (!fallInstantly && world.checkChunksExist(x-range, y-range, z-range, x+range, y+range, z+range)) {
                if (!world.isRemote) {
                    double posX = (double) ((float) x + 0.5F);
                    double posY = (double) ((float) y + 0.5F);
                    double posZ = (double) ((float) z + 0.5F);
                    int meta = world.getBlockMetadata(x, y, z);
                    EntityFallingConcretePowderBlock entityfallingblock = new EntityFallingConcretePowderBlock(world, posX, posY, posZ, this, meta);
                    func_149829_a(entityfallingblock);
                    world.spawnEntityInWorld(entityfallingblock);
                }
            }
            else {
                world.setBlockToAir(x, y, z);

                while (func_149831_e(world, x, y - 1, z) && y > 0) {
                    --y;
                }

                if (y > 0) {
                    world.setBlock(x, y, z, this);
                }
            }
        }
    }

    public static boolean shouldNotStopFalling(World world, int x, int y, int z) {
        Block blockUnder = world.getBlock(x, y, z);

        return blockUnder.isAir(world, x, y, z)
                || blockUnder == Blocks.fire
                || blockUnder.getMaterial() == Material.lava
                || blockUnder.getMaterial() == Material.water;

    }

}