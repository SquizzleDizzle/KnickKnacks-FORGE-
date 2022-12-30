package com.squizzle_dizzle.knick_knacks.common.datagen;

import com.squizzle_dizzle.knick_knacks.common.registry.KnickKnacksBlockRegistry;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class KnickKnacksBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        //this.dropSelf(KnickKnacksBlockRegistry.END_STONE_SLAB.get());
        //this.dropSelf(KnickKnacksBlockRegistry.END_STONE_STAIRS.get());
        //this.dropSelf(KnickKnacksBlockRegistry.END_STONE_WALL.get());

       // this.dropSelf(KnickKnacksBlockRegistry.END_SAND.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return KnickKnacksBlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
