package KAMKEEL.PluginMod.Items.Weapons;

import org.lwjgl.opengl.GL11;


public class ItemWarAxe extends ItemPluginWeaponInterface{

    public ItemWarAxe(int par1, ToolMaterial tool) {
        super(par1, tool);
    }

    public void renderSpecial(){
        GL11.glScalef(1.2f, 1.2f,1.2f);
        GL11.glTranslatef(0.14F, -0.1f, 0.06f);
        GL11.glRotatef(0, 0, 1, 0);
    }

}
