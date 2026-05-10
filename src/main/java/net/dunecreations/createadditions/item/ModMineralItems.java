package net.dunecreations.createadditions.item;

import net.dunecreations.createadditions.CreateAdditions;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModMineralItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateAdditions.MOD_ID);

    public static final DeferredItem<Item> RAW_DARKSTEEL = ITEMS.register("raw_darksteel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DARKSTEEL_INGOT = ITEMS.register("darksteel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRINECORE_SHARD = ITEMS.register("brinecore_shard",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIDE_CRYSTAL = ITEMS.register("tide_crystal",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
