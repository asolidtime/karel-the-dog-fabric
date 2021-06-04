package net.asolidtime.programmingproject.entities;

import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class KarelEntityRenderer extends GeoEntityRenderer<KarelEntity> {


    public KarelEntityRenderer(EntityRenderDispatcher renderManager, AnimatedGeoModel<KarelEntity> modelProvider) {
        super(renderManager, modelProvider);
    }

    public KarelEntityRenderer(EntityRenderDispatcher dispatcher, EntityRendererRegistry.Context ctx) {
        super(dispatcher, new KarelEntityModel());
    }
}
