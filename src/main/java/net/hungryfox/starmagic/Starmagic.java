package net.hungryfox.starmagic;

import net.fabricmc.api.ModInitializer;

import net.hungryfox.starmagic.block.ModBlocks;
import net.hungryfox.starmagic.item.ModItemGroups;
import net.hungryfox.starmagic.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Starmagic implements ModInitializer {
	public static final String MOD_ID = "starmagic";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Starmagic Initializing.");

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}