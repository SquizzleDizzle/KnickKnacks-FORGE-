package com.squizzle_dizzle.knick_knacks;

import com.squizzle_dizzle.knick_knacks.common.registry.KnickKnacksBlockRegistry;
import com.squizzle_dizzle.knick_knacks.common.registry.KnickKnacksEntityRegistry;
import com.squizzle_dizzle.knick_knacks.common.registry.KnickKnacksItemRegistry;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.squizzle_dizzle.knick_knacks.KnickKnacks.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonProxy {

    public void init() {

    }

    public void clientInit() {
    }
    public Player getClientSidePlayer() {
        return null;
    }


    public void setupParticles() {
    }
}
