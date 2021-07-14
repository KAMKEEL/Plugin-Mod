package KAMKEEL.PluginMod.Items.Weapons.Customs;

import KAMKEEL.PluginMod.Items.ModItems;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class ItemDarkDaggerReversedBroken extends ItemDarkDaggerBroken {

    private ItemDarkDaggerBroken dagger;

    public ItemDarkDaggerReversedBroken(int par1, ItemDarkDaggerBroken dagger, ToolMaterial tool) {
        super(par1, tool);
        this.dagger = dagger;
    }

    @Override
    public void renderSpecial(){
        GL11.glScalef(0.6f, 0.6f, 0.6f);
        GL11.glTranslatef(0.16f, 0.6f, -0.16f);
        GL11.glRotatef(180F, 1F, 0F, 0F);
    }

    @Override
    public void registerIcons(IIconRegister par1IconRegister)
    {
        this.itemIcon = dagger.getIconFromDamage(0);
    }

    @Override
    public Item getReverseState() {
        return ModItems.DarkDaggerBroken;
    }
}

