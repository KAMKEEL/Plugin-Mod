package KAMKEEL.PluginMod.Items.Weapons;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public interface ItemReversable {
    public Item getReverseState();
    public void setReverseState(Item item);
}
