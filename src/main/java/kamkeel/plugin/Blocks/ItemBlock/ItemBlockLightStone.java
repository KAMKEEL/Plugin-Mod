package kamkeel.plugin.Blocks.ItemBlock;

import kamkeel.plugin.Enum.Blocks.EnumAncientStone;
import kamkeel.plugin.Enum.Blocks.EnumLightStone;
import net.minecraft.block.Block;

public class ItemBlockLightStone extends ItemBlockEnum {

    public ItemBlockLightStone(Block block) {
        super(block, EnumLightStone.class, "lightstone");
    }
}
