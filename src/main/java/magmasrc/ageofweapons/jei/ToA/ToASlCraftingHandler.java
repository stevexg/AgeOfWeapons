package magmasrc.ageofweapons.jei.ToA;

import magmasrc.ageofweapons.crafting.ShapelessRecipesTableOfAges;
import mezz.jei.api.recipe.IRecipeHandler;
import mezz.jei.api.recipe.IRecipeWrapper;

import javax.annotation.Nonnull;


public class ToASlCraftingHandler implements IRecipeHandler<ShapelessRecipesTableOfAges> {


    @Nonnull
    @Override
    public Class<ShapelessRecipesTableOfAges> getRecipeClass() {
        return ShapelessRecipesTableOfAges.class;
    }

    @Nonnull
    @Override
    public String getRecipeCategoryUid(ShapelessRecipesTableOfAges recipe) {
        return "aow.tableofages";
    }


    @Nonnull
    @Override
    public IRecipeWrapper getRecipeWrapper(ShapelessRecipesTableOfAges recipe) {
        return new ToASlCraftingWrapper(recipe);
    }

    @Override
    public boolean isRecipeValid(ShapelessRecipesTableOfAges recipe) {
        return true;
    }
}
