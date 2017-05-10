package magmasrc.ageofweapons.crafting;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

import java.util.List;
import java.util.Map;

public class CraftingManagerTableOfAges {

    private static final CraftingManagerTableOfAges INSTANCE = new CraftingManagerTableOfAges();

    private final List<IRecipe> recipes = Lists.newArrayList();

    public static CraftingManagerTableOfAges getInstance()
    {
        return INSTANCE;
    }


    private CraftingManagerTableOfAges() {


        
        /** Vanilla **/
        //items
        this.addRecipeTOA(new ItemStack(Items.STICK, 4), 0, "   ", " x ", " x ", 'x', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
        this.addRecipeTOA(new ItemStack(Items.ARROW, 4), 0, " x ", " o ", " y ", 'x', Items.FLINT, 'o', Items.STICK, 'y', Items.FEATHER);
        this.addRecipeTOA(new ItemStack(Blocks.TORCH, 4), 0, "   ", " o ", " x ", 'x', Items.STICK, 'o', Items.COAL);

        //tools
        this.addRecipeTOA(new ItemStack(Items.WOODEN_AXE), 0, " oo", " xo", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
        this.addRecipeTOA(new ItemStack(Items.WOODEN_HOE), 0, " oo", " x ", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
        this.addRecipeTOA(new ItemStack(Items.WOODEN_PICKAXE), 0, "ooo", " x ", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
        this.addRecipeTOA(new ItemStack(Items.WOODEN_SHOVEL), 0, " o ", " x ", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
        this.addRecipeTOA(new ItemStack(Items.WOODEN_SWORD), 0, " o ", " o ", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));

        this.addRecipeTOA(new ItemStack(Items.STONE_AXE), 0, " oo", " xo", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.COBBLESTONE, 1, OreDictionary.WILDCARD_VALUE));
        this.addRecipeTOA(new ItemStack(Items.STONE_HOE), 0, " oo", " x ", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.COBBLESTONE, 1, OreDictionary.WILDCARD_VALUE));
        this.addRecipeTOA(new ItemStack(Items.STONE_PICKAXE), 0, "ooo", " x ", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.COBBLESTONE, 1, OreDictionary.WILDCARD_VALUE));
        this.addRecipeTOA(new ItemStack(Items.STONE_SHOVEL), 0, " o ", " x ", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.COBBLESTONE, 1, OreDictionary.WILDCARD_VALUE));
        this.addRecipeTOA(new ItemStack(Items.STONE_SWORD), 0, " o ", " o ", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.COBBLESTONE, 1, OreDictionary.WILDCARD_VALUE));
        
        this.addRecipeTOA(new ItemStack(Items.IRON_AXE), 0, " oo", " xo", " x ", 'x', Items.STICK, 'o', Items.IRON_INGOT);
        this.addRecipeTOA(new ItemStack(Items.IRON_HOE), 0, " oo", " x ", " x ", 'x', Items.STICK, 'o', Items.IRON_INGOT);
        this.addRecipeTOA(new ItemStack(Items.IRON_PICKAXE), 0, "ooo", " x ", " x ", 'x', Items.STICK, 'o', Items.IRON_INGOT);
        this.addRecipeTOA(new ItemStack(Items.IRON_SHOVEL), 0, " o ", " x ", " x ", 'x', Items.STICK, 'o', Items.IRON_INGOT);
        this.addRecipeTOA(new ItemStack(Items.IRON_SWORD), 0, " o ", " o ", " x ", 'x', Items.STICK, 'o', Items.IRON_INGOT);
        
        this.addRecipeTOA(new ItemStack(Items.GOLDEN_AXE), 0, " oo", " xo", " x ", 'x', Items.STICK, 'o', Items.GOLD_INGOT);
        this.addRecipeTOA(new ItemStack(Items.GOLDEN_HOE), 0, " oo", " x ", " x ", 'x', Items.STICK, 'o', Items.GOLD_INGOT);
        this.addRecipeTOA(new ItemStack(Items.GOLDEN_PICKAXE), 0, "ooo", " x ", " x ", 'x', Items.STICK, 'o', Items.GOLD_INGOT);
        this.addRecipeTOA(new ItemStack(Items.GOLDEN_SHOVEL), 0, " o ", " x ", " x ", 'x', Items.STICK, 'o', Items.GOLD_INGOT);
        this.addRecipeTOA(new ItemStack(Items.GOLDEN_SWORD), 0, " o ", " o ", " x ", 'x', Items.STICK, 'o', Items.GOLD_INGOT);
        
        this.addRecipeTOA(new ItemStack(Items.DIAMOND_AXE), 0, " oo", " xo", " x ", 'x', Items.STICK, 'o', Items.DIAMOND);
        this.addRecipeTOA(new ItemStack(Items.DIAMOND_HOE), 0, " oo", " x ", " x ", 'x', Items.STICK, 'o', Items.DIAMOND);
        this.addRecipeTOA(new ItemStack(Items.DIAMOND_PICKAXE), 0, "ooo", " x ", " x ", 'x', Items.STICK, 'o', Items.DIAMOND);
        this.addRecipeTOA(new ItemStack(Items.DIAMOND_SHOVEL), 0, " o ", " x ", " x ", 'x', Items.STICK, 'o', Items.DIAMOND);
        this.addRecipeTOA(new ItemStack(Items.DIAMOND_SWORD), 0, " o ", " o ", " x ", 'x', Items.STICK, 'o', Items.DIAMOND);
        
        this.addRecipeTOA(new ItemStack(Items.FLINT_AND_STEEL), 0, "x  ", " o ", "   ", 'x', Items.IRON_INGOT, 'o', Items.FLINT);
        this.addRecipeTOA(new ItemStack(Items.SHEARS), 0, "   ", " x ", "x  ", 'x', Items.IRON_INGOT);
        this.addRecipeTOA(new ItemStack(Items.SHIELD), 0, "oxo", "ooo", " o ", 'x', Items.IRON_INGOT, 'o', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
        this.addRecipeTOA(new ItemStack(Items.BOW), 0, "ox ", "o x", "ox ", 'x', Items.STICK, 'o', Items.STRING);
        this.addRecipeTOA(new ItemStack(Items.FISHING_ROD), 0, "  x", " xo", "x o", 'x', Items.STICK, 'o', Items.STRING);

        
        //armor
        this.addRecipeTOA(new ItemStack(Items.LEATHER_BOOTS), 0, "   ", "x x", "x x", 'x', Items.LEATHER);
        this.addRecipeTOA(new ItemStack(Items.LEATHER_CHESTPLATE), 0, "x x", "xxx", "xxx", 'x', Items.LEATHER);
        this.addRecipeTOA(new ItemStack(Items.LEATHER_HELMET), 0, "xxx", "x x", "   ", 'x', Items.LEATHER);
        this.addRecipeTOA(new ItemStack(Items.LEATHER_LEGGINGS), 0, "xxx", "x x", "x x", 'x', Items.LEATHER);
        
        this.addRecipeTOA(new ItemStack(Items.IRON_BOOTS), 0, "   ", "x x", "x x", 'x', Items.IRON_INGOT);
        this.addRecipeTOA(new ItemStack(Items.IRON_CHESTPLATE), 0, "x x", "xxx", "xxx", 'x', Items.IRON_INGOT);
        this.addRecipeTOA(new ItemStack(Items.IRON_HELMET), 0, "xxx", "x x", "   ", 'x', Items.IRON_INGOT);
        this.addRecipeTOA(new ItemStack(Items.IRON_LEGGINGS), 0, "xxx", "x x", "x x", 'x', Items.IRON_INGOT);
        
        this.addRecipeTOA(new ItemStack(Items.GOLDEN_BOOTS), 0, "   ", "x x", "x x", 'x', Items.GOLD_INGOT);
        this.addRecipeTOA(new ItemStack(Items.GOLDEN_CHESTPLATE), 0, "x x", "xxx", "xxx", 'x', Items.GOLD_INGOT);
        this.addRecipeTOA(new ItemStack(Items.GOLDEN_HELMET), 0, "xxx", "x x", "   ", 'x', Items.GOLD_INGOT);
        this.addRecipeTOA(new ItemStack(Items.GOLDEN_LEGGINGS), 0, "xxx", "x x", "x x", 'x', Items.GOLD_INGOT);
        
        this.addRecipeTOA(new ItemStack(Items.DIAMOND_BOOTS), 0, "   ", "x x", "x x", 'x', Items.DIAMOND);
        this.addRecipeTOA(new ItemStack(Items.DIAMOND_CHESTPLATE), 0, "x x", "xxx", "xxx", 'x', Items.DIAMOND);
        this.addRecipeTOA(new ItemStack(Items.DIAMOND_HELMET), 0, "xxx", "x x", "   ", 'x', Items.DIAMOND);
        this.addRecipeTOA(new ItemStack(Items.DIAMOND_LEGGINGS), 0, "xxx", "x x", "x x", 'x', Items.DIAMOND);
    
        if (AgeOfWeapons.activateChainArmorCrafting){
            this.addRecipeTOA(new ItemStack(Items.CHAINMAIL_BOOTS), 0, "   ", "o o", "x x", 'x', Items.IRON_INGOT, 'o', Items.STRING);
            this.addRecipeTOA(new ItemStack(Items.CHAINMAIL_CHESTPLATE), 0, "o o", "xxx", "xox", 'x', Items.IRON_INGOT, 'o', Items.STRING);
            this.addRecipeTOA(new ItemStack(Items.CHAINMAIL_HELMET), 0, "oxo", "x x", "   ", 'x', Items.IRON_INGOT, 'o', Items.STRING);
            this.addRecipeTOA(new ItemStack(Items.CHAINMAIL_LEGGINGS), 0, "oxo", "x x", "x x", 'x', Items.IRON_INGOT, 'o', Items.STRING);
        }

        this.addShapelessRecipeTOA(new ItemStack(ModItems.rock, 4), 1, Blocks.COBBLESTONE);


    }

    public  ShapedRecipesTableOfAges addRecipeTOA(ItemStack stack, int neededModule, Object... recipeComponents)
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

    public void addShapelessRecipeTOA(ItemStack stack, int neededModule, Object... recipeComponents)
    {
        List<ItemStack> list = Lists.<ItemStack>newArrayList();

        for (Object object : recipeComponents)
        {
            if (object instanceof ItemStack)
            {
                list.add(((ItemStack)object).copy());
            }
            else if (object instanceof Item)
            {
                list.add(new ItemStack((Item)object));
            }
            else
            {
                if (!(object instanceof Block))
                {
                    throw new IllegalArgumentException("Invalid shapeless recipe: unknown type " + object.getClass().getName() + "!");
                }

                list.add(new ItemStack((Block)object));
            }
        }

        this.recipes.add(new ShapelessRecipesTableOfAges(stack, list, neededModule));
    }



    public ItemStack findMatchingRecipe(InventoryCrafting craftMatrix, World worldIn, int[] Modules)
    {


        for (IRecipe irecipe : this.recipes)
        {
            try {
                ShapedRecipesTableOfAges recipe = (ShapedRecipesTableOfAges) irecipe;

                if (irecipe.matches(craftMatrix, worldIn))
                {
                    int neededmod = recipe.getModuleNeeded();
                    for (int i = 0; i<12; i++) {
                        if (Modules[i] == 12) {
                            return recipe.getCraftingResult(craftMatrix);
                        }
                        if (Modules[i] == neededmod) {
                            return recipe.getCraftingResult(craftMatrix);
                        }
                    }
                }
            } catch (ClassCastException e) {
                ShapelessRecipesTableOfAges recipe = (ShapelessRecipesTableOfAges) irecipe;
                if (irecipe.matches(craftMatrix, worldIn))
                {
                    int neededmod = recipe.getModuleNeeded();
                    for (int i = 0; i<12; i++) {
                        if (Modules[i] == 12 || Modules[i] == neededmod) {
                            return recipe.getCraftingResult(craftMatrix);
                        }
                    }
                }
            }

        }

        return ItemStack.EMPTY;
    }

}
