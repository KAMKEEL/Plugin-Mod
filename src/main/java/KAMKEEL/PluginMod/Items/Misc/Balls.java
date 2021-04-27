package KAMKEEL.PluginMod.Items.Misc;

import KAMKEEL.PluginMod.Enum.Items.EnumBalls;
import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class Balls extends Item {

    protected IIcon[] icons;

    public Balls(){

        this.setMaxStackSize(64);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(PluginMod.miscTab);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){

        int metadata = stack.getItemDamage();
        EnumBalls coin = EnumBalls.values()[metadata];
        return LocalizationHelper.ITEM_PREFIX + "balls_" + coin.getName().toLowerCase();
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list){
        for (EnumBalls coin: EnumBalls.values()){
            list.add(new ItemStack(item, 1, coin.getMeta()));
        }
    }

    @Override
    public void registerIcons(IIconRegister reg){

        icons = new IIcon[EnumBalls.count()];
        String prefix = "plug:balls/balls_";

        for(EnumBalls coin : EnumBalls.values()){
            icons[coin.getMeta()] = reg.registerIcon(prefix + coin.getName().toLowerCase());
        }
    }

    @Override
    public IIcon getIconFromDamage(int meta){

        if(meta >= 0 && meta < EnumBalls.count()){
            return icons[meta];
        }
        return null;
    }
}
