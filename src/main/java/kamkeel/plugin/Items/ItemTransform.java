package kamkeel.plugin.Items;

import net.minecraft.item.Item;

public interface ItemTransform {

    public Item getTransformItem();
    public void setTransformItem(Item item);
    public boolean canTransform();

}
