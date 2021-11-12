package net.rad1osketxh.gptmc;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rad1osketxh.gptmc.items.Brain;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GPTMC implements ModInitializer {
    //    What will GPTMC do?

    public static final Logger LOGGER = LogManager.getLogger("gptmc");

    // Initialize Items
    public static final Item BRAIN = new Brain(new FabricItemSettings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        // setup
        LOGGER.info("Loading...");

        // Register Items
        Registry.register(Registry.ITEM, new Identifier("gptmc", "brain"), BRAIN);

        LOGGER.info("Done!");
    }
}
