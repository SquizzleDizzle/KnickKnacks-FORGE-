package com.squizzle_dizzle.knick_knacks.common.datagen;

import com.squizzle_dizzle.knick_knacks.common.registry.KnickKnacksEntityRegistry;
import net.minecraft.data.loot.EntityLoot;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.registries.RegistryObject;
public class KnickKnacksEntityLootTables extends EntityLoot {
    @Override
    protected void addTables() {
    }

    @Override
    protected Iterable<EntityType<?>> getKnownEntities() {
        return KnickKnacksEntityRegistry.ENTITY.getEntries().stream().flatMap(RegistryObject::stream)::iterator;
    }
}
