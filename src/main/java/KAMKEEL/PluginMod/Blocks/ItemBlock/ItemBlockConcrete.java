package KAMKEEL.PluginMod.Blocks.ItemBlock;

import KAMKEEL.PluginMod.Util.ColorUtil;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemBlockConcrete extends ItemBlockWithMetadata {

    private int META_SET;

    public ItemBlockConcrete(Block block, Integer meta_set) {
        super(block, block);
        this.META_SET = meta_set;
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return this.getUnlocalizedName() + "." + ColorUtil.concreteToString( (itemStack.getItemDamage() + (16 * META_SET)) );
    }
}
