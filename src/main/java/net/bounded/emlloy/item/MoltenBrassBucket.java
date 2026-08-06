package net.bounded.emlloy.item;

import net.bounded.emlloy.init.EmlloyModFluids;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Items;

public class MoltenBrassBucket extends BucketItem {
	public MoltenBrassBucket() {
		super(EmlloyModFluids.MOLTEN_BRASS.get(), new Properties().craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}