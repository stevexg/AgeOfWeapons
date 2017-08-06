package magmasrc.ageofweapons.crushing;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.Map.Entry;

import magmasrc.ageofweapons.main.ModBlocks;
import magmasrc.ageofweapons.main.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CrusherRecipes
{
    private static final CrusherRecipes CRUSHING_BASE = new CrusherRecipes();
    private final Map<ItemStack, ItemStack> crushingList = Maps.<ItemStack, ItemStack>newHashMap();
    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

    public static CrusherRecipes instance()
    {
        return CRUSHING_BASE;
    }

    private CrusherRecipes()
    {
        this.addCrushing(Items.IRON_INGOT, new ItemStack(ModItems.ironShard, 4), 0.0F);
        this.addCrushing(Items.GOLD_INGOT, new ItemStack(ModItems.goldShard, 4), 0.0F);
        this.addCrushing(Items.DIAMOND, new ItemStack(ModItems.diamondShard, 4), 0.0F);
        this.addCrushing(Items.EMERALD, new ItemStack(ModItems.emeraldShard, 4), 0.0F);
        this.addCrushing(ModItems.rock, new ItemStack(ModItems.stoneShard, 4), 0.0F);
        this.addCrushing(ModItems.ruby, new ItemStack(ModItems.rubyShard, 4), 0.0F);
        this.addCrushing(ModItems.sapphire, new ItemStack(ModItems.sapphireShard, 4), 0.0F);
        this.addCrushing(ModItems.amethyst, new ItemStack(ModItems.amethystShard, 4), 0.0F);
        this.addCrushing(ModItems.topaz, new ItemStack(ModItems.topazShard, 4), 0.0F);

        this.addCrushingRecipeForBlock(Blocks.GLASS, new ItemStack(ModItems.glassShard, 10), 0.0F);
        this.addCrushingRecipeForBlock(Blocks.GLASS_PANE, new ItemStack(ModItems.glassShard, 4), 0.0F);
        this.addCrushingRecipeForBlock(Blocks.GRAVEL, new ItemStack(Items.FLINT, 1), 0.0F);
        this.addCrushingRecipeForBlock(Blocks.STONE, new ItemStack(ModItems.stoneShard, 10), 0.0F);
        this.addCrushingRecipeForBlock(Blocks.COBBLESTONE, new ItemStack(ModItems.rock, 6), 0.0F);
        this.addCrushingRecipeForBlock(Blocks.PLANKS, new ItemStack(ModItems.woodShard, 10), 0.0F);
        this.addCrushingRecipeForBlock(Blocks.LOG, new ItemStack(ModItems.woodShard, 10), 0.0F);
        this.addCrushingRecipeForBlock(Blocks.LOG2, new ItemStack(ModItems.woodShard, 10), 0.0F);
        this.addCrushingRecipeForBlock(Blocks.STONEBRICK, new ItemStack(Blocks.STONEBRICK, 4, 2), 0.0F);
        
        this.addCrushingRecipeForBlock(Blocks.IRON_BLOCK, new ItemStack(ModItems.ironShard, 36), 0.0F);
        this.addCrushingRecipeForBlock(Blocks.GOLD_BLOCK, new ItemStack(ModItems.goldShard, 36), 0.0F);
        this.addCrushingRecipeForBlock(Blocks.DIAMOND_BLOCK, new ItemStack(ModItems.diamondShard, 36), 0.0F);
        this.addCrushingRecipeForBlock(Blocks.EMERALD_BLOCK, new ItemStack(ModItems.emeraldShard, 36), 0.0F);
        this.addCrushingRecipeForBlock(ModBlocks.rubyBlock, new ItemStack(ModItems.rubyShard, 36), 0.0F);
        this.addCrushingRecipeForBlock(ModBlocks.sapphireBlock, new ItemStack(ModItems.sapphireShard, 36), 0.0F);
        this.addCrushingRecipeForBlock(ModBlocks.amethystBlock, new ItemStack(ModItems.amethystShard, 36), 0.0F);
        this.addCrushingRecipeForBlock(ModBlocks.topazBlock, new ItemStack(ModItems.topazShard, 36), 0.0F);










    }

    public void addCrushingRecipeForBlock(Block input, ItemStack stack, float experience)
    {
        this.addCrushing(Item.getItemFromBlock(input), stack, experience);
    }

    public void addCrushing(Item input, ItemStack stack, float experience)
    {
        this.addCrushingRecipe(new ItemStack(input, 1, 32767), stack, experience);
    }

    public void addCrushingRecipe(ItemStack input, ItemStack stack, float experience)
    {
        if (getCrushingResult(input) != ItemStack.EMPTY) { net.minecraftforge.fml.common.FMLLog.info("Ignored smelting recipe with conflicting input: " + input + " = " + stack); return; }
        this.crushingList.put(input, stack);
        this.experienceList.put(stack, Float.valueOf(experience));
    }

    public ItemStack getCrushingResult(ItemStack stack)
    {
        for (Entry<ItemStack, ItemStack> entry : this.crushingList.entrySet())
        {
            if (this.compareItemStacks(stack, entry.getKey()))
            {
                return entry.getValue();
            }
        }

        return ItemStack.EMPTY;
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Map<ItemStack, ItemStack> getCrushingList()
    {
        return this.crushingList;
    }

    public float getCrushingExperience(ItemStack stack)
    {
        float ret = stack.getItem().getSmeltingExperience(stack);
        if (ret != -1) return ret;

        for (Entry<ItemStack, Float> entry : this.experienceList.entrySet())
        {
            if (this.compareItemStacks(stack, entry.getKey()))
            {
                return entry.getValue().floatValue();
            }
        }

        return 0.0F;
    }
}