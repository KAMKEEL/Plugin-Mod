package KAMKEEL.PluginMod.Blocks;

import KAMKEEL.PluginMod.Blocks.ItemBlock.ItemBlockEnergy;
import KAMKEEL.PluginMod.CommonProxy;
import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import KAMKEEL.PluginMod.Util.ColorUtil;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;

public class BlockEnergy extends Block
{
    public static final int META_MAX = 15;

    private IIcon[] iicons = new IIcon[META_MAX + 1];

    private static final float[][] cols;

    protected BlockEnergy()
    {
        super(Material.ground);
        this.setLightLevel(1.0F);
        this.setHardness(1.8F);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 0);
        this.setCreativeTab(PluginMod.blocksTab);
    }

    public static int getLightLevel(final int metadata) {
        return (int)((BlockEnergy.cols[metadata][0] + BlockEnergy.cols[metadata][1] + BlockEnergy.cols[metadata][2]) / 3.0f * 15.0f);
    }

    public int getLightValue(final IBlockAccess world, final int x, final int y, final int z) {
        if (world instanceof World && !((World)world).blockExists(x, y, z)) {
            return 0;
        }
        return getLightLevel(world.getBlockMetadata(x, y, z));
    }

//    @SideOnly(Side.CLIENT)
//    public int getRenderColor(final int p_149741_1_) {
//        if (p_149741_1_ == 15) {
//            return 0;
//        }
//        final float[] col = BlockEnergy.cols[p_149741_1_ & 0xF];
//        return (int)(col[0] * 255.0f) << 16 | (int)(col[1] * 255.0f) << 8 | (int)(col[2] * 255.0f);
//    }
//
//    @SideOnly(Side.CLIENT)
//    public int colorMultiplier(final IBlockAccess world, final int x, final int y, final int z) {
//        return this.getRenderColor(world.getBlockMetadata(x, y, z));
//    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean isNormalCube(final IBlockAccess world, final int x, final int y, final int z) {
        return true;
    }

    public int getRenderType() {
        return CommonProxy.fullBrightBlockID;
    }

    public void register() {
        this.setBlockName(LocalizationHelper.MOD_PREFIX + "energyBlock");
        GameRegistry.registerBlock(this, ItemBlockEnergy.class, "energyBlock");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register) {
        for(int meta = 0; meta <= META_MAX; ++meta) {
            iicons[meta] = register.registerIcon(LocalizationHelper.MOD_PREFIX + "energyBlock_" + ColorUtil.energyToString(meta));
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
        return iicons[meta%(META_MAX+1)];
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(Item item, CreativeTabs creativeTab, List list) {
        for(int meta = 0; meta <= META_MAX; ++meta) {
            list.add(new ItemStack(item, 1, meta));
        }
    }

    @Override
    public int damageDropped(int meta) {
        return meta;
    }


    @Override
    public MapColor getMapColor(int meta) {
        return ColorUtil.metaToMapColorEnergy(meta);
    }

    static {
        cols = new float[][] { { 1.0f, 1.0f, 1.0f }, { 1.0f, 0.5f, 0.0f }, { 1.0f, 0.0f, 1.0f }, { 0.0f, 0.5f, 0.85f }, { 1.0f, 1.0f, 0.0f }, { 0.0f, 1.0f, 0.0f }, { 1.0f, 0.6f, 0.65f }, { 0.5f, 0.5f, 0.5f }, { 0.8f, 0.8f, 0.8f }, { 0.0f, 1.0f, 1.0f }, { 0.7f, 0.2f, 1.0f }, { 0.0f, 0.0f, 1.0f }, { 0.5f, 0.2f, 0.0f }, { 0.0f, 0.6f, 0.0f }, { 1.0f, 0.0f, 0.0f }, { 0.0f, 0.0f, 0.0f } };
    }

}
