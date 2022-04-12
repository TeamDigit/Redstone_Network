package com.digital.redstone_network;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(RedstoneNetworkMod.MOD_ID)
public class RedstoneNetworkMod
{
    public static final String MOD_ID = "redstone_network";
    private static final Logger LOGGER = LogManager.getLogger();

    public RedstoneNetworkMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //
        eventBus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {}
}
