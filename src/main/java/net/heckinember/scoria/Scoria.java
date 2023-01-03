package net.heckinember.scoria;

import net.fabricmc.api.ModInitializer;
import net.heckinember.scoria.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Scoria implements ModInitializer {
	public static final String MOD_ID = "scoria";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();

	}
}
