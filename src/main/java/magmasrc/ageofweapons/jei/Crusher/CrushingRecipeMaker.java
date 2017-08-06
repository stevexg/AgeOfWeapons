package magmasrc.ageofweapons.jei.Crusher;

import magmasrc.ageofweapons.crushing.CrusherRecipes;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.recipe.IStackHelper;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public final class CrushingRecipeMaker {

    private CrushingRecipeMaker() {

    }

    public static List<CrushingRecipe> getCrusherRecipes(IJeiHelpers helpers) {
        IStackHelper stackHelper = helpers.getStackHelper();
        CrusherRecipes crusherRecipes = CrusherRecipes.instance();
        Map<ItemStack, ItemStack> crushingMap = crusherRecipes.getCrushingList();

        List<CrushingRecipe> recipes = new ArrayList<CrushingRecipe>();

        for (Map.Entry<ItemStack, ItemStack> entry : crushingMap.entrySet()) {
            ItemStack input = entry.getKey();
            ItemStack output = entry.getValue();

            List<ItemStack> inputs = stackHelper.getSubtypes(input);
            CrushingRecipe recipe = new CrushingRecipe(inputs, output);
            recipes.add(recipe);

        }
        return recipes;
    }

}
