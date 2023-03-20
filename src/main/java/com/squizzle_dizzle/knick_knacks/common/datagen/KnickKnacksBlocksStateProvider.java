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
        simpleBlock(KnickKnacksBlockRegistry.SMOOTH_END_SANDSTONE.get());
        //slabBlock((SlabBlock) END_SANDSTONE_SLAB.get(), blockLoc(END_SANDSTONE), blockLoc(KnickKnacksBlockRegistry.END_SANDSTONE));
        stairsBlock(KnickKnacksBlockRegistry.END_SANDSTONE_STAIRS.get(), blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE));
        wallBlock(KnickKnacksBlockRegistry.END_SANDSTONE_WALL, blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE));

        //sandstoneBlock(END_SANDSTONE, blockLoc(END_SANDSTONE), blockLoc(SMOOTH_END_SANDSTONE));
        chiseledBlock(KnickKnacksBlockRegistry.CHISELED_END_SANDSTONE, blockEndLoc(KnickKnacksBlockRegistry.CHISELED_END_SANDSTONE), blockEndLoc(KnickKnacksBlockRegistry.SMOOTH_END_SANDSTONE));
        chiseledBlock(KnickKnacksBlockRegistry.CHISELED_DARK_PURPUR, blockEndLoc(KnickKnacksBlockRegistry.CHISELED_DARK_PURPUR), blockEndLoc(KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR));
        chiseledBlock(KnickKnacksBlockRegistry.CHISELED_PURPUR, blockEndLoc(KnickKnacksBlockRegistry.CHISELED_PURPUR), blockEndLoc(KnickKnacksBlockRegistry.POLISHED_PURPUR));
        chiseledBlock(KnickKnacksBlockRegistry.CHISELED_END_STONE, blockEndLoc(KnickKnacksBlockRegistry.CHISELED_END_STONE), blockEndLoc(KnickKnacksBlockRegistry.POLISHED_END_STONE));


        //slabBlock(KnickKnacksBlockRegistry.END_SANDSTONE_SLAB.get(), blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE),blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE), blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE, "bottom"), blockEndLoc(KnickKnacksBlockRegistry.SMOOTH_END_SANDSTONE));
        directionalBlock(KnickKnacksBlockRegistry.ERST.get(), models().cross(KnickKnacksBlockRegistry.ERST.getId().getPath(), blockEndLoc(KnickKnacksBlockRegistry.ERST)).renderType("cutout"));
        directionalBlock(KnickKnacksBlockRegistry.PONT.get(), models().cross(KnickKnacksBlockRegistry.PONT.getId().getPath(), blockEndLoc(KnickKnacksBlockRegistry.PONT)).renderType("cutout"));
        directionalBlock(KnickKnacksBlockRegistry.SMALL_CHORUS_FLOWER.get(), models().cross(KnickKnacksBlockRegistry.SMALL_CHORUS_FLOWER.getId().getPath(), blockEndLoc(KnickKnacksBlockRegistry.SMALL_CHORUS_FLOWER)).renderType("cutout"));

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

        simpleBlock(KnickKnacksBlockRegistry.PLITE_SAPLING.get(), models().cross(KnickKnacksBlockRegistry.PLITE_SAPLING.getId().getPath(),
                blockTexture(KnickKnacksBlockRegistry.PLITE_SAPLING.get())));

        simpleBlock(KnickKnacksBlockRegistry.END_ICE.get());
        simpleBlock(KnickKnacksBlockRegistry.GREEN_ICE.get());
        simpleBlock(KnickKnacksBlockRegistry.PACKED_END_ICE.get());

        axisBlock(KnickKnacksBlockRegistry.ACID_ROCK.get(), blockEndLoc(KnickKnacksBlockRegistry.ACID_ROCK), blockEndLoc(KnickKnacksBlockRegistry.ACID_ROCK, "top"));

        simpleBlock(KnickKnacksBlockRegistry.END_SANDSTONE.get(), models().cubeBottomTop(KnickKnacksBlockRegistry.END_SANDSTONE.getId().getPath(), blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE), blockEndLoc(KnickKnacksBlockRegistry.END_SANDSTONE, "bottom"), blockEndLoc(KnickKnacksBlockRegistry.SMOOTH_END_SANDSTONE)));
        /**simpleBlock(KnickKnacksBlockRegistry.DARK_PURPUR.get());
        slabBlock(KnickKnacksBlockRegistry.DARK_PURPUR_SLAB.get(), blockLoc(KnickKnacksBlockRegistry.DARK_PURPUR), blockLoc(KnickKnacksBlockRegistry.DARK_PURPUR));
        stairsBlock(KnickKnacksBlockRegistry.DARK_PURPUR_STAIRS.get(), blockLoc(KnickKnacksBlockRegistry.DARK_PURPUR));
        wallBlock(KnickKnacksBlockRegistry.DARK_PURPUR_WALL, blockLoc(KnickKnacksBlockRegistry.DARK_PURPUR));

        simpleBlock(KnickKnacksBlockRegistry.COBBLED_DARK_PURPUR.get());
        slabBlock(KnickKnacksBlockRegistry.COBBLED_DARK_PURPUR_SLAB.get(), blockLoc(KnickKnacksBlockRegistry.COBBLED_DARK_PURPUR), blockLoc(KnickKnacksBlockRegistry.COBBLED_DARK_PURPUR));
        stairsBlock(KnickKnacksBlockRegistry.COBBLED_DARK_PURPUR_STAIRS.get(), blockLoc(KnickKnacksBlockRegistry.COBBLED_DARK_PURPUR));
        wallBlock(KnickKnacksBlockRegistry.COBBLED_DARK_PURPUR_WALL, blockLoc(KnickKnacksBlockRegistry.COBBLED_DARK_PURPUR));

        simpleBlock(KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR.get());
        slabBlock(KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR_SLAB.get(), blockLoc(KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR), blockLoc(KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR));
        stairsBlock(KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR_STAIRS.get(), blockLoc(KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR));
        wallBlock(KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR_WALL, blockLoc(KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR));

        simpleBlock(KnickKnacksBlockRegistry.DARK_PURPUR_BRICKS.get());
        slabBlock(KnickKnacksBlockRegistry.DARK_PURPUR_BRICK_SLAB.get(), blockLoc(KnickKnacksBlockRegistry.DARK_PURPUR_BRICKS), blockLoc(KnickKnacksBlockRegistry.DARK_PURPUR_BRICKS));
        stairsBlock(KnickKnacksBlockRegistry.DARK_PURPUR_BRICK_STAIRS.get(), blockLoc(KnickKnacksBlockRegistry.DARK_PURPUR_BRICKS));
        wallBlock(KnickKnacksBlockRegistry.DARK_PURPUR_BRICK_WALL, blockLoc(KnickKnacksBlockRegistry.DARK_PURPUR_BRICKS));

        simpleBlock(KnickKnacksBlockRegistry.DARK_PURPUR_COAL_ORE.get());
        simpleBlock(KnickKnacksBlockRegistry.DARK_PURPUR_IRON_ORE.get());
        simpleBlock(KnickKnacksBlockRegistry.DARK_PURPUR_COPPER_ORE.get());
        simpleBlock(KnickKnacksBlockRegistry.DARK_PURPUR_GOLD_ORE.get());
        simpleBlock(KnickKnacksBlockRegistry.DARK_PURPUR_REDSTONE_ORE.get());
        simpleBlock(KnickKnacksBlockRegistry.DARK_PURPUR_EMERALD_ORE.get());
        simpleBlock(KnickKnacksBlockRegistry.DARK_PURPUR_LAPIS_ORE.get());
        simpleBlock(KnickKnacksBlockRegistry.DARK_PURPUR_DIAMOND_ORE.get());

        simpleBlock(KnickKnacksBlockRegistry.SCULK_VINES.get(), models().cross(KnickKnacksBlockRegistry.SCULK_VINES.getId().getPath(), blockLoc(KnickKnacksBlockRegistry.SCULK_VINES)).renderType("cutout"));
        simpleBlock(KnickKnacksBlockRegistry.SCULK_VINES_PLANT.get(), models().cross(KnickKnacksBlockRegistry.SCULK_VINES_PLANT.getId().getPath(), blockLoc(KnickKnacksBlockRegistry.SCULK_VINES_PLANT)).renderType("cutout"));
        simpleBlock(KnickKnacksBlockRegistry.SCULK_TENDRILS.get(), models().cross(KnickKnacksBlockRegistry.SCULK_TENDRILS.getId().getPath(), blockLoc(KnickKnacksBlockRegistry.SCULK_TENDRILS)).renderType("cutout"));
        simpleBlock(KnickKnacksBlockRegistry.SCULK_TENDRILS_PLANT.get(), models().cross(KnickKnacksBlockRegistry.SCULK_TENDRILS_PLANT.getId().getPath(), blockLoc(KnickKnacksBlockRegistry.SCULK_TENDRILS_PLANT)).renderType("cutout"));

        simpleBlock(KnickKnacksBlockRegistry.PLITE_SOIL.get());
        simpleBlock(KnickKnacksBlockRegistry.SCULK_GLEAM.get());
        simpleBlock(KnickKnacksBlockRegistry.INFESTED_SCULK.get());

        simpleBlock(KnickKnacksBlockRegistry.BLOOMING_GRASS_BLOCK.get(), models().cubeBottomTop(KnickKnacksBlockRegistry.BLOOMING_GRASS_BLOCK.getId().getPath(), blockLoc(KnickKnacksBlockRegistry.BLOOMING_GRASS_BLOCK, "side"), blockLoc(KnickKnacksBlockRegistry.DARK_PURPUR), blockLoc(KnickKnacksBlockRegistry.BLOOMING_GRASS_BLOCK)));
        simpleBlock(KnickKnacksBlockRegistry.BLOOMING_SHRUB.get(), models().cross(KnickKnacksBlockRegistry.BLOOMING_SHRUB.getId().getPath(), blockLoc(KnickKnacksBlockRegistry.BLOOMING_SHRUB)).renderType("cutout"));
        ConfiguredModel[] berryBushModels = { new ConfiguredModel(models().cross(KnickKnacksBlockRegistry.BLOOM_BERRY_BUSH.getId().getPath() + "_stage0", blockLoc(KnickKnacksBlockRegistry.BLOOM_BERRY_BUSH, "stage0")).renderType("cutout")), new ConfiguredModel(models().cross(KnickKnacksBlockRegistry.BLOOM_BERRY_BUSH.getId().getPath() + "_stage1", blockLoc(KnickKnacksBlockRegistry.BLOOM_BERRY_BUSH, "stage1")).renderType("cutout")), new ConfiguredModel(models().cross(KnickKnacksBlockRegistry.BLOOM_BERRY_BUSH.getId().getPath() + "_stage2", blockLoc(KnickKnacksBlockRegistry.BLOOM_BERRY_BUSH, "stage2")).renderType("cutout")), new ConfiguredModel(models().cross(KnickKnacksBlockRegistry.BLOOM_BERRY_BUSH.getId().getPath() + "_stage3", blockLoc(KnickKnacksBlockRegistry.BLOOM_BERRY_BUSH, "stage3")).renderType("cutout")) };
        getVariantBuilder(KnickKnacksBlockRegistry.BLOOM_BERRY_BUSH.get()).partialState().with(BloomBerryBushBlock.AGE, 0).setModels(berryBushModels[0]).partialState().with(BloomBerryBushBlock.AGE, 1).setModels(berryBushModels[1]).partialState().with(BloomBerryBushBlock.AGE, 2).setModels(berryBushModels[2]).partialState().with(BloomBerryBushBlock.AGE, 3).setModels(berryBushModels[3]);

        simpleBlock(KnickKnacksBlockRegistry.GLOOM_SCULK.get());
        simpleBlock(KnickKnacksBlockRegistry.GLOOMSLATE.get());
        slabBlock(KnickKnacksBlockRegistry.GLOOMSLATE_SLAB.get(), blockLoc(KnickKnacksBlockRegistry.GLOOMSLATE), blockLoc(KnickKnacksBlockRegistry.GLOOMSLATE));
        stairsBlock(KnickKnacksBlockRegistry.GLOOMSLATE_STAIRS.get(), blockLoc(KnickKnacksBlockRegistry.GLOOMSLATE));
        wallBlock(KnickKnacksBlockRegistry.GLOOMSLATE_WALL, blockLoc(KnickKnacksBlockRegistry.GLOOMSLATE));
        simpleBlock(KnickKnacksBlockRegistry.GEYSER.get(), models().cubeTop(KnickKnacksBlockRegistry.GEYSER.getId().getPath(), blockLoc(KnickKnacksBlockRegistry.GLOOM_SCULK), blockLoc(KnickKnacksBlockRegistry.GEYSER)));
        simpleBlock(KnickKnacksBlockRegistry.CRYSTALLIZED_AMBER.get(), models().withExistingParent(KnickKnacksBlockRegistry.CRYSTALLIZED_AMBER.getId().getPath(), mcLoc("block/honey_block")).texture("particle", blockLoc(KnickKnacksBlockRegistry.CRYSTALLIZED_AMBER, "inner")).texture("down", blockLoc(KnickKnacksBlockRegistry.CRYSTALLIZED_AMBER, "outer")).texture("up", blockLoc(KnickKnacksBlockRegistry.CRYSTALLIZED_AMBER, "inner")).texture("side", blockLoc(KnickKnacksBlockRegistry.CRYSTALLIZED_AMBER, "inner")).renderType("transparent"));
        simpleBlock(KnickKnacksBlockRegistry.GLOOM_CACTUS.get(), models().withExistingParent(KnickKnacksBlockRegistry.GLOOM_CACTUS.getId().getPath(), modLoc("block/cube_cactus")).texture("side", blockLoc(KnickKnacksBlockRegistry.GLOOM_CACTUS, "side")).texture("top", blockLoc(KnickKnacksBlockRegistry.GLOOM_CACTUS, "top")));
        simpleBlock(KnickKnacksBlockRegistry.GLOOMY_GRASS.get(), models().cross(KnickKnacksBlockRegistry.GLOOMY_GRASS.getId().getPath(), blockLoc(KnickKnacksBlockRegistry.GLOOMY_GRASS)).renderType("cutout"));

        ConfiguredModel[] sculkJawModels = { new ConfiguredModel(models().cubeAll(KnickKnacksBlockRegistry.SCULK_JAW.getId().getPath() + "_activated", blockLoc(KnickKnacksBlockRegistry.SCULK_JAW, "activated"))), new ConfiguredModel(models().cubeAll(KnickKnacksBlockRegistry.SCULK_JAW.getId().getPath(), blockLoc(KnickKnacksBlockRegistry.SCULK_JAW))) };
        getVariantBuilder(KnickKnacksBlockRegistry.SCULK_JAW.get()).partialState().with(SculkJawBlock.ACTIVATED, true).setModels(sculkJawModels[0]).partialState().with(SculkJawBlock.ACTIVATED, false).setModels(sculkJawModels[1]);

        simpleBlock(KnickKnacksBlockRegistry.ANCIENT_VASE.get(), models().withExistingParent(KnickKnacksBlockRegistry.ANCIENT_VASE.getId().getPath(), modLoc("block/vase")).texture("vase", blockLoc(KnickKnacksBlockRegistry.ANCIENT_VASE)));
    **/}

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
