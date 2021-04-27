package KAMKEEL.PluginMod.Items.Weapons.Customs;

import KAMKEEL.PluginMod.Items.ModItems;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class ItemGlassPan extends CustomItemBroken {

    public ItemGlassPan(int par1, ToolMaterial tool, Item broken) {
        super(par1, tool, broken);
        this.setMaxDamage(100000);
        this.setTransformItem(ModItems.GlassPanEnergized);
    }

    public ItemGlassPan(int par1, ToolMaterial tool, Item broken, Item transform) {
        super(par1, tool, broken);
        this.setMaxDamage(100000);
        this.setTransformItem(transform);
    }

    @Override
    public void renderSpecial(){
        GL11.glScalef(0.66f, 0.66f,0.66f);
        GL11.glTranslatef(0.16f, 0.26f, 0.06f);
    }

}
