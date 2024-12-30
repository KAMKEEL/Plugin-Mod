package kamkeel.plugin.Items.Weapons.Unique;

import kamkeel.plugin.Items.Weapons.ItemUniqueWeapon;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class ItemUniqueSpear extends ItemUniqueWeapon {

    public ItemUniqueSpear(int par1, ToolMaterial tool, boolean transformer, boolean reversible, Item broke) {
        super(par1, tool, transformer, reversible, broke);
    }

    public ItemUniqueSpear(int par1, ToolMaterial tool, boolean transformer, boolean reversible) {
        super(par1, tool, transformer, reversible);
    }

    @Override
    public void renderSpecial(){
        GL11.glScalef(1f, 1.3f, 1f);
        GL11.glTranslatef(-0.12f, -0.24f, -0.16f);
        GL11.glRotatef(180, 0, 1, 0);
    }
}


