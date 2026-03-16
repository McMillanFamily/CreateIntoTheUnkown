package net.mcmillanfamily.citu;

import net.fabricmc.api.ModInitializer;

import net.mcmillanfamily.citu.block.ModBlocks;
import net.mcmillanfamily.citu.item.ModItemGroups;
import net.mcmillanfamily.citu.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateIntoTheUnknown implements ModInitializer {
	public static final String MOD_ID = "createintotheunknown";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
	}
}