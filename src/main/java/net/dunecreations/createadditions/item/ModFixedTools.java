package net.dunecreations.createadditions.item;

import net.dunecreations.createadditions.CreateAdditions;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModFixedTools {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateAdditions.MOD_ID);

    public static final DeferredItem<Item> FIXED_SWORD = ITEMS.register("fixed_sword",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIXED_AXE = ITEMS.register("fixed_axe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIXED_PICKAXE = ITEMS.register("fixed_pickaxe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIXED_SHOVEL = ITEMS.register("fixed_shovel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIXED_HOE = ITEMS.register("fixed_hoe",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
