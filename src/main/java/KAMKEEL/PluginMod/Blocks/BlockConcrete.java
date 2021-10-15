package KAMKEEL.PluginMod.Blocks;

import java.util.List;

import KAMKEEL.PluginMod.Blocks.ItemBlock.ItemBlockConcrete;
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

public class BlockConcrete extends Block {
    public static final int META_MAX = 27;
    public final int META_AMOUNT;
    public final int META_SET;

    public final String blockName;

    private IIcon[] iicons;

    public BlockConcrete(int metaSet, String blockName) {
        super(Material.rock);
        this.setHardness(1.8F);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 0);
        this.setCreativeTab(PluginMod.blocksTab);

        this.META_SET = metaSet;
        if(16 * (META_SET + 1) > META_MAX){
            this.META_AMOUNT = META_MAX % 16;
        }
        else {
            this.META_AMOUNT = 15;
        }

        this.blockName = blockName;
        this.iicons = new IIcon[META_AMOUNT + 1];
    }

    public void register() {
        this.setBlockName(LocalizationHelper.MOD_PREFIX + blockName);
        GameRegistry.registerBlock(this, ItemBlockConcrete.class, blockName, this.META_SET);
    }


    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register) {
        for(int meta = 0; meta <= META_AMOUNT; ++meta) {
            iicons[meta] = register.registerIcon(LocalizationHelper.MOD_PREFIX + "concrete" + "_" + ColorUtil.concreteToString(meta + (16 * META_SET)));
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
        return iicons[meta%(META_AMOUNT+1)];
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(Item item, CreativeTabs creativeTab, List list) {
        for(int meta = 0; meta <= META_AMOUNT; ++meta) {
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
}