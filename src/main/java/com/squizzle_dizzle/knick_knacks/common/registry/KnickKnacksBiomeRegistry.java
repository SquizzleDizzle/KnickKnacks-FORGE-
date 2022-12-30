package com.squizzle_dizzle.knick_knacks.common.registry;

import com.squizzle_dizzle.knick_knacks.KnickKnacks;
import com.squizzle_dizzle.knick_knacks.common.world.biome.EndBulbDesertBiome;
import com.squizzle_dizzle.knick_knacks.common.world.biome.EndFrozenIslandsBiome;
import com.squizzle_dizzle.knick_knacks.common.world.biome.EndPliteForestBiome;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.yeoxuhang.biomeapireforged.fabric.api.biome.TheEndBiomes;

import java.util.function.Supplier;

public class KnickKnacksBiomeRegistry {
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, KnickKnacks.MOD_ID);

    public static final ResourceKey<Biome> PLITE_FOREST = add("plite_forest", EndPliteForestBiome::make);
    public static final ResourceKey<Biome> BULB_DESERT = add("bulb_desert", EndBulbDesertBiome::make);
    public static final ResourceKey<Biome> FROZEN_ISLANDS = add("frozen_islands", EndFrozenIslandsBiome::make);

    public static void generateBiomes() {
        TheEndBiomes.addHighlandsBiome(KnickKnacksBiomeRegistry.PLITE_FOREST, 5);
        TheEndBiomes.addMainIslandBiome(KnickKnacksBiomeRegistry.BULB_DESERT, 2);
        TheEndBiomes.addSmallIslandsBiome(KnickKnacksBiomeRegistry.FROZEN_ISLANDS, 2);
    }

    private static ResourceKey<Biome> add(String name, Supplier<Biome> biome) {
        ResourceLocation id = new ResourceLocation(KnickKnacks.MOD_ID, name);
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, id);
        BIOMES.register(name, biome);
        return key;
    }
}
