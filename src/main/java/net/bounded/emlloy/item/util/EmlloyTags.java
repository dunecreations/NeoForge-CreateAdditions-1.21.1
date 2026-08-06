package net.bounded.emlloy.item.util;

import net.bounded.emlloy.CreateEmlloy;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class EmlloyTags {
    public static class Blocks {
        public static TagKey<Block> DIRT_REPLACEABLES = createTag("dirt_replaceables");


        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(CreateEmlloy.MOD_ID, name));
        }
    }

    public static class Items {
        public static TagKey<Item> SCRAP = createTag("scrap");
        public static TagKey<Item> SCRAP_SHEET = createTag("scrap_sheet");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(CreateEmlloy.MOD_ID, name));
        }
    }
}
