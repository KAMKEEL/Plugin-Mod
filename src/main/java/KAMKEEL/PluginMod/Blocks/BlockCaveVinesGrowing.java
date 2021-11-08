package KAMKEEL.PluginMod.Blocks;

import KAMKEEL.PluginMod.PluginMod;
import net.minecraft.util.*;
import net.minecraft.block.material.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.client.*;
import net.minecraft.client.settings.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.creativetab.*;
import java.util.*;
import net.minecraft.item.*;
import net.minecraft.init.*;
import net.minecraft.block.*;

public class BlockCaveVinesGrowing extends BlockBush
{
    public static final String[] types;
    private IIcon[] icon;

    public BlockCaveVinesGrowing() {
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

    public void updateTick(final World world, final int x, final int y, final int z, final Random random) {
        final int yy = y - 1;
        if (random.nextInt(10) == 0 && world.isAirBlock(x, yy, z)) {
            int height;
            for (height = 1; world.getBlock(x, y + height, z) == this; ++height) {}
            if (height < 20) {
                world.setBlock(x, y, z, (Block)this, 1, 2);
                world.setBlock(x, yy, z, (Block)this, 0, 2);
            }
        }
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
        for (int i = 0; i < BlockCaveVinesGrowing.types.length; ++i) {
            if (i != 1) {
                list.add(new ItemStack(block, 1, i));
            }
        }
    }

    public void onNeighborBlockChange(final World world, final int x, final int y, final int z, final Block neighbour) {
        this.checkBlockCoordValid(world, x, y, z);
        if (world.isAirBlock(x, y - 1, z) && world.getBlock(x, y, z) == ModBlocks.caveVinesGrowing) {
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
        return blockAbove.getMaterial() == Material.rock || blockAbove.getMaterial() == Material.wood || blockAbove == ModBlocks.caveVinesGrowing || blockAbove == Blocks.soul_sand || blockAbove instanceof BlockGrass || blockAbove instanceof BlockDirt;
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