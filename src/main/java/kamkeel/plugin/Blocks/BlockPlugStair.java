package kamkeel.plugin.Blocks;

import kamkeel.plugin.LocalizationHelper;
import kamkeel.plugin.PluginMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class BlockPlugStair extends BlockStairs
{

    public BlockPlugStair(Block b, int meta, String name)
    {
        super(b, meta);
        this.setBlockName(LocalizationHelper.MOD_PREFIX + "stair_" + name);
        this.setStepSound(b.stepSound);
        this.setLightOpacity(0);
        this.setCreativeTab(PluginMod.blocksTab);
    }

}
