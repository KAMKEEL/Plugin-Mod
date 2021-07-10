package KAMKEEL.PluginMod.Blocks.ItemBlock;

import KAMKEEL.PluginMod.Util.ColorUtil;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemBlockEnergy extends ItemBlockWithMetadata {

    public ItemBlockEnergy(Block block) {
        super(block, block);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return this.getUnlocalizedName() + "." + ColorUtil.energyToString(itemStack.getItemDamage());
    }
}
