package KAMKEEL.PluginMod;

import KAMKEEL.PluginMod.Blocks.ModBlocks;
import KAMKEEL.PluginMod.Compat.CompatibilityBiomesOPlenty;
import KAMKEEL.PluginMod.Compat.CompatibilityExtraUtilities;
import KAMKEEL.PluginMod.Config.ConfigCompat;
import KAMKEEL.PluginMod.Config.ConfigItem;
import KAMKEEL.PluginMod.Config.LoadConfiguration;
import KAMKEEL.PluginMod.Entity.EntityProjectile;
import KAMKEEL.PluginMod.Network.NetworkHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import KAMKEEL.PluginMod.Items.ModItems;
import cpw.mods.fml.common.network.FMLEventChannel;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;

import java.io.File;

@Mod(modid = "plug", name = "The Plugin Mod", version = "5.0")
public class PluginMod {

    @SidedProxy(clientSide = "KAMKEEL.PluginMod.Client.ClientProxy", serverSide = "KAMKEEL.PluginMod.CommonProxy")
    public static CommonProxy proxy;

    public static FMLEventChannel Channel;
    public static FMLEventChannel ChannelPlayer;

    private static int NewEntityStartId = 0;
    public static PluginMod instance;

    // Config
    public static String configPath;


    public PluginMod() {
        instance = this;
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        Channel = NetworkRegistry.INSTANCE.newEventDrivenChannel("PluginMod");
        ChannelPlayer = NetworkRegistry.INSTANCE.newEventDrivenChannel("PluginModPlayer");

        NetworkHandler.init();

        configPath = event.getModConfigurationDirectory() + File.separator + "PluginMod";
        configPath += File.separator;
        LoadConfiguration.init(configPath);

        proxy.preInnit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        //Proxy, TitleEntity, Entity, GUI and Packet Register
        proxy.load();
        registerNewEntity(EntityProjectile.class, "throwableitem", 64, 3, true);

        if(ConfigCompat.BiomesOPlenty){
            registerCompat(CompatibilityBiomesOPlenty.class, "BiomesOPlenty");
        }
        if(ConfigCompat.ExtraUtilities){
            registerCompat(CompatibilityExtraUtilities.class, "ExtraUtilities");
        }
    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event) {

    }

    public static CreativeTabs cardsTab = new CreativeTabs(LocalizationHelper.MOD_PREFIX + "playingCardTab") {
        @Override
        public Item getTabIconItem() {
            if(ModItems.TreasureMap == null) {
                return new ItemStack(Items.carrot).getItem();
            }
            return new ItemStack(ModItems.CardIcon).getItem();
        }
    };

    public static CreativeTabs miscTab = new CreativeTabs(LocalizationHelper.MOD_PREFIX + "misc") {
        @Override
        public Item getTabIconItem() {
            if(ModItems.TreasureMap == null) {
                return new ItemStack(Items.carrot).getItem();
            }
                return new ItemStack(ModItems.TreasureMap).getItem();
        }
    };

    public static CreativeTabs weaponTab = new CreativeTabs(LocalizationHelper.MOD_PREFIX + "weapons") {
        @Override
        public Item getTabIconItem() {
            if(ModItems.PaperBomb == null){
                return new ItemStack(Items.carrot).getItem();
            }
            return new ItemStack(ModItems.PaperBomb).getItem();
        }
    };


    public static CreativeTabs blocksTab = new CreativeTabs(LocalizationHelper.MOD_PREFIX + "blocks") {
        @Override
        public Item getTabIconItem() {
            if(ModBlocks.Cherry_Barrel == null){
                return new ItemStack(Blocks.enchanting_table).getItem();
            }
            return new ItemStack(ModBlocks.Cherry_Barrel).getItem();
        }
    };

    public void registerNewEntity(Class<? extends Entity> cl, String name, int range, int update, boolean velocity) {
        EntityRegistry.registerModEntity(cl, name, NewEntityStartId++, this, range, update, velocity);
    }

    public static void registerCompat(Class clazz, String modid) {
        if (Loader.isModLoaded(modid)) {
            try {
                Class.forName(clazz.getCanonicalName());
            } catch (ClassNotFoundException e) {
                System.out.println("Could not find compatibility class for mod { " + modid + " }. Please report this.");
            }
        }
    }

}
