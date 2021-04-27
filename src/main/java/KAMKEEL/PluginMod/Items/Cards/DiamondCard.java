package KAMKEEL.PluginMod.Items.Cards;

import KAMKEEL.PluginMod.Enum.Items.Suits.EnumDiamondCard;
import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class DiamondCard extends Item {

    protected IIcon[] icons;

    public DiamondCard(){

        this.setMaxStackSize(64);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(PluginMod.cardsTab);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){

        int metadata = stack.getItemDamage();
        EnumDiamondCard card = EnumDiamondCard.values()[metadata];
        return LocalizationHelper.ITEM_PREFIX + "diamond_" + card.getName().toLowerCase();
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list){
        for (EnumDiamondCard card: EnumDiamondCard.values()){
            list.add(new ItemStack(item, 1, card.getMeta()));
        }
    }

    @Override
    public void registerIcons(IIconRegister reg){

        icons = new IIcon[EnumDiamondCard.count()];
        String prefix = "plug:cards/diamond_";

        for(EnumDiamondCard card : EnumDiamondCard.values()){
            icons[card.getMeta()] = reg.registerIcon(prefix + card.getName().toLowerCase());
        }
    }

    @Override
    public IIcon getIconFromDamage(int meta){

        if(meta >= 0 && meta < EnumDiamondCard.count()){
            return icons[meta];
        }
        return null;
    }
}
