package edwiresplus.datagen.client;

import edwiresplus.EDWiresPlus;
import electrodynamics.Electrodynamics;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

/**
 * Unused class for now; do not remove please
 *
 * @ original author skip999
 *
 * If things change I am leaving the framework
 * @ EDWP author Sol-Low
 */
public class EDWiresPlusBlockModelsProvider extends BlockModelProvider {

    public EDWiresPlusBlockModelsProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EDWiresPlus.ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }

}