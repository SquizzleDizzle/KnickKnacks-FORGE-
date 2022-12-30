package com.squizzle_dizzle.knick_knacks.common.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class KnickKnacksTabRegistry {
    public static final CreativeModeTab TAB = new CreativeModeTab("knick_knacks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.QUARTZ);
        }
    };
}

