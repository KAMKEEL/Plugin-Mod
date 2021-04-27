package KAMKEEL.PluginMod.Items.Misc;

import KAMKEEL.PluginMod.Items.PluginItemInterface;
import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class MassiveRasengan extends PluginItemInterface {

    public MassiveRasengan() {
        this.setMaxStackSize(64);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(PluginMod.weaponTab);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){
        return LocalizationHelper.ITEM_PREFIX + "massiverasengan";
    }

    @Override
    public void renderSpecial(){
        GL11.glScalef(1.6f, 1.6f,1.6f);
        GL11.glTranslatef(0.2f, 0, 0);
        // GL11.glRotatef(120, 1, 0, 0);
        // GL11.glRotatef(-30, 0, 1, 0);
    };

}
