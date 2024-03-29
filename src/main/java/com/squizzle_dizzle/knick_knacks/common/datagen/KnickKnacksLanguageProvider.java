package com.squizzle_dizzle.knick_knacks.common.datagen;

import com.squizzle_dizzle.knick_knacks.KnickKnacks;
import com.squizzle_dizzle.knick_knacks.common.registry.KnickKnacksBlockRegistry;
import com.squizzle_dizzle.knick_knacks.common.registry.KnickKnacksItemRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

public class KnickKnacksLanguageProvider extends LanguageProvider {
    private static final String NORMAL_CHARS = " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_,;.?!/\\'";
    private static final String UPSIDE_DOWN_CHARS = " ɐqɔpǝɟbɥıظʞןɯuodbɹsʇnʌʍxʎzⱯᗺƆᗡƎℲ⅁HIſʞꞀWNOԀὉᴚS⟘∩ΛMXʎZ0ƖᄅƐㄣϛ9ㄥ86‾'؛˙¿¡/\\,";
    private final boolean upsideDown;

    public KnickKnacksLanguageProvider(DataGenerator pGenerator, String locale, boolean upsideDown) {
        super(pGenerator, KnickKnacks.MOD_ID, locale);
        this.upsideDown = upsideDown;
    }

    @Override
    protected void addTranslations() {
        KnickKnacksBlockRegistry.BLOCKS.getEntries().forEach(this::addBlock);
        //RegistryHelperImpl.MOB_EFFECTS.getEntries().forEach(this::addEffect);
        //RegistryHelperImpl.ENTITY_TYPES.getEntries().forEach(this::addEntity);
        //RegistryHelperImpl.BIOMES.getEntries().forEach(this::addBiome);
        KnickKnacksItemRegistry.ITEMS.getEntries().stream().filter(item -> !(item.get() instanceof BlockItem)).forEach(this::addItem);
        //RegistryHelperImpl.ENCHANTMENTS.getEntries().forEach(this::addEnchantment);
        add("itemGroup.knick_knacks", "Knick Knacks");
    }

    @Override
    public void add(@NotNull String key, @NotNull String value) {
        if(upsideDown) super.add(key, toUpsideDown(value));
        else super.add(key, value);
    }

    private void addBlock(RegistryObject<Block> block) {
        String key = block.getId().getPath();
        super.add("block.knick_knacks." + key, convertToName(key));
    }

    private void addEffect(RegistryObject<MobEffect> effect) {
        String key = effect.getId().getPath();
        super.add("effect.knick_knacks." + key, convertToName(key));
    }

    private void addEntity(RegistryObject<EntityType<?>> item) {
        String key = item.getId().getPath();
        super.add("entity.knick_knacks." + key, convertToName(key));
    }

    private void addBiome(RegistryObject<Biome> item) {
        String key = item.getId().getPath();
        super.add("biome.knick_knacks." + key, convertToName(key));
    }

    private void addItem(RegistryObject<Item> item) {
        String key = item.getId().getPath();
        super.add("item.knick_knacks." + key, convertToName(key));
    }

    private void addEnchantment(RegistryObject<Enchantment> item) {
        String key = item.getId().getPath();
        super.add("enchantment.knick_knacks." + key, convertToName(key));
    }

    private String convertToName(String key) {
        StringBuilder builder = new StringBuilder(key.substring(0, 1).toUpperCase() + key.substring(1));
        for(int i = 1; i < builder.length(); i++) {
            if(builder.charAt(i) == '_') {
                builder.deleteCharAt(i);
                builder.replace(i, i + 1, " " + Character.toUpperCase(builder.charAt(i)));
            }
        }

        String name = builder.toString();
        if(name.contains("Chest Boat")) name = name.substring(0, name.indexOf("Chest")) + "Boat with Chest";
        return upsideDown ? toUpsideDown(name) : name;
    }

    private static String toUpsideDown(String name) {
        StringBuilder builder = new StringBuilder();

        for(int i = name.length() - 1; i >= 0; i--) {
            if(i > 2 && name.substring(i - 3, i + 1).equals("%1$s")) {
                builder.append(name, i - 3, i + 1);
                i -= 4;
                continue;
            }

            char upsideDown = UPSIDE_DOWN_CHARS.charAt(NORMAL_CHARS.indexOf(name.charAt(i)));
            builder.append(upsideDown);
        }

        return builder.toString();
    }
}
