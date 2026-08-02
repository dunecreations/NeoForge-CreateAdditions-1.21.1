package net.bounded.emlloy.item.scrap;

import net.bounded.emlloy.CreateEmlloy;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BrokenTools {
    public static final DeferredRegister.Items BROKEN = DeferredRegister.createItems(CreateEmlloy.MOD_ID);

    public static final DeferredItem<Item> BROKEN_SWORD = BROKEN.register("broken_sword",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BROKEN_AXE = BROKEN.register("broken_axe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BROKEN_PICKAXE = BROKEN.register("broken_pickaxe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BROKEN_SHOVEL = BROKEN.register("broken_shovel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BROKEN_HOE = BROKEN.register("broken_hoe",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        BROKEN.register(eventBus);
    }
}
