package net.asolidtime.programmingproject.entities;

import net.asolidtime.programmingproject.FinalProgrammingProjectMod;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

//
//import net.minecraft.client.model.ModelPart;
//import net.minecraft.client.render.VertexConsumer;
//import net.minecraft.client.render.entity.model.EntityModel;
//import net.minecraft.client.util.math.MatrixStack;
//
//public class KarelEntityModel extends EntityModel<KarelEntity> {
//    private final ModelPart main;
//    private final ModelPart legs;
//    private final ModelPart head;
//    public KarelEntityModel() {
//        this.textureWidth = 16;
//        this.textureHeight = 16;
//        // exported from BlockBench
//        main = new ModelPart(this);
//        main.setPivot(0.0F, 24.0F, 0.0F);
//        main.setTextureOffset(0, 0).addCuboid(-8.0F, -15.0F, -5.0F, 16.0F, 8.0F, 10.0F, 0.0F, false);
//
//        legs = new ModelPart(this);
//        legs.setPivot(0.0F, 0.0F, 0.0F);
//        main.addChild(legs);
//        legs.setTextureOffset(0, 0).addCuboid(5.0F, -7.0F, -5.0F, 3.0F, 7.0F, 2.0F, 0.0F, false);
//        legs.setTextureOffset(0, 0).addCuboid(-8.0F, -7.0F, -5.0F, 3.0F, 7.0F, 2.0F, 0.0F, false);
//        legs.setTextureOffset(0, 0).addCuboid(-8.0F, -7.0F, 3.0F, 3.0F, 7.0F, 2.0F, 0.0F, false);
//        legs.setTextureOffset(0, 0).addCuboid(5.0F, -7.0F, 3.0F, 3.0F, 7.0F, 2.0F, 0.0F, false);
//
//        head = new ModelPart(this);
//        head.setPivot(0.0F, 0.0F, 0.0F);
//        main.addChild(head);
//        head.setTextureOffset(0, 0).addCuboid(4.0F, -19.0F, -4.0F, 9.0F, 7.0F, 8.0F, 0.0F, false);
//        head.setTextureOffset(0, 0).addCuboid(11.0F, -21.0F, -3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
//        head.setTextureOffset(0, 0).addCuboid(11.0F, -21.0F, 1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
//        head.setTextureOffset(0, 0).addCuboid(13.0F, -15.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
//    }
//    @Override
//    public void setAngles(KarelEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
//
//    }
//
//    @Override
//    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
//        // translate model down
//        matrices.translate(0, 1.125, 0);
//
//        // render cube
//        main.render(matrices, vertices, light, overlay);
//    }
//}
// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
//
//
//import net.minecraft.client.model.ModelPart;
//import net.minecraft.client.render.VertexConsumer;
//import net.minecraft.client.render.entity.model.EntityModel;
//import net.minecraft.client.util.math.MatrixStack;
//
//public class KarelEntityModel extends EntityModel<KarelEntity> {
//    private final ModelPart main;
//    private final ModelPart legs;
//    private final ModelPart head;
//    public KarelEntityModel() {
//        textureWidth = 16;
//        textureHeight = 16;
//        main = new ModelPart(this);
//        main.setPivot(0.0F, 24.0F, 0.0F);
//        main.setTextureOffset(0, 0).addCuboid(-8.0F, -15.0F, -5.0F, 16.0F, 8.0F, 10.0F, 0.0F, false);
//
//        legs = new ModelPart(this);
//        legs.setPivot(0.0F, 0.0F, 0.0F);
//        main.addChild(legs);
//        legs.setTextureOffset(0, 0).addCuboid(5.0F, -7.0F, -5.0F, 3.0F, 7.0F, 2.0F, 0.0F, false);
//        legs.setTextureOffset(0, 0).addCuboid(-8.0F, -7.0F, -5.0F, 3.0F, 7.0F, 2.0F, 0.0F, false);
//        legs.setTextureOffset(0, 0).addCuboid(-8.0F, -7.0F, 3.0F, 3.0F, 7.0F, 2.0F, 0.0F, false);
//        legs.setTextureOffset(0, 0).addCuboid(5.0F, -7.0F, 3.0F, 3.0F, 7.0F, 2.0F, 0.0F, false);
//
//        head = new ModelPart(this);
//        head.setPivot(0.0F, 0.0F, 0.0F);
//        main.addChild(head);
//        head.setTextureOffset(0, 0).addCuboid(4.0F, -19.0F, -4.0F, 9.0F, 7.0F, 8.0F, 0.0F, false);
//        head.setTextureOffset(0, 0).addCuboid(11.0F, -21.0F, -3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
//        head.setTextureOffset(0, 0).addCuboid(11.0F, -21.0F, 1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
//        head.setTextureOffset(0, 0).addCuboid(13.0F, -15.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
//    }
//    @Override
//    public void setAngles(KarelEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//        //previously the render function, render code was moved to a method below
//    }
//    @Override
//    public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
//
//        main.render(matrixStack, buffer, packedLight, packedOverlay);
//    }
//    public void setRotationAngle(ModelPart bone, float x, float y, float z) {
//        bone.pitch = x;
//        bone.yaw = y;
//        bone.roll = z;
//    }
//
//}
public class KarelEntityModel extends AnimatedGeoModel<KarelEntity> {

    @Override
    public Identifier getModelLocation(KarelEntity object) {
        return new Identifier(FinalProgrammingProjectMod.MOD_ID, "geo/karel/KarelEntityModel.geo.json");
    }

    @Override
    public Identifier getTextureLocation(KarelEntity object) {
        return new Identifier(FinalProgrammingProjectMod.MOD_ID, "geo/karel/KarelEntityModel.png");
    }

    @Override
    public Identifier getAnimationFileLocation(KarelEntity animatable) {
        return new Identifier(FinalProgrammingProjectMod.MOD_ID, "geo/karel/KarelEntityModel.animation.json");
    }
}