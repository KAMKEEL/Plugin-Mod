package KAMKEEL.PluginMod.Items.Weapons;

import org.lwjgl.opengl.GL11;

public class ItemLongStaff extends ItemPluginWeaponInterface{

	public ItemLongStaff(int par1 , ToolMaterial tool) {
		super(par1, tool);
	}

	@Override
	public void renderSpecial(){
		GL11.glScalef(1f, 1.3f, 1f);
		GL11.glTranslatef(-0.12f, -0.5f, -0.10f);
		GL11.glRotatef(180, 0, 1, 0);
	}
}
