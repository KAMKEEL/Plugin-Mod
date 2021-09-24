package KAMKEEL.PluginMod.Items.Weapons;

import org.lwjgl.opengl.GL11;

public class ItemKatana extends ItemPluginWeaponInterface{

	public ItemKatana(int par1, ToolMaterial tool) {
		super(par1, tool);
	}

	@Override
	public void renderSpecial(){
		GL11.glScalef(1f, 1.1f, 1f);
		GL11.glTranslatef(0.08F, 0.22f, 0.10f);

	}
}
