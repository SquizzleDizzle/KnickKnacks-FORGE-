package com.squizzle_dizzle.knick_knacks.common.datagen;

import com.squizzle_dizzle.knick_knacks.KnickKnacks;
import com.squizzle_dizzle.knick_knacks.common.registry.KnickKnacksBlockRegistry;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

import static com.squizzle_dizzle.knick_knacks.KnickKnacks.MOD_ID;

public class KnickKnacksBlocksStateProvider extends BlockStateProvider{
    public KnickKnacksBlocksStateProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MOD_ID, existingFileHelper);
    }

    private static final int DEFAULT_ANGLE_OFFSET = 180;
    @Override
    protected void registerStatesAndModels() {

        slabBlock((SlabBlock) KnickKnacksBlockRegistry.END_STONE_SLAB.get(), blockTexture(Blocks.END_STONE), blockTexture(Blocks.END_STONE));
        stairsBlock((StairBlock) KnickKnacksBlockRegistry.END_STONE_STAIRS.get(), blockTexture(Blocks.END_STONE));
        wallBlock(KnickKnacksBlockRegistry.END_STONE_WALL.get(), blockTexture(Blocks.END_STONE));
        wallBlock(KnickKnacksBlockRegistry.END_STONE_WALL, blockEndStoneLoc(Blocks.END_STONE));

        axisBlock((RotatedPillarBlock) KnickKnacksBlockRegistry.END_STONE_PILLAR.get(), blockEndLoc(KnickKnacksBlockRegistry.END_STONE_PILLAR), blockEndLoc(KnickKnacksBlockRegistry.END_STONE_PILLAR, "top"));

        simpleBlock(KnickKnacksBlockRegistry.CRACKED_END_STONE_BRICKS.get());

        simpleBlock(KnickKnacksBlockRegistry.OBSIDIAN_EMBEDDED_ENDSTONE.get());

        simpleBlock(KnickKnacksBlockRegistry.POLISHED_END_STONE.get());
        slabBlock((SlabBlock) KnickKnacksBlockRegistry.POLISHED_END_STONE_SLAB.get(), blockEndLoc(KnickKnacksBlockRegistry.POLISHED_END_STONE), blockEndLoc(KnickKnacksBlockRegistry.POLISHED_END_STONE));
        stairsBlock((StairBlock) KnickKnacksBlockRegistry.POLISHED_END_STONE_STAIRS.get(), blockEndLoc(KnickKnacksBlockRegistry.POLISHED_END_STONE));
        wallBlock(KnickKnacksBlockRegistry.POLISHED_END_STONE_WALL, blockEndLoc(KnickKnacksBlockRegistry.POLISHED_END_STONE));

        simpleBlock(KnickKnacksBlockRegistry.DARK_PURPUR_BLOCK.get());
        slabBlock((SlabBlock) KnickKnacksBlockRegistry.DARK_PURPUR_SLAB.get(), blockEndLoc(KnickKnacksBlockRegistry.DARK_PURPUR_BLOCK), blockEndLoc(KnickKnacksBlockRegistry.DARK_PURPUR_BLOCK));
        stairsBlock((StairBlock) KnickKnacksBlockRegistry.DARK_PURPUR_STAIRS.get(), blockEndLoc(KnickKnacksBlockRegistry.DARK_PURPUR_BLOCK));
        wallBlock(KnickKnacksBlockRegistry.DARK_PURPUR_WALL, blockEndLoc(KnickKnacksBlockRegistry.DARK_PURPUR_BLOCK));

        simpleBlock(KnickKnacksBlockRegistry.CRACKED_DARK_PURPUR.get());

        axisBlock(KnickKnacksBlockRegistry.DARK_PURPUR_PILLAR.get(), blockEndLoc(KnickKnacksBlockRegistry.DARK_PURPUR_PILLAR), blockEndLoc(KnickKnacksBlockRegistry.DARK_PURPUR_PILLAR, "top"));

        simpleBlock(KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR.get());
        slabBlock((SlabBlock) KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR_SLAB.get(), blockEndLoc(KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR), blockEndLoc(KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR));
        stairsBlock((StairBlock) KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR_STAIRS.get(), blockEndLoc(KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR));
        wallBlock(KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR_WALL, blockEndLoc(KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR));

        wallBlock(KnickKnacksBlockRegistry.PURPUR_WALL, blockPurpurBlockLoc(Blocks.PURPUR_BLOCK));
        simpleBlock(KnickKnacksBlockRegistry.CRACKED_PURPUR.get());

        simpleBlock(KnickKnacksBlockRegistry.POLISHED_PURPUR.get());
        slabBlock((SlabBlock) KnickKnacksBlockRegistry.POLISHED_PURPUR_SLAB.get(), blockEndLoc(KnickKnacksBlockRegistry.POLISHED_PURPUR), blockEndLoc(KnickKnacksBlockRegistry.POLISHED_PURPUR));
        stairsBlock((StairBlock) KnickKnacksBlockRegistry.POLISHED_PURPUR_STAIRS.get(), blockEndLoc(KnickKnacksBlockRegistry.POLISHED_PURPUR));
        wallBlock(KnickKnacksBlockRegistry.POLISHED_PURPUR_WALL, blockEndLoc(KnickKnacksBlockRegistry.POLISHED_PURPUR));

        simpleBlock(KnickKnacksBlockRegistry.END_SAND.get());
        simpleBlock(KnickKnacksBlockRegistry.END_SANDSTONE.get());
        stairsBlock(KnickKnacksBlockRegistry.END_SANDSTONE_STAIRS.get(), blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE));
        wallBlock(KnickKnacksBlockRegistry.END_SANDSTONE_WALL, blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE));
        slabBlock(KnickKnacksBlockRegistry.END_SANDSTONE_SLAB.get(), blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE),blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE), blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE, "bottom"), blockEndLoc(KnickKnacksBlockRegistry.SMOOTH_END_SANDSTONE));

        simpleBlock(KnickKnacksBlockRegistry.END_SANDSTONE_BRICKS.get());
        simpleBlock(KnickKnacksBlockRegistry.CRACKED_END_SANDSTONE_BRICKS.get());
        wallBlock(KnickKnacksBlockRegistry.END_SANDSTONE_BRICK_WALL, blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE));
        stairsBlock(KnickKnacksBlockRegistry.END_SANDSTONE_BRICK_STAIRS.get(), blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE));
        slabBlock(KnickKnacksBlockRegistry.END_SANDSTONE_BRICK_SLAB.get(), blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE),blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE), blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE, "bottom"), blockEndLoc(KnickKnacksBlockRegistry.SMOOTH_END_SANDSTONE));

        axisBlock(KnickKnacksBlockRegistry.END_SANDSTONE_PILLAR.get(), blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE_PILLAR), blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE_PILLAR, "top"));

        simpleBlock(KnickKnacksBlockRegistry.SMOOTH_END_SANDSTONE.get());
        wallBlock(KnickKnacksBlockRegistry.SMOOTH_END_SANDSTONE_WALL, blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE));
        stairsBlock(KnickKnacksBlockRegistry.SMOOTH_END_SANDSTONE_STAIRS.get(), blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE));
        slabBlock(KnickKnacksBlockRegistry.SMOOTH_END_SANDSTONE_SLAB.get(), blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE),blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE), blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE, "bottom"), blockEndLoc(KnickKnacksBlockRegistry.SMOOTH_END_SANDSTONE));

        simpleBlock(KnickKnacksBlockRegistry.CUT_END_SANDSTONE.get());
        wallBlock(KnickKnacksBlockRegistry.CUT_END_SANDSTONE_WALL, blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE));
        stairsBlock(KnickKnacksBlockRegistry.CUT_END_SANDSTONE_STAIRS.get(), blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE));
        slabBlock(KnickKnacksBlockRegistry.CUT_END_SANDSTONE_SLAB.get(), blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE),blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE), blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE, "bottom"), blockEndLoc(KnickKnacksBlockRegistry.SMOOTH_END_SANDSTONE));

        chiseledBlock(KnickKnacksBlockRegistry.CHISELED_END_SANDSTONE, blockEndLoc(KnickKnacksBlockRegistry.CHISELED_END_SANDSTONE), blockEndLoc(KnickKnacksBlockRegistry.SMOOTH_END_SANDSTONE));
        chiseledBlock(KnickKnacksBlockRegistry.CHISELED_DARK_PURPUR, blockEndLoc(KnickKnacksBlockRegistry.CHISELED_DARK_PURPUR), blockEndLoc(KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR));
        chiseledBlock(KnickKnacksBlockRegistry.CHISELED_PURPUR, blockEndLoc(KnickKnacksBlockRegistry.CHISELED_PURPUR), blockEndLoc(KnickKnacksBlockRegistry.POLISHED_PURPUR));
        chiseledBlock(KnickKnacksBlockRegistry.CHISELED_END_STONE, blockEndLoc(KnickKnacksBlockRegistry.CHISELED_END_STONE), blockEndLoc(KnickKnacksBlockRegistry.POLISHED_END_STONE));

        directionalBlock(KnickKnacksBlockRegistry.ERST.get(), models().cross(KnickKnacksBlockRegistry.ERST.getId().getPath(), blockEndLoc(KnickKnacksBlockRegistry.ERST)).renderType("cutout"));
        directionalBlock(KnickKnacksBlockRegistry.TALL_ERST.get(), models().cross(KnickKnacksBlockRegistry.TALL_ERST.getId().getPath(), blockEndLoc(KnickKnacksBlockRegistry.TALL_ERST)).renderType("cutout"));
        directionalBlock(KnickKnacksBlockRegistry.PONT.get(), models().cross(KnickKnacksBlockRegistry.PONT.getId().getPath(), blockEndLoc(KnickKnacksBlockRegistry.PONT)).renderType("cutout"));
        directionalBlock(KnickKnacksBlockRegistry.TALL_PONT.get(), models().cross(KnickKnacksBlockRegistry.TALL_PONT.getId().getPath(), blockEndLoc(KnickKnacksBlockRegistry.TALL_PONT)).renderType("cutout"));
        directionalBlock(KnickKnacksBlockRegistry.SMALL_CHORUS_FLOWER.get(), models().cross(KnickKnacksBlockRegistry.SMALL_CHORUS_FLOWER.getId().getPath(), blockEndLoc(KnickKnacksBlockRegistry.SMALL_CHORUS_FLOWER)).renderType("cutout"));
        directionalBlock(KnickKnacksBlockRegistry.FROZEN_ERST.get(), models().cross(KnickKnacksBlockRegistry.FROZEN_ERST.getId().getPath(), blockEndLoc(KnickKnacksBlockRegistry.FROZEN_ERST)).renderType("cutout"));

        simpleBlock(KnickKnacksBlockRegistry.PLITE_PLANKS.get());
        simpleBlock(KnickKnacksBlockRegistry.PLITE_LEAVES.get());
        axisBlock(KnickKnacksBlockRegistry.PLITE_LOG.get(), blockEndLoc(KnickKnacksBlockRegistry.PLITE_LOG), blockEndLoc(KnickKnacksBlockRegistry.PLITE_LOG, "top"));
        axisBlock(KnickKnacksBlockRegistry.STRIPPED_PLITE_LOG.get(), blockEndLoc(KnickKnacksBlockRegistry.STRIPPED_PLITE_LOG), blockEndLoc(KnickKnacksBlockRegistry.STRIPPED_PLITE_LOG, "top"));
        axisBlock(KnickKnacksBlockRegistry.STRIPPED_PLITE_WOOD.get(), models().cubeColumn(KnickKnacksBlockRegistry.STRIPPED_PLITE_WOOD.getId().getPath(), blockEndLoc(KnickKnacksBlockRegistry.STRIPPED_PLITE_LOG), blockEndLoc(KnickKnacksBlockRegistry.STRIPPED_PLITE_LOG)), models().cubeColumn(KnickKnacksBlockRegistry.STRIPPED_PLITE_WOOD.getId().getPath(), blockEndLoc(KnickKnacksBlockRegistry.STRIPPED_PLITE_LOG), blockEndLoc(KnickKnacksBlockRegistry.STRIPPED_PLITE_LOG)));
        axisBlock(KnickKnacksBlockRegistry.PLITE_WOOD.get(), models().cubeColumn(KnickKnacksBlockRegistry.PLITE_WOOD.getId().getPath(), blockEndLoc(KnickKnacksBlockRegistry.PLITE_LOG), blockEndLoc(KnickKnacksBlockRegistry.PLITE_LOG)), models().cubeColumn(KnickKnacksBlockRegistry.PLITE_WOOD.getId().getPath(), blockEndLoc(KnickKnacksBlockRegistry.PLITE_LOG), blockEndLoc(KnickKnacksBlockRegistry.PLITE_LOG)));
        slabBlock(KnickKnacksBlockRegistry.PLITE_SLAB.get(), blockEndLoc(KnickKnacksBlockRegistry.PLITE_PLANKS), blockEndLoc(KnickKnacksBlockRegistry.PLITE_PLANKS));
        fenceBlock(KnickKnacksBlockRegistry.PLITE_FENCE, blockEndLoc(KnickKnacksBlockRegistry.PLITE_PLANKS));
        stairsBlock(KnickKnacksBlockRegistry.PLITE_STAIRS.get(), blockEndLoc(KnickKnacksBlockRegistry.PLITE_PLANKS));
        buttonBlock(KnickKnacksBlockRegistry.PLITE_BUTTON, blockEndLoc(KnickKnacksBlockRegistry.PLITE_PLANKS));
        pressurePlateBlock(KnickKnacksBlockRegistry.PLITE_PRESSURE_PLATE.get(), blockEndLoc(KnickKnacksBlockRegistry.PLITE_PLANKS));
        trapdoorBlockWithRenderType(KnickKnacksBlockRegistry.PLITE_TRAPDOOR.get(), blockEndLoc(KnickKnacksBlockRegistry.PLITE_TRAPDOOR), true, "cutout");
        fenceGateBlock(KnickKnacksBlockRegistry.PLITE_FENCE_GATE.get(), blockEndLoc(KnickKnacksBlockRegistry.PLITE_PLANKS));

        directionalBlock(KnickKnacksBlockRegistry.PLITE_SAPLING.get(), models().cross(KnickKnacksBlockRegistry.PLITE_SAPLING.getId().getPath(), blockEndLoc(KnickKnacksBlockRegistry.PLITE_SAPLING)).renderType("cutout"));

        simpleBlock(KnickKnacksBlockRegistry.END_ICE.get());
        simpleBlock(KnickKnacksBlockRegistry.GREEN_ICE.get());
        simpleBlock(KnickKnacksBlockRegistry.PACKED_END_ICE.get());

        simpleBlock(KnickKnacksBlockRegistry.END_SANDSTONE.get(), models().cubeBottomTop(KnickKnacksBlockRegistry.END_SANDSTONE.getId().getPath(), blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE), blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE, "bottom"), blockEndLoc(KnickKnacksBlockRegistry.SMOOTH_END_SANDSTONE)));

        simpleBlock(KnickKnacksBlockRegistry.MOON_STONE.get());
        simpleBlock(KnickKnacksBlockRegistry.CIRCLE_STONE.get());
        simpleBlock(KnickKnacksBlockRegistry.SCRATCH_STONE.get());
        simpleBlock(KnickKnacksBlockRegistry.POLISHED_MOON_STONE.get());
        simpleBlock(KnickKnacksBlockRegistry.POLISHED_CIRCLE_STONE.get());
        simpleBlock(KnickKnacksBlockRegistry.POLISHED_SCRATCH_STONE.get());
        simpleBlock(KnickKnacksBlockRegistry.MOON_STONE_BRICKS.get());
        simpleBlock(KnickKnacksBlockRegistry.CIRCLE_STONE_BRICKS.get());
        simpleBlock(KnickKnacksBlockRegistry.SCRATCH_STONE_BRICKS.get());
        simpleBlock(KnickKnacksBlockRegistry.CRACKED_MOON_STONE_BRICKS.get());
        simpleBlock(KnickKnacksBlockRegistry.CRACKED_CIRCLE_STONE_BRICKS.get());
        simpleBlock(KnickKnacksBlockRegistry.CRACKED_SCRATCH_STONE_BRICKS.get());
        simpleBlock(KnickKnacksBlockRegistry.CHISELED_MOON_STONE.get());
        simpleBlock(KnickKnacksBlockRegistry.CHISELED_CIRCLE_STONE.get());
        simpleBlock(KnickKnacksBlockRegistry.CHISELED_SCRATCH_STONE.get());
        axisBlock(KnickKnacksBlockRegistry.MOON_STONE_PILLAR.get(), blockEndLoc(KnickKnacksBlockRegistry.MOON_STONE_PILLAR), blockEndLoc(KnickKnacksBlockRegistry.MOON_STONE_PILLAR, "top"));
        axisBlock(KnickKnacksBlockRegistry.CIRCLE_STONE_PILLAR.get(), blockEndLoc(KnickKnacksBlockRegistry.CIRCLE_STONE_PILLAR), blockEndLoc(KnickKnacksBlockRegistry.CIRCLE_STONE_PILLAR, "top"));
        axisBlock(KnickKnacksBlockRegistry.SCRATCH_STONE_PILLAR.get(), blockEndLoc(KnickKnacksBlockRegistry.SCRATCH_STONE_PILLAR), blockEndLoc(KnickKnacksBlockRegistry.SCRATCH_STONE_PILLAR, "top"));
        stairsBlock(KnickKnacksBlockRegistry.MOON_STONE_STAIRS.get(), blockEndLoc(KnickKnacksBlockRegistry.MOON_STONE));
        stairsBlock(KnickKnacksBlockRegistry.CIRCLE_STONE_STAIRS.get(), blockEndLoc(KnickKnacksBlockRegistry.CIRCLE_STONE));
        stairsBlock(KnickKnacksBlockRegistry.SCRATCH_STONE_STAIRS.get(), blockEndLoc(KnickKnacksBlockRegistry.SCRATCH_STONE));
        stairsBlock(KnickKnacksBlockRegistry.POLISHED_MOON_STONE_STAIRS.get(), blockEndLoc(KnickKnacksBlockRegistry.POLISHED_MOON_STONE));
        stairsBlock(KnickKnacksBlockRegistry.POLISHED_CIRCLE_STONE_STAIRS.get(), blockEndLoc(KnickKnacksBlockRegistry.POLISHED_CIRCLE_STONE));
        stairsBlock(KnickKnacksBlockRegistry.POLISHED_SCRATCH_STONE_STAIRS.get(), blockEndLoc(KnickKnacksBlockRegistry.POLISHED_SCRATCH_STONE));
        slabBlock(KnickKnacksBlockRegistry.MOON_STONE_SLAB.get(), blockEndLoc(KnickKnacksBlockRegistry.MOON_STONE),blockEndLoc(KnickKnacksBlockRegistry.MOON_STONE), blockEndLoc(KnickKnacksBlockRegistry.MOON_STONE, "bottom"), blockEndLoc(KnickKnacksBlockRegistry.MOON_STONE));
        slabBlock(KnickKnacksBlockRegistry.CIRCLE_STONE_SLAB.get(), blockEndLoc(KnickKnacksBlockRegistry.CIRCLE_STONE),blockEndLoc(KnickKnacksBlockRegistry.CIRCLE_STONE), blockEndLoc(KnickKnacksBlockRegistry.CIRCLE_STONE, "bottom"), blockEndLoc(KnickKnacksBlockRegistry.CIRCLE_STONE));
        slabBlock(KnickKnacksBlockRegistry.SCRATCH_STONE_SLAB.get(), blockEndLoc(KnickKnacksBlockRegistry.SCRATCH_STONE),blockEndLoc(KnickKnacksBlockRegistry.SCRATCH_STONE), blockEndLoc(KnickKnacksBlockRegistry.SCRATCH_STONE, "bottom"), blockEndLoc(KnickKnacksBlockRegistry.SCRATCH_STONE));
        slabBlock(KnickKnacksBlockRegistry.POLISHED_MOON_STONE_SLAB.get(), blockEndLoc(KnickKnacksBlockRegistry.MOON_STONE),blockEndLoc(KnickKnacksBlockRegistry.MOON_STONE), blockEndLoc(KnickKnacksBlockRegistry.MOON_STONE, "bottom"), blockEndLoc(KnickKnacksBlockRegistry.MOON_STONE));
        slabBlock(KnickKnacksBlockRegistry.POLISHED_CIRCLE_STONE_SLAB.get(), blockEndLoc(KnickKnacksBlockRegistry.CIRCLE_STONE),blockEndLoc(KnickKnacksBlockRegistry.CIRCLE_STONE), blockEndLoc(KnickKnacksBlockRegistry.CIRCLE_STONE, "bottom"), blockEndLoc(KnickKnacksBlockRegistry.CIRCLE_STONE));
        slabBlock(KnickKnacksBlockRegistry.POLISHED_SCRATCH_STONE_SLAB.get(), blockEndLoc(KnickKnacksBlockRegistry.SCRATCH_STONE),blockEndLoc(KnickKnacksBlockRegistry.SCRATCH_STONE), blockEndLoc(KnickKnacksBlockRegistry.SCRATCH_STONE, "bottom"), blockEndLoc(KnickKnacksBlockRegistry.SCRATCH_STONE));
        wallBlock(KnickKnacksBlockRegistry.MOON_STONE_WALL, blockEndLoc(KnickKnacksBlockRegistry.MOON_STONE));
        wallBlock(KnickKnacksBlockRegistry.CIRCLE_STONE_WALL, blockEndLoc(KnickKnacksBlockRegistry.CIRCLE_STONE));
        wallBlock(KnickKnacksBlockRegistry.SCRATCH_STONE_WALL, blockEndLoc(KnickKnacksBlockRegistry.SCRATCH_STONE));
        wallBlock(KnickKnacksBlockRegistry.POLISHED_MOON_STONE_WALL, blockEndLoc(KnickKnacksBlockRegistry.MOON_STONE));
        wallBlock(KnickKnacksBlockRegistry.POLISHED_CIRCLE_STONE_WALL, blockEndLoc(KnickKnacksBlockRegistry.CIRCLE_STONE));
        wallBlock(KnickKnacksBlockRegistry.POLISHED_SCRATCH_STONE_WALL, blockEndLoc(KnickKnacksBlockRegistry.SCRATCH_STONE));
        stairsBlock(KnickKnacksBlockRegistry.MOON_STONE_BRICK_STAIRS.get(), blockEndLoc(KnickKnacksBlockRegistry.MOON_STONE_BRICKS));
        stairsBlock(KnickKnacksBlockRegistry.CIRCLE_STONE_BRICK_STAIRS.get(), blockEndLoc(KnickKnacksBlockRegistry.CIRCLE_STONE_BRICKS));
        stairsBlock(KnickKnacksBlockRegistry.SCRATCH_STONE_BRICK_STAIRS.get(), blockEndLoc(KnickKnacksBlockRegistry.SCRATCH_STONE_BRICKS));
        slabBlock(KnickKnacksBlockRegistry.MOON_STONE_BRICK_SLAB.get(), blockEndLoc(KnickKnacksBlockRegistry.MOON_STONE_BRICKS),blockEndLoc(KnickKnacksBlockRegistry.MOON_STONE_BRICKS), blockEndLoc(KnickKnacksBlockRegistry.MOON_STONE_BRICKS, "bottom"), blockEndLoc(KnickKnacksBlockRegistry.MOON_STONE_BRICKS));
        slabBlock(KnickKnacksBlockRegistry.CIRCLE_STONE_BRICK_SLAB.get(), blockEndLoc(KnickKnacksBlockRegistry.CIRCLE_STONE_BRICKS),blockEndLoc(KnickKnacksBlockRegistry.CIRCLE_STONE_BRICKS), blockEndLoc(KnickKnacksBlockRegistry.CIRCLE_STONE_BRICKS, "bottom"), blockEndLoc(KnickKnacksBlockRegistry.CIRCLE_STONE_BRICKS));
        slabBlock(KnickKnacksBlockRegistry.SCRATCH_STONE_BRICK_SLAB.get(), blockEndLoc(KnickKnacksBlockRegistry.SCRATCH_STONE_BRICKS),blockEndLoc(KnickKnacksBlockRegistry.SCRATCH_STONE_BRICKS), blockEndLoc(KnickKnacksBlockRegistry.SCRATCH_STONE_BRICKS, "bottom"), blockEndLoc(KnickKnacksBlockRegistry.SCRATCH_STONE_BRICKS));
        wallBlock(KnickKnacksBlockRegistry.MOON_STONE_BRICK_WALL, blockEndLoc(KnickKnacksBlockRegistry.MOON_STONE_BRICKS));
        wallBlock(KnickKnacksBlockRegistry.CIRCLE_STONE_BRICK_WALL, blockEndLoc(KnickKnacksBlockRegistry.CIRCLE_STONE_BRICKS));
        wallBlock(KnickKnacksBlockRegistry.SCRATCH_STONE_BRICK_WALL, blockEndLoc(KnickKnacksBlockRegistry.SCRATCH_STONE_BRICKS));

        simpleBlock(KnickKnacksBlockRegistry.LARIMAR_ORE.get());
        simpleBlock(KnickKnacksBlockRegistry.LARIMAR_BLOCK.get());
    }

    public void fenceBlock(RegistryObject<FenceBlock> block, ResourceLocation texture) {
        super.fenceBlock(block.get(), texture);
        models().fenceInventory(block.getId().toString() + "_inventory", texture);
    }

    public void buttonBlock(RegistryObject<ButtonBlock> block, ResourceLocation texture) {
        super.buttonBlock(block.get(), texture);
        models().buttonInventory(block.getId().toString() + "_inventory", texture);
    }

    public void wallBlock(RegistryObject<WallBlock> block, ResourceLocation texture) {
        super.wallBlock(block.get(), texture);
        models().wallInventory(block.getId().toString() + "_inventory", texture);
    }

    public void chiseledBlock(RegistryObject<Block> block, ResourceLocation side, ResourceLocation end) {
        models().cubeColumn(block.getId().toString(), side, end);
    }

    public void sandstoneBlock(RegistryObject<Block> block, ResourceLocation side, ResourceLocation end) {
        models().cubeColumn(block.getId().toString(), side, end);
    }


    public ResourceLocation blockPurpurBlockLoc(Block block) {
        return new ResourceLocation( "block/purpur_block");
    }

    public ResourceLocation blockEndStoneLoc(Block block) {
        return new ResourceLocation( "block/end_stone");
    }

    public ResourceLocation blockEndLoc(RegistryObject<? extends Block> block) {
        return new ResourceLocation(KnickKnacks.MOD_ID, "block/" + block.getId().getPath());
    }

    public ResourceLocation blockEndLoc(RegistryObject<? extends Block> block, String suffix) {
        return new ResourceLocation(KnickKnacks.MOD_ID, "block/" + block.getId().getPath() + "_" + suffix);
    }

    public void verticalBlock(Block block, ModelFile model) {
        verticalBlock(block, model, DEFAULT_ANGLE_OFFSET);
    }

    public void verticalBlock(Block block, ModelFile model, int angleOffset) {
        verticalBlock(block, $ -> model, angleOffset);
    }

    public void verticalBlock(RegistryObject<Block> block, BlockModelBuilder modelFunc) {
        verticalBlock(block, modelFunc);
    }

    public void verticalBlock(Block block, Function<BlockState, ModelFile> modelFunc, int angleOffset) {
        getVariantBuilder(block)
                .forAllStates(state -> {
                    Direction dir = state.getValue(BlockStateProperties.VERTICAL_DIRECTION);
                    return ConfiguredModel.builder()
                            .modelFile(modelFunc.apply(state))
                            .rotationX(dir.getAxis().isVertical() ? 0 : (((int) dir.toYRot()) + angleOffset) % 360)
                            .build();
                });
    }



}
