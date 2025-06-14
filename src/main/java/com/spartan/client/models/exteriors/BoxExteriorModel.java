package com.spartan.client.models.exteriors;

import dev.amble.ait.api.tardis.link.v2.Linkable;
import dev.amble.ait.client.AITModClient;
import dev.amble.ait.client.models.exteriors.ExteriorModel;
import dev.amble.ait.client.tardis.ClientTardis;
import dev.amble.ait.core.blockentities.ExteriorBlockEntity;
import dev.amble.ait.core.tardis.handler.DoorHandler;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;


public class BoxExteriorModel extends ExteriorModel {
	private final ModelPart root;

	public BoxExteriorModel() {
		super();
		this.root = getTexturedModelData().createModel().getChild("bone");
	}

	public void renderWithAnimations(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		matrices.push();
		// Apply any transformations if needed
		root.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		matrices.pop();
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData TARDIS = bone.addChild("TARDIS", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData roof = TARDIS.addChild("roof", ModelPartBuilder.create().uv(0, 29).cuboid(-11.0F, 1.5F, -11.0F, 22.0F, 2.0F, 22.0F, new Dilation(0.0F))
				.uv(0, 54).cuboid(-10.0F, -0.5F, -10.0F, 20.0F, 2.0F, 20.0F, new Dilation(0.0F))
				.uv(0, 155).cuboid(-10.0F, 0.5F, -10.0F, 20.0F, 2.0F, 20.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -42.5F, 0.0F));

		ModelPartData lamp = roof.addChild("lamp", ModelPartBuilder.create().uv(45, 114).cuboid(-1.5F, -2.0F, -1.5F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -4.5F, 0.0F));

		ModelPartData cube_r1 = lamp.addChild("cube_r1", ModelPartBuilder.create().uv(124, 24).cuboid(-2.0F, -2.0F, -2.0F, 4.0F, 0.0F, 4.0F, new Dilation(0.0F))
				.uv(124, 5).cuboid(-2.0F, -4.5F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
				.uv(45, 107).cuboid(-1.5F, -3.5F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F))
				.uv(45, 85).cuboid(0.0F, -4.5F, -2.5F, 0.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.5F, 0.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r2 = lamp.addChild("cube_r2", ModelPartBuilder.create().uv(45, 96).cuboid(0.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 0.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData cube_r3 = lamp.addChild("cube_r3", ModelPartBuilder.create().uv(124, 12).cuboid(-2.0F, 1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData lampT = roof.addChild("lampT", ModelPartBuilder.create().uv(164, 24).cuboid(-1.5F, -3.0F, -1.5F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -3.5F, 0.0F));

		ModelPartData cube_r4 = lampT.addChild("cube_r4", ModelPartBuilder.create().uv(145, 24).cuboid(-2.0F, -2.0F, -2.0F, 4.0F, 0.0F, 4.0F, new Dilation(0.0F))
				.uv(145, 5).cuboid(-2.0F, -5.5F, -2.0F, 4.0F, 2.0F, 4.0F, new Dilation(0.0F))
				.uv(164, 17).cuboid(-1.5F, -3.5F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F))
				.uv(165, 0).cuboid(0.0F, -4.5F, -2.5F, 0.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.5F, 0.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r5 = lampT.addChild("cube_r5", ModelPartBuilder.create().uv(165, 6).cuboid(0.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 0.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData cube_r6 = lampT.addChild("cube_r6", ModelPartBuilder.create().uv(145, 12).cuboid(-2.0F, 1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData signs = roof.addChild("signs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 5.5F, 0.0F));

		ModelPartData signnorth = signs.addChild("signnorth", ModelPartBuilder.create().uv(89, 35).cuboid(-9.0F, -2.0F, -13.25F, 18.0F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(89, 40).cuboid(-9.5F, -2.5F, -13.25F, 19.0F, 4.0F, 0.0F, new Dilation(0.0F))
				.uv(13, 76).cuboid(-10.0F, -2.0F, -13.0F, 20.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData signwest = signs.addChild("signwest", ModelPartBuilder.create().uv(13, 76).cuboid(-10.0F, -2.0F, -13.0F, 20.0F, 4.0F, 3.0F, new Dilation(0.0F))
				.uv(89, 40).cuboid(-9.5F, -2.5F, -13.25F, 19.0F, 4.0F, 0.0F, new Dilation(0.0F))
				.uv(89, 35).cuboid(-9.0F, -2.0F, -13.25F, 18.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData signsouth = signs.addChild("signsouth", ModelPartBuilder.create().uv(13, 76).cuboid(-10.0F, -2.0F, -13.0F, 20.0F, 4.0F, 3.0F, new Dilation(0.0F))
				.uv(89, 40).cuboid(-9.5F, -2.5F, -13.25F, 19.0F, 4.0F, 0.0F, new Dilation(0.0F))
				.uv(89, 35).cuboid(-9.0F, -2.0F, -13.25F, 18.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData signeast = signs.addChild("signeast", ModelPartBuilder.create().uv(13, 76).cuboid(-10.0F, -2.0F, -13.0F, 20.0F, 4.0F, 3.0F, new Dilation(0.0F))
				.uv(89, 40).cuboid(-9.5F, -2.5F, -13.25F, 19.0F, 4.0F, 0.0F, new Dilation(0.0F))
				.uv(89, 35).cuboid(-9.0F, -2.0F, -13.25F, 18.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData walls = TARDIS.addChild("walls", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData walleast = walls.addChild("walleast", ModelPartBuilder.create().uv(105, 0).cuboid(-9.0F, -35.0F, -11.0F, 8.0F, 33.0F, 1.0F, new Dilation(0.0F))
				.uv(26, 120).cuboid(-1.0F, -35.0F, -11.5F, 2.0F, 33.0F, 1.0F, new Dilation(0.0F))
				.uv(105, 81).cuboid(1.0F, -35.0F, -11.0F, 8.0F, 33.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData bone11 = walleast.addChild("bone11", ModelPartBuilder.create().uv(64, 59).cuboid(-5.0F, -4.0F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(64, 56).cuboid(-5.0F, -7.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(64, 62).cuboid(-5.0F, -3.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -26.5F, -11.075F));

		ModelPartData cube_r7 = bone11.addChild("cube_r7", ModelPartBuilder.create().uv(67, 37).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -7.5F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r8 = bone11.addChild("cube_r8", ModelPartBuilder.create().uv(67, 41).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -0.5F, 0.775F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r9 = bone11.addChild("cube_r9", ModelPartBuilder.create().uv(67, 39).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -4.0F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r10 = bone11.addChild("cube_r10", ModelPartBuilder.create().uv(71, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r11 = bone11.addChild("cube_r11", ModelPartBuilder.create().uv(67, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -4.0F, 0.775F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r12 = bone11.addChild("cube_r12", ModelPartBuilder.create().uv(79, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r13 = bone11.addChild("cube_r13", ModelPartBuilder.create().uv(75, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bone12 = walleast.addChild("bone12", ModelPartBuilder.create().uv(64, 59).cuboid(-5.0F, -4.0F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(64, 56).cuboid(-5.0F, -7.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(64, 62).cuboid(-5.0F, -3.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, -26.5F, -11.075F));

		ModelPartData cube_r14 = bone12.addChild("cube_r14", ModelPartBuilder.create().uv(67, 37).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -7.5F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r15 = bone12.addChild("cube_r15", ModelPartBuilder.create().uv(67, 41).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -0.5F, 0.775F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r16 = bone12.addChild("cube_r16", ModelPartBuilder.create().uv(67, 39).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -4.0F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r17 = bone12.addChild("cube_r17", ModelPartBuilder.create().uv(71, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r18 = bone12.addChild("cube_r18", ModelPartBuilder.create().uv(67, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -4.0F, 0.775F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r19 = bone12.addChild("cube_r19", ModelPartBuilder.create().uv(79, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r20 = bone12.addChild("cube_r20", ModelPartBuilder.create().uv(75, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bone22 = walleast.addChild("bone22", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(13.0F, 14.0F, 0.0F));

		ModelPartData bone23 = walleast.addChild("bone23", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(13.0F, 6.0F, 0.0F));

		ModelPartData bone24 = walleast.addChild("bone24", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(13.0F, -2.0F, 0.0F));

		ModelPartData bone25 = walleast.addChild("bone25", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, -2.0F, 0.0F));

		ModelPartData bone26 = walleast.addChild("bone26", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, 14.0F, 0.0F));

		ModelPartData bone27 = walleast.addChild("bone27", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, 6.0F, 0.0F));

		ModelPartData wallsouth = walls.addChild("wallsouth", ModelPartBuilder.create().uv(86, 116).cuboid(-9.0F, -35.0F, -11.0F, 8.0F, 33.0F, 1.0F, new Dilation(0.0F))
				.uv(33, 120).cuboid(-1.0F, -35.0F, -11.5F, 2.0F, 33.0F, 1.0F, new Dilation(0.0F))
				.uv(105, 116).cuboid(1.0F, -35.0F, -11.0F, 8.0F, 33.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData bone13 = wallsouth.addChild("bone13", ModelPartBuilder.create().uv(64, 59).cuboid(-5.0F, -4.0F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(64, 56).cuboid(-5.0F, -7.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(64, 62).cuboid(-5.0F, -3.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -26.5F, -11.075F));

		ModelPartData cube_r21 = bone13.addChild("cube_r21", ModelPartBuilder.create().uv(67, 37).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -7.5F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r22 = bone13.addChild("cube_r22", ModelPartBuilder.create().uv(67, 41).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -0.5F, 0.775F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r23 = bone13.addChild("cube_r23", ModelPartBuilder.create().uv(67, 39).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -4.0F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r24 = bone13.addChild("cube_r24", ModelPartBuilder.create().uv(71, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r25 = bone13.addChild("cube_r25", ModelPartBuilder.create().uv(67, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -4.0F, 0.775F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r26 = bone13.addChild("cube_r26", ModelPartBuilder.create().uv(79, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r27 = bone13.addChild("cube_r27", ModelPartBuilder.create().uv(75, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bone14 = wallsouth.addChild("bone14", ModelPartBuilder.create().uv(64, 59).cuboid(-5.0F, -4.0F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(64, 56).cuboid(-5.0F, -7.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(64, 62).cuboid(-5.0F, -3.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, -26.5F, -11.075F));

		ModelPartData cube_r28 = bone14.addChild("cube_r28", ModelPartBuilder.create().uv(67, 37).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -7.5F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r29 = bone14.addChild("cube_r29", ModelPartBuilder.create().uv(67, 41).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -0.5F, 0.775F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r30 = bone14.addChild("cube_r30", ModelPartBuilder.create().uv(67, 39).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -4.0F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r31 = bone14.addChild("cube_r31", ModelPartBuilder.create().uv(71, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r32 = bone14.addChild("cube_r32", ModelPartBuilder.create().uv(67, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -4.0F, 0.775F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r33 = bone14.addChild("cube_r33", ModelPartBuilder.create().uv(79, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r34 = bone14.addChild("cube_r34", ModelPartBuilder.create().uv(75, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bone34 = wallsouth.addChild("bone34", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(13.0F, 14.0F, 0.0F));

		ModelPartData bone35 = wallsouth.addChild("bone35", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(13.0F, 6.0F, 0.0F));

		ModelPartData bone36 = wallsouth.addChild("bone36", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(13.0F, -2.0F, 0.0F));

		ModelPartData bone37 = wallsouth.addChild("bone37", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, -2.0F, 0.0F));

		ModelPartData bone38 = wallsouth.addChild("bone38", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, 14.0F, 0.0F));

		ModelPartData bone39 = wallsouth.addChild("bone39", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, 6.0F, 0.0F));

		ModelPartData wallwest = walls.addChild("wallwest", ModelPartBuilder.create().uv(45, 119).cuboid(-9.0F, -35.0F, -11.0F, 8.0F, 33.0F, 1.0F, new Dilation(0.0F))
				.uv(124, 81).cuboid(-1.0F, -35.0F, -11.5F, 2.0F, 33.0F, 1.0F, new Dilation(0.0F))
				.uv(64, 119).cuboid(1.0F, -35.0F, -11.0F, 8.0F, 33.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData bone15 = wallwest.addChild("bone15", ModelPartBuilder.create().uv(64, 59).cuboid(-5.0F, -4.0F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(64, 56).cuboid(-5.0F, -7.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(64, 62).cuboid(-5.0F, -3.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -26.5F, -11.075F));

		ModelPartData cube_r35 = bone15.addChild("cube_r35", ModelPartBuilder.create().uv(67, 37).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -7.5F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r36 = bone15.addChild("cube_r36", ModelPartBuilder.create().uv(67, 41).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -0.5F, 0.775F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r37 = bone15.addChild("cube_r37", ModelPartBuilder.create().uv(67, 39).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -4.0F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r38 = bone15.addChild("cube_r38", ModelPartBuilder.create().uv(71, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r39 = bone15.addChild("cube_r39", ModelPartBuilder.create().uv(67, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -4.0F, 0.775F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r40 = bone15.addChild("cube_r40", ModelPartBuilder.create().uv(79, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r41 = bone15.addChild("cube_r41", ModelPartBuilder.create().uv(75, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bone16 = wallwest.addChild("bone16", ModelPartBuilder.create().uv(64, 59).cuboid(-5.0F, -4.0F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(64, 56).cuboid(-5.0F, -7.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(64, 62).cuboid(-5.0F, -3.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, -26.5F, -11.075F));

		ModelPartData cube_r42 = bone16.addChild("cube_r42", ModelPartBuilder.create().uv(67, 37).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -7.5F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r43 = bone16.addChild("cube_r43", ModelPartBuilder.create().uv(67, 41).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -0.5F, 0.775F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r44 = bone16.addChild("cube_r44", ModelPartBuilder.create().uv(67, 39).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -4.0F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r45 = bone16.addChild("cube_r45", ModelPartBuilder.create().uv(71, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r46 = bone16.addChild("cube_r46", ModelPartBuilder.create().uv(67, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -4.0F, 0.775F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r47 = bone16.addChild("cube_r47", ModelPartBuilder.create().uv(79, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r48 = bone16.addChild("cube_r48", ModelPartBuilder.create().uv(75, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bone28 = wallwest.addChild("bone28", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(13.0F, 14.0F, 0.0F));

		ModelPartData bone29 = wallwest.addChild("bone29", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(13.0F, 6.0F, 0.0F));

		ModelPartData bone30 = wallwest.addChild("bone30", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(13.0F, -2.0F, 0.0F));

		ModelPartData bone31 = wallwest.addChild("bone31", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, -2.0F, 0.0F));

		ModelPartData bone32 = wallwest.addChild("bone32", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, 14.0F, 0.0F));

		ModelPartData bone33 = wallwest.addChild("bone33", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, 6.0F, 0.0F));

		ModelPartData pillars = walls.addChild("pillars", ModelPartBuilder.create().uv(0, 76).cuboid(-12.0F, -38.0F, -12.0F, 3.0F, 38.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.0F, 0.0F));

		ModelPartData cube_r49 = pillars.addChild("cube_r49", ModelPartBuilder.create().uv(13, 85).cuboid(-12.0F, -38.0F, -12.0F, 3.0F, 38.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r50 = pillars.addChild("cube_r50", ModelPartBuilder.create().uv(73, 76).cuboid(-12.0F, -38.0F, -12.0F, 3.0F, 38.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r51 = pillars.addChild("cube_r51", ModelPartBuilder.create().uv(60, 76).cuboid(-12.0F, -38.0F, -12.0F, 3.0F, 38.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData base = TARDIS.addChild("base", ModelPartBuilder.create().uv(0, 0).cuboid(-13.0F, -2.0F, -13.0F, 26.0F, 2.0F, 26.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData Doors = bone.addChild("Doors", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_door = Doors.addChild("left_door", ModelPartBuilder.create().uv(26, 85).cuboid(0.0F, -16.5F, 0.0F, 8.0F, 33.0F, 1.0F, new Dilation(0.0F))
				.uv(81, 72).cuboid(6.0F, -5.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(76, 70).cuboid(1.0F, -5.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(134, 18).cuboid(2.0F, -6.5F, 0.25F, 4.0F, 5.0F, 0.0F, new Dilation(0.0F))
				.uv(0, 119).cuboid(8.0F, -16.5F, -0.5F, 1.0F, 33.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-9.0F, -18.5F, -11.0F));

		ModelPartData bone10 = left_door.addChild("bone10", ModelPartBuilder.create().uv(64, 59).cuboid(-5.0F, -4.0F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(64, 56).cuboid(-5.0F, -7.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(64, 62).cuboid(-5.0F, -3.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(6.0F, -8.0F, -0.075F));

		ModelPartData cube_r52 = bone10.addChild("cube_r52", ModelPartBuilder.create().uv(67, 37).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -7.5F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r53 = bone10.addChild("cube_r53", ModelPartBuilder.create().uv(67, 41).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -0.5F, 0.775F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r54 = bone10.addChild("cube_r54", ModelPartBuilder.create().uv(67, 39).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -4.0F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r55 = bone10.addChild("cube_r55", ModelPartBuilder.create().uv(71, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r56 = bone10.addChild("cube_r56", ModelPartBuilder.create().uv(67, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -4.0F, 0.775F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r57 = bone10.addChild("cube_r57", ModelPartBuilder.create().uv(79, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r58 = bone10.addChild("cube_r58", ModelPartBuilder.create().uv(75, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bone19 = left_door.addChild("bone19", ModelPartBuilder.create().uv(85, 5).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(12.0F, 16.5F, 11.0F));

		ModelPartData bone20 = left_door.addChild("bone20", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(12.0F, 24.5F, 11.0F));

		ModelPartData bone21 = left_door.addChild("bone21", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(12.0F, 32.5F, 11.0F));

		ModelPartData right_door = Doors.addChild("right_door", ModelPartBuilder.create().uv(86, 81).cuboid(-8.0F, -16.5F, 0.0F, 8.0F, 33.0F, 1.0F, new Dilation(0.0F))
				.uv(89, 50).cuboid(-5.0F, -5.0F, 0.25F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F))
				.uv(89, 29).cuboid(-8.0F, -5.5F, -1.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(94, 29).cuboid(-8.0F, -1.5F, -1.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(4, 119).cuboid(-9.0F, -16.5F, -0.5F, 1.0F, 33.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(9.0F, -18.5F, -11.0F));

		ModelPartData bone3 = right_door.addChild("bone3", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 16.5F, 11.0F));

		ModelPartData bone9 = right_door.addChild("bone9", ModelPartBuilder.create().uv(64, 59).cuboid(-5.0F, -4.0F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(64, 56).cuboid(-5.0F, -7.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(64, 62).cuboid(-5.0F, -3.5F, 0.55F, 6.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -8.0F, -0.075F));

		ModelPartData cube_r59 = bone9.addChild("cube_r59", ModelPartBuilder.create().uv(67, 37).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -7.5F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r60 = bone9.addChild("cube_r60", ModelPartBuilder.create().uv(67, 41).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -0.5F, 0.775F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r61 = bone9.addChild("cube_r61", ModelPartBuilder.create().uv(67, 39).cuboid(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -4.0F, 0.775F, -0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r62 = bone9.addChild("cube_r62", ModelPartBuilder.create().uv(71, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r63 = bone9.addChild("cube_r63", ModelPartBuilder.create().uv(67, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -4.0F, 0.775F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r64 = bone9.addChild("cube_r64", ModelPartBuilder.create().uv(79, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r65 = bone9.addChild("cube_r65", ModelPartBuilder.create().uv(75, 29).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -4.0F, 0.775F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bone17 = right_door.addChild("bone17", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 24.5F, 11.0F));

		ModelPartData bone18 = right_door.addChild("bone18", ModelPartBuilder.create().uv(85, 12).cuboid(-11.0F, -24.0F, -10.5F, 6.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(84, 18).cuboid(-11.0F, -17.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(78, 12).cuboid(-11.0F, -24.0F, -11.0F, 6.0F, 0.0F, 1.0F, new Dilation(0.0F))
				.uv(84, 11).cuboid(-11.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(90, 11).cuboid(-5.0F, -24.0F, -11.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 32.5F, 11.0F));
		return TexturedModelData.of(modelData, 256, 256);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red,
					   float green, float blue, float alpha) {
		root.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return root;
	}

	@Override
	public void renderWithAnimations(ClientTardis tardis, ExteriorBlockEntity exterior, ModelPart root, MatrixStack matrices,
									 VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha) {
		matrices.push();
		matrices.scale(1F, 1F, 1F);
		matrices.translate(0, -1.5f, 0);

		this.renderDoors(tardis, exterior, root, matrices, vertices, light, overlay, red, green, blue, pAlpha, false);

		super.renderWithAnimations(tardis, exterior, root, matrices, vertices, light, overlay, red, green, blue, pAlpha);
		matrices.pop();
	}

	@Override
	public <T extends Entity & Linkable> void renderEntity(T falling, ModelPart root, MatrixStack matrices,
														   VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		if (!falling.isLinked())
			return;

		matrices.push();
		matrices.scale(1F, 1F, 1F);
		matrices.translate(0, -1.5f, 0);

		DoorHandler door = falling.tardis().get().door();

		if (!AITModClient.CONFIG.animateDoors) {
			this.root.getChild("Doors").getChild("right_door").yaw = (door.isLeftOpen() || door.isOpen()) ? -5F : 0.0F;
			this.root.getChild("Doors").getChild("left_door").yaw = (door.isRightOpen() || door.areBothOpen())
					? 5F
					: 0.0F;
		} else {
			float maxRot = 90f;
			this.root.getChild("Doors").getChild("right_door").yaw =(float) Math.toRadians(maxRot*door.getLeftRot());
			this.root.getChild("Doors").getChild("left_door").yaw =(float) -Math.toRadians(maxRot*door.getRightRot());
		}

		super.renderEntity(falling, root, matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		matrices.pop();
	}

	@Override
	public Animation getAnimationForDoorState(DoorHandler.AnimationDoorState state) {
		return Animation.Builder.create(0).build();
	}

	@Override
	public void renderDoors(ClientTardis tardis, ExteriorBlockEntity exterior, ModelPart root, MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float pAlpha, boolean isBOTI) {
		DoorHandler door = tardis.door();

		if (!AITModClient.CONFIG.animateDoors) {
			this.root.getChild("Doors").getChild("right_door").yaw = (door.isLeftOpen() || door.isOpen()) ? -5F : 0.0F;
			this.root.getChild("Doors").getChild("left_door").yaw = (door.isRightOpen() || door.areBothOpen())
					? 5F
					: 0.0F;
		} else {
			float maxRot = 90f;
			this.root.getChild("Doors").getChild("right_door").yaw =(float) Math.toRadians(maxRot*door.getLeftRot());
			this.root.getChild("Doors").getChild("left_door").yaw =(float) -Math.toRadians(maxRot*door.getRightRot());
		}

		if (isBOTI) {
			matrices.push();
			matrices.scale(1F, 1F, 1F);
			matrices.translate(0, 0f, -0.01);
			this.root.getChild("Doors").render(matrices, vertices, light, overlay, red, green, blue, pAlpha);
			matrices.pop();
		}
	}
}
