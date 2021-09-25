package KAMKEEL.PluginMod.Items;

import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAppleGold;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class PluginItemFoodInterface extends ItemFood implements ItemRenderInterface {

    public PluginItemFoodInterface(int saturation, float eatTime, boolean wolfFeed) {
        super(saturation, eatTime, wolfFeed);
        PluginMod.proxy.registerItem(this);
    }

    public void renderSpecial(){
        GL11.glScalef(0.66f, 0.66f,0.66f);
        GL11.glTranslatef(0, 0.3f, 0);
    }

    @Override
    public Item setUnlocalizedName(String name){
        GameRegistry.registerItem(this, name);
        return super.setUnlocalizedName(LocalizationHelper.MOD_PREFIX + name);
    }
}
