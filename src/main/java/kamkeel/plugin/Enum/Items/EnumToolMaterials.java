package kamkeel.plugin.Enum.Items;

import static kamkeel.plugin.Config.ConfigItems.*;

public enum EnumToolMaterials
{
    WOOD(0, 59, 2.0F, 0F, 15),
    STONE(1, 131, 4.0F, 1F, 5),
    BRONZE(2, 170, 5.0F, 2F, 15),
    IRON(2, 250, 6.0F, 2F, 14),
    DIA(3, 1561, 8.0F, 3F, 10),
    GOLD(0, 32, 12.0F, 1F, 22),
    DARK_METAL(2, 350, 6.0F, 7F, 15),
    JUNGLE(2, 560, 6.0F, 7F, 14),
    GLASS(1, 20, 16.0F, 10F, 26),
    BLUE_STEEL(3, 1200, 8.0F, 7F, 20),
    IMPERIAL_GOLD(3, 1200, 8.0F, 7F, 20),
    AQUA(3, 1200, 8.0F, 7F, 20),
    PLUGINMATERIAL(2, PluginWeaponDurability, 6.0F, (float) PluginWeaponDamage, 0),
    UNIQUEMATERIAL(2, 32000, 6.0F, 7F, 0);

    /**
     * The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = IRON/GOLD)
     */
    private final int harvestLevel;

    /**
     * The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32)
     */
    private final int maxUses;

    /**
     * The strength of this tool material against blocks which it is effective against.
     */
    private final float efficiencyOnProperMaterial;

    /** Damage versus entities. */
    private final float damageVsEntity;

    /** Defines the natural enchantability factor of the material. */
    private final int enchantability;

    private EnumToolMaterials(int harvest, int uses, float eff, float dmgvent, int enchant)
    {
        this.harvestLevel = harvest;
        this.maxUses = uses;
        this.efficiencyOnProperMaterial = eff;
        this.damageVsEntity = dmgvent;
        this.enchantability = enchant;
    }

    /**
     * The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32)
     */
    public int getMaxUses()
    {
        return this.maxUses;
    }

    /**
     * The strength of this tool material against blocks which it is effective against.
     */
    public float getEfficiencyOnProperMaterial()
    {
        return this.efficiencyOnProperMaterial;
    }

    /**
     * Damage versus entities.
     */
    public float getDamageVsEntity()
    {
        return this.damageVsEntity;
    }

    /**
     * The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = IRON/GOLD)
     */
    public int getHarvestLevel()
    {
        return this.harvestLevel;
    }

    /**
     * Return the natural enchantability factor of the material.
     */
    public int getEnchantability()
    {
        return this.enchantability;
    }
}