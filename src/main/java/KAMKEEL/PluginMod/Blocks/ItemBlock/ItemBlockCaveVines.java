package KAMKEEL.PluginMod.Blocks.ItemBlock;

import KAMKEEL.PluginMod.Blocks.ModBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemColored;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ItemBlockCaveVines extends ItemColored
{
    private static final String[] types;
    private IIcon[] icon;

    public ItemBlockCaveVines(final Block block) {
        super(block, true);
        this.icon = new IIcon[1];
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.icon[0] = iconRegister.registerIcon("plug:cave_vines_head");
    }

    public int getMetadata(final int meta) {
        return meta;
    }

    public String getUnlocalizedName(final ItemStack itemstack) {
        int meta = itemstack.getItemDamage();
        if (meta < 0 || meta >= ItemBlockCaveVines.types.length) {
            meta = 0;
        }
        return super.getUnlocalizedName() + "_" + ItemBlockCaveVines.types[meta];
    }

    public boolean placeBlockAt(final ItemStack stack, final EntityPlayer player, final World world, final int x, final int y, final int z, final int side, final float hitX, final float hitY, final float hitZ, final int metadata) {
        if (metadata == 0 && world.getBlock(x, y + 1, z) == ModBlocks.caveVines) {
            world.setBlock(x, y + 1, z, ModBlocks.caveVines, 1, 2);
            world.setBlock(x, y, z, ModBlocks.caveVines, 0, 2);
            --stack.stackSize;
            world.playSoundEffect((double)(x + 0.5f), (double)(y + 0.5f), (double)(z + 0.5f), ModBlocks.caveVines.stepSound.func_150496_b(), (ModBlocks.caveVines.stepSound.getVolume() + 1.0f) / 2.0f, ModBlocks.caveVines.stepSound.getPitch() * 0.8f);
        }
        return super.placeBlockAt(stack, player, world, x, y, z, side, hitX, hitY, hitZ, metadata);
    }

    static {
        types = new String[] { "head", "body" };
    }
}
