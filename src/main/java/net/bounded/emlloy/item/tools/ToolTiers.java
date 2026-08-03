package net.bounded.emlloy.item.tools;

import net.bounded.emlloy.item.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ToolTiers {
    public static final Tier BRASS = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_BRASS_TOOL,
            420, 7, 2.5f, 18, () -> Ingredient.of(ModTags.Items.BRASS_INGOT)
    );
    public static final Tier ANDESITE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ANDESITE_TOOL,
            330, 6.5f, 2.0f, 18, () -> Ingredient.of(ModTags.Items.ANDESITE_ALLOY)
    );

}
