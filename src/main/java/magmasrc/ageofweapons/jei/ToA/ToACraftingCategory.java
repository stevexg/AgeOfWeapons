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

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ToACraftingCategory implements IRecipeCategory {

    private final String locTitle;
    private final IDrawable background;

    public ToACraftingCategory(IGuiHelper guiHelper) {

        locTitle = "Table Of Ages";

        background = guiHelper.createDrawable(new ResourceLocation(AgeOfWeapons.MODID, "textures/gui/table_of_ages_jei_gui.png"), 0, 60, 116, 54);

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

        if (recipeWrapper instanceof ToASlCraftingWrapper) {

            recipeLayout.setShapeless();
        }
        recipeLayout.setRecipeTransferButton(116, 40);
        IGuiItemStackGroup guiStacks = recipeLayout.getItemStacks();

        int slotId = 0;

        // Input Slots
        List<List<ItemStack>> inputs = ingredients.getInputs(ItemStack.class);
        for (List<ItemStack> itemList : inputs) {

            int y = (int) Math.floor(slotId / 3);
            int x = slotId - (y * 3);
            guiStacks.init(slotId, true, x * 18, y * 18);
            guiStacks.set(slotId, itemList);
            slotId++;
        }


        // Output Slot
        guiStacks.init(slotId, false, 94, 18);
        guiStacks.set(slotId, ingredients.getOutputs(ItemStack.class).get(0));

    }

    @Override
    public List<String> getTooltipStrings(int mouseX, int mouseY) {

        return new List<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public String get(int index) {
                return null;
            }

            @Override
            public String set(int index, String element) {
                return null;
            }

            @Override
            public void add(int index, String element) {

            }

            @Override
            public String remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<String> listIterator() {
                return null;
            }

            @Override
            public ListIterator<String> listIterator(int index) {
                return null;
            }

            @Override
            public List<String> subList(int fromIndex, int toIndex) {
                return null;
            }
        };

    }
}
