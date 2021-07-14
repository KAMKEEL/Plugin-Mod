package KAMKEEL.PluginMod.Blocks.ItemBlock;

import KAMKEEL.PluginMod.Blocks.BlockColor;
import KAMKEEL.PluginMod.Blocks.BlockColorSlab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class ItemBlockColorSlab extends ItemSlab
{
    public ItemBlockColorSlab(Block block, BlockColorSlab singleSlab, BlockColorSlab doubleSlab)
    {
        super(block, singleSlab, doubleSlab, block == doubleSlab);
    }

    @Override
    public int getMetadata(int meta)
    {
        return meta & 7;
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        BlockColorSlab slab = (BlockColorSlab)Block.getBlockFromItem(itemStack.getItem());

        return super.getUnlocalizedName() + "." + (new StringBuilder()).append(slab.func_150002_b(itemStack.getItemDamage())).toString();
    }

}
