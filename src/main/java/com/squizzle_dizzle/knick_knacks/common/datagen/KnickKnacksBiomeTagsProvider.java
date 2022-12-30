package com.squizzle_dizzle.knick_knacks.common.datagen;

import com.squizzle_dizzle.knick_knacks.common.registry.KnickKnacksBiomeRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.tags.BiomeTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.squizzle_dizzle.knick_knacks.KnickKnacks.MOD_ID;

public class KnickKnacksBiomeTagsProvider extends BiomeTagsProvider {
    public KnickKnacksBiomeTagsProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, MOD_ID, exFileHelper);
    }

    protected void addTags() {
        this.tag(BiomeTags.HAS_END_CITY).add(KnickKnacksBiomeRegistry.PLITE_FOREST, KnickKnacksBiomeRegistry.BULB_DESERT, KnickKnacksBiomeRegistry.FROZEN_ISLANDS);
        this.tag(BiomeTags.IS_END).add(KnickKnacksBiomeRegistry.PLITE_FOREST, KnickKnacksBiomeRegistry.FROZEN_ISLANDS, KnickKnacksBiomeRegistry.BULB_DESERT);
        this.tag(Tags.Biomes.IS_COLD_END).add(KnickKnacksBiomeRegistry.FROZEN_ISLANDS);
    }
}
