package com.squizzle_dizzle.knick_knacks.common.registry;

import com.squizzle_dizzle.knick_knacks.KnickKnacks;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KnickKnacksFluidRegistry {
    public static final DeferredRegister<Fluid> FLUID =
            DeferredRegister.create(ForgeRegistries.FLUIDS, KnickKnacks.MOD_ID);

    public static final RegistryObject<FlowingFluid> ACID_FLUID = FLUID.register("acid_fluid",
            () -> new ForgeFlowingFluid.Source(KnickKnacksFluidRegistry.ACID_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_ACID_FLUID = FLUID.register("flowing_acid_fluid",
            () -> new ForgeFlowingFluid.Flowing(KnickKnacksFluidRegistry.ACID_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties ACID_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            KnickKnacksFluidTypeRegistry.ACID_FLUID_TYPE, ACID_FLUID, FLOWING_ACID_FLUID)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(KnickKnacksBlockRegistry.ACID_FLUID)
            .bucket(KnickKnacksItemRegistry.ACID_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUID.register(eventBus);
    }
}
