package KAMKEEL.PluginMod.Items.Misc;

import KAMKEEL.PluginMod.Enum.Items.EnumCoins;
import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class Coins extends Item {

    protected IIcon[] icons;

    public Coins(){

        this.setMaxStackSize(64);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(PluginMod.miscTab);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){

        int metadata = stack.getItemDamage();
        EnumCoins coin = EnumCoins.values()[metadata];
        return LocalizationHelper.ITEM_PREFIX + "coins_" + coin.getName().toLowerCase();
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list){
        for (EnumCoins coin: EnumCoins.values()){
            list.add(new ItemStack(item, 1, coin.getMeta()));
        }
    }

    @Override
    public void registerIcons(IIconRegister reg){

        icons = new IIcon[EnumCoins.count()];
        String prefix = "plug:coins/coins_";

        for(EnumCoins coin : EnumCoins.values()){
            icons[coin.getMeta()] = reg.registerIcon(prefix + coin.getName().toLowerCase());
        }
    }

    @Override
    public IIcon getIconFromDamage(int meta){

        if(meta >= 0 && meta < EnumCoins.count()){
            return icons[meta];
        }
        return null;
    }
}
