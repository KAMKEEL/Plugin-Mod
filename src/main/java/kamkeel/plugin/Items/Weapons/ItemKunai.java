package kamkeel.plugin.Items.Weapons;

import kamkeel.plugin.Entity.EntityProjectile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public class ItemKunai extends ItemPluginWeaponInterface{

    public ItemKunai(int par1, Item.ToolMaterial tool) {
        super(par1, tool);
    }

    public void onPlayerStoppedUsing(ItemStack par1ItemStack, World worldObj, EntityPlayer player, int par4)
    {
        if(worldObj.isRemote){
            player.swingItem();
            return;
        }
        EntityProjectile projectile = new EntityProjectile(worldObj, player, par1ItemStack, false);
        projectile.damage = func_150931_i();
        projectile.destroyedOnEntityHit = false;
        projectile.canBePickedUp = !player.capabilities.isCreativeMode;
        projectile.setIs3D(true);
        projectile.setStickInWall(true);
        projectile.setHasGravity(true);
        projectile.setSpeed(12);
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
    public void renderSpecial(){
        GL11.glScalef(0.4f, 0.4f, 0.4f);
        GL11.glTranslatef(-0.4F, 0.5f, 0.1f);
    }

    @Override
    public boolean shouldRotateAroundWhenRendering(){
        return true;
    }

}
