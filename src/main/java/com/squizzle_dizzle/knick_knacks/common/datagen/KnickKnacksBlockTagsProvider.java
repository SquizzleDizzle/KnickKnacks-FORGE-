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
