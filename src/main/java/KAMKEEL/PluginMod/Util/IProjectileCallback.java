package KAMKEEL.PluginMod.Util;

import KAMKEEL.PluginMod.Entity.EntityProjectile;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public interface IProjectileCallback {

	boolean onImpact(EntityProjectile entityProjectile,
					 EntityLivingBase entity, ItemStack itemstack);

}
