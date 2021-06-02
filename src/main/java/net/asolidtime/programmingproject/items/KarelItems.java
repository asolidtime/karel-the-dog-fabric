package net.asolidtime.programmingproject.items;

import net.asolidtime.programmingproject.FinalProgrammingProjectMod;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class KarelItems {
    public static void registerItems() {
        // add items and ConfiguredFeatures
        final Item KAREL_INGOT_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));
        final KarelEggItem KAREL_EGG_ITEM = new KarelEggItem(FinalProgrammingProjectMod.KAREL, 0xfcfc00, 0xfc9700, new Item.Settings().group(ItemGroup.MISC));
        final Block KAREL_ORE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
        final Block KAREL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
        final ConfiguredFeature<?, ?> KAREL_ORE_OVERWORLD = Feature.ORE
                .configure(new OreFeatureConfig(
                        OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                        KAREL_ORE_BLOCK.getDefaultState(),
                        9)) // vein size
                .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                        0,
                        12,
                        70)))
                .spreadHorizontally()
                .repeat(30); // number of veins per chunk
        Registry.register(Registry.ITEM, new Identifier(FinalProgrammingProjectMod.MOD_ID, "karel_egg"), KAREL_EGG_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(FinalProgrammingProjectMod.MOD_ID, "karelium_block"), KAREL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(FinalProgrammingProjectMod.MOD_ID, "karelium_block"), new BlockItem(KAREL_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(FinalProgrammingProjectMod.MOD_ID, "karelium_ingot"), KAREL_INGOT_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(FinalProgrammingProjectMod.MOD_ID, "karelium_ore"), KAREL_ORE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(FinalProgrammingProjectMod.MOD_ID, "karelium_ore"), new BlockItem(KAREL_ORE_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
        RegistryKey<ConfiguredFeature<?, ?>> karelOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(FinalProgrammingProjectMod.MOD_ID, "ore_wool_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, karelOreOverworld.getValue(), KAREL_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, karelOreOverworld);
    }

}
