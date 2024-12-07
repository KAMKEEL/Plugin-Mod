package kamkeel.plugin.Blocks;

import kamkeel.plugin.Enum.Blocks.EnumAncientStone;
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

public class BlockAncientStone extends BlockGeneric {

    protected IIcon[] icons;

    public BlockAncientStone(String blockName, Class enumClass) {
        super(blockName, enumClass, Material.rock);

        this.setHardness(3.0f);
        this.setResistance(15.0f);
        this.setStepSound(Block.soundTypeStone);
    }
}
