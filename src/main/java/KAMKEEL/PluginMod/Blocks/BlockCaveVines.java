package KAMKEEL.PluginMod.Blocks;

import KAMKEEL.PluginMod.PluginMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class BlockCaveVines extends BlockBush
{
    public static final String[] types;
    private IIcon[] icon;

    public BlockCaveVines() {
        super(Material.plants);
        this.icon = new IIcon[2];
        this.setTickRandomly(true);
        this.setStepSound(soundTypeGrass);
        this.setCreativeTab(PluginMod.blocksTab);
    }

    public void setBlockBoundsBasedOnState(final IBlockAccess world, final int x, final int y, final int z) {
        final float f = 0.4f;
        this.setBlockBounds(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 1.0f, 0.5f + f);
    }

    public boolean isLadder(final IBlockAccess world, final int x, final int y, final int z, final EntityLivingBase entity) {
        return true;
    }

    @SideOnly(Side.CLIENT)
    public void onEntityCollidedWithBlock(final World world, final int x, final int y, final int z, final Entity entity) {
        if (entity instanceof EntityPlayer) {
            final EntityPlayer player = (EntityPlayer)entity;
            if (player.posY - 0.0 >= y) {
                player.moveForward = 0.0f;
                if (player.motionY < -0.15) {
                    player.motionY = -0.15;
                }
                if (GameSettings.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindJump) && player.motionY < 0.2) {
                    player.motionY = 0.2;
                }
            }
            if (GameSettings.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindSneak) && (GameSettings.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindJump) || GameSettings.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindJump) || GameSettings.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindJump) || GameSettings.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindJump))) {
                player.motionY = 0.2;
            }
            else if (GameSettings.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindSneak)) {
                player.setVelocity(0.0, 0.08, 0.0);
            }
        }
    }

    public void registerBlockIcons(final IIconRegister iconRegister) {
        this.icon[0] = iconRegister.registerIcon("plug:cave_vines_head");
        this.icon[1] = iconRegister.registerIcon("plug:cave_vines_body");
    }

    public IIcon getIcon(final int side, int meta) {
        if (meta < 0 || meta >= this.icon.length) {
            meta = 1;
        }
        return this.icon[meta];
    }

    public void getSubBlocks(final Item block, final CreativeTabs creativeTabs, final List list) {
        for (int i = 0; i < BlockCaveVines.types.length; ++i) {
            if (i != 1) {
                list.add(new ItemStack(block, 1, i));
            }
        }
    }

    public void onNeighborBlockChange(final World world, final int x, final int y, final int z, final Block neighbour) {
        this.checkBlockCoordValid(world, x, y, z);
        if (world.isAirBlock(x, y - 1, z) && world.getBlock(x, y, z) == ModBlocks.caveVines) {
            world.setBlock(x, y, z, (Block)this, 0, 2);
        }
    }

    public final void checkBlockCoordValid(final World world, final int x, final int y, final int z) {
        if (!this.canBlockStay(world, x, y, z)) {
            this.dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
            world.setBlockToAir(x, y, z);
        }
    }

    public boolean canBlockStay(final World world, final int x, final int y, final int z) {
        return canPlaceRootBelow(world, x, y + 1, z);
    }

    public static boolean canPlaceRootBelow(final World world, final int x, final int y, final int z) {
        final Block blockAbove = world.getBlock(x, y, z);
        return blockAbove.getMaterial() == Material.rock || blockAbove.getMaterial() == Material.wood || blockAbove == ModBlocks.caveVines || blockAbove == Blocks.soul_sand || blockAbove instanceof BlockGrass || blockAbove instanceof BlockDirt;
    }

    public boolean canPlaceBlockAt(final World world, final int x, final int y, final int z) {
        return super.canPlaceBlockAt(world, x, y, z) && this.canBlockStay(world, x, y, z);
    }

    public int damageDropped(final int meta) {
        if (meta == 1) {
            return 0;
        }
        return meta;
    }

    static {
        types = new String[] { "head", "body" };
    }
}