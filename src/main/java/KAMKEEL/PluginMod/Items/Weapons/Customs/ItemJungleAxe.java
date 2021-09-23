package KAMKEEL.PluginMod.Items.Weapons.Customs;

import KAMKEEL.PluginMod.Items.ModItems;
import KAMKEEL.PluginMod.Items.Weapons.ModWeapons;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

public class ItemJungleAxe extends CustomItemBroken {


    public ItemJungleAxe(int par1, ToolMaterial tool, Item broken) {
        super(par1, tool, broken);
        this.setMaxDamage(100000);
        this.setTransformItem(ModWeapons.JungleAxeEnergized);
    }

    public ItemJungleAxe(int par1, ToolMaterial tool, Item broken, Item transform) {
        super(par1, tool, broken);
        this.setMaxDamage(100000);
        this.setTransformItem(transform);
    }

    @Override
    public void renderSpecial(){
        GL11.glScalef(1f, 0.8f,1f);
        GL11.glTranslatef(0.14F, 0.22f, 0.06f);
        GL11.glRotatef(0, 0, 1, 0);
    }

}
