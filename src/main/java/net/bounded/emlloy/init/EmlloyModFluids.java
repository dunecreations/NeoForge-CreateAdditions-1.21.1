package net.bounded.emlloy.init;

import net.bounded.emlloy.CreateEmlloy;
import net.bounded.emlloy.fluid.MoltenBrassFluid;
import net.bounded.emlloy.fluid.MoltenMetalFluid;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

public class EmlloyModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, CreateEmlloy.MOD_ID);

	public static final DeferredHolder<Fluid, FlowingFluid> MOLTEN_METAL = REGISTRY.register("molten_metal", () -> new MoltenMetalFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_MOLTEN_METAL = REGISTRY.register("molten_metal_flowing", () -> new MoltenMetalFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> MOLTEN_BRASS = REGISTRY.register("molten_brass", () -> new MoltenBrassFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_MOLTEN_BRASS = REGISTRY.register("molten_brass_flowing", () -> new MoltenBrassFluid.Flowing());

	@EventBusSubscriber(Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(MOLTEN_METAL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MOLTEN_METAL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(MOLTEN_BRASS.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MOLTEN_BRASS.get(), RenderType.translucent());
		}
	}
}