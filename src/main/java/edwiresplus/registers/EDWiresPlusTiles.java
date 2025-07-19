package edwiresplus.registers;

import edwiresplus.EDWiresPlus;
import edwiresplus.common.BlockLogisticalWirePlus;
import edwiresplus.common.TileLogisticalWirePlus;
import electrodynamics.registers.ElectrodynamicsTiles;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class EDWiresPlusTiles extends ElectrodynamicsTiles {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, EDWiresPlus.ID);
    
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<TileLogisticalWirePlus>> TILE_LOGISTICALWIREPLUS =
            BLOCK_ENTITY_TYPES.register("wirelogisticaltileplus",
                    () -> new BlockEntityType<>(TileLogisticalWirePlus::new, BlockLogisticalWirePlus.WIRES, null));
}
