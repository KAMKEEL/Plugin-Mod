package kamkeel.plugin.Blocks.ItemBlock;

import kamkeel.plugin.LocalizationHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockEnum<E extends Enum<E>> extends ItemBlock {

    private final Class<E> enumClass;
    private final String blockPrefix;

    public ItemBlockEnum(Block block, Class<E> enumClass, String blockPrefix) {
        super(block);
        this.enumClass = enumClass;
        this.blockPrefix = blockPrefix;
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        int metadata = stack.getItemDamage();

        if (metadata >= 0 && metadata < enumClass.getEnumConstants().length) {
            E enumValue = enumClass.getEnumConstants()[metadata];
            // Using the blockPrefix and the enum's name for the unlocalized name
            return LocalizationHelper.BLOCK_PREFIX + blockPrefix + "_" + enumValue.toString().toLowerCase();
        }

        return LocalizationHelper.BLOCK_PREFIX + blockPrefix + "_unknown";
    }
}
