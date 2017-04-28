package magmasrc.ageofweapons.crafting;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import magmasrc.ageofweapons.main.ModRecipesTOA;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;

public class CraftingManagerTableOfAges {

    private static final CraftingManagerTableOfAges INSTANCE = new CraftingManagerTableOfAges();

    private final List<ShapedRecipesTableOfAges> recipes = Lists.<ShapedRecipesTableOfAges>newArrayList();

    public static CraftingManagerTableOfAges getInstance()
    {
        /** The static instance of this class */
        return INSTANCE;
    }


    /**  --------------------------------------------------------------------------------------------
     *
     *          RECIPES HERE
     *
     **  -------------------------------------------------------------------------------------------- */
    private CraftingManagerTableOfAges() {


        new ModRecipesTOA();


        this.addRecipeTOA(new ItemStack(Items.PAPER, 3), 11, new Object[] {"###", '#', Items.REEDS});

    }

    public ShapedRecipesTableOfAges addRecipeTOA(ItemStack stack, int neededModule, Object... recipeComponents)
    {
        String s = "";
        int i = 0;
        int j = 0;
        int k = 0;

        if (recipeComponents[i] instanceof String[])
        {
            String[] astring = (String[])((String[])recipeComponents[i++]);

            for (String s2 : astring)
            {
                ++k;
                j = s2.length();
                s = s + s2;
            }
        }
        else
        {
            while (recipeComponents[i] instanceof String)
            {
                String s1 = (String)recipeComponents[i++];
                ++k;
                j = s1.length();
                s = s + s1;
            }
        }

        Map<Character, ItemStack> map;

        for (map = Maps.<Character, ItemStack>newHashMap(); i < recipeComponents.length; i += 2)
        {
            Character character = (Character)recipeComponents[i];
            ItemStack itemstack = ItemStack.EMPTY;

            if (recipeComponents[i + 1] instanceof Item)
            {
                itemstack = new ItemStack((Item)recipeComponents[i + 1]);
            }
            else if (recipeComponents[i + 1] instanceof Block)
            {
                itemstack = new ItemStack((Block)recipeComponents[i + 1], 1, 32767);
            }
            else if (recipeComponents[i + 1] instanceof ItemStack)
            {
                itemstack = (ItemStack)recipeComponents[i + 1];
            }

            map.put(character, itemstack);
        }

        ItemStack[] aitemstack = new ItemStack[j * k];

        for (int l = 0; l < j * k; ++l)
        {
            char c0 = s.charAt(l);

            if (map.containsKey(Character.valueOf(c0)))
            {
                aitemstack[l] = ((ItemStack)map.get(Character.valueOf(c0))).copy();
            }
            else
            {
                aitemstack[l] = ItemStack.EMPTY;
            }
        }



        ShapedRecipesTableOfAges shapedrecipes = new ShapedRecipesTableOfAges(j, k, aitemstack, stack, neededModule);
        this.recipes.add(shapedrecipes);
        return shapedrecipes;
    }



    public ItemStack findMatchingRecipe(InventoryCrafting craftMatrix, World worldIn, int[] Modules)
    {


        for (ShapedRecipesTableOfAges irecipe : this.recipes)
        {
            if (irecipe.matches(craftMatrix, worldIn))
            {
                int neededmod = irecipe.getModuleNeeded();
                for (int i = 0; i<12; i++) {
                    if (Modules[i] == 12) {
                        return irecipe.getCraftingResult(craftMatrix);
                    }
                    if (Modules[i] == neededmod) {
                        return irecipe.getCraftingResult(craftMatrix);
                    }
                }
            }
        }

        return ItemStack.EMPTY;
    }

}
