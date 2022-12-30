package com.squizzle_dizzle.knick_knacks;

import com.squizzle_dizzle.knick_knacks.client.render.FallingUpBlockRenderer;
import com.squizzle_dizzle.knick_knacks.common.registry.KnickKnacksEntityRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = KnickKnacks.MOD_ID, value = Dist.CLIENT)
public class ClientProxy extends CommonProxy {

    public void init() {

    }

    public void clientInit() {
        EntityRenderers.register(KnickKnacksEntityRegistry.FALLING_UP_BLOCK.get(), FallingUpBlockRenderer::new);
    }

    public Player getClientSidePlayer() {
        return Minecraft.getInstance().player;
    }

    public void setupParticles() {
        KnickKnacks.LOGGER.debug("Registered particle factories");
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public void onRegisterEntityRenders(EntityRenderersEvent.RegisterLayerDefinitions event) {
    }
}
