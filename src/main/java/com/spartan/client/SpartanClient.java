package com.spartan.client;


import com.spartan.client.models.doors.*;
import com.spartan.client.models.exteriors.*;
import net.fabricmc.api.ClientModInitializer;

import static com.spartan.Spartan.*;

public class SpartanClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        registerClientAddonExteriors();
    }

    private void registerClientAddonExteriors() {
     BOX.setModel(new BoxExteriorModel()).toClient().register();
        BOX.setPortalWidth(1.15f);
        BOX.setPortalHeight(2.28f);
        BOX.toDoor().setModel(new BoxDoorModel(BoxDoorModel.getTexturedModelData().createModel())).toClient().register();
    };
}
