package net.bounded.emlloy.fluid.types;

import net.bounded.emlloy.CreateEmlloy; // Double-check your main mod class import
import net.bounded.emlloy.init.EmlloyModFluidTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.pathfinder.PathType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidType;

// CRUCIAL FIX: Specify your MOD_ID and target the MOD event bus, otherwise this event never fires.
@EventBusSubscriber(modid = CreateEmlloy.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class MoltenBrassFluidType extends FluidType {
	public MoltenBrassFluidType() {
		super(Properties.create().canSwim(false).canDrown(false).pathType(PathType.LAVA).adjacentPathType(null).motionScale(0.007D).lightLevel(2).temperature(1000).canConvertToSource(true)
				.sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL).sound(SoundActions.BUCKET_EMPTY, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.bucket.empty_lava")))
				.sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH));
	}

	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
			private static final ResourceLocation STILL_TEXTURE = ResourceLocation.parse("emlloy:block/molten_brass_still");
			private static final ResourceLocation FLOWING_TEXTURE = ResourceLocation.parse("emlloy:block/molten_brass_flow");

			@Override
			public ResourceLocation getStillTexture() {
				return STILL_TEXTURE;
			}

			@Override
			public ResourceLocation getFlowingTexture() {
				return FLOWING_TEXTURE;
			}
		}, EmlloyModFluidTypes.MOLTEN_BRASS_TYPE.get());
	}
}
