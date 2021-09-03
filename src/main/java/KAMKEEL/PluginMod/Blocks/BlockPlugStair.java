package KAMKEEL.PluginMod.Blocks;

import KAMKEEL.PluginMod.CommonProxy;
import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import KAMKEEL.PluginMod.Util.ColorUtil;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.ReflectionHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.MapColor;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

import java.util.Arrays;
import java.util.List;

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
