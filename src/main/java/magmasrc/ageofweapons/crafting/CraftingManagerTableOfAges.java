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
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
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
    if(AgeOfWeapons.activateHardcoreMode) {                     // HARDCORE MODE
    	
    	 this.addRecipeTOA(new ItemStack(Items.WOODEN_AXE), 1, " oo", " xo", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
         this.addRecipeTOA(new ItemStack(Items.WOODEN_HOE), 1, " oo", " x ", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
         this.addRecipeTOA(new ItemStack(Items.WOODEN_PICKAXE), 1, "ooo", " x ", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
         this.addRecipeTOA(new ItemStack(Items.WOODEN_SHOVEL), 1, " o ", " x ", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
         this.addRecipeTOA(new ItemStack(Items.WOODEN_SWORD), 1, " o ", " o ", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));

         this.addRecipeTOA(new ItemStack(Items.STONE_AXE), 1, " oo", " xo", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.COBBLESTONE, 1, OreDictionary.WILDCARD_VALUE));
         this.addRecipeTOA(new ItemStack(Items.STONE_HOE), 1, " oo", " x ", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.COBBLESTONE, 1, OreDictionary.WILDCARD_VALUE));
         this.addRecipeTOA(new ItemStack(Items.STONE_PICKAXE), 1, "ooo", " x ", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.COBBLESTONE, 1, OreDictionary.WILDCARD_VALUE));
         this.addRecipeTOA(new ItemStack(Items.STONE_SHOVEL), 1, " o ", " x ", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.COBBLESTONE, 1, OreDictionary.WILDCARD_VALUE));
         this.addRecipeTOA(new ItemStack(Items.STONE_SWORD), 1, " o ", " o ", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.COBBLESTONE, 1, OreDictionary.WILDCARD_VALUE));
         
         this.addRecipeTOA(new ItemStack(Items.IRON_AXE), 4, " oo", " xo", " x ", 'x', Items.STICK, 'o', Items.IRON_INGOT);
         this.addRecipeTOA(new ItemStack(Items.IRON_HOE), 4, " oo", " x ", " x ", 'x', Items.STICK, 'o', Items.IRON_INGOT);
         this.addRecipeTOA(new ItemStack(Items.IRON_PICKAXE), 4, "ooo", " x ", " x ", 'x', Items.STICK, 'o', Items.IRON_INGOT);
         this.addRecipeTOA(new ItemStack(Items.IRON_SHOVEL), 4, " o ", " x ", " x ", 'x', Items.STICK, 'o', Items.IRON_INGOT);
         this.addRecipeTOA(new ItemStack(Items.IRON_SWORD), 4, " o ", " o ", " x ", 'x', Items.STICK, 'o', Items.IRON_INGOT);
         
         this.addRecipeTOA(new ItemStack(Items.GOLDEN_AXE), 4, " oo", " xo", " x ", 'x', Items.STICK, 'o', Items.GOLD_INGOT);
         this.addRecipeTOA(new ItemStack(Items.GOLDEN_HOE), 4, " oo", " x ", " x ", 'x', Items.STICK, 'o', Items.GOLD_INGOT);
         this.addRecipeTOA(new ItemStack(Items.GOLDEN_PICKAXE), 4, "ooo", " x ", " x ", 'x', Items.STICK, 'o', Items.GOLD_INGOT);
         this.addRecipeTOA(new ItemStack(Items.GOLDEN_SHOVEL), 4, " o ", " x ", " x ", 'x', Items.STICK, 'o', Items.GOLD_INGOT);
         this.addRecipeTOA(new ItemStack(Items.GOLDEN_SWORD), 4, " o ", " o ", " x ", 'x', Items.STICK, 'o', Items.GOLD_INGOT);
         
         this.addRecipeTOA(new ItemStack(Items.DIAMOND_AXE), 7, " oo", " xo", " x ", 'x', Items.STICK, 'o', Items.DIAMOND);
         this.addRecipeTOA(new ItemStack(Items.DIAMOND_HOE), 7, " oo", " x ", " x ", 'x', Items.STICK, 'o', Items.DIAMOND);
         this.addRecipeTOA(new ItemStack(Items.DIAMOND_PICKAXE), 7, "ooo", " x ", " x ", 'x', Items.STICK, 'o', Items.DIAMOND);
         this.addRecipeTOA(new ItemStack(Items.DIAMOND_SHOVEL), 7, " o ", " x ", " x ", 'x', Items.STICK, 'o', Items.DIAMOND);
         this.addRecipeTOA(new ItemStack(Items.DIAMOND_SWORD), 7, " o ", " o ", " x ", 'x', Items.STICK, 'o', Items.DIAMOND);
         
         this.addShapelessRecipeTOA(new ItemStack(Items.FLINT_AND_STEEL), 7, Items.IRON_INGOT, Items.FLINT);
         this.addRecipeTOA(new ItemStack(Items.SHEARS), 4, "   ", " x ", "x  ", 'x', Items.IRON_INGOT);
         this.addRecipeTOA(new ItemStack(Items.SHIELD), 2, "oxo", "ooo", " o ", 'x', Items.IRON_INGOT, 'o', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
         this.addRecipeTOA(new ItemStack(Items.BOW), 1, "ox ", "o x", "ox ", 'x', Items.STICK, 'o', Items.STRING);
         this.addRecipeTOA(new ItemStack(Items.FISHING_ROD), 2, "  x", " xo", "x o", 'x', Items.STICK, 'o', Items.STRING);
         //armor
         this.addRecipeTOA(new ItemStack(Items.LEATHER_BOOTS), 2, "   ", "x x", "x x", 'x', Items.LEATHER);
         this.addRecipeTOA(new ItemStack(Items.LEATHER_CHESTPLATE), 2, "x x", "xxx", "xxx", 'x', Items.LEATHER);
         this.addRecipeTOA(new ItemStack(Items.LEATHER_HELMET), 2, "xxx", "x x", "   ", 'x', Items.LEATHER);
         this.addRecipeTOA(new ItemStack(Items.LEATHER_LEGGINGS), 2, "xxx", "x x", "x x", 'x', Items.LEATHER);
         
         this.addRecipeTOA(new ItemStack(Items.IRON_BOOTS), 4, "   ", "x x", "x x", 'x', Items.IRON_INGOT);
         this.addRecipeTOA(new ItemStack(Items.IRON_CHESTPLATE), 4, "x x", "xxx", "xxx", 'x', Items.IRON_INGOT);
         this.addRecipeTOA(new ItemStack(Items.IRON_HELMET), 4, "xxx", "x x", "   ", 'x', Items.IRON_INGOT);
         this.addRecipeTOA(new ItemStack(Items.IRON_LEGGINGS), 4, "xxx", "x x", "x x", 'x', Items.IRON_INGOT);
         
         this.addRecipeTOA(new ItemStack(Items.GOLDEN_BOOTS), 4, "   ", "x x", "x x", 'x', Items.GOLD_INGOT);
         this.addRecipeTOA(new ItemStack(Items.GOLDEN_CHESTPLATE), 4, "x x", "xxx", "xxx", 'x', Items.GOLD_INGOT);
         this.addRecipeTOA(new ItemStack(Items.GOLDEN_HELMET), 4, "xxx", "x x", "   ", 'x', Items.GOLD_INGOT);
         this.addRecipeTOA(new ItemStack(Items.GOLDEN_LEGGINGS), 4, "xxx", "x x", "x x", 'x', Items.GOLD_INGOT);
         
         this.addRecipeTOA(new ItemStack(Items.DIAMOND_BOOTS), 7, "   ", "x x", "x x", 'x', Items.DIAMOND);
         this.addRecipeTOA(new ItemStack(Items.DIAMOND_CHESTPLATE), 7, "x x", "xxx", "xxx", 'x', Items.DIAMOND);
         this.addRecipeTOA(new ItemStack(Items.DIAMOND_HELMET), 7, "xxx", "x x", "   ", 'x', Items.DIAMOND);
         this.addRecipeTOA(new ItemStack(Items.DIAMOND_LEGGINGS), 7, "xxx", "x x", "x x", 'x', Items.DIAMOND);
     
         if (AgeOfWeapons.activateChainArmorCrafting){
             this.addRecipeTOA(new ItemStack(Items.CHAINMAIL_BOOTS), 4, "   ", "o o", "x x", 'x', Items.IRON_INGOT, 'o', Items.STRING);
             this.addRecipeTOA(new ItemStack(Items.CHAINMAIL_CHESTPLATE), 4, "o o", "xxx", "xox", 'x', Items.IRON_INGOT, 'o', Items.STRING);
             this.addRecipeTOA(new ItemStack(Items.CHAINMAIL_HELMET), 4, "oxo", "x x", "   ", 'x', Items.IRON_INGOT, 'o', Items.STRING);
             this.addRecipeTOA(new ItemStack(Items.CHAINMAIL_LEGGINGS), 4, "oxo", "x x", "x x", 'x', Items.IRON_INGOT, 'o', Items.STRING);
         }

    	
    } else {                                                    // NORMAL MODE
    	
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
    }   


    
    
    
    

    /** Age of Weapons **/
    //blocks
    this.addRecipeTOA(new ItemStack(ModBlocks.rubyBlock), 0, "xxx", "xxx", "xxx", 'x', ModItems.ruby);
    this.addRecipeTOA(new ItemStack(ModBlocks.sapphireBlock), 0, "xxx", "xxx", "xxx", 'x', ModItems.sapphire);
    this.addRecipeTOA(new ItemStack(ModBlocks.amethystBlock), 0, "xxx", "xxx", "xxx", 'x', ModItems.amethyst);
    this.addRecipeTOA(new ItemStack(ModBlocks.topazBlock), 0, "xxx", "xxx", "xxx", 'x', ModItems.topaz);
    this.addRecipeTOA(new ItemStack(ModBlocks.amberBlock), 0, "xxx", "xxx", "xxx", 'x', ModItems.amber);
    this.addRecipeTOA(new ItemStack(ModBlocks.witheredIronBlock), 0, "xxx", "xxx", "xxx", 'x', ModItems.witheredIronIngot);
    this.addShapelessRecipeTOA(new ItemStack(ModItems.ruby, 9), 0, ModBlocks.rubyBlock);
    this.addShapelessRecipeTOA(new ItemStack(ModItems.sapphire, 9), 0, ModBlocks.sapphireBlock);
    this.addShapelessRecipeTOA(new ItemStack(ModItems.amethyst, 9), 0, ModBlocks.amethystBlock);
    this.addShapelessRecipeTOA(new ItemStack(ModItems.topaz, 9), 0, ModBlocks.topazBlock);
    this.addShapelessRecipeTOA(new ItemStack(ModItems.amber, 9), 0, ModBlocks.amberBlock);
    this.addShapelessRecipeTOA(new ItemStack(ModItems.witheredIronIngot, 9), 0, ModBlocks.witheredIronBlock);
    this.addRecipeTOA(new ItemStack(ModBlocks.crusher), 7, "xxx", "xzx", "xox", 'x', Blocks.COBBLESTONE, 'o', Blocks.FURNACE, 'z', Items.FLINT);
    this.addRecipeTOA(new ItemStack(ModBlocks.crusher), 7, "xxx", "xzx", "xox", 'x', Blocks.COBBLESTONE, 'o', Blocks.FURNACE, 'z', ModItems.ironShard);
    this.addRecipeTOA(new ItemStack(ModBlocks.tableOfAges), 0, "xxx", "ozo", "oyo", 'x', Blocks.STONE_SLAB, 'o', Blocks.STONE, 'z', Blocks.CRAFTING_TABLE, 'y', Blocks.CHEST);

    if(AgeOfWeapons.activateWeaponBoxRecipe) {
        this.addRecipeTOA(new ItemStack(ModBlocks.weaponBox), 7, "xxx", "xox", "xxx", 'x', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE), 'o', Blocks.EMERALD_BLOCK);
    }
    if(AgeOfWeapons.activateNexusRecipe) {
        this.addRecipeTOA(new ItemStack(ModBlocks.nexus), 11, "v v", "vzv", "xox", 'x', new ItemStack(Blocks.IRON_BLOCK), 'o', new ItemStack(Blocks.WOOL, 1, 11), 'v', Items.IRON_INGOT, 'z', Items.NETHER_STAR );
        this.addRecipeTOA(new ItemStack(ModBlocks.nexus2), 11, "v v", "vzv", "xox", 'x', new ItemStack(Blocks.IRON_BLOCK), 'o', new ItemStack(Blocks.WOOL, 1, 14), 'v', Items.IRON_INGOT, 'z', Items.NETHER_STAR );
        this.addRecipeTOA(new ItemStack(ModBlocks.nexus3), 11, "v v", "vzv", "xox", 'x', new ItemStack(Blocks.IRON_BLOCK), 'o', new ItemStack(Blocks.WOOL, 1, 4), 'v', Items.IRON_INGOT, 'z', Items.NETHER_STAR );
        this.addRecipeTOA(new ItemStack(ModBlocks.nexus4), 11, "v v", "vzv", "xox", 'x', new ItemStack(Blocks.IRON_BLOCK), 'o', new ItemStack(Blocks.WOOL, 1, 13), 'v', Items.IRON_INGOT, 'z', Items.NETHER_STAR );
    }

  	
  	//items  #0
	this.addRecipeTOA(new ItemStack(ModItems.axeBladeDiamond), 0, "xx ", "xo ", "   ", 'x', ModItems.diamondShard, 'o', Items.DIAMOND);
  	this.addRecipeTOA(new ItemStack(ModItems.axeBladeGold), 0, "xx ", "xo ", "   ", 'x', ModItems.goldShard, 'o', Items.GOLD_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.axeBladeIron), 0, "xx ", "xo ", "   ", 'x', ModItems.ironShard, 'o', Items.IRON_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.axeBladeWithered), 0, "xx ", "xo ", "   ", 'x', ModItems.witheredIronShard, 'o', ModItems.witheredIronIngot);
  	this.addRecipeTOA(new ItemStack(ModItems.axeBladeStone), 0, "xx ", "xo ", "   ", 'x', ModItems.stoneShard, 'o', Blocks.COBBLESTONE);
  	this.addRecipeTOA(new ItemStack(ModItems.axeBladeStone), 0, "xx ", "xo ", "   ", 'x', Items.FLINT, 'o', Blocks.COBBLESTONE);
  	this.addRecipeTOA(new ItemStack(ModItems.axeBladeWood), 0, "xx ", "xo ", "   ", 'x', ModItems.woodShard, 'o', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
  	this.addRecipeTOA(new ItemStack(ModItems.swordBladeDiamond), 0, " x ", " x ", "   ", 'x', Items.DIAMOND);
  	this.addRecipeTOA(new ItemStack(ModItems.swordBladeGold), 0, " x ", " x ", "   ", 'x', Items.GOLD_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.swordBladeIron), 0, " x ", " x ", "   ", 'x', Items.IRON_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.swordBladeWithered), 0, " x ", " x ", "   ", 'x', ModItems.witheredIronIngot);
  	this.addRecipeTOA(new ItemStack(ModItems.swordBladeStone), 0, " x ", " x ", "   ", 'x', Blocks.COBBLESTONE);
  	this.addRecipeTOA(new ItemStack(ModItems.swordBladeWood), 0, " x ", " x ", "   ", 'x', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
  	this.addRecipeTOA(new ItemStack(ModItems.broadBladeDiamond), 0, "xx ", "xx ", "   ", 'x', ModItems.swordBladeDiamond);
  	this.addRecipeTOA(new ItemStack(ModItems.broadBladeGold), 0, "xx ", "xx ", "   ", 'x', ModItems.swordBladeGold);
  	this.addRecipeTOA(new ItemStack(ModItems.broadBladeIron), 0, "xx ", "xx ", "   ", 'x', ModItems.swordBladeIron);
  	this.addRecipeTOA(new ItemStack(ModItems.broadBladeWithered), 0, "xx ", "xx ", "   ", 'x', ModItems.swordBladeWithered);
  	this.addRecipeTOA(new ItemStack(ModItems.broadBladeStone), 0, "xx ", "xx ", "   ", 'x', ModItems.swordBladeStone);
  	this.addRecipeTOA(new ItemStack(ModItems.broadBladeWood), 0, "xx ", "xx ", "   ", 'x', ModItems.swordBladeWood);
  	this.addShapelessRecipeTOA(new ItemStack(ModItems.lumber, 3), 0, new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
  	this.addRecipeTOA(new ItemStack(ModItems.ironStick, 4), 0, "   ", " x ", " x ", 'x', Items.IRON_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.ironLongstick), 0, "   ", " x ", " x ", 'x', ModItems.ironStick);
  	this.addRecipeTOA(new ItemStack(ModItems.woodLongstick), 0, "   ", " x ", " x ", 'x', Items.STICK);
  	this.addRecipeTOA(new ItemStack(ModItems.swordHandle), 0, "   ", "xxx", " o ", 'x', ModItems.ironShard, 'o', Items.STICK);
  	this.addRecipeTOA(new ItemStack(ModItems.toxin), 0, "ixi", "xox", "ccc", 'x', new ItemStack(Items.FISH, 1, 3), 'o', Items.GLASS_BOTTLE, 'i', Items.ROTTEN_FLESH, 'c', Items.FERMENTED_SPIDER_EYE);
  	this.addRecipeTOA(new ItemStack(ModItems.radioactiveToxin), 0, "xxx", "xox", "xxx", 'x', new ItemStack(Items.FISH, 1, 3), 'o', ModItems.toxin);
  	this.addShapelessRecipeTOA(new ItemStack(ModItems.glassShard, 4), 0, new ItemStack(Blocks.GLASS, 1, OreDictionary.WILDCARD_VALUE));
  	this.addShapelessRecipeTOA(new ItemStack(ModItems.glassShard, 4), 0, new ItemStack(Blocks.GLASS_PANE, 1, OreDictionary.WILDCARD_VALUE));
  	this.addRecipeTOA(new ItemStack(ModItems.witheredIronIngot), 0, " x ", "xox", " x ", 'x', ModItems.witherDust, 'o', Items.IRON_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.witheredIronShard), 0, " x ", "xox", " x ", 'x', ModItems.witherDust, 'o', ModItems.ironShard);

/**       schauen was rumbuggt  (wegen Hammer)
  	this.addRecipeTOA(new ItemStack(ModItems.woodShard, 3), 0, new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
  	this.addRecipeTOA(new ItemStack(ModItems.stoneShard, 3), 0, new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.COBBLESTONE, 1, OreDictionary.WILDCARD_VALUE));
  	this.addRecipeTOA(new ItemStack(ModItems.stoneShard, 3), 0, new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.STONE, 1, OreDictionary.WILDCARD_VALUE));
  	this.addRecipeTOA(new ItemStack(ModItems.ironShard, 3), 0, new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), Items.IRON_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.goldShard, 3), 0, new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), Items.GOLD_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.emeraldShard, 3), 0, new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), Items.EMERALD);
  	this.addRecipeTOA(new ItemStack(ModItems.diamondShard, 3), 0, new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), Items.DIAMOND);
  	this.addRecipeTOA(new ItemStack(ModItems.glassShard, 4), 0, new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.GLASS, 1, OreDictionary.WILDCARD_VALUE));
  	this.addRecipeTOA(new ItemStack(ModItems.glassShard, 4), 0, new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.GLASS_PANE, 1, OreDictionary.WILDCARD_VALUE));
  	this.addRecipeTOA(new ItemStack(ModItems.amethystShard, 3), 0, new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), ModItems.amethyst);
  	this.addRecipeTOA(new ItemStack(ModItems.rubyShard, 3), 0, new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), ModItems.ruby);
  	this.addRecipeTOA(new ItemStack(ModItems.sapphireShard, 3), 0, new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), ModItems.sapphire);
  	this.addRecipeTOA(new ItemStack(ModItems.topazShard, 3), 0, new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), ModItems.topaz);
  	this.addRecipeTOA(new ItemStack(ModItems.witheredIronShard, 3), 0, new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), ModItems.witheredIronIngot);
	this.addRecipeTOA(new ItemStack(ModItems.witherDust, 8), new ItemStack(ModItems.hammer, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.SKULL, 1, 1));

 **/ 	
  	this.addRecipeTOA(new ItemStack(ModItems.hammer), 0, " x ", " o ", " ", 'x', Blocks.STONE, 'o', Items.STICK);

  	this.addRecipeTOA(new ItemStack(ModItems.blankGun), 7, "xxx", " ox", "  x", 'x', Items.IRON_INGOT, 'o', Blocks.LEVER);
  	this.addRecipeTOA(new ItemStack(ModItems.blankRifle), 7, "   ", "xxo", " i ", 'x', ModItems.barrel, 'o', ModItems.blankGun, 'i', ModItems.gunHandle);
  	this.addRecipeTOA(new ItemStack(ModItems.barrel), 7, "   ", "xxx", "   ", 'x', Items.IRON_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.gunHandle), 7, "   ", " xx", "xx ", 'x', Items.IRON_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.haftIron), 7, " x ", " xx", " xx", 'x', Items.IRON_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.haftWood), 7, " x ", " xx", " xx", 'x', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
  	this.addRecipeTOA(new ItemStack(ModItems.visor), 7, "xxx", "o o", "xxx", 'x', Items.IRON_INGOT, 'o', new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 3));
  	this.addRecipeTOA(new ItemStack(ModItems.cloth), 0, "   ", "xxx", "xxx", 'x', Items.STRING);

  	
  	//upgrades
  	this.addRecipeTOA(new ItemStack(ModItems.upgradeStoneAge), 0, "xxx", "xox", "xxx", 'x', ModItems.stoneShard, 'o', Blocks.STONE);
  	this.addRecipeTOA(new ItemStack(ModItems.upgradeAtiquity), 1, "xxx", "xox", "xxx", 'x', new ItemStack(Items.DYE, 1, 4), 'o', Blocks.LAPIS_BLOCK);
  	this.addRecipeTOA(new ItemStack(ModItems.upgradeMiddleAges), 2, "xxx", "xox", "xxx", 'x', ModItems.ironShard, 'o', Blocks.IRON_BLOCK);
    this.addRecipeTOA(new ItemStack(ModItems.upgradeEarlyModernAge), 4, "xxx", "xox", "xxx", 'x', ModItems.goldShard, 'o', Blocks.GOLD_BLOCK);
  if(AgeOfWeapons.activateModern){  
  	this.addRecipeTOA(new ItemStack(ModItems.upgradeModernAge), 7, "xxx", "xox", "xxx", 'x', ModItems.diamondShard, 'o', Blocks.DIAMOND_BLOCK);
 }if(AgeOfWeapons.activateMystic) {	
    this.addRecipeTOA(new ItemStack(ModItems.upgradeMystic), 2, "xxx", "xox", "xxx", 'x', ModItems.amethystShard, 'o', ModBlocks.amethystBlock);               	
 }if(AgeOfWeapons.activatePiracy) { 
    this.addRecipeTOA(new ItemStack(ModItems.upgradePiracy), 4, "xxx", "xox", "xxx", 'x', ModItems.glassShard, 'o', new ItemStack(Blocks.STAINED_GLASS, 1, 5));         
 }if(AgeOfWeapons.activateEdoPeriod) { 
    this.addRecipeTOA(new ItemStack(ModItems.upgradeEdoPeriod), 4, "xxx", "xox", "xxx", 'x', ModItems.amber, 'o', ModBlocks.amberBlock);               
 }if(AgeOfWeapons.activateFantasy) { 
    this.addRecipeTOA(new ItemStack(ModItems.upgradeFantasy), 7, "xxx", "xox", "xxx", 'x', ModItems.rubyShard, 'o', ModBlocks.rubyBlock);        
 }if(AgeOfWeapons.activateEpic) { 
	    this.addRecipeTOA(new ItemStack(ModItems.upgradeEpic), 9, "xxx", "xox", "xxx", 'x', ModItems.topazShard, 'o', ModBlocks.topazBlock);
 }if(AgeOfWeapons.activateBBY) { 
    this.addRecipeTOA(new ItemStack(ModItems.upgradeBBY), 11, "xxx", "xox", "xxx", 'x', ModItems.sapphireShard, 'o', ModBlocks.sapphireBlock);   
 }if(AgeOfWeapons.activateFuture) { 
    this.addRecipeTOA(new ItemStack(ModItems.upgradeFuture), 9, "xxx", "xox", "xxx", 'x', ModItems.emeraldShard, 'o', Blocks.EMERALD_BLOCK);
 }   

    /** Stone Age #1 **/
    this.addShapelessRecipeTOA(new ItemStack(ModItems.rock, 4), 1, Blocks.COBBLESTONE);
  	this.addRecipeTOA(new ItemStack(ModItems.handAxStone), 1, " x ", "xxx", "   ", 'x', ModItems.stoneShard);
  	this.addRecipeTOA(new ItemStack(ModItems.handAxStone), 1, " x ", "xxx", "   ", 'x', Items.FLINT);
  	this.addRecipeTOA(new ItemStack(ModItems.cavemanKniveStone), 1, "  x", " o ", "  z", 'x', ModItems.stoneShard, 'o', Items.STRING, 'z', Items.STICK);
  	this.addRecipeTOA(new ItemStack(ModItems.cavemanKniveBone), 1, "   ", " x ", "x  ", 'x', Items.BONE);
  	this.addRecipeTOA(new ItemStack(ModItems.woodCudgel), 1, " o ", " x ", " x ", 'x', Items.STICK, 'o', ModItems.lumber);
  	this.addRecipeTOA(new ItemStack(ModItems.stoneCudgel), 1, " o ", " x ", " x ", 'x', Items.STICK, 'o', ModItems.rock);
  	this.addRecipeTOA(new ItemStack(ModItems.ax), 1, " oo", " xo", " x ", 'x', Items.STICK, 'o', ModItems.rock);
  	this.addRecipeTOA(new ItemStack(ModItems.throwWood), 1, "  x", " x ", "x  ", 'x', Items.STICK);
  	this.addRecipeTOA(new ItemStack(ModItems.cavemanSpear), 1, "   ", " x ", " x ", 'x', Items.STICK);
  	this.addRecipeTOA(new ItemStack(ModItems.cavemanBoots), 1, "   ", "x x", "o o", 'x', Items.STRING, 'o', ModItems.cloth);
  	this.addRecipeTOA(new ItemStack(ModItems.cavemanChestplate), 1, "o  ", "oo ", "ooo", 'o', ModItems.cloth);
  	this.addRecipeTOA(new ItemStack(ModItems.cavemanLeggings), 1, "ooo", "   ", "   ", 'o', ModItems.cloth);
  	this.addRecipeTOA(new ItemStack(ModItems.cavemanHelmet), 1, "xox", "o o", "   ", 'x', Items.STRING, 'o', ModItems.cloth);
  	
  	/** Antiquity #2 **/
  	this.addRecipeTOA(new ItemStack(ModItems.kniveWood), 2, "   ", " o ", " x ", 'x', Items.STICK, 'o', ModItems.woodShard);
  	this.addRecipeTOA(new ItemStack(ModItems.kniveStone), 2, "   ", " o ", " x ", 'x', Items.STICK, 'o', ModItems.stoneShard);
  	this.addRecipeTOA(new ItemStack(ModItems.kniveIron), 2, "   ", " o ", " x ", 'x', Items.STICK, 'o', ModItems.ironShard);
  	this.addRecipeTOA(new ItemStack(ModItems.kniveGold), 2, "   ", " o ", " x ", 'x', Items.STICK, 'o', ModItems.goldShard);
  	this.addRecipeTOA(new ItemStack(ModItems.kniveDiamond), 2, "   ", " o ", " x ", 'x', Items.STICK, 'o', ModItems.diamondShard);
  	this.addRecipeTOA(new ItemStack(ModItems.skewerWood), 2, "   ", " o ", "x  ", 'x', Items.STICK, 'o', ModItems.woodShard);
  	this.addRecipeTOA(new ItemStack(ModItems.skewerStone), 2, "   ", " o ", "x  ", 'x', Items.STICK, 'o', ModItems.stoneShard);
  	this.addRecipeTOA(new ItemStack(ModItems.skewerIron), 2, "   ", " o ", "x  ", 'x', Items.STICK, 'o', ModItems.ironShard);
  	this.addRecipeTOA(new ItemStack(ModItems.skewerGold), 2, "   ", " o ", "x  ", 'x', Items.STICK, 'o', ModItems.goldShard);
  	this.addRecipeTOA(new ItemStack(ModItems.skewerDiamond), 2, "   ", " o ", "x  ", 'x', Items.STICK, 'o', ModItems.diamondShard);
  	this.addRecipeTOA(new ItemStack(ModItems.daggerWood), 2, "   ", " o ", " x ", 'x', ModItems.swordHandle, 'o', ModItems.woodShard);
  	this.addRecipeTOA(new ItemStack(ModItems.daggerStone), 2, "   ", " o ", " x ", 'x', ModItems.swordHandle, 'o', ModItems.stoneShard);
  	this.addRecipeTOA(new ItemStack(ModItems.daggerIron), 2, "   ", " o ", " x ", 'x', ModItems.swordHandle, 'o', ModItems.ironShard);
  	this.addRecipeTOA(new ItemStack(ModItems.daggerGold), 2, "   ", " o ", " x ", 'x', ModItems.swordHandle, 'o', ModItems.goldShard);
  	this.addRecipeTOA(new ItemStack(ModItems.daggerDiamond), 2, "   ", " o ", " x ", 'x', ModItems.swordHandle, 'o', ModItems.diamondShard);
  	this.addRecipeTOA(new ItemStack(ModItems.recurveBow), 2, " xx", "x o", " xx", 'x', Items.STICK, 'o', Items.STRING);
  	
  	/** Middle Ages #4 **/
  	this.addRecipeTOA(new ItemStack(ModItems.battleAxeWood), 4, "ioz", " x ", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.PLANKS,1 , OreDictionary.WILDCARD_VALUE), 'i', ModItems.axeBladeWood, 'z', ModItems.woodShard);
  	this.addRecipeTOA(new ItemStack(ModItems.battleAxeStone), 4, "ioz", " x ", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.COBBLESTONE,1 , OreDictionary.WILDCARD_VALUE), 'i', ModItems.axeBladeStone, 'z', ModItems.stoneShard);
  	this.addRecipeTOA(new ItemStack(ModItems.battleAxeIron), 4, "ioz", " x ", " x ", 'x', Items.STICK, 'o', Items.IRON_INGOT, 'i', ModItems.axeBladeIron, 'z', ModItems.ironShard);
  	this.addRecipeTOA(new ItemStack(ModItems.battleAxeGold), 4, "ioz", " x ", " x ", 'x', Items.STICK, 'o', Items.GOLD_INGOT, 'i', ModItems.axeBladeGold, 'z', ModItems.goldShard);
  	this.addRecipeTOA(new ItemStack(ModItems.battleAxeDiamond), 4, "ioz", " x ", " x ", 'x', Items.STICK, 'o', Items.DIAMOND, 'i', ModItems.axeBladeDiamond, 'z', ModItems.diamondShard);
  	this.addRecipeTOA(new ItemStack(ModItems.flailStone), 4, "  x", " xo", "x i", 'x', Items.STICK, 'i', ModItems.rock, 'o', Items.STRING);
  	this.addRecipeTOA(new ItemStack(ModItems.flailIron), 4, "  x", " xo", "x i", 'x', Items.STICK, 'i', Items.IRON_INGOT, 'o', Items.STRING);
  	this.addRecipeTOA(new ItemStack(ModItems.flailGold), 4, "  x", " xo", "x i", 'x', Items.STICK, 'i', Items.GOLD_INGOT, 'o', Items.STRING);
  	this.addRecipeTOA(new ItemStack(ModItems.flailDiamond), 4, "  x", " xo", "x i", 'x', Items.STICK, 'i', Items.DIAMOND, 'o', Items.STRING);
  	this.addRecipeTOA(new ItemStack(ModItems.halbertWood), 4, "ioz", " x ", " c ", 'x', Items.STICK, 'o', new ItemStack(Blocks.PLANKS,1 , OreDictionary.WILDCARD_VALUE), 'i', ModItems.axeBladeWood, 'z', ModItems.woodShard, 'c', ModItems.woodLongstick);
  	this.addRecipeTOA(new ItemStack(ModItems.halbertStone), 4, "ioz", " x ", " c ", 'x', Items.STICK, 'o', new ItemStack(Blocks.COBBLESTONE,1 , OreDictionary.WILDCARD_VALUE), 'i', ModItems.axeBladeStone, 'z', ModItems.stoneShard, 'c', ModItems.woodLongstick);
  	this.addRecipeTOA(new ItemStack(ModItems.halbertIron), 4, "ioz", " x ", " c ", 'x', Items.STICK, 'o', Items.IRON_INGOT, 'i', ModItems.axeBladeIron, 'z', ModItems.ironShard, 'c', ModItems.woodLongstick, 'c', ModItems.woodLongstick);
  	this.addRecipeTOA(new ItemStack(ModItems.halbertGold), 4, "ioz", " x ", " c ", 'x', Items.STICK, 'o', Items.GOLD_INGOT, 'i', ModItems.axeBladeGold, 'z', ModItems.goldShard, 'c', ModItems.woodLongstick, 'c', ModItems.woodLongstick);
  	this.addRecipeTOA(new ItemStack(ModItems.halbertDiamond), 4, "ioz", " x ", " c ", 'x', Items.STICK, 'o', Items.DIAMOND, 'i', ModItems.axeBladeDiamond, 'z', ModItems.diamondShard, 'c', ModItems.woodLongstick, 'c', ModItems.woodLongstick);
  	this.addRecipeTOA(new ItemStack(ModItems.longswordWood), 4, " x ", " x ", " o ", 'x', ModItems.swordBladeWood, 'o', ModItems.swordHandle);
  	this.addRecipeTOA(new ItemStack(ModItems.longswordStone), 4, " x ", " x ", " o ", 'x', ModItems.swordBladeStone, 'o', ModItems.swordHandle);
  	this.addRecipeTOA(new ItemStack(ModItems.longswordIron), 4, " x ", " x ", " o ", 'x', ModItems.swordBladeIron, 'o', ModItems.swordHandle);
  	this.addRecipeTOA(new ItemStack(ModItems.longswordGold), 4, " x ", " x ", " o ", 'x', ModItems.swordBladeGold, 'o', ModItems.swordHandle);
  	this.addRecipeTOA(new ItemStack(ModItems.longswordDiamond), 4, " x ", " x ", " o ", 'x', ModItems.swordBladeDiamond, 'o', ModItems.swordHandle);
  	this.addRecipeTOA(new ItemStack(ModItems.spearWood), 4, " o ", " x ", " i ", 'x', Items.STICK, 'o', ModItems.woodShard, 'i', ModItems.woodLongstick);
  	this.addRecipeTOA(new ItemStack(ModItems.spearStone), 4, " o ", " x ", " i ", 'x', Items.STICK, 'o', ModItems.stoneShard, 'i', ModItems.woodLongstick);
  	this.addRecipeTOA(new ItemStack(ModItems.spearStone), 4, " o ", " x ", " i ", 'x', Items.STICK, 'o', Items.FLINT, 'i', ModItems.woodLongstick);
  	this.addRecipeTOA(new ItemStack(ModItems.spearIron), 4, " o ", " x ", " i ", 'x', Items.STICK, 'o', ModItems.ironShard, 'i', ModItems.woodLongstick);
  	this.addRecipeTOA(new ItemStack(ModItems.spearGold), 4, " o ", " x ", " i ", 'x', Items.STICK, 'o', ModItems.goldShard, 'i', ModItems.woodLongstick);
  	this.addRecipeTOA(new ItemStack(ModItems.spearDiamond), 4, " o ", " x ", " i ", 'x', Items.STICK, 'o', ModItems.diamondShard, 'i', ModItems.woodLongstick);
  	this.addRecipeTOA(new ItemStack(ModItems.tridentWood), 4, "ooo", " x ", " i ", 'x', Items.STICK, 'o', ModItems.woodShard, 'i', ModItems.woodLongstick);
  	this.addRecipeTOA(new ItemStack(ModItems.tridentStone), 4, "ooo", " x ", " i ", 'x', Items.STICK, 'o', ModItems.stoneShard, 'i', ModItems.woodLongstick);
  	this.addRecipeTOA(new ItemStack(ModItems.tridentStone), 4, "ooo", " x ", " i ", 'x', Items.STICK, 'o', Items.FLINT, 'i', ModItems.woodLongstick);
  	this.addRecipeTOA(new ItemStack(ModItems.tridentIron), 4, "ooo", " x ", " i ", 'x', Items.STICK, 'o', ModItems.ironShard, 'i', ModItems.woodLongstick);
  	this.addRecipeTOA(new ItemStack(ModItems.tridentGold), 4, "ooo", " x ", " i ", 'x', Items.STICK, 'o', ModItems.goldShard, 'i', ModItems.woodLongstick);
  	this.addRecipeTOA(new ItemStack(ModItems.tridentDiamond), 4, "ooo", " x ", " i ", 'x', Items.STICK, 'o', ModItems.diamondShard, 'i', ModItems.woodLongstick);
  	this.addRecipeTOA(new ItemStack(ModItems.waraxeWood), 4, "oco", " x ", " x ", 'x', Items.STICK, 'o', ModItems.axeBladeWood, 'c', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
  	this.addRecipeTOA(new ItemStack(ModItems.waraxeStone), 4, "oco", " x ", " x ", 'x', Items.STICK, 'o', ModItems.axeBladeStone, 'c', new ItemStack(Blocks.COBBLESTONE, 1, OreDictionary.WILDCARD_VALUE));
  	this.addRecipeTOA(new ItemStack(ModItems.waraxeIron), 4, "oco", " x ", " x ", 'x', Items.STICK, 'o', ModItems.axeBladeIron, 'c', Items.IRON_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.waraxeGold), 4, "oco", " x ", " x ", 'x', Items.STICK, 'o', ModItems.axeBladeGold, 'c', Items.GOLD_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.waraxeDiamond), 4, "oco", " x ", " x ", 'x', Items.STICK, 'o', ModItems.axeBladeDiamond, 'c', Items.DIAMOND);
  	this.addRecipeTOA(new ItemStack(ModItems.warhammerWood), 4, "ooo", "oxo", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.PLANKS, 1 , OreDictionary.WILDCARD_VALUE)); 
  	this.addRecipeTOA(new ItemStack(ModItems.warhammerStone), 4, "ooo", "oxo", " x ", 'x', Items.STICK, 'o', new ItemStack(Blocks.COBBLESTONE, 1 , OreDictionary.WILDCARD_VALUE)); 
  	this.addRecipeTOA(new ItemStack(ModItems.warhammerIron), 4, "ooo", "oxo", " x ", 'x', Items.STICK, 'o', Items.IRON_INGOT); 
  	this.addRecipeTOA(new ItemStack(ModItems.warhammerGold), 4, "ooo", "oxo", " x ", 'x', Items.STICK, 'o', Items.GOLD_INGOT); 
  	this.addRecipeTOA(new ItemStack(ModItems.warhammerDiamond), 4, "ooo", "oxo", " x ", 'x', Items.STICK, 'o', Items.DIAMOND); 
  	this.addRecipeTOA(new ItemStack(ModItems.crossbow), 4, "  o", " x ", "xi ", 'x', Items.STICK, 'o', Items.BOW, 'i', Blocks.TRIPWIRE_HOOK); 
  	this.addRecipeTOA(new ItemStack(ModItems.longbow), 4, " xo", "x o", " xo", 'x', ModItems.woodLongstick, 'o', Items.STRING); 
  	
  	/** Early Modern Age #7 **/
  	this.addRecipeTOA(new ItemStack(ModBlocks.barbedWire), 7, "xox", "oxo", "xox", 'x', ModItems.ironShard, 'o', Items.STRING); 
  	this.addShapelessRecipeTOA(new ItemStack(ModBlocks.nailTrap), 7, ModItems.ironShard, ModItems.ironShard, ModItems.ironShard, ModItems.ironShard);
  //this.addShapelessRecipeTOA(new ItemStack(ModBlocks.toxicNailTrap), 7, ModItems.ironShard, ModItems.ironShard, ModItems.ironShard, ModItems.ironShard, new ItemStack(Items.FISH, 1, 3));
  	this.addShapelessRecipeTOA(new ItemStack(ModBlocks.toxicNailTrap), 7, ModItems.ironShard, ModItems.ironShard, ModItems.ironShard, ModItems.ironShard, ModItems.toxin);
  //this.addShapelessRecipeTOA(new ItemStack(ModBlocks.toxicNailTrap), 7, ModBlocks.nailTrap, new ItemStack(Items.FISH, 1, 3));
  	this.addShapelessRecipeTOA(new ItemStack(ModBlocks.toxicNailTrap), 7, ModBlocks.nailTrap, ModItems.toxin);
  	this.addRecipeTOA(new ItemStack(ModBlocks.explosiveMine), 7, "xix", "xox", "xxx", 'x', Items.IRON_INGOT, 'o', Blocks.TNT, 'i', Blocks.STONE_PRESSURE_PLATE); 
  	this.addRecipeTOA(new ItemStack(ModBlocks.toxicMine), 7, "xix", "xox", "xzx", 'x', Items.IRON_INGOT, 'o', Blocks.TNT, 'i', Blocks.STONE_PRESSURE_PLATE, 'z', ModItems.toxin); 
  	this.addShapelessRecipeTOA(new ItemStack(ModBlocks.toxicMine), 7, ModBlocks.explosiveMine, ModItems.toxin);
  	this.addRecipeTOA(new ItemStack(ModBlocks.fallTrapDirt), 7, "ooo", "ooo", "xxx", 'x', ModItems.woodLongstick, 'o', Blocks.DIRT); 
  	this.addRecipeTOA(new ItemStack(ModBlocks.fallTrapPlanks), 7, "ooo", "ooo", "xxx", 'x', ModItems.woodLongstick, 'o', Blocks.PLANKS); 
  	this.addRecipeTOA(new ItemStack(ModBlocks.fallTrapStone), 7, "ooo", "ooo", "xxx", 'x', ModItems.woodLongstick, 'o', Blocks.COBBLESTONE); 
  	this.addRecipeTOA(new ItemStack(ModBlocks.bearTrap), 7, "xxx", "ioi", "xxx", 'x', ModItems.ironShard, 'o', Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE, 'i', Items.IRON_INGOT); 
  	this.addRecipeTOA(new ItemStack(ModBlocks.razorWire), 7, "xxx", "xox", "xxx", 'x', ModItems.ironShard, 'o', ModBlocks.barbedWire); 
  	this.addRecipeTOA(new ItemStack(ModBlocks.razorWire, 8), 7, "xox", "oxo", "xox", 'x', ModItems.swordBladeIron, 'o', Items.STRING); 
  	this.addRecipeTOA(new ItemStack(ModItems.multiToolWood, 8), 7, "cii", " xo", " x ", 'x', Items.STICK, 'o', ModItems.woodShard, 'c', ModItems.axeBladeWood, 'i', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE)); 
  	this.addRecipeTOA(new ItemStack(ModItems.multiToolStone, 8), 7, "cii", " xo", " x ", 'x', Items.STICK, 'o', ModItems.stoneShard, 'c', ModItems.axeBladeStone, 'i', Blocks.COBBLESTONE); 
  	this.addRecipeTOA(new ItemStack(ModItems.multiToolIron, 8), 7, "cii", " xo", " x ", 'x', Items.STICK, 'o', ModItems.ironShard, 'c', ModItems.axeBladeIron, 'i', Items.IRON_INGOT); 
  	this.addRecipeTOA(new ItemStack(ModItems.multiToolGold, 8), 7, "cii", " xo", " x ", 'x', Items.STICK, 'o', ModItems.goldShard, 'c', ModItems.axeBladeGold, 'i', Items.GOLD_INGOT); 
  	this.addRecipeTOA(new ItemStack(ModItems.multiToolDiamond, 8), 7, "cii", " xo", " x ", 'x', Items.STICK, 'o', ModItems.diamondShard, 'c', ModItems.axeBladeDiamond, 'i', Items.DIAMOND); 
  	this.addRecipeTOA(new ItemStack(ModItems.oldAmmo, 5), 7, " x ", "xox", " x ", 'x', Items.IRON_INGOT, 'o', Items.GUNPOWDER); 
  	this.addRecipeTOA(new ItemStack(ModItems.oldShotgunAmmo, 3), 7, "xox", "xox", "xox", 'x', Items.IRON_INGOT, 'o', ModItems.oldAmmo); 
  	this.addRecipeTOA(new ItemStack(ModItems.cannonball), 7, " x ", "xxx", " x ", 'x', Items.IRON_INGOT); 
  	this.addShapelessRecipeTOA(new ItemStack(ModItems.pebble, 8), 7, Blocks.GRAVEL);
  	this.addShapelessRecipeTOA(new ItemStack(ModItems.dynamite, 4), 7, Blocks.TNT);
  	this.addRecipeTOA(new ItemStack(Blocks.TNT), 7, "   ", "xx ", "xx ", 'x', ModItems.dynamite); 
  	this.addRecipeTOA(new ItemStack(ModBlocks.barbedWireFence, 4), 7, "   ", "xox", "   ", 'x', ModItems.ironStick, 'o', ModBlocks.barbedWire); 
  	this.addRecipeTOA(new ItemStack(ModBlocks.obstacle), 7, "x x", " x ", "x x", 'x', ModItems.ironStick);   	
  	this.addRecipeTOA(new ItemStack(ModItems.soldierBoots), 7, "x x", "x x", "o o", 'x', ModItems.cloth, 'o', Items.LEATHER); 
  	this.addRecipeTOA(new ItemStack(ModItems.soldierHelmet), 7, "xox", "o o", "   ", 'x', ModItems.cloth, 'o', Items.IRON_INGOT); 
  	this.addRecipeTOA(new ItemStack(ModItems.soldierLeggings), 7, "oxo", "x x", "x x", 'x', ModItems.cloth, 'o', Items.LEATHER); 
  	this.addRecipeTOA(new ItemStack(ModItems.soldierChestplate), 7, "o x", "xox", "xxo", 'x', ModItems.cloth, 'o', Items.LEATHER); 
  	
  	/** Mystic #3 **/
  	this.addRecipeTOA(new ItemStack(ModItems.mysticKnive), 3, "xxx", "xox", "xxx", 'x', new ItemStack(Items.DYE, 1, 4), 'o', ModItems.kniveDiamond); 
  	this.addRecipeTOA(new ItemStack(ModItems.pufferfishStick), 3, "   ", " x ", " o ", 'x', new ItemStack(Items.FISH, 1, 3), 'o', Items.STICK); 
  	this.addRecipeTOA(new ItemStack(ModItems.scepterUnholy), 3, "ooo", "oio", " x ", 'x', Items.STICK, 'i', ModItems.amethyst, 'o', ModItems.ironStick); 
  	this.addRecipeTOA(new ItemStack(ModItems.wandBasic), 3, " o ", " x ", " x ", 'x', Items.STICK, 'o', ModItems.amethyst); 
  	this.addShapelessRecipeTOA(new ItemStack(ModItems.wandAether), 3, ModItems.wandBasic, Items.GHAST_TEAR);
  	this.addShapelessRecipeTOA(new ItemStack(ModItems.wandNether), 3, ModItems.wandBasic, Items.BLAZE_ROD);
  	this.addShapelessRecipeTOA(new ItemStack(ModItems.wandCurse), 3, ModItems.wandBasic, Items.ENDER_PEARL);
  	this.addShapelessRecipeTOA(new ItemStack(ModItems.wandHoly), 3, ModItems.wandBasic, Items.GOLDEN_APPLE);
  	this.addShapelessRecipeTOA(new ItemStack(ModItems.wandMaelstrom), 3, ModItems.wandBasic, Items.ENDER_EYE);
  	this.addRecipeTOA(new ItemStack(ModItems.warhornDefensive), 3, "x x", " xo", "  x", 'x', Items.IRON_INGOT, 'o', Items.EMERALD); 
  	this.addRecipeTOA(new ItemStack(ModItems.warhornOffensive), 3, "x x", " xo", "  x", 'x', Items.IRON_INGOT, 'o', ModItems.topaz); 

  	/** Fantasy #8 **/
  	this.addRecipeTOA(new ItemStack(ModItems.clawWood), 8, "xxx", "oxo", " o ", 'x', ModItems.kniveWood, 'o', ModItems.ironStick); 
  	this.addRecipeTOA(new ItemStack(ModItems.clawStone), 8, "xxx", "oxo", " o ", 'x', ModItems.kniveStone, 'o', ModItems.ironStick); 
  	this.addRecipeTOA(new ItemStack(ModItems.clawIron), 8, "xxx", "oxo", " o ", 'x', ModItems.kniveIron, 'o', ModItems.ironStick); 
  	this.addRecipeTOA(new ItemStack(ModItems.clawGold), 8, "xxx", "oxo", " o ", 'x', ModItems.kniveGold, 'o', ModItems.ironStick); 
  	this.addRecipeTOA(new ItemStack(ModItems.clawDiamond), 8, "xxx", "oxo", " o ", 'x', ModItems.kniveDiamond, 'o', ModItems.ironStick); 
  	this.addRecipeTOA(new ItemStack(ModItems.clawSwordWood), 8, "   ", "x x", " o ", 'x', ModItems.swordBladeWood, 'o', ModItems.swordHandle); 
  	this.addRecipeTOA(new ItemStack(ModItems.clawSwordStone), 8, "   ", "x x", " o ", 'x', ModItems.swordBladeStone, 'o', ModItems.swordHandle); 
  	this.addRecipeTOA(new ItemStack(ModItems.clawSwordIron), 8, "   ", "x x", " o ", 'x', ModItems.swordBladeIron, 'o', ModItems.swordHandle); 
  	this.addRecipeTOA(new ItemStack(ModItems.clawSwordGold), 8, "   ", "x x", " o ", 'x', ModItems.swordBladeGold, 'o', ModItems.swordHandle); 
  	this.addRecipeTOA(new ItemStack(ModItems.clawSwordDiamond), 8, "   ", "x x", " o ", 'x', ModItems.swordBladeDiamond, 'o', ModItems.swordHandle); 
  	this.addRecipeTOA(new ItemStack(ModItems.claymoreWood), 8, "   ", " x ", " o ", 'x', ModItems.broadBladeWood, 'o', ModItems.swordHandle); 
  	this.addRecipeTOA(new ItemStack(ModItems.claymoreStone), 8, "   ", " x ", " o ", 'x', ModItems.broadBladeStone, 'o', ModItems.swordHandle); 
  	this.addRecipeTOA(new ItemStack(ModItems.claymoreIron), 8, "   ", " x ", " o ", 'x', ModItems.broadBladeIron, 'o', ModItems.swordHandle); 
  	this.addRecipeTOA(new ItemStack(ModItems.claymoreGold), 8, "   ", " x ", " o ", 'x', ModItems.broadBladeGold, 'o', ModItems.swordHandle); 
  	this.addRecipeTOA(new ItemStack(ModItems.claymoreDiamond), 8, "   ", " x ", " o ", 'x', ModItems.broadBladeDiamond, 'o', ModItems.swordHandle); 
	this.addRecipeTOA(new ItemStack(ModItems.longClaymoreWood), 8, " x ", " x ", " o ", 'x', ModItems.broadBladeWood, 'o', ModItems.swordHandle); 
  	this.addRecipeTOA(new ItemStack(ModItems.longClaymoreStone), 8, " x ", " x ", " o ", 'x', ModItems.broadBladeStone, 'o', ModItems.swordHandle); 
  	this.addRecipeTOA(new ItemStack(ModItems.longClaymoreIron), 8, " x ", " x ", " o ", 'x', ModItems.broadBladeIron, 'o', ModItems.swordHandle); 
  	this.addRecipeTOA(new ItemStack(ModItems.longClaymoreGold), 8, " x ", " x ", " o ", 'x', ModItems.broadBladeGold, 'o', ModItems.swordHandle); 
  	this.addRecipeTOA(new ItemStack(ModItems.longClaymoreDiamond), 8, " x ", " x ", " o ", 'x', ModItems.broadBladeDiamond, 'o', ModItems.swordHandle); 
  	this.addRecipeTOA(new ItemStack(ModItems.fantasySwordWood), 8, " xi", "ixi", " o ", 'x', ModItems.broadBladeWood, 'o', ModItems.swordHandle, 'i', ModItems.woodShard); 
  	this.addRecipeTOA(new ItemStack(ModItems.fantasySwordStone), 8, " xi", "ixi", " o ", 'x', ModItems.broadBladeStone, 'o', ModItems.swordHandle, 'i', ModItems.stoneShard); 
  	this.addRecipeTOA(new ItemStack(ModItems.fantasySwordIron), 8, " xi", "ixi", " o ", 'x', ModItems.broadBladeIron, 'o', ModItems.swordHandle, 'i', ModItems.ironShard); 
  	this.addRecipeTOA(new ItemStack(ModItems.fantasySwordGold), 8, " xi", "ixi", " o ", 'x', ModItems.broadBladeGold, 'o', ModItems.swordHandle, 'i', ModItems.goldShard); 
  	this.addRecipeTOA(new ItemStack(ModItems.fantasySwordDiamond), 8, " xi", "ixi", " o ", 'x', ModItems.broadBladeDiamond, 'o', ModItems.swordHandle, 'i', ModItems.diamondShard); 
  	this.addShapelessRecipeTOA(new ItemStack(ModItems.lightBow), 8, Items.BOW, Items.GLOWSTONE_DUST, Items.GLOWSTONE_DUST, Items.GLOWSTONE_DUST);
  	this.addShapelessRecipeTOA(new ItemStack(ModItems.shadowBow), 8, Items.BOW, Items.FIREWORK_CHARGE, Items.FIREWORK_CHARGE, Items.FIREWORK_CHARGE);

  	/** Edo Period #5 **/
  	this.addShapelessRecipeTOA(new ItemStack(ModItems.batonWood), 5, ModItems.woodLongstick);
  	this.addShapelessRecipeTOA(new ItemStack(ModItems.batonIron), 5, ModItems.ironLongstick);
  	this.addRecipeTOA(new ItemStack(ModItems.blowgun), 5, " x ", " x ", " x ", 'x', Items.REEDS); 
  	this.addRecipeTOA(new ItemStack(ModItems.lash), 5, " oo", "o  ", " x ", 'x', Items.LEATHER, 'o', Items.STRING);
  	this.addRecipeTOA(new ItemStack(ModItems.throwingStar), 5, " x ", "x x", " x ", 'x', ModItems.ironShard); 
  	this.addRecipeTOA(new ItemStack(ModItems.kunai), 5, "   ", " x ", " o ", 'x', ModItems.ironShard, 'o', Blocks.TRIPWIRE_HOOK); 
  	this.addRecipeTOA(new ItemStack(ModItems.nunchuckWood), 5, "x  ", " o ", "  x", 'x', Items.STICK, 'o', Items.STRING); 
  	this.addRecipeTOA(new ItemStack(ModItems.nunchuckIron), 5, "x  ", " o ", "  x", 'x', ModItems.ironStick, 'o', Items.STRING); 
  	this.addRecipeTOA(new ItemStack(ModItems.throwingKnifeIron), 5, "   ", " o ", " x ", 'x', ModItems.ironStick, 'o', ModItems.ironShard); 
  	this.addRecipeTOA(new ItemStack(ModItems.throwingKnifeGold), 5, "   ", " o ", " x ", 'x', ModItems.ironStick, 'o', ModItems.goldShard); 
  	this.addRecipeTOA(new ItemStack(ModItems.throwingKnifeDiamond), 5, "   ", " o ", " x ", 'x', ModItems.ironStick, 'o', ModItems.diamondShard); 
  	this.addRecipeTOA(new ItemStack(ModItems.katanaWood), 5, "  o", " o ", "x  ", 'x', ModItems.swordHandle, 'o', ModItems.swordBladeWood); 
  	this.addRecipeTOA(new ItemStack(ModItems.katanaStone), 5, "  o", " o ", "x  ", 'x', ModItems.swordHandle, 'o', ModItems.swordBladeStone); 
  	this.addRecipeTOA(new ItemStack(ModItems.katanaIron), 5, "  o", " o ", "x  ", 'x', ModItems.swordHandle, 'o', ModItems.swordBladeIron); 
  	this.addRecipeTOA(new ItemStack(ModItems.katanaGold), 5, "  o", " o ", "x  ", 'x', ModItems.swordHandle, 'o', ModItems.swordBladeGold); 
  	this.addRecipeTOA(new ItemStack(ModItems.katanaDiamond), 5, "  o", " o ", "x  ", 'x', ModItems.swordHandle, 'o', ModItems.swordBladeDiamond); 
  	this.addRecipeTOA(new ItemStack(ModItems.ninjatoWood), 5, "  o", " o ", "x  ", 'x', ModItems.ironStick, 'o', ModItems.swordBladeWood); 
  	this.addRecipeTOA(new ItemStack(ModItems.ninjatoStone), 5, "  o", " o ", "x  ", 'x', ModItems.ironStick, 'o', ModItems.swordBladeStone); 
  	this.addRecipeTOA(new ItemStack(ModItems.ninjatoIron), 5, "  o", " o ", "x  ", 'x', ModItems.ironStick, 'o', ModItems.swordBladeIron); 
  	this.addRecipeTOA(new ItemStack(ModItems.ninjatoGold), 5, "  o", " o ", "x  ", 'x', ModItems.ironStick, 'o', ModItems.swordBladeGold); 
  	this.addRecipeTOA(new ItemStack(ModItems.ninjatoDiamond), 5, "  o", " o ", "x  ", 'x', ModItems.ironStick, 'o', ModItems.swordBladeDiamond); 
  	this.addRecipeTOA(new ItemStack(ModItems.ninjaBoots), 5, "   ", "x x", "x x", 'x', ModItems.cloth); 
  	this.addRecipeTOA(new ItemStack(ModItems.ninjaHelmet), 5, "xxx", "x x", " x ", 'x', ModItems.cloth); 
  	this.addRecipeTOA(new ItemStack(ModItems.ninjaLeggings), 5, "xxx", "x x", "x x", 'x', ModItems.cloth); 
  	this.addRecipeTOA(new ItemStack(ModItems.ninjaChestplate), 5, "x x", "xxx", "xxx", 'x', ModItems.cloth); 
  	this.addRecipeTOA(new ItemStack(ModItems.assassinBoots), 5, "   ", "x x", "o o", 'x', ModItems.cloth, 'o', Items.LEATHER); 
  	this.addRecipeTOA(new ItemStack(ModItems.assassinHelmet), 5, " x ", "xxx", "x x", 'x', ModItems.cloth); 
  	this.addRecipeTOA(new ItemStack(ModItems.assassinLeggings), 5, "xxx", "o o", "o o", 'x', ModItems.cloth, 'o', Items.LEATHER); 
  	this.addRecipeTOA(new ItemStack(ModItems.assassinChestplate), 5, "x x", "oxo", "ooo", 'x', ModItems.cloth, 'o', Items.LEATHER); 
  	
  	/** Modern Age #9 **/
 if(AgeOfWeapons.activateBombs){ 	   //TODO
  	//this.addRecipeTOA(new ItemStack(ModBlocks.neutronBomb), 10, "xxx", "xxx", "xxx", 'x', Blocks.TNT); 
  	//this.addShapelessRecipeTOA(new ItemStack(ModBlocks.nuclearBomb), 10, ModBlocks.neutronBomb, ModItems.radioactiveToxin, ModItems.radioactiveToxin, ModItems.radioactiveToxin, ModItems.radioactiveToxin);
 }
	this.addRecipeTOA(new ItemStack(ModItems.concentratedGunpowder), 9, " x ", "xxx", " x ", 'x', Items.GUNPOWDER); 
	this.addRecipeTOA(new ItemStack(ModItems.ammoSmall, 3), 9, "   ", " x ", "xox", 'x', Items.GOLD_INGOT, 'o', ModItems.concentratedGunpowder); 
	this.addRecipeTOA(new ItemStack(ModItems.ammoBig, 3), 9, " x ", "xox", "xox", 'x', Items.GUNPOWDER, 'o', ModItems.concentratedGunpowder); 
	this.addRecipeTOA(new ItemStack(ModItems.ammoBundleSmall), 9, "o o", "xxx", "xxx", 'x', ModItems.ammoSmall, 'o', Items.STRING); 
	this.addRecipeTOA(new ItemStack(ModItems.ammoBundleBig), 9, "o o", "xxx", "xxx", 'x', ModItems.ammoBig, 'o', Items.STRING); 
	this.addRecipeTOA(new ItemStack(ModItems.shotgunAmmo, 3), 9, "oio", "oio", "xxx", 'x', Items.GOLD_INGOT, 'o', new ItemStack(Items.DYE, 1, 1), 'i', ModItems.ironShard); 
	this.addRecipeTOA(new ItemStack(ModItems.shotgunAmmo2, 3), 9, "oio", "oio", "xxx", 'x', Items.GOLD_INGOT, 'o', new ItemStack(Items.DYE, 1, 4), 'i', ModItems.ironShard); 
	this.addRecipeTOA(new ItemStack(ModItems.magazineSmall), 9, "   ", " x ", "xx ", 'x', Items.IRON_INGOT); 
	this.addRecipeTOA(new ItemStack(ModItems.magazineBig), 9, " xx", "xx ", "xxx", 'x', Items.IRON_INGOT); 
	this.addRecipeTOA(new ItemStack(ModItems.magazineLong), 9, "  x", " x ", "xx ", 'x', Items.IRON_INGOT); 
	this.addRecipeTOA(new ItemStack(ModItems.magazineDrum), 9, " x ", "xxx", " x ", 'x', Items.IRON_INGOT); 
	this.addRecipeTOA(new ItemStack(ModItems.nightVisionGoggles), 9, " x ", " o ", " i ", 'x', new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 5), 'o', Items.REDSTONE, 'i', ModItems.fieldGlasses); 
	this.addRecipeTOA(new ItemStack(ModItems.fieldGlasses), 9, "   ", "xox", "xox", 'x', Items.IRON_INGOT, 'o', Blocks.IRON_BARS); 
	this.addRecipeTOA(new ItemStack(ModItems.machineCase), 9, "xix", "xox", "xxx", 'x', Items.IRON_INGOT, 'o', Blocks.REDSTONE_BLOCK, 'i', Items.DIAMOND); 
	this.addRecipeTOA(new ItemStack(ModItems.tankFlame), 9, " x ", "xox", " x ", 'x', Items.IRON_INGOT, 'o', Items.BLAZE_POWDER); 
	
	this.addRecipeTOA(new ItemStack(ModItems.industrialMiner), 9, "xxx", " o ", "   ", 'x', Items.IRON_PICKAXE, 'o', ModItems.machineCase); 
	this.addRecipeTOA(new ItemStack(ModItems.industrialExcavator), 9, "xxx", " o ", "   ", 'x', Items.IRON_SHOVEL, 'o', ModItems.machineCase); 
	this.addRecipeTOA(new ItemStack(ModItems.flameThrower), 9, " xz", "xxo", " i ", 'i', ModItems.gunHandle, 'x', ModItems.barrel, 'z', ModItems.tankFlame, 'o', ModItems.blankRifle); 
	this.addRecipeTOA(new ItemStack(ModBlocks.spikes), 9, "   ", "xxx", "o#o", 'x', ModItems.ironShard, 'o', Items.REDSTONE, '#', Blocks.PISTON); 	
	this.addRecipeTOA(new ItemStack(ModBlocks.spikesToxic), 9, " i ", "xxx", "o#o", 'x', ModItems.ironShard, 'o', Items.REDSTONE, '#', Blocks.PISTON, 'i', ModItems.toxin); 	
  	this.addShapelessRecipeTOA(new ItemStack(ModBlocks.spikesToxic), 9, ModItems.toxin, ModBlocks.spikes);
	this.addRecipeTOA(new ItemStack(ModBlocks.timeBomb), 9, "izi", "xxx", "o#o", 'x', Blocks.TNT, 'o', Items.REDSTONE, '#', Items.CLOCK, 'i', Items.IRON_INGOT, 'z', Blocks.STONE_BUTTON); 	
	this.addRecipeTOA(new ItemStack(ModItems.grenade), 9, " i ", "xox", " x ", 'x', Items.IRON_INGOT, 'o', Blocks.TNT, 'i', Blocks.LEVER); 	
  	this.addShapelessRecipeTOA(new ItemStack(ModItems.grenadeFrag), 9, ModItems.grenade, ModItems.ironShard, ModItems.ironShard, ModItems.ironShard);
  	this.addShapelessRecipeTOA(new ItemStack(ModItems.grenadePoison), 9, ModItems.grenade, ModItems.toxin);
  	this.addShapelessRecipeTOA(new ItemStack(ModItems.grenadeSmoke), 9, ModItems.grenade, Items.COAL, Items.COAL, Items.COAL);
  	this.addRecipeTOA(new ItemStack(ModItems.modernSoldierBoots), 9, "   ", "x x", "o o", 'x', ModItems.cloth, 'o', Items.IRON_INGOT); 
  	this.addRecipeTOA(new ItemStack(ModItems.modernSoldierHelmet), 9, "ooo", "oxo", " x ", 'x', ModItems.cloth, 'o', Items.IRON_INGOT); 
  	this.addRecipeTOA(new ItemStack(ModItems.modernSoldierLeggings), 9, "ooo", "o o", "x x", 'x', ModItems.cloth, 'o', Items.IRON_INGOT); 
  	this.addRecipeTOA(new ItemStack(ModItems.modernSoldierChestplate), 9, "x x", "ooo", "ooo", 'x', ModItems.cloth, 'o', Items.IRON_INGOT); 
  	
	/** Future #11 **/
	this.addRecipeTOA(new ItemStack(ModItems.tankPoison), 11, " x ", "xox", " x ", 'x', Items.IRON_INGOT, 'o', ModItems.toxin); 
	this.addRecipeTOA(new ItemStack(ModItems.tankWater), 11, " x ", "xox", " x ", 'x', Items.IRON_INGOT, 'o', Items.WATER_BUCKET); 

	this.addRecipeTOA(new ItemStack(ModItems.industrialMultiTool), 11, "xyz", " o ", "   ", 'y', Items.IRON_SHOVEL, 'x', Items.IRON_PICKAXE, 'z', Items.IRON_AXE, 'o', ModItems.machineCase); 
	this.addRecipeTOA(new ItemStack(ModItems.poisonThrower), 11, "  xz", "xxo", " i ", 'i', ModItems.gunHandle, 'x', ModItems.barrel, 'z', ModItems.tankPoison, 'o', ModItems.blankRifle); 
	this.addRecipeTOA(new ItemStack(ModItems.waterThrower), 11, "  xz", "xxo", " i ", 'i', ModItems.gunHandle, 'x', ModItems.barrel, 'z', ModItems.tankWater, 'o', ModItems.blankRifle); 
	this.addRecipeTOA(new ItemStack(ModItems.imploder), 11, " i ", "xox", " x ", 'x', Items.IRON_INGOT, 'o', ModBlocks.neutronBomb, 'i', Blocks.TRIPWIRE_HOOK); 	
  	this.addRecipeTOA(new ItemStack(ModItems.futureSoldierBoots), 11, "   ", "o o", "x x", 'x', ModItems.witheredIronIngot, 'o', Items.IRON_INGOT); 
  	this.addRecipeTOA(new ItemStack(ModItems.futureSoldierHelmet), 11, "xxx", "xox", " x ", 'x', ModItems.witheredIronIngot, 'o', Items.DIAMOND); 
  	this.addRecipeTOA(new ItemStack(ModItems.futureSoldierLeggings), 11, "xxx", "x x", "o o", 'x', ModItems.witheredIronIngot, 'o', Items.IRON_INGOT); 
  	this.addRecipeTOA(new ItemStack(ModItems.futureSoldierChestplate), 11, "x x", "oxo", "xxx", 'x', ModItems.witheredIronIngot, 'o', Items.DIAMOND); 
	
	/** Epic #10 **/ 
	this.addRecipeTOA(new ItemStack(ModItems.masterAxe), 10, "oo ", "ox ", " x ", 'o', ModItems.witheredIronIngot, 'x', Items.STICK); 
	this.addRecipeTOA(new ItemStack(ModItems.masterPickaxe), 10, "ooo", " x ", " x ", 'o', ModItems.witheredIronIngot, 'x', Items.STICK); 
	this.addRecipeTOA(new ItemStack(ModItems.masterShovel), 10, " o ", " x ", " x ", 'o', ModItems.witheredIronIngot, 'x', Items.STICK); 
	this.addRecipeTOA(new ItemStack(ModItems.masterSword), 10, " o ", " o ", " x ", 'o', ModItems.witheredIronIngot, 'x', Items.STICK); 
	this.addRecipeTOA(new ItemStack(ModItems.masterHelmet), 10, "xxx", "x x", "   ", 'x', ModItems.witheredIronIngot); 
	this.addRecipeTOA(new ItemStack(ModItems.masterChestplate), 10, "x x", "xxx", "xxx", 'x', ModItems.witheredIronIngot); 
	this.addRecipeTOA(new ItemStack(ModItems.masterLeggings), 10, "xxx", "x x", "x x", 'x', ModItems.witheredIronIngot); 
	this.addRecipeTOA(new ItemStack(ModItems.masterBoots), 10, "   ", "x x", "x x", 'x', ModItems.witheredIronIngot); 
  	this.addRecipeTOA(new ItemStack(ModItems.legendarySword), 10, " xi", "ixi", " o ", 'x', ModItems.broadBladeWithered, 'o', ModItems.swordHandle, 'i', ModItems.witheredIronShard); 
  	this.addRecipeTOA(new ItemStack(ModItems.epicKatana), 10, "  o", " o ", "x  ", 'x', ModItems.swordHandle, 'o', ModItems.swordBladeWithered); 
  	this.addRecipeTOA(new ItemStack(ModItems.epicWaraxe), 10, "oco", " x ", " x ", 'x', Items.STICK, 'o', ModItems.axeBladeWithered, 'c', ModItems.witheredIronIngot);
	
		NBTTagCompound rex = new NBTTagCompound();
		rex.setTag("SkullOwner", new NBTTagString("XxRexRaptorxX"));
		ItemStack skullRex = new ItemStack(Items.SKULL, 1, 3);
		skullRex.setTagCompound(rex);
	this.addShapelessRecipeTOA(new ItemStack(ModItems.epicKatana), 10, ModItems.katanaIron, skullRex);
		NBTTagCompound steve = new NBTTagCompound();
		steve.setTag("SkullOwner", new NBTTagString("Steve44TV"));
		ItemStack skullSteve = new ItemStack(Items.SKULL, 1, 3);
		skullSteve.setTagCompound(steve);
	this.addShapelessRecipeTOA(new ItemStack(ModItems.epicWaraxe), 10, ModItems.waraxeIron, skullSteve);
		NBTTagCompound jsq = new NBTTagCompound();
		jsq.setTag("SkullOwner", new NBTTagString("MrJSQ"));
		ItemStack skullJsq = new ItemStack(Items.SKULL, 1, 3);
		skullJsq.setTagCompound(jsq);
	this.addShapelessRecipeTOA(new ItemStack(ModItems.epicBattleAxe), 10, ModItems.battleAxeIron, skullJsq);
    
    
	/** Piracy #6 **/ 
	this.addRecipeTOA(new ItemStack(ModItems.castNet), 6, "xxx", "xxx", "xxx", 'x', Items.STRING);
	this.addRecipeTOA(new ItemStack(ModItems.grapplingIron), 6, "xxx", " i ", " i ", 'x', ModItems.ironShard, 'i', ModItems.ironStick);
  	this.addShapelessRecipeTOA(new ItemStack(ModItems.grapplingHook), 6, ModItems.grapplingIron, ModItems.blankGun);
	this.addRecipeTOA(new ItemStack(ModItems.harpoon), 6, " ix", " i ", " i ", 'x', ModItems.ironShard, 'i', ModItems.ironStick);
	this.addRecipeTOA(new ItemStack(ModItems.telescope), 6, "xxx", "o o", "xxx", 'x', Items.GOLD_INGOT, 'o', new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 3));
	this.addRecipeTOA(new ItemStack(ModItems.saberWood), 6, " x ", " x ", "ii ", 'x', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE), 'i', Items.STICK);
	this.addRecipeTOA(new ItemStack(ModItems.saberStone), 6, " x ", " x ", "ii ", 'x', Blocks.COBBLESTONE, 'i', Items.STICK);
	this.addRecipeTOA(new ItemStack(ModItems.saberIron), 6, " x ", " x ", "ii ", 'x', Items.IRON_INGOT, 'i', Items.STICK);
	this.addRecipeTOA(new ItemStack(ModItems.saberGold), 6, " x ", " x ", "ii ", 'x', Items.GOLD_INGOT, 'i', Items.STICK);
	this.addRecipeTOA(new ItemStack(ModItems.saberDiamond), 6, " x ", " x ", "ii ", 'x', Items.DIAMOND, 'i', Items.STICK);
	this.addRecipeTOA(new ItemStack(ModItems.macheteWood), 6, " xx", " x ", " i ", 'x', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE), 'i', Items.STICK);
	this.addRecipeTOA(new ItemStack(ModItems.macheteStone), 6, " xx", " x ", " i ", 'x', Blocks.COBBLESTONE, 'i', Items.STICK);
	this.addRecipeTOA(new ItemStack(ModItems.macheteIron), 6, " xx", " x ", " i ", 'x', Items.IRON_INGOT, 'i', Items.STICK);
	this.addRecipeTOA(new ItemStack(ModItems.macheteGold), 6, " xx", " x ", " i ", 'x', Items.GOLD_INGOT, 'i', Items.STICK);
	this.addRecipeTOA(new ItemStack(ModItems.macheteDiamond), 6, " xx", " x ", " i ", 'x', Items.DIAMOND, 'i', Items.STICK);

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

    public List<IRecipe> getRecipeList() {
        return this.recipes;
    }

}
