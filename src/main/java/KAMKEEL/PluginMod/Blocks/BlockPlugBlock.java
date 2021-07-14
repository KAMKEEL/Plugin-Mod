package KAMKEEL.PluginMod.Blocks;

import KAMKEEL.PluginMod.Enum.Blocks.EnumDark;
import KAMKEEL.PluginMod.PluginMod;
import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockPlugBlock extends Block {


    public BlockPlugBlock(String texture){
        super(Material.rock);

        this.setHardness(3.0f);
        this.setResistance(15.0f);
        this.setStepSound(Block.soundTypeStone);
        this.setLightLevel(1.0F);
        this.setBlockTextureName(texture);
        this.setHarvestLevel("pickaxe", 0);
        this.setCreativeTab(PluginMod.blocksTab);
    }
}
