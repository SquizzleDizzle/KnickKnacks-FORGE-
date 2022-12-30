package com.squizzle_dizzle.knick_knacks.common.registry;

import com.squizzle_dizzle.knick_knacks.KnickKnacks;
import com.squizzle_dizzle.knick_knacks.common.world.feature.EndFrozenSpringFeature;
import com.squizzle_dizzle.knick_knacks.common.world.feature.config.EndFrozenSpringConfig;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class KnickKnacksFeatureRegistry {
    public static final DeferredRegister<Feature<?>> FEATURE =
            DeferredRegister.create(Registry.FEATURE_REGISTRY, KnickKnacks.MOD_ID);
    public static final RegistryObject<EndFrozenSpringFeature> END_FROZEN_SPRING = FEATURE.register("end_frozen_spring", () -> new EndFrozenSpringFeature(EndFrozenSpringConfig.CODEC));

    public static void register(IEventBus eventBus) {
        FEATURE.register(eventBus);
    }
}
