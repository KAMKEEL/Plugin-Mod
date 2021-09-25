package KAMKEEL.PluginMod.Util;

import KAMKEEL.PluginMod.Enum.Items.EnumToolMaterials;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class PluginMaterials {

    public static Item.ToolMaterial PluginMaterial = EnumHelper.addToolMaterial("PluginMaterial", EnumToolMaterials.PLUGINMATERIAL.getHarvestLevel(), EnumToolMaterials.PLUGINMATERIAL.getMaxUses(), EnumToolMaterials.PLUGINMATERIAL.getEfficiencyOnProperMaterial(), EnumToolMaterials.PLUGINMATERIAL.getDamageVsEntity(), EnumToolMaterials.PLUGINMATERIAL.getEnchantability());
    public static Item.ToolMaterial UniqueMaterial = EnumHelper.addToolMaterial("UniqueMaterial", EnumToolMaterials.UNIQUEMATERIAL.getHarvestLevel(), EnumToolMaterials.UNIQUEMATERIAL.getMaxUses(), EnumToolMaterials.UNIQUEMATERIAL.getEfficiencyOnProperMaterial(), EnumToolMaterials.UNIQUEMATERIAL.getDamageVsEntity(), EnumToolMaterials.UNIQUEMATERIAL.getEnchantability());

    public static Item.ToolMaterial dark_metal = EnumHelper.addToolMaterial("DARK_METAL", EnumToolMaterials.DARK_METAL.getHarvestLevel(), EnumToolMaterials.DARK_METAL.getMaxUses(), EnumToolMaterials.DARK_METAL.getEfficiencyOnProperMaterial(), EnumToolMaterials.DARK_METAL.getDamageVsEntity(), EnumToolMaterials.DARK_METAL.getEnchantability());
    public static Item.ToolMaterial blue_steel = EnumHelper.addToolMaterial("BLUE_STEEL", EnumToolMaterials.BLUE_STEEL.getHarvestLevel(), EnumToolMaterials.BLUE_STEEL.getMaxUses(), EnumToolMaterials.BLUE_STEEL.getEfficiencyOnProperMaterial(), EnumToolMaterials.BLUE_STEEL.getDamageVsEntity(), EnumToolMaterials.BLUE_STEEL.getEnchantability());
    public static Item.ToolMaterial jungle = EnumHelper.addToolMaterial("JUNGLE", EnumToolMaterials.JUNGLE.getHarvestLevel(), EnumToolMaterials.JUNGLE.getMaxUses(), EnumToolMaterials.JUNGLE.getEfficiencyOnProperMaterial(), EnumToolMaterials.JUNGLE.getDamageVsEntity(), EnumToolMaterials.JUNGLE.getEnchantability());
    public static Item.ToolMaterial glass = EnumHelper.addToolMaterial("GLASS", EnumToolMaterials.GLASS.getHarvestLevel(), EnumToolMaterials.GLASS.getMaxUses(), EnumToolMaterials.GLASS.getEfficiencyOnProperMaterial(), EnumToolMaterials.GLASS.getDamageVsEntity(), EnumToolMaterials.GLASS.getEnchantability());

    public static Item.ToolMaterial custom_dark_metal = EnumHelper.addToolMaterial("DARK_METAL", EnumToolMaterials.DARK_METAL.getHarvestLevel(), EnumToolMaterials.UNIQUEMATERIAL.getMaxUses(), EnumToolMaterials.DARK_METAL.getEfficiencyOnProperMaterial(), 7, 0);
    public static Item.ToolMaterial custom_blue_steel = EnumHelper.addToolMaterial("BLUE_STEEL", EnumToolMaterials.BLUE_STEEL.getHarvestLevel(), EnumToolMaterials.UNIQUEMATERIAL.getMaxUses(), EnumToolMaterials.BLUE_STEEL.getEfficiencyOnProperMaterial(), 7, 0);
    public static Item.ToolMaterial custom_jungle = EnumHelper.addToolMaterial("JUNGLE", EnumToolMaterials.JUNGLE.getHarvestLevel(), EnumToolMaterials.UNIQUEMATERIAL.getMaxUses(), EnumToolMaterials.JUNGLE.getEfficiencyOnProperMaterial(), 7, 0);
    public static Item.ToolMaterial custom_glass = EnumHelper.addToolMaterial("GLASS", EnumToolMaterials.GLASS.getHarvestLevel(), EnumToolMaterials.UNIQUEMATERIAL.getMaxUses(), EnumToolMaterials.GLASS.getEfficiencyOnProperMaterial(), 7, 0);
    public static Item.ToolMaterial random = EnumHelper.addToolMaterial("RANDOM", EnumToolMaterials.GLASS.getHarvestLevel(), 5, EnumToolMaterials.GLASS.getEfficiencyOnProperMaterial(), 7, 0);

    public static Item.ToolMaterial brokenTool = EnumHelper.addToolMaterial("BROKEN", Item.ToolMaterial.IRON.getHarvestLevel(), 0, Item.ToolMaterial.IRON.getEfficiencyOnProperMaterial(), 1, 0);

}
