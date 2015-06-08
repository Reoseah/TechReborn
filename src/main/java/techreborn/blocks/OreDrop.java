package techreborn.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import techreborn.init.ModBlocks;
import techreborn.config.ConfigTechReborn;

public class OreDrop
{
	public OreDrop(ItemStack drop)
	{
		this.drop = drop;
		this.count = drop.stackSize;
		this.baseChance = 100;		
	}	

	public OreDrop(ItemStack drop, Integer baseChance)
	{
		this.drop = drop;
		this.count = drop.stackSize;
		this.baseChance = baseChance;
	}
	
	public ItemStack getDrops(int fortuneLevel, Random random)
	{	
		int count;
		if (baseChance == 100) //This always drops. Use vanilla fortune rules.
		{
			count = calculateFortuneMulti(fortuneLevel, random);
		} else if (calculateFortuneSingle(fortuneLevel, random))  //This has a chance to drop. Increase that chance with fortune.
		{
			count = this.count;
		}
		else
		{
			count = 0;
		}
		return new ItemStack(drop.getItem(), count, drop.getItemDamage());
	}
	
	//Refer to http://minecraft.gamepedia.com/Enchanting#Fortune
	private int calculateFortuneMulti(int level, Random random)
	{
		int chanceOfEachBonus = 100 / (level + 2);
		int roll = random.nextInt(100);
		
		if (roll <= chanceOfEachBonus * level) //If level = 0, this is always false
		{
			return (roll / chanceOfEachBonus) + 2;
		}
		else
		{
			return 1;
		}		
	}
	
	//Each fortune level increases probability by 50% of base, up to a limit of 100%.
	//So, if base is 5% and we have Fortune III, chance is 5% + (3 * 2.5%) = 12.5%
	private boolean calculateFortuneSingle(int level, Random random)
	{
		double modifier = ConfigTechReborn.FortuneSecondaryOreMultiplierPerLevel * level;
		double total = baseChance + (baseChance * modifier);
		int roll = random.nextInt(100);
		return roll <= total;			
	}
	
	public ItemStack drop;
	public Integer baseChance;
	public Integer count;
}