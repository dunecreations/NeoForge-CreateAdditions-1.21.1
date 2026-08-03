package net.bounded.emlloy.item.tools;

import net.bounded.emlloy.CreateEmlloy;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BrokenCoatedTools {
    public static final DeferredRegister.Items BROKENCOATED = DeferredRegister.createItems(CreateEmlloy.MOD_ID);

    public static final DeferredItem<Item> BROKEN_COATED_SWORD = BROKENCOATED.register("broken_coated_sword",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BROKEN_COATED_AXE = BROKENCOATED.register("broken_coated_axe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BROKEN_COATED_PICKAXE = BROKENCOATED.register("broken_coated_pickaxe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BROKEN_COATED_SHOVEL = BROKENCOATED.register("broken_coated_shovel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BROKEN_COATED_HOE = BROKENCOATED.register("broken_coated_hoe",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        BROKENCOATED.register(eventBus);
    }
}
