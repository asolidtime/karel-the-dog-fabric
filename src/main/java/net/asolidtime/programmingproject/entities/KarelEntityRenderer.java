package net.asolidtime.programmingproject.entities;

import net.asolidtime.programmingproject.FinalProgrammingProjectMod;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class KarelEntityRenderer extends MobEntityRenderer<KarelEntity, KarelEntityModel> {
    public KarelEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new KarelEntityModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(KarelEntity entity) {
        return new Identifier(FinalProgrammingProjectMod.MOD_ID, "textures/entity/doesntexist/karel.png");
    }
}
