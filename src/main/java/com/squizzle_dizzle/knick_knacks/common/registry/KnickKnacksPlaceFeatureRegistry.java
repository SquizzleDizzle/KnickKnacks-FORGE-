package com.squizzle_dizzle.knick_knacks.common.registry;

import com.squizzle_dizzle.knick_knacks.KnickKnacks;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class KnickKnacksPlaceFeatureRegistry {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, KnickKnacks.MOD_ID);
    public static final RegistryObject<PlacedFeature> ERST_BLOCK_PATCH_FLOOR = PLACED_FEATURES.register("erst_block_patch_floor", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) KnickKnacksConfigFeatureRegistry.ERST_BLOCK_PATCH_FLOOR, List.of(placementPatch() ,inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));
    public static final RegistryObject<PlacedFeature> ERST_BLOCK_PATCH_CEILING = PLACED_FEATURES.register("erst_block_patch_ceiling", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) KnickKnacksConfigFeatureRegistry.ERST_BLOCK_PATCH_CEILING, List.of(placementPatch() ,inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

    public static final RegistryObject<PlacedFeature> END_SAND_PATCH_CEILING = PLACED_FEATURES.register("end_sand_patch_ceiling", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) KnickKnacksConfigFeatureRegistry.END_SAND_PATCH_CEILING, List.of(placementPatch() ,inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

    public static final RegistryObject<PlacedFeature> FROZEN_END_STONE_PATCH_FLOOR = PLACED_FEATURES.register("frozen_end_stone_patch_floor", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) KnickKnacksConfigFeatureRegistry.FROZEN_END_STONE_PATCH_FLOOR, List.of(placementPatch() ,inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));
    public static final RegistryObject<PlacedFeature> FROZEN_END_STONE_PATCH_CEILING = PLACED_FEATURES.register("frozen_end_stone_patch_ceiling", () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) KnickKnacksConfigFeatureRegistry.FROZEN_END_STONE_PATCH_CEILING, List.of(placementPatch() ,inSquarePlacement(), placementNetherCrystalModifier(), biomeFilter())));

       private static CountOnEveryLayerPlacement placement(){
        return CountOnEveryLayerPlacement.of(4);
    }

    private static CountPlacement placementCrystal() {
        return CountPlacement.of(10);
    }

    private static CountPlacement placementOre() {
        return CountPlacement.of(5);
    }
    private static CountPlacement placementRareOre() {
        return CountPlacement.of(1);
    }

    private static CountPlacement placementPatch() {
        return CountPlacement.of(50);
    }
    private static CountPlacement placementFrigidite() {
        return CountPlacement.of(64);
    }

    private static CountPlacement placementSnow() {
        return CountPlacement.of(50);
    }

    private static InSquarePlacement inSquarePlacement() {
        return InSquarePlacement.spread();
    }
    private static PlacementModifier placementNetherCrystalModifier() {
        return PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT;
    }

    private static BiomeFilter biomeFilter() {
        return BiomeFilter.biome();
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}
