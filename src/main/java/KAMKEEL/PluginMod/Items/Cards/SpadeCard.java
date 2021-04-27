package KAMKEEL.PluginMod.Items.Cards;

import KAMKEEL.PluginMod.Enum.Items.Suits.EnumSpadeCard;
import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class SpadeCard extends Item {

    protected IIcon[] icons;

    public SpadeCard(){

        this.setMaxStackSize(64);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(PluginMod.cardsTab);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){

        int metadata = stack.getItemDamage();
        EnumSpadeCard card = EnumSpadeCard.values()[metadata];
        return LocalizationHelper.ITEM_PREFIX + "spade_" + card.getName().toLowerCase();
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list){
        for (EnumSpadeCard card: EnumSpadeCard.values()){
            list.add(new ItemStack(item, 1, card.getMeta()));
        }
    }

    @Override
    public void registerIcons(IIconRegister reg){

        icons = new IIcon[EnumSpadeCard.count()];
        String prefix = "plug:cards/spade_";

        for(EnumSpadeCard card : EnumSpadeCard.values()){
            icons[card.getMeta()] = reg.registerIcon(prefix + card.getName().toLowerCase());
        }
    }

    @Override
    public IIcon getIconFromDamage(int meta){

        if(meta >= 0 && meta < EnumSpadeCard.count()){
            return icons[meta];
        }
        return null;
    }
}
