package net.bounded.emlloy.item;

import net.bounded.emlloy.init.EmlloyModFluids;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.BucketItem;

import net.bounded.emlloy.init.EmlloyModFluids;

public class MoltenMetalBucket extends BucketItem {
	public MoltenMetalBucket() {
		super(EmlloyModFluids.MOLTEN_METAL.get(), new Properties().craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}