//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.spartan.client.models.doors;

import dev.amble.ait.api.tardis.link.v2.block.AbstractLinkableBlockEntity;
import dev.amble.ait.client.AITModClient;
import dev.amble.ait.client.models.doors.DoorModel;
import dev.amble.ait.client.tardis.ClientTardis;
import dev.amble.ait.core.tardis.handler.DoorHandler;
import net.minecraft.client.model.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.Animation.Builder;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;

public class BoxDoorModel extends DoorModel {
    private final ModelPart bone;

    public BoxDoorModel(ModelPart root) {
        super(RenderLayer::getEntityCutoutNoCull);
        this.bone = root.getChild("bone");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.of(0.0F, -16.5F, -17.0F, 0.0F, 3.1416F, 0.0F));

        ModelPartData Doors = bone.addChild("Doors", ModelPartBuilder.create(), ModelTransform.of(0.0F, 42.5F, -10.0F, 0.0F, 3.1416F, 0.0F));

        ModelPartData left_door = Doors.addChild("left_door", ModelPartBuilder.create().uv(32, 190).cuboid(0.0F, -16.5F, 0.0F, 9.0F, 33.0F, 1.0F, new Dilation(0.0F))
                .uv(81, 72).cuboid(6.0F, -5.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(76, 70).cuboid(1.0F, -5.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(134, 18).cuboid(2.0F, -6.5F, 0.25F, 4.0F, 5.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 119).cuboid(8.0F, -16.5F, -0.5F, 1.0F, 33.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-8.0F, -18.5F, 0.0F));

        ModelPartData phone = left_door.addChild("phone", ModelPartBuilder.create().uv(53, 198).cuboid(-1.0F, -6.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(60, 194).cuboid(-0.5F, -6.5F, 0.5F, 0.0F, 5.0F, 1.0F, new Dilation(0.0F))
                .uv(53, 198).cuboid(-1.0F, -2.5F, -0.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(53, 191).cuboid(0.0F, -6.5F, -0.5F, 2.0F, 5.0F, 1.0F, new Dilation(0.0F))
                .uv(60, 192).cuboid(0.0F, -5.5F, 0.75F, 2.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 0.0F, 1.0F));

        ModelPartData phoneCable = phone.addChild("phoneCable", ModelPartBuilder.create().uv(52, 200).cuboid(-2.5F, 0.0F, 0.0F, 5.0F, 9.0F, 0.0F, new Dilation(0.001F)), ModelTransform.pivot(0.5F, -1.5F, 0.025F));

        ModelPartData bone10 = left_door.addChild("bone10", ModelPartBuilder.create().uv(64, 59).cuboid(-3.0F, -0.15F, -0.025F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
                .uv(64, 56).cuboid(-3.0F, -3.65F, -0.025F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
                .uv(64, 62).cuboid(-3.0F, 0.35F, -0.025F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, -11.85F, 0.5F));

        ModelPartData cube_r1 = bone10.addChild("cube_r1", ModelPartBuilder.create().uv(67, 37).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.65F, 0.2F, -0.7854F, 0.0F, 0.0F));

        ModelPartData cube_r2 = bone10.addChild("cube_r2", ModelPartBuilder.create().uv(67, 41).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.35F, 0.2F, 0.7854F, 0.0F, 0.0F));

        ModelPartData cube_r3 = bone10.addChild("cube_r3", ModelPartBuilder.create().uv(67, 39).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.15F, 0.2F, -0.7854F, 0.0F, 0.0F));

        ModelPartData cube_r4 = bone10.addChild("cube_r4", ModelPartBuilder.create().uv(71, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, -0.15F, 0.2F, 0.0F, -0.7854F, 0.0F));

        ModelPartData cube_r5 = bone10.addChild("cube_r5", ModelPartBuilder.create().uv(67, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -0.15F, 0.2F, 0.0F, 0.7854F, 0.0F));

        ModelPartData cube_r6 = bone10.addChild("cube_r6", ModelPartBuilder.create().uv(79, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -0.15F, 0.2F, 0.0F, -0.7854F, 0.0F));

        ModelPartData cube_r7 = bone10.addChild("cube_r7", ModelPartBuilder.create().uv(75, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -0.15F, 0.2F, 0.0F, -0.7854F, 0.0F));

        ModelPartData bone3 = left_door.addChild("bone3", ModelPartBuilder.create().uv(64, 59).cuboid(-3.0F, -0.15F, -0.025F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
                .uv(64, 56).cuboid(-3.0F, -3.65F, -0.025F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
                .uv(64, 62).cuboid(-3.0F, 0.35F, -0.025F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, -11.85F, 0.5F, 0.0F, 3.1416F, 0.0F));

        ModelPartData cube_r8 = bone3.addChild("cube_r8", ModelPartBuilder.create().uv(18, 240).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.65F, 0.2F, -0.7854F, 0.0F, 0.0F));

        ModelPartData cube_r9 = bone3.addChild("cube_r9", ModelPartBuilder.create().uv(18, 244).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.35F, 0.2F, 0.7854F, 0.0F, 0.0F));

        ModelPartData cube_r10 = bone3.addChild("cube_r10", ModelPartBuilder.create().uv(18, 242).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.15F, 0.2F, -0.7854F, 0.0F, 0.0F));

        ModelPartData cube_r11 = bone3.addChild("cube_r11", ModelPartBuilder.create().uv(22, 232).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, -0.15F, 0.2F, 0.0F, -0.7854F, 0.0F));

        ModelPartData cube_r12 = bone3.addChild("cube_r12", ModelPartBuilder.create().uv(18, 232).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -0.15F, 0.2F, 0.0F, 0.7854F, 0.0F));

        ModelPartData cube_r13 = bone3.addChild("cube_r13", ModelPartBuilder.create().uv(30, 232).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -0.15F, 0.2F, 0.0F, -0.7854F, 0.0F));

        ModelPartData cube_r14 = bone3.addChild("cube_r14", ModelPartBuilder.create().uv(26, 232).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -0.15F, 0.2F, 0.0F, -0.7854F, 0.0F));

        ModelPartData bone19 = left_door.addChild("bone19", ModelPartBuilder.create().uv(6, 232).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
                .uv(5, 245).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
                .uv(-1, 239).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
                .uv(5, 238).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
                .uv(11, 238).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(12.0F, 16.5F, 11.0F));

        ModelPartData bone20 = left_door.addChild("bone20", ModelPartBuilder.create().uv(6, 239).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
                .uv(5, 245).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
                .uv(-1, 239).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
                .uv(5, 238).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
                .uv(11, 238).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(12.0F, 24.5F, 11.0F));

        ModelPartData bone21 = left_door.addChild("bone21", ModelPartBuilder.create().uv(6, 239).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
                .uv(5, 245).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
                .uv(-1, 239).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
                .uv(5, 238).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
                .uv(11, 238).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(12.0F, 32.5F, 11.0F));

        ModelPartData right_door = Doors.addChild("right_door", ModelPartBuilder.create().uv(12, 190).cuboid(-9.0F, -16.5F, 0.0F, 9.0F, 33.0F, 1.0F, new Dilation(0.0F))
                .uv(89, 50).cuboid(-5.0F, -5.0F, 0.25F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(89, 29).cuboid(-8.0F, -5.5F, -1.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
                .uv(94, 29).cuboid(-8.0F, -1.5F, -1.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
                .uv(4, 119).cuboid(-9.0F, -16.5F, -0.5F, 1.0F, 33.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, -18.5F, 0.0F));

        ModelPartData cube_r15 = right_door.addChild("cube_r15", ModelPartBuilder.create().uv(84, 29).cuboid(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-7.5F, -4.0F, 1.5F, 0.0F, 0.0F, -1.5708F));

        ModelPartData bonewhatever = right_door.addChild("bonewhatever", ModelPartBuilder.create().uv(6, 239).cuboid(-3.0F, -3.5F, 0.0F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
                .uv(5, 245).cuboid(-3.0F, 3.5F, -0.5F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
                .uv(-1, 239).cuboid(-3.0F, -3.5F, -0.5F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
                .uv(5, 238).cuboid(-3.0F, -3.5F, -0.5F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
                .uv(11, 238).cuboid(3.0F, -3.5F, -0.5F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, -4.0F, 0.5F));

        ModelPartData bone9 = right_door.addChild("bone9", ModelPartBuilder.create().uv(64, 59).cuboid(-5.0F, -4.0F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
                .uv(64, 56).cuboid(-5.0F, -7.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
                .uv(64, 62).cuboid(-5.0F, -3.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -8.0F, -0.075F));

        ModelPartData cube_r16 = bone9.addChild("cube_r16", ModelPartBuilder.create().uv(67, 37).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -7.5F, 0.775F, -0.7854F, 0.0F, 0.0F));

        ModelPartData cube_r17 = bone9.addChild("cube_r17", ModelPartBuilder.create().uv(67, 41).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -0.5F, 0.775F, 0.7854F, 0.0F, 0.0F));

        ModelPartData cube_r18 = bone9.addChild("cube_r18", ModelPartBuilder.create().uv(67, 39).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -4.0F, 0.775F, -0.7854F, 0.0F, 0.0F));

        ModelPartData cube_r19 = bone9.addChild("cube_r19", ModelPartBuilder.create().uv(71, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

        ModelPartData cube_r20 = bone9.addChild("cube_r20", ModelPartBuilder.create().uv(67, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -4.0F, 0.775F, 0.0F, 0.7854F, 0.0F));

        ModelPartData cube_r21 = bone9.addChild("cube_r21", ModelPartBuilder.create().uv(79, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

        ModelPartData cube_r22 = bone9.addChild("cube_r22", ModelPartBuilder.create().uv(75, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

        ModelPartData bone2 = right_door.addChild("bone2", ModelPartBuilder.create().uv(64, 59).cuboid(-3.0F, 0.0F, -0.025F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
                .uv(64, 56).cuboid(-3.0F, -3.5F, -0.025F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
                .uv(64, 62).cuboid(-3.0F, 0.5F, -0.025F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, -12.0F, 0.5F, 0.0F, 3.1416F, 0.0F));

        ModelPartData cube_r23 = bone2.addChild("cube_r23", ModelPartBuilder.create().uv(18, 240).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.5F, 0.2F, -0.7854F, 0.0F, 0.0F));

        ModelPartData cube_r24 = bone2.addChild("cube_r24", ModelPartBuilder.create().uv(18, 244).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.5F, 0.2F, 0.7854F, 0.0F, 0.0F));

        ModelPartData cube_r25 = bone2.addChild("cube_r25", ModelPartBuilder.create().uv(18, 242).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.2F, -0.7854F, 0.0F, 0.0F));

        ModelPartData cube_r26 = bone2.addChild("cube_r26", ModelPartBuilder.create().uv(22, 232).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, 0.0F, 0.2F, 0.0F, -0.7854F, 0.0F));

        ModelPartData cube_r27 = bone2.addChild("cube_r27", ModelPartBuilder.create().uv(18, 232).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, 0.0F, 0.2F, 0.0F, 0.7854F, 0.0F));

        ModelPartData cube_r28 = bone2.addChild("cube_r28", ModelPartBuilder.create().uv(30, 232).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 0.0F, 0.2F, 0.0F, -0.7854F, 0.0F));

        ModelPartData cube_r29 = bone2.addChild("cube_r29", ModelPartBuilder.create().uv(26, 232).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 0.0F, 0.2F, 0.0F, -0.7854F, 0.0F));

        ModelPartData bone17 = right_door.addChild("bone17", ModelPartBuilder.create().uv(6, 239).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
                .uv(5, 245).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
                .uv(-1, 239).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
                .uv(5, 238).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
                .uv(11, 238).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 24.5F, 11.0F));

        ModelPartData bone18 = right_door.addChild("bone18", ModelPartBuilder.create().uv(6, 239).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
                .uv(5, 245).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
                .uv(-1, 239).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
                .uv(5, 238).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
                .uv(11, 238).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 32.5F, 11.0F));

        ModelPartData TARDIS = bone.addChild("TARDIS", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData roof = TARDIS.addChild("roof", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData signs = roof.addChild("signs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 5.5F, 0.0F));

        ModelPartData signnorth = signs.addChild("signnorth", ModelPartBuilder.create().uv(89, 35).cuboid(-9.0F, -2.0F, -1.75F, 18.0F, 3.0F, 0.0F, new Dilation(0.0F))
                .uv(89, 40).cuboid(-9.5F, -2.5F, -1.75F, 19.0F, 4.0F, 0.0F, new Dilation(0.0F))
                .uv(8, 182).cuboid(-10.0F, -2.0F, -2.0F, 20.0F, 4.0F, 4.0F, new Dilation(0.0F))
                .uv(20, 224).cuboid(-8.0F, -2.0F, -2.0F, 0.0F, 4.0F, 4.0F, new Dilation(0.001F))
                .uv(12, 224).cuboid(8.0F, -2.0F, -2.0F, 0.0F, 4.0F, 4.0F, new Dilation(0.001F))
                .uv(12, 224).cuboid(-10.0F, -2.0F, -2.0F, 20.0F, 4.0F, 0.0F, new Dilation(0.0F))
                .uv(28, 228).cuboid(-7.5F, -1.0F, 0.0F, 15.0F, 2.0F, 0.0F, new Dilation(0.0F))
                .uv(8, 182).cuboid(-10.0F, 1.0F, -2.0F, 20.0F, 0.0F, 4.0F, new Dilation(0.001F))
                .uv(8, 182).cuboid(-10.0F, -1.0F, -2.0F, 20.0F, 0.0F, 4.0F, new Dilation(0.001F)), ModelTransform.of(0.0F, 0.0F, -10.0F, 0.0F, 3.1416F, 0.0F));

        ModelPartData walls = TARDIS.addChild("walls", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 42.5F, 0.0F));

        ModelPartData pillars = walls.addChild("pillars", ModelPartBuilder.create().uv(0, 190).cuboid(-12.0F, -37.0F, -12.0F, 3.0F, 37.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.0F, 0.0F));

        ModelPartData cube_r30 = pillars.addChild("cube_r30", ModelPartBuilder.create().uv(0, 190).cuboid(-12.0F, -37.0F, -12.0F, 3.0F, 37.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
        return TexturedModelData.of(modelData, 256, 256);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red,
                       float green, float blue, float alpha) {
        bone.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public void renderWithAnimations(ClientTardis tardis, AbstractLinkableBlockEntity doorEntity, ModelPart root, MatrixStack matrices,
                                     VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha) {
        DoorHandler door = tardis.door();

        if (!AITModClient.CONFIG.animateDoors) {
            this.bone.getChild("Doors").getChild("right_door").yaw = (door.isLeftOpen() || door.isOpen()) ? -5F : 0.0F;
            this.bone.getChild("Doors").getChild("left_door").yaw = (door.isRightOpen() || door.areBothOpen())
                    ? 5F
                    : 0.0F;
        } else {
            float maxRot = 90f;
            this.bone.getChild("Doors").getChild("right_door").yaw = (float) Math.toRadians(maxRot*door.getLeftRot());
            this.bone.getChild("Doors").getChild("left_door").yaw = (float) -Math.toRadians(maxRot*door.getRightRot());
        }

        matrices.push();
        matrices.scale(1F, 1F, 1F);
        matrices.translate(0, -1.5, -0.069F);
        matrices.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(180));

        super.renderWithAnimations(tardis, doorEntity, root, matrices, vertices, light, overlay, red, green, blue, pAlpha);
        matrices.pop();
    }

    @Override
    public Animation getAnimationForDoorState(DoorHandler.AnimationDoorState state) {
        return Builder.create(0).build();/*return switch (state) {
            case CLOSED -> DoorAnimations.INTERIOR_BOTH_CLOSE_ANIMATION;
            case FIRST -> DoorAnimations.INTERIOR_FIRST_OPEN_ANIMATION;
            case SECOND -> DoorAnimations.INTERIOR_SECOND_OPEN_ANIMATION;
            case BOTH -> DoorAnimations.INTERIOR_BOTH_OPEN_ANIMATION;
        };*/
    }

    @Override
    public ModelPart getPart() {
        return bone;
    }
}

