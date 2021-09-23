package KAMKEEL.PluginMod.Items.Weapons.Customs;

import KAMKEEL.PluginMod.Items.ModItems;
import KAMKEEL.PluginMod.Items.Weapons.ItemDagger;
import KAMKEEL.PluginMod.Items.Weapons.ModWeapons;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class ItemDarkDaggerReversed extends ItemDarkDagger {

    private ItemDagger dagger;

    public ItemDarkDaggerReversed(int par1, ItemDagger dagger, ToolMaterial tool, Item broken) {
        super(par1, tool, broken);
        this.dagger = dagger;
        this.setTransformItem(ModWeapons.DarkDaggerReversedEnergized);
    }

    public ItemDarkDaggerReversed(int par1, ItemDagger dagger, ToolMaterial tool, Item broken, Item transform) {
        super(par1, tool, broken, transform);
        this.dagger = dagger;
    }

    @Override
    public void renderSpecial(){
        GL11.glScalef(0.6f, 0.6f, 0.6f);
        GL11.glTranslatef(0.16f, 0.6f, -0.16f);
        GL11.glRotatef(180F, 1F, 0F, 0F);
    }

    @Override
    public void registerIcons(IIconRegister par1IconRegister)
    {
        this.itemIcon = dagger.getIconFromDamage(0);
    }

}

