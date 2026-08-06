package net.bounded.emlloy.block.natural;

import net.bounded.emlloy.CreateEmlloy;
import net.bounded.emlloy.item.alloytypes.Scrap;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DirtTypes {
    public static final DeferredRegister.Blocks DIRTTYPE = DeferredRegister.createBlocks(CreateEmlloy.MOD_ID);

    public static final DeferredBlock<Block> BURIED_SCRAP = registerBlock("buried_scrap",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .sound(SoundType.GRAVEL)
                    .strength(0.5F)));



    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = DIRTTYPE.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        Scrap.SCRAP.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        DIRTTYPE.register(eventBus);
    }
}
