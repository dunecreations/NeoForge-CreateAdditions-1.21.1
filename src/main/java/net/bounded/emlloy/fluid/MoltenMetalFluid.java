package net.bounded.emlloy.fluid;

import net.bounded.emlloy.init.EmlloyFluidBlocks;
import net.bounded.emlloy.init.EmlloyModFluidTypes;
import net.bounded.emlloy.init.EmlloyModFluids;
import net.bounded.emlloy.init.EmlloyBucketItems;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

public abstract class MoltenMetalFluid extends BaseFlowingFluid {
	public static final Properties PROPERTIES = new Properties(() -> EmlloyModFluidTypes.MOLTEN_METAL_TYPE.get(), () -> EmlloyModFluids.MOLTEN_METAL.get(), () -> EmlloyModFluids.FLOWING_MOLTEN_METAL.get())
			.explosionResistance(100f).tickRate(30).slopeFindDistance(2).bucket(() -> EmlloyBucketItems.MOLTEN_METAL_BUCKET.get()).block(() -> (LiquidBlock) EmlloyFluidBlocks.MOLTEN_METAL.get());

	private MoltenMetalFluid() {
		super(PROPERTIES);
	}

	public static class Source extends MoltenMetalFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MoltenMetalFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}