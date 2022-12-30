package com.squizzle_dizzle.knick_knacks.common.registry;

import com.squizzle_dizzle.knick_knacks.KnickKnacks;
import com.squizzle_dizzle.knick_knacks.common.block.entity.FallingUpBlockEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KnickKnacksEntityRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITY =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, KnickKnacks.MOD_ID);

    public static final RegistryObject<EntityType<FallingUpBlockEntity>> FALLING_UP_BLOCK = ENTITY.register("falling_up_block",
            () -> EntityType.Builder.of(FallingUpBlockEntity::new, MobCategory.MISC)
                    .sized(0.98F, 0.98F)
                    .clientTrackingRange(10)
                    .updateInterval(20)
                    .build(new ResourceLocation(KnickKnacks.MOD_ID, "falling_up_block").toString()));
    public static void register(IEventBus eventBus) {
        ENTITY.register(eventBus);
    }
}
