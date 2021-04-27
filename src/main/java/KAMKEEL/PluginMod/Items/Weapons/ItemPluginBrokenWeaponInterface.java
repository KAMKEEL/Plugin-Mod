package KAMKEEL.PluginMod.Items.Weapons;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

public class ItemPluginBrokenWeaponInterface extends ItemPluginWeaponInterface{

    private Item broke;
    public ItemPluginBrokenWeaponInterface(int par1, ToolMaterial tool, Item broken) {
        super(par1, tool);
        this.broke = broken;
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase entity, EntityLivingBase player)
    {
        if (player instanceof EntityPlayer){
            //The Entity Is A Player.
            EntityPlayer theplay = (EntityPlayer) player;
            stack.damageItem(1, player);
            double maxDmgAllow = stack.getMaxDamage() * 0.99975;
            if(stack.getItemDamage() >= maxDmgAllow){
                int slot = theplay.inventory.currentItem;
                ItemStack stack2 = new ItemStack(broke, 1);
                stack2.setTagCompound(stack.getTagCompound());
                theplay.inventory.setInventorySlotContents(slot, stack2);
            }
        }
        return true;
    }

}
