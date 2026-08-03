/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bounded.emlloy.init;

import net.bounded.emlloy.CreateEmlloy;
import net.bounded.emlloy.item.MoltenMetalBucket;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Item;

public class EmlloyBucketItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CreateEmlloy.MOD_ID);
	public static final DeferredItem<Item> MOLTEN_METAL_BUCKET;
	static {
		MOLTEN_METAL_BUCKET = REGISTRY.register("molten_metal_bucket", MoltenMetalBucket::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.FluidHandler.ITEM, (stack, context) -> new FluidBucketWrapper(stack), MOLTEN_METAL_BUCKET.get());
	}
}