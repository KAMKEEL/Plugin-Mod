package KAMKEEL.PluginMod.Items.Weapons.Unique;

import KAMKEEL.PluginMod.Items.Weapons.ItemUniqueWeapon;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class ItemUniqueAxe extends ItemUniqueWeapon {


    public ItemUniqueAxe(int par1, Item.ToolMaterial tool, boolean transformer, boolean reversible, Item broke) {
        super(par1, tool, transformer, reversible, broke);
    }

    public ItemUniqueAxe(int par1, Item.ToolMaterial tool, boolean transformer, boolean reversible) {
        super(par1, tool, transformer, reversible);
    }

    @Override
    public void renderSpecial(){
        GL11.glScalef(1f, 0.8f,1f);
        GL11.glTranslatef(0.14F, 0.22f, 0.06f);
        GL11.glRotatef(0, 0, 1, 0);
    }

}
