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


/**
 * Barrel block that behaves similarly to a {@link BlockRotatedPillar} so it can be rotated
 * like vanilla pillars. The original orientation and texture logic is preserved so the
 * block still renders the correct top and bottom faces regardless of placement direction.
 */
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

    public void onBlockPlacedBy(World p_149689_1_, int p_149689_2_, int p_149689_3_, int p_149689_4_, EntityLivingBase p_149689_5_, ItemStack p_149689_6_)
    {
        int l = BlockPistonBase.determineOrientation(p_149689_1_, p_149689_2_, p_149689_3_, p_149689_4_, p_149689_5_);
        p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, l, 2);
    }


    public void registerBlockIcons(IIconRegister iconRegister) {

        top = iconRegister.registerIcon(getTextureName() + "/top/" + name);
        bottom = iconRegister.registerIcon(getTextureName() + "/bottom/" + name);
        blockIcon = iconRegister.registerIcon(getTextureName() + "/side/" + name);

    }


    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        int k = BlockPistonBase.getPistonOrientation(p_149691_2_);
        return k > 5 ? this.top : (p_149691_1_ == k ?  this.top : (p_149691_1_ == Facing.oppositeSide[k] ? this.bottom : this.blockIcon));
    }

    @Override
    protected IIcon getSideIcon(int meta)
    {
        return this.blockIcon;
    }

    @Override
    protected IIcon getTopIcon(int meta)
    {
        return this.top;
    }
}
