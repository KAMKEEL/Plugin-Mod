package kamkeel.plugin.Blocks;

import kamkeel.plugin.LocalizationHelper;
import kamkeel.plugin.PluginMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;


public class BlockBarrel extends BlockRotatedPillar {

    public IIcon top;
    public IIcon bottom;

    public String name;

    public BlockBarrel(String _name) {
        super(Material.wood);
        this.setCreativeTab(PluginMod.blocksTab);
        this.setStepSound(soundTypeWood);
        this.setHardness(2.5F);
        this.name = _name;
    }

    // Register Block
    public void register() {
        setBlockName(LocalizationHelper.MOD_PREFIX + name + "_barrel");
        setBlockTextureName(LocalizationHelper.MOD_PREFIX + "barrel");
        GameRegistry.registerBlock(this, (name + "_barrel"));
    }

    public int getRenderType()
    {
        return 16;
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase placer, ItemStack stack)
    {
        int orientation = BlockPistonBase.determineOrientation(world, x, y, z, placer);
        world.setBlockMetadataWithNotify(x, y, z, orientation, 2);
    }


    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        top = iconRegister.registerIcon(getTextureName() + "/top/" + name);
        bottom = iconRegister.registerIcon(getTextureName() + "/bottom/" + name);
        blockIcon = iconRegister.registerIcon(getTextureName() + "/side/" + name);
    }

    @Override
    protected IIcon func_150163_b(int meta) {
        return blockIcon;
    }

    @Override
    protected IIcon func_150161_d(int meta) {
        return top;
    }

    @Override
    public int damageDropped(int meta) {
        return 0;
    }


    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta)
    {
        int k = BlockPistonBase.getPistonOrientation(meta);
        if (k > 5)
            return top;
        if (side == k)
            return top;
        return side == Facing.oppositeSide[k] ? bottom : blockIcon;
    }
}
