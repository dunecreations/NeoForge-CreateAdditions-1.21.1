package net.bounded.emlloy.datagen;

import net.bounded.emlloy.block.natural.DirtTypes;
import net.bounded.emlloy.item.util.EmlloyTags;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.TagEntry;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class EmlloyBlockLootTableProvider extends BlockLootSubProvider {
    protected EmlloyBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
// Drops The Block Itself.
//        dropSelf(CaveMineralBlocks.EXAMPLE_BLOCK.get());


// Drops a Minimum to Maximum Amount of Item(s).
//        add(CaveMineralBlocks.TIDE_CRYSTAL_ORE.get(),
//                block -> createMultipleOreDrops(CaveMineralBlocks.TIDE_CRYSTAL_ORE.get(), CaveMineralItems.TIDE_CRYSTAL.get(), 1, 3));

// Drops ONE item from the specified Loot Table.
//        this.add(CampedBaitCrate.BASIC_BAIT_CRATE.get(),
//                block -> LootTable.lootTable().withPool(
//                        LootPool.lootPool()
//                                .setRolls(ConstantValue.exactly(1.0F))
//                                .add(TagEntry.expandTag(CPTags.Items.COMMON_BAIT))));

// Drops a Random Amount of an item from the specified Loot Table.
//        this.add(CampedBaitCrate.BASIC_BAIT_CRATE.get(),
//                block -> LootTable.lootTable().withPool(
//                        LootPool.lootPool()
//                                .setRolls(UniformGenerator.between(1.0F, 5.0f))
//

// Drops a Random Amount of an item from the specified Loot Table with a chance of another Block or Item or even another Loot Table.
//        this.add(CampedBaitCrate.BASIC_BAIT_CRATE.get(),
//                block -> LootTable.lootTable().withPool(
//                        LootPool.lootPool()
//                                .setRolls(UniformGenerator.between(1.0F, 5.0f))
//                                .add(TagEntry.expandTag(CPTags.Items.COMMON_BAIT).setWeight(50)
//                                .add(LootItem.lootTableItem(DirtTypes.BURIED_SCRAP.get()).setWeight(50))));

        this.add(DirtTypes.BURIED_SCRAP.get(),
                block -> LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(UniformGenerator.between(1.0F, 2.0F))
                                .add(TagEntry.expandTag(EmlloyTags.Items.SCRAP).setWeight(50))
                                .add(LootItem.lootTableItem(DirtTypes.BURIED_SCRAP.get()).setWeight(50))
                        ));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return DirtTypes.DIRTTYPE.getEntries().stream().map(Holder::value)::iterator;
    }
}
