package KAMKEEL.PluginMod.Items.Misc;

import KAMKEEL.PluginMod.Enum.Items.EnumEnergy;
import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class Energy extends Item {

    protected IIcon[] icons;

    public Energy(){

        this.setMaxStackSize(64);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(PluginMod.weaponTab);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){

        int metadata = stack.getItemDamage();
        EnumEnergy energy = EnumEnergy.values()[metadata];
        return LocalizationHelper.ITEM_PREFIX +  energy.getName().toLowerCase();
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list){
        for (EnumEnergy energy: EnumEnergy.values()){
            list.add(new ItemStack(item, 1, energy.getMeta()));
        }
    }

    @Override
    public void registerIcons(IIconRegister reg){

        icons = new IIcon[EnumEnergy.count()];
        String prefix = "plug:energy/";

        for(EnumEnergy energy : EnumEnergy.values()){
            icons[energy.getMeta()] = reg.registerIcon(prefix + energy.getName().toLowerCase());
        }
    }

    @Override
    public IIcon getIconFromDamage(int meta){

        if(meta >= 0 && meta < EnumEnergy.count()){
            return icons[meta];
        }
        return null;
    }
}
