package kamkeel.plugin.Blocks;

import kamkeel.plugin.TileEntity.TileEntityBlockColorData;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.material.Material;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.Block;

public class BlockColorData extends Block implements ITileEntityProvider
{
    public BlockColorData() {
        super(Material.air);
        this.setLightLevel(0.0f);
        this.setLightOpacity(0);
        this.setBlockName("plug:datablock");
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.setHardness(0.0f);
    }

    public static int dataBlockX(final int x) {
        return x >> 4 << 4;
    }

    public static int dataBlockY(final int y) {
        return 255;
    }

    public static int dataBlockZ(final int z) {
        return z >> 4 << 4;
    }

    public static float[] getColorData(final IBlockAccess world, final int x, final int y, final int z) {
        return getColorData(world, x, y, z, world.getBlockMetadata(x, y, z));
    }

    public static float[] getColorData(final IBlockAccess world, int x, int y, int z, final int metadata) {
        x = dataBlockX(x);
        y = dataBlockY(y);
        z = dataBlockZ(z);
        TileEntityBlockColorData datablock = null;
        if (world.getTileEntity(x, y, z) instanceof TileEntityBlockColorData) {
            datablock = (TileEntityBlockColorData)world.getTileEntity(x, y, z);
            return datablock.palette[metadata];
        }
        return BlockColor.initColor[metadata];
    }


    @SideOnly(Side.CLIENT)
    public void getSubBlocks(final Item par1, final CreativeTabs par2CreativeTabs, final List par3List) {
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister par1IIconRegister) {
    }

    public int getRenderType() {
        return -1;
    }

    public int getMobilityFlag() {
        return 1;
    }

    @SideOnly(Side.CLIENT)
    public AxisAlignedBB getSelectedBoundingBoxFromPool(final World par1World, final int par2, final int par3, final int par4) {
        return null;
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(final World par1World, final int par2, final int par3, final int par4) {
        return null;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean isCollidable() {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(final IBlockAccess par1IBlockAccess, final int par2, final int par3, final int par4, final int par5) {
        return false;
    }

    public boolean isAir(final IBlockAccess world, final int x, final int y, final int z) {
        return true;
    }

    public TileEntity createNewTileEntity(final World var1, final int var2) {
        return new TileEntityBlockColorData();
    }
}
