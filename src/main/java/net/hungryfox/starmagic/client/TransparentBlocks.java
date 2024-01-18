package net.hungryfox.starmagic.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.hungryfox.starmagic.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class TransparentBlocks {
    public static void RegisterTransparentBlocks() {
        //BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.mana_lamp, RenderLayer.getCutout()); // CUTOUT
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.mana_lamp, RenderLayer.getTranslucent());
    }
}
