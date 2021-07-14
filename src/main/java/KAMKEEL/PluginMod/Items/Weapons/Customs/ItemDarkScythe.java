package KAMKEEL.PluginMod.Items.Weapons.Customs;

import KAMKEEL.PluginMod.Items.ItemTransform;
import KAMKEEL.PluginMod.Items.ModItems;
import KAMKEEL.PluginMod.Items.Weapons.ItemDagger;
import KAMKEEL.PluginMod.Items.Weapons.ItemPluginWeaponInterface;
import KAMKEEL.PluginMod.Items.Weapons.ItemReversable;
import KAMKEEL.PluginMod.Items.Weapons.ItemScythe;
import net.minecraft.item.Item;

public class ItemDarkScythe extends ItemScythe implements ItemTransform {

    private Item transformState;

    public ItemDarkScythe(int par1, Item.ToolMaterial tool) {
        super(par1, tool);
        this.setTransformItem(ModItems.DarkScytheEnergized);
    }

    public ItemDarkScythe(int par1, Item.ToolMaterial tool, Item transform) {
        super(par1, tool);
        this.setTransformItem(transform);
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

