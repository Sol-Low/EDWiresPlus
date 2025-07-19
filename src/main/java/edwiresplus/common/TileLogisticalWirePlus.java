package edwiresplus.common;

import edwiresplus.registers.EDWiresPlusTiles;
import electrodynamics.common.network.type.ElectricNetwork;
import electrodynamics.common.tile.electricitygrid.TileWire;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import voltaic.prefab.tile.components.type.ComponentTickable;
import voltaic.prefab.utilities.BlockEntityUtils;

public class TileLogisticalWirePlus extends TileWire {
    public boolean isPowered = false;

    public TileLogisticalWirePlus(BlockPos pos, BlockState state) {
        super((BlockEntityType)EDWiresPlusTiles.TILE_LOGISTICALWIREPLUS.get(), pos, state);
        this.forceComponent(new ComponentTickable(this).tickServer(this::tickServer).tickClient(this::tickClient));
    }

    private void tickClient(ComponentTickable componentTickable) {
    }

    protected void tickServer(ComponentTickable component) {
        if (component.getTicks() % 10L == 0L) {
            boolean shouldPower = ((ElectricNetwork)this.getNetwork()).getActiveTransmitted() > (double)0.0F;
            if (shouldPower != this.isPowered) {
                this.isPowered = shouldPower;
                this.level.updateNeighborsAt(this.worldPosition, this.getBlockState().getBlock());
                BlockEntityUtils.updateLit(this, this.isPowered);
            }
        }

    }
}