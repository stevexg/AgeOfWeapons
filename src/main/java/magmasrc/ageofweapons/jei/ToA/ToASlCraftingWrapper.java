package magmasrc.ageofweapons.jei.ToA;

import magmasrc.ageofweapons.crafting.ShapelessRecipesTableOfAges;
import magmasrc.ageofweapons.jei.ToAPlugin;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.BlankRecipeWrapper;
import mezz.jei.api.recipe.IStackHelper;
import net.minecraft.item.ItemStack;

import java.util.List;


public class ToASlCraftingWrapper extends BlankRecipeWrapper {

    private List<List<ItemStack>> input;
    private ItemStack output;

    public ToASlCraftingWrapper(ShapelessRecipesTableOfAges recipe) {

        IStackHelper stackHelper = ToAPlugin.jeiHelper.getStackHelper();
        input = stackHelper.expandRecipeItemStackInputs(recipe.getInput());
        output = recipe.getRecipeOutput();

    }

    @Override
    public void getIngredients(IIngredients ingredients) {
        ingredients.setInputLists(ItemStack.class, input);
        ingredients.setOutput(ItemStack.class, output);
    }
}
