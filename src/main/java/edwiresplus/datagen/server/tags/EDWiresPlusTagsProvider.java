package edwiresplus.datagen.server.tags;

import java.util.concurrent.CompletableFuture;

import edwiresplus.datagen.server.tags.types.EDWiresPlusBlockTagsProvider;
import edwiresplus.datagen.server.tags.types.EDWiresPlusItemTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class EDWiresPlusTagsProvider {



    public static void addTagProviders(DataGenerator generator, PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper helper) {
        EDWiresPlusBlockTagsProvider blockProvider = new EDWiresPlusBlockTagsProvider(output, lookupProvider, helper);

        generator.addProvider(true, blockProvider);
        generator.addProvider(true, new EDWiresPlusItemTagsProvider(output, lookupProvider, blockProvider, helper));

    }
}
