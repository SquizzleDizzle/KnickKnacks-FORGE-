package com.squizzle_dizzle.knick_knacks.common.world.feature;

import com.mojang.serialization.Codec;
import com.squizzle_dizzle.knick_knacks.common.world.feature.config.EndFrozenSpringConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;

public class EndFrozenSpringFeature extends Feature<EndFrozenSpringConfig> {
    public EndFrozenSpringFeature(Codec<EndFrozenSpringConfig> p_66914_) {
        super(p_66914_);
    }

    public boolean place(FeaturePlaceContext<EndFrozenSpringConfig> p_160404_) {
        EndFrozenSpringConfig springconfiguration = p_160404_.config();
        WorldGenLevel worldgenlevel = p_160404_.level();
        BlockPos blockpos = p_160404_.origin();
        if (!worldgenlevel.getBlockState(blockpos.above()).is(springconfiguration.validBlocks)) {
            return false;
        } else if (springconfiguration.requiresBlockBelow && !worldgenlevel.getBlockState(blockpos.below()).is(springconfiguration.validBlocks)) {
            return false;
        } else {
            BlockState blockstate = worldgenlevel.getBlockState(blockpos);
            if (!blockstate.isAir() && !blockstate.is(springconfiguration.validBlocks)) {
                return false;
            } else {
                int i = 0;
                int j = 0;
                if (worldgenlevel.getBlockState(blockpos.west()).is(springconfiguration.validBlocks)) {
                    ++j;
                }

                if (worldgenlevel.getBlockState(blockpos.east()).is(springconfiguration.validBlocks)) {
                    ++j;
                }

                if (worldgenlevel.getBlockState(blockpos.north()).is(springconfiguration.validBlocks)) {
                    ++j;
                }

                if (worldgenlevel.getBlockState(blockpos.south()).is(springconfiguration.validBlocks)) {
                    ++j;
                }

                if (worldgenlevel.getBlockState(blockpos.below()).is(springconfiguration.validBlocks)) {
                    ++j;
                }

                int k = 0;
                if (worldgenlevel.isEmptyBlock(blockpos.west())) {
                    ++k;
                }

                if (worldgenlevel.isEmptyBlock(blockpos.east())) {
                    ++k;
                }

                if (worldgenlevel.isEmptyBlock(blockpos.north())) {
                    ++k;
                }

                if (worldgenlevel.isEmptyBlock(blockpos.south())) {
                    ++k;
                }

                if (worldgenlevel.isEmptyBlock(blockpos.below())) {
                    ++k;
                }

                if (j == springconfiguration.rockCount && k == springconfiguration.holeCount) {
                    worldgenlevel.setBlock(blockpos, springconfiguration.state, 2);
                    worldgenlevel.scheduleTick(blockpos, springconfiguration.state.getBlock(), 0);
                    ++i;
                }

                return i > 0;
            }
        }
    }
}
