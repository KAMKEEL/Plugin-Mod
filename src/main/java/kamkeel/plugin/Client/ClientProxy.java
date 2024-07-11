package kamkeel.plugin.Client;

import kamkeel.plugin.Client.Render.*;
import kamkeel.plugin.CommonProxy;
import kamkeel.plugin.Config.ConfigCompat;
import kamkeel.plugin.Config.ConfigItems;
import kamkeel.plugin.Entity.EntityProjectile;
import kamkeel.plugin.Items.ModItems;
import kamkeel.plugin.Items.Weapons.ModWeapons;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
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


        if(ConfigCompat.Keybindings){
            // Register KeyHandler
            for(Keybindings key : Keybindings.values()) {
                ClientRegistry.registerKeyBinding(key.getKeybind());
            }

            FMLCommonHandler.instance().bus().register(new KeyInputHandler());
        }

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

        if(!ConfigItems.DisableAllItems){
            if(ConfigItems.GlassWeapons && !ConfigItems.DisableAllWeapons){
                MinecraftForgeClient.registerItemRenderer(ModWeapons.GlassBlade, transparentItemRenderer);
                MinecraftForgeClient.registerItemRenderer(ModWeapons.GlassKunai, transparentItemRenderer);
                MinecraftForgeClient.registerItemRenderer(ModWeapons.GlassKunaiReversed, transparentItemRenderer);
                MinecraftForgeClient.registerItemRenderer(ModWeapons.GlassDagger, transparentItemRenderer);
                MinecraftForgeClient.registerItemRenderer(ModWeapons.GlassDaggerReversed, transparentItemRenderer);
                MinecraftForgeClient.registerItemRenderer(ModItems.GlassDisc, transparentItemRenderer);
                MinecraftForgeClient.registerItemRenderer(ModWeapons.GlassPan, transparentItemRenderer);
                MinecraftForgeClient.registerItemRenderer(ModWeapons.GlassPanEnergized, transparentItemRenderer);
                MinecraftForgeClient.registerItemRenderer(ModWeapons.GlassPanBroken, transparentItemRenderer);
                MinecraftForgeClient.registerItemRenderer(ModWeapons.GlassCutlass, transparentItemRenderer);
                MinecraftForgeClient.registerItemRenderer(ModWeapons.CrystalSpear, transparentItemRenderer);
            }

            if(ConfigItems.SpecialWeaponItems && !ConfigItems.DisableAllWeapons){
                MinecraftForgeClient.registerItemRenderer(ModItems.glass_shard, transparentItemRenderer);
            }
        }
    }

    public void renderBlocks(){

        // Render Blocks
        RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)new RenderBlockFullBright());
        RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)new RenderBlockColor());

    }

    public void setRenderIDs(){
        CommonProxy.fullBrightBlockID = getNewRenderId();
        CommonProxy.colorBlockID = getNewRenderId();
    }

    @Override
    public void registerItem(Item item) {
        MinecraftForgeClient.registerItemRenderer(item, new PluginItemRenderer());
    }

    @Override
    public void registerBow(Item item) { MinecraftForgeClient.registerItemRenderer(item, new ItemBowRenderer()); }

    @Override
    public void registerTileEntities() { }

    static {
        renderItemBlockColor = new RenderItemBlockColor();
    }

}
