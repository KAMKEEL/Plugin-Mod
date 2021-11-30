package KAMKEEL.PluginMod.Items.Weapons;

import KAMKEEL.PluginMod.Items.ItemTransform;
import KAMKEEL.PluginMod.Items.Weapons.ItemPluginWeaponInterface;
import KAMKEEL.PluginMod.Items.ItemReversible;
import KAMKEEL.PluginMod.Items.Weapons.ModWeapons;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import java.util.List;

public class ItemUniqueWeapon extends ItemPluginWeaponInterface implements ItemTransform, ItemReversible {

    private Item transformState = Items.stone_sword;
    private Item reverseItem = Items.stone_hoe;
    private Item brokeItem = Items.stone_shovel;

    private static final String stage = "stage";
    private static final String[] stageNames = new String[]{"Broken", "Dull", "Worn", "Sharp"};

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

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean b)
    {
        if (stack.hasTagCompound() && stack.getTagCompound().hasKey(stage))
        {
            lores.add(stageNames[stack.getTagCompound().getInteger(stage)]);
        }
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
        if (player instanceof EntityPlayer){
            //The Entity Is A Player.
            EntityPlayer theplay = (EntityPlayer) player;
            stack.damageItem(1, player);
            if(breakable){
                short currentStage = getNBTStageNum(stack);
                double maxDmgAllow = stack.getMaxDamage() - 3;
                updateNBTData(stack, currentStage);
                if(stack.getItemDamage() >= maxDmgAllow){
                    int slot = theplay.inventory.currentItem;
                    if(currentStage == 3 || currentStage == 2){
                        currentStage--;
                        updateNBTData(stack, currentStage);
                        stack.setItemDamage(0);
                    }
                    else {
                        updateNBTData(stack, (short) 0);
                        ItemStack stack2 = new ItemStack(brokeItem, 1);
                        stack2.setTagCompound(stack.getTagCompound());
                        theplay.inventory.setInventorySlotContents(slot, stack2);
                    }
                }
            }
        }
        else {
            stack.damageItem(1, player);
        }
        return true;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World world, Block block, int p_150894_4_, int p_150894_5_, int p_150894_6_, EntityLivingBase player)
    {
        if ((double)block.getBlockHardness(world, p_150894_4_, p_150894_5_, p_150894_6_) != 0.0D)
        {
            if (player instanceof EntityPlayer){
                //The Entity Is A Player.
                EntityPlayer theplay = (EntityPlayer) player;
                stack.damageItem(1, player);
                if(breakable){
                    short currentStage = getNBTStageNum(stack);
                    double maxDmgAllow = stack.getMaxDamage() - 3;
                    updateNBTData(stack, currentStage);
                    if(stack.getItemDamage() >= maxDmgAllow){
                        int slot = theplay.inventory.currentItem;
                        if(currentStage == 3 || currentStage == 2){
                            currentStage--;
                            updateNBTData(stack, currentStage);
                            stack.setItemDamage(0);
                        }
                        else {
                            updateNBTData(stack, (short) 0);
                            ItemStack stack2 = new ItemStack(brokeItem, 1);
                            stack2.setTagCompound(stack.getTagCompound());
                            theplay.inventory.setInventorySlotContents(slot, stack2);
                        }
                    }
                }
            }
            else {
                stack.damageItem(1, player);
            }
        }

        return true;
    }

    public ItemStack updateNBTData(ItemStack stack, short currentStage){
        NBTTagCompound nbt;
        if (stack.hasTagCompound())
        { nbt = stack.getTagCompound(); }
        else { nbt = new NBTTagCompound(); }

        nbt.setShort(stage, currentStage);
        stack.setTagCompound(nbt);

        return stack;
    }

    public short getNBTStageNum(ItemStack stack){
        NBTTagCompound nbt;
        if (stack.hasTagCompound())
        {
            nbt = stack.getTagCompound();
            if(nbt.hasKey(stage)){
                return nbt.getShort(stage);
            }
            else {
                return 3;
            }
        }
        else {
            return 3;
        }
    }

}
