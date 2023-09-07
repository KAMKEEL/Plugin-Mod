package kamkeel.plugin.Items.Weapons.Unique;

import kamkeel.plugin.Items.ItemTransform;
import kamkeel.plugin.Items.ItemReversible;
import kamkeel.plugin.Items.Weapons.ItemUniqueWeapon;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class ItemUniqueDagger extends ItemUniqueWeapon implements ItemReversible, ItemTransform {

    public ItemUniqueDagger(int par1, Item.ToolMaterial tool, boolean transformer, boolean reversible) {
        super(par1, tool, transformer, reversible);
    }

    public ItemUniqueDagger(int par1, Item.ToolMaterial tool, boolean transformer, boolean reversible, Item broke) {
        super(par1, tool, transformer, reversible, broke);
    }

    @Override
    public void renderSpecial() {
        GL11.glScalef(0.6f, 0.6f, 0.6f);
        GL11.glTranslatef(0.14F, 0.22f, 0.06f);
    }
}

