package KAMKEEL.PluginMod.Items.Cards;

import KAMKEEL.PluginMod.Enum.Items.Suits.EnumJokerCard;
import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class JokerCard extends Item {

    protected IIcon[] icons;

    public JokerCard(){

        this.setMaxStackSize(64);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(PluginMod.cardsTab);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){

        int metadata = stack.getItemDamage();
        EnumJokerCard card = EnumJokerCard.values()[metadata];
        return LocalizationHelper.ITEM_PREFIX + "joker_" + card.getName().toLowerCase();
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list){
        for (EnumJokerCard card: EnumJokerCard.values()){
            list.add(new ItemStack(item, 1, card.getMeta()));
        }
    }

    @Override
    public void registerIcons(IIconRegister reg){

        icons = new IIcon[EnumJokerCard.count()];
        String prefix = "plug:cards/joker_";

        for(EnumJokerCard card : EnumJokerCard.values()){
            icons[card.getMeta()] = reg.registerIcon(prefix + card.getName().toLowerCase());
        }
    }

    @Override
    public IIcon getIconFromDamage(int meta){

        if(meta >= 0 && meta < EnumJokerCard.count()){
            return icons[meta];
        }
        return null;
    }
}
