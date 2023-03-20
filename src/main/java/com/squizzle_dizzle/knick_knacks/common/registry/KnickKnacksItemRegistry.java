package com.squizzle_dizzle.knick_knacks.common.registry;

import com.squizzle_dizzle.knick_knacks.KnickKnacks;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KnickKnacksItemRegistry {


    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KnickKnacks.MOD_ID);

    //public static final RegistryObject<Item> MOSS_WHEAT = ITEMS.register("wheat_with_moss",
      //      () -> new Item(new Item.Properties().tab(KnickKnacksTabRegistry.TAB).stacksTo(64)));

    public static final RegistryObject<Item> ACID_BUCKET = ITEMS.register("acid_bucket",
            () -> new BucketItem(KnickKnacksFluidRegistry.ACID_FLUID,
                    new Item.Properties().tab(KnickKnacksTabRegistry.TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}