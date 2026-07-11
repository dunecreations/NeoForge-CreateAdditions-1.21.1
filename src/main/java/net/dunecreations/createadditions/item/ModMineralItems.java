package net.dunecreations.createadditions.item;

import net.dunecreations.createadditions.CreateAdditions;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModMineralItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateAdditions.MOD_ID);

//    public static final DeferredItem<Item> EXAMPLE_MINERAL = ITEMS.register("example_mineral",
//            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
