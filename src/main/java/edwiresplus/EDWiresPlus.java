package edwiresplus;

import edwiresplus.registers.EDWiresPlusBlocks;
import electrodynamics.common.block.connect.BlockWire;
import electrodynamics.common.eventbus.RegisterWiresEvent;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import edwiresplus.registers.EDWiresPlusRegister;

@Mod("edwiresplus")
@EventBusSubscriber(
        modid = "edwiresplus",
        bus = Bus.MOD
)

public class EDWiresPlus {
    public static final String ID = "edwiresplus";
    public static final String NAME = "Electrodynamics Wires Plus";

    public EDWiresPlus(IEventBus bus){
        EDWiresPlusRegister.register(bus);
    }

    @SubscribeEvent
    public static void registerWires(RegisterWiresEvent event) {
        for (BlockWire wire : EDWiresPlusBlocks.BLOCKS_WIRE.getAllValues()) event.registerWire(wire);
    }

    public static ResourceLocation rl(String path) {
        return ResourceLocation.fromNamespaceAndPath(ID, path);
    }
}


