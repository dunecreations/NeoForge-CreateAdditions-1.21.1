package net.dunecreations.createadditions.item.util;

import net.dunecreations.createadditions.CreateAdditions;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_BRASS_TOOL = createTag("needs_brass_tool");
        public static final TagKey<Block> INCORRECT_FOR_BRASS_TOOL = createTag("incorrect_for_brass_tool");

        public static final TagKey<Block> NEEDS_ANDESITE_TOOL = createTag("needs_and_andesite_tool");
        public static final TagKey<Block> INCORRECT_FOR_ANDESITE_TOOL = createTag("incorrect_for_andesite_tool");


        public static final TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(CreateAdditions.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> BRASS_INGOT = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("create", "brass_ingot"));
        public static final TagKey<Item> ANDESITE_ALLOY = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("create", "andesite_alloy"));


        public static final TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(CreateAdditions.MOD_ID, name));
        }
    }
}
