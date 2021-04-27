package KAMKEEL.PluginMod;

import KAMKEEL.PluginMod.Blocks.ModBlocks;
import KAMKEEL.PluginMod.Entity.EntityProjectile;
import KAMKEEL.PluginMod.Network.NetworkHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import KAMKEEL.PluginMod.Items.ModItems;
import cpw.mods.fml.common.network.FMLEventChannel;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = "plug", name = "The Plugin Mod", version = "3.41")
public class PluginMod {

    @SidedProxy(clientSide = "KAMKEEL.PluginMod.Client.ClientProxy", serverSide = "KAMKEEL.PluginMod.CommonProxy")
    public static CommonProxy proxy;

    public static FMLEventChannel Channel;
    public static FMLEventChannel ChannelPlayer;

    private static int NewEntityStartId = 0;

    public static PluginMod instance;

    public PluginMod() {
        instance = this;
    }

    @Mod.EventHandler
    public void load(FMLPreInitializationEvent ev) {
        Channel = NetworkRegistry.INSTANCE.newEventDrivenChannel("PluginMod");
        ChannelPlayer = NetworkRegistry.INSTANCE.newEventDrivenChannel("PluginModPlayer");
        proxy.load();
        NetworkHandler.init();
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //Item/Block init Registering
        //Config Handling

        ModBlocks.init();
        ModItems.init();

        ModItems.initRecipes();
        ModBlocks.initRecipes();

        registerNewEntity(EntityProjectile.class, "throwableitem", 64, 3, true);

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        //Proxy, TitleEntity, Entity, GUI and Packet Register
        proxy.doOnLoadRegistration();
    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event) {

    }

    public static CreativeTabs cardsTab = new CreativeTabs(LocalizationHelper.MOD_PREFIX + "playingCardTab") {
        @Override
        public Item getTabIconItem() {
            return new ItemStack(ModItems.CardIcon).getItem();
        }
    };

    public static CreativeTabs miscTab = new CreativeTabs(LocalizationHelper.MOD_PREFIX + "misc") {
        @Override
        public Item getTabIconItem() {
            return new ItemStack(ModItems.TreasureMap).getItem();
        }
    };

    public static CreativeTabs weaponTab = new CreativeTabs(LocalizationHelper.MOD_PREFIX + "weapons") {
        @Override
        public Item getTabIconItem() {
            return new ItemStack(ModItems.PaperBomb).getItem();
        }
    };


    private void registerNewEntity(Class<? extends Entity> cl, String name, int range, int update, boolean velocity) {
        EntityRegistry.registerModEntity(cl, name, NewEntityStartId++, this, range, update, velocity);
    }

}
