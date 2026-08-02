package net.bounded.emlloy.item;

import net.bounded.emlloy.CreateEmlloy;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class EMAlloys {
    public static final DeferredRegister.Items ALLOYS = DeferredRegister.createItems(CreateEmlloy.MOD_ID);

    public static final DeferredItem<Item> REFORGED_IRON = ALLOYS.register("reforged_iron",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ALLOYS.register(eventBus);
    }
}
