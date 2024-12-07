package kamkeel.plugin.Blocks;

import kamkeel.plugin.Enum.Blocks.EnumEldritch;
import kamkeel.plugin.Enum.Blocks.EnumMidnight;
import kamkeel.plugin.PluginMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;

public class BlockEldritch extends BlockGeneric {

    protected IIcon[] icons;

    public BlockEldritch(String blockName, Class enumClass) {
        super(blockName, enumClass, Material.rock);

        this.setHardness(3.0f);
        this.setResistance(15.0f);
        this.setStepSound(Block.soundTypeStone);
    }

    @Override
    public int getLightValue(final IBlockAccess world, final int x, final int y, final int z) {
        if (world instanceof World && !((World)world).blockExists(x, y, z)) {
            return 0;
        }
        int meta = world.getBlockMetadata(x, y, z);
        if(meta == 6)
            return 10;

        return 0;
    }
}
