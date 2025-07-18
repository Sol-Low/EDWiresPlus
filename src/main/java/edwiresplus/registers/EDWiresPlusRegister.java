package edwiresplus.registers;

import net.neoforged.bus.api.IEventBus;

public class EDWiresPlusRegister {
    public static void register(IEventBus bus){
        EDWiresPlusCreativeTabs.CREATIVE_TABS.register(bus);
        EDWiresPlusBlocks.BLOCKS.register(bus);
        EDWiresPlusItems.ITEMS.register(bus);
    }
}
