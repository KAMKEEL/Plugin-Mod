package kamkeel.plugin.Items.Weapons.Glass;

import kamkeel.plugin.Items.Weapons.ItemUniqueWeapon;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class ItemGlassPan extends ItemUniqueWeapon {

    public ItemGlassPan(int par1, Item.ToolMaterial tool, boolean transformer, boolean reversible, Item broke) {
        super(par1, tool, transformer, reversible, broke);
    }

    @Override
    public void renderSpecial(){
        GL11.glScalef(0.66f, 0.66f,0.66f);
        GL11.glTranslatef(0.16f, 0.26f, 0.06f);
    }

}
