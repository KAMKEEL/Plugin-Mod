package KAMKEEL.PluginMod.Blocks.ItemBlock;

import KAMKEEL.PluginMod.Blocks.BlockPlugSlab;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;

public class ItemBlockSlab extends ItemSlab
{
    public ItemBlockSlab(Block block, BlockPlugSlab singleSlab, BlockPlugSlab doubleSlab)
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
        BlockPlugSlab slab = (BlockPlugSlab)Block.getBlockFromItem(itemStack.getItem());

        return super.getUnlocalizedName() + "." + (new StringBuilder()).append(slab.func_150002_b(itemStack.getItemDamage())).toString();
    }
}
