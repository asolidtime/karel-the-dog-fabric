package net.asolidtime.programmingproject;

import net.asolidtime.programmingproject.items.KarelEggItem;
import net.asolidtime.programmingproject.items.KareliumIngotItem;
import net.asolidtime.programmingproject.items.KareliumOreBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
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

public class FinalProgrammingProjectMod implements ModInitializer {
	public static final KareliumIngotItem KAREL_INGOT_ITEM = new KareliumIngotItem(new FabricItemSettings().group(ItemGroup.MISC));
	public static final KarelEggItem KAREL_EGG_ITEM = new KarelEggItem(new FabricItemSettings().group(ItemGroup.MISC));
	public static final KareliumOreBlock KAREL_ORE_BLOCK = new KareliumOreBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f));
	private static final ConfiguredFeature<?, ?> KAREL_ORE_OVERWORLD = Feature.ORE
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
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.ITEM, new Identifier("programmingproject", "karel_egg"), KAREL_EGG_ITEM);
		Registry.register(Registry.ITEM, new Identifier("programmingproject", "karelium_ingot"), KAREL_INGOT_ITEM);
		Registry.register(Registry.BLOCK, new Identifier("programmingproject", "karelium_ore"), KAREL_ORE_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("programmingproject", "karelium_ore"), new BlockItem(KAREL_ORE_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
		RegistryKey<ConfiguredFeature<?, ?>> oreWoolOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("programmingproject", "ore_wool_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreWoolOverworld.getValue(), KAREL_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreWoolOverworld);
		System.out.println("(Karel) The Karel mod has been initialized, your game now has Karels!");
	}
}
