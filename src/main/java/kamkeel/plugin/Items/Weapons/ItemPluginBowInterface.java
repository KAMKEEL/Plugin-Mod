package kamkeel.plugin.Items.Weapons;

import kamkeel.plugin.Items.ItemRenderInterface;
import kamkeel.plugin.LocalizationHelper;
import kamkeel.plugin.PluginMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;

public class ItemPluginBowInterface extends ItemBow implements ItemRenderInterface {


	public ItemPluginBowInterface(String name){
		this.setTextureName("plug:bows/"+ name);
		setCreativeTab(PluginMod.weaponTab);
		setFull3D();
		PluginMod.proxy.registerBow(this);
	}

	@Override
	public Item setUnlocalizedName(String name){
		GameRegistry.registerItem(this, name);
		return super.setUnlocalizedName(LocalizationHelper.MOD_PREFIX + name);
	}

	private IIcon[] iconArray;

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(this.getIconString() + "_standby");
		this.iconArray = new IIcon[bowPullIconNameArray.length];

		for (int i = 0; i < this.iconArray.length; ++i)
		{
			this.iconArray[i] = par1IconRegister.registerIcon(this.getIconString() + "_" + bowPullIconNameArray[i]);
		}
	}

	@SideOnly(Side.CLIENT)
	public IIcon getItemIconForUseDuration(int par1) {
		return this.iconArray[par1];
	}


	public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining) {
		if (usingItem != null) {
			int j = usingItem.getMaxItemUseDuration() - useRemaining;

			if (j >= 18)
			{
				return this.getItemIconForUseDuration(2);
			}

			if (j > 13)
			{
				return this.getItemIconForUseDuration(1);
			}

			if (j > 0)
			{
				return this.getItemIconForUseDuration(0);
			}
		}

		return getIcon(stack, renderPass);
	}


	public void onPlayerStoppedUsing(ItemStack itemstack, World world, EntityPlayer entityPlayer, int itemInUseCount) {
		int charge = this.getMaxItemUseDuration(itemstack) - itemInUseCount;

		ArrowLooseEvent event = new ArrowLooseEvent(entityPlayer, itemstack, charge);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.isCanceled())
		{
			return;
		}
		charge = event.charge;

		boolean isNoPickup = entityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, itemstack) > 0;

		if (isNoPickup || entityPlayer.inventory.hasItem(Items.arrow))
		{
			float velocity = (float)charge / 20.0F;
			velocity = (velocity * velocity + velocity * 2.0F) / 3.0F;

			if ((double)velocity < 0.1D)
			{
				return;
			}

			if (velocity > 1.0F)
			{
				velocity = 1.0F;
			}

			EntityArrow entityarrow = getArrow(world, entityPlayer, velocity * 2.0F);

			if (velocity == 1.0F)
			{
				entityarrow.setIsCritical(true);
			}

			int powerLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, itemstack);

			if (powerLevel > 0)
			{
				entityarrow.setDamage(entityarrow.getDamage() + (double)powerLevel * 0.5D + 0.5D);
			}

			int punchLevel = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, itemstack);

			if (punchLevel > 0)
			{
				entityarrow.setKnockbackStrength(punchLevel);
			}

			if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, itemstack) > 0)
			{
				entityarrow.setFire(100);
			}

			itemstack.damageItem(1, entityPlayer);
			world.playSoundAtEntity(entityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + velocity * 0.5F);

			if (isNoPickup)
			{
				entityarrow.canBePickedUp = 2;
			}
			else
			{
				entityPlayer.inventory.consumeInventoryItem(Items.arrow);
			}

			if (!world.isRemote)
			{
				world.spawnEntityInWorld(entityarrow);
			}
		}
	}

	protected EntityArrow getArrow(World world, EntityPlayer entityPlayer, float velocity) {
		return new EntityArrow(world, entityPlayer, velocity);
	}


	@Override
	public void renderSpecial() {

	}
}
