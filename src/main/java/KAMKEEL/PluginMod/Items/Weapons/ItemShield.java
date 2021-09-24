package KAMKEEL.PluginMod.Items.Weapons;

import KAMKEEL.PluginMod.Enum.Items.EnumToolMaterials;
import KAMKEEL.PluginMod.Items.PluginItemInterface;
import KAMKEEL.PluginMod.PluginMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;


public class ItemShield extends PluginItemInterface {
	public EnumToolMaterials material;

	public ItemShield(int par1, EnumToolMaterials material) {
		super(par1);
		this.material = material;
		this.setMaxDamage(material.getMaxUses());
		setCreativeTab(PluginMod.weaponTab);
	}

	@Override
	public void renderSpecial(){
		GL11.glScalef(0.6f, 0.6f,0.6f);
		GL11.glTranslatef(0f, 0f, -0.2f);
		GL11.glRotatef(-6, 0, 1, 0);
	}

	public EnumAction getItemUseAction(ItemStack par1ItemStack){
		return EnumAction.block;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer){
		par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
		return par1ItemStack;
	}

	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack){
		return 72000;
	}
}

