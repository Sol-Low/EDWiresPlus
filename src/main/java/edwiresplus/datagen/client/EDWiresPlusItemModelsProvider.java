package edwiresplus.datagen.client;

import edwiresplus.EDWiresPlus;
import edwiresplus.common.SubtypeWirePlus;
import edwiresplus.datagen.DataGeneratorsPlus;
import edwiresplus.registers.EDWiresPlusItems;
import edwiresplus.common.SubtypeWirePlus.*;
import electrodynamics.common.block.subtype.SubtypeWire.*;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import voltaic.datagen.utils.client.BaseItemModelsProvider;


public class EDWiresPlusItemModelsProvider extends BaseItemModelsProvider {
    public EDWiresPlusItemModelsProvider(PackOutput output, ExistingFileHelper existingFileHelper){
        super(output, existingFileHelper, EDWiresPlus.ID);
    }

    @Override
    protected void registerModels() {
        for (SubtypeWirePlus wire : DataGeneratorsPlus.getWires(WireMaterial.values(), InsulationMaterial.WOOL, WireClass.INSULATED, WireColorPlus.values())) {
            layeredItem(EDWiresPlusItems.ITEMS_WIRE.getValue(wire), Parent.GENERATED, itemLoc("wire/wireinsulated" + wire.getWireMaterial().toString()), itemLoc("wire/wireinsulatedcoil"));
        }

        // logistical
        for (SubtypeWirePlus wire : DataGeneratorsPlus.getWires(WireMaterial.values(), InsulationMaterial.WOOL, WireClass.LOGISTICAL, WireColorPlus.values())) {
            layeredItem(EDWiresPlusItems.ITEMS_WIRE.getValue(wire), Parent.GENERATED, itemLoc("wire/wirelogistics" + wire.getWireMaterial().toString()), itemLoc("wire/wirelogisticscoil"), itemLoc("wire/wirelogisticsredstone"));
        }

        // ceramic
        for (SubtypeWirePlus wire : DataGeneratorsPlus.getWires(WireMaterial.values(), InsulationMaterial.CERAMIC, WireClass.CERAMIC, WireColorPlus.values())) {
            layeredItem(EDWiresPlusItems.ITEMS_WIRE.getValue(wire), Parent.GENERATED, itemLoc("wire/wireceramicinsulated" + wire.getWireMaterial().toString()), itemLoc("wire/wireceramicinsulatedcolortips"), itemLoc("wire/wireceramicinsulatedcoil"));
        }

        // highly insulated
        for (SubtypeWirePlus wire : DataGeneratorsPlus.getWires(WireMaterial.values(), InsulationMaterial.THICK_WOOL, WireClass.THICK, WireColorPlus.values())) {
            layeredItem(EDWiresPlusItems.ITEMS_WIRE.getValue(wire), Parent.GENERATED, itemLoc("wire/wirehighlyinsulated" + wire.getWireMaterial().toString()), itemLoc("wire/wirehighlyinsulatedcoil"));
        }
    }
}
