package kamkeel.plugin.Blocks.ItemBlock;

import kamkeel.plugin.Enum.Blocks.EnumEldritch;
import kamkeel.plugin.Enum.Blocks.EnumMidnight;
import kamkeel.plugin.LocalizationHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockEldritch extends ItemBlockEnum {


    public ItemBlockEldritch(Block block) {
        super(block, EnumEldritch.class, "eldrich");
    }
}
