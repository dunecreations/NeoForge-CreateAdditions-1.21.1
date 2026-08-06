package net.bounded.emlloy.item.tools;

import net.bounded.emlloy.CreateEmlloy;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class FixedCoatedTools {
    public static final DeferredRegister.Items FIXEDCOATED = DeferredRegister.createItems(CreateEmlloy.MOD_ID);

    public static final DeferredItem<Item> FIXED_COATED_SWORD = FIXEDCOATED.register("fixed_coated_sword",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIXED_COATED_AXE = FIXEDCOATED.register("fixed_coated_axe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIXED_COATED_PICKAXE = FIXEDCOATED.register("fixed_coated_pickaxe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIXED_COATED_SHOVEL = FIXEDCOATED.register("fixed_coated_shovel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIXED_COATED_HOE = FIXEDCOATED.register("fixed_coated_hoe",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        FIXEDCOATED.register(eventBus);
    }
}
