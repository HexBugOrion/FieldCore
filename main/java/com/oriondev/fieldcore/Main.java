package com.oriondev.fieldcore;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("fieldcore")
public class Main {

    public static Main instance;
    public static final String MOD_ID = "fieldcore";
    public static final Logger LOGGER = LogManager.getLogger();

    public Main()
    {
        instance = this;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::Setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
    }

    private void Setup(final FMLCommonSetupEvent event)
    {

    }

    private void ClientSetup(final FMLClientSetupEvent event)
    {

    }

    public void onServerStarting(FMLServerStartingEvent event)
    {

    }
}
