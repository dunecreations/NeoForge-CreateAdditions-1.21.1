package net.bounded.emlloy.datagen;

import net.bounded.emlloy.CreateEmlloy;
import net.bounded.emlloy.worldgen.EmlloyBiomeModifiers;
import net.bounded.emlloy.worldgen.EmlloyConfiguredFeatures;
import net.bounded.emlloy.worldgen.EmlloyPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class EmlloyDatapackProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, EmlloyConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, EmlloyPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, EmlloyBiomeModifiers::bootstrap);

    public EmlloyDatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(CreateEmlloy.MOD_ID));
    }
}
