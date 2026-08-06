package net.bounded.emlloy.datagen;

import net.bounded.emlloy.CreateEmlloy;
import net.bounded.emlloy.block.natural.DirtTypes;
import net.bounded.emlloy.item.alloytypes.Scrap;
import net.bounded.emlloy.item.util.EmlloyTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class EmlloyItemTagProvider extends ItemTagsProvider {
    public EmlloyItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, CreateEmlloy.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(EmlloyTags.Items.SCRAP)
                .add(Scrap.RUSTED_SCRAP_METAL.get())
                .add(Scrap.SCRAP_METAL.get());
        tag(EmlloyTags.Items.SCRAP_SHEET)
                .add(Scrap.RUSTED_SCRAP_METAL_SHEET.get())
                .add(Scrap.SCRAP_METAL_SHEET.get());
    }
}
