package KAMKEEL.PluginMod.Items.Misc;

import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TreasureMap extends Item {

    public TreasureMap() {

        this.setMaxStackSize(64);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(PluginMod.miscTab);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){

        return LocalizationHelper.ITEM_PREFIX + "treasuremap";
    }
}
