package net.bounded.emlloy.item.alloytypes;

import net.bounded.emlloy.CreateEmlloy;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.ItemLore;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class EMAlloys {
    public static final DeferredRegister.Items ALLOYS = DeferredRegister.createItems(CreateEmlloy.MOD_ID);

    public static final DeferredItem<Item> REFORGED_IRON = ALLOYS.register("reforged_iron",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PLAIN_COIN = ALLOYS.register("plain_coin",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TEN_CENTS = ALLOYS.register("ten_cents",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIFTY_CENTS = ALLOYS.register("fifty_cents",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ONE_FRITZ = ALLOYS.register("one_fritz",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TWO_FRITZ = ALLOYS.register("two_fritz",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIVE_FRITZ = ALLOYS.register("five_fritz",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> REFORGED_BRITZ = ALLOYS.register("reforged_britz",
            () -> new Item(new Item.Properties()
                    .component(DataComponents.LORE, new ItemLore(
                            List.of(
                                    Component.translatable("item.emlloy.reforged_britz.lore.line1")
                            )))));


    public static void register(IEventBus eventBus) {
        ALLOYS.register(eventBus);
    }
}
