package kamkeel.plugin.Blocks;

import kamkeel.plugin.Enum.Blocks.EnumRage;
import kamkeel.plugin.PluginMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockRage extends Block {

    protected IIcon[] icons;

    public BlockRage(){
        super(Material.rock);

        this.setHardness(3.0f);
        this.setResistance(15.0f);
        this.setStepSound(Block.soundTypeStone);
        this.setCreativeTab(PluginMod.blocksTab);

        for(EnumRage rage : EnumRage.values()){
            this.setHarvestLevel("pickaxe", rage.getHarvestLevel(), rage.getMeta());
        }

    }

    @Override
    public int damageDropped(int meta){
        return meta;
    }


    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, List list){
        for (EnumRage rage: EnumRage.values()){
            list.add(new ItemStack(item, 1, rage.getMeta()));
        }
    }

    @Override
    public void registerBlockIcons(IIconRegister reg){

        icons = new IIcon[EnumRage.count()];
        String prefix = "plug:rage_";

        for(EnumRage rage : EnumRage.values()){
            icons[rage.getMeta()] = reg.registerIcon(prefix + rage.getName().toLowerCase());
        }
    }

    @Override
    public IIcon getIcon(int side, int meta){

        if(meta >= 0 && meta < EnumRage.count()){
            return icons[meta];
        }
        return null;
    }
}
