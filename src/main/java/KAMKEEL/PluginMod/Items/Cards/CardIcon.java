package KAMKEEL.PluginMod.Items.Cards;

import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CardIcon extends Item {

    public CardIcon() {

        this.setMaxStackSize(64);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(PluginMod.cardsTab);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){

        return LocalizationHelper.ITEM_PREFIX + "plugincard";
    }
}
