package KAMKEEL.PluginMod.Blocks;

import KAMKEEL.PluginMod.Compat.CompatibilityExtraUtilities;
import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import KAMKEEL.PluginMod.Texture.TextureColorBlockBase;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class BlockColorSlab extends BlockSlab
{

    public String name;
    public static float[][] initColor = new float[16][3];
    public int metaColor = 0;
    private String blockName;
    private boolean doubleSlab;
    private BlockColorSlab dropSlab;
    private static final String[] metaColorNames = new String[] {"White", "Orange", "Magenta", "Light_blue", "Yellow", "Lime", "Pink", "Gray", "Light_gray", "Cyan", "Purple", "Blue", "Brown", "Green", "Red", "Black"};

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

    public BlockColorSlab(boolean isDoubleSlab, Material material, String blockName, String textureLoc, int _metaColor)
    {
        super(isDoubleSlab, material);

        if (material == Material.wood)
        {
            this.setHardness(2.0F);
            this.setResistance(5.0F);
            this.setStepSound(Block.soundTypeWood);
        }
        else if (material == Material.rock)
        {
            this.setHarvestLevel("pickaxe", 0);
            this.setHardness(1.8F);
            this.setStepSound(soundTypeStone);
        }

        if (!isDoubleSlab)
        {
            this.setBlockName(blockName + "SSlab." + _metaColor);
            this.setCreativeTab(PluginMod.blocksTab);
        }
        else{
            //LocalizationHelper.MOD_PREFIX +
            this.setBlockName(blockName + "DSlab." + _metaColor);
        }
        this.doubleSlab = isDoubleSlab;
        this.blockName = textureLoc;
        this.metaColor = _metaColor;

        useNeighborBrightness = true;
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        if (!(iconRegister instanceof TextureMap))
            return;
        String t = this.blockName;
        this.blockIcon = (IIcon)((TextureMap)iconRegister).getTextureExtry("plug:bw_(" + t + ")");
        if (this.blockIcon == null) {
            TextureColorBlockBase textureColorBlockBase = new TextureColorBlockBase(t);
            this.blockIcon = (IIcon)textureColorBlockBase;
            ((TextureMap)iconRegister).setTextureEntry("plug:bw_(" + t + ")", (TextureAtlasSprite)textureColorBlockBase);
        }
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2) {
        return super.getIcon(par1, par2);
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
        for (int j = 0; j < 1; j++)
            par3List.add(new ItemStack(par1, 1, j));
    }

    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
        float[] col = BlockColorData.getColorData(par1IBlockAccess, par2, par3, par4, this.metaColor);
        return (int)(col[0] * 255.0F) << 16 | (int)(col[1] * 255.0F) << 8 | (int)(col[2] * 255.0F);
    }

    @SideOnly(Side.CLIENT)
    public int getRenderColor(int p_149741_1_) {
        float[] col = initColor[this.metaColor];
        return (int)(col[0] * 255.0F) << 16 | (int)(col[1] * 255.0F) << 8 | (int)(col[2] * 255.0F);
    }

    @Override
    public String func_150002_b(int meta)
    {
        if(this.doubleSlab){
            return (new StringBuilder()).append("1").toString();
        }
        return (new StringBuilder()).append("0").toString();
    }

    @Override
    public int damageDropped(int meta)
    {
        return meta;
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune)
    {
        if(dropSlab != null){
            return Item.getItemFromBlock(dropSlab);
        }
        return Item.getItemFromBlock(this);
    }

    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z)
    {
        Block block;
        if(dropSlab != null){
            block = dropSlab;
        }
        else{
            block = this;
        }
        return new ItemStack(block, 1, world.getBlockMetadata(x, y, z));
    }

    @Override
    protected ItemStack createStackedBlock(int meta)
    {
        return new ItemStack(this, 2, meta);
    }

    public static Block registerBlock(Block block, Class<? extends ItemBlock> itemBlockClass, Object... constructorArgs)
    {
        GameRegistry.registerBlock(block, itemBlockClass, block.getUnlocalizedName().replace("tile.", ""), constructorArgs);

        return block;
    }

    public void setDropSlab(BlockColorSlab dropSlab) {
        this.dropSlab = dropSlab;
    }
}
