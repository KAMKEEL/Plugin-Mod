package KAMKEEL.PluginMod.Items.Misc;

import KAMKEEL.PluginMod.Enum.Items.EnumPills;
import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class Pills extends Item {

    protected IIcon[] icons;

    public Pills(){

        this.setMaxStackSize(64);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(PluginMod.miscTab);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){

        int metadata = stack.getItemDamage();
        EnumPills coin = EnumPills.values()[metadata];
        return LocalizationHelper.ITEM_PREFIX + "pills_" + coin.getName().toLowerCase();
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list){
        for (EnumPills coin: EnumPills.values()){
            list.add(new ItemStack(item, 1, coin.getMeta()));
        }
    }

    @Override
    public void registerIcons(IIconRegister reg){

        icons = new IIcon[EnumPills.count()];
        String prefix = "plug:pills/pills_";

        for(EnumPills coin : EnumPills.values()){
            icons[coin.getMeta()] = reg.registerIcon(prefix + coin.getName().toLowerCase());
        }
    }

    @Override
    public IIcon getIconFromDamage(int meta){

        if(meta >= 0 && meta < EnumPills.count()){
            return icons[meta];
        }
        return null;
    }
}
