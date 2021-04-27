package KAMKEEL.PluginMod.Items.Misc;

import KAMKEEL.PluginMod.Enum.Items.EnumEyes;
import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class Eyes extends Item {

    protected IIcon[] icons;

    public Eyes(){

        this.setMaxStackSize(64);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(PluginMod.miscTab);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){

        int metadata = stack.getItemDamage();
        EnumEyes coin = EnumEyes.values()[metadata];
        return LocalizationHelper.ITEM_PREFIX + "eyes_" + coin.getName().toLowerCase();
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list){
        for (EnumEyes coin: EnumEyes.values()){
            list.add(new ItemStack(item, 1, coin.getMeta()));
        }
    }

    @Override
    public void registerIcons(IIconRegister reg){

        icons = new IIcon[EnumEyes.count()];
        String prefix = "plug:eyes/eyes_";

        for(EnumEyes coin : EnumEyes.values()){
            icons[coin.getMeta()] = reg.registerIcon(prefix + coin.getName().toLowerCase());
        }
    }

    @Override
    public IIcon getIconFromDamage(int meta){

        if(meta >= 0 && meta < EnumEyes.count()){
            return icons[meta];
        }
        return null;
    }
}
