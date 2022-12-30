package com.squizzle_dizzle.knick_knacks.common.registry;

import com.squizzle_dizzle.knick_knacks.common.datagen.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.squizzle_dizzle.knick_knacks.KnickKnacks.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class KnickKnacksDataGenRegistry {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        generator.addProvider(true ,new KnickKnacksBlocksStateProvider(generator, existingFileHelper));
        generator.addProvider(true ,new KnickKnacksItemModelProvider(generator, existingFileHelper));
        //generator.addProvider(true ,new YeosMobsModLootTableProvider(generator));
        generator.addProvider(true ,new KnickKnacksBlockTagsProvider(generator, existingFileHelper));
        generator.addProvider(true ,new KnickKnacksBiomeTagsProvider(generator, existingFileHelper));
        generator.addProvider(true, new KnickKnacksLanguageProvider(generator, "en_us", false));

    }
}
