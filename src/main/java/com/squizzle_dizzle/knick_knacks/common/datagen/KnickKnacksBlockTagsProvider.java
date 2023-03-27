package com.squizzle_dizzle.knick_knacks.common.datagen;

import com.squizzle_dizzle.knick_knacks.common.registry.KnickKnacksBlockRegistry;
import com.squizzle_dizzle.knick_knacks.common.registry.KnickKnacksTagRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.squizzle_dizzle.knick_knacks.KnickKnacks.MOD_ID;

public class KnickKnacksBlockTagsProvider extends BlockTagsProvider {
    public KnickKnacksBlockTagsProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, MOD_ID, exFileHelper);
    }

    protected void addTags() {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                KnickKnacksBlockRegistry.END_STONE_SLAB.get(),
                KnickKnacksBlockRegistry.END_STONE_STAIRS.get(),
                KnickKnacksBlockRegistry.END_STONE_WALL.get());
        KnickKnacksBlockRegistry.POLISHED_END_STONE.get();
        KnickKnacksBlockRegistry.POLISHED_END_STONE_SLAB.get();
        KnickKnacksBlockRegistry.POLISHED_END_STONE_STAIRS.get();
        KnickKnacksBlockRegistry.POLISHED_END_STONE_WALL.get();
        KnickKnacksBlockRegistry.CHISELED_END_STONE.get();
        KnickKnacksBlockRegistry.CRACKED_END_STONE_BRICKS.get();
        KnickKnacksBlockRegistry.END_STONE_PILLAR.get();
        KnickKnacksBlockRegistry.POLISHED_PURPUR.get();
        KnickKnacksBlockRegistry.POLISHED_PURPUR_SLAB.get();
        KnickKnacksBlockRegistry.POLISHED_PURPUR_STAIRS.get();
        KnickKnacksBlockRegistry.POLISHED_PURPUR_WALL.get();
        KnickKnacksBlockRegistry.CRACKED_PURPUR.get();
        KnickKnacksBlockRegistry.CHISELED_PURPUR.get();
        KnickKnacksBlockRegistry.PURPUR_WALL.get();
        KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR.get();
        KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR_SLAB.get();
        KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR_STAIRS.get();
        KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR_WALL.get();
        KnickKnacksBlockRegistry.DARK_PURPUR_BLOCK.get();
        KnickKnacksBlockRegistry.DARK_PURPUR_SLAB.get();
        KnickKnacksBlockRegistry.DARK_PURPUR_STAIRS.get();
        KnickKnacksBlockRegistry.DARK_PURPUR_WALL.get();
        KnickKnacksBlockRegistry.CRACKED_DARK_PURPUR.get();
        KnickKnacksBlockRegistry.CHISELED_DARK_PURPUR.get();
        KnickKnacksBlockRegistry.DARK_PURPUR_PILLAR.get();
        KnickKnacksBlockRegistry.END_SAND.get();
        KnickKnacksBlockRegistry.END_SANDSTONE.get();
        KnickKnacksBlockRegistry.END_SANDSTONE_WALL.get();
        KnickKnacksBlockRegistry.END_SANDSTONE_SLAB.get();
        KnickKnacksBlockRegistry.END_SANDSTONE_STAIRS.get();
        KnickKnacksBlockRegistry.CUT_END_SANDSTONE.get();
        KnickKnacksBlockRegistry.CUT_END_SANDSTONE_WALL.get();
        KnickKnacksBlockRegistry.CUT_END_SANDSTONE_SLAB.get();
        KnickKnacksBlockRegistry.CUT_END_SANDSTONE_STAIRS.get();
        KnickKnacksBlockRegistry.SMOOTH_END_SANDSTONE.get();
        KnickKnacksBlockRegistry.SMOOTH_END_SANDSTONE_WALL.get();
        KnickKnacksBlockRegistry.SMOOTH_END_SANDSTONE_SLAB.get();
        KnickKnacksBlockRegistry.SMOOTH_END_SANDSTONE_STAIRS.get();
        KnickKnacksBlockRegistry.END_SANDSTONE_BRICKS.get();
        KnickKnacksBlockRegistry.END_SANDSTONE_BRICK_WALL.get();
        KnickKnacksBlockRegistry.END_SANDSTONE_BRICK_SLAB.get();
        KnickKnacksBlockRegistry.END_SANDSTONE_BRICK_STAIRS.get();
        KnickKnacksBlockRegistry.CRACKED_END_SANDSTONE_BRICKS.get();
        KnickKnacksBlockRegistry.CHISELED_END_SANDSTONE.get();
        KnickKnacksBlockRegistry.END_SANDSTONE_PILLAR.get();
        KnickKnacksBlockRegistry.MOON_STONE.get();
        KnickKnacksBlockRegistry.MOON_STONE_WALL.get();
        KnickKnacksBlockRegistry.MOON_STONE_SLAB.get();
        KnickKnacksBlockRegistry.MOON_STONE_STAIRS.get();
        KnickKnacksBlockRegistry.CIRCLE_STONE.get();
        KnickKnacksBlockRegistry.CIRCLE_STONE_WALL.get();
        KnickKnacksBlockRegistry.CIRCLE_STONE_SLAB.get();
        KnickKnacksBlockRegistry.CIRCLE_STONE_STAIRS.get();
        KnickKnacksBlockRegistry.SCRATCH_STONE.get();
        KnickKnacksBlockRegistry.SCRATCH_STONE_WALL.get();
        KnickKnacksBlockRegistry.SCRATCH_STONE_SLAB.get();
        KnickKnacksBlockRegistry.SCRATCH_STONE_STAIRS.get();
        KnickKnacksBlockRegistry.POLISHED_MOON_STONE.get();
        KnickKnacksBlockRegistry.POLISHED_MOON_STONE_WALL.get();
        KnickKnacksBlockRegistry.POLISHED_MOON_STONE_SLAB.get();
        KnickKnacksBlockRegistry.POLISHED_MOON_STONE_STAIRS.get();
        KnickKnacksBlockRegistry.POLISHED_CIRCLE_STONE.get();
        KnickKnacksBlockRegistry.POLISHED_CIRCLE_STONE_WALL.get();
        KnickKnacksBlockRegistry.POLISHED_CIRCLE_STONE_SLAB.get();
        KnickKnacksBlockRegistry.POLISHED_CIRCLE_STONE_STAIRS.get();
        KnickKnacksBlockRegistry.POLISHED_SCRATCH_STONE.get();
        KnickKnacksBlockRegistry.POLISHED_SCRATCH_STONE_WALL.get();
        KnickKnacksBlockRegistry.POLISHED_SCRATCH_STONE_SLAB.get();
        KnickKnacksBlockRegistry.POLISHED_SCRATCH_STONE_STAIRS.get();
        KnickKnacksBlockRegistry.MOON_STONE_BRICKS.get();
        KnickKnacksBlockRegistry.MOON_STONE_BRICK_WALL.get();
        KnickKnacksBlockRegistry.MOON_STONE_BRICK_SLAB.get();
        KnickKnacksBlockRegistry.MOON_STONE_BRICK_STAIRS.get();
        KnickKnacksBlockRegistry.CIRCLE_STONE_BRICKS.get();
        KnickKnacksBlockRegistry.CIRCLE_STONE_BRICK_WALL.get();
        KnickKnacksBlockRegistry.CIRCLE_STONE_BRICK_SLAB.get();
        KnickKnacksBlockRegistry.CIRCLE_STONE_BRICK_STAIRS.get();
        KnickKnacksBlockRegistry.SCRATCH_STONE_BRICKS.get();
        KnickKnacksBlockRegistry.SCRATCH_STONE_BRICK_WALL.get();
        KnickKnacksBlockRegistry.SCRATCH_STONE_BRICK_SLAB.get();
        KnickKnacksBlockRegistry.SCRATCH_STONE_BRICK_STAIRS.get();
        KnickKnacksBlockRegistry.CRACKED_MOON_STONE_BRICKS.get();
        KnickKnacksBlockRegistry.CRACKED_CIRCLE_STONE_BRICKS.get();
        KnickKnacksBlockRegistry.CRACKED_SCRATCH_STONE_BRICKS.get();
        KnickKnacksBlockRegistry.CHISELED_MOON_STONE.get();
        KnickKnacksBlockRegistry.CHISELED_CIRCLE_STONE.get();
        KnickKnacksBlockRegistry.CHISELED_SCRATCH_STONE.get();
        KnickKnacksBlockRegistry.MOON_STONE_PILLAR.get();
        KnickKnacksBlockRegistry.CIRCLE_STONE_PILLAR.get();
        KnickKnacksBlockRegistry.SCRATCH_STONE_PILLAR.get();
        KnickKnacksBlockRegistry.ERST_BLOCK.get();
        KnickKnacksBlockRegistry.FROZEN_ENDSTONE.get();
        KnickKnacksBlockRegistry.OBSIDIAN_EMBEDDED_ENDSTONE.get();
        KnickKnacksBlockRegistry.LARIMAR_BLOCK.get();
        KnickKnacksBlockRegistry.END_ICE.get();
        KnickKnacksBlockRegistry.PACKED_END_ICE.get();
        KnickKnacksBlockRegistry.GREEN_ICE.get();

        this.tag(KnickKnacksTagRegistry.Blocks.END_GRASS_PLACEABLE).add(
                Blocks.END_STONE,
                KnickKnacksBlockRegistry.END_SAND.get(),
                KnickKnacksBlockRegistry.ERST_BLOCK.get()
        );

        this.tag(BlockTags.WALLS).add(
                KnickKnacksBlockRegistry.END_STONE_WALL.get());

        this.tag(BlockTags.LEAVES).add(KnickKnacksBlockRegistry.PLITE_LEAVES.get());

        this.tag(KnickKnacksTagRegistry.Blocks.TRIPLE_BLOCK_DOOR).add(KnickKnacksBlockRegistry.PLITE_DOOR.get());

        //this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(
                //KnickKnacksBlockRegistry.END_SAND.get());
    }
}
