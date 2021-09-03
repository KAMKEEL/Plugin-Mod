package KAMKEEL.PluginMod.Blocks;

import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class BlockColorStair extends BlockStairs
{

    public static float[][] initColor = new float[16][3];
    public int curMetadata = 0;

    static {
        float saturation = 0.85F;
        for (int i = 0; i < 16; i++) {
            float r = EntitySheep.fleeceColorTable[i][0];
            float g = EntitySheep.fleeceColorTable[i][1];
            float b = EntitySheep.fleeceColorTable[i][2];
            float m = (r + g + b) / 3.0F * (1.0F - saturation);
            initColor[i][0] = r * saturation + m;
            initColor[i][1] = g * saturation + m;
            initColor[i][2] = b * saturation + m;
        }
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2) {
        return super.getIcon(par1, par2);
    }

    public BlockColorStair(final Block b, int metaData, String name)
    {
        super(b, metaData);
        this.curMetadata = metaData;
        this.setLightOpacity(0);
        this.setBlockName(LocalizationHelper.MOD_PREFIX + name + "Stair." + metaData);
        this.setCreativeTab(PluginMod.blocksTab);
    }

    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
        float[] col = BlockColorData.getColorData(par1IBlockAccess, par2, par3, par4, this.curMetadata);
        return (int)(col[0] * 255.0F) << 16 | (int)(col[1] * 255.0F) << 8 | (int)(col[2] * 255.0F);
    }

    @SideOnly(Side.CLIENT)
    public int getRenderColor(int p_149741_1_) {
        float[] col = initColor[this.curMetadata];
        return (int)(col[0] * 255.0F) << 16 | (int)(col[1] * 255.0F) << 8 | (int)(col[2] * 255.0F);
    }

}
