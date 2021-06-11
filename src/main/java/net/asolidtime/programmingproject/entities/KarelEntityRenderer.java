package net.asolidtime.programmingproject.entities;

import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class KarelEntityRenderer extends GeoEntityRenderer<KarelEntity> {
    public KarelEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new KarelEntityModel());
    }
}
