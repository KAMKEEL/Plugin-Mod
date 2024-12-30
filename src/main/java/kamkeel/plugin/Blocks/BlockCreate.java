package kamkeel.plugin.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockCreate extends BlockGeneric {

    private static final String[] blockTextures = new String[]{
            "raw", "polished", "layer", "brick", "small_brick", "cut",
    };

    @SideOnly(Side.CLIENT)
    private IIcon[] blockIcons;

    @SideOnly(Side.CLIENT)
    private IIcon pillarTop;

    public BlockCreate(String blockName, Class enumClass) {
        super(blockName, enumClass, Material.rock);
        this.textureName = blockName;
    }

//    @Override
//    public int getRenderType() {
//        return 39;
//    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
//        if (meta == 6 || meta == 7 || meta == 8) { // Handle pillar orientations
//            if (meta == 6) { // Vertical pillar
//                return (side == 0 || side == 1) ? this.pillarTop : this.blockIcons[6];
//            }
//            if (meta == 7) { // East-west pillar
//                return (side == 4 || side == 5) ? this.pillarTop : rotateSideIcon(side, meta);
//            }
//            if (meta == 8) { // North-south pillar
//                return (side == 2 || side == 3) ? this.pillarTop : rotateSideIcon(side, meta);
//            }
//        }

        if (meta < 0 || meta >= blockIcons.length) {
            meta = 0;
        }
        return blockIcons[meta];
    }

    /**
     * Rotates the side texture for horizontal pillars based on their orientation.
     * @param side The side of the block being rendered.
     * @param meta The block metadata.
     * @return The rotated side icon.
     */
//    @SideOnly(Side.CLIENT)
//    private IIcon rotateSideIcon(int side, int meta) {
//        if (meta == 7) { // East-west orientation
//            return (side == 2 || side == 3) ? this.blockIcons[6] : this.blockIcons[7]; // Rotate sides for east-west
//        }
//        if (meta == 8) { // North-south orientation
//            return (side == 4 || side == 5) ? this.blockIcons[6] : this.blockIcons[7]; // Rotate sides for north-south
//        }
//        return this.blockIcons[6];
//    }

    @Override
    public int onBlockPlaced(World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int meta) {
//        if (meta == 6) { // Handle pillar placement logic
//            switch (side) {
//                case 0:
//                case 1:
//                    return 6; // Vertical orientation
//                case 2:
//                case 3:
//                    return 8; // North-south orientation
//                case 4:
//                case 5:
//                    return 7; // East-west orientation
//            }
//        }
        return meta;
    }

    @Override
    public int damageDropped(int meta) {
        return (meta == 6 || meta == 7 || meta == 8) ? 6 : meta; // Drop the default vertical pillar
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister reg) {
        String prefix = "plug:";
        this.blockIcons = new IIcon[blockTextures.length];
        for (int i = 0; i < blockTextures.length; ++i) {
            this.blockIcons[i] = reg.registerIcon(prefix + this.getTextureName() + "_" + blockTextures[i]);
        }
        this.pillarTop = reg.registerIcon(prefix + this.getTextureName() + "_cut"); // Top texture for pillars
    }
}
