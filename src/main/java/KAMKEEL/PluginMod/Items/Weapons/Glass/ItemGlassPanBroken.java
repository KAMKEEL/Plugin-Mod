package KAMKEEL.PluginMod.Items.Weapons.Glass;

import KAMKEEL.PluginMod.Items.Weapons.ItemWeaponBroken;
import org.lwjgl.opengl.GL11;

public class ItemGlassPanBroken extends ItemWeaponBroken {

    public ItemGlassPanBroken(int par1, ToolMaterial tool) {
        super(par1, tool);
    }

    @Override
    public void renderSpecial(){
        GL11.glScalef(0.66f, 0.66f,0.66f);
        GL11.glTranslatef(0.16f, 0.26f, 0.06f);
        GL11.glEnable(GL11.GL_BLEND);
    }

}


