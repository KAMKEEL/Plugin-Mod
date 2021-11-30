package KAMKEEL.PluginMod.Network;

import KAMKEEL.PluginMod.Items.ItemReversible;
import KAMKEEL.PluginMod.Items.ItemTransform;
import KAMKEEL.PluginMod.Items.Weapons.ItemUniqueWeapon;
import io.netty.buffer.ByteBuf;
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
            ItemStack currentItemStack = player.getHeldItem();
            Item currentItem = currentItemStack.getItem();
            if(currentItem instanceof ItemReversible) {
                if (((ItemReversible) currentItem).canReverse()) {
                    ItemStack replace = new ItemStack(((ItemReversible) currentItemStack.getItem()).getReverseState(), 1);
                    replace.setItemDamage(currentItemStack.getItemDamage());
                    replace.setTagCompound(currentItemStack.getTagCompound());
                    player.inventory.setInventorySlotContents(player.inventory.currentItem, replace);
                }
            }
        }
    }
}
