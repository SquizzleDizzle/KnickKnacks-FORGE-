package com.squizzle_dizzle.knick_knacks.common.registry;

import com.squizzle_dizzle.knick_knacks.KnickKnacks;
import com.squizzle_dizzle.knick_knacks.common.block.EndSandStoneBlock;
import com.squizzle_dizzle.knick_knacks.common.world.feature.config.AcidRockFeatureConfiguration;
import com.squizzle_dizzle.knick_knacks.common.world.feature.config.EndFrozenSpringConfig;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.placement.CaveSurface;

public class KnickKnacksConfigFeatureRegistry {
    public static final Holder<ConfiguredFeature<SimpleBlockConfiguration, ?>> ERST_VEGETATION = FeatureUtils.register("erst_vegetation", Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(KnickKnacksBlockRegistry.ERST.get().defaultBlockState(), 4).add(KnickKnacksBlockRegistry.PONT.get().defaultBlockState(), 5).add(KnickKnacksBlockRegistry.SMALL_CHORUS_FLOWER.get().defaultBlockState(), 1))));

    public static final Holder<ConfiguredFeature<VegetationPatchConfiguration, ?>> ERST_BLOCK_PATCH_FLOOR = FeatureUtils.register("erst_block_patch_floor", Feature.VEGETATION_PATCH, new VegetationPatchConfiguration(KnickKnacksTagRegistry.Blocks.END_GRASS_PLACEABLE, BlockStateProvider.simple(KnickKnacksBlockRegistry.ERST_BLOCK.get()), PlacementUtils.inlinePlaced(ERST_VEGETATION) , CaveSurface.FLOOR, UniformInt.of(1, 1), 0.0F, 5, 0.08F, UniformInt.of(10, 20), 0.3F));

    public static final Holder<ConfiguredFeature<VegetationPatchConfiguration, ?>> ERST_BLOCK_PATCH_CEILING = FeatureUtils.register("erst_block_patch_ceiling", Feature.VEGETATION_PATCH, new VegetationPatchConfiguration(KnickKnacksTagRegistry.Blocks.END_GRASS_PLACEABLE, BlockStateProvider.simple(KnickKnacksBlockRegistry.ERST_BLOCK.get().defaultBlockState().setValue(EndSandStoneBlock.UP_DOWN ,Direction.DOWN)), PlacementUtils.inlinePlaced(ERST_VEGETATION) , CaveSurface.CEILING, UniformInt.of(1, 1), 0.0F, 5, 0.08F, UniformInt.of(10, 20), 0.3F));

    public static final Holder<ConfiguredFeature<VegetationPatchConfiguration, ?>> END_SAND_PATCH_CEILING = FeatureUtils.register("end_sand_patch_ceiling", Feature.VEGETATION_PATCH, new VegetationPatchConfiguration(KnickKnacksTagRegistry.Blocks.END_GRASS_PLACEABLE, BlockStateProvider.simple(KnickKnacksBlockRegistry.END_SAND.get()), PlacementUtils.inlinePlaced(ERST_VEGETATION) , CaveSurface.CEILING, UniformInt.of(1, 1), 0.0F, 5, 0.08F, UniformInt.of(10, 20), 0.3F));

    public static final Holder<ConfiguredFeature<VegetationPatchConfiguration, ?>> FROZEN_END_STONE_PATCH_FLOOR = FeatureUtils.register("frozen_end_stone_patch_floor", Feature.VEGETATION_PATCH, new VegetationPatchConfiguration(KnickKnacksTagRegistry.Blocks.END_GRASS_PLACEABLE, BlockStateProvider.simple(KnickKnacksBlockRegistry.FROZEN_ENDSTONE.get()), PlacementUtils.inlinePlaced(ERST_VEGETATION) , CaveSurface.FLOOR, UniformInt.of(1, 1), 0.0F, 5, 0.08F, UniformInt.of(10, 20), 0.3F));

    public static final Holder<ConfiguredFeature<VegetationPatchConfiguration, ?>> FROZEN_END_STONE_PATCH_CEILING = FeatureUtils.register("frozen_end_stone_patch_ceiling", Feature.VEGETATION_PATCH, new VegetationPatchConfiguration(KnickKnacksTagRegistry.Blocks.END_GRASS_PLACEABLE, BlockStateProvider.simple(KnickKnacksBlockRegistry.FROZEN_ENDSTONE.get().defaultBlockState().setValue(EndSandStoneBlock.UP_DOWN ,Direction.DOWN)), PlacementUtils.inlinePlaced(ERST_VEGETATION) , CaveSurface.CEILING, UniformInt.of(1, 1), 0.0F, 5, 0.08F, UniformInt.of(10, 20), 0.3F));

    public static final Holder<ConfiguredFeature<EndFrozenSpringConfig, ?>> SPRING_FROZEN_END = registerConfiguredFeature("spring_frozen_end", KnickKnacksFeatureRegistry.END_FROZEN_SPRING.get(), new EndFrozenSpringConfig(KnickKnacksBlockRegistry.END_ICE.get().defaultBlockState(), false, 4, 1, HolderSet.direct(Block::builtInRegistryHolder)));
    public static <FC extends FeatureConfiguration, F extends Feature<FC>> Holder<ConfiguredFeature<FC, ?>> registerConfiguredFeature(String name, F feature, FC featureConfiguration) {
        ResourceLocation resourceLocation = new ResourceLocation(KnickKnacks.MOD_ID, name);
        if (BuiltinRegistries.CONFIGURED_FEATURE.keySet().contains(resourceLocation)) {
            throw new IllegalStateException("Placed Feature ID: \"" + resourceLocation + "\" already exists in the Placed Features registry!");
        } else {
            return BuiltinRegistries.registerExact(BuiltinRegistries.CONFIGURED_FEATURE, resourceLocation.toString(), new ConfiguredFeature(feature, featureConfiguration));
        }
    }

}
