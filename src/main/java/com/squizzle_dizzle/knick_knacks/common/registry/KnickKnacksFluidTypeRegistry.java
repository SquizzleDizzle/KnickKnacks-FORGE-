package com.squizzle_dizzle.knick_knacks.common.registry;

import com.mojang.math.Vector3f;
import com.squizzle_dizzle.knick_knacks.KnickKnacks;
import com.squizzle_dizzle.knick_knacks.common.fluid.BaseFluidType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KnickKnacksFluidTypeRegistry {
    public static final ResourceLocation ACID_STILL = new ResourceLocation(KnickKnacks.MOD_ID ,"block/acid_still");
    public static final ResourceLocation ACID_FLOW = new ResourceLocation(KnickKnacks.MOD_ID ,"block/acid_flow");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, KnickKnacks.MOD_ID);

    public static final RegistryObject<FluidType> ACID_FLUID_TYPE = register("acid_fluid_type",
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK).canSwim(false).canPushEntity(false));



    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(ACID_STILL, ACID_FLOW,
                0xA1E038D0, new Vector3f(142f / 255f, 88f / 255f, 183f / 255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
