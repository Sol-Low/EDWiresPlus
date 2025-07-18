package edwiresplus.datagen.client;

import edwiresplus.EDWiresPlus;
import edwiresplus.common.SubtypeWirePlus;
import edwiresplus.registers.EDWiresPlusBlocks;
import electrodynamics.common.blockitem.BlockItemWire;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import voltaic.datagen.utils.client.BaseLangKeyProvider;

public class EDWiresPlusLangKeyProvider extends BaseLangKeyProvider {

    public EDWiresPlusLangKeyProvider(PackOutput output, Locale local) {
        super(output, Locale.EN_US, EDWiresPlus.ID);

    }

    @Override
    protected void addTranslations() {
        addCreativeTab( "wiresplus", "ED Wires+");

        for (SubtypeWirePlus wire: SubtypeWirePlus.values()){
            ResourceLocation id = ResourceLocation.fromNamespaceAndPath(EDWiresPlus.ID, wire.tag());
            String niceName = buildFriendlyName(wire);
            addBlock(EDWiresPlusBlocks.BLOCKS_WIRE.getValue(wire), niceName);
        }
    }
    private static String buildFriendlyName(SubtypeWirePlus wire) {
        // e.g. “Copper Ceramic Insulated Wire”
        String mat  = capitalize(wire.getWireMaterial().toString());
        String cls  = capitalize(wire.getWireClass().toString());
        String clr  = capitalize(wire.getWireColor().toString());
        return cls + " " + mat + " Wire " + "(" + clr + ")";
    }
    private static String capitalize(String s) {
        s = s.toLowerCase(java.util.Locale.ROOT);
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }



}


