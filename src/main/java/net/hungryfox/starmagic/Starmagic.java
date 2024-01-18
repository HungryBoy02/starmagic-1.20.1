package net.hungryfox.starmagic;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Starmagic implements ModInitializer {
	public static final String MOD_ID = "starmagic";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Starmagic (By HungryBoy02/HungryFox02) Initialized.");
	}
}