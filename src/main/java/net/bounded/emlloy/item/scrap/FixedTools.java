package net.bounded.emlloy.item.scrap;

import net.bounded.emlloy.CreateEmlloy;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class FixedTools {
    public static final DeferredRegister.Items FIXED = DeferredRegister.createItems(CreateEmlloy.MOD_ID);

    public static final DeferredItem<Item> FIXED_SWORD = FIXED.register("fixed_sword",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIXED_AXE = FIXED.register("fixed_axe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIXED_PICKAXE = FIXED.register("fixed_pickaxe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIXED_SHOVEL = FIXED.register("fixed_shovel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIXED_HOE = FIXED.register("fixed_hoe",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        FIXED.register(eventBus);
    }
}
