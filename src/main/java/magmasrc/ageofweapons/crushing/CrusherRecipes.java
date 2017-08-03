package magmasrc.ageofweapons.crushing;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;

import magmasrc.ageofweapons.main.ModItems;
import net.minecraft.block.Block;
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