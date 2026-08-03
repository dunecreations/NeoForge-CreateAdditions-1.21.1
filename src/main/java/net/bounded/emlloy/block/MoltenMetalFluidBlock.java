package net.bounded.emlloy.block;

import net.bounded.emlloy.init.EmlloyModFluids;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class MoltenMetalFluidBlock extends LiquidBlock {
	public MoltenMetalFluidBlock() {
		super(EmlloyModFluids.MOLTEN_METAL.get(),
				Properties.of().mapColor(MapColor.COLOR_BLACK).strength(100f).lightLevel(s -> 4).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 7;
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}