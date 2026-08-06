package net.bounded.emlloy.fluid;

import net.bounded.emlloy.init.EmlloyBucketItems;
import net.bounded.emlloy.init.EmlloyFluidBlocks;
import net.bounded.emlloy.init.EmlloyModFluidTypes;
import net.bounded.emlloy.init.EmlloyModFluids;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;

public abstract class MoltenBrassFluid extends BaseFlowingFluid {
	public static final Properties PROPERTIES = new Properties(() -> EmlloyModFluidTypes.MOLTEN_BRASS_TYPE.get(), () -> EmlloyModFluids.MOLTEN_BRASS.get(), () -> EmlloyModFluids.FLOWING_MOLTEN_BRASS.get())
			.explosionResistance(100f).tickRate(30).slopeFindDistance(2).bucket(() -> EmlloyBucketItems.MOLTEN_BRASS_BUCKET.get()).block(() -> (LiquidBlock) EmlloyFluidBlocks.MOLTEN_BRASS.get());

	private MoltenBrassFluid() {
		super(PROPERTIES);
	}

	public static class Source extends MoltenBrassFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MoltenBrassFluid {
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