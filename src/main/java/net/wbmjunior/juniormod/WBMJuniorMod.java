package net.wbmjunior.juniormod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WBMJuniorMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("juniormod");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
