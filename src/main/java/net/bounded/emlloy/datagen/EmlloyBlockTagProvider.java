package net.bounded.emlloy.datagen;

import net.bounded.emlloy.CreateEmlloy;
import net.bounded.emlloy.block.natural.DirtTypes;
import net.bounded.emlloy.item.alloytypes.Scrap;
import net.bounded.emlloy.item.util.EmlloyTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EmlloyBlockTagProvider extends BlockTagsProvider {
    public EmlloyBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CreateEmlloy.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(DirtTypes.BURIED_SCRAP.get());

        tag(EmlloyTags.Blocks.DIRT_REPLACEABLES)
                .add(Blocks.DIRT);
    }
}
