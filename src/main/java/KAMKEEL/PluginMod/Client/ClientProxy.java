package KAMKEEL.PluginMod.Client;

import KAMKEEL.PluginMod.Blocks.BlockColor;
import KAMKEEL.PluginMod.Blocks.BlockColorStair;
import KAMKEEL.PluginMod.Blocks.ModBlocks;
import KAMKEEL.PluginMod.Client.Render.*;
import KAMKEEL.PluginMod.CommonProxy;
import KAMKEEL.PluginMod.Entity.EntityProjectile;
import KAMKEEL.PluginMod.Items.ModItems;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {

    ClientEvents clientEvents;
    public static final RenderItemBlockColor renderItemBlockColor;

    @Override
    public int getNewRenderId() {
        return RenderingRegistry.getNextAvailableRenderId();
    }

    @Override
    public void preInnit() {
        super.preInnit();

        // Register KeyHandler
        for(Keybindings key : Keybindings.values()) {
            ClientRegistry.registerKeyBinding(key.getKeybind());
        }

        FMLCommonHandler.instance().bus().register(new KeyInputHandler());
        RenderingRegistry.registerEntityRenderingHandler(EntityProjectile.class, new RenderProjectile());
    }

    @Override
    public void load() {
        super.load();

        setRenderIDs();

        renderItems();

        renderBlocks();
    }

    @Override
    public EntityPlayer getPlayer(){
        return Minecraft.getMinecraft().thePlayer;
    }

    public void renderItems(){
        // Get Client
        Minecraft mc = FMLClientHandler.instance().getClient();

        // Transparent Item Renderer
        TransparentItemRenderer transparentItemRenderer = new TransparentItemRenderer(mc.gameSettings, mc.getTextureManager());

        MinecraftForgeClient.registerItemRenderer(ModItems.GlassBlade, transparentItemRenderer);
        MinecraftForgeClient.registerItemRenderer(ModItems.GlassKunai, transparentItemRenderer);
        MinecraftForgeClient.registerItemRenderer(ModItems.GlassKunaiReversed, transparentItemRenderer);
        MinecraftForgeClient.registerItemRenderer(ModItems.GlassDagger, transparentItemRenderer);
        MinecraftForgeClient.registerItemRenderer(ModItems.GlassDaggerReversed, transparentItemRenderer);
        MinecraftForgeClient.registerItemRenderer(ModItems.GlassDisc, transparentItemRenderer);
        MinecraftForgeClient.registerItemRenderer(ModItems.GlassPan, transparentItemRenderer);
        MinecraftForgeClient.registerItemRenderer(ModItems.GlassPanEnergized, transparentItemRenderer);
        MinecraftForgeClient.registerItemRenderer(ModItems.GlassPanBroken, transparentItemRenderer);
        MinecraftForgeClient.registerItemRenderer(ModItems.GlassCutlass, transparentItemRenderer);
        MinecraftForgeClient.registerItemRenderer(ModItems.glass_shard, transparentItemRenderer);

        MinecraftForgeClient.registerItemRenderer(ModItems.CrystalSpear, transparentItemRenderer);


        // Debug Item
        MinecraftForgeClient.registerItemRenderer(ModItems.DebugDagger, transparentItemRenderer);
        MinecraftForgeClient.registerItemRenderer(ModItems.DebugDaggerReversed, transparentItemRenderer);
        MinecraftForgeClient.registerItemRenderer(ModItems.DebugDaggerBroken, transparentItemRenderer);
        MinecraftForgeClient.registerItemRenderer(ModItems.DebugDaggerReversedBroken, transparentItemRenderer);
        MinecraftForgeClient.registerItemRenderer(ModItems.DebugDaggerEnergized, transparentItemRenderer);
        MinecraftForgeClient.registerItemRenderer(ModItems.DebugDaggerReversedEnergized, transparentItemRenderer);

    }

    public void renderBlocks(){
        // Render Blocks
        RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)new RenderBlockFullBright());
        RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)new RenderBlockColor());

//        for (final BlockColor b : ModBlocks.colorBlocks) {
//            MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock((Block)b), (IItemRenderer)ClientProxy.renderItemBlockColor);
//        }

    }

    public void setRenderIDs(){
        CommonProxy.fullBrightBlockID = getNewRenderId();
        CommonProxy.colorBlockID = getNewRenderId();
    }

    @Override
    public void registerItem(Item item) { MinecraftForgeClient.registerItemRenderer(item, new PluginItemRenderer()); }

    @Override
    public void registerBow(Item item) { MinecraftForgeClient.registerItemRenderer(item, new ItemBowRenderer()); }

    @Override
    public void registerTileEntities() { }

    static {
        renderItemBlockColor = new RenderItemBlockColor();
    }

}
