package KAMKEEL.PluginMod.Items.Weapons;

import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;


public class ItemBattleAxe extends ItemPluginWeaponInterface{

    public ItemBattleAxe(int par1, Item.ToolMaterial tool) {
        super(par1, tool);
    }

    public void renderSpecial(){
        GL11.glScalef(1f, 0.8f,1f);
        GL11.glTranslatef(-0.04f, 0.2f, -0.16f);
        GL11.glRotatef(180, 0, 1, 0);
    }
}
