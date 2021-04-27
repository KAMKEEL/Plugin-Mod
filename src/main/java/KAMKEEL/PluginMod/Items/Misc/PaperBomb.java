package KAMKEEL.PluginMod.Items.Misc;

import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PaperBomb extends Item {

    public PaperBomb() {

        this.setMaxStackSize(64);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(PluginMod.weaponTab);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){

        return LocalizationHelper.ITEM_PREFIX + "paperbomb";
    }
}
