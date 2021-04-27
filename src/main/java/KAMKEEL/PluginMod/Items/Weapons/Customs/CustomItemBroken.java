package KAMKEEL.PluginMod.Items.Weapons.Customs;

import KAMKEEL.PluginMod.Items.ItemTransform;
import KAMKEEL.PluginMod.Items.ModItems;
import KAMKEEL.PluginMod.Items.Weapons.ItemPluginBrokenWeaponInterface;
import net.minecraft.item.Item;

public class CustomItemBroken extends ItemPluginBrokenWeaponInterface implements ItemTransform {

    private Item transformState;

    public CustomItemBroken(int par1, ToolMaterial tool, Item broken) {
        super(par1, tool, broken);
    }

    @Override
    public Item getTransformItem() {
        return transformState;
    }

    @Override
    public void setTransformItem(Item item) {
        transformState = item;
    }
}
