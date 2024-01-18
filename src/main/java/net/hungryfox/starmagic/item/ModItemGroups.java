package net.hungryfox.starmagic.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hungryfox.starmagic.Starmagic;
import net.hungryfox.starmagic.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MainItemGroup = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Starmagic.MOD_ID, "starmagic_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.starmagic_group"))
                    .icon(() -> new ItemStack(ModItems.fireball_spelltome)).entries((displayContext, entries) -> {
                        // I tried for a couple hours to do this a better way... later I guess
                        entries.add(ModItems.cobbled_wand);
                        entries.add(ModItems.fireball_spelltome);

                        entries.add(ModBlocks.mana_lamp);
                    }).build());

    public static void registerItemGroups() {
        Starmagic.LOGGER.info("Registering Item Groups for " + Starmagic.MOD_ID);
    }
}
