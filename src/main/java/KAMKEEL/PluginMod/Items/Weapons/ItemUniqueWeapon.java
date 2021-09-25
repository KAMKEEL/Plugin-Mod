package KAMKEEL.PluginMod.Items.Weapons;

import KAMKEEL.PluginMod.Items.ItemTransform;
import KAMKEEL.PluginMod.Items.Weapons.ItemPluginWeaponInterface;
import KAMKEEL.PluginMod.Items.ItemReversible;
import KAMKEEL.PluginMod.Items.Weapons.ModWeapons;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class ItemUniqueWeapon extends ItemPluginWeaponInterface implements ItemTransform, ItemReversible {

    private Item transformState = Items.stone_sword;
    private Item reverseItem = Items.stone_hoe;
    private Item brokeItem = Items.stone_shovel;

    private final boolean transformer;
    private final boolean reversible;
    private final boolean breakable;

    public ItemUniqueWeapon(int par1, Item.ToolMaterial tool,
                            boolean transformer, boolean reversible) {
        super(par1, tool);
        this.transformer = transformer;
        this.reversible = reversible;
        this.breakable = false;
    }

    public ItemUniqueWeapon(int par1, Item.ToolMaterial tool,
                            boolean transformer, boolean reversible, Item brokenWeapon) {
        super(par1, tool);
        this.transformer = transformer;
        this.reversible = reversible;
        this.breakable = true;
        this.brokeItem = brokenWeapon;
    }

    @Override
    public Item getTransformItem() {
        return transformState;
    }

    @Override
    public void setTransformItem(Item item) {
        transformState = item;
    }

    @Override
    public boolean canTransform() {
        return transformer;
    }

    @Override
    public Item getReverseState() {
        return reverseItem;
    }

    @Override
    public void setReverseState(Item item) { reverseItem = item; }

    @Override
    public boolean canReverse() {
        return reversible;
    }

    public void setBrokeItem(Item broke){
        brokeItem = broke;
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase entity, EntityLivingBase player) {
        if(breakable){
            if (player instanceof EntityPlayer){
                //The Entity Is A Player.
                EntityPlayer theplay = (EntityPlayer) player;
                stack.damageItem(1, player);
                double maxDmgAllow = stack.getMaxDamage() * 0.99975;
                if(stack.getItemDamage() >= maxDmgAllow){
                    int slot = theplay.inventory.currentItem;
                    ItemStack stack2 = new ItemStack(brokeItem, 1);
                    stack2.setTagCompound(stack.getTagCompound());
                    theplay.inventory.setInventorySlotContents(slot, stack2);
                }
            }
        }
        return true;
    }

}
