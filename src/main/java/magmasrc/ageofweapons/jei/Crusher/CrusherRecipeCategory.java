package magmasrc.ageofweapons.jei.Crusher;

import magmasrc.ageofweapons.main.AgeOfWeapons;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawableAnimated;
import mezz.jei.api.gui.IDrawableStatic;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.util.ResourceLocation;

public abstract class CrusherRecipeCategory<T extends IRecipeWrapper> implements IRecipeCategory<T> {

    protected static final int inputSlot = 0;
    protected static final int fuelSlot = 1;
    protected static final int outputSlot = 2;

    protected final IDrawableStatic staticFlame;
    protected final IDrawableAnimated animatedFlame;
    protected final IDrawableAnimated arrow;


    public CrusherRecipeCategory(IGuiHelper guiHelper) {

        staticFlame = guiHelper.createDrawable(new ResourceLocation(AgeOfWeapons.MODID, "textures/gui/crusher_jei_gui.png"), 82, 0, 14, 14);
        animatedFlame = guiHelper.createAnimatedDrawable(staticFlame, 300, IDrawableAnimated.StartDirection.TOP, true);

        IDrawableStatic arrowDrawable = guiHelper.createDrawable(new ResourceLocation(AgeOfWeapons.MODID, "textures/gui/crusher_jei_gui.png"), 82, 14, 24, 17);
        this.arrow = guiHelper.createAnimatedDrawable(arrowDrawable, 200, IDrawableAnimated.StartDirection.LEFT, false);

    }

}
