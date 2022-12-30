package com.squizzle_dizzle.knick_knacks.common.registry;

import com.squizzle_dizzle.knick_knacks.KnickKnacks;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

public class KnickKnacksTagRegistry {
    public static class Biomes {
        public static final TagKey<Biome> HAS_PRISMARINE_CRYSTAL
                = biomeTag("has_prismarine_crystal");
        private static TagKey<Biome> biomeTag(String name) {
            return TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(KnickKnacks.MOD_ID, name));
        }

    }

    public static class Blocks {
        public static final TagKey<Block> END_GRASS_PLACEABLE
                = blockTag("end_grass_placeable");

        public static final TagKey<Block> TRIPLE_BLOCK_DOOR
                = blockTag("end_grass_placeable");
        private static TagKey<Block> blockTag(String name) {
            return TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(KnickKnacks.MOD_ID, name));
        }
    }
}