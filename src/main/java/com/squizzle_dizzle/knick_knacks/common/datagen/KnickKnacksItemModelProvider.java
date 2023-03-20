package com.squizzle_dizzle.knick_knacks.common.datagen;

import com.squizzle_dizzle.knick_knacks.common.registry.KnickKnacksBlockRegistry;
import com.squizzle_dizzle.knick_knacks.common.registry.KnickKnacksItemRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import static com.squizzle_dizzle.knick_knacks.KnickKnacks.MOD_ID;

public class KnickKnacksItemModelProvider extends ItemModelProvider {
   

    private final ModelFile GENERATED = getExistingFile(mcLoc("item/generated"));
    private final ModelFile HANDHELD = getExistingFile(mcLoc("item/handheld"));

    public KnickKnacksItemModelProvider(DataGenerator pGenerator, ExistingFileHelper pExistingFileHelper) {
        super(pGenerator, MOD_ID, pExistingFileHelper);
    }

    @Override
    protected void registerModels() {
        // BLOCKS
        /*blockModel(KnickKnacksBlockRegistry.ECHO_PLANKS);
        blockModel(KnickKnacksBlockRegistry.ECHO_LOG);
        blockModel(KnickKnacksBlockRegistry.STRIPPED_ECHO_LOG);
        blockModel(KnickKnacksBlockRegistry.STRIPPED_ECHO_WOOD);
        blockModel(KnickKnacksBlockRegistry.ECHO_WOOD);
        blockModel(KnickKnacksBlockRegistry.ECHO_LEAVES);
        blockModel(KnickKnacksBlockRegistry.ECHO_SLAB);
        blockModel(KnickKnacksBlockRegistry.ECHO_FENCE, "inventory");
        blockModel(KnickKnacksBlockRegistry.ECHO_STAIRS);
        blockModel(KnickKnacksBlockRegistry.ECHO_BUTTON, "inventory");
        blockModel(KnickKnacksBlockRegistry.ECHO_PRESSURE_PLATE);
        itemModel(KnickKnacksBlockRegistry.ECHO_DOOR, GENERATED);
        blockModel(KnickKnacksBlockRegistry.ECHO_TRAPDOOR, "bottom");
        blockModel(KnickKnacksBlockRegistry.ECHO_FENCE_GATE);
        itemModel(DDItems.ECHO_SIGN, GENERATED);*/
        blockModel(KnickKnacksBlockRegistry.END_STONE_SLAB);
        blockModel(KnickKnacksBlockRegistry.END_STONE_STAIRS);
        blockModel(KnickKnacksBlockRegistry.END_STONE_WALL, "inventory");
        blockModel(KnickKnacksBlockRegistry.END_STONE_PILLAR);
        blockModel(KnickKnacksBlockRegistry.CHISELED_END_STONE);
        blockModel(KnickKnacksBlockRegistry.CRACKED_END_STONE_BRICKS);
        blockModel(KnickKnacksBlockRegistry.POLISHED_END_STONE);
        blockModel(KnickKnacksBlockRegistry.POLISHED_END_STONE_SLAB);
        blockModel(KnickKnacksBlockRegistry.POLISHED_END_STONE_STAIRS);
        blockModel(KnickKnacksBlockRegistry.POLISHED_END_STONE_WALL, "inventory");

        blockModel(KnickKnacksBlockRegistry.DARK_PURPUR_BLOCK);
        blockModel(KnickKnacksBlockRegistry.DARK_PURPUR_SLAB);
        blockModel(KnickKnacksBlockRegistry.DARK_PURPUR_STAIRS);
        blockModel(KnickKnacksBlockRegistry.DARK_PURPUR_WALL, "inventory");
        blockModel(KnickKnacksBlockRegistry.DARK_PURPUR_PILLAR);
        blockModel(KnickKnacksBlockRegistry.CHISELED_DARK_PURPUR);
        blockModel(KnickKnacksBlockRegistry.CRACKED_DARK_PURPUR);
        blockModel(KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR);
        blockModel(KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR_SLAB);
        blockModel(KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR_STAIRS);
        blockModel(KnickKnacksBlockRegistry.POLISHED_DARK_PURPUR_WALL, "inventory");

        blockModel(KnickKnacksBlockRegistry.PURPUR_WALL, "inventory");
        blockModel(KnickKnacksBlockRegistry.CRACKED_PURPUR);
        blockModel(KnickKnacksBlockRegistry.CHISELED_PURPUR);
        blockModel(KnickKnacksBlockRegistry.POLISHED_PURPUR);
        blockModel(KnickKnacksBlockRegistry.POLISHED_PURPUR_SLAB);
        blockModel(KnickKnacksBlockRegistry.POLISHED_PURPUR_STAIRS);
        blockModel(KnickKnacksBlockRegistry.POLISHED_PURPUR_WALL, "inventory");

        blockModel(KnickKnacksBlockRegistry.END_SAND);
        blockModel(KnickKnacksBlockRegistry.FROZEN_ENDSTONE);
        blockModel(KnickKnacksBlockRegistry.END_SANDSTONE);


        blockItemModel(KnickKnacksBlockRegistry.ERST, HANDHELD);
        blockItemModel(KnickKnacksBlockRegistry.PONT, HANDHELD);
        blockItemModel(KnickKnacksBlockRegistry.SMALL_CHORUS_FLOWER, HANDHELD);

        blockItemModel(KnickKnacksBlockRegistry.PLITE_SAPLING, HANDHELD);

        blockModel(KnickKnacksBlockRegistry.ERST_BLOCK);

        blockModel(KnickKnacksBlockRegistry.PLITE_PLANKS);
        blockModel(KnickKnacksBlockRegistry.PLITE_LOG);
        blockModel(KnickKnacksBlockRegistry.STRIPPED_PLITE_LOG);
        blockModel(KnickKnacksBlockRegistry.STRIPPED_PLITE_WOOD);
        blockModel(KnickKnacksBlockRegistry.PLITE_WOOD);
        blockModel(KnickKnacksBlockRegistry.PLITE_LEAVES);
        blockModel(KnickKnacksBlockRegistry.PLITE_SLAB);
        blockModel(KnickKnacksBlockRegistry.PLITE_FENCE, "inventory");
        blockModel(KnickKnacksBlockRegistry.PLITE_STAIRS);
        blockModel(KnickKnacksBlockRegistry.PLITE_BUTTON, "inventory");
        blockModel(KnickKnacksBlockRegistry.PLITE_PRESSURE_PLATE);
        itemEndModel(KnickKnacksBlockRegistry.PLITE_DOOR, GENERATED);
        blockModel(KnickKnacksBlockRegistry.PLITE_TRAPDOOR, "bottom");
        blockModel(KnickKnacksBlockRegistry.PLITE_FENCE_GATE);


        itemEndModel(KnickKnacksItemRegistry.ACID_BUCKET, GENERATED);
/*blockModel(KnickKnacksBlockRegistry.COBBLED_DARK_PURPUR);
        blockModel(KnickKnacksBlockRegistry.COBBLED_DARK_PURPUR_SLAB);
        blockModel(KnickKnacksBlockRegistry.COBBLED_DARK_PURPUR_STAIRS);
        blockModel(KnickKnacksBlockRegistry.COBBLED_DARK_PURPUR_WALL, "inventory");*/

        /*blockModel(KnickKnacksBlockRegistry.DARK_PURPUR_BRICKS);
        blockModel(KnickKnacksBlockRegistry.DARK_PURPUR_BRICK_SLAB);
        blockModel(KnickKnacksBlockRegistry.DARK_PURPUR_BRICK_STAIRS);
        blockModel(KnickKnacksBlockRegistry.DARK_PURPUR_BRICK_WALL, "inventory");

        blockModel(KnickKnacksBlockRegistry.DARK_PURPUR_COAL_ORE);
        blockModel(KnickKnacksBlockRegistry.DARK_PURPUR_IRON_ORE);
        blockModel(KnickKnacksBlockRegistry.DARK_PURPUR_COPPER_ORE);
        blockModel(KnickKnacksBlockRegistry.DARK_PURPUR_GOLD_ORE);
        blockModel(KnickKnacksBlockRegistry.DARK_PURPUR_REDSTONE_ORE);
        blockModel(KnickKnacksBlockRegistry.DARK_PURPUR_EMERALD_ORE);
        blockModel(KnickKnacksBlockRegistry.DARK_PURPUR_LAPIS_ORE);
        blockModel(KnickKnacksBlockRegistry.DARK_PURPUR_DIAMOND_ORE);
        blockModel(KnickKnacksBlockRegistry.INFESTED_SCULK);*/

        /*getBuilder(KnickKnacksBlockRegistry.SCULK_VINES.getId().getPath()).parent(GENERATED).texture("layer0", "block/" + KnickKnacksBlockRegistry.SCULK_VINES_PLANT.getId().getPath());
        getBuilder(KnickKnacksBlockRegistry.SCULK_TENDRILS.getId().getPath()).parent(GENERATED).texture("layer0", "block/" + KnickKnacksBlockRegistry.SCULK_TENDRILS_PLANT.getId().getPath());

        blockModel(KnickKnacksBlockRegistry.SCULK_JAW);
        blockModel(KnickKnacksBlockRegistry.SCULK_GLEAM);
        blockModel(KnickKnacksBlockRegistry.ANCIENT_VASE);
        blockModel(KnickKnacksBlockRegistry.ECHO_SOIL);

        blockModel(KnickKnacksBlockRegistry.BLOOMING_GRASS_BLOCK);
        getBuilder(KnickKnacksBlockRegistry.BLOOMING_SHRUB.getId().getPath()).parent(GENERATED).texture("layer0", "block/" + KnickKnacksBlockRegistry.BLOOMING_SHRUB.getId().getPath());

        blockModel(KnickKnacksBlockRegistry.GLOOM_SCULK);
        blockModel(KnickKnacksBlockRegistry.GLOOMSLATE);
        blockModel(KnickKnacksBlockRegistry.GLOOMSLATE_SLAB);
        blockModel(KnickKnacksBlockRegistry.GLOOMSLATE_STAIRS);
        blockModel(KnickKnacksBlockRegistry.GLOOMSLATE_WALL, "inventory");
        blockModel(KnickKnacksBlockRegistry.GEYSER);
        blockModel(KnickKnacksBlockRegistry.CRYSTALLIZED_AMBER);
        blockModel(KnickKnacksBlockRegistry.GLOOM_CACTUS);
        getBuilder(KnickKnacksBlockRegistry.GLOOMY_GRASS.getId().getPath()).parent(GENERATED).texture("layer0", "block/" + KnickKnacksBlockRegistry.GLOOMY_GRASS.getId().getPath());
*/
        // ITEMS
        /*itemModel(DDItems.BLOOM_BERRIES, GENERATED);
        itemModel(DDItems.HEART_OF_THE_DEEP, GENERATED);
        itemModel(DDItems.REINFORCED_ECHO_SHARD, GENERATED);
        itemModel(DDItems.WARDEN_CARAPACE, GENERATED);
        itemModel(DDItems.SOUL_DUST, GENERATED);
        getBuilder(DDItems.SCULK_TRANSMITTER.getId().getPath() + "_on").parent(GENERATED).texture("layer0", "item/" + DDItems.SCULK_TRANSMITTER.getId().getPath() + "_on");

        itemModel(DDItems.WARDEN_SWORD, HANDHELD);
        itemModel(DDItems.WARDEN_HELMET, GENERATED);
        itemModel(DDItems.WARDEN_CHESTPLATE, GENERATED);
        itemModel(DDItems.WARDEN_LEGGINGS, GENERATED);
        itemModel(DDItems.WARDEN_BOOTS, GENERATED);
        itemModel(DDItems.WARDEN_SHOVEL, HANDHELD);
        itemModel(DDItems.WARDEN_PICKAXE, HANDHELD);
        itemModel(DDItems.WARDEN_AXE, HANDHELD);
        itemModel(DDItems.WARDEN_HOE, HANDHELD);

        withExistingParent(DDItems.SCULK_LEECH_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(DDItems.SCULK_SNAPPER_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(DDItems.SHATTERED_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(DDItems.SHRIEK_WORM_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(DDItems.STALKER_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(DDItems.CENTIPEDE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        itemModel(DDItems.ECHO_BOAT, GENERATED);
        itemModel(DDItems.ECHO_CHEST_BOAT, GENERATED);

        getBuilder("wanderers_notebook").parent(GENERATED).texture("layer0", "item/wanderers_notebook");*/
    }

    public void blockModel(RegistryObject<? extends Block> block) {
        withExistingParent(block.getId().getPath(), modLoc("block/" + block.getId().getPath()));
    }

    public void blockModel(RegistryObject<? extends Block> block, String suffix) {
        withExistingParent(block.getId().getPath(), modLoc("block/" + block.getId().getPath() + "_" + suffix));
    }

    public void itemEndModel(RegistryObject<?> item, ModelFile modelFile) {
        getBuilder(item.getId().getPath()).parent(modelFile).texture("layer0", "item/" + item.getId().getPath());
    }

    public void blockItemModel(RegistryObject<?> item, ModelFile modelFile) {
        getBuilder(item.getId().getPath()).parent(modelFile).texture("layer0", "block/" + item.getId().getPath());
    }

}
