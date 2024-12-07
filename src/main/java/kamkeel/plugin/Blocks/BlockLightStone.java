package kamkeel.plugin.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockGlowstone;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockLightStone extends BlockGeneric {

    protected IIcon[] icons;

    public BlockLightStone(String blockName, Class enumClass) {
        super(blockName, enumClass, Material.glass);

        this.setHardness(0.3F);
        this.setStepSound(Block.soundTypeGlass);
        this.setLightLevel(1F);
    }
}
