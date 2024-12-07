package kamkeel.plugin.Blocks;

import kamkeel.plugin.Enum.Blocks.IBlockEnum;
import kamkeel.plugin.PluginMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockGeneric<T extends Enum<T> & IBlockEnum> extends Block {

    private final T[] variants;
    private final String blockName;
    private IIcon[] icons;

    public BlockGeneric(String blockName, Class<T> enumClass, Material material) {
        super(material);
        this.blockName = blockName;
        this.variants = enumClass.getEnumConstants();
        this.setCreativeTab(PluginMod.blocksTab);

        for (T variant : variants) {
            this.setHarvestLevel("pickaxe", variant.getHarvestLevel(), variant.getMeta());
        }
    }

    @Override
    public int damageDropped(int meta) {
        return meta;
    }

    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        for (T variant : variants) {
            list.add(new ItemStack(item, 1, variant.getMeta()));
        }
    }

    @Override
    public void registerBlockIcons(IIconRegister reg) {
        String prefix = "plug:";
        icons = new IIcon[variants.length];
        for (T variant : variants) {
            icons[variant.getMeta()] = reg.registerIcon(prefix + blockName + "_" + variant.getName().toLowerCase());
        }
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        if (meta >= 0 && meta < variants.length) {
            return icons[meta];
        }
        return null;
    }
}
