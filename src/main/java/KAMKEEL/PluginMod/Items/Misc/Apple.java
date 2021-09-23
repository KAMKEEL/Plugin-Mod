package KAMKEEL.PluginMod.Items.Misc;

import KAMKEEL.PluginMod.Enum.Items.EnumApples;
import KAMKEEL.PluginMod.Enum.Items.EnumApples;
import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;

public class Apple extends ItemFood {

    protected IIcon[] icons;

    public Apple(int p_i45341_1_, float p_i45341_2_, boolean p_i45341_3_){
        super(p_i45341_1_, p_i45341_2_, p_i45341_3_);

        this.setMaxStackSize(64);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(PluginMod.miscTab);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){

        int metadata = stack.getItemDamage();
        EnumApples apple = EnumApples.values()[metadata];
        return LocalizationHelper.ITEM_PREFIX + "apples_" + apple.getName().toLowerCase();
    }

    @Override
    public void registerIcons(IIconRegister reg){

        icons = new IIcon[EnumApples.count()];
        String prefix = "plug:apples/apples_";

        for(EnumApples apple : EnumApples.values()){
            icons[apple.getMeta()] = reg.registerIcon(prefix + apple.getName().toLowerCase());
        }
    }

    @Override
    public IIcon getIconFromDamage(int meta){

        if(meta >= 0 && meta < EnumApples.count()){
            return icons[meta];
        }
        return null;
    }

    /**
     * Return an item rarity from EnumRarity
     */
    public EnumRarity getRarity(ItemStack p_77613_1_)
    {
        return EnumRarity.epic;
    }

    protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer p_77849_3_)
    {
        // POTION EFFECTS STUFF
        if (!p_77849_2_.isRemote)
        {
            p_77849_3_.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 2400, 0));
        }

        if (p_77849_1_.getItemDamage() > 0)
        {
            if (!p_77849_2_.isRemote)
            {
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.regeneration.id, 600, 4));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.resistance.id, 6000, 0));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 6000, 0));
            }
        }
        else
        {
            super.onFoodEaten(p_77849_1_, p_77849_2_, p_77849_3_);
        }
    }

    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list){
        for (EnumApples apple: EnumApples.values()){
            list.add(new ItemStack(item, 1, apple.getMeta()));
        }
    }

}
