package kamkeel.plugin.Blocks.ItemBlock;

import kamkeel.plugin.Enum.Blocks.EnumAncientStone;
import kamkeel.plugin.Enum.Blocks.EnumEldritch;
import net.minecraft.block.Block;

public class ItemBlockAncientStone extends ItemBlockEnum {


    public ItemBlockAncientStone(Block block) {
        super(block, EnumAncientStone.class, "ancient_stone");
    }
}
