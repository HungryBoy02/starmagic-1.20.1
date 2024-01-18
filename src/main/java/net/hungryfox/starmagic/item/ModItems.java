package net.hungryfox.starmagic.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hungryfox.starmagic.Starmagic;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item cobbled_wand = registerItem("cobbled_wand", new Item(new FabricItemSettings()));

    private static void addItemToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(cobbled_wand);
    }
    private static Item registerItem(String itemid, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Starmagic.MOD_ID, itemid), item);
    }
    public static void registerModItems() {
        Starmagic.LOGGER.info("Registering items for " + Starmagic.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIngredientItemGroup);
    }
}