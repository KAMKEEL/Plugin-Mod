package KAMKEEL.PluginMod.Items.Weapons.Customs;

import KAMKEEL.PluginMod.Items.ItemCustomTransparent;
import KAMKEEL.PluginMod.Items.ModItems;
import KAMKEEL.PluginMod.Items.Weapons.ItemDagger;
import KAMKEEL.PluginMod.Items.Weapons.ItemKunai;
import KAMKEEL.PluginMod.Items.Weapons.ItemPluginWeaponInterface;
import KAMKEEL.PluginMod.Items.Weapons.ItemReversable;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class ItemGlassKunai extends ItemKunai implements ItemReversable, ItemCustomTransparent {

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
        return ModItems.GlassKunaiReversed;
    }

    @Override
    public void setReverseState(Item item) {

    }

}
