package KAMKEEL.PluginMod.Items.Weapons.Glass;

import KAMKEEL.PluginMod.Items.ItemCustomTransparent;
import KAMKEEL.PluginMod.Items.ItemReversible;
import KAMKEEL.PluginMod.Items.Weapons.*;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class ItemGlassKunai extends ItemKunai implements ItemReversible, ItemCustomTransparent {

    public ItemGlassKunai(int par1, ToolMaterial tool) {
        super(par1, tool);
    }

    @Override
    public void renderSpecial() {
        GL11.glScalef(0.4f, 0.4f, 0.4f);
        GL11.glTranslatef(-0.4F, 0.5f, 0.1f);
    }

    @Override
    public Item getReverseState() {
        return ModWeapons.GlassKunaiReversed;
    }

    @Override
    public void setReverseState(Item item) {

    }

    @Override
    public boolean canReverse() {
        return true;
    }

}
