package KAMKEEL.PluginMod.Network;

import KAMKEEL.PluginMod.Items.ItemTransform;
import KAMKEEL.PluginMod.Items.Weapons.ItemReversable;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;


public class MessageTransformItem extends MessageBase<MessageTransformItem> {

    @Override
    public void fromBytes(ByteBuf buf) {
        // ADD INFORMATION
    }

    @Override
    public void toBytes(ByteBuf buf) {
        // EXTRACT INFORMATION
    }

    @Override
    public void handleClientSide(MessageTransformItem message, EntityPlayer player) {

    }

    @Override
    public void handleServerSide(MessageTransformItem message, EntityPlayer player) {
        if(player.getHeldItem() != null){
            ItemStack currentCopy = player.getHeldItem();
            if(currentCopy.getItem() instanceof ItemTransform){
                ItemStack replace = new ItemStack(((ItemTransform) currentCopy.getItem()).getTransformItem(), 1);
                replace.setItemDamage(currentCopy.getItemDamage());
                replace.setTagCompound(currentCopy.getTagCompound());
                player.inventory.setInventorySlotContents(player.inventory.currentItem, replace);
            }
        }
    }
}
