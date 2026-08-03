package net.bounded.emlloy.item.alloytypes;

import net.bounded.emlloy.CreateEmlloy;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModMineralItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateEmlloy.MOD_ID);

//    public static final DeferredItem<Item> EXAMPLE_MINERAL = ITEMS.register("example_mineral",
//            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
