package net.dunecreations.createadditions.item;

import net.dunecreations.createadditions.CreateAdditions;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModTools {
// Brass
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateAdditions.MOD_ID);

    public static final DeferredItem<SwordItem> BRASS_SWORD = ITEMS.register("brass_sword",
            () -> new SwordItem(ModToolTiers.BRASS, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.BRASS, 7, 1.65f))));
    public static final DeferredItem<AxeItem> BRASS_AXE = ITEMS.register("brass_axe",
            () -> new AxeItem(ModToolTiers.BRASS, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.BRASS, 9F, 0.95f))));
    public static final DeferredItem<PickaxeItem> BRASS_PICKAXE = ITEMS.register("brass_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BRASS, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.BRASS, 5F, 1.25f))));
    public static final DeferredItem<ShovelItem> BRASS_SHOVEL = ITEMS.register("brass_shovel",
            () -> new ShovelItem(ModToolTiers.BRASS, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.BRASS, 5F, 1.05f))));
    public static final DeferredItem<HoeItem> BRASS_HOE = ITEMS.register("brass_hoe",
            () -> new HoeItem(ModToolTiers.BRASS, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.BRASS, 1F, 1.65f))));
// Andesite
    public static final DeferredItem<SwordItem> ANDESITE_SWORD = ITEMS.register("andesite_sword",
            () -> new SwordItem(ModToolTiers.ANDESITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ANDESITE, 4, 1.65f))));
    public static final DeferredItem<AxeItem> ANDESITE_AXE = ITEMS.register("andesite_axe",
            () -> new AxeItem(ModToolTiers.ANDESITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ANDESITE, 6F, 0.95f))));
    public static final DeferredItem<PickaxeItem> ANDESITE_PICKAXE = ITEMS.register("andesite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ANDESITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ANDESITE, 2F, 1.25f))));
    public static final DeferredItem<ShovelItem> ANDESITE_SHOVEL = ITEMS.register("andesite_shovel",
            () -> new ShovelItem(ModToolTiers.ANDESITE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.ANDESITE, 2F, 1.05f))));
    public static final DeferredItem<HoeItem> ANDESITE_HOE = ITEMS.register("andesite_hoe",
            () -> new HoeItem(ModToolTiers.ANDESITE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.ANDESITE, 0.2F, 1.65f))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
