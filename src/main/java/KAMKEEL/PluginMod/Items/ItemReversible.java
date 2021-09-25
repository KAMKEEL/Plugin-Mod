package KAMKEEL.PluginMod.Items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public interface ItemReversible {
    public Item getReverseState();
    public void setReverseState(Item item);
    public boolean canReverse();
}
