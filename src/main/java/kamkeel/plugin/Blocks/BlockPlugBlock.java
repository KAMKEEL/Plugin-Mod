package kamkeel.plugin.Blocks;

import kamkeel.plugin.PluginMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPlugBlock extends Block {


    public BlockPlugBlock(String texture){
        super(Material.rock);

        this.setHardness(3.0f);
        this.setResistance(15.0f);
        this.setStepSound(Block.soundTypeStone);
        this.setLightLevel(1.0F);
        this.setBlockTextureName(texture);
        this.setHarvestLevel("pickaxe", 0);
        this.setCreativeTab(PluginMod.blocksTab);
    }
}
