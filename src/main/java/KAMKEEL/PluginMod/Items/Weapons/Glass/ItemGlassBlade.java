package KAMKEEL.PluginMod.Items.Weapons.Glass;

import KAMKEEL.PluginMod.Items.ItemCustomTransparent;
import KAMKEEL.PluginMod.Items.Weapons.ItemGlass;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class ItemGlassBlade extends ItemGlass implements ItemCustomTransparent {

    public ItemGlassBlade(Item.ToolMaterial tool) {
        super(tool);
    }

    @Override
    public void renderSpecial(){
        GL11.glScalef(0.8f, 0.8f, 0.8f);
        GL11.glTranslatef(-0.2F, 0.28f, -0.12f);
        GL11.glRotatef(180, 0, 1, 0);
        GL11.glRotatef(-16, 0, 0, 1);
    }

}
