package KAMKEEL.PluginMod.Items.Misc;

import KAMKEEL.PluginMod.Enum.Items.EnumApples;
import KAMKEEL.PluginMod.Enum.Items.EnumApples;
import KAMKEEL.PluginMod.LocalizationHelper;
import KAMKEEL.PluginMod.PluginMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.*;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;

public class Apple extends ItemFood {

    protected IIcon[] icons;

    public Apple(int p_i45341_1_, float p_i45341_2_, boolean p_i45341_3_){
        super(p_i45341_1_, p_i45341_2_, p_i45341_3_);

        this.setMaxStackSize(64);
        this.setHasSubtypes(true);
        this.setAlwaysEdible();
        this.setMaxDamage(0);
        this.setCreativeTab(PluginMod.miscTab);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){

        int metadata = stack.getItemDamage();
        EnumApples apple = EnumApples.values()[metadata];
        return LocalizationHelper.ITEM_PREFIX + apple.getName().toLowerCase() + "_apple";
    }

    @Override
    public void registerIcons(IIconRegister reg){

        icons = new IIcon[EnumApples.count()];
        String prefix = "plug:apples/";

        for(EnumApples apple : EnumApples.values()){
            icons[apple.getMeta()] = reg.registerIcon(prefix + apple.getName().toLowerCase() + "_apple");
        }
    }

    @Override
    public IIcon getIconFromDamage(int meta){

        if(meta >= 0 && meta < EnumApples.count()){
            return icons[meta];
        }
        return null;
    }

    /**
     * Return an item rarity from EnumRarity
     */
    public EnumRarity getRarity(ItemStack p_77613_1_)
    {

        if(p_77613_1_.getItemDamage() == 0){
            return EnumRarity.uncommon;
        }
        else if(p_77613_1_.getItemDamage() == 1 || p_77613_1_.getItemDamage() == 2){
            return EnumRarity.rare;
        }

        return EnumRarity.epic;
    }

    protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer p_77849_3_)
    {
        // POTION EFFECTS STUFF

        // Heal Potion TIME * 4 = Health Gained
        // Regen *3 = TIME * 3.2   >>> 5 * 3.2 = 16
        // Regen *4 = TIME * 8.25   >>> 5 * 8.25 = 33

        // Default NOTES: Heal (13) 52 + Regen (3) (45) 144 = 196
        if (!p_77849_2_.isRemote) {

            int dmg = p_77849_1_.getItemDamage();

            if(dmg == 2){
                // Vintage
                // Total Health = 144 +  96 = 280
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.heal.id, 34, 0));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.regeneration.id, 900, 3));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 600, 1));
            }
            else if(dmg == 3){
                // Rage
                // Total Health = 52 +  96 = 148
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 600, 2));

                p_77849_3_.addPotionEffect(new PotionEffect(Potion.heal.id, 13, 0));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 600, 1));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.regeneration.id, 600, 3));
            }
            else if(dmg == 4){
                // Mend
                // Total Health = 40 + 288 = 328
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.heal.id, 10, 0));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.regeneration.id, 700, 4));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 600, 1));
            }
            else if(dmg == 5){
                // Shield
                // Total Health = 24 +  96 = 120
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.resistance.id, 600, 1));

                p_77849_3_.addPotionEffect(new PotionEffect(Potion.heal.id, 6, 0));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 600, 1));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.regeneration.id, 600, 3));
            }
            else if(dmg == 6){
                // Buffer
                // Total Health = 80 +  144 = 224
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.heal.id, 20, 0));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.regeneration.id, 900, 3));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 600, 9));
            }
            else if(dmg == 7){
                // Swift
                // Total Health = 52 +  96 = 148
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 600, 2));

                p_77849_3_.addPotionEffect(new PotionEffect(Potion.heal.id, 13, 0));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 600, 1));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.regeneration.id, 600, 3));
            }
            else if(dmg == 8) {
                // Boost
                // Total Health = 160 +  144 = 304
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.heal.id, 40, 0));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.regeneration.id, 900, 3));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 600, 1));
            }
            else if(dmg == 9){
                // Alert
                // Total Health = 52 +  96 = 148
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.nightVision.id, 1800, 0));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 1800, 0));

                p_77849_3_.addPotionEffect(new PotionEffect(Potion.heal.id, 13, 0));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 600, 1));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.regeneration.id, 600, 3));
            }
            else if(dmg == 10){
                // Element
                // Total Health = 52 +  96 = 148
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 1800, 0));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 1800, 0));

                p_77849_3_.addPotionEffect(new PotionEffect(Potion.heal.id, 13, 0));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 600, 1));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.regeneration.id, 600, 3));
            }
            else if(dmg == 11){
                // Full
                // Total Health = 52 +  96 = 148
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.field_76443_y.id, 3600, 0));

                p_77849_3_.addPotionEffect(new PotionEffect(Potion.heal.id, 13, 0));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 600, 1));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.regeneration.id, 600, 3));
            }
            else if(dmg == 12){
                // Drunk
                // Total Health = 52 +  165 = 217
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.confusion.id, 600, 1));

                p_77849_3_.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 600, 2));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.regeneration.id, 400, 4));

                p_77849_3_.addPotionEffect(new PotionEffect(Potion.heal.id, 13, 0));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 600, 1));
            }
            else if(dmg == 13){
                // Tank
                // Total Health = 24 +  96 = 120
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 600, 1));

                p_77849_3_.addPotionEffect(new PotionEffect(Potion.resistance.id, 600, 1));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 600, 9));

                p_77849_3_.addPotionEffect(new PotionEffect(Potion.heal.id, 6, 0));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.regeneration.id, 600, 3));
            }
            else {
                // Total Health = 196
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.heal.id, 13, 0));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.regeneration.id, 900, 3));
                p_77849_3_.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 600, 1));
            }
        }
    }

    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list){
        for (EnumApples apple: EnumApples.values()){
            list.add(new ItemStack(item, 1, apple.getMeta()));
        }
    }

}
