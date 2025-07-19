package edwiresplus.registers;

import edwiresplus.EDWiresPlus;
import edwiresplus.common.BlockLogisticalWirePlus;
import edwiresplus.common.SubtypeWirePlus;
import electrodynamics.common.block.connect.BlockWire;
import electrodynamics.common.block.subtype.SubtypeWire;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredRegister;
import voltaic.api.registration.BulkDeferredHolder;


public class EDWiresPlusBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, EDWiresPlus.ID);

    public static final BulkDeferredHolder<Block, BlockWire, SubtypeWirePlus> BLOCKS_WIRE = new BulkDeferredHolder<>(SubtypeWirePlus.values(), subtype -> {
// Need to find a way to get BlockLogisticalWire to accept IWire based input
        if(subtype.getWireClass() == SubtypeWire.WireClass.LOGISTICAL) {

           return BLOCKS.register(subtype.tag(), () -> new BlockLogisticalWirePlus(subtype));
        }
        return BLOCKS.register(subtype.tag(), () -> new BlockWire(subtype));
    });
}
