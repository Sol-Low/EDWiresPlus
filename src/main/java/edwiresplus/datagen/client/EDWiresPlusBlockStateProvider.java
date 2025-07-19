package edwiresplus.datagen.client;

import edwiresplus.EDWiresPlus;
import edwiresplus.common.SubtypeWirePlus;
import edwiresplus.datagen.DataGeneratorsPlus;
import edwiresplus.registers.EDWiresPlusBlocks;
import electrodynamics.common.block.subtype.SubtypeWire.*;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import voltaic.datagen.utils.client.BaseBlockstateProvider;

public class EDWiresPlusBlockStateProvider extends BaseBlockstateProvider {
    private final ExistingFileHelper helper;
    public EDWiresPlusBlockStateProvider(PackOutput output, ExistingFileHelper helper){
        super(output, helper, EDWiresPlus.ID);
        this.helper = helper;
    }

    @Override
    protected void registerStatesAndModels() {

         genWires();
    }

    private void genWires(){

        String parent = "parent/";
        String name = "block/wire/";
        String texture = "wire/";

        ExistingFileHelper helper = this.helper;
        for(SubtypeWirePlus wire : DataGeneratorsPlus.getWires(WireMaterial.values(), InsulationMaterial.WOOL, WireClass.INSULATED, SubtypeWirePlus.WireColorPlus.values())) {
            wire(EDWiresPlusBlocks.BLOCKS_WIRE.getValue(wire),
                    models().withExistingParent(name + wire.tag() + "_none", modLoc(parent + "insulatedwire_none")).texture("conductor", blockLoc(texture + wire.getWireMaterial().toString() + "_center")).texture("insulation", blockLoc(texture + "insulationwool_center")).texture("particle", "#insulation").renderType("cutout"), //
                    models().withExistingParent(name + wire.tag() + "_side", modLoc(parent + "insulatedwire_side")).texture("insulation", blockLoc(texture + "insulationwool")).texture("particle", "#conductor").renderType("cutout"), //
                    false);
        }
        for(SubtypeWirePlus wire : DataGeneratorsPlus.getWires(WireMaterial.values(), InsulationMaterial.WOOL, WireClass.LOGISTICAL, SubtypeWirePlus.WireColorPlus.values())) {
            wire(EDWiresPlusBlocks.BLOCKS_WIRE.getValue(wire),
                    models().withExistingParent(name + wire.tag() + "_none", modLoc(parent + "logisticswire_none")).texture("conductor", blockLoc(texture+ "logisticswire" + wire.getWireMaterial().toString())).texture("insulation", blockLoc(texture + "logisticswireinsulation_center")).texture("particle", "#insulation").texture("redstone", blockLoc(texture + "logisticswireredstone_center")).renderType("cutout"), //
                    models().withExistingParent(name + wire.tag() + "_side", modLoc(parent + "logisticswire_side")).texture("insulation", blockLoc(texture + "logisticswireinsulation_side")).texture("particle", "#insulation").texture("redstone", blockLoc(texture + "logisticswireredstone_side")).renderType("cutout"), //
                    false);
        }
        for(SubtypeWirePlus wire : DataGeneratorsPlus.getWires(WireMaterial.values(), InsulationMaterial.CERAMIC, WireClass.CERAMIC, SubtypeWirePlus.WireColorPlus.values())) {
            wire(EDWiresPlusBlocks.BLOCKS_WIRE.getValue(wire),
                    models().withExistingParent(name + wire.tag() + "_none", modLoc(parent + "ceramicinsulatedwire_none")).texture("conductor", blockLoc(texture + wire.getWireMaterial().toString() + "_center")).texture("insulation", blockLoc(texture + "insulationceramic_center_base")).texture("particle", "#insulation").renderType("cutout"), //
                    models().withExistingParent(name + wire.tag() + "_side", modLoc(parent + "ceramicinsulatedwire_side")).texture("insulationbase", blockLoc(texture + "insulationceramic_base")).texture("insulationcolor", blockLoc(texture + "insulationceramic")).texture("particle", "#insulationcolor").renderType("cutout"), //
                    false);
        }
        for(SubtypeWirePlus wire : DataGeneratorsPlus.getWires(WireMaterial.values(), InsulationMaterial.THICK_WOOL, WireClass.THICK, SubtypeWirePlus.WireColorPlus.values())) {
            wire(EDWiresPlusBlocks.BLOCKS_WIRE.getValue(wire),
                    models().withExistingParent(name + wire.tag() + "_none", modLoc(parent + "highlyinsulatedwire_none")).texture("conductor", blockLoc(texture + wire.getWireMaterial().toString() + "_center")).texture("insulation", blockLoc(texture + "insulationwool_center")).texture("particle", "#insulation").renderType("cutout"), //
                    models().withExistingParent(name + wire.tag() + "_side", modLoc(parent + "highlyinsulatedwire_side")).texture("insulation", blockLoc(texture + "insulationwool")).texture("particle", "#insulation").renderType("cutout"), //
                    false);
        }
    }
}
