package KAMKEEL.PluginMod.Items.Weapons.Glass;

import KAMKEEL.PluginMod.Items.Weapons.ModWeapons;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class ItemGlassDaggerReversed extends ItemGlassDagger {

    private ItemGlassDagger dagger;

    public ItemGlassDaggerReversed(int par1, ItemGlassDagger dagger, ToolMaterial tool) {
        super(par1,tool);
        this.dagger = dagger;
        this.setReverseState(ModWeapons.HunterKnife);
    }

    public ItemGlassDaggerReversed(int par1, ItemGlassDagger dagger, ToolMaterial tool, Item rev) {
        super(par1,tool);
        this.dagger = dagger;
        this.setReverseState(rev);
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
}
