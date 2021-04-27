package KAMKEEL.PluginMod.Items.Weapons;

import KAMKEEL.PluginMod.Items.ItemRenderInterface;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import KAMKEEL.PluginMod.*;


import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemPluginWeaponInterface extends ItemSword implements ItemRenderInterface {

	public ItemPluginWeaponInterface(int par1, ToolMaterial material) {
		this(material);
	}
	public ItemPluginWeaponInterface(ToolMaterial material) {
		super(material);
		PluginMod.proxy.registerItem(this);
		setCreativeTab(PluginMod.weaponTab);
	}

	@Override
	public void renderSpecial(){
		GL11.glScalef(0.66f, 0.66f,0.66f);
		GL11.glTranslatef(0.16f, 0.26f, 0.06f);
	}

	@Override
	public Item setUnlocalizedName(String name){
		GameRegistry.registerItem(this, name);
		return super.setUnlocalizedName(LocalizationHelper.MOD_PREFIX + name);
	}


}
