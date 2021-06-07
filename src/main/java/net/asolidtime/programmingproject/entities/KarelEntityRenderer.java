package net.asolidtime.programmingproject.entities;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import software.bernie.geckolib3.renderer.geo.GeoEntityRenderer;

public class KarelEntityRenderer extends GeoEntityRenderer<KarelEntity> {
    public KarelEntityRenderer(EntityRenderDispatcher renderManager) {
        super(renderManager, new KarelEntityModel());
        this.shadowRadius = 0.7F;
    }
}
