package techreborn.init.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import reborncore.api.recipe.RecipeHandler;
import techreborn.api.recipe.machines.IndustrialGrinderRecipe;
import techreborn.blocks.BlockOre;
import techreborn.init.ModFluids;

import java.security.InvalidParameterException;

/**
 * Created by Prospector
 */
public class IndustrialGrinderRecipes extends RecipeMethods {

	static FluidStack WATER = new FluidStack(FluidRegistry.WATER, 1000);
	static FluidStack MERCURY = new FluidStack(ModFluids.MERCURY, 1000);
	static FluidStack SODIUM_PERSULFATE = new FluidStack(ModFluids.SODIUMPERSULFATE, 1000);

	public static void init() {

		register(getStack(Blocks.NETHERRACK, 16), WATER, 1600, 128, getMaterial("netherrack", 16, Type.DUST), getStack(Items.GOLD_NUGGET));
		register(getStack(Blocks.NETHERRACK, 8), MERCURY, 800, 128, getMaterial("netherrack", 8, Type.DUST), getStack(Items.GOLD_NUGGET));

		register(getOre("oreCopper"), WATER, 100, 128, getMaterial("copper", 2, Type.DUST), getMaterial("gold", Type.SMALL_DUST), getMaterial("nickel", Type.SMALL_DUST));
		register(getOre("oreCopper"), SODIUM_PERSULFATE, 100, 128, getMaterial("copper", 3, Type.DUST), getMaterial("gold", Type.SMALL_DUST), getMaterial("nickel", Type.SMALL_DUST));
		register(getOre("oreCopper"), MERCURY, 100, 128, getMaterial("copper", 3, Type.DUST), getMaterial("gold", Type.DUST));

		register(getOre("oreTin"), WATER, 100, 128, getMaterial("tin", 2, Type.DUST), getMaterial("iron", Type.SMALL_DUST), getMaterial("zinc", Type.SMALL_DUST));
		register(getOre("oreTin"), SODIUM_PERSULFATE, 100, 128, getMaterial("tin", 2, Type.DUST), getMaterial("iron", Type.SMALL_DUST), getMaterial("zinc", Type.DUST));

		if (oresExist("oreUranium", "dustUranium", "smallDustPlutonium")) {
			register(getOre("oreUranium"), WATER, 100, 128, getOre("dustUranium", 2), getOre("smallDustPlutonium"));
		}

		if (oresExist("dustSmallThorium")) {
			register(getOre("oreCoal"), WATER, 100, 128, getMaterial("coal", 2, Type.DUST), getOre("dustSmallThorium"));
		} else {
			register(getOre("oreCoal"), WATER, 100, 128, getMaterial("coal", 2, Type.DUST));
		}

		register(getOre("oreIron"), WATER, 100, 128, getMaterial("iron", 2, Type.DUST), getMaterial("tin", Type.SMALL_DUST), getMaterial("nickel", 1, Type.DUST));
		register(getOre("oreLapis"), WATER, 100, 128, getStack(Items.DYE, 12, 4), getMaterial("lazurite", 3, Type.DUST));
		register(getOre("oreRedstone"), WATER, 100, 128, getStack(Items.REDSTONE, 10), getMaterial("glowstone", 2, Type.SMALL_DUST));

		register(getOre("oreGold"), WATER, 100, 128, getMaterial("gold", 2, Type.DUST), getMaterial("copper", Type.SMALL_DUST), getMaterial("nickel", Type.SMALL_DUST));
		register(getOre("oreGold"), MERCURY, 100, 128, getMaterial("gold", 3, Type.DUST), getMaterial("copper", Type.SMALL_DUST), getMaterial("nickel", Type.SMALL_DUST));
		register(getOre("oreGold"), SODIUM_PERSULFATE, 100, 128, getMaterial("gold", 2, Type.DUST), getMaterial("copper", Type.DUST), getMaterial("nickel", Type.SMALL_DUST));

		register(getOre("oreDiamond"), WATER, 100, 128, getStack(Items.DIAMOND), getMaterial("diamond", 6, Type.SMALL_DUST), getMaterial("coal", Type.DUST));
		register(getOre("oreEmerald"), WATER, 100, 128, getStack(Items.EMERALD), getMaterial("emerald", 6, Type.SMALL_DUST));

		register(getOre("oreGalena"), WATER, 100, 128, getMaterial("galena", 2, Type.DUST), getMaterial("sulfur", Type.DUST));
		register(getOre("oreGalena"), MERCURY, 100, 128, getMaterial("galena", 2, Type.DUST), getMaterial("sulfur", Type.DUST), getMaterial("silver", Type.DUST));

		register(getOre("oreLead"), WATER, 100, 128, getMaterial("lead", 2, Type.DUST), getMaterial("galena", 2, Type.SMALL_DUST));
		register(getOre("oreSilver"), WATER, 100, 128, getMaterial("silver", 2, Type.DUST), getMaterial("galena", 2, Type.SMALL_DUST));

		register(getOre("oreIridium"), WATER, 100, 128, getMaterial("iridium", Type.INGOT), getMaterial("platinum", 2, Type.SMALL_DUST));
		register(getOre("oreIridium"), MERCURY, 100, 128, getMaterial("iridium", Type.INGOT), getMaterial("platinum", Type.DUST));

		register(getOre("oreRuby"), WATER, 100, 128, getMaterial("ruby", Type.GEM), getMaterial("ruby", 6, Type.SMALL_DUST), getMaterial("red_garnet", 2, Type.SMALL_DUST));
		register(getOre("oreSapphire"), WATER, 100, 128, getMaterial("sapphire", Type.GEM), getMaterial("sapphire", 6, Type.SMALL_DUST), getMaterial("peridot", 2, Type.SMALL_DUST));
		register(BlockOre.getOreByName("bauxite"), WATER, 100, 128, getMaterial("bauxite", 4, Type.DUST), getMaterial("aluminum", Type.DUST));
		register(getOre("oreQuartz"), WATER, 100, 128, getStack(Items.QUARTZ, 2), getMaterial("sulfur", 2, Type.SMALL_DUST));
		register(getOre("orePyrite"), WATER, 100, 128, getMaterial("pyrite", 5, Type.DUST), getMaterial("sulfur", 2, Type.DUST));
		register(getOre("oreCinnabar"), WATER, 100, 128, getMaterial("cinnabar", 5, Type.DUST), getMaterial("redstone", 2, Type.SMALL_DUST), getMaterial("glowstone", Type.SMALL_DUST));

		register(getOre("oreSphalerite"), WATER, 100, 128, getMaterial("sphalerite", 5, Type.DUST), getMaterial("zinc", Type.DUST), getMaterial("yellow_garnet", Type.SMALL_DUST));
		register(getOre("oreSphalerite"), SODIUM_PERSULFATE, 100, 128, getMaterial("sphalerite", 5, Type.DUST), getMaterial("zinc", 3, Type.DUST), getMaterial("yellow_garnet", Type.SMALL_DUST));

		register(getOre("oreTungsten"), WATER, 100, 128, getMaterial("tungsten", 2, Type.DUST), getMaterial("iron", 3, Type.SMALL_DUST), getMaterial("manganese", 3, Type.SMALL_DUST));

		register(getOre("oreSheldonite"), WATER, 100, 128, getMaterial("platinum", 2, Type.DUST), getMaterial("nickel", Type.DUST), getMaterial("iridium", 2, Type.NUGGET));
		register(getOre("oreSheldonite"), MERCURY, 100, 128, getMaterial("platinum", 3, Type.DUST), getMaterial("nickel", Type.DUST), getMaterial("iridium", 2, Type.NUGGET));

		register(getOre("orePeridot"), WATER, 100, 128, getMaterial("peridot", Type.GEM), getMaterial("peridot", 6, Type.SMALL_DUST), getMaterial("emerald", 2, Type.SMALL_DUST));
		register(getOre("oreSodalite"), WATER, 100, 128, getMaterial("sodalite", 12, Type.DUST), getMaterial("aluminum", 3, Type.DUST));

		if (oresExist("oreApatite", "gemApatite")) {
			register(getOre("oreApatite"), WATER, 100, 128, getOre("gemApatite", 8), getMaterial("phosphorous", 2, Type.SMALL_DUST));
		}

		if (oresExist("oreCertusQuartz", "crystalCertusQuartz", "dustCertusQuartz")) {
			register(getOre("oreCertusQuartz"), WATER, 100, 128, getOre("crystalCertusQuartz", 2), getOre("dustCertusQuartz"));
		}

		if (oresExist("oreChargedCertusQuartz", "crystalChargedCertusQuartz", "dustCertusQuartz")) {
			register(getOre("oreChargedCertusQuartz"), WATER, 100, 128, getOre("crystalChargedCertusQuartz", 2), getOre("dustCertusQuartz", 2));
		}

		if (oresExist("oreNickel")) {
			register(getOre("oreNickel"), WATER, 100, 128, getMaterial("nickel", 2, Type.DUST), getMaterial("iron", Type.SMALL_DUST), getMaterial("platinum", Type.SMALL_DUST));
			register(getOre("oreNickel"), MERCURY, 100, 128, getMaterial("nickel", 3, Type.DUST), getMaterial("iron", Type.SMALL_DUST), getMaterial("platinum", Type.DUST));
			register(getOre("oreNickel"), SODIUM_PERSULFATE, 100, 128, getMaterial("nickel", 3, Type.DUST), getMaterial("iron", Type.SMALL_DUST), getMaterial("platinum", Type.SMALL_DUST));
		}

		if (oresExist("oreZinc")) {
			register(getOre("oreZinc"), WATER, 100, 128, getMaterial("zinc", 2, Type.DUST), getMaterial("iron", 2, Type.SMALL_DUST), getMaterial("tin", Type.SMALL_DUST));
			register(getOre("oreZinc"), SODIUM_PERSULFATE, 100, 128, getMaterial("zinc", 2, Type.DUST), getMaterial("iron", Type.DUST), getMaterial("tin", Type.SMALL_DUST));
		}

		if (oresExist("oreAmethyst", "gemAmethyst")) {
			register(getOre("oreAmethyst"), WATER, 100, 128, getOre("gemAmethyst", 2));
		}

		if (oresExist("oreTopaz", "gemTopaz")) {
			register(getOre("oreTopaz"), WATER, 100, 128, getOre("gemTopaz", 2));
		}

		if (oresExist("oreTanzanite", "gemTanzanite")) {
			register(getOre("oreTanzanite"), WATER, 100, 128, getOre("gemTanzanite", 2));
		}

		if (oresExist("oreMalachite", "gemMalachite")) {
			register(getOre("oreMalachite"), WATER, 100, 128, getOre("gemMalachite", 2));
		}

		if (oresExist("oreUranium", "uran238", "smallUran235")) {
			register(getOre("oreUranium"), WATER, 100, 128, getOre("uran238", 8), getOre("smallUran235", 2));
		}

		if (oresExist("orePitchblende", "uran238", "uran235")) {
			register(getOre("orePitchblende"), WATER, 100, 128, getOre("uran238", 8), getOre("smallUran235", 2));
		}

		if (oresExist("oreAluminum")) {
			register(getOre("oreAluminum"), WATER, 100, 128, getMaterial("aluminum", 2, Type.DUST), getMaterial("bauxite", 2, Type.SMALL_DUST));
		}

		if (oresExist("oreArdite", "dustArdite")) {
			register(getOre("oreArdite"), WATER, 100, 128, getOre("dustArdite", 2), getMaterial("sulfur", 2, Type.SMALL_DUST));
		}

		if (oresExist("oreCobalt", "dustCobalt")) {
			register(getOre("oreCobalt"), WATER, 100, 128, getOre("dustCobalt", 2), getMaterial("sulfur", 2, Type.SMALL_DUST));
		}

		if (oresExist("oreOsmium", "dustOsmium")) {
			register(getOre("oreOsmium"), WATER, 100, 128, getOre("dustOsmium", 2), getMaterial("platinum", 2, Type.SMALL_DUST), getMaterial("iron", 1, Type.SMALL_DUST));
		}

		if (oresExist("oreTeslatite", "dustTeslatite")) {
			register(getOre("oreTeslatite"), WATER, 100, 128, getOre("dustTeslatite", 2), getMaterial("redstone", 3, Type.SMALL_DUST));
		}

		if (oresExist("oreSulfur")) {
			register(getOre("oreSulfur"), WATER, 100, 128, getMaterial("sulfur", 2, Type.DUST), getMaterial("sulfur", Type.SMALL_DUST));
		}

		if (oresExist("oreSaltpeter")) {
			register(getOre("oreSaltpeter"), WATER, 100, 128, getMaterial("saltpeter", 2, Type.DUST), getMaterial("saltpeter", Type.SMALL_DUST));
		}
	}

	static void register(ItemStack output, FluidStack fluid, int ticks, int euPerTick, ItemStack... inputs) {
		if (inputs.length == 3)
			RecipeHandler.addRecipe(new IndustrialGrinderRecipe(output,
				fluid, inputs[0], inputs[1], inputs[2], null, ticks, euPerTick));
		else if (inputs.length == 2)
			RecipeHandler.addRecipe(new IndustrialGrinderRecipe(output,
				fluid, inputs[0], inputs[1], null, null, ticks, euPerTick));
		else if (inputs.length == 1)
			RecipeHandler.addRecipe(new IndustrialGrinderRecipe(output,
				fluid, inputs[0], null, null, null, ticks, euPerTick));
		else if (inputs.length == 4) {
			RecipeHandler.addRecipe(new IndustrialGrinderRecipe(output,
				fluid, inputs[0], inputs[1], inputs[2], inputs[3], ticks, euPerTick));
		} else {
			throw new InvalidParameterException("Invalid industrial grinder inputs: " + inputs);
		}
	}
}