package KAMKEEL.PluginMod.Items;

import KAMKEEL.PluginMod.Items.Weapons.ModWeapons;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public interface ItemTransform {

    public Item getTransformItem();
    public void setTransformItem(Item item);
    public boolean canTransform();

}
