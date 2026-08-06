package net.bounded.emlloy.worldgen;

import net.bounded.emlloy.CreateEmlloy;
import net.bounded.emlloy.block.natural.DirtTypes;
import net.bounded.emlloy.item.util.EmlloyTags;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class EmlloyConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BURIED_SCRAP_KEY = registerKey("buried_scrap");


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        RuleTest dirtReplaceables = new TagMatchTest(EmlloyTags.Blocks.DIRT_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldDirtOres = List.of(
                OreConfiguration.target(dirtReplaceables, DirtTypes.BURIED_SCRAP.get().defaultBlockState())
        );

        register(context, OVERWORLD_BURIED_SCRAP_KEY, Feature.ORE, new  OreConfiguration(overworldDirtOres, 15));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(CreateEmlloy.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
