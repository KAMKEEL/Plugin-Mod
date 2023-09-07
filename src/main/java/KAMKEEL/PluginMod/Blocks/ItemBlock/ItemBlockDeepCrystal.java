package KAMKEEL.PluginMod.Blocks.ItemBlock;

import KAMKEEL.PluginMod.Enum.Blocks.EnumDeepCrystal;
import KAMKEEL.PluginMod.LocalizationHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockDeepCrystal extends ItemBlock {

    public ItemBlockDeepCrystal(Block block){

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
        EnumDeepCrystal deepCrystal = EnumDeepCrystal.values()[metadata];
        return LocalizationHelper.BLOCK_PREFIX + "deepcrystal_" + deepCrystal.getName().toLowerCase();
    }

}
