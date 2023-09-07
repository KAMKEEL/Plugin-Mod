package kamkeel.plugin.Items;

import net.minecraft.item.Item;

public interface ItemReversible {
    public Item getReverseState();
    public void setReverseState(Item item);
    public boolean canReverse();
}
