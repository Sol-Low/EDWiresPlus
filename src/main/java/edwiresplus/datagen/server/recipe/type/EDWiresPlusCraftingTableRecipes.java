package edwiresplus.datagen.server.recipe.type;

import edwiresplus.EDWiresPlus;
import edwiresplus.common.SubtypeWirePlus;
import edwiresplus.common.SubtypeWirePlus.*;
import edwiresplus.datagen.DataGeneratorsPlus;
import edwiresplus.registers.EDWiresPlusItems;
import electrodynamics.common.block.subtype.SubtypeWire.*;
import net.minecraft.data.recipes.RecipeOutput;
import net.neoforged.neoforge.common.Tags;
import voltaic.datagen.utils.server.recipe.AbstractRecipeGenerator;
import voltaic.datagen.utils.server.recipe.ShapedCraftingRecipeBuilder;
import voltaic.datagen.utils.server.recipe.ShapelessCraftingRecipeBuilder;

public class EDWiresPlusCraftingTableRecipes extends AbstractRecipeGenerator {
    @Override
    public void addRecipes(RecipeOutput output) {

        addWires(output);

    }

    private static void addWires(RecipeOutput output) {


        // Insulated Wires
        for (SubtypeWirePlus wire : DataGeneratorsPlus.getWires(WireMaterial.values(), InsulationMaterial.WOOL, WireClass.INSULATED, WireColorPlus.values())) {
            if (wire.getWireColor().getDyeTag() == null) {
                continue;
            }
            ShapedCraftingRecipeBuilder.start(EDWiresPlusItems.ITEMS_WIRE.getValue(wire), 8)
                    //
                    .addPattern("WWW")
                    //
                    .addPattern("WDW")
                    //
                    .addPattern("WWW")
                    //
                    .addKey('W', wire.getItemTag())
                    //
                    .addKey('D', wire.getWireColor().getDyeTag())
                    //
                    .complete(EDWiresPlus.ID, "wire_" + wire.name() + "_multi", output);

            ShapelessCraftingRecipeBuilder.start(EDWiresPlusItems.ITEMS_WIRE.getValue(wire), 1)
                    //
                    .addIngredient(wire.getItemTag())
                    //
                    .addIngredient(wire.getWireColor().getDyeTag())
                    //
                    .complete(EDWiresPlus.ID, "wire_" + wire.name() + "_single", output);
        }

        // Highly Insulated Wires
        for (SubtypeWirePlus wire : DataGeneratorsPlus.getWires(WireMaterial.values(), InsulationMaterial.THICK_WOOL, WireClass.THICK, WireColorPlus.values())) {
            if (wire.getWireColor().getDyeTag() == null) {
                continue;
            }
            ShapedCraftingRecipeBuilder.start(EDWiresPlusItems.ITEMS_WIRE.getValue(wire), 8)
                    //
                    .addPattern("WWW")
                    //
                    .addPattern("WDW")
                    //
                    .addPattern("WWW")
                    //
                    .addKey('W', wire.getItemTag())
                    //
                    .addKey('D', wire.getWireColor().getDyeTag())
                    //
                    .complete(EDWiresPlus.ID, "wire_" + wire.name() + "_multi", output);

            ShapelessCraftingRecipeBuilder.start(EDWiresPlusItems.ITEMS_WIRE.getValue(wire), 1)
                    //
                    .addIngredient(wire.getItemTag())
                    //
                    .addIngredient(wire.getWireColor().getDyeTag())
                    //
                    .complete(EDWiresPlus.ID, "wire_" + wire.name() + "_single", output);
        }

        // Ceramic Insulated Wires
        for (SubtypeWirePlus wire : DataGeneratorsPlus.getWires(WireMaterial.values(), InsulationMaterial.CERAMIC, WireClass.CERAMIC, WireColorPlus.values())) {
            if (wire.getWireColor().getDyeTag() == null) {
                continue;
            }
            ShapedCraftingRecipeBuilder.start(EDWiresPlusItems.ITEMS_WIRE.getValue(wire), 8)
                    //
                    .addPattern("WWW")
                    //
                    .addPattern("WDW")
                    //
                    .addPattern("WWW")
                    //
                    .addKey('W', wire.getItemTag())
                    //
                    .addKey('D', wire.getWireColor().getDyeTag())
                    //
                    .complete(EDWiresPlus.ID, "wire_" + wire.name() + "_multi", output);

            ShapelessCraftingRecipeBuilder.start(EDWiresPlusItems.ITEMS_WIRE.getValue(wire), 1)
                    //
                    .addIngredient(wire.getItemTag())
                    //
                    .addIngredient(wire.getWireColor().getDyeTag())
                    //
                    .complete(EDWiresPlus.ID, "wire_" + wire.name() + "_single", output);
        }

        // Ceramic Insulated Wires
        for (SubtypeWirePlus wire : DataGeneratorsPlus.getWires(WireMaterial.values(), InsulationMaterial.WOOL, WireClass.LOGISTICAL, WireColorPlus.values())) {
            if (wire.getWireColor().getDyeTag() == null) {
                continue;
            }
            ShapedCraftingRecipeBuilder.start(EDWiresPlusItems.ITEMS_WIRE.getValue(wire), 8)
                    //
                    .addPattern("WWW")
                    //
                    .addPattern("WDW")
                    //
                    .addPattern("WWW")
                    //
                    .addKey('W', wire.getItemTag())
                    //
                    .addKey('D', wire.getWireColor().getDyeTag())
                    //
                    .complete(EDWiresPlus.ID, "wire_" + wire.name() + "_multi", output);

            ShapelessCraftingRecipeBuilder.start(EDWiresPlusItems.ITEMS_WIRE.getValue(wire), 1)
                    //
                    .addIngredient(wire.getItemTag())
                    //
                    .addIngredient(wire.getWireColor().getDyeTag())
                    //
                    .complete(EDWiresPlus.ID, "wire_" + wire.name() + "_single", output);
        }
    }
}
