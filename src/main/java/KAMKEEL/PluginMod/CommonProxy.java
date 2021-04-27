package KAMKEEL.PluginMod;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy{

    public void load() {

    }

    public boolean hasClient() {
        return false;
    }

    public EntityPlayer getPlayer() {
        return null;
    }

    public void registerItem(Item item) {

    }

    public void registerBow(Item item) {

    }

    public void doOnLoadRegistration() {


    }

}

