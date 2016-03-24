package techreborn.compat.jei.recycler;

import javax.annotation.Nonnull;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.recipe.BlankRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.util.text.translation.I18n;
import techreborn.client.gui.GuiRecycler;
import techreborn.compat.jei.RecipeCategoryUids;
import techreborn.compat.jei.RecipeUtil;

public class RecyclerRecipeCategory extends BlankRecipeCategory
{
	private static final int[] INPUT_SLOTS = { 0 };
	private static final int[] OUTPUT_SLOTS = { 1 };

	private final IDrawable background;
	private final String title;

	public RecyclerRecipeCategory(IGuiHelper guiHelper)
	{
		background = guiHelper.createDrawable(GuiRecycler.texture, 55, 30, 82, 26);
		title = I18n.translateToLocal("tile.techreborn.recycler.name");
	}

	@Nonnull
	@Override
	public String getUid()
	{
		return RecipeCategoryUids.RECYCLER;
	}

	@Nonnull
	@Override
	public String getTitle()
	{
		return title;
	}

	@Nonnull
	@Override
	public IDrawable getBackground()
	{
		return background;
	}

	@Override
	public void setRecipe(@Nonnull IRecipeLayout recipeLayout, @Nonnull IRecipeWrapper recipeWrapper)
	{
		IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();
		guiItemStacks.init(INPUT_SLOTS[0], true, 0, 3);

		guiItemStacks.init(OUTPUT_SLOTS[0], false, 60, 4);

		if (recipeWrapper instanceof RecyclerRecipeWrapper)
		{
			RecyclerRecipeWrapper recipe = (RecyclerRecipeWrapper) recipeWrapper;
			RecipeUtil.setRecipeItems(recipeLayout, recipe, INPUT_SLOTS, OUTPUT_SLOTS, null, null);
		}
	}
}
