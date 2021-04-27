package KAMKEEL.PluginMod.Items.Weapons.Customs;

import KAMKEEL.PluginMod.Items.ModItems;
import net.minecraft.item.Item;

public class ItemBlueLongsword extends CustomItemBroken {

    public ItemBlueLongsword(int par1, ToolMaterial tool, Item broken) {
        super(par1, tool, broken);
        this.setMaxDamage(100000);
        this.setTransformItem(ModItems.BlueLongSwordEnergized);
    }

    public ItemBlueLongsword(int par1, ToolMaterial tool, Item broken, Item transform) {
        super(par1, tool, broken);
        this.setMaxDamage(100000);
        this.setTransformItem(transform);
    }
}


