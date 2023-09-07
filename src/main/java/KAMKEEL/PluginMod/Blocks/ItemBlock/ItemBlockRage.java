package KAMKEEL.PluginMod.Blocks.ItemBlock;

import KAMKEEL.PluginMod.Enum.Blocks.EnumRage;
import KAMKEEL.PluginMod.LocalizationHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockRage extends ItemBlock {

    public ItemBlockRage(Block block){

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
        EnumRage rage = EnumRage.values()[metadata];
        return LocalizationHelper.BLOCK_PREFIX + "rage_" + rage.getName().toLowerCase();
    }

}
