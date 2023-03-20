package com.squizzle_dizzle.knick_knacks;

import com.squizzle_dizzle.knick_knacks.common.registry.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(KnickKnacks.MOD_ID)
public class KnickKnacks {
    public static final Logger LOGGER = LogManager.getLogger();
    public static CommonProxy PROXY = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);
    public static final String MOD_ID = "knick_knacks";
    public KnickKnacks() {
        PROXY.init();

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        KnickKnacksBlockRegistry.register(eventBus);
        KnickKnacksItemRegistry.register(eventBus);
        KnickKnacksEntityRegistry.register(eventBus);
        KnickKnacksFluidRegistry.register(eventBus);
        KnickKnacksFluidTypeRegistry.register(eventBus);

        KnickKnacksFeatureRegistry.register(eventBus);
        KnickKnacksPlaceFeatureRegistry.register(eventBus);
        KnickKnacksBiomeRegistry.BIOMES.register(eventBus);
        eventBus.addListener(this::clientSetup);
        eventBus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void clientSetup(final FMLClientSetupEvent event) {
        PROXY.clientInit();
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(KnickKnacksBiomeRegistry::generateBiomes);
    }
}
