package magmasrc.ageofweapons.crafting;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import magmasrc.ageofweapons.main.ModBlocks;
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
        
        this.addShapelessRecipeTOA(new ItemStack(Items.FLINT_AND_STEEL), 0, Items.IRON_INGOT, Items.FLINT);
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
      
      
      
      /** Age of Weapons **/
      //blocks
      this.addRecipeTOA(new ItemStack(ModBlocks.rubyBlock), 0, "xxx", "xxx", "xxx", 'x', ModItems.ruby);
      this.addRecipeTOA(new ItemStack(ModBlocks.sapphireBlock), 0, "xxx", "xxx", "xxx", 'x', ModItems.sapphire);
      this.addShapelessRecipeTOA(new ItemStack(ModItems.ruby, 9), 0, ModBlocks.rubyBlock);
      this.addShapelessRecipeTOA(new ItemStack(ModItems.sapphire, 9), 0, ModBlocks.sapphireBlock);
      this.addRecipeTOA(new ItemStack(ModBlocks.crusher), 0, "xxx", "xzx", "xox", 'x', Blocks.COBBLESTONE, 'o', Blocks.FURNACE, 'z', Items.FLINT);
      this.addRecipeTOA(new ItemStack(ModBlocks.crusher), 0, "xxx", "xzx", "xox", 'x', Blocks.COBBLESTONE, 'o', Blocks.FURNACE, 'z', ModItems.ironShard);
      this.addRecipeTOA(new ItemStack(ModBlocks.tableOfAges), 0, "xxx", "ozo", "oyo", 'x', Blocks.STONE_SLAB, 'o', Blocks.STONE, 'z', Blocks.CRAFTING_TABLE, 'y', Blocks.CHEST);
  if(AgeOfWeapons.activateWeaponBoxRecipe) {    
      this.addRecipeTOA(new ItemStack(ModBlocks.weaponBox), 0, "xxx", "xox", "xxx", 'x', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE), 'o', Items.EMERALD);
  }
  if(AgeOfWeapons.activateNexusRecipe) {                                                                                                                      
      this.addRecipeTOA(new ItemStack(ModBlocks.nexus), 0, "v v", "vzv", "xox", 'x', new ItemStack(Blocks.IRON_BLOCK), 'o', new ItemStack(Blocks.WOOL, 1, 11), 'v', Items.IRON_INGOT, 'z', Items.NETHER_STAR );
      this.addRecipeTOA(new ItemStack(ModBlocks.nexus2), 0, "v v", "vzv", "xox", 'x', new ItemStack(Blocks.IRON_BLOCK), 'o', new ItemStack(Blocks.WOOL, 1, 14), 'v', Items.IRON_INGOT, 'z', Items.NETHER_STAR );
      this.addRecipeTOA(new ItemStack(ModBlocks.nexus3), 0, "v v", "vzv", "xox", 'x', new ItemStack(Blocks.IRON_BLOCK), 'o', new ItemStack(Blocks.WOOL, 1, 4), 'v', Items.IRON_INGOT, 'z', Items.NETHER_STAR );
      this.addRecipeTOA(new ItemStack(ModBlocks.nexus4), 0, "v v", "vzv", "xox", 'x', new ItemStack(Blocks.IRON_BLOCK), 'o', new ItemStack(Blocks.WOOL, 1, 13), 'v', Items.IRON_INGOT, 'z', Items.NETHER_STAR );
  }
  
  	
  	//items
	this.addRecipeTOA(new ItemStack(ModItems.axeBladeDiamond), 0, "xx ", "xo ", "   ", 'x', ModItems.diamondShard, 'o', Items.DIAMOND);
  	this.addRecipeTOA(new ItemStack(ModItems.axeBladeGold), 0, "xx ", "xo ", "   ", 'x', ModItems.goldShard, 'o', Items.GOLD_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.axeBladeIron), 0, "xx ", "xo ", "   ", 'x', ModItems.ironShard, 'o', Items.IRON_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.axeBladeStone), 0, "xx ", "xo ", "   ", 'x', ModItems.stoneShard, 'o', Blocks.COBBLESTONE);
  	this.addRecipeTOA(new ItemStack(ModItems.axeBladeStone), 0, "xx ", "xo ", "   ", 'x', Items.FLINT, 'o', Blocks.COBBLESTONE);
  	this.addRecipeTOA(new ItemStack(ModItems.axeBladeWood), 0, "xx ", "xo ", "   ", 'x', ModItems.woodShard, 'o', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
  	this.addRecipeTOA(new ItemStack(ModItems.swordBladeDiamond), 0, " x ", " x ", "   ", 'x', Items.DIAMOND);
  	this.addRecipeTOA(new ItemStack(ModItems.swordBladeGold), 0, " x ", " x ", "   ", 'x', Items.GOLD_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.swordBladeIron), 0, " x ", " x ", "   ", 'x', Items.IRON_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.swordBladeStone), 0, " x ", " x ", "   ", 'x', Blocks.COBBLESTONE);
  	this.addRecipeTOA(new ItemStack(ModItems.swordBladeWood), 0, " x ", " x ", "   ", 'x', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
  	this.addRecipeTOA(new ItemStack(ModItems.broadBladeDiamond), 0, "xx ", "xx ", "   ", 'x', ModItems.swordBladeDiamond);
  	this.addRecipeTOA(new ItemStack(ModItems.broadBladeGold), 0, "xx ", "xx ", "   ", 'x', ModItems.swordBladeGold);
  	this.addRecipeTOA(new ItemStack(ModItems.broadBladeIron), 0, "xx ", "xx ", "   ", 'x', ModItems.swordBladeIron);
  	this.addRecipeTOA(new ItemStack(ModItems.broadBladeStone), 0, "xx ", "xx ", "   ", 'x', ModItems.swordBladeStone);
  	this.addRecipeTOA(new ItemStack(ModItems.broadBladeWood), 0, "xx ", "xx ", "   ", 'x', ModItems.swordBladeWood);
  	this.addShapelessRecipeTOA(new ItemStack(ModItems.lumber, 3), 0, new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
  	this.addRecipeTOA(new ItemStack(ModItems.ironStick, 4), 0, "   ", " x ", " x ", 'x', Items.IRON_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.ironLongstick), 0, "   ", " x ", " x ", 'x', ModItems.ironStick);
  	this.addRecipeTOA(new ItemStack(ModItems.woodLongstick), 0, "   ", " x ", " x ", 'x', Items.STICK);
  	this.addRecipeTOA(new ItemStack(ModItems.swordHandle), 0, "   ", "xxx", " o ", 'x', ModItems.ironShard, 'o', Items.STICK);
  	this.addRecipeTOA(new ItemStack(ModItems.toxin), 0, "ixi", "xox", "ccc", 'x', new ItemStack(Items.FISH, 1, 3), 'o', Items.GLASS_BOTTLE, 'i', Items.ROTTEN_FLESH, 'c', Items.FERMENTED_SPIDER_EYE);
  	this.addRecipeTOA(new ItemStack(ModItems.radioactiveToxin), 0, "xxx", "xox", "xxx", 'x', new ItemStack(Items.FISH, 1, 3), 'o', ModItems.toxin);

  	this.addRecipeTOA(new ItemStack(ModItems.blankGun), 6, "xxx", "  x", "  x", 'x', Items.IRON_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.barrel), 6, "   ", "xxx", "   ", 'x', Items.IRON_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.gunHandle), 6, "   ", " xx", "xx ", 'x', Items.IRON_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.haftIron), 6, " x ", " xx", " xx", 'x', Items.IRON_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.haftWood), 6, " x ", " xx", " xx", 'x', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
  	this.addRecipeTOA(new ItemStack(ModItems.visor), 6, "xxx", "o o", "xxx", 'x', Items.IRON_INGOT, 'o', new ItemStack(Blocks.GLASS_PANE, 1, 3));





      
      
      
      

        
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
