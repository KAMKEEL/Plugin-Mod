package KAMKEEL.PluginMod.Items.Misc;

import KAMKEEL.PluginMod.Entity.EntityProjectile;
import KAMKEEL.PluginMod.Items.PluginItemInterface;
import KAMKEEL.PluginMod.Items.Weapons.ItemPluginWeaponInterface;
import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public class VoidRasenshuriken extends ItemPluginWeaponInterface {

    public VoidRasenshuriken(int par1, ToolMaterial material) {
        super(par1, material);
        this.setMaxStackSize(64);
        this.setHasSubtypes(true);
        this.setMaxDamage(1);
        this.setCreativeTab(PluginMod.weaponTab);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){
        return LocalizationHelper.ITEM_PREFIX + "voidrasenshuriken";
    }

    @Override
    public void renderSpecial(){
        GL11.glScalef(1.3f, 1.3f,1.3f);
        // GL11.glTranslatef(-0.2f, 0.7f, -0.7f);
        // GL11.glRotatef(120, 1, 0, 0);
        // GL11.glRotatef(-30, 0, 1, 0);
    };

    public void onPlayerStoppedUsing(ItemStack par1ItemStack, World worldObj, EntityPlayer player, int par4)
    {
        if(worldObj.isRemote){
            player.swingItem();
            return;
        }
        EntityProjectile projectile = new EntityProjectile(worldObj, player, par1ItemStack, false);
        projectile.damage = func_150931_i();
        projectile.destroyedOnEntityHit = true;
        projectile.canBePickedUp = !player.capabilities.isCreativeMode;
        projectile.setIs3D(true);
        projectile.setStickInWall(true);
        projectile.setHasGravity(true);
        projectile.setSpeed(15);
        projectile.shoot(1);

        if(!player.capabilities.isCreativeMode){
            par1ItemStack.damageItem(1, player);
            if(par1ItemStack.stackSize == 0)
                return;
            player.inventory.mainInventory[player.inventory.currentItem] = null;
            //item.dropItem = par1ItemStack;
        }

        worldObj.spawnEntityInWorld(projectile);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        return par1ItemStack;
    }
    @Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 72000;
    }


    @Override
    public boolean shouldRotateAroundWhenRendering(){
        return false;
    }

}
