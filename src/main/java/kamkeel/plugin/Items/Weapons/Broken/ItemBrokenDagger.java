package kamkeel.plugin.Items.Weapons.Broken;

import kamkeel.plugin.Items.ItemReversible;
import kamkeel.plugin.Items.Weapons.ItemWeaponBroken;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class ItemBrokenDagger extends ItemWeaponBroken implements ItemReversible {

    public Item reverse;

    public ItemBrokenDagger(int par1, ToolMaterial tool) {
        super(par1, tool);
    }

    @Override
    public void renderSpecial() {
        GL11.glScalef(0.6f, 0.6f, 0.6f);
        GL11.glTranslatef(0.14F, 0.22f, 0.06f);
    }

    @Override
    public Item getReverseState() {
        return reverse;
    }

    @Override
    public void setReverseState(Item item) {
        reverse = item;
    }

    @Override
    public boolean canReverse() {
        return true;
    }
}


