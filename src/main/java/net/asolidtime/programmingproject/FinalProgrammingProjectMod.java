package net.asolidtime.programmingproject;

import net.asolidtime.programmingproject.entities.KarelEntity;
import net.asolidtime.programmingproject.items.KarelItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FinalProgrammingProjectMod implements ModInitializer {
	public static final String MOD_ID = "programmingproject";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final EntityType<KarelEntity> KAREL = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(MOD_ID, "karel"),
			FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, KarelEntity::new).dimensions(EntityDimensions.fixed(1.25f, 1.25f)).build()
	);
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		KarelItems.registerItems();
		FabricDefaultAttributeRegistry.register(KAREL, KarelEntity.createMobAttributes());
		LOGGER.info("The Karel mod has been initialized!");
	}
	
}
