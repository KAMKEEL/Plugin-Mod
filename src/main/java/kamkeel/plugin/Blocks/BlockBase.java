package kamkeel.plugin.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockBase extends BlockGeneric {

    protected IIcon[] icons;

    public BlockBase(String blockName, Class enumClass) {
        super(blockName, enumClass, Material.rock);
    }
}
