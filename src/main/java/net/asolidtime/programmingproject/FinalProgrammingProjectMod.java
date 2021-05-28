package net.asolidtime.programmingproject;

import net.asolidtime.programmingproject.items.KareliumIngotItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FinalProgrammingProjectMod implements ModInitializer {
	public static final KareliumIngotItem KAREL_INGOT_ITEM = new KareliumIngotItem(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Block KAREL_ORE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.ITEM, new Identifier("programmingproject", "karelium_ingot"), KAREL_INGOT_ITEM);
		Registry.register(Registry.BLOCK, new Identifier("programmingproject", "karelium_ore"), KAREL_ORE_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("programmingproject", "karelium_ore"), new BlockItem(KAREL_ORE_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));

		System.out.println("Hello from a programming student!");
	}
}
