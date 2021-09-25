package KAMKEEL.PluginMod.Items.Weapons.Broken;

import KAMKEEL.PluginMod.Items.Weapons.ItemWeaponBroken;
import org.lwjgl.opengl.GL11;

public class ItemBrokenJungleAxe extends ItemWeaponBroken {

    public ItemBrokenJungleAxe(int par1, ToolMaterial tool) {
        super(par1, tool);
    }

    @Override
    public void renderSpecial(){
        GL11.glScalef(1f, 0.8f,1f);
        GL11.glTranslatef(0.14F, 0.22f, 0.06f);
        GL11.glRotatef(0, 0, 1, 0);
    }

}


