package com.squizzle_dizzle.knick_knacks.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.DripstoneThickness;
import net.minecraft.world.level.material.Fluids;

import javax.annotation.Nullable;

public class EndSandStoneBlock extends Block {

    public static final DirectionProperty UP_DOWN = BlockStateProperties.VERTICAL_DIRECTION;
    public EndSandStoneBlock(Properties p_49795_) {
        super(p_49795_);
        this.registerDefaultState(this.stateDefinition.any().setValue(UP_DOWN, Direction.UP));

    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_154157_) {
        p_154157_.add(UP_DOWN);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext p_154040_) {
        Direction direction = p_154040_.getNearestLookingVerticalDirection().getOpposite();
        return this.defaultBlockState().setValue(UP_DOWN, direction);
    }

    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(UP_DOWN, pRotation.rotate(pState.getValue(UP_DOWN)));
    }

    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(UP_DOWN)));
    }
}
