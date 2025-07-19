package edwiresplus.common;

import electrodynamics.common.block.connect.BlockLogisticalWire;
import electrodynamics.common.block.connect.BlockWire;
import voltaic.api.network.cable.type.IWire;
import com.mojang.serialization.MapCodec;
import electrodynamics.common.block.subtype.SubtypeWire;
import electrodynamics.common.tile.electricitygrid.TileLogisticalWire;
import java.util.HashSet;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.Property;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import voltaic.common.block.states.VoltaicBlockStates;
import voltaic.prefab.utilities.math.Color;

public class BlockLogisticalWirePlus extends BlockWire {

    public static final Color REDSTONE_ON = new Color(211, 5, 5, 255);
    public static final Color REDSTONE_OFF = new Color(124, 25, 25, 255);
    public static final HashSet<Block> WIRES = new HashSet();

    public BlockLogisticalWirePlus(IWire wire) {
        super(wire);
        WIRES.add(this);
        ((BlockState)this.stateDefinition.any()).setValue(VoltaicBlockStates.LIT, false);
    }

    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(new Property[]{VoltaicBlockStates.LIT});
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockState superState = super.getStateForPlacement(context);
        return (BlockState)superState.setValue(VoltaicBlockStates.LIT, false);
    }

    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new TileLogisticalWirePlus(pos, state);
    }

    protected MapCodec<? extends BaseEntityBlock> codec() {
        throw new UnsupportedOperationException("Need to implement CODEC");
    }

    @EventBusSubscriber(
            value = {Dist.CLIENT},
            modid = "electrodynamics",
            bus = Bus.MOD
    )
    private static class ColorHandler {
        @SubscribeEvent
        public static void registerColoredBlocks(RegisterColorHandlersEvent.Block event) {
            BlockLogisticalWirePlus.WIRES.forEach((block) -> event.register((state, level, pos, tintIndex) -> {
                if (tintIndex == 0) {
                    return ((BlockLogisticalWirePlus)block).wire.getWireColor().getColor().color();
                } else if (tintIndex != 1) {
                    return -1;
                } else {
                    return (Boolean)state.getValue(VoltaicBlockStates.LIT) ? BlockLogisticalWirePlus.REDSTONE_ON.color() : BlockLogisticalWirePlus.REDSTONE_OFF.color();
                }
            }, new Block[]{block}));
        }
    }
}

