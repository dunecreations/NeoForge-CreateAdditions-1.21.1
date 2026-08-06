/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bounded.emlloy.init;

import net.bounded.emlloy.CreateEmlloy;
import net.bounded.emlloy.block.MoltenBrassFluidBlock;
import net.bounded.emlloy.block.MoltenMetalFluidBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

public class EmlloyFluidBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CreateEmlloy.MOD_ID);

	public static final DeferredBlock<Block> MOLTEN_METAL;
	static {
		MOLTEN_METAL = REGISTRY.register("molten_metal", MoltenMetalFluidBlock::new);
	}
	public static final DeferredBlock<Block> MOLTEN_BRASS;
	static {
		MOLTEN_BRASS = REGISTRY.register("molten_brass", MoltenBrassFluidBlock::new);
	}
}