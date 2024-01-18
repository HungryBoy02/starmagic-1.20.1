package net.hungryfox.starmagic;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.hungryfox.starmagic.client.TransparentBlocks;

@Environment(EnvType.CLIENT)
public class StarmagicClient  implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TransparentBlocks.RegisterTransparentBlocks();
    }
}
