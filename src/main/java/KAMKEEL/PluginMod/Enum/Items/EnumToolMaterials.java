package KAMKEEL.PluginMod.Enum.Items;

public enum EnumToolMaterials
{
    WOOD(0, 59, 2.0F, 0, 15),
    STONE(1, 131, 4.0F, 1, 5),
    BRONZE(2, 170, 5.0F, 2, 15),
    IRON(2, 250, 6.0F, 2, 14),
    DIA(3, 1561, 8.0F, 3, 10),
    GOLD(0, 32, 12.0F, 1, 22),
    DARK_METAL(2, 350, 6.0F, 7, 15),
    JUNGLE(2, 560, 6.0F, 7, 14),
    GLASS(1, 20, 16.0F, 10, 26),
    BLUE_STEEL(3, 1200, 8.0F, 7, 20),
    PLUGINMATERIAL(2, 20000, 6.0F, 7, 0),
    UNIQUEMATERIAL(2, 32000, 6.0F, 7, 0);

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
    private final int damageVsEntity;

    /** Defines the natural enchantability factor of the material. */
    private final int enchantability;

    private EnumToolMaterials(int harvest, int uses, float eff, int dmgvent, int enchant)
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
    public int getDamageVsEntity()
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