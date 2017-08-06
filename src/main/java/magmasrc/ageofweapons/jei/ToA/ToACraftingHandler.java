package magmasrc.ageofweapons.jei.ToA;

import magmasrc.ageofweapons.crafting.ShapedRecipesTableOfAges;
import mezz.jei.api.recipe.IRecipeHandler;
import mezz.jei.api.recipe.IRecipeWrapper;

import javax.annotation.Nonnull;


public class ToACraftingHandler implements IRecipeHandler<ShapedRecipesTableOfAges> {


    @Nonnull
    @Override
    public Class<ShapedRecipesTableOfAges> getRecipeClass() {
        return ShapedRecipesTableOfAges.class;
    }

    @Nonnull
    @Override
    public String getRecipeCategoryUid(ShapedRecipesTableOfAges recipe) {
        return "aow.tableofages";
    }


    @Nonnull
    @Override
    public IRecipeWrapper getRecipeWrapper(ShapedRecipesTableOfAges recipe) {
        return new ToACraftingWrapper(recipe);
    }

    @Override
    public boolean isRecipeValid(ShapedRecipesTableOfAges recipe) {
        return true;
    }
}
