package edwiresplus.registers;

import edwiresplus.EDWiresPlus;
import edwiresplus.common.SubtypeWirePlus;
import electrodynamics.prefab.utilities.ElectroTextUtils;
import electrodynamics.registers.ElectrodynamicsBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class EDWiresPlusCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EDWiresPlus.ID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EDWP = CREATIVE_TABS.register("edwiresplus",
            () -> CreativeModeTab.builder().title(ElectroTextUtils.creativeTab("ED Wires Plus"))
            .icon(() -> new ItemStack(EDWiresPlusBlocks.BLOCKS_WIRE.getValue(SubtypeWirePlus.insulatedcopperpurple))).build());
    
}
