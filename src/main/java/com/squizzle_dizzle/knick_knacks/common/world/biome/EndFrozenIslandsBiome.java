package com.squizzle_dizzle.knick_knacks.common.world.biome;

import com.squizzle_dizzle.knick_knacks.common.registry.KnickKnacksPlaceFeatureRegistry;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.placement.EndPlacements;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;

public class EndFrozenIslandsBiome {
    public static Biome make() {
        BiomeGenerationSettings.Builder $$0 = (new BiomeGenerationSettings.Builder())
                .addFeature(GenerationStep.Decoration.TOP_LAYER_MODIFICATION, KnickKnacksPlaceFeatureRegistry.FROZEN_END_STONE_PATCH_FLOOR.getHolder().get())
                .addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, KnickKnacksPlaceFeatureRegistry.FROZEN_END_SPRING.getHolder().get());
        MobSpawnSettings.Builder $$1 = new MobSpawnSettings.Builder();
        BiomeDefaultFeatures.addSurfaceFreezing($$0);
        $$0.addFeature(GenerationStep.Decoration.SURFACE_STRUCTURES, EndPlacements.CHORUS_PLANT);
        $$0.addFeature(GenerationStep.Decoration.SURFACE_STRUCTURES, EndPlacements.END_GATEWAY_RETURN);

        BiomeDefaultFeatures.endSpawns($$1);
        return (new Biome.BiomeBuilder()).precipitation(Biome.Precipitation.NONE)
                .temperature(0.5F).downfall(0.5F).specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(4159204).waterFogColor(329011).fogColor(10518688).skyColor(0)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build()).mobSpawnSettings($$1.build())
                .generationSettings($$0.build()).build();
    }
}
