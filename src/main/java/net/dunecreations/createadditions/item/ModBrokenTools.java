package net.dunecreations.createadditions.item;

import net.dunecreations.createadditions.CreateAdditions;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBrokenTools {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateAdditions.MOD_ID);

    public static final DeferredItem<Item> BROKEN_SWORD = ITEMS.register("broken_sword",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BROKEN_AXE = ITEMS.register("broken_axe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BROKEN_PICKAXE = ITEMS.register("broken_pickaxe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BROKEN_SHOVEL = ITEMS.register("broken_shovel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BROKEN_HOE = ITEMS.register("broken_hoe",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
