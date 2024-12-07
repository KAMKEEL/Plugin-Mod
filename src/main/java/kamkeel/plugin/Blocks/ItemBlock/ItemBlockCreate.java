package kamkeel.plugin.Blocks.ItemBlock;

import kamkeel.plugin.Enum.Blocks.EnumCreate;
import net.minecraft.block.Block;

public class ItemBlockCreate extends ItemBlockEnum {

    public ItemBlockCreate(Block block, String item) {
        super(block, EnumCreate.class, item);
    }
}
