package kamkeel.plugin.Blocks;

import kamkeel.plugin.Enum.Blocks.EnumMidnight;
import kamkeel.plugin.PluginMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockMidnight extends Block {

    protected IIcon[] icons;

    public BlockMidnight(){
        super(Material.rock);

        this.setHardness(3.0f);
        this.setResistance(15.0f);
        this.setStepSound(Block.soundTypeStone);
        this.setCreativeTab(PluginMod.blocksTab);

        for(EnumMidnight midnight : EnumMidnight.values()){
            this.setHarvestLevel("pickaxe", midnight.getHarvestLevel(), midnight.getMeta());
        }

    }

    @Override
    public int damageDropped(int meta){
        return meta;
    }


    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, List list){
        for (EnumMidnight midnight: EnumMidnight.values()){
            list.add(new ItemStack(item, 1, midnight.getMeta()));
        }
    }

    @Override
    public void registerBlockIcons(IIconRegister reg){

        icons = new IIcon[EnumMidnight.count()];
        String prefix = "plug:midnight_";

        for(EnumMidnight midnight : EnumMidnight.values()){
            icons[midnight.getMeta()] = reg.registerIcon(prefix + midnight.getName().toLowerCase());
        }
    }

    @Override
    public IIcon getIcon(int side, int meta){

        if(meta >= 0 && meta < EnumMidnight.count()){
            return icons[meta];
        }
        return null;
    }
}
