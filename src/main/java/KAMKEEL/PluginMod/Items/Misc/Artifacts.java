package KAMKEEL.PluginMod.Items.Misc;

import KAMKEEL.PluginMod.Enum.Items.EnumArtifacts;
import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class Artifacts extends Item {

    protected IIcon[] icons;

    public Artifacts(){

        this.setMaxStackSize(64);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(PluginMod.miscTab);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){

        int metadata = stack.getItemDamage();
        EnumArtifacts artifact = EnumArtifacts.values()[metadata];
        return LocalizationHelper.ITEM_PREFIX + artifact.getName().toLowerCase();
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list){
        for (EnumArtifacts artifact: EnumArtifacts.values()){
            list.add(new ItemStack(item, 1, artifact.getMeta()));
        }
    }

    @Override
    public void registerIcons(IIconRegister reg){

        icons = new IIcon[EnumArtifacts.count()];
        String prefix = "plug:artifacts/";

        for(EnumArtifacts artifact : EnumArtifacts.values()){
            icons[artifact.getMeta()] = reg.registerIcon(prefix + artifact.getName().toLowerCase());
        }
    }

    @Override
    public IIcon getIconFromDamage(int meta){

        if(meta >= 0 && meta < EnumArtifacts.count()){
            return icons[meta];
        }
        return null;
    }
}
