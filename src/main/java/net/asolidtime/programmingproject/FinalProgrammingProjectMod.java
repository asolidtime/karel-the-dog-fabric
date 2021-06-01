package net.asolidtime.programmingproject;

import net.asolidtime.programmingproject.items.KarelItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FinalProgrammingProjectMod implements ModInitializer {
	public static final String MOD_ID = "programmingproject";
	public static final Logger LOGGER = LogManager.getLogger();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		KarelItems.registerItems();
		LOGGER.info("The Karel mod has been initialized!");
	}
}
