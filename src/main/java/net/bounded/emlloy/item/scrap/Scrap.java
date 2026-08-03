package net.bounded.emlloy.item.scrap;

import net.bounded.emlloy.CreateEmlloy;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Scrap {
    public static final DeferredRegister.Items SCRAP = DeferredRegister.createItems(CreateEmlloy.MOD_ID);

    public static final DeferredItem<Item> RUSTED_SCRAP_METAL = SCRAP.register("rusted_scrap_metal",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SCRAP_METAL = SCRAP.register("scrap_metal",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RUSTED_SCRAP_METAL_SHEET = SCRAP.register("rusted_scrap_metal_sheet",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SCRAP_METAL_SHEET = SCRAP.register("scrap_metal_sheet",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        SCRAP.register(eventBus);
    }
}
