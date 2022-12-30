package com.squizzle_dizzle.knick_knacks.common.registry;

import com.squizzle_dizzle.knick_knacks.KnickKnacks;
import com.squizzle_dizzle.knick_knacks.common.block.*;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.END_STONE;
import static net.minecraft.world.level.block.Blocks.PURPUR_BLOCK;

public class KnickKnacksBlockRegistry {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, KnickKnacks.MOD_ID);
    public static final RegistryObject<Block> END_STONE_STAIRS = registerBlock("end_stone_stairs",
            () -> new  StairBlock(END_STONE.defaultBlockState(), BlockBehaviour.Properties.copy(END_STONE)), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<Block> END_STONE_SLAB = registerBlock("end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND)
                    .strength(0.5f)), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<WallBlock> END_STONE_WALL = registerBlock("end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(END_STONE)), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> CRACKED_END_STONE_BRICKS = registerBlock("cracked_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).sound(SoundType.STONE)), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<Block> END_STONE_PILLAR = registerBlock("end_stone_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_MAGENTA).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> CHISELED_END_STONE = registerBlock("chiseled_end_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(3f).sound(SoundType.STONE)), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> POLISHED_END_STONE = registerBlock("polished_end_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).sound(SoundType.STONE)), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> POLISHED_END_STONE_STAIRS = registerBlock("polished_end_stone_stairs",
            () -> new  StairBlock(POLISHED_END_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(POLISHED_END_STONE.get())), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> POLISHED_END_STONE_SLAB = registerBlock("polished_end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND)
                    .strength(0.5f)), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<WallBlock> POLISHED_END_STONE_WALL = registerBlock("polished_end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(POLISHED_END_STONE.get())), KnickKnacksTabRegistry.TAB);


    public static final RegistryObject<Block> DARK_PURPUR_BLOCK = registerBlock("dark_purpur_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(3f).sound(SoundType.STONE)), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<Block> DARK_PURPUR_STAIRS = registerBlock("dark_purpur_stairs",
            () -> new  StairBlock(DARK_PURPUR_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(DARK_PURPUR_BLOCK.get())), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> DARK_PURPUR_SLAB = registerBlock("dark_purpur_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND)
                    .strength(0.5f)), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<WallBlock> DARK_PURPUR_WALL = registerBlock("dark_purpur_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(DARK_PURPUR_BLOCK.get())), KnickKnacksTabRegistry.TAB);
    
    public static final RegistryObject<Block> CRACKED_DARK_PURPUR = registerBlock("cracked_dark_purpur",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).sound(SoundType.STONE)), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<Block> DARK_PURPUR_PILLAR = registerBlock("dark_purpur_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_MAGENTA).requiresCorrectToolForDrops().strength(1.5F, 6.0F)), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> CHISELED_DARK_PURPUR = registerBlock("chiseled_dark_purpur",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(3f).sound(SoundType.STONE)), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> POLISHED_DARK_PURPUR = registerBlock("polished_dark_purpur",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).sound(SoundType.STONE)), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> POLISHED_DARK_PURPUR_STAIRS = registerBlock("polished_dark_purpur_stairs",
            () -> new  StairBlock(POLISHED_DARK_PURPUR.get().defaultBlockState(), BlockBehaviour.Properties.copy(POLISHED_DARK_PURPUR.get())), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> POLISHED_DARK_PURPUR_SLAB = registerBlock("polished_dark_purpur_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND)
                    .strength(0.5f)), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<WallBlock> POLISHED_DARK_PURPUR_WALL = registerBlock("polished_dark_purpur_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(POLISHED_DARK_PURPUR.get())), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<WallBlock> PURPUR_WALL = registerBlock("purpur_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(PURPUR_BLOCK)), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> CRACKED_PURPUR = registerBlock("cracked_purpur",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).sound(SoundType.STONE)), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<Block> CHISELED_PURPUR = registerBlock("chiseled_purpur",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(3f).sound(SoundType.STONE)), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<Block> POLISHED_PURPUR = registerBlock("polished_purpur",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).sound(SoundType.STONE)), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> POLISHED_PURPUR_STAIRS = registerBlock("polished_purpur_stairs",
            () -> new  StairBlock(POLISHED_PURPUR.get().defaultBlockState(), BlockBehaviour.Properties.copy(POLISHED_PURPUR.get())), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> POLISHED_PURPUR_SLAB = registerBlock("polished_purpur_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND)
                    .strength(0.5f)), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<WallBlock> POLISHED_PURPUR_WALL = registerBlock("polished_purpur_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(POLISHED_PURPUR.get())), KnickKnacksTabRegistry.TAB);



    public static final RegistryObject<Block> END_SAND = registerBlock("end_sand",
            () -> new EndSandBlock(14406560, BlockBehaviour.Properties.of(Material.SAND)
                    .strength(3f).sound(SoundType.SAND)), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> END_SANDSTONE = registerBlock("end_sandstone",
            () -> new EndSandStoneBlock(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(3f).sound(SoundType.STONE)), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<Block> END_SANDSTONE_STAIRS = registerBlock("end_sandstone_stairs",
            () -> new  StairBlock(END_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(END_SANDSTONE.get())), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> END_SANDSTONE_SLAB = registerBlock("end_sandstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND)
                    .strength(0.5f)), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<WallBlock> END_SANDSTONE_WALL = registerBlock("end_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(END_SANDSTONE.get())), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<Block> CHISELED_END_SANDSTONE = registerBlock("chiseled_end_sandstone",
            () -> new EndSandStoneBlock(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(3f).sound(SoundType.STONE)), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<Block> SMOOTH_END_SANDSTONE = registerBlock("smooth_end_sandstone",
            () -> new EndSandStoneBlock(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(3f).sound(SoundType.STONE)), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<Block> CUT_SANDSTONE = registerBlock("cut_sandstone",
            () -> new EndSandStoneBlock(BlockBehaviour.Properties.of(Material.ICE)
                    .strength(3f).sound(SoundType.STONE)), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> SMALL_CHORUS_FLOWER = registerBlock("small_chorus_flower",
            () -> new TallEndGrassBlock(14, 1,BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> ERST = registerBlock("erst",
            () -> new TallEndGrassBlock(14, 1,BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> PONT = registerBlock("pont",
            () -> new TallEndGrassBlock(14, 1,BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> TALL_ERST = registerBlock("tall_erst",
            () -> new DoubleEndPlantBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> TALL_PONT = registerBlock("tall_pont",
            () -> new DoubleEndPlantBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)), KnickKnacksTabRegistry.TAB);


    public static final RegistryObject<Block> ERST_BLOCK = registerBlock("erst_block",
            () -> new EndSandStoneBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .strength(3f).sound(SoundType.STONE)), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> FROZEN_ENDSTONE = registerBlock("frozen_end_stone",
            () -> new EndSandStoneBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .strength(3f).sound(SoundType.STONE)), KnickKnacksTabRegistry.TAB);


    public static final RegistryObject<Block> END_ICE = registerBlock("end_ice",
            () -> new HalfTransparentBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .strength(3f).sound(SoundType.STONE).friction(0.989F)), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> GREEN_ICE = registerBlock("green_ice",
            () -> new HalfTransparentBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .strength(3f).sound(SoundType.STONE).friction(0.989F)), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<Block> PACKED_END_ICE = registerBlock("packed_end_ice",
            () -> new HalfTransparentBlock(BlockBehaviour.Properties.of(Material.GRASS)
                    .strength(3f).sound(SoundType.STONE).friction(0.989F)), KnickKnacksTabRegistry.TAB);


    public static final RegistryObject<Block> PLITE_PLANKS = registerBlock("plite_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
        public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
        public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 20; }
        public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 5; }
    }, KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<RotatedPillarBlock> PLITE_LOG = registerBlock("plite_log", () -> new PliteBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_PLITE_LOG = registerBlock("stripped_plite_log", () -> new PliteBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<RotatedPillarBlock> PLITE_WOOD = registerBlock("plite_wood", () -> new PliteBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_PLITE_WOOD = registerBlock("stripped_plite_wood", () -> new PliteBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<LeavesBlock> PLITE_LEAVES = registerBlock("plite_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
        public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
        public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
        public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
        protected boolean decaying(@NotNull BlockState state) { return state.getValue(DISTANCE) == 16; }
    }, KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<SlabBlock> PLITE_SLAB = registerBlock("plite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(PLITE_PLANKS.get())), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<FenceBlock> PLITE_FENCE = registerBlock("plite_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(PLITE_PLANKS.get())), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<StairBlock> PLITE_STAIRS = registerBlock("plite_stairs", () -> new StairBlock(PLITE_PLANKS.get()::defaultBlockState, BlockBehaviour.Properties.copy(PLITE_PLANKS.get())), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<ButtonBlock> PLITE_BUTTON = registerBlock("plite_button", () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<PressurePlateBlock> PLITE_PRESSURE_PLATE = registerBlock("plite_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<TripleBlockDoorBlock> PLITE_DOOR = registerBlock("plite_door", () -> new TripleBlockDoorBlock(Blocks.IRON_DOOR), KnickKnacksTabRegistry.TAB);
    public static final RegistryObject<TrapDoorBlock> PLITE_TRAPDOOR = registerBlock("plite_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)), KnickKnacksTabRegistry.TAB);

    public static final RegistryObject<FenceGateBlock> PLITE_FENCE_GATE = registerBlock("plite_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(PLITE_PLANKS.get())), KnickKnacksTabRegistry.TAB);


    public static final RegistryObject<Block> PLITE_SAPLING = registerBlock("plite_sapling",
            () -> new Block(BlockBehaviour.Properties.of(Material.GRASS)
                    .strength(3f).sound(SoundType.GRASS)), KnickKnacksTabRegistry.TAB);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return KnickKnacksItemRegistry.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}