package kamkeel.plugin.Blocks.ItemBlock;

import kamkeel.plugin.Enum.Blocks.EnumMidnight;
import kamkeel.plugin.LocalizationHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockMidnight extends ItemBlock {

    public ItemBlockMidnight(Block block){

        super(block);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }


    @Override
    public int getMetadata(int meta){
        return meta;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){

        int metadata = stack.getItemDamage();
        EnumMidnight midnight = EnumMidnight.values()[metadata];
        return LocalizationHelper.BLOCK_PREFIX + "midnight_" + midnight.getName().toLowerCase();
    }

}
