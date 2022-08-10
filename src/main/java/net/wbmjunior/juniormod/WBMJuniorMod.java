package net.wbmjunior.juniormod;

import net.fabricmc.api.ModInitializer;
import net.wbmjunior.juniormod.block.ModBlocks;
import net.wbmjunior.juniormod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WBMJuniorMod implements ModInitializer {
	public static final String MOD_ID = "juniormod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
