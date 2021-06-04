package net.asolidtime.programmingproject.entities;

import net.asolidtime.programmingproject.FinalProgrammingProjectMod;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KarelEntityModel extends AnimatedGeoModel<KarelEntity> {

    @Override
    public Identifier getModelLocation(KarelEntity object) {
        return new Identifier(FinalProgrammingProjectMod.MOD_ID, "geo/karel.geo.json");
    }

    @Override
    public Identifier getTextureLocation(KarelEntity object) {
        return new Identifier(FinalProgrammingProjectMod.MOD_ID, "textures/entity/karel.png");
    }

    @Override
    public Identifier getAnimationFileLocation(KarelEntity animatable) {
        return new Identifier(FinalProgrammingProjectMod.MOD_ID, "animations/karel.animation.json");
    }
}