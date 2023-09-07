package kamkeel.plugin.Items.Weapons.Glass;

import kamkeel.plugin.Items.ItemCustomTransparent;
import kamkeel.plugin.Items.ItemReversible;
import kamkeel.plugin.Items.Weapons.*;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class ItemGlassKunaiReversed extends ItemGlassKunai implements ItemReversible, ItemCustomTransparent {

    private ItemKunai kunai;
    public ItemGlassKunaiReversed(int par1, ItemKunai kunai, ToolMaterial tool) {
        super(par1,tool);
        this.kunai = kunai;
    }

    @Override
    public void renderSpecial(){
        GL11.glScalef(0.4f, 0.4f, 0.4f);
        GL11.glRotatef(180F, 1F, 0F, 0F);
        GL11.glTranslatef(-0.4f, -0.9f, 0.2f);
    }

    @Override
    public Item getReverseState() {
        return ModWeapons.GlassKunai;
    }

    @Override
    public void registerIcons(IIconRegister par1IconRegister)
    {
        this.itemIcon = kunai.getIconFromDamage(0);
    }
}
