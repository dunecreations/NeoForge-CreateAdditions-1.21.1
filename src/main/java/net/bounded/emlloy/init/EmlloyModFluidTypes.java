package net.bounded.emlloy.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.bounded.emlloy.fluid.types.MoltenMetalFluidType;
import net.bounded.emlloy.CreateEmlloy;

public class EmlloyModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, CreateEmlloy.MOD_ID);
	public static final DeferredHolder<FluidType, FluidType> MOLTEN_METAL_TYPE = REGISTRY.register("molten_metal",
			() -> new MoltenMetalFluidType());
}