package KAMKEEL.PluginMod.Items.Weapons.Unique;

import KAMKEEL.PluginMod.Items.ItemTransform;
import KAMKEEL.PluginMod.Items.Weapons.*;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class ItemUniqueScythe extends ItemUniqueWeapon {

    public ItemUniqueScythe(int par1, Item.ToolMaterial tool, boolean transformer, boolean reversible, Item broke) {
        super(par1, tool, transformer, reversible, broke);
    }

    public ItemUniqueScythe(int par1, Item.ToolMaterial tool, boolean transformer, boolean reversible) {
        super(par1, tool, transformer, reversible);
    }

    @Override
    public void renderSpecial(){
        GL11.glScalef(1f, 1.3f, 1f);
        GL11.glTranslatef(0.0F, -0.2f, -0.16f);
        GL11.glRotatef(180, 0, 1, 0);
    }
}


