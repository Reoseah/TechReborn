package techreborn.blocks;

import net.minecraft.block.material.Material;
import reborncore.common.blocks.BlockMachineBase;
import reborncore.common.blocks.IAdvancedRotationTexture;
import techreborn.client.TechRebornCreativeTab;

public class BlockSupercondensator extends BlockMachineBase implements IAdvancedRotationTexture
{

	public BlockSupercondensator(Material material)
	{
		super();
		setUnlocalizedName("techreborn.supercondensator");
		setCreativeTab(TechRebornCreativeTab.instance);
	}

	private final String prefix = "techreborn:blocks/machine/greg_machines/";

	@Override
	public String getFront(boolean isActive)
	{
		return prefix + "supercondensator_front";
	}

	@Override
	public String getSide(boolean isActive)
	{
		return prefix + "supercondensator_side";
	}

	@Override
	public String getTop(boolean isActive)
	{
		return prefix + "supercondensator_side";
	}

	@Override
	public String getBottom(boolean isActive)
	{
		return prefix + "machine_bottom";
	}

}
