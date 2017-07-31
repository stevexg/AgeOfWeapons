package magmasrc.ageofweapons.jei;

import magmasrc.ageofweapons.client.gui.GuiTableOfAges;
import magmasrc.ageofweapons.crafting.CraftingManagerTableOfAges;
import magmasrc.ageofweapons.jei.ToA.ToACraftingCategory;
import magmasrc.ageofweapons.jei.ToA.ToACraftingHandler;
import magmasrc.ageofweapons.main.ModBlocks;
import mezz.jei.api.BlankModPlugin;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

@JEIPlugin
public class ToAPlugin extends BlankModPlugin {

    public static IJeiHelpers jeiHelper;

    @Override
    public void register(@Nonnull IModRegistry registry) {

        jeiHelper = registry.getJeiHelpers();

        registry.addRecipeCategories(new ToACraftingCategory(jeiHelper.getGuiHelper()));
        registry.addRecipeHandlers(new ToACraftingHandler());

        registry.addRecipes(CraftingManagerTableOfAges.getInstance().getRecipeList());

        registry.addRecipeClickArea(GuiTableOfAges.class, 111, 69, 26, 19, "aow.tableofages");
        registry.addRecipeCategoryCraftingItem(new ItemStack(ModBlocks.tableOfAges), "aow.tableofages");

    }





}
