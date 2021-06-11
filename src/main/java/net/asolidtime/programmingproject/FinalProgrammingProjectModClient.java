package net.asolidtime.programmingproject;

import net.asolidtime.programmingproject.entities.KarelEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class FinalProgrammingProjectModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        /*
         * Registers our Karel Entity's renderer, which provides a model and texture for the entity.
         *
         * Entity Renderers can also manipulate the model before it renders based on entity context (EndermanEntityRenderer#render).
         */
                EntityRendererRegistry.INSTANCE.register(FinalProgrammingProjectMod.KAREL, (context) -> new KarelEntityRenderer(context));

    }
}
