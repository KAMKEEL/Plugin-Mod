package KAMKEEL.PluginMod.Network;

import KAMKEEL.PluginMod.Items.ItemTransform;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
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
            ItemStack currentItemStack = player.getHeldItem();
            Item currentItem = currentItemStack.getItem();
            if(currentItem instanceof ItemTransform){
                if(((ItemTransform) currentItem).canTransform()) {
                    ItemStack replace = new ItemStack(((ItemTransform) currentItemStack.getItem()).getTransformItem(), 1);
                    replace.setItemDamage(currentItemStack.getItemDamage());
                    replace.setTagCompound(currentItemStack.getTagCompound());
                    player.inventory.setInventorySlotContents(player.inventory.currentItem, replace);
                }
            }
        }
    }
}
