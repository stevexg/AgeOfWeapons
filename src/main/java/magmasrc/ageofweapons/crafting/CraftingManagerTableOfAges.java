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
    this.addRecipeTOA(new ItemStack(ModBlocks.amethystBlock), 0, "xxx", "xxx", "xxx", 'x', ModItems.amethyst);
    this.addRecipeTOA(new ItemStack(ModBlocks.topazBlock), 0, "xxx", "xxx", "xxx", 'x', ModItems.topaz);
    this.addRecipeTOA(new ItemStack(ModBlocks.amberBlock), 0, "xxx", "xxx", "xxx", 'x', ModItems.amber);
    this.addShapelessRecipeTOA(new ItemStack(ModItems.ruby, 9), 0, ModBlocks.rubyBlock);
    this.addShapelessRecipeTOA(new ItemStack(ModItems.sapphire, 9), 0, ModBlocks.sapphireBlock);
    this.addShapelessRecipeTOA(new ItemStack(ModItems.amethyst, 9), 0, ModBlocks.amethystBlock);
    this.addShapelessRecipeTOA(new ItemStack(ModItems.topaz, 9), 0, ModBlocks.topazBlock);
    this.addShapelessRecipeTOA(new ItemStack(ModItems.amber, 9), 0, ModBlocks.amberBlock);
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
  	this.addShapelessRecipeTOA(new ItemStack(ModItems.glassShard, 4), 0, new ItemStack(Blocks.GLASS, 1, OreDictionary.WILDCARD_VALUE));
  	this.addShapelessRecipeTOA(new ItemStack(ModItems.glassShard, 4), 0, new ItemStack(Blocks.GLASS_PANE, 1, OreDictionary.WILDCARD_VALUE));


  	this.addRecipeTOA(new ItemStack(ModItems.blankGun), 7, "xxx", "  x", "  x", 'x', Items.IRON_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.barrel), 7, "   ", "xxx", "   ", 'x', Items.IRON_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.gunHandle), 7, "   ", " xx", "xx ", 'x', Items.IRON_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.haftIron), 7, " x ", " xx", " xx", 'x', Items.IRON_INGOT);
  	this.addRecipeTOA(new ItemStack(ModItems.haftWood), 7, " x ", " xx", " xx", 'x', new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE));
  	this.addRecipeTOA(new ItemStack(ModItems.visor), 7, "xxx", "o o", "xxx", 'x', Items.IRON_INGOT, 'o', new ItemStack(Blocks.GLASS_PANE, 1, 3));
  	//upgrades
  	this.addRecipeTOA(new ItemStack(ModItems.upgradeStoneAge), 0, "xxx", "xox", "xxx", 'x', ModItems.stoneShard, 'o', Blocks.STONE);
  	this.addRecipeTOA(new ItemStack(ModItems.upgradeAtiquity), 1, "xxx", "xox", "xxx", 'x', new ItemStack(Items.DYE, 1, 4), 'o', Blocks.LAPIS_BLOCK);
  	this.addRecipeTOA(new ItemStack(ModItems.upgradeMiddleAges), 2, "xxx", "xox", "xxx", 'x', ModItems.ironShard, 'o', Blocks.IRON_BLOCK);
    this.addRecipeTOA(new ItemStack(ModItems.upgradeMystic), 2, "xxx", "xox", "xxx", 'x', ModItems.amethystShard, 'o', ModBlocks.amethystBlock);               
  	this.addRecipeTOA(new ItemStack(ModItems.upgradeEarlyModernAge), 4, "xxx", "xox", "xxx", 'x', ModItems.goldShard, 'o', Blocks.GOLD_BLOCK);
    this.addRecipeTOA(new ItemStack(ModItems.upgradePiracy), 4, "xxx", "xox", "xxx", 'x', ModItems.glassShard, 'o', new ItemStack(Blocks.GLASS, 1, 9));       
    this.addRecipeTOA(new ItemStack(ModItems.upgradeEdoPeriod), 4, "xxx", "xox", "xxx", 'x', ModItems.amber, 'o', ModBlocks.amberBlock);               
  	this.addRecipeTOA(new ItemStack(ModItems.upgradeModernAge), 7, "xxx", "xox", "xxx", 'x', ModItems.diamondShard, 'o', Blocks.DIAMOND_BLOCK);
    this.addRecipeTOA(new ItemStack(ModItems.upgradeFantasy), 7, "xxx", "xox", "xxx", 'x', ModItems.rubyShard, 'o', ModBlocks.rubyBlock);        
    this.addRecipeTOA(new ItemStack(ModItems.upgradeEpic), 11, "xxx", "xox", "xxx", 'x', ModItems.topazShard, 'o', ModBlocks.topazBlock);
    this.addRecipeTOA(new ItemStack(ModItems.upgradeBBY), 11, "xxx", "xox", "xxx", 'x', ModItems.sapphireShard, 'o', ModBlocks.sapphireBlock);   
  	this.addRecipeTOA(new ItemStack(ModItems.upgradeFuture), 11, "xxx", "xox", "xxx", 'x', ModItems.emeraldShard, 'o', Blocks.EMERALD_BLOCK);
  	//creativ upgrade geht nicht und upgrade zahlen komisch durcheinander

    /** Stone Age **/
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

  	/** Antiquity **/
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
  	
  	/** Middle Ages **/
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
