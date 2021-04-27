package KAMKEEL.PluginMod.Network;

import KAMKEEL.PluginMod.Items.ModItems;
import KAMKEEL.PluginMod.Items.Weapons.Customs.ItemDarkDagger;
import KAMKEEL.PluginMod.Items.Weapons.Customs.ItemDarkDaggerReversed;
import KAMKEEL.PluginMod.Items.Weapons.ItemDaggerReversed;
import KAMKEEL.PluginMod.Items.Weapons.ItemReversable;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class MessageSwitchOrientation extends MessageBase<MessageSwitchOrientation> {

    @Override
    public void fromBytes(ByteBuf buf) {
        // ADD INFORMATION
    }

    @Override
    public void toBytes(ByteBuf buf) {
        // EXTRACT INFORMATION
    }

    @Override
    public void handleClientSide(MessageSwitchOrientation message, EntityPlayer player) {
        // Add a Sound?
    }

    @Override
    public void handleServerSide(MessageSwitchOrientation message, EntityPlayer player) {
        if(player.getHeldItem() != null){
            ItemStack currentCopy = player.getHeldItem();
            if(currentCopy.getItem() instanceof ItemReversable){
                ItemStack replace = new ItemStack(((ItemReversable) currentCopy.getItem()).getReverseState(), 1);
                replace.setItemDamage(currentCopy.getItemDamage());
                replace.setTagCompound(currentCopy.getTagCompound());
                player.inventory.setInventorySlotContents(player.inventory.currentItem, replace);
            }
        }
    }
}
