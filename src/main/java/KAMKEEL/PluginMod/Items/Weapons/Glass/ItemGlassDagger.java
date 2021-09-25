package KAMKEEL.PluginMod.Items.Weapons.Glass;

import KAMKEEL.PluginMod.Items.ItemCustomTransparent;
import KAMKEEL.PluginMod.Items.Weapons.ItemPluginWeaponInterface;
import KAMKEEL.PluginMod.Items.ItemReversible;
import KAMKEEL.PluginMod.Items.Weapons.ModWeapons;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class ItemGlassDagger extends ItemPluginWeaponInterface implements ItemReversible, ItemCustomTransparent {

    private Item reversed;

    public ItemGlassDagger(int par1, ToolMaterial tool) {
        super(par1, tool);
        this.reversed = ModWeapons.HunterKnife;
    }

    public ItemGlassDagger(int par1, ToolMaterial tool, Item rev) {
        super(par1, tool);
        this.reversed = rev;
    }

    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
        return false;
    }

    @Override
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {
        boolean result = super.hitEntity(par1ItemStack, par2EntityLiving, par3EntityLiving);
        if (result) {
            par1ItemStack.damageItem(1000, par3EntityLiving);
        }

        return result;
    }

    @Override
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
    public void renderSpecial() {
        GL11.glScalef(0.6f, 0.6f, 0.6f);
        GL11.glTranslatef(0.14F, 0.22f, 0.06f);
    }

    @Override
    public Item getReverseState() {
        return reversed;
    }

    @Override
    public void setReverseState(Item newReverse) {
        reversed = newReverse;
    }

    @Override
    public boolean canReverse() {
        return true;
    }
}