package KAMKEEL.PluginMod.Items.Weapons.Unique;

import KAMKEEL.PluginMod.Items.ItemTransform;
import KAMKEEL.PluginMod.Items.Weapons.ItemDagger;
import KAMKEEL.PluginMod.Items.ItemReversible;
import KAMKEEL.PluginMod.Items.Weapons.ItemUniqueWeapon;
import KAMKEEL.PluginMod.Items.Weapons.ModWeapons;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class ItemUniqueDagger extends ItemUniqueWeapon implements ItemReversible, ItemTransform {

    public ItemUniqueDagger(int par1, Item.ToolMaterial tool, boolean transformer, boolean reversible) {
        super(par1, tool, transformer, reversible);
    }

    public ItemUniqueDagger(int par1, Item.ToolMaterial tool, boolean transformer, boolean reversible, Item broke) {
        super(par1, tool, transformer, reversible, broke);
    }

    @Override
    public void renderSpecial() {
        GL11.glScalef(0.6f, 0.6f, 0.6f);
        GL11.glTranslatef(0.14F, 0.22f, 0.06f);
    }
}

