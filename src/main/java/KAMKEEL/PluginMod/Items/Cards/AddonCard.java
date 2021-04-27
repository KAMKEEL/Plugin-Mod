package KAMKEEL.PluginMod.Items.Cards;

import KAMKEEL.PluginMod.Enum.Items.Suits.EnumAddonCard;
import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class AddonCard extends Item {

    protected IIcon[] icons;

    public AddonCard(){

        this.setMaxStackSize(64);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(PluginMod.cardsTab);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){

        int metadata = stack.getItemDamage();
        EnumAddonCard card = EnumAddonCard.values()[metadata];
        return LocalizationHelper.ITEM_PREFIX + "cards_" + card.getName().toLowerCase();
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list){
        for (EnumAddonCard card: EnumAddonCard.values()){
            list.add(new ItemStack(item, 1, card.getMeta()));
        }
    }

    @Override
    public void registerIcons(IIconRegister reg){

        icons = new IIcon[EnumAddonCard.count()];
        String prefix = "plug:cards/cards_";

        for(EnumAddonCard card : EnumAddonCard.values()){
            icons[card.getMeta()] = reg.registerIcon(prefix + card.getName().toLowerCase());
        }
    }

    @Override
    public IIcon getIconFromDamage(int meta){

        if(meta >= 0 && meta < EnumAddonCard.count()){
            return icons[meta];
        }
        return null;
    }
}
