package KAMKEEL.PluginMod.Blocks;

import KAMKEEL.PluginMod.CommonProxy;
import KAMKEEL.PluginMod.PluginMod;
import KAMKEEL.PluginMod.Texture.TextureColorBlockBase;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraft.block.Block;

public class BlockColor extends Block {
    public static float[][] initColor = new float[16][3];

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

    public int curMetadata = 0;
    public String oreName;
    public Block baseBlock;

    public BlockColor(Block b, String orename) {
        this(b, orename, (String)ReflectionHelper.getPrivateValue(Block.class, b, new String[] { "textureName", "field_149768_d" }));
    }

    @SideOnly(Side.CLIENT)
    public int getBlockColor() {
        return super.getBlockColor();
    }

    public BlockColor(Block b, String orename, String texture){
        super(b.getMaterial());
        setHardness((Float) ReflectionHelper.getPrivateValue(Block.class, b, new String[]{"blockHardness", "field_149782_v"}));
        setResistance((Float) ReflectionHelper.getPrivateValue(Block.class, b, new String[]{"blockResistance", "field_149781_w"}));
        setStepSound(b.stepSound);
        setBlockTextureName(texture);
        setBlockName("color_" + b.getUnlocalizedName().substring(5));
        setLightLevel(b.getLightValue() / 15.0F);
        setLightOpacity(b.getLightOpacity());
        this.setCreativeTab(PluginMod.blocksTab);
        this.oreName = orename;
        this.baseBlock = b;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IIconRegister) {
        if (!(par1IIconRegister instanceof TextureMap))
            return;
        String t = getTextureName();
        this.blockIcon = (IIcon)((TextureMap)par1IIconRegister).getTextureExtry("plug:bw_(" + t + ")");
        if (this.blockIcon == null) {
            TextureColorBlockBase textureColorBlockBase = new TextureColorBlockBase(t);
            this.blockIcon = (IIcon)textureColorBlockBase;
            ((TextureMap)par1IIconRegister).setTextureEntry("plug:bw_(" + t + ")", (TextureAtlasSprite)textureColorBlockBase);
        }
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2) {
        this.curMetadata = par2;
        return super.getIcon(par1, par2);
    }

    public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
        if (par1IBlockAccess.getBlock(par2, par3, par4) == this)
            this.curMetadata = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
        float[] col = BlockColorData.getColorData(par1IBlockAccess, par2, par3, par4, this.curMetadata);
        return (int)(col[0] * 255.0F) << 16 | (int)(col[1] * 255.0F) << 8 | (int)(col[2] * 255.0F);
    }

    @SideOnly(Side.CLIENT)
    public int getRenderColor(int p_149741_1_) {
        float[] col = initColor[p_149741_1_];
        return (int)(col[0] * 255.0F) << 16 | (int)(col[1] * 255.0F) << 8 | (int)(col[2] * 255.0F);
    }

    public int getRenderType() {
        return CommonProxy.colorBlockID;
    }

    public int damageDropped(int par1) {
        return par1;
    }


    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
        for (int j = 0; j < 16; j++)
            par3List.add(new ItemStack(par1, 1, j));
    }

}


