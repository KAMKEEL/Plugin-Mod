package KAMKEEL.PluginMod.Client;

import KAMKEEL.PluginMod.Client.Render.ItemBowRenderer;
import KAMKEEL.PluginMod.Client.Render.PluginItemRenderer;
import KAMKEEL.PluginMod.Client.Render.RenderProjectile;
import KAMKEEL.PluginMod.Client.Render.TransparentItemRenderer;
import KAMKEEL.PluginMod.CommonProxy;
import KAMKEEL.PluginMod.Entity.EntityProjectile;
import KAMKEEL.PluginMod.Items.ModItems;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {

    ClientEvents clientEvents;

    @Override
    public void registerItem(Item item) { MinecraftForgeClient.registerItemRenderer(item, new PluginItemRenderer()); }

    @Override
    public void registerBow(Item item) { MinecraftForgeClient.registerItemRenderer(item, new ItemBowRenderer()); }

    @Override
    public void load() {
        // Register KeyHandler

        for(Keybindings key : Keybindings.values()) {
            ClientRegistry.registerKeyBinding(key.getKeybind());
        }

        FMLCommonHandler.instance().bus().register(new KeyInputHandler());

        RenderingRegistry.registerEntityRenderingHandler(EntityProjectile.class, new RenderProjectile());

    }

    @Override
    public void doOnLoadRegistration() {
        // Get Client
        Minecraft mc = FMLClientHandler.instance().getClient();


        /** Not Fixed Bow **/
        /*
        clientEvents = new ClientEvents();
        MinecraftForge.EVENT_BUS.register(clientEvents);
        */

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

    @Override
    public EntityPlayer getPlayer(){
        return Minecraft.getMinecraft().thePlayer;
    }

}
