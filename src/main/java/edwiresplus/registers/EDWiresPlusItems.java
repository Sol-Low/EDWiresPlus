package edwiresplus.registers;

import edwiresplus.common.SubtypeWirePlus;
import electrodynamics.Electrodynamics;
import electrodynamics.common.blockitem.BlockItemWire;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import edwiresplus.EDWiresPlus;
import voltaic.api.creativetab.CreativeTabSupplier;
import voltaic.api.registration.BulkDeferredHolder;

import java.util.ArrayList;
import java.util.List;

public class EDWiresPlusItems {
    public static final DeferredRegister<Item> ITEMS;

    static {
        ITEMS = DeferredRegister.create(Registries.ITEM, EDWiresPlus.ID);
    }

    public static final BulkDeferredHolder<Item, BlockItemWire, SubtypeWirePlus> ITEMS_WIRE = new BulkDeferredHolder<>(SubtypeWirePlus.values(), subtype -> ITEMS.register(subtype.tag(), () -> new BlockItemWire(EDWiresPlusBlocks.BLOCKS_WIRE.getValue(subtype), new Item.Properties(), EDWiresPlusCreativeTabs.EDWP)));

    @EventBusSubscriber(value = Dist.CLIENT, modid = EDWiresPlus.ID, bus = EventBusSubscriber.Bus.MOD)
    private static class EDWPCreativeRegistry {

        @SubscribeEvent
        public static void registerItems(BuildCreativeModeTabContentsEvent event) {

            ITEMS.getEntries().forEach(reg -> {

                CreativeTabSupplier supplier = (CreativeTabSupplier) reg.get();

                if (supplier.hasCreativeTab() && supplier.isAllowedInCreativeTab(event.getTab())) {
                    List<ItemStack> toAdd = new ArrayList<>();
                    supplier.addCreativeModeItems(event.getTab(), toAdd);
                    event.acceptAll(toAdd);
                }

            });

        }

    }
}
