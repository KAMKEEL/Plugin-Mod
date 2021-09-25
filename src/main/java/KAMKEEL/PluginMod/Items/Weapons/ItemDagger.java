package KAMKEEL.PluginMod.Items.Weapons;

import KAMKEEL.PluginMod.Items.ItemReversible;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class ItemDagger extends ItemPluginWeaponInterface implements ItemReversible {

    private Item reversed;

    public ItemDagger(int par1, ToolMaterial tool) {
        super(par1, tool);
        this.reversed = ModWeapons.HunterKnife;
    }

    public ItemDagger(int par1, ToolMaterial tool, Item rev) {
        super(par1, tool);
        this.reversed = rev;
    }

    @Override
    public void renderSpecial() {
        GL11.glScalef(0.6f, 0.6f, 0.6f);
        GL11.glTranslatef(0.14F, 0.22f, 0.06f);
    }

    @Override
    public Item getReverseState() {
        return reversed;
    }

    @Override
    public void setReverseState(Item newReverse) {
        reversed = newReverse;
    }

    @Override
    public boolean canReverse() {
        return true;
    }
}