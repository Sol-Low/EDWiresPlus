package edwiresplus.datagen;

import edwiresplus.EDWiresPlus;
import edwiresplus.common.SubtypeWirePlus;
import edwiresplus.datagen.client.EDWiresPlusBlockModelsProvider;
import edwiresplus.datagen.client.EDWiresPlusBlockStateProvider;
import edwiresplus.datagen.client.EDWiresPlusItemModelsProvider;
import edwiresplus.datagen.client.EDWiresPlusLangKeyProvider;
import edwiresplus.datagen.server.tags.EDWiresPlusTagsProvider;
import electrodynamics.common.block.subtype.SubtypeWire;
import electrodynamics.datagen.server.tags.types.ElectrodynamicsItemTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import voltaic.api.network.cable.type.IWire;
import voltaic.datagen.utils.client.BaseLangKeyProvider;

import java.util.*;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = EDWiresPlus.ID, bus = EventBusSubscriber.Bus.MOD)
public class DatageneratorsPlus {

    public static final HashMap<IWire.IWireClass, HashSet<SubtypeWirePlus>> WIRES = new HashMap<>();

    static {
        for (SubtypeWirePlus wire : SubtypeWirePlus.values()) {
            HashSet<SubtypeWirePlus> wireSet = WIRES.getOrDefault(wire.getWireClass(), new HashSet<>());
            wireSet.add(wire);
            WIRES.put(wire.getWireClass(), wireSet);
        }
    }

    public static SubtypeWirePlus getWire(IWire.IWireMaterial conductor, SubtypeWire.InsulationMaterial insulation, SubtypeWire.WireClass wireClass, SubtypeWirePlus.WireColorPlus color) {

        for (SubtypeWirePlus wire : WIRES.getOrDefault(wireClass, new HashSet<>())) {
            if (wire.getWireMaterial() == conductor && wire.getInsulation() == insulation && wire.getWireClass() == wireClass && wire.getWireColor() == color) {
                return wire;
            }
        }
        return null;
    }

    public static SubtypeWirePlus[] getWires(IWire.IWireMaterial[] conductors, SubtypeWire.InsulationMaterial insulation, SubtypeWire.WireClass wireClass, SubtypeWirePlus.WireColorPlus... colors) {

        List<SubtypeWirePlus> list = new ArrayList<>();

        SubtypeWirePlus wire;
        for (IWire.IWireMaterial conductor : conductors) {
            for (SubtypeWirePlus.WireColorPlus color : colors) {
                wire = getWire(conductor, insulation, wireClass, color);
                if (wire != null) {
                    list.add(wire);
                }
            }
        }

        return list.toArray(new SubtypeWirePlus[0]);
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {

        DataGenerator generator = event.getGenerator();

        PackOutput output = generator.getPackOutput();

        ExistingFileHelper helper = event.getExistingFileHelper();

        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        if (event.includeServer()) {

            EDWiresPlusTagsProvider.addTagProviders(generator, output, lookupProvider, helper);
        }
        if (event.includeClient()){
            generator.addProvider(true, new EDWiresPlusBlockStateProvider(output,helper));
            generator.addProvider(true, new EDWiresPlusBlockModelsProvider(output, helper));
            generator.addProvider(true, new EDWiresPlusItemModelsProvider(output, helper));
            generator.addProvider(true, new EDWiresPlusLangKeyProvider(output, BaseLangKeyProvider.Locale.EN_US));

        }
    }
}
