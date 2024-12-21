package kamkeel.plugin.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kamkeel.plugin.Enum.Blocks.EnumDeepCrystal;
import kamkeel.plugin.PluginMod;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.List;
import java.util.Random;

public class BlockDeepCrystal extends BlockGlass {

    protected IIcon[] icons;

    public BlockDeepCrystal(){
        super(Material.glass, false);
        setLightOpacity(0);
        setHardness(0.3f);
        setResistance(0.3f);
        setLightLevel(0.4f);
        this.setStepSound(Block.soundTypeGlass);
        this.setCreativeTab(PluginMod.blocksTab);

        for(EnumDeepCrystal deepCrystal : EnumDeepCrystal.values()){
            this.setHarvestLevel("pickaxe", deepCrystal.getHarvestLevel(), deepCrystal.getMeta());
        }
    }

    @Override
    public int quantityDropped(Random p_149745_1_) {
        return 1;
    }


    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    protected boolean canSilkHarvest() {
        return true;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side) {
        ForgeDirection face = ForgeDirection.getOrientation(side)
                .getOpposite();
        int meX = x + face.offsetX;
        int meY = y + face.offsetY;
        int meZ = z + face.offsetZ;
        Block block = world.getBlock(meX, meY, meZ);
        int meta = world.getBlockMetadata(meX, meY, meZ);
        Block otherBlock = world.getBlock(x, y, z);
        int otherMeta = world.getBlockMetadata(x, y, z);
        return block != otherBlock || meta != otherMeta;
    }

    @Override
    public int getRenderBlockPass() {
        return 1;
    }

    @Override
    public int damageDropped(int meta){
        return meta;
    }


    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, List list){
        for (EnumDeepCrystal dark: EnumDeepCrystal.values()){
            list.add(new ItemStack(item, 1, dark.getMeta()));
        }
    }

    @Override
    public void registerBlockIcons(IIconRegister reg){

        icons = new IIcon[EnumDeepCrystal.count()];
        String prefix = "plug:deepcrystal_";

        for(EnumDeepCrystal dark : EnumDeepCrystal.values()){
            icons[dark.getMeta()] = reg.registerIcon(prefix + dark.getName().toLowerCase());
        }
    }

    @Override
    public IIcon getIcon(int side, int meta){

        if(meta >= 0 && meta < EnumDeepCrystal.count()){
            return icons[meta];
        }
        return null;
    }
}
