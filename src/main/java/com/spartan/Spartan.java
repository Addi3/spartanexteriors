package com.spartan;


import dev.amble.ait.core.AITSounds;
import dev.amble.ait.data.schema.exterior.category.PoliceBoxCategory;
import dev.amble.ait.data.schema.exterior.variant.addon.AddonExterior;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;


public class Spartan implements ModInitializer {

    public static final String MOD_ID = "spartan-exteriors";
    public static AddonExterior BOX;

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }

    @Override
    public void onInitialize() {
        registerAddonExteriors();
    }

    private void registerAddonExteriors() {
        //BOX
        BOX = new AddonExterior(new Identifier(MOD_ID, "box"), MOD_ID, "box").register();
       BOX.setDoor(new AddonExterior.Door(
                        BOX, true, AITSounds.POLICE_BOX_DOOR_OPEN, AITSounds.POLICE_BOX_DOOR_CLOSE))
                .toDoor().register();
        BOX.hasPortals();
        BOX.setPortalTranslations((pos, b) -> {
            return switch(b) {
                case 0 -> pos.add(0, -0.05, -0.628); // NORTH
               case 1, 2, 3 -> pos.add(0.43, -0.05, -0.43); // NORTH EAST p n
                case 4 -> pos.add(0.628, -0.05, 0); // EAST
                case 5, 6, 7 -> pos.add(0.43, -0.05, 0.43); // SOUTH EAST p p
                case 8 -> pos.add(0, -0.05, 0.628); // SOUTH
                case 9, 10, 11 -> pos.add(-0.43, -0.05, 0.43); // SOUTH WEST n p
                case 12 -> pos.add(-0.628, -0.05, 0); // WEST
               case 13, 14, 15 -> pos.add(-0.43, -0.05, -0.43); // NORTH WEST n n
                default -> pos;
            };
        });
        BOX.toDoor().setPortalTranslations((pos, b) -> {
            return switch(b) {
                case DOWN, UP -> pos;
                case NORTH -> pos.add(0, 0.05, -0.45);
                case SOUTH -> pos.add(0, 0.05, 0.45);
                case WEST -> pos.add(-0.45, 0.05, 0);
                case EAST -> pos.add(0.45, 0.05, 0);
            };
        });
    }
}
