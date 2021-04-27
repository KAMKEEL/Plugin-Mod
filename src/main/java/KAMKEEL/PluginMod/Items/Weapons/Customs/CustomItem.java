package KAMKEEL.PluginMod.Items.Weapons.Customs;

import KAMKEEL.PluginMod.Items.ItemTransform;
import KAMKEEL.PluginMod.Items.Weapons.ItemPluginWeaponInterface;
import net.minecraft.item.Item;

public class CustomItem extends ItemPluginWeaponInterface implements ItemTransform {

    private Item transformState;

    public CustomItem(int par1, Item.ToolMaterial tool) {
        super(par1, tool);
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
