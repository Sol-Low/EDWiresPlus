package edwiresplus.datagen.server.recipe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import edwiresplus.datagen.server.recipe.type.EDWiresPlusCraftingTableRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import voltaic.datagen.utils.server.recipe.AbstractRecipeGenerator;

public class EDWiresPlusRecipeProvider extends RecipeProvider {

    public final List<AbstractRecipeGenerator> generators = new ArrayList<>();
    @SuppressWarnings("unused")
    private final CompletableFuture<HolderLookup.Provider> lookupProvider;


    public EDWiresPlusRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
        this.lookupProvider = lookupProvider;
        addRecipes();
    }

    public void addRecipes() {
        generators.add(new EDWiresPlusCraftingTableRecipes());
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {

        for (AbstractRecipeGenerator generator : generators) {
            generator.addRecipes(output);
        }
    }
}
