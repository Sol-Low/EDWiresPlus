package edwiresplus.datagen.server.tags.types;

import edwiresplus.EDWiresPlus;
import edwiresplus.common.SubtypeWirePlus.*;
import edwiresplus.datagen.DataGeneratorsPlus;
import edwiresplus.registers.EDWiresPlusItems;
import electrodynamics.common.block.subtype.SubtypeWire.*;
import electrodynamics.common.blockitem.BlockItemWire;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import voltaic.common.tags.VoltaicTags;

import java.util.concurrent.CompletableFuture;

public class EDWiresPlusItemTagsProvider extends ItemTagsProvider {
    public EDWiresPlusItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider provider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, provider.contentsGetter(), EDWiresPlus.ID, existingFileHelper);
    }


    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(VoltaicTags.Items.INSULATED_TIN_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.TIN }, InsulationMaterial.WOOL, WireClass.INSULATED, WireColorPlus.values())));

        tag(VoltaicTags.Items.INSULATED_SILVER_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.SILVER }, InsulationMaterial.WOOL, WireClass.INSULATED, WireColorPlus.values())));

        tag(VoltaicTags.Items.INSULATED_COPPER_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.COPPER }, InsulationMaterial.WOOL, WireClass.INSULATED, WireColorPlus.values())));

        tag(VoltaicTags.Items.INSULATED_GOLD_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.GOLD }, InsulationMaterial.WOOL, WireClass.INSULATED, WireColorPlus.values())));

        tag(VoltaicTags.Items.INSULATED_IRON_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.IRON }, InsulationMaterial.WOOL, WireClass.INSULATED, WireColorPlus.values())));

        tag(VoltaicTags.Items.INSULATED_SUPERCONDUCTIVE_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.SUPERCONDUCTIVE }, InsulationMaterial.WOOL, WireClass.INSULATED, WireColorPlus.values())));

        tag(VoltaicTags.Items.THICK_TIN_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.TIN }, InsulationMaterial.THICK_WOOL, WireClass.THICK, WireColorPlus.values())));

        tag(VoltaicTags.Items.THICK_SILVER_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.SILVER }, InsulationMaterial.THICK_WOOL, WireClass.THICK, WireColorPlus.values())));

        tag(VoltaicTags.Items.THICK_COPPER_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.COPPER }, InsulationMaterial.THICK_WOOL, WireClass.THICK, WireColorPlus.values())));

        tag(VoltaicTags.Items.THICK_GOLD_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.GOLD }, InsulationMaterial.THICK_WOOL, WireClass.THICK, WireColorPlus.values())));

        tag(VoltaicTags.Items.THICK_IRON_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.IRON }, InsulationMaterial.THICK_WOOL, WireClass.THICK, WireColorPlus.values())));

        tag(VoltaicTags.Items.THICK_SUPERCONDUCTIVE_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.SUPERCONDUCTIVE }, InsulationMaterial.THICK_WOOL, WireClass.THICK, WireColorPlus.values())));

        tag(VoltaicTags.Items.CERAMIC_TIN_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.TIN }, InsulationMaterial.CERAMIC, WireClass.CERAMIC, WireColorPlus.values())));

        tag(VoltaicTags.Items.CERAMIC_SILVER_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.SILVER }, InsulationMaterial.CERAMIC, WireClass.CERAMIC, WireColorPlus.values())));

        tag(VoltaicTags.Items.CERAMIC_COPPER_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.COPPER }, InsulationMaterial.CERAMIC, WireClass.CERAMIC, WireColorPlus.values())));

        tag(VoltaicTags.Items.CERAMIC_GOLD_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.GOLD }, InsulationMaterial.CERAMIC, WireClass.CERAMIC, WireColorPlus.values())));

        tag(VoltaicTags.Items.CERAMIC_IRON_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.IRON }, InsulationMaterial.CERAMIC, WireClass.CERAMIC, WireColorPlus.values())));

        tag(VoltaicTags.Items.CERAMIC_SUPERCONDUCTIVE_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.SUPERCONDUCTIVE }, InsulationMaterial.CERAMIC, WireClass.CERAMIC, WireColorPlus.values())));

        tag(VoltaicTags.Items.LOGISTICAL_TIN_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.TIN }, InsulationMaterial.WOOL, WireClass.LOGISTICAL, WireColorPlus.values())));

        tag(VoltaicTags.Items.LOGISTICAL_SILVER_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.SILVER }, InsulationMaterial.WOOL, WireClass.LOGISTICAL, WireColorPlus.values())));

        tag(VoltaicTags.Items.LOGISTICAL_COPPER_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.COPPER }, InsulationMaterial.WOOL, WireClass.LOGISTICAL, WireColorPlus.values())));

        tag(VoltaicTags.Items.LOGISTICAL_GOLD_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.GOLD }, InsulationMaterial.WOOL, WireClass.LOGISTICAL, WireColorPlus.values())));

        tag(VoltaicTags.Items.LOGISTICAL_IRON_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.IRON }, InsulationMaterial.WOOL, WireClass.LOGISTICAL, WireColorPlus.values())));

        tag(VoltaicTags.Items.LOGISTICAL_SUPERCONDUCTIVE_WIRES).add(EDWiresPlusItems.ITEMS_WIRE.getSpecificValuesArray(new BlockItemWire[0], DataGeneratorsPlus.getWires(new WireMaterial[] { WireMaterial.SUPERCONDUCTIVE }, InsulationMaterial.WOOL, WireClass.LOGISTICAL, WireColorPlus.values())));

    }
}
