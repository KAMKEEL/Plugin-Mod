package KAMKEEL.PluginMod.Blocks.ItemBlock;

import KAMKEEL.PluginMod.Enum.Blocks.EnumDark;
import KAMKEEL.PluginMod.LocalizationHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockDark extends ItemBlock {

    public ItemBlockDark(Block block){

        super(block);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }


    @Override
    public int getMetadata(int meta){
        return meta;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){

        int metadata = stack.getItemDamage();
        EnumDark dark = EnumDark.values()[metadata];
        return LocalizationHelper.BLOCK_PREFIX + "dark_" + dark.getName().toLowerCase();
    }

}
