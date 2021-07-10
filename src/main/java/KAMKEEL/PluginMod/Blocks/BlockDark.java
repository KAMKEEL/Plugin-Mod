package KAMKEEL.PluginMod.Blocks;

import KAMKEEL.PluginMod.Enum.Blocks.EnumDark;
import KAMKEEL.PluginMod.PluginMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockDark extends Block {

    protected IIcon[] icons;

    public BlockDark(){
        super(Material.rock);

        this.setHardness(3.0f);
        this.setResistance(15.0f);
        this.setStepSound(Block.soundTypeStone);
        this.setCreativeTab(PluginMod.blocksTab);

        for(EnumDark dark : EnumDark.values()){
            this.setHarvestLevel("pickaxe", dark.getHarvestLevel(), dark.getMeta());
        }

    }

    @Override
    public int damageDropped(int meta){
        return meta;
    }


    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, List list){
        for (EnumDark dark: EnumDark.values()){
            list.add(new ItemStack(item, 1, dark.getMeta()));
        }
    }

    @Override
    public void registerBlockIcons(IIconRegister reg){

        icons = new IIcon[EnumDark.count()];
        String prefix = "plug:dark_";

        for(EnumDark dark : EnumDark.values()){
            icons[dark.getMeta()] = reg.registerIcon(prefix + dark.getName().toLowerCase());
        }
    }

    @Override
    public IIcon getIcon(int side, int meta){

        if(meta >= 0 && meta < EnumDark.count()){
            return icons[meta];
        }
        return null;
    }
}
