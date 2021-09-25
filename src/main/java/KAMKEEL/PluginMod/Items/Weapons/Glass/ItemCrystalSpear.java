package KAMKEEL.PluginMod.Items.Weapons.Glass;

import KAMKEEL.PluginMod.Items.ItemCustomTransparent;
import KAMKEEL.PluginMod.Items.Weapons.ItemGlass;
import org.lwjgl.opengl.GL11;

public class ItemCrystalSpear extends ItemGlass implements ItemCustomTransparent {

    public ItemCrystalSpear(ToolMaterial tool) {
        super(tool);
    }

    @Override
    public void renderSpecial(){
        GL11.glScalef(1f, 1.3f, 1f);
        GL11.glTranslatef(-0.12f, -0.24f, -0.16f);
        GL11.glRotatef(180, 0, 1, 0);
    }

}
