package KAMKEEL.PluginMod.Items.Weapons.Unique;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class ItemUniqueDaggerReversed extends ItemUniqueDagger {

    private final ItemUniqueDagger dagger;

    public ItemUniqueDaggerReversed(int par1, Item.ToolMaterial tool, boolean transformer, boolean reversible, ItemUniqueDagger dagger) {
        super(par1, tool, transformer, reversible);
        this.dagger = dagger;
    }

    public ItemUniqueDaggerReversed(int par1, Item.ToolMaterial tool, boolean transformer, boolean reversible, Item broke, ItemUniqueDagger dagger) {
        super(par1, tool, transformer, reversible, broke);
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

}

