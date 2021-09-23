package KAMKEEL.PluginMod.Items.Weapons;

import org.lwjgl.opengl.GL11;


public class ItemHammer extends ItemPluginWeaponInterface{

	public ItemHammer(int par1, ToolMaterial tool) {
		super(par1, tool);
	}
	
	public void renderSpecial(){
		GL11.glScalef(1.2f, 1.4f, 1f);
		GL11.glTranslatef(0.2F, -0.08f, 0.08f);
	}
	
}
