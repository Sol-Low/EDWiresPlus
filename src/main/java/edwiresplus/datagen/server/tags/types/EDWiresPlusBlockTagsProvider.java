package edwiresplus.datagen.server.tags.types;

import edwiresplus.EDWiresPlus;
import edwiresplus.registers.EDWiresPlusBlocks;
import electrodynamics.common.block.connect.BlockWire;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EDWiresPlusBlockTagsProvider extends BlockTagsProvider {
    public EDWiresPlusBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EDWiresPlus.ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(EDWiresPlusBlocks.BLOCKS_WIRE.getAllValuesArray(new BlockWire[0]));
        tag(Tags.Blocks.NEEDS_WOOD_TOOL).add(EDWiresPlusBlocks.BLOCKS_WIRE.getAllValuesArray(new BlockWire[0]));

    }
}
