package KAMKEEL.PluginMod.Items.Weapons;

import KAMKEEL.PluginMod.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemGlass extends ItemSword {

    public ItemGlass(Item.ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        setCreativeTab(PluginMod.weaponTab);
    }

    /**
     * Return whether this item is repairable in an anvil.
     */
    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
        return false;
    }

    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    @Override
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {
        boolean result = super.hitEntity(par1ItemStack, par2EntityLiving, par3EntityLiving);
        if (result) {
            par1ItemStack.damageItem(1000, par3EntityLiving);
        }

        return result;
    }

    /**
     * Called when the player Left Clicks (attacks) an entity.
     * Processed before damage is done, if return value is true further processing is canceled
     * and the entity is not attacked.
     *
     * @param stack The Item being used
     * @param player The player that is attacking
     * @param entity The entity being attacked
     * @return True to cancel the rest of the interaction.
     */
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
    {
        if (player.worldObj.isRemote) {
            // snow animation!
            for (int var1 = 0; var1 < 20; ++var1) {
                double px = entity.posX + itemRand.nextFloat() * entity.width * 2.0F - entity.width;
                double py = entity.posY + itemRand.nextFloat() * entity.height;
                double pz = entity.posZ + itemRand.nextFloat() * entity.width * 2.0F - entity.width;
                entity.worldObj.spawnParticle("blockcrack_" + Block.getIdFromBlock(Blocks.stained_glass) + "_" + 0, px, py, pz, 0, 0, 0);
            }

            player.playSound(Blocks.glass.stepSound.getBreakSound(), 1F, 0.5F);
        }
        return false;
    }

    @Override
    public Item setUnlocalizedName(String name){
        GameRegistry.registerItem(this, name);
        return super.setUnlocalizedName(LocalizationHelper.MOD_PREFIX + name);
    }
}
