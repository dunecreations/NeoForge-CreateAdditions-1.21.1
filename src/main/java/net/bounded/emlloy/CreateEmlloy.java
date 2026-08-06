package net.bounded.emlloy;

import net.bounded.emlloy.block.natural.DirtTypes;
import net.bounded.emlloy.init.EmlloyBucketItems;
import net.bounded.emlloy.init.EmlloyFluidBlocks;
import net.bounded.emlloy.init.EmlloyModFluidTypes;
import net.bounded.emlloy.init.EmlloyModFluids;
import net.bounded.emlloy.item.alloytypes.EMAlloys;
import net.bounded.emlloy.item.tools.BrokenCoatedTools;
import net.bounded.emlloy.item.tools.ForgedTools;
import net.bounded.emlloy.item.alloytypes.ModMineralItems;
import net.bounded.emlloy.item.tools.BrokenTools;
import net.bounded.emlloy.item.tools.FixedCoatedTools;
import net.bounded.emlloy.item.alloytypes.Scrap;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(CreateEmlloy.MOD_ID)
public class CreateEmlloy {
    public static final String MOD_ID = "emlloy";
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public CreateEmlloy(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);

        BrokenTools.register(modEventBus);
        BrokenCoatedTools.register(modEventBus);
        FixedCoatedTools.register(modEventBus);
        ModMineralItems.register(modEventBus);
        ForgedTools.register(modEventBus);
        Scrap.register(modEventBus);
        EMAlloys.register(modEventBus);
        DirtTypes.register(modEventBus);

        EmlloyFluidBlocks.REGISTRY.register(modEventBus);
        EmlloyBucketItems.REGISTRY.register(modEventBus);
        EmlloyModFluids.REGISTRY.register(modEventBus);
        EmlloyModFluidTypes.REGISTER.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // CRUCIAL ADDITION: Register your bucket's fluid capabilities
        modEventBus.addListener(this::registerCapabilities);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    // Tells NeoForge that your custom bucket item acts as a valid fluid container
    private void registerCapabilities(net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent event) {
        event.registerItem(
                net.neoforged.neoforge.capabilities.Capabilities.FluidHandler.ITEM,
                (itemStack, context) -> new net.neoforged.neoforge.fluids.capability.wrappers.FluidBucketWrapper(itemStack),
                EmlloyBucketItems.MOLTEN_METAL_BUCKET.get() // <-- Verifies that this matches your registered holder name
        );
        event.registerItem(
                net.neoforged.neoforge.capabilities.Capabilities.FluidHandler.ITEM,
                (itemStack, context) -> new net.neoforged.neoforge.fluids.capability.wrappers.FluidBucketWrapper(itemStack),
                EmlloyBucketItems.MOLTEN_BRASS_BUCKET.get() // <-- Verifies that this matches your registered holder name
        );
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(Scrap.RUSTED_SCRAP_METAL);
            event.accept(Scrap.SCRAP_METAL);
            event.accept(Scrap.RUSTED_SCRAP_METAL_SHEET);
            event.accept(Scrap.SCRAP_METAL_SHEET);

            event.accept(EMAlloys.PLAIN_COIN);
            event.accept(EMAlloys.TEN_CENTS);
            event.accept(EMAlloys.FIFTY_CENTS);
            event.accept(EMAlloys.ONE_FRITZ);
            event.accept(EMAlloys.TWO_FRITZ);
            event.accept(EMAlloys.FIVE_FRITZ);
            event.accept(EMAlloys.REFORGED_BRITZ);

            event.accept(BrokenTools.BROKEN_SWORD);
            event.accept(BrokenTools.BROKEN_AXE);
            event.accept(BrokenTools.BROKEN_PICKAXE);
            event.accept(BrokenTools.BROKEN_SHOVEL);
            event.accept(BrokenTools.BROKEN_HOE);

            event.accept(BrokenCoatedTools.BROKEN_COATED_SWORD);
            event.accept(BrokenCoatedTools.BROKEN_COATED_AXE);
            event.accept(BrokenCoatedTools.BROKEN_COATED_PICKAXE);
            event.accept(BrokenCoatedTools.BROKEN_COATED_SHOVEL);
            event.accept(BrokenCoatedTools.BROKEN_COATED_HOE);

            event.accept(FixedCoatedTools.FIXED_COATED_SWORD);
            event.accept(FixedCoatedTools.FIXED_COATED_AXE);
            event.accept(FixedCoatedTools.FIXED_COATED_PICKAXE);
            event.accept(FixedCoatedTools.FIXED_COATED_SHOVEL);
            event.accept(FixedCoatedTools.FIXED_COATED_HOE);

            event.accept(ForgedTools.BRASS_AXE);
            event.accept(ForgedTools.BRASS_PICKAXE);
            event.accept(ForgedTools.BRASS_SHOVEL);
            event.accept(ForgedTools.BRASS_HOE);

            event.accept(ForgedTools.ANDESITE_AXE);
            event.accept(ForgedTools.ANDESITE_PICKAXE);
            event.accept(ForgedTools.ANDESITE_SHOVEL);
            event.accept(ForgedTools.ANDESITE_HOE);
        }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(EMAlloys.REFORGED_IRON);
        }
        if(event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ForgedTools.BRASS_SWORD);
            event.accept(ForgedTools.ANDESITE_SWORD);

            event.accept(ForgedTools.BRASS_AXE);
            event.accept(ForgedTools.ANDESITE_AXE);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = CreateEmlloy.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
