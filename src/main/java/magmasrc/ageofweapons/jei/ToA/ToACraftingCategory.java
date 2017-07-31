package magmasrc.ageofweapons.jei.ToA;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

import java.util.List;

public class ToACraftingCategory implements IRecipeCategory {

    private final String locTitle;
    private final IDrawable background;

    public ToACraftingCategory(IGuiHelper guiHelper) {

        locTitle = "Table Of Ages";

        background = guiHelper.createDrawable(new ResourceLocation(AgeOfWeapons.MODID, "textures/gui/table_of_ages_jei_gui.png"), 0, 0, 166, 122);

    }

    @Override
    public String getUid() {
        return "aow.tableofages";
    }

    @Override
    public String getTitle() {
        return locTitle;
    }

    @Override
    public String getModName() {
        return "Age Of Weapons";
    }

    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Nullable
    @Override
    public IDrawable getIcon() {
        return null;
    }

    @Override
    public void drawExtras(Minecraft minecraft) {

    }

    @Override
    public void setRecipe(IRecipeLayout recipeLayout, IRecipeWrapper recipeWrapper, IIngredients ingredients) {

        if (!(recipeWrapper instanceof ToACraftingWrapper)) return;

        ToACraftingWrapper wrapper = (ToACraftingWrapper) recipeWrapper;
        IGuiItemStackGroup guiStacks = recipeLayout.getItemStacks();

        int slotId = 0;

        // Input Slots
        List<List<ItemStack>> inputs = ingredients.getInputs(ItemStack.class);
        for (List<ItemStack> itemList : inputs) {

            int y = (int) Math.floor(slotId / 3);
            int x = slotId - (y * 3);
            guiStacks.init(slotId, true, 7 + x + 18, 2 + y + 18);
            guiStacks.set(slotId, itemList);
            slotId++;
        }


        // Output Slot
        guiStacks.init(slotId, false, 137, 56);
        guiStacks.set(slotId, ingredients.getOutputs(ItemStack.class).get(0));
    }

    @Override
    public List<String> getTooltipStrings(int mouseX, int mouseY) {
        return null;
    }
}
