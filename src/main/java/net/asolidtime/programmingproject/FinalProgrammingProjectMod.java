package net.asolidtime.programmingproject;

import net.asolidtime.programmingproject.items.KareliumIngotItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FinalProgrammingProjectMod implements ModInitializer {
	public static final KareliumIngotItem KAREL_INGOT_ITEM = new KareliumIngotItem(new FabricItemSettings().group(ItemGroup.MISC));
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.ITEM, new Identifier("programmingproject", "karelium_ingot"), KAREL_INGOT_ITEM);
		System.out.println("Hello from a programming student!");
	}
}
